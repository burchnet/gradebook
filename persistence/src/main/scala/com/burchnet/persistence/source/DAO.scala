package com.burchnet.persistence.source

import com.burchnet.persistence.model.Model
import com.burchnet.persistence.utility._

abstract class DAO[M <: Model] {
	protected val connector: Connector
	def findOne(id: Long): Option[M]
	def findAll(dbQuery: DBQuery): List[M]
	def deleteOne(dbQuery: DBQuery): Either[Error, Unit]
	def update(model: M): Either[Error, Unit]
	def create(model: M): Either[Error, M]
}