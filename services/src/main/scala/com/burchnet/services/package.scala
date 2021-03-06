package com.burchnet

import com.burchnet.services.domain.roster._
import com.burchnet.services.domain.student._
import com.burchnet.services.domain.gradetype._

package object services {
    object StudentManager extends StudentService with StudentHelper {
        protected val validation = StudentValidation
    }

    object RosterManager extends RosterService with RosterHelper {
        protected val validation = RosterValidation
    }

    object GradeTypeManager extends GradeTypeService
}