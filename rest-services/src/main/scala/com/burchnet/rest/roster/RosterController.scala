package com.burchnet.rest.roster

import com.burchnet.rest.RestservicesStack
import com.burchnet.rest.utility.JSONSupportController

class RosterController extends RestservicesStack with JSONSupportController[Roster] {
	override protected lazy val model: Roster = parsedBody.extract[Roster]
	get("/:id")(RosterManager.get(params("id").toLong))
	get("/")(RosterManager.listRosters(Nil))
	post("/")(RosterManager.newRoster(model))
	put("/:id/student/:studentId")(RosterManager.addStudentToRoster(params("id").toLong, parsedBody.extract[Student]))
	put("/:id")(RosterManager.renameRoster(parsedBody.extract[RenamedRoster]))
}