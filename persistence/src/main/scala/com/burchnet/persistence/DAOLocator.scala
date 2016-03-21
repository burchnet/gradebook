package com.burchnet.persistence

trait DAOLocator {
	type DAO[M <: model.Model] = source.DAO[M]
}