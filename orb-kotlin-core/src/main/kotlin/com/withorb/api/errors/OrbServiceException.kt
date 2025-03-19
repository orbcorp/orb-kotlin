// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.errors

import com.withorb.api.core.JsonValue
import com.withorb.api.core.http.Headers

abstract class OrbServiceException
protected constructor(message: String, cause: Throwable? = null) : OrbException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
