package com.burchnet.services

import com.burchnet.persistence.dao.RosterDAOLocator

trait RosterApiLocator {
	type Roster = com.burchnet.domain.roster.Roster
	val Roster = com.burchnet.domain.roster.Roster

	type RenamedRoster = com.burchnet.domain.roster.model.RenamedRoster
	val RenamedRoster = com.burchnet.domain.roster.model.RenamedRoster
	
	val RosterManager = com.burchnet.services.RosterManager
}