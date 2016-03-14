package com.burchnet.rest.roster

import com.burchnet.rest.RestservicesStack

class RosterController extends RestservicesStack {
	get("/:id")(RosterManager.get _)
	get("/")(RosterManager.listRosters(Nil))
	post("/")(RosterManager.newRoster _)
	put("/:id?studentId=studentId")(RosterManager.addStudentToRoster _)
	put("/:id")(RosterManager.renameRoster _)
}