package com.burchnet.persistence.model

abstract class Model(id: Long)
abstract class MongoModel(id: Long) extends Model(id)

case class Roster(id: Long, name: String, students: List[Student], gradebook: Gradebook) extends MongoModel(id)
case class Gradebook(id: Long, assignments: List[Assignment], gradeTypes: List[GradeType]) extends MongoModel(id)
case class Student(id: Long, firstName: String, lastName: String) extends MongoModel(id)
case class GradeType(id: Long, name: String, percentage: Double) extends MongoModel(id)
case class Assignment(id: Long, name: String, gradeType: GradeType) extends MongoModel(id)
case class Grade(id: Long, studentId: Long, assignmentId: Long, score: Double) extends MongoModel(id)