package com.burchnet.rest

import com.burchnet.services.UtilityApiLocator

package object utility extends UtilityApiLocator {
	type Param = com.burchnet.services.utility.Param
	type Service[M <: Model] = com.burchnet.services.utility.Service[M]
}