package com.withorb.api.errors

open class OrbException(message: String? = null, cause: Throwable? = null) : RuntimeException(message, cause)
