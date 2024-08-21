// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.withorb.api.services.async.events

import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import kotlin.LazyThreadSafetyMode.PUBLICATION
import java.time.LocalDate
import java.time.Duration
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Base64
import java.util.Optional
import java.util.UUID
import java.util.concurrent.CompletableFuture
import java.util.stream.Stream
import com.withorb.api.core.Enum
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.errors.OrbInvalidDataException
import com.withorb.api.models.EventBackfillCloseParams
import com.withorb.api.models.EventBackfillCloseResponse
import com.withorb.api.models.EventBackfillCreateParams
import com.withorb.api.models.EventBackfillCreateResponse
import com.withorb.api.models.EventBackfillFetchParams
import com.withorb.api.models.EventBackfillFetchResponse
import com.withorb.api.models.EventBackfillListPageAsync
import com.withorb.api.models.EventBackfillListParams
import com.withorb.api.models.EventBackfillListResponse
import com.withorb.api.models.EventBackfillRevertParams
import com.withorb.api.models.EventBackfillRevertResponse
import com.withorb.api.core.ClientOptions
import com.withorb.api.core.http.HttpMethod
import com.withorb.api.core.http.HttpRequest
import com.withorb.api.core.http.HttpResponse.Handler
import com.withorb.api.core.http.BinaryResponseContent
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonValue
import com.withorb.api.core.RequestOptions
import com.withorb.api.errors.OrbError
import com.withorb.api.services.emptyHandler
import com.withorb.api.services.errorHandler
import com.withorb.api.services.json
import com.withorb.api.services.jsonHandler
import com.withorb.api.services.multipartFormData
import com.withorb.api.services.stringHandler
import com.withorb.api.services.binaryHandler
import com.withorb.api.services.withErrorHandler

interface BackfillServiceAsync {

    /**
     * Creating the backfill enables adding or replacing past events, even those that
     * are older than the ingestion grace period. Performing a backfill in Orb involves
     * 3 steps:
     *
     * 1. Create the backfill, specifying its parameters.
     * 2. [Ingest](ingest) usage events, referencing the backfill (query parameter
     *    `backfill_id`).
     * 3. [Close](close-backfill) the backfill, propagating the update in past usage
     *    throughout Orb.
     *
     * Changes from a backfill are not reflected until the backfill is closed, so you
     * won’t need to worry about your customers seeing partially updated usage data.
     * Backfills are also reversible, so you’ll be able to revert a backfill if you’ve
     * made a mistake.
     *
     * This endpoint will return a backfill object, which contains an `id`. That `id`
     * can then be used as the `backfill_id` query parameter to the event ingestion
     * endpoint to associate ingested events with this backfill. The effects (e.g.
     * updated usage graphs) of this backfill will not take place until the backfill is
     * closed.
     *
     * If the `replace_existing_events` is `true`, existing events in the backfill's
     * timeframe will be replaced with the newly ingested events associated with the
     * backfill. If `false`, newly ingested events will be added to the existing
     * events.
     *
     * If a `customer_id` or `external_customer_id` is specified, the backfill will
     * only affect events for that customer. If neither is specified, the backfill will
     * affect all customers.
     *
     * When `replace_existing_events` is `true`, the field `filter` can be optionally
     * added which enables filtering using
     * [computed properties](../guides/extensibility/advanced-metrics#computed-properties).
     * The expressiveness of computed properties allows you to deprecate existing
     * events based on both a period of time and specific property values.
     */
    suspend fun create(params: EventBackfillCreateParams, requestOptions: RequestOptions = RequestOptions.none()): EventBackfillCreateResponse

    /**
     * This endpoint returns a list of all backfills in a list format.
     *
     * The list of backfills is ordered starting from the most recently created
     * backfill. The response also includes
     * [`pagination_metadata`](../reference/pagination), which lets the caller retrieve
     * the next page of results if they exist. More information about pagination can be
     * found in the [Pagination-metadata schema](pagination).
     */
    suspend fun list(params: EventBackfillListParams, requestOptions: RequestOptions = RequestOptions.none()): EventBackfillListPageAsync

    /**
     * Closing a backfill makes the updated usage visible in Orb. Upon closing a
     * backfill, Orb will asynchronously reflect the updated usage in invoice amounts
     * and usage graphs. Once all of the updates are complete, the backfill's status
     * will transition to `reflected`.
     */
    suspend fun close(params: EventBackfillCloseParams, requestOptions: RequestOptions = RequestOptions.none()): EventBackfillCloseResponse

    /** This endpoint is used to fetch a backfill given an identifier. */
    suspend fun fetch(params: EventBackfillFetchParams, requestOptions: RequestOptions = RequestOptions.none()): EventBackfillFetchResponse

    /**
     * Reverting a backfill undoes all the effects of closing the backfill. If the
     * backfill is reflected, the status will transition to `pending_revert` while the
     * effects of the backfill are undone. Once all effects are undone, the backfill
     * will transition to `reverted`.
     *
     * If a backfill is reverted before its closed, no usage will be updated as a
     * result of the backfill and it will immediately transition to `reverted`.
     */
    suspend fun revert(params: EventBackfillRevertParams, requestOptions: RequestOptions = RequestOptions.none()): EventBackfillRevertResponse
}
