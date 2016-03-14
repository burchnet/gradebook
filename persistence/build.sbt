name := "persistence"

version := "1.0"

organization := "com.burchnet"

scalaVersion := "2.11.6"

publishMavenStyle := true

publishTo := Some(Resolver.file("file",  new File("~/.m2/repository")))