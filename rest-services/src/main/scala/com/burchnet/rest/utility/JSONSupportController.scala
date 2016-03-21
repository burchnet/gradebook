package com.burchnet.rest.utility

import org.json4s.{JValue, JsonInput, DefaultFormats, Formats}
import org.scalatra.json._

trait JSONSupportController[M <: Model] extends JacksonJsonSupport {
	protected implicit lazy val jsonFormats: Formats = DefaultFormats
	protected val model: M
}