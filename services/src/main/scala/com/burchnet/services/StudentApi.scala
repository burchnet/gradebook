package com.burchnet.services

trait StudentApi{
	type Student = com.burchnet.domain.student.Student
	val StudentManager = com.burchnet.services.StudentManager
}