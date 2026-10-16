// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponse
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.WebhookEndpoint
import com.withorb.api.models.WebhookEndpointCreateParams
import com.withorb.api.models.WebhookEndpointDeleteParams
import com.withorb.api.models.WebhookEndpointDisableParams
import com.withorb.api.models.WebhookEndpointEnableParams
import com.withorb.api.models.WebhookEndpointListPageAsync
import com.withorb.api.models.WebhookEndpointListParams
import com.withorb.api.models.WebhookEndpointRetrieveParams
import com.withorb.api.models.WebhookEndpointUpdateParams
import com.withorb.api.models.WebhookEndpointWithSecret

/**
 * A webhook endpoint is an HTTPS URL that Orb sends
 * [webhook events](/integrations-and-exports/webhooks) to.
 */
interface WebhookEndpointServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): WebhookEndpointServiceAsync

    /**
     * This endpoint creates a webhook endpoint and returns the secret used to sign its webhook
     * events. The secret isn't returned by any other endpoint. An account can have at most 20
     * webhook endpoints by default.
     */
    suspend fun create(
        params: WebhookEndpointCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookEndpointWithSecret

    /** This endpoint returns a webhook endpoint identified by its ID. */
    suspend fun retrieve(
        webhookEndpointId: String,
        params: WebhookEndpointRetrieveParams = WebhookEndpointRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookEndpoint =
        retrieve(params.toBuilder().webhookEndpointId(webhookEndpointId).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: WebhookEndpointRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookEndpoint

    /** @see retrieve */
    suspend fun retrieve(
        webhookEndpointId: String,
        requestOptions: RequestOptions,
    ): WebhookEndpoint =
        retrieve(webhookEndpointId, WebhookEndpointRetrieveParams.none(), requestOptions)

    /** This endpoint updates a webhook endpoint's URL or the event types sent to it. */
    suspend fun update(
        webhookEndpointId: String,
        params: WebhookEndpointUpdateParams = WebhookEndpointUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookEndpoint =
        update(params.toBuilder().webhookEndpointId(webhookEndpointId).build(), requestOptions)

    /** @see update */
    suspend fun update(
        params: WebhookEndpointUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookEndpoint

    /** @see update */
    suspend fun update(webhookEndpointId: String, requestOptions: RequestOptions): WebhookEndpoint =
        update(webhookEndpointId, WebhookEndpointUpdateParams.none(), requestOptions)

    /**
     * This endpoint returns the account's webhook endpoints, ordered starting from the most
     * recently created.
     */
    suspend fun list(
        params: WebhookEndpointListParams = WebhookEndpointListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookEndpointListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): WebhookEndpointListPageAsync =
        list(WebhookEndpointListParams.none(), requestOptions)

    /**
     * This endpoint deletes a webhook endpoint. Orb stops sending webhook events to it immediately.
     */
    suspend fun delete(
        webhookEndpointId: String,
        params: WebhookEndpointDeleteParams = WebhookEndpointDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().webhookEndpointId(webhookEndpointId).build(), requestOptions)

    /** @see delete */
    suspend fun delete(
        params: WebhookEndpointDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    suspend fun delete(webhookEndpointId: String, requestOptions: RequestOptions) =
        delete(webhookEndpointId, WebhookEndpointDeleteParams.none(), requestOptions)

    /**
     * This endpoint disables a webhook endpoint, so Orb stops sending webhook events to it until it
     * is enabled again.
     */
    suspend fun disable(
        webhookEndpointId: String,
        params: WebhookEndpointDisableParams = WebhookEndpointDisableParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookEndpoint =
        disable(params.toBuilder().webhookEndpointId(webhookEndpointId).build(), requestOptions)

    /** @see disable */
    suspend fun disable(
        params: WebhookEndpointDisableParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookEndpoint

    /** @see disable */
    suspend fun disable(
        webhookEndpointId: String,
        requestOptions: RequestOptions,
    ): WebhookEndpoint =
        disable(webhookEndpointId, WebhookEndpointDisableParams.none(), requestOptions)

    /** This endpoint enables a webhook endpoint, so Orb resumes sending webhook events to it. */
    suspend fun enable(
        webhookEndpointId: String,
        params: WebhookEndpointEnableParams = WebhookEndpointEnableParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookEndpoint =
        enable(params.toBuilder().webhookEndpointId(webhookEndpointId).build(), requestOptions)

    /** @see enable */
    suspend fun enable(
        params: WebhookEndpointEnableParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookEndpoint

    /** @see enable */
    suspend fun enable(webhookEndpointId: String, requestOptions: RequestOptions): WebhookEndpoint =
        enable(webhookEndpointId, WebhookEndpointEnableParams.none(), requestOptions)

    /**
     * A view of [WebhookEndpointServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): WebhookEndpointServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /webhook_endpoints`, but is otherwise the same as
         * [WebhookEndpointServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: WebhookEndpointCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookEndpointWithSecret>

        /**
         * Returns a raw HTTP response for `get /webhook_endpoints/{webhook_endpoint_id}`, but is
         * otherwise the same as [WebhookEndpointServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            webhookEndpointId: String,
            params: WebhookEndpointRetrieveParams = WebhookEndpointRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookEndpoint> =
            retrieve(
                params.toBuilder().webhookEndpointId(webhookEndpointId).build(),
                requestOptions,
            )

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: WebhookEndpointRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookEndpoint>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            webhookEndpointId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WebhookEndpoint> =
            retrieve(webhookEndpointId, WebhookEndpointRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /webhook_endpoints/{webhook_endpoint_id}`, but is
         * otherwise the same as [WebhookEndpointServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            webhookEndpointId: String,
            params: WebhookEndpointUpdateParams = WebhookEndpointUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookEndpoint> =
            update(params.toBuilder().webhookEndpointId(webhookEndpointId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: WebhookEndpointUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookEndpoint>

        /** @see update */
        @MustBeClosed
        suspend fun update(
            webhookEndpointId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WebhookEndpoint> =
            update(webhookEndpointId, WebhookEndpointUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /webhook_endpoints`, but is otherwise the same as
         * [WebhookEndpointServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: WebhookEndpointListParams = WebhookEndpointListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookEndpointListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<WebhookEndpointListPageAsync> =
            list(WebhookEndpointListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /webhook_endpoints/{webhook_endpoint_id}`, but is
         * otherwise the same as [WebhookEndpointServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            webhookEndpointId: String,
            params: WebhookEndpointDeleteParams = WebhookEndpointDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            delete(params.toBuilder().webhookEndpointId(webhookEndpointId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        suspend fun delete(
            params: WebhookEndpointDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        suspend fun delete(
            webhookEndpointId: String,
            requestOptions: RequestOptions,
        ): HttpResponse =
            delete(webhookEndpointId, WebhookEndpointDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /webhook_endpoints/{webhook_endpoint_id}/disable`,
         * but is otherwise the same as [WebhookEndpointServiceAsync.disable].
         */
        @MustBeClosed
        suspend fun disable(
            webhookEndpointId: String,
            params: WebhookEndpointDisableParams = WebhookEndpointDisableParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookEndpoint> =
            disable(params.toBuilder().webhookEndpointId(webhookEndpointId).build(), requestOptions)

        /** @see disable */
        @MustBeClosed
        suspend fun disable(
            params: WebhookEndpointDisableParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookEndpoint>

        /** @see disable */
        @MustBeClosed
        suspend fun disable(
            webhookEndpointId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WebhookEndpoint> =
            disable(webhookEndpointId, WebhookEndpointDisableParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /webhook_endpoints/{webhook_endpoint_id}/enable`,
         * but is otherwise the same as [WebhookEndpointServiceAsync.enable].
         */
        @MustBeClosed
        suspend fun enable(
            webhookEndpointId: String,
            params: WebhookEndpointEnableParams = WebhookEndpointEnableParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookEndpoint> =
            enable(params.toBuilder().webhookEndpointId(webhookEndpointId).build(), requestOptions)

        /** @see enable */
        @MustBeClosed
        suspend fun enable(
            params: WebhookEndpointEnableParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookEndpoint>

        /** @see enable */
        @MustBeClosed
        suspend fun enable(
            webhookEndpointId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WebhookEndpoint> =
            enable(webhookEndpointId, WebhookEndpointEnableParams.none(), requestOptions)
    }
}
