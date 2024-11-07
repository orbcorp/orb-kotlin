package com.withorb.api.errors

import com.withorb.api.core.http.Headers

class InternalServerException(
    statusCode: Int,
    headers: Headers,
    body: String,
    error: OrbError,
) : OrbServiceException(statusCode, headers, body, error)
