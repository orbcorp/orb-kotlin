package com.withorb.api.errors

open class OrbException
constructor(message: String? = null, cause: Throwable? = null) : RuntimeException(message, cause)
