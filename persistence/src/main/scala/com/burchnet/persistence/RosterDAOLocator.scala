package com.burchnet.persistence

trait RosterDAOLocator {
	type Roster = model.Roster
	val Roster = model.Roster
	
	val RosterDAO = dao.RosterDAO
}