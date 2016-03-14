package com.burchnet.utility

trait Validation[M <: Model] extends (M => Either[Error, Unit]) {}