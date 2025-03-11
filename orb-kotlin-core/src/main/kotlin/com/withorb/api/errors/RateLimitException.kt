package com.withorb.api.errors

import com.withorb.api.core.http.Headers

class RateLimitException(headers: Headers, body: String, error: OrbError) :
    OrbServiceException(429, headers, body, error)
