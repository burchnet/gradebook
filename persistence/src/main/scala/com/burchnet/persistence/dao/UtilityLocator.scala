package com.burchnet.persistence.dao

trait UtilityLocator{
	type Equals = com.burchnet.persistence.utility.Equals
	type NotEquals = com.burchnet.persistence.utility.NotEquals
	type Error = com.burchnet.persistence.utility.Error
	type Model = com.burchnet.persistence.model.Model
	type DBQuery = com.burchnet.persistence.utility.DBQuery		
	type Param = com.burchnet.persistence.utility.Param

	def Error(msg: String): Error = com.burchnet.persistence.utility.Error(msg)
	def Equals(name: String, value: String): Equals = com.burchnet.persistence.utility.Equals(name, value)
	def NotEquals(name: String, value: String): NotEquals = com.burchnet.persistence.utility.NotEquals(name, value)
	def DBQuery(params: List[Param]): DBQuery = com.burchnet.persistence.utility.DBQuery(params)
}