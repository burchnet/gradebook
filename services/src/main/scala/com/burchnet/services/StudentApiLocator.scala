package com.burchnet.services

trait StudentApiLocator {
	type Student = com.burchnet.domain.student.Student
	val Student = com.burchnet.domain.student.Student
	
	val StudentManager = com.burchnet.services.StudentManager
}