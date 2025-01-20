// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.events

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.handlers.errorHandler
import com.withorb.api.core.handlers.jsonHandler
import com.withorb.api.core.handlers.withErrorHandler
import com.withorb.api.core.http.HttpMethod
import com.withorb.api.core.http.HttpRequest
import com.withorb.api.core.http.HttpResponse.Handler
import com.withorb.api.core.json
import com.withorb.api.errors.OrbError
import com.withorb.api.models.EventBackfillCloseParams
import com.withorb.api.models.EventBackfillCloseResponse
import com.withorb.api.models.EventBackfillCreateParams
import com.withorb.api.models.EventBackfillCreateResponse
import com.withorb.api.models.EventBackfillFetchParams
import com.withorb.api.models.EventBackfillFetchResponse
import com.withorb.api.models.EventBackfillListPageAsync
import com.withorb.api.models.EventBackfillListParams
import com.withorb.api.models.EventBackfillRevertParams
import com.withorb.api.models.EventBackfillRevertResponse

class BackfillServiceAsyncImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : BackfillServiceAsync {

    private val errorHandler: Handler<OrbError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<EventBackfillCreateResponse> =
        jsonHandler<EventBackfillCreateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Creating the backfill enables adding or replacing past events, even those that are older than
     * the ingestion grace period. Performing a backfill in Orb involves 3 steps:
     * 1. Create the backfill, specifying its parameters.
     * 2. [Ingest](ingest) usage events, referencing the backfill (query parameter `backfill_id`).
     * 3. [Close](close-backfill) the backfill, propagating the update in past usage throughout Orb.
     *
     * Changes from a backfill are not reflected until the backfill is closed, so you won’t need to
     * worry about your customers seeing partially updated usage data. Backfills are also
     * reversible, so you’ll be able to revert a backfill if you’ve made a mistake.
     *
     * This endpoint will return a backfill object, which contains an `id`. That `id` can then be
     * used as the `backfill_id` query parameter to the event ingestion endpoint to associate
     * ingested events with this backfill. The effects (e.g. updated usage graphs) of this backfill
     * will not take place until the backfill is closed.
     *
     * If the `replace_existing_events` is `true`, existing events in the backfill's timeframe will
     * be replaced with the newly ingested events associated with the backfill. If `false`, newly
     * ingested events will be added to the existing events.
     *
     * If a `customer_id` or `external_customer_id` is specified, the backfill will only affect
     * events for that customer. If neither is specified, the backfill will affect all customers.
     *
     * When `replace_existing_events` is `true`, this indicates that existing events in the
     * timeframe should no longer be counter towards invoiced usage. In this scenario, the parameter
     * `filter` can be optionally added which enables filtering using
     * [computed properties](/extensibility/advanced-metrics#computed-properties). The
     * expressiveness of computed properties allows you to deprecate existing events based on both a
     * period of time and specific property values.
     */
    override suspend fun create(
        params: EventBackfillCreateParams,
        requestOptions: RequestOptions
    ): EventBackfillCreateResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("events", "backfills")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response
                .use { createHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<EventBackfillListPageAsync.Response> =
        jsonHandler<EventBackfillListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * This endpoint returns a list of all backfills in a list format.
     *
     * The list of backfills is ordered starting from the most recently created backfill. The
     * response also includes [`pagination_metadata`](/api-reference/pagination), which lets the
     * caller retrieve the next page of results if they exist. More information about pagination can
     * be found in the [Pagination-metadata schema](pagination).
     */
    override suspend fun list(
        params: EventBackfillListParams,
        requestOptions: RequestOptions
    ): EventBackfillListPageAsync {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("events", "backfills")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { EventBackfillListPageAsync.of(this, params, it) }
        }
    }

    private val closeHandler: Handler<EventBackfillCloseResponse> =
        jsonHandler<EventBackfillCloseResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Closing a backfill makes the updated usage visible in Orb. Upon closing a backfill, Orb will
     * asynchronously reflect the updated usage in invoice amounts and usage graphs. Once all of the
     * updates are complete, the backfill's status will transition to `reflected`.
     */
    override suspend fun close(
        params: EventBackfillCloseParams,
        requestOptions: RequestOptions
    ): EventBackfillCloseResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("events", "backfills", params.getPathParam(0), "close")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .apply { params.getBody()?.also { body(json(clientOptions.jsonMapper, it)) } }
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response
                .use { closeHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val fetchHandler: Handler<EventBackfillFetchResponse> =
        jsonHandler<EventBackfillFetchResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** This endpoint is used to fetch a backfill given an identifier. */
    override suspend fun fetch(
        params: EventBackfillFetchParams,
        requestOptions: RequestOptions
    ): EventBackfillFetchResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("events", "backfills", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response
                .use { fetchHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val revertHandler: Handler<EventBackfillRevertResponse> =
        jsonHandler<EventBackfillRevertResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Reverting a backfill undoes all the effects of closing the backfill. If the backfill is
     * reflected, the status will transition to `pending_revert` while the effects of the backfill
     * are undone. Once all effects are undone, the backfill will transition to `reverted`.
     *
     * If a backfill is reverted before its closed, no usage will be updated as a result of the
     * backfill and it will immediately transition to `reverted`.
     */
    override suspend fun revert(
        params: EventBackfillRevertParams,
        requestOptions: RequestOptions
    ): EventBackfillRevertResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("events", "backfills", params.getPathParam(0), "revert")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .apply { params.getBody()?.also { body(json(clientOptions.jsonMapper, it)) } }
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response
                .use { revertHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
