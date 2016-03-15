package com.burchnet.persistence

trait UtilityLocator {

	type Equals = utility.Equals
	val Equals = utility.Equals

	type NotEquals = utility.NotEquals
	val NotEquals = utility.NotEquals

	type Error = utility.Error
	val Error = utility.Error

	type Model = model.Model

	type DBQuery = utility.DBQuery
	val DBQuery = utility.DBQuery	

	type Param = utility.Param
	
	type IsNull = utility.IsNull
	val IsNull = utility.IsNull

	type NotNull = utility.NotNull
	val NotNull = utility.NotNull

	type Range = utility.Range
	val Range = utility.Range

	type Keyword = utility.Keyword

	type NoKeywords = utility.NoKeywords
	val NoKeywords = utility.NoKeywords

	type WithKeyword = utility.WithKeyword
	val WithKeyword = utility.WithKeyword

	type SortOrder = utility.SortOrder

	type NoOrder = utility.NoOrder
	val NoOrder = utility.NoOrder

	type Ascending = utility.Ascending
	val Ascending = utility.Ascending

	type Descending = utility.Descending
	val Descending = utility.Descending
}