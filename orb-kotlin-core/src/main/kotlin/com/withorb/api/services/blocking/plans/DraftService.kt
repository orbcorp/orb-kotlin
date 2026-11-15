// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking.plans

import com.google.errorprone.annotations.MustBeClosed
import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponse
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.PlanDraftDiscardParams
import com.withorb.api.models.PlanDraftFetchParams
import com.withorb.api.models.PlanDraftPublishParams
import com.withorb.api.models.PlanDraftSaveParams
import com.withorb.api.models.PlanVersion
import com.withorb.api.models.PlanVersionDraft

/**
 * The [Plan](/core-concepts#plan-and-price) resource represents a plan that can be subscribed to by
 * a customer. Plans define the billing behavior of the subscription. You can see more about how to
 * configure prices in the [Price resource](/reference/price).
 */
interface DraftService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DraftService

    /**
     * This endpoint discards the plan's draft version. Prices and adjustments the draft created
     * stay in the Pricebook.
     */
    fun discard(
        planId: String,
        params: PlanDraftDiscardParams = PlanDraftDiscardParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = discard(params.toBuilder().planId(planId).build(), requestOptions)

    /** @see discard */
    fun discard(
        params: PlanDraftDiscardParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see discard */
    fun discard(planId: String, requestOptions: RequestOptions) =
        discard(planId, PlanDraftDiscardParams.none(), requestOptions)

    /**
     * This endpoint returns the plan's unpublished draft version, with its changes applied on top
     * of the latest published version. It returns a 404 if the plan has no draft.
     */
    fun fetch(
        planId: String,
        params: PlanDraftFetchParams = PlanDraftFetchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanVersionDraft = fetch(params.toBuilder().planId(planId).build(), requestOptions)

    /** @see fetch */
    fun fetch(
        params: PlanDraftFetchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanVersionDraft

    /** @see fetch */
    fun fetch(planId: String, requestOptions: RequestOptions): PlanVersionDraft =
        fetch(planId, PlanDraftFetchParams.none(), requestOptions)

    /**
     * This endpoint publishes the plan's draft as the next numbered version. A draft that fails
     * plan version validation is a 400 and is left as it was.
     */
    fun publish(
        planId: String,
        params: PlanDraftPublishParams = PlanDraftPublishParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanVersion = publish(params.toBuilder().planId(planId).build(), requestOptions)

    /** @see publish */
    fun publish(
        params: PlanDraftPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanVersion

    /** @see publish */
    fun publish(planId: String, requestOptions: RequestOptions): PlanVersion =
        publish(planId, PlanDraftPublishParams.none(), requestOptions)

    /**
     * This endpoint creates the plan's draft version or fully replaces its changes. The changes are
     * always relative to the latest published version. A save replaces the draft; last write wins.
     */
    fun save(
        planId: String,
        params: PlanDraftSaveParams = PlanDraftSaveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanVersionDraft = save(params.toBuilder().planId(planId).build(), requestOptions)

    /** @see save */
    fun save(
        params: PlanDraftSaveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanVersionDraft

    /** @see save */
    fun save(planId: String, requestOptions: RequestOptions): PlanVersionDraft =
        save(planId, PlanDraftSaveParams.none(), requestOptions)

    /** A view of [DraftService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DraftService.WithRawResponse

        /**
         * Returns a raw HTTP response for `delete /plans/{plan_id}/draft`, but is otherwise the
         * same as [DraftService.discard].
         */
        @MustBeClosed
        fun discard(
            planId: String,
            params: PlanDraftDiscardParams = PlanDraftDiscardParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = discard(params.toBuilder().planId(planId).build(), requestOptions)

        /** @see discard */
        @MustBeClosed
        fun discard(
            params: PlanDraftDiscardParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see discard */
        @MustBeClosed
        fun discard(planId: String, requestOptions: RequestOptions): HttpResponse =
            discard(planId, PlanDraftDiscardParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /plans/{plan_id}/draft`, but is otherwise the same
         * as [DraftService.fetch].
         */
        @MustBeClosed
        fun fetch(
            planId: String,
            params: PlanDraftFetchParams = PlanDraftFetchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanVersionDraft> =
            fetch(params.toBuilder().planId(planId).build(), requestOptions)

        /** @see fetch */
        @MustBeClosed
        fun fetch(
            params: PlanDraftFetchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanVersionDraft>

        /** @see fetch */
        @MustBeClosed
        fun fetch(
            planId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlanVersionDraft> =
            fetch(planId, PlanDraftFetchParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /plans/{plan_id}/draft/publish`, but is otherwise
         * the same as [DraftService.publish].
         */
        @MustBeClosed
        fun publish(
            planId: String,
            params: PlanDraftPublishParams = PlanDraftPublishParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanVersion> =
            publish(params.toBuilder().planId(planId).build(), requestOptions)

        /** @see publish */
        @MustBeClosed
        fun publish(
            params: PlanDraftPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanVersion>

        /** @see publish */
        @MustBeClosed
        fun publish(planId: String, requestOptions: RequestOptions): HttpResponseFor<PlanVersion> =
            publish(planId, PlanDraftPublishParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /plans/{plan_id}/draft`, but is otherwise the same
         * as [DraftService.save].
         */
        @MustBeClosed
        fun save(
            planId: String,
            params: PlanDraftSaveParams = PlanDraftSaveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanVersionDraft> =
            save(params.toBuilder().planId(planId).build(), requestOptions)

        /** @see save */
        @MustBeClosed
        fun save(
            params: PlanDraftSaveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanVersionDraft>

        /** @see save */
        @MustBeClosed
        fun save(
            planId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlanVersionDraft> =
            save(planId, PlanDraftSaveParams.none(), requestOptions)
    }
}
