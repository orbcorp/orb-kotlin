package com.withorb.api.errors

import com.withorb.api.core.http.Headers

class PermissionDeniedException(
    headers: Headers,
    body: String,
    error: OrbError,
) : OrbServiceException(403, headers, body, error)
