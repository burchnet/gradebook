package com.burchnet.services.domain.roster

import com.burchnet.services.utility._
import com.burchnet.services.domain.student.Student

trait RosterHelper extends Helper[Roster] {
	protected def addStudent(roster: Roster, student: Student): Roster = 
		roster.copy(students = (student :: roster.students))

	protected def findRoster(retrieve: (Long) => Option[Roster])(id: Long): Either[Error, Roster] =
		findOrError(retrieve)("Could not find Roster")(id)
}