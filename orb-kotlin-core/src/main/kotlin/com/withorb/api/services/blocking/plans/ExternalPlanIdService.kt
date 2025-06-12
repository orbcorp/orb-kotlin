// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking.plans

import com.google.errorprone.annotations.MustBeClosed
import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.Plan
import com.withorb.api.models.PlanExternalPlanIdFetchParams
import com.withorb.api.models.PlanExternalPlanIdUpdateParams

interface ExternalPlanIdService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ExternalPlanIdService

    /**
     * This endpoint can be used to update the `external_plan_id`, and `metadata` of an existing
     * plan.
     *
     * Other fields on a plan are currently immutable.
     */
    fun update(
        otherExternalPlanId: String,
        params: PlanExternalPlanIdUpdateParams = PlanExternalPlanIdUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Plan =
        update(params.toBuilder().otherExternalPlanId(otherExternalPlanId).build(), requestOptions)

    /** @see [update] */
    fun update(
        params: PlanExternalPlanIdUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Plan

    /** @see [update] */
    fun update(otherExternalPlanId: String, requestOptions: RequestOptions): Plan =
        update(otherExternalPlanId, PlanExternalPlanIdUpdateParams.none(), requestOptions)

    /**
     * This endpoint is used to fetch [plan](/core-concepts##plan-and-price) details given an
     * external_plan_id identifier. It returns information about the prices included in the plan and
     * their configuration, as well as the product that the plan is attached to.
     *
     * If multiple plans are found to contain the specified external_plan_id, the active plans will
     * take priority over archived ones, and among those, the endpoint will return the most recently
     * created plan.
     *
     * ## Serialized prices
     *
     * Orb supports a few different pricing models out of the box. Each of these models is
     * serialized differently in a given [Price](/core-concepts#plan-and-price) object. The
     * `model_type` field determines the key for the configuration object that is present. A
     * detailed explanation of price types can be found in the
     * [Price schema](/core-concepts#plan-and-price). "
     */
    fun fetch(
        externalPlanId: String,
        params: PlanExternalPlanIdFetchParams = PlanExternalPlanIdFetchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Plan = fetch(params.toBuilder().externalPlanId(externalPlanId).build(), requestOptions)

    /** @see [fetch] */
    fun fetch(
        params: PlanExternalPlanIdFetchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Plan

    /** @see [fetch] */
    fun fetch(externalPlanId: String, requestOptions: RequestOptions): Plan =
        fetch(externalPlanId, PlanExternalPlanIdFetchParams.none(), requestOptions)

    /**
     * A view of [ExternalPlanIdService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ExternalPlanIdService.WithRawResponse

        /**
         * Returns a raw HTTP response for `put /plans/external_plan_id/{external_plan_id}`, but is
         * otherwise the same as [ExternalPlanIdService.update].
         */
        @MustBeClosed
        fun update(
            otherExternalPlanId: String,
            params: PlanExternalPlanIdUpdateParams = PlanExternalPlanIdUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Plan> =
            update(
                params.toBuilder().otherExternalPlanId(otherExternalPlanId).build(),
                requestOptions,
            )

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: PlanExternalPlanIdUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Plan>

        /** @see [update] */
        @MustBeClosed
        fun update(
            otherExternalPlanId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Plan> =
            update(otherExternalPlanId, PlanExternalPlanIdUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /plans/external_plan_id/{external_plan_id}`, but is
         * otherwise the same as [ExternalPlanIdService.fetch].
         */
        @MustBeClosed
        fun fetch(
            externalPlanId: String,
            params: PlanExternalPlanIdFetchParams = PlanExternalPlanIdFetchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Plan> =
            fetch(params.toBuilder().externalPlanId(externalPlanId).build(), requestOptions)

        /** @see [fetch] */
        @MustBeClosed
        fun fetch(
            params: PlanExternalPlanIdFetchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Plan>

        /** @see [fetch] */
        @MustBeClosed
        fun fetch(externalPlanId: String, requestOptions: RequestOptions): HttpResponseFor<Plan> =
            fetch(externalPlanId, PlanExternalPlanIdFetchParams.none(), requestOptions)
    }
}
