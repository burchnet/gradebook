package com.burchnet.persistence.source

import com.burchnet.persistence.model.MongoModel
import com.burchnet.persistence.utility._

trait MongoDAO[M <: MongoModel] extends DAO[M] {
	protected val connector:  Connector = Mongo
	def findOne(id: Long): Option[M] = None
	def findAll(dbQuery: DBQuery): List[M] = Nil
	def deleteOne(dbQuery: DBQuery): Either[Error, Unit] = Left(Error("Unsupported"))
	def update(model: M): Either[Error, Unit] = Left(Error("Unsupported"))
	def create(model: M): Either[Error, M] = Left(Error("Unsupported"))
}