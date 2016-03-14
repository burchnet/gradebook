package com.burchnet.persistence.utility

case class DBQuery(params: List[Param], sortOrder: SortOrder = NoOrder(), keyword: Keyword = NoKeywords())

abstract class SortOrder()
case class NoOrder() extends SortOrder()
case class Ascending(name: String) extends SortOrder
case class Descending(name: String) extends SortOrder

abstract class Param(name: String)
case class IsNull(name: String) extends Param(name)
case class NotNull(name: String) extends Param(name)
case class Equals(name: String, value: String) extends Param(name)
case class NotEquals(name: String, value: String) extends Param(name)
case class Range(name: String, start: String, end: String) extends Param(name)

abstract class Keyword(value: String, fields: List[String])
case class NoKeywords() extends Keyword("", Nil)
case class WithKeyword(value: String, fields: List[String]) extends Keyword(value, fields)