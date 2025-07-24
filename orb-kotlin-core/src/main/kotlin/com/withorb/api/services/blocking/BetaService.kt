// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.BetaCreatePlanVersionParams
import com.withorb.api.models.BetaFetchPlanVersionParams
import com.withorb.api.models.BetaSetDefaultPlanVersionParams
import com.withorb.api.models.Plan
import com.withorb.api.models.PlanVersion
import com.withorb.api.services.blocking.beta.ExternalPlanIdService

interface BetaService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): BetaService

    fun externalPlanId(): ExternalPlanIdService

    /**
     * This API endpoint is in beta and its interface may change. It is recommended for use only in
     * test mode.
     *
     * This endpoint allows the creation of a new plan version for an existing plan.
     */
    fun createPlanVersion(
        planId: String,
        params: BetaCreatePlanVersionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanVersion = createPlanVersion(params.toBuilder().planId(planId).build(), requestOptions)

    /** @see createPlanVersion */
    fun createPlanVersion(
        params: BetaCreatePlanVersionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanVersion

    /**
     * This API endpoint is in beta and its interface may change. It is recommended for use only in
     * test mode.
     *
     * This endpoint is used to fetch a plan version. It returns the phases, prices, and adjustments
     * present on this version of the plan.
     */
    fun fetchPlanVersion(
        version: String,
        params: BetaFetchPlanVersionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanVersion = fetchPlanVersion(params.toBuilder().version(version).build(), requestOptions)

    /** @see fetchPlanVersion */
    fun fetchPlanVersion(
        params: BetaFetchPlanVersionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanVersion

    /**
     * This API endpoint is in beta and its interface may change. It is recommended for use only in
     * test mode.
     *
     * This endpoint allows setting the default version of a plan.
     */
    fun setDefaultPlanVersion(
        planId: String,
        params: BetaSetDefaultPlanVersionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Plan = setDefaultPlanVersion(params.toBuilder().planId(planId).build(), requestOptions)

    /** @see setDefaultPlanVersion */
    fun setDefaultPlanVersion(
        params: BetaSetDefaultPlanVersionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Plan

    /** A view of [BetaService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): BetaService.WithRawResponse

        fun externalPlanId(): ExternalPlanIdService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /plans/{plan_id}/versions`, but is otherwise the
         * same as [BetaService.createPlanVersion].
         */
        @MustBeClosed
        fun createPlanVersion(
            planId: String,
            params: BetaCreatePlanVersionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanVersion> =
            createPlanVersion(params.toBuilder().planId(planId).build(), requestOptions)

        /** @see createPlanVersion */
        @MustBeClosed
        fun createPlanVersion(
            params: BetaCreatePlanVersionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanVersion>

        /**
         * Returns a raw HTTP response for `get /plans/{plan_id}/versions/{version}`, but is
         * otherwise the same as [BetaService.fetchPlanVersion].
         */
        @MustBeClosed
        fun fetchPlanVersion(
            version: String,
            params: BetaFetchPlanVersionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanVersion> =
            fetchPlanVersion(params.toBuilder().version(version).build(), requestOptions)

        /** @see fetchPlanVersion */
        @MustBeClosed
        fun fetchPlanVersion(
            params: BetaFetchPlanVersionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanVersion>

        /**
         * Returns a raw HTTP response for `post /plans/{plan_id}/set_default_version`, but is
         * otherwise the same as [BetaService.setDefaultPlanVersion].
         */
        @MustBeClosed
        fun setDefaultPlanVersion(
            planId: String,
            params: BetaSetDefaultPlanVersionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Plan> =
            setDefaultPlanVersion(params.toBuilder().planId(planId).build(), requestOptions)

        /** @see setDefaultPlanVersion */
        @MustBeClosed
        fun setDefaultPlanVersion(
            params: BetaSetDefaultPlanVersionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Plan>
    }
}
