package com.withorb.api.errors

import com.withorb.api.core.http.Headers

abstract class OrbServiceException(
    private val statusCode: Int,
    private val headers: Headers,
    private val body: String,
    private val error: OrbError,
    message: String = "$statusCode: $error",
    cause: Throwable? = null
) : OrbException(message, cause) {

    fun statusCode(): Int = statusCode

    fun headers(): Headers = headers

    fun body(): String = body

    fun error(): OrbError = error
}
