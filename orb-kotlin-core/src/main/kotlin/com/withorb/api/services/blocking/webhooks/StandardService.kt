// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking.webhooks

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.http.Headers
import com.withorb.api.errors.OrbInvalidDataException
import com.withorb.api.models.UnwrapStandardWebhookEvent

interface StandardService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): StandardService

    /**
     * Unwraps a webhook event from its JSON representation.
     *
     * @throws OrbInvalidDataException if the body could not be parsed.
     */
    fun unwrapStandard(body: String): UnwrapStandardWebhookEvent

    /**
     * Verifies that the payload was sent by Orb and unwraps it, for an endpoint configured for
     * standard payloads.
     *
     * @throws OrbException if the signature does not match.
     */
    fun unwrapStandard(
        payload: String,
        headers: Headers,
        secret: String?,
    ): UnwrapStandardWebhookEvent

    /** A view of [StandardService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): StandardService.WithRawResponse
    }
}
