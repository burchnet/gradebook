package com.burchnet.persistence

import com.burchnet.persistence.source._
import com.burchnet.persistence.model._

package object dao{
	private val mongoConnector = ""
	
	object GradeBookDAO extends DAO[Gradebook] with MongoDAO[Gradebook]{
		protected val connector = mongoConnector
	}
	object StudentDAO extends DAO[Student] with MongoDAO[Student]{
		protected val connector = mongoConnector
	}
	object GradeTypeDAO extends DAO[GradeType] with MongoDAO[GradeType]{
		protected val connector = mongoConnector
	}
	object RosterDAO extends DAO[Roster] with MongoDAO[Roster]{
		protected val connector = mongoConnector
	}
	object AssignmentDAO extends DAO[Assignment] with MongoDAO[Assignment]{
		protected val connector = mongoConnector
	}
	object GradeDAO extends DAO[Grade] with MongoDAO[Grade]{
		protected val connector = mongoConnector
	}
}