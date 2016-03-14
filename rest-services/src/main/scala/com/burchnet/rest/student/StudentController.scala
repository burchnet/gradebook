package com.burchnet.rest.student

import com.burchnet.rest.RestservicesStack
import com.burchnet.rest.utility.Param

class StudentController extends RestservicesStack {
	get("/")(StudentManager.listStudents(Nil))
	put("/:id")(StudentManager.updateStudent _)
	post("/")(StudentManager.addStudent _)
}