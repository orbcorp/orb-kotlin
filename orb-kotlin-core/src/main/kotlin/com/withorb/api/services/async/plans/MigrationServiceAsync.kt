// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.plans

import com.google.errorprone.annotations.MustBeClosed
import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.PlanMigrationCancelParams
import com.withorb.api.models.PlanMigrationCancelResponse
import com.withorb.api.models.PlanMigrationListPageAsync
import com.withorb.api.models.PlanMigrationListParams
import com.withorb.api.models.PlanMigrationRetrieveParams
import com.withorb.api.models.PlanMigrationRetrieveResponse

interface MigrationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): MigrationServiceAsync

    /** Fetch migration */
    suspend fun retrieve(
        migrationId: String,
        params: PlanMigrationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanMigrationRetrieveResponse =
        retrieve(params.toBuilder().migrationId(migrationId).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: PlanMigrationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanMigrationRetrieveResponse

    /**
     * This endpoint returns a list of all migrations for a plan. The list of migrations is ordered
     * starting from the most recently created migration. The response also includes
     * pagination_metadata, which lets the caller retrieve the next page of results if they exist.
     */
    suspend fun list(
        planId: String,
        params: PlanMigrationListParams = PlanMigrationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanMigrationListPageAsync = list(params.toBuilder().planId(planId).build(), requestOptions)

    /** @see list */
    suspend fun list(
        params: PlanMigrationListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanMigrationListPageAsync

    /** @see list */
    suspend fun list(planId: String, requestOptions: RequestOptions): PlanMigrationListPageAsync =
        list(planId, PlanMigrationListParams.none(), requestOptions)

    /** This endpoint cancels a migration. */
    suspend fun cancel(
        migrationId: String,
        params: PlanMigrationCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanMigrationCancelResponse =
        cancel(params.toBuilder().migrationId(migrationId).build(), requestOptions)

    /** @see cancel */
    suspend fun cancel(
        params: PlanMigrationCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanMigrationCancelResponse

    /**
     * A view of [MigrationServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): MigrationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /plans/{plan_id}/migrations/{migration_id}`, but is
         * otherwise the same as [MigrationServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            migrationId: String,
            params: PlanMigrationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanMigrationRetrieveResponse> =
            retrieve(params.toBuilder().migrationId(migrationId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: PlanMigrationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanMigrationRetrieveResponse>

        /**
         * Returns a raw HTTP response for `get /plans/{plan_id}/migrations`, but is otherwise the
         * same as [MigrationServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            planId: String,
            params: PlanMigrationListParams = PlanMigrationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanMigrationListPageAsync> =
            list(params.toBuilder().planId(planId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        suspend fun list(
            params: PlanMigrationListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanMigrationListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            planId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlanMigrationListPageAsync> =
            list(planId, PlanMigrationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /plans/{plan_id}/migrations/{migration_id}/cancel`,
         * but is otherwise the same as [MigrationServiceAsync.cancel].
         */
        @MustBeClosed
        suspend fun cancel(
            migrationId: String,
            params: PlanMigrationCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanMigrationCancelResponse> =
            cancel(params.toBuilder().migrationId(migrationId).build(), requestOptions)

        /** @see cancel */
        @MustBeClosed
        suspend fun cancel(
            params: PlanMigrationCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanMigrationCancelResponse>
    }
}
