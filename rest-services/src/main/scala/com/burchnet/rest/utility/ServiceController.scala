package com.burchnet.rest.utility

import com.burchnet.rest.RestservicesStack
import org.json4s.{JValue, JsonInput, DefaultFormats, Formats}
import org.scalatra.json._

abstract class ServiceController[M <: Model](service: Service[M]) extends RestservicesStack with JSONSupportController[M] {
	get("")(service.findAll _)
	get("/:id")(service.findOne _)
	post("")(service.create(model))
	put("/:id")(service.update(model))
	delete("/:id")(service.deleteOne _)
}