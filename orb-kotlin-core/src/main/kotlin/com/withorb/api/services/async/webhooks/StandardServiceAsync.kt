// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.webhooks

import com.withorb.api.core.ClientOptions
import com.withorb.api.errors.OrbInvalidDataException
import com.withorb.api.models.UnwrapStandardWebhookEvent

interface StandardServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): StandardServiceAsync

    /**
     * Unwraps a webhook event from its JSON representation.
     *
     * @throws OrbInvalidDataException if the body could not be parsed.
     */
    fun unwrapStandard(body: String): UnwrapStandardWebhookEvent

    /**
     * A view of [StandardServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): StandardServiceAsync.WithRawResponse
    }
}
