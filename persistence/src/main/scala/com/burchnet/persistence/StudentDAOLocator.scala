package com.burchnet.persistence

trait StudentDAOLocator {
	type Student = com.burchnet.persistence.model.Student
	val Student = com.burchnet.persistence.model.Student
	
	val StudentDAO = com.burchnet.persistence.dao.StudentDAO
}