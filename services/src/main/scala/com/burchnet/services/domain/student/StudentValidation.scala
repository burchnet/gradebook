package com.burchnet.services.domain.student

import com.burchnet.services.utility._

object StudentValidation extends Validation[Student] {
	def apply(student: Student): Either[Error, Unit] = Left(Error(""))
}