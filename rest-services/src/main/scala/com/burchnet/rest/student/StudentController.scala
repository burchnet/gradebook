package com.burchnet.rest.student

import com.burchnet.rest.RestservicesStack
import com.burchnet.rest.utility.JSONSupportController
import com.burchnet.rest.utility.Param

class StudentController extends RestservicesStack with JSONSupportController[Student] {
	protected lazy val model: Student = parsedBody.extract[Student]
	get("/")(StudentManager.listStudents(Nil))
	put("/:id")(StudentManager.updateStudent(model))
	post("/")(StudentManager.addStudent(model))
}