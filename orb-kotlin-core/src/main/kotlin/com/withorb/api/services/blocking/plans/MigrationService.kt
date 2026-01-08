// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking.plans

import com.google.errorprone.annotations.MustBeClosed
import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.PlanMigrationCancelParams
import com.withorb.api.models.PlanMigrationCancelResponse
import com.withorb.api.models.PlanMigrationListPage
import com.withorb.api.models.PlanMigrationListParams
import com.withorb.api.models.PlanMigrationRetrieveParams
import com.withorb.api.models.PlanMigrationRetrieveResponse

interface MigrationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): MigrationService

    /** Fetch migration */
    fun retrieve(
        migrationId: String,
        params: PlanMigrationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanMigrationRetrieveResponse =
        retrieve(params.toBuilder().migrationId(migrationId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: PlanMigrationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanMigrationRetrieveResponse

    /**
     * This endpoint returns a list of all migrations for a plan. The list of migrations is ordered
     * starting from the most recently created migration. The response also includes
     * pagination_metadata, which lets the caller retrieve the next page of results if they exist.
     */
    fun list(
        planId: String,
        params: PlanMigrationListParams = PlanMigrationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanMigrationListPage = list(params.toBuilder().planId(planId).build(), requestOptions)

    /** @see list */
    fun list(
        params: PlanMigrationListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanMigrationListPage

    /** @see list */
    fun list(planId: String, requestOptions: RequestOptions): PlanMigrationListPage =
        list(planId, PlanMigrationListParams.none(), requestOptions)

    /** This endpoint cancels a migration. */
    fun cancel(
        migrationId: String,
        params: PlanMigrationCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanMigrationCancelResponse =
        cancel(params.toBuilder().migrationId(migrationId).build(), requestOptions)

    /** @see cancel */
    fun cancel(
        params: PlanMigrationCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanMigrationCancelResponse

    /** A view of [MigrationService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): MigrationService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /plans/{plan_id}/migrations/{migration_id}`, but is
         * otherwise the same as [MigrationService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            migrationId: String,
            params: PlanMigrationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanMigrationRetrieveResponse> =
            retrieve(params.toBuilder().migrationId(migrationId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: PlanMigrationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanMigrationRetrieveResponse>

        /**
         * Returns a raw HTTP response for `get /plans/{plan_id}/migrations`, but is otherwise the
         * same as [MigrationService.list].
         */
        @MustBeClosed
        fun list(
            planId: String,
            params: PlanMigrationListParams = PlanMigrationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanMigrationListPage> =
            list(params.toBuilder().planId(planId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            params: PlanMigrationListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanMigrationListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            planId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlanMigrationListPage> =
            list(planId, PlanMigrationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /plans/{plan_id}/migrations/{migration_id}/cancel`,
         * but is otherwise the same as [MigrationService.cancel].
         */
        @MustBeClosed
        fun cancel(
            migrationId: String,
            params: PlanMigrationCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanMigrationCancelResponse> =
            cancel(params.toBuilder().migrationId(migrationId).build(), requestOptions)

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            params: PlanMigrationCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanMigrationCancelResponse>
    }
}
