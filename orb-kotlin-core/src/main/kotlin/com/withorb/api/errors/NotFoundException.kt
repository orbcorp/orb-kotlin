package com.withorb.api.errors

import com.google.common.collect.ListMultimap

class NotFoundException
constructor(
        headers: ListMultimap<String, String>,
        private val error: OrbError,
) : OrbServiceException(headers, "${error}") {
    override fun statusCode(): Int = 404
    fun error(): OrbError = error
}
