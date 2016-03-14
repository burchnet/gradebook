package com.burchnet.domain.roster

import com.burchnet.utility.Helper
import com.burchnet.domain.student.Student

trait RosterHelper extends Helper[Roster] {
	protected def addStudent(roster: Roster, student: Student): Roster = 
		roster.copy(students = (student :: roster.students))
}