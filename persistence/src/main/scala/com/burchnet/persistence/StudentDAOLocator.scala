package com.burchnet.persistence

trait StudentDAOLocator {
	type Student = model.Student
	val Student = model.Student
	
	val StudentDAO = dao.StudentDAO
}