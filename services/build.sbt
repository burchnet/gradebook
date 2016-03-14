name := "services"

version := "1.0"

organization := "com.burchnet"

scalaVersion := "2.11.6"

publishMavenStyle := true

resolvers += Resolver.mavenLocal

scalacOptions ++= Seq("-unchecked", "-deprecation")

libraryDependencies += "com.burchnet" % "persistence_2.11" % "1.0"

publishTo := Some(Resolver.file("file",  new File("~/.m2/repository")))