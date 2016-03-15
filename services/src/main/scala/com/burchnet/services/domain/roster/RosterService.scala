package com.burchnet.services.domain.roster

import com.burchnet.services.domain.student.Student
import com.burchnet.services.utility._

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
			roster <- retrieveOrError(rosterId).right

			newRoster <- Right(addStudent(roster, student)).right

			_ <- RosterDAO.update(newRoster).right
		} yield (newRoster)

	def renameRoster(rosterNameRequest: model.RenamedRoster): Either[Error, Roster] = 
		for {
			_ <- RosterValidation.nameValidation(rosterNameRequest.id, rosterNameRequest.name).right

			roster <- retrieveOrError(rosterNameRequest.id).right

			newRoster <- Right(roster.copy(name = rosterNameRequest.name)).right

			_ <- RosterDAO.update(newRoster).right

		} yield newRoster

	private val retrieveOrError = findRoster(RosterDAO.findOne) _

	protected val validation: Validation[Roster]
}