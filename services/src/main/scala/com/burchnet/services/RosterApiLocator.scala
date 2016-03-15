package com.burchnet.services

trait RosterApiLocator {
	type Roster = com.burchnet.services.domain.roster.Roster
	val Roster = com.burchnet.services.domain.roster.Roster

	type RenamedRoster = com.burchnet.services.domain.roster.model.RenamedRoster
	val RenamedRoster = com.burchnet.services.domain.roster.model.RenamedRoster
	
	val RosterManager = com.burchnet.services.RosterManager
}