package com.withorb.api.errors

import com.google.common.collect.ListMultimap

abstract class OrbServiceException(
    private val statusCode: Int,
    private val headers: ListMultimap<String, String>,
    private val body: String,
    private val error: OrbError,
    message: String = "$statusCode: $error",
    cause: Throwable? = null
) : OrbException(message, cause) {

    fun statusCode(): Int = statusCode

    fun headers(): ListMultimap<String, String> = headers

    fun body(): String = body

    fun error(): OrbError = error
}
