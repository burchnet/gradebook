package com.burchnet.services

trait RosterApi {
	type Roster = com.burchnet.domain.roster.Roster
	type RenamedRoster = com.burchnet.domain.roster.model.RenamedRoster
	val RosterManager = com.burchnet.services.RosterManager
}