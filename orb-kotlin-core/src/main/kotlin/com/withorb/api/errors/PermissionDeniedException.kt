package com.withorb.api.errors

import com.google.common.collect.ListMultimap

class PermissionDeniedException(
    headers: ListMultimap<String, String>,
    body: String,
    error: OrbError,
) : OrbServiceException(403, headers, body, error)
