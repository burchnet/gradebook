package com.burchnet.services

trait RosterApiLocator {
	type Roster = domain.roster.Roster
	val Roster = domain.roster.Roster

	type RenamedRoster = domain.roster.model.RenamedRoster
	val RenamedRoster = domain.roster.model.RenamedRoster
	
	val RosterManager = com.burchnet.services.RosterManager
}