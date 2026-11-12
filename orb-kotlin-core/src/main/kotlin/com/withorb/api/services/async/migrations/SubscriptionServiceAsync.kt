// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.migrations

import com.google.errorprone.annotations.MustBeClosed
import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.MigrationSubscriptionListPageAsync
import com.withorb.api.models.MigrationSubscriptionListParams

/**
 * A migration moves a plan's subscriptions onto one of the plan's versions. Each subscription is
 * migrated asynchronously, either immediately or at a scheduled time, and the migration reports its
 * overall status as it progresses.
 */
interface SubscriptionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): SubscriptionServiceAsync

    /**
     * This endpoint returns the subscriptions a migration applies to, with the status of each one.
     * A subscription that could not be migrated has the status `failed` and a `failure_reason`.
     *
     * The list is empty until the migration has finished selecting its subscriptions. Once a
     * migration is canceled, only the subscriptions it processed before the cancellation are
     * returned.
     */
    suspend fun list(
        migrationId: String,
        params: MigrationSubscriptionListParams = MigrationSubscriptionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MigrationSubscriptionListPageAsync =
        list(params.toBuilder().migrationId(migrationId).build(), requestOptions)

    /** @see list */
    suspend fun list(
        params: MigrationSubscriptionListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MigrationSubscriptionListPageAsync

    /** @see list */
    suspend fun list(
        migrationId: String,
        requestOptions: RequestOptions,
    ): MigrationSubscriptionListPageAsync =
        list(migrationId, MigrationSubscriptionListParams.none(), requestOptions)

    /**
     * A view of [SubscriptionServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): SubscriptionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /migrations/{migration_id}/subscriptions`, but is
         * otherwise the same as [SubscriptionServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            migrationId: String,
            params: MigrationSubscriptionListParams = MigrationSubscriptionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MigrationSubscriptionListPageAsync> =
            list(params.toBuilder().migrationId(migrationId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        suspend fun list(
            params: MigrationSubscriptionListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MigrationSubscriptionListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            migrationId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MigrationSubscriptionListPageAsync> =
            list(migrationId, MigrationSubscriptionListParams.none(), requestOptions)
    }
}
