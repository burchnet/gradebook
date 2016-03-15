package com.burchnet.services.utility

trait Validation[M <: Model] extends (M => Either[Error, Unit]) {}