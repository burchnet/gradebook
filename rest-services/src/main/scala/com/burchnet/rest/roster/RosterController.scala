package com.burchnet.rest.roster

import com.burchnet.rest.RestservicesStack
import org.json4s.{JValue, JsonInput, DefaultFormats, Formats}
import org.scalatra.json._

class RosterController extends RestservicesStack with JacksonJsonSupport {

	protected implicit lazy val jsonFormats: Formats = DefaultFormats

	get("/:id")(RosterManager.get(params("id").toLong))
	get("/")(RosterManager.listRosters(Nil))
	post("/")(RosterManager.newRoster(parsedBody.extract[Roster]))
	put("/:id/student/:studentId")(RosterManager.addStudentToRoster(params("id").toLong, parsedBody.extract[Student]))
	put("/:id")(RosterManager.renameRoster(parsedBody.extract[RenamedRoster]))

}