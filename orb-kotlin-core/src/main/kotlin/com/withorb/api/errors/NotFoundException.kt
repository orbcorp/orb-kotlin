package com.withorb.api.errors

import com.withorb.api.core.http.Headers

class NotFoundException(
    headers: Headers,
    body: String,
    error: OrbError,
) : OrbServiceException(404, headers, body, error)
