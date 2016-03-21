package com.burchnet.services.utility

trait Helper[M <: Model] {
	protected def findOrError(retreive: Long => Option[M])(errorMessage: String)(id: Long): Either[Error, M] =
		retreive(id).toRight(Error(errorMessage))
}