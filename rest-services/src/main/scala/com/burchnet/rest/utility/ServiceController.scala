package com.burchnet.rest.utility

abstract class ServiceController[M <: Model](service: Service[M]) extends RestservicesStack with JacksonJsonSupport  {
	get("")(service.findAll _)
	get("/:id")(service.findOne _)
	post("")(service.create _)
	put("/:id")(service.update _)
	delete("/:id")(service.delete _)
}