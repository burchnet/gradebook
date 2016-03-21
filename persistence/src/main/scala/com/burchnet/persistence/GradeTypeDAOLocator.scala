package com.burchnet.persistence

trait GradeTypeDAOLocator extends DAOLocator {
	type GradeType = model.GradeType
	val GradeType = model.GradeType

	val GradeTypeDAO = dao.GradeTypeDAO
}