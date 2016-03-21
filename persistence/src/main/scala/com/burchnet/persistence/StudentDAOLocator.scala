package com.burchnet.persistence

trait StudentDAOLocator extends DAOLocator {
	type Student = model.Student
	val Student = model.Student
	
	val StudentDAO = dao.StudentDAO
}