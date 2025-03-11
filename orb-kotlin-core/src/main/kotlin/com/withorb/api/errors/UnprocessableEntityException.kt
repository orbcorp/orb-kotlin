package com.withorb.api.errors

import com.withorb.api.core.http.Headers

class UnprocessableEntityException(headers: Headers, body: String, error: OrbError) :
    OrbServiceException(422, headers, body, error)
