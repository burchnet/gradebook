package com.burchnet.domain.student

import com.burchnet.utility._

object StudentValidation extends Validation[Student] {
	def apply(student: Student): Either[Error, Unit] = Left(Error(""))
}