package com.withorb.api.errors

import com.google.common.collect.ListMultimap

class RateLimitException(
    headers: ListMultimap<String, String>,
    body: String,
    error: OrbError,
) : OrbServiceException(429, headers, body, error)
