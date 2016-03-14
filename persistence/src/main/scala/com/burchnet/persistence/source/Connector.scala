package com.burchnet.persistence.source

abstract class Connector(str: String)

case object Mongo extends Connector("")
case object MySql extends Connector("")