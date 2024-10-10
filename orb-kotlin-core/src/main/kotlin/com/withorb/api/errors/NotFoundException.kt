package com.withorb.api.errors

import com.google.common.collect.ListMultimap

class NotFoundException(
    headers: ListMultimap<String, String>,
    body: String,
    error: OrbError,
) : OrbServiceException(404, headers, body, error)
