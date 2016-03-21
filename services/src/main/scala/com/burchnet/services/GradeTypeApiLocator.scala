package com.burchnet.services

trait GradeTypeApiLocator {
	type Grade = domain.gradetype.GradeType
	val Grade = domain.gradetype.GradeType

	val GradeTypeManager = com.burchnet.services.GradeTypeManager
}