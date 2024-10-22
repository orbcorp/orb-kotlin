package com.withorb.api.errors

import com.google.common.collect.ListMultimap

class BadRequestException(
    headers: ListMultimap<String, String>,
    body: String,
    error: OrbError,
) : OrbServiceException(400, headers, body, error)
