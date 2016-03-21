package com.burchnet.services

trait GradeTypeApiLocator {
	type GradeType = domain.gradetype.GradeType
	val GradeType = domain.gradetype.GradeType

	val GradeTypeManager = com.burchnet.services.GradeTypeManager
}