package com.burchnet.persistence.dao

trait RosterDAOLocator {
	type Roster = com.burchnet.persistence.model.Roster
	val Roster = com.burchnet.persistence.model.Roster
	
	val RosterDAO = com.burchnet.persistence.dao.RosterDAO
}