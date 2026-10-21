// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.ClientOptions
import com.withorb.api.core.http.Headers
import com.withorb.api.errors.OrbInvalidDataException
import com.withorb.api.models.UnwrapStandardWebhookEvent
import com.withorb.api.services.blocking.WebhookService
import com.withorb.api.services.blocking.WebhookServiceImpl
import com.withorb.api.services.blocking.checkPayloadStyle

class StandardServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    StandardService {

    private val withRawResponse: StandardService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): StandardService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): StandardService =
        StandardServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun unwrapStandard(body: String): UnwrapStandardWebhookEvent =
        try {
            clientOptions.jsonMapper.readValue(body, jacksonTypeRef<UnwrapStandardWebhookEvent>())
        } catch (e: Exception) {
            throw OrbInvalidDataException("Error parsing body", e)
        }

    override fun unwrapStandard(
        payload: String,
        headers: Headers,
        secret: String?,
    ): UnwrapStandardWebhookEvent {
        val webhooks: WebhookService = WebhookServiceImpl(clientOptions)
        webhooks.verifySignature(payload, headers, secret)
        checkPayloadStyle(clientOptions, payload, "standard")
        return unwrapStandard(payload)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        StandardService.WithRawResponse {

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): StandardService.WithRawResponse =
            StandardServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )
    }
}
