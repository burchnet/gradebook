package com.burchnet.services.utility

abstract class Service[M <: Model](dao: DAO[M]) {
	def findOne(id: Long): Option[M] = dao.findOne(id)
	def findAll(dbQuery: DBQuery): List[M] = dao.findAll(dbQuery)
	def deleteOne(dbQuery: DBQuery): Either[Error, Unit] = dao.deleteOne(dbQuery)
	def update(model: M): Either[Error, Unit] = dao.update(model)
	def create(model: M): Either[Error, M] = dao.create(model)
}