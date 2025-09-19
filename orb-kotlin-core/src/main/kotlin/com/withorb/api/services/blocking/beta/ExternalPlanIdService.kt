// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking.beta

import com.google.errorprone.annotations.MustBeClosed
import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.BetaExternalPlanIdCreatePlanVersionParams
import com.withorb.api.models.BetaExternalPlanIdFetchPlanVersionParams
import com.withorb.api.models.BetaExternalPlanIdSetDefaultPlanVersionParams
import com.withorb.api.models.Plan
import com.withorb.api.models.PlanVersion

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

    /** This endpoint allows the creation of a new plan version for an existing plan. */
    fun createPlanVersion(
        externalPlanId: String,
        params: BetaExternalPlanIdCreatePlanVersionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanVersion =
        createPlanVersion(params.toBuilder().externalPlanId(externalPlanId).build(), requestOptions)

    /** @see createPlanVersion */
    fun createPlanVersion(
        params: BetaExternalPlanIdCreatePlanVersionParams,
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
        params: BetaExternalPlanIdFetchPlanVersionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanVersion = fetchPlanVersion(params.toBuilder().version(version).build(), requestOptions)

    /** @see fetchPlanVersion */
    fun fetchPlanVersion(
        params: BetaExternalPlanIdFetchPlanVersionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanVersion

    /**
     * This API endpoint is in beta and its interface may change. It is recommended for use only in
     * test mode.
     *
     * This endpoint allows setting the default version of a plan.
     */
    fun setDefaultPlanVersion(
        externalPlanId: String,
        params: BetaExternalPlanIdSetDefaultPlanVersionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Plan =
        setDefaultPlanVersion(
            params.toBuilder().externalPlanId(externalPlanId).build(),
            requestOptions,
        )

    /** @see setDefaultPlanVersion */
    fun setDefaultPlanVersion(
        params: BetaExternalPlanIdSetDefaultPlanVersionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Plan

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
         * Returns a raw HTTP response for `post
         * /plans/external_plan_id/{external_plan_id}/versions`, but is otherwise the same as
         * [ExternalPlanIdService.createPlanVersion].
         */
        @MustBeClosed
        fun createPlanVersion(
            externalPlanId: String,
            params: BetaExternalPlanIdCreatePlanVersionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanVersion> =
            createPlanVersion(
                params.toBuilder().externalPlanId(externalPlanId).build(),
                requestOptions,
            )

        /** @see createPlanVersion */
        @MustBeClosed
        fun createPlanVersion(
            params: BetaExternalPlanIdCreatePlanVersionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanVersion>

        /**
         * Returns a raw HTTP response for `get
         * /plans/external_plan_id/{external_plan_id}/versions/{version}`, but is otherwise the same
         * as [ExternalPlanIdService.fetchPlanVersion].
         */
        @MustBeClosed
        fun fetchPlanVersion(
            version: String,
            params: BetaExternalPlanIdFetchPlanVersionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanVersion> =
            fetchPlanVersion(params.toBuilder().version(version).build(), requestOptions)

        /** @see fetchPlanVersion */
        @MustBeClosed
        fun fetchPlanVersion(
            params: BetaExternalPlanIdFetchPlanVersionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanVersion>

        /**
         * Returns a raw HTTP response for `post
         * /plans/external_plan_id/{external_plan_id}/set_default_version`, but is otherwise the
         * same as [ExternalPlanIdService.setDefaultPlanVersion].
         */
        @MustBeClosed
        fun setDefaultPlanVersion(
            externalPlanId: String,
            params: BetaExternalPlanIdSetDefaultPlanVersionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Plan> =
            setDefaultPlanVersion(
                params.toBuilder().externalPlanId(externalPlanId).build(),
                requestOptions,
            )

        /** @see setDefaultPlanVersion */
        @MustBeClosed
        fun setDefaultPlanVersion(
            params: BetaExternalPlanIdSetDefaultPlanVersionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Plan>
    }
}
