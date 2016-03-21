package com.burchnet.rest

import com.burchnet.services.RosterApiLocator

package object roster extends RosterApiLocator {
    type Student = com.burchnet.rest.student.Student
}