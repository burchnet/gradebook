package com.burchnet.services

trait StudentApiLocator {
	type Student = domain.student.Student
	val Student = domain.student.Student
	
	val StudentManager = com.burchnet.services.StudentManager
}