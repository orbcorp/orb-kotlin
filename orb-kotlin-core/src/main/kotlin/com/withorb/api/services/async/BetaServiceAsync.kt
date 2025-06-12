// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.BetaCreatePlanVersionParams
import com.withorb.api.models.BetaFetchPlanVersionParams
import com.withorb.api.models.BetaSetDefaultPlanVersionParams
import com.withorb.api.models.Plan
import com.withorb.api.models.PlanVersion
import com.withorb.api.services.async.beta.ExternalPlanIdServiceAsync

interface BetaServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): BetaServiceAsync

    fun externalPlanId(): ExternalPlanIdServiceAsync

    /**
     * This API endpoint is in beta and its interface may change. It is recommended for use only in
     * test mode.
     *
     * This endpoint allows the creation of a new plan version for an existing plan.
     */
    suspend fun createPlanVersion(
        planId: String,
        params: BetaCreatePlanVersionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanVersion = createPlanVersion(params.toBuilder().planId(planId).build(), requestOptions)

    /** @see [createPlanVersion] */
    suspend fun createPlanVersion(
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
    suspend fun fetchPlanVersion(
        version: String,
        params: BetaFetchPlanVersionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanVersion = fetchPlanVersion(params.toBuilder().version(version).build(), requestOptions)

    /** @see [fetchPlanVersion] */
    suspend fun fetchPlanVersion(
        params: BetaFetchPlanVersionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanVersion

    /**
     * This API endpoint is in beta and its interface may change. It is recommended for use only in
     * test mode.
     *
     * This endpoint allows setting the default version of a plan.
     */
    suspend fun setDefaultPlanVersion(
        planId: String,
        params: BetaSetDefaultPlanVersionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Plan = setDefaultPlanVersion(params.toBuilder().planId(planId).build(), requestOptions)

    /** @see [setDefaultPlanVersion] */
    suspend fun setDefaultPlanVersion(
        params: BetaSetDefaultPlanVersionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Plan

    /** A view of [BetaServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): BetaServiceAsync.WithRawResponse

        fun externalPlanId(): ExternalPlanIdServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /plans/{plan_id}/versions`, but is otherwise the
         * same as [BetaServiceAsync.createPlanVersion].
         */
        @MustBeClosed
        suspend fun createPlanVersion(
            planId: String,
            params: BetaCreatePlanVersionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanVersion> =
            createPlanVersion(params.toBuilder().planId(planId).build(), requestOptions)

        /** @see [createPlanVersion] */
        @MustBeClosed
        suspend fun createPlanVersion(
            params: BetaCreatePlanVersionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanVersion>

        /**
         * Returns a raw HTTP response for `get /plans/{plan_id}/versions/{version}`, but is
         * otherwise the same as [BetaServiceAsync.fetchPlanVersion].
         */
        @MustBeClosed
        suspend fun fetchPlanVersion(
            version: String,
            params: BetaFetchPlanVersionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanVersion> =
            fetchPlanVersion(params.toBuilder().version(version).build(), requestOptions)

        /** @see [fetchPlanVersion] */
        @MustBeClosed
        suspend fun fetchPlanVersion(
            params: BetaFetchPlanVersionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanVersion>

        /**
         * Returns a raw HTTP response for `post /plans/{plan_id}/set_default_version`, but is
         * otherwise the same as [BetaServiceAsync.setDefaultPlanVersion].
         */
        @MustBeClosed
        suspend fun setDefaultPlanVersion(
            planId: String,
            params: BetaSetDefaultPlanVersionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Plan> =
            setDefaultPlanVersion(params.toBuilder().planId(planId).build(), requestOptions)

        /** @see [setDefaultPlanVersion] */
        @MustBeClosed
        suspend fun setDefaultPlanVersion(
            params: BetaSetDefaultPlanVersionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Plan>
    }
}
