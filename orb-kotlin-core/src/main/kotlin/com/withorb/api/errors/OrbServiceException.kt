package com.withorb.api.errors

import com.google.common.collect.ListMultimap

abstract class OrbServiceException
constructor(
        private val headers: ListMultimap<String, String>,
        message: String? = null,
        cause: Throwable? = null
) : OrbException(message, cause) {
    abstract fun statusCode(): Int
    fun headers(): ListMultimap<String, String> = headers
}
