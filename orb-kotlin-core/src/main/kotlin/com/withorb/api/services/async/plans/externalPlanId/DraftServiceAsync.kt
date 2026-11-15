// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.plans.externalPlanId

import com.google.errorprone.annotations.MustBeClosed
import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponse
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.PlanExternalPlanIdDraftDiscardParams
import com.withorb.api.models.PlanExternalPlanIdDraftFetchParams
import com.withorb.api.models.PlanExternalPlanIdDraftPublishParams
import com.withorb.api.models.PlanExternalPlanIdDraftSaveParams
import com.withorb.api.models.PlanVersion
import com.withorb.api.models.PlanVersionDraft

/**
 * The [Plan](/core-concepts#plan-and-price) resource represents a plan that can be subscribed to by
 * a customer. Plans define the billing behavior of the subscription. You can see more about how to
 * configure prices in the [Price resource](/reference/price).
 */
interface DraftServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DraftServiceAsync

    /**
     * This endpoint discards the plan's draft version. Prices and adjustments the draft created
     * stay in the Pricebook.
     */
    suspend fun discard(
        externalPlanId: String,
        params: PlanExternalPlanIdDraftDiscardParams = PlanExternalPlanIdDraftDiscardParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = discard(params.toBuilder().externalPlanId(externalPlanId).build(), requestOptions)

    /** @see discard */
    suspend fun discard(
        params: PlanExternalPlanIdDraftDiscardParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see discard */
    suspend fun discard(externalPlanId: String, requestOptions: RequestOptions) =
        discard(externalPlanId, PlanExternalPlanIdDraftDiscardParams.none(), requestOptions)

    /**
     * This endpoint returns the plan's unpublished draft version, with its changes applied on top
     * of the latest published version. It returns a 404 if the plan has no draft.
     */
    suspend fun fetch(
        externalPlanId: String,
        params: PlanExternalPlanIdDraftFetchParams = PlanExternalPlanIdDraftFetchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanVersionDraft =
        fetch(params.toBuilder().externalPlanId(externalPlanId).build(), requestOptions)

    /** @see fetch */
    suspend fun fetch(
        params: PlanExternalPlanIdDraftFetchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanVersionDraft

    /** @see fetch */
    suspend fun fetch(externalPlanId: String, requestOptions: RequestOptions): PlanVersionDraft =
        fetch(externalPlanId, PlanExternalPlanIdDraftFetchParams.none(), requestOptions)

    /**
     * This endpoint publishes the plan's draft as the next numbered version. A draft that fails
     * plan version validation is a 400 and is left as it was.
     */
    suspend fun publish(
        externalPlanId: String,
        params: PlanExternalPlanIdDraftPublishParams = PlanExternalPlanIdDraftPublishParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanVersion =
        publish(params.toBuilder().externalPlanId(externalPlanId).build(), requestOptions)

    /** @see publish */
    suspend fun publish(
        params: PlanExternalPlanIdDraftPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanVersion

    /** @see publish */
    suspend fun publish(externalPlanId: String, requestOptions: RequestOptions): PlanVersion =
        publish(externalPlanId, PlanExternalPlanIdDraftPublishParams.none(), requestOptions)

    /**
     * This endpoint creates the plan's draft version or fully replaces its changes. The changes are
     * always relative to the latest published version. A save replaces the draft; last write wins.
     */
    suspend fun save(
        externalPlanId: String,
        params: PlanExternalPlanIdDraftSaveParams = PlanExternalPlanIdDraftSaveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanVersionDraft =
        save(params.toBuilder().externalPlanId(externalPlanId).build(), requestOptions)

    /** @see save */
    suspend fun save(
        params: PlanExternalPlanIdDraftSaveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanVersionDraft

    /** @see save */
    suspend fun save(externalPlanId: String, requestOptions: RequestOptions): PlanVersionDraft =
        save(externalPlanId, PlanExternalPlanIdDraftSaveParams.none(), requestOptions)

    /** A view of [DraftServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): DraftServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `delete
         * /plans/external_plan_id/{external_plan_id}/draft`, but is otherwise the same as
         * [DraftServiceAsync.discard].
         */
        @MustBeClosed
        suspend fun discard(
            externalPlanId: String,
            params: PlanExternalPlanIdDraftDiscardParams =
                PlanExternalPlanIdDraftDiscardParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            discard(params.toBuilder().externalPlanId(externalPlanId).build(), requestOptions)

        /** @see discard */
        @MustBeClosed
        suspend fun discard(
            params: PlanExternalPlanIdDraftDiscardParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see discard */
        @MustBeClosed
        suspend fun discard(externalPlanId: String, requestOptions: RequestOptions): HttpResponse =
            discard(externalPlanId, PlanExternalPlanIdDraftDiscardParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /plans/external_plan_id/{external_plan_id}/draft`,
         * but is otherwise the same as [DraftServiceAsync.fetch].
         */
        @MustBeClosed
        suspend fun fetch(
            externalPlanId: String,
            params: PlanExternalPlanIdDraftFetchParams = PlanExternalPlanIdDraftFetchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanVersionDraft> =
            fetch(params.toBuilder().externalPlanId(externalPlanId).build(), requestOptions)

        /** @see fetch */
        @MustBeClosed
        suspend fun fetch(
            params: PlanExternalPlanIdDraftFetchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanVersionDraft>

        /** @see fetch */
        @MustBeClosed
        suspend fun fetch(
            externalPlanId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlanVersionDraft> =
            fetch(externalPlanId, PlanExternalPlanIdDraftFetchParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /plans/external_plan_id/{external_plan_id}/draft/publish`, but is otherwise the same as
         * [DraftServiceAsync.publish].
         */
        @MustBeClosed
        suspend fun publish(
            externalPlanId: String,
            params: PlanExternalPlanIdDraftPublishParams =
                PlanExternalPlanIdDraftPublishParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanVersion> =
            publish(params.toBuilder().externalPlanId(externalPlanId).build(), requestOptions)

        /** @see publish */
        @MustBeClosed
        suspend fun publish(
            params: PlanExternalPlanIdDraftPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanVersion>

        /** @see publish */
        @MustBeClosed
        suspend fun publish(
            externalPlanId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlanVersion> =
            publish(externalPlanId, PlanExternalPlanIdDraftPublishParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /plans/external_plan_id/{external_plan_id}/draft`,
         * but is otherwise the same as [DraftServiceAsync.save].
         */
        @MustBeClosed
        suspend fun save(
            externalPlanId: String,
            params: PlanExternalPlanIdDraftSaveParams = PlanExternalPlanIdDraftSaveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanVersionDraft> =
            save(params.toBuilder().externalPlanId(externalPlanId).build(), requestOptions)

        /** @see save */
        @MustBeClosed
        suspend fun save(
            params: PlanExternalPlanIdDraftSaveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanVersionDraft>

        /** @see save */
        @MustBeClosed
        suspend fun save(
            externalPlanId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlanVersionDraft> =
            save(externalPlanId, PlanExternalPlanIdDraftSaveParams.none(), requestOptions)
    }
}
