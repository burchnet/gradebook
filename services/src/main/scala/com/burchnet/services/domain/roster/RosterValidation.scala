package com.burchnet.services.domain.roster

import com.burchnet.services.utility._

object RosterValidation extends Validation[Roster] {
	def apply(roster: Roster): Either[Error, Unit] = 
		for {
			_ <- nameValidation(roster.id, roster.name).right
		} yield ()

	val nameValidation: (Long, String) => Either[Error, Unit] = (id, name) => {
		val dbParams = Equals("name", name) :: NotEquals("id", id.toString) :: Nil
		RosterDAO.findAll(DBQuery(params = dbParams)) match {
			case Nil => Right(())
			case _ => Left(Error("Name already in use"))
		}
	}
}