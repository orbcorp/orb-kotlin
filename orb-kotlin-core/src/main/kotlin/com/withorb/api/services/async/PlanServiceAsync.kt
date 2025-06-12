// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.Plan
import com.withorb.api.models.PlanCreateParams
import com.withorb.api.models.PlanFetchParams
import com.withorb.api.models.PlanListPageAsync
import com.withorb.api.models.PlanListParams
import com.withorb.api.models.PlanUpdateParams
import com.withorb.api.services.async.plans.ExternalPlanIdServiceAsync

interface PlanServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PlanServiceAsync

    fun externalPlanId(): ExternalPlanIdServiceAsync

    /** This endpoint allows creation of plans including their prices. */
    suspend fun create(
        params: PlanCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Plan

    /**
     * This endpoint can be used to update the `external_plan_id`, and `metadata` of an existing
     * plan.
     *
     * Other fields on a plan are currently immutable.
     */
    suspend fun update(
        planId: String,
        params: PlanUpdateParams = PlanUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Plan = update(params.toBuilder().planId(planId).build(), requestOptions)

    /** @see [update] */
    suspend fun update(
        params: PlanUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Plan

    /** @see [update] */
    suspend fun update(planId: String, requestOptions: RequestOptions): Plan =
        update(planId, PlanUpdateParams.none(), requestOptions)

    /**
     * This endpoint returns a list of all [plans](/core-concepts#plan-and-price) for an account in
     * a list format. The list of plans is ordered starting from the most recently created plan. The
     * response also includes [`pagination_metadata`](/api-reference/pagination), which lets the
     * caller retrieve the next page of results if they exist.
     */
    suspend fun list(
        params: PlanListParams = PlanListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): PlanListPageAsync =
        list(PlanListParams.none(), requestOptions)

    /**
     * This endpoint is used to fetch [plan](/core-concepts#plan-and-price) details given a plan
     * identifier. It returns information about the prices included in the plan and their
     * configuration, as well as the product that the plan is attached to.
     *
     * ## Serialized prices
     *
     * Orb supports a few different pricing models out of the box. Each of these models is
     * serialized differently in a given [Price](/core-concepts#plan-and-price) object. The
     * `model_type` field determines the key for the configuration object that is present. A
     * detailed explanation of price types can be found in the
     * [Price schema](/core-concepts#plan-and-price).
     *
     * ## Phases
     *
     * Orb supports plan phases, also known as contract ramps. For plans with phases, the serialized
     * prices refer to all prices across all phases.
     */
    suspend fun fetch(
        planId: String,
        params: PlanFetchParams = PlanFetchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Plan = fetch(params.toBuilder().planId(planId).build(), requestOptions)

    /** @see [fetch] */
    suspend fun fetch(
        params: PlanFetchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Plan

    /** @see [fetch] */
    suspend fun fetch(planId: String, requestOptions: RequestOptions): Plan =
        fetch(planId, PlanFetchParams.none(), requestOptions)

    /** A view of [PlanServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PlanServiceAsync.WithRawResponse

        fun externalPlanId(): ExternalPlanIdServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /plans`, but is otherwise the same as
         * [PlanServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: PlanCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Plan>

        /**
         * Returns a raw HTTP response for `put /plans/{plan_id}`, but is otherwise the same as
         * [PlanServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            planId: String,
            params: PlanUpdateParams = PlanUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Plan> = update(params.toBuilder().planId(planId).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        suspend fun update(
            params: PlanUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Plan>

        /** @see [update] */
        @MustBeClosed
        suspend fun update(planId: String, requestOptions: RequestOptions): HttpResponseFor<Plan> =
            update(planId, PlanUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /plans`, but is otherwise the same as
         * [PlanServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: PlanListParams = PlanListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<PlanListPageAsync> =
            list(PlanListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /plans/{plan_id}`, but is otherwise the same as
         * [PlanServiceAsync.fetch].
         */
        @MustBeClosed
        suspend fun fetch(
            planId: String,
            params: PlanFetchParams = PlanFetchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Plan> = fetch(params.toBuilder().planId(planId).build(), requestOptions)

        /** @see [fetch] */
        @MustBeClosed
        suspend fun fetch(
            params: PlanFetchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Plan>

        /** @see [fetch] */
        @MustBeClosed
        suspend fun fetch(planId: String, requestOptions: RequestOptions): HttpResponseFor<Plan> =
            fetch(planId, PlanFetchParams.none(), requestOptions)
    }
}
