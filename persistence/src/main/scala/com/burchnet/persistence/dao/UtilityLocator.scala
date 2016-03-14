package com.burchnet.persistence.dao

trait UtilityLocator {
	type Equals = com.burchnet.persistence.utility.Equals
	val Equals = com.burchnet.persistence.utility.Equals

	type NotEquals = com.burchnet.persistence.utility.NotEquals
	val NotEquals = com.burchnet.persistence.utility.NotEquals

	type Error = com.burchnet.persistence.utility.Error
	val Error = com.burchnet.persistence.utility.Error

	type Model = com.burchnet.persistence.model.Model

	type DBQuery = com.burchnet.persistence.utility.DBQuery
	val DBQuery = com.burchnet.persistence.utility.DBQuery	

	type Param = com.burchnet.persistence.utility.Param

	type SortOrder = com.burchnet.persistence.utility.SortOrder

	type NoOrder = com.burchnet.persistence.utility.NoOrder
	val NoOrder = com.burchnet.persistence.utility.NoOrder

	type Ascending = com.burchnet.persistence.utility.Ascending
	val Ascending = com.burchnet.persistence.utility.Ascending

	type Descending = com.burchnet.persistence.utility.Descending
	val Descending = com.burchnet.persistence.utility.Descending
}