package com.withorb.api.errors

import com.withorb.api.core.http.Headers

class BadRequestException(
        headers: Headers,
        body: String,
        error: OrbError,
) : OrbServiceException(400, headers, body, error)
