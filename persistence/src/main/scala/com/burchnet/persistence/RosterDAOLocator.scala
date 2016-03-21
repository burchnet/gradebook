package com.burchnet.persistence

trait RosterDAOLocator extends DAOLocator {
	type Roster = model.Roster
	val Roster = model.Roster
	
	val RosterDAO = dao.RosterDAO
}