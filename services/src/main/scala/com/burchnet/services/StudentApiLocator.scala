package com.burchnet.services

trait StudentApiLocator {
	type Student = com.burchnet.services.domain.student.Student
	val Student = com.burchnet.services.domain.student.Student
	
	val StudentManager = com.burchnet.services.StudentManager
}