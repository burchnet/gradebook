package com.burchnet

import com.burchnet.domain.roster._
import com.burchnet.domain.student._

package object services {
    object StudentManager extends StudentService with StudentHelper {
        protected val validation = StudentValidation
    }

    object RosterManager extends RosterService with RosterHelper {
        protected val validation = RosterValidation
    }
}