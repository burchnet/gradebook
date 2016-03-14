package com.burchnet.persistence

import com.burchnet.persistence.source._
import com.burchnet.persistence.model._

package object dao {
	object GradeBookDAO extends DAO[Gradebook] with MongoDAO[Gradebook]
	object StudentDAO extends DAO[Student] with MongoDAO[Student]
	object GradeTypeDAO extends DAO[GradeType] with MongoDAO[GradeType]
	object RosterDAO extends DAO[Roster] with MongoDAO[Roster]
	object AssignmentDAO extends DAO[Assignment] with MongoDAO[Assignment]
	object GradeDAO extends DAO[Grade] with MongoDAO[Grade]
}