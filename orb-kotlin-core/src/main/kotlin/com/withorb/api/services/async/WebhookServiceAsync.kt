// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.withorb.api.services.async

import com.withorb.api.core.JsonValue
import com.withorb.api.core.http.Headers

interface WebhookServiceAsync {

    suspend fun unwrap(payload: String, headers: Headers, secret: String?): JsonValue

    suspend fun verifySignature(payload: String, headers: Headers, secret: String?)
}
