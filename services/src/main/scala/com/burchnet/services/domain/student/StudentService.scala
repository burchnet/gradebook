package com.burchnet.services.domain.student

import com.burchnet.services.utility._

trait StudentService { this: StudentHelper => 

	def listStudents(params: List[Param]): List[Student] = StudentDAO.findAll(DBQuery(params))
	
	def addStudent(student: Student): Either[Error, Student] =
		for {
		      _ <- validation(student).right

			  createdStudent <- StudentDAO.create(student).right
		} yield createdStudent

	def updateStudent(student: Student): Either[Error, Unit] = 
		for {
			  _ <- validation(student).right

			  _ <- StudentDAO.update(student).right
		} yield ()

	protected val validation: Validation[Student]
}