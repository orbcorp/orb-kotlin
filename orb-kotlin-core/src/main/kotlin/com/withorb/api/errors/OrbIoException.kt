package com.withorb.api.errors

class OrbIoException constructor(message: String? = null, cause: Throwable? = null) :
    OrbException(message, cause)
