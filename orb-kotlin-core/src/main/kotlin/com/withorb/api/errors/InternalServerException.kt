package com.withorb.api.errors

import com.google.common.collect.ListMultimap

class InternalServerException(
    statusCode: Int,
    headers: ListMultimap<String, String>,
    body: String,
    error: OrbError,
) : OrbServiceException(statusCode, headers, body, error)
