package com.withorb.api.errors

import com.google.common.collect.ListMultimap

class UnauthorizedException(
    headers: ListMultimap<String, String>,
    body: String,
    error: OrbError,
) : OrbServiceException(401, headers, body, error)
