package com.withorb.api.errors

import com.google.common.collect.ListMultimap

class PermissionDeniedException
constructor(
    headers: ListMultimap<String, String>,
    private val error: OrbError,
) : OrbServiceException(headers, "${error}") {
    override fun statusCode(): Int = 403

    fun error(): OrbError = error
}
