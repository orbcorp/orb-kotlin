// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking.events

import com.google.errorprone.annotations.MustBeClosed
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.EventBackfillCloseParams
import com.withorb.api.models.EventBackfillCloseResponse
import com.withorb.api.models.EventBackfillCreateParams
import com.withorb.api.models.EventBackfillCreateResponse
import com.withorb.api.models.EventBackfillFetchParams
import com.withorb.api.models.EventBackfillFetchResponse
import com.withorb.api.models.EventBackfillListPage
import com.withorb.api.models.EventBackfillListParams
import com.withorb.api.models.EventBackfillRevertParams
import com.withorb.api.models.EventBackfillRevertResponse

interface BackfillService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

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
     * When `replace_existing_events` is `true`, this indicates that existing events in
     * the timeframe should no longer be counted towards invoiced usage. In this
     * scenario, the parameter `filter` can be optionally added which enables filtering
     * using
     * [computed properties](/extensibility/advanced-metrics#computed-properties). The
     * expressiveness of computed properties allows you to deprecate existing events
     * based on both a period of time and specific property values.
     */
    fun create(params: EventBackfillCreateParams, requestOptions: RequestOptions = RequestOptions.none()): EventBackfillCreateResponse

    /**
     * This endpoint returns a list of all backfills in a list format.
     *
     * The list of backfills is ordered starting from the most recently created
     * backfill. The response also includes
     * [`pagination_metadata`](/api-reference/pagination), which lets the caller
     * retrieve the next page of results if they exist. More information about
     * pagination can be found in the [Pagination-metadata schema](pagination).
     */
    fun list(params: EventBackfillListParams = EventBackfillListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): EventBackfillListPage

    /** @see [list] */
    fun list(requestOptions: RequestOptions): EventBackfillListPage = list(EventBackfillListParams.none(), requestOptions)

    /**
     * Closing a backfill makes the updated usage visible in Orb. Upon closing a
     * backfill, Orb will asynchronously reflect the updated usage in invoice amounts
     * and usage graphs. Once all of the updates are complete, the backfill's status
     * will transition to `reflected`.
     */
    fun close(params: EventBackfillCloseParams, requestOptions: RequestOptions = RequestOptions.none()): EventBackfillCloseResponse

    /** This endpoint is used to fetch a backfill given an identifier. */
    fun fetch(params: EventBackfillFetchParams, requestOptions: RequestOptions = RequestOptions.none()): EventBackfillFetchResponse

    /**
     * Reverting a backfill undoes all the effects of closing the backfill. If the
     * backfill is reflected, the status will transition to `pending_revert` while the
     * effects of the backfill are undone. Once all effects are undone, the backfill
     * will transition to `reverted`.
     *
     * If a backfill is reverted before its closed, no usage will be updated as a
     * result of the backfill and it will immediately transition to `reverted`.
     */
    fun revert(params: EventBackfillRevertParams, requestOptions: RequestOptions = RequestOptions.none()): EventBackfillRevertResponse

    /**
     * A view of [BackfillService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /events/backfills`, but is otherwise the
         * same as [BackfillService.create].
         */
        @MustBeClosed
        fun create(params: EventBackfillCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<EventBackfillCreateResponse>

        /**
         * Returns a raw HTTP response for `get /events/backfills`, but is otherwise the
         * same as [BackfillService.list].
         */
        @MustBeClosed
        fun list(params: EventBackfillListParams = EventBackfillListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<EventBackfillListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<EventBackfillListPage> = list(EventBackfillListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /events/backfills/{backfill_id}/close`,
         * but is otherwise the same as [BackfillService.close].
         */
        @MustBeClosed
        fun close(params: EventBackfillCloseParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<EventBackfillCloseResponse>

        /**
         * Returns a raw HTTP response for `get /events/backfills/{backfill_id}`, but is
         * otherwise the same as [BackfillService.fetch].
         */
        @MustBeClosed
        fun fetch(params: EventBackfillFetchParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<EventBackfillFetchResponse>

        /**
         * Returns a raw HTTP response for `post /events/backfills/{backfill_id}/revert`,
         * but is otherwise the same as [BackfillService.revert].
         */
        @MustBeClosed
        fun revert(params: EventBackfillRevertParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<EventBackfillRevertResponse>
    }
}
