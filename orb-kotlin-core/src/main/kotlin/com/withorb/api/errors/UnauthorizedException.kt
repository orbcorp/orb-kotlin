package com.withorb.api.errors

import com.withorb.api.core.http.Headers

class UnauthorizedException(
    headers: Headers,
    body: String,
    error: OrbError,
) : OrbServiceException(401, headers, body, error)
