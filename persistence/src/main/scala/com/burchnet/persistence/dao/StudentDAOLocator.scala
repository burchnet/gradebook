package com.burchnet.persistence.dao

trait StudentDAOLocator{
	type Student = com.burchnet.persistence.model.Student
	val StudentDAO = com.burchnet.persistence.dao.StudentDAO
}