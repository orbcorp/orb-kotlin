// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking.customers

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpMethod
import com.withorb.api.core.http.HttpRequest
import com.withorb.api.core.http.HttpResponse.Handler
import com.withorb.api.errors.OrbError
import com.withorb.api.models.CustomerUsageUpdateByExternalIdParams
import com.withorb.api.models.CustomerUsageUpdateByExternalIdResponse
import com.withorb.api.models.CustomerUsageUpdateParams
import com.withorb.api.models.CustomerUsageUpdateResponse
import com.withorb.api.services.errorHandler
import com.withorb.api.services.json
import com.withorb.api.services.jsonHandler
import com.withorb.api.services.withErrorHandler

class UsageServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : UsageService {

    private val errorHandler: Handler<OrbError> = errorHandler(clientOptions.jsonMapper)

    private val updateHandler: Handler<CustomerUsageUpdateResponse> =
        jsonHandler<CustomerUsageUpdateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * This endpoint is used to amend usage within a timeframe for a customer that has an active
     * subscription.
     *
     * This endpoint will mark _all_ existing events within `[timeframe_start, timeframe_end)` as
     * _ignored_ for billing purposes, and Orb will only use the _new_ events passed in the body of
     * this request as the source of truth for that timeframe moving forwards. Note that a given
     * time period can be amended any number of times, so events can be overwritten in subsequent
     * calls to th is endpoint.
     *
     * This is a powerful and audit-safe mechanism to retroactively change usage data in cases where
     * you need to:
     * - decrease historical usage consumption because of degraded service availability in your
     *   systems
     * - account for gaps from your usage reporting mechanism
     * - make point-in-time fixes for specific event records, while retaining the original time of
     *   usage and associated metadata. This amendment API is designed with two explicit goals:
     * 1. Amendments are **always audit-safe**. The amendment process will still retain original
     *    events in the timeframe, though they will be ignored for billing calculations. For
     *    auditing a nd data fidelity purposes, Orb never overwrites or permanently deletes ingested
     *    usage data.
     * 2. Amendments always preserve data **consistency**. In other words, either an amendment is
     *    fully processed by the system (and the new events for the timeframe are honored rather
     *    than the existing ones) or the amendment request fails. To maintain this important
     *    property, Orb prevents _partial event ingestion_ on this endpoint.
     *
     * ## Response semantics
     * - Either all events are ingested successfully, or all fail to ingest (returning a `4xx` or
     *   `5xx` response code).
     * - Any event that fails schema validation will lead to a `4xx` response. In this case, to
     *   maintain data consistency, Orb will not ingest any events and will also not deprecate
     *   existing events in the time period.
     * - You can assume that the amendment is successful on receipt of a `2xx` response.While a
     *   successful response from this endpoint indicates that the new events have been ingested,
     *   updating usage totals happens asynchronously and may be delayed by a few minutes.
     *
     * As emphasized above, Orb will never show an inconsistent state (e.g. in invoice previews or
     * dashboards); either it will show the existing state (before the amendment) or the new state
     * (with new events in the requested timeframe).
     *
     * ## Sample request body
     *
     * ```json
     * {
     *   "events": [
     *     {
     *       "event_name": "payment_processed",
     *       "timestamp": "2022-03-24T07:15:00Z",
     *       "properties": {
     *         "amount": 100
     *       }
     *     },
     *     {
     *       "event_name": "payment_failed",
     *       "timestamp": "2022-03-24T07:15:00Z",
     *       "properties": {
     *         "amount": 100
     *       }
     *     }
     *   ]
     * }
     * ```
     *
     * ## Request Validation
     * - The `timestamp` of each event reported must fall within the bounds of `timeframe_start` and
     *   `timeframe_end`. As with ingestion, all timesta mps must be sent in ISO8601 format with UTC
     *   timezone offset.
     * - Orb **does not accept an `idempotency_key`** with each event in this endpoint, since the
     *   entirety of the event list must be ingested to ensure consistency. On retryable errors ,
     *   you should retry the request in its entirety, and assume that the amendment operation has
     *   not succeeded until receipt of a `2xx`.
     * - Both `timeframe_start` and `timeframe_end` must be timestamps in the past. Furthermore, Orb
     *   will genera lly validate that the `timeframe_start` and `timeframe_end` fall within the
     *   customer's _current_ subscription billing pe riod. However, Orb does allow amendments while
     *   in the grace period of the previous billing period; in this instance, the timeframe can
     *   start before the current period.
     *
     * ## API Limits
     *
     * Note that Orb does not currently enforce a hard rate- limit for API usage or a maximum
     * request payload size. Similar to the event ingestion API, this API is architected for h
     * igh-throughput ingestion. It is also safe to _programmatically_ call this endpoint if your
     * system can automatically dete ct a need for historical amendment.
     *
     * In order to overwrite timeframes with a very large number of events, we suggest using
     * multiple calls with small adjacent (e.g. every hour) timeframes.
     */
    override fun update(
        params: CustomerUsageUpdateParams,
        requestOptions: RequestOptions
    ): CustomerUsageUpdateResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("customers", params.getPathParam(0), "usage")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { updateHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val updateByExternalIdHandler: Handler<CustomerUsageUpdateByExternalIdResponse> =
        jsonHandler<CustomerUsageUpdateByExternalIdResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * This endpoint is used to amend usage within a timeframe for a customer that has an active
     * subscription.
     *
     * This endpoint will mark _all_ existing events within `[timeframe_start, timeframe_end)` as
     * _ignored_ for billing purposes, and Orb will only use the _new_ events passed in the body of
     * this request as the source of truth for that timeframe moving forwards. Note that a given
     * time period can be amended any number of times, so events can be overwritten in subsequent
     * calls to th is endpoint.
     *
     * This is a powerful and audit-safe mechanism to retroactively change usage data in cases where
     * you need to:
     * - decrease historical usage consumption because of degraded service availability in your
     *   systems
     * - account for gaps from your usage reporting mechanism
     * - make point-in-time fixes for specific event records, while retaining the original time of
     *   usage and associated metadata. This amendment API is designed with two explicit goals:
     * 1. Amendments are **always audit-safe**. The amendment process will still retain original
     *    events in the timeframe, though they will be ignored for billing calculations. For
     *    auditing a nd data fidelity purposes, Orb never overwrites or permanently deletes ingested
     *    usage data.
     * 2. Amendments always preserve data **consistency**. In other words, either an amendment is
     *    fully processed by the system (and the new events for the timeframe are honored rather
     *    than the existing ones) or the amendment request fails. To maintain this important
     *    property, Orb prevents _partial event ingestion_ on this endpoint.
     *
     * ## Response semantics
     * - Either all events are ingested successfully, or all fail to ingest (returning a `4xx` or
     *   `5xx` response code).
     * - Any event that fails schema validation will lead to a `4xx` response. In this case, to
     *   maintain data consistency, Orb will not ingest any events and will also not deprecate
     *   existing events in the time period.
     * - You can assume that the amendment is successful on receipt of a `2xx` response.While a
     *   successful response from this endpoint indicates that the new events have been ingested,
     *   updating usage totals happens asynchronously and may be delayed by a few minutes.
     *
     * As emphasized above, Orb will never show an inconsistent state (e.g. in invoice previews or
     * dashboards); either it will show the existing state (before the amendment) or the new state
     * (with new events in the requested timeframe).
     *
     * ## Sample request body
     *
     * ```json
     * {
     *   "events": [
     *     {
     *       "event_name": "payment_processed",
     *       "timestamp": "2022-03-24T07:15:00Z",
     *       "properties": {
     *         "amount": 100
     *       }
     *     },
     *     {
     *       "event_name": "payment_failed",
     *       "timestamp": "2022-03-24T07:15:00Z",
     *       "properties": {
     *         "amount": 100
     *       }
     *     }
     *   ]
     * }
     * ```
     *
     * ## Request Validation
     * - The `timestamp` of each event reported must fall within the bounds of `timeframe_start` and
     *   `timeframe_end`. As with ingestion, all timesta mps must be sent in ISO8601 format with UTC
     *   timezone offset.
     * - Orb **does not accept an `idempotency_key`** with each event in this endpoint, since the
     *   entirety of the event list must be ingested to ensure consistency. On retryable errors ,
     *   you should retry the request in its entirety, and assume that the amendment operation has
     *   not succeeded until receipt of a `2xx`.
     * - Both `timeframe_start` and `timeframe_end` must be timestamps in the past. Furthermore, Orb
     *   will genera lly validate that the `timeframe_start` and `timeframe_end` fall within the
     *   customer's _current_ subscription billing pe riod. However, Orb does allow amendments while
     *   in the grace period of the previous billing period; in this instance, the timeframe can
     *   start before the current period.
     *
     * ## API Limits
     *
     * Note that Orb does not currently enforce a hard rate- limit for API usage or a maximum
     * request payload size. Similar to the event ingestion API, this API is architected for h
     * igh-throughput ingestion. It is also safe to _programmatically_ call this endpoint if your
     * system can automatically dete ct a need for historical amendment.
     *
     * In order to overwrite timeframes with a very large number of events, we suggest using
     * multiple calls with small adjacent (e.g. every hour) timeframes.
     */
    override fun updateByExternalId(
        params: CustomerUsageUpdateByExternalIdParams,
        requestOptions: RequestOptions
    ): CustomerUsageUpdateByExternalIdResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments(
                    "customers",
                    "external_customer_id",
                    params.getPathParam(0),
                    "usage"
                )
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { updateByExternalIdHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
