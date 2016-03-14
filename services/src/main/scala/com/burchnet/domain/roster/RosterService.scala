package com.burchnet.domain.roster

import com.burchnet.domain.student.Student
import com.burchnet.utility._

trait RosterService { this: RosterHelper =>

	def listRosters(params: List[Param]): List[Roster] = RosterDAO.findAll(DBQuery(params))

	def get(id: Long): Option[Roster] = RosterDAO.findOne(id)

	def newRoster(roster: Roster): Either[Error, Roster] =
		for {
			_ <- validation(roster).right

			result <- RosterDAO.create(roster).right
		} yield result

	def addStudentToRoster(rosterId: Long, student: Student): Either[Error, Roster] =
		for {
			roster <- findRoster(rosterId).right

			newRoster <- Right(addStudent(roster, student)).right

			_ <- RosterDAO.update(newRoster).right
		} yield (newRoster)

	def renameRoster(rosterNameRequest: model.RenamedRoster): Either[Error, Roster] = 
		for {
			_ <- RosterValidation.nameValidation(rosterNameRequest.id, rosterNameRequest.name).right

			roster <- findRoster(rosterNameRequest.id).right

			newRoster <- Right(roster.copy(name = rosterNameRequest.name)).right

			_ <- RosterDAO.update(newRoster).right

		} yield newRoster

	protected val findRoster: Long => Either[Error, Roster] = 
		RosterDAO.findOne(_).toRight(Error("Couldn't find Roster"))

	protected val validation: Validation[Roster]
}