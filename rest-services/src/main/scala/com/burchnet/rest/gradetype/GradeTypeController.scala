package com.burchnet.rest.gradetype

import com.burchnet.rest.utility.ServiceController

class GradeTypeController extends ServiceController(GradeTypeManager) {
    override lazy protected val model: GradeType = parsedBody.extract[GradeType]
}