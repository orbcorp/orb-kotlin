package com.withorb.api.errors

class OrbInvalidDataException(message: String? = null, cause: Throwable? = null) :
    OrbException(message, cause)
