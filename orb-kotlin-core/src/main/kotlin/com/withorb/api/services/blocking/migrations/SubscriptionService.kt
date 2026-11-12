// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking.migrations

import com.google.errorprone.annotations.MustBeClosed
import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.MigrationSubscriptionListPage
import com.withorb.api.models.MigrationSubscriptionListParams

/**
 * The [Plan](/core-concepts#plan-and-price) resource represents a plan that can be subscribed to by
 * a customer. Plans define the billing behavior of the subscription. You can see more about how to
 * configure prices in the [Price resource](/reference/price).
 */
interface SubscriptionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): SubscriptionService

    /**
     * This endpoint returns the subscriptions a migration applies to, with the status of each one.
     * A subscription that could not be migrated has the status `failed` and a `failure_reason`.
     *
     * The list is empty until the migration has finished selecting its subscriptions. Once a
     * migration is canceled, only the subscriptions it processed before the cancellation are
     * returned.
     */
    fun list(
        migrationId: String,
        params: MigrationSubscriptionListParams = MigrationSubscriptionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MigrationSubscriptionListPage =
        list(params.toBuilder().migrationId(migrationId).build(), requestOptions)

    /** @see list */
    fun list(
        params: MigrationSubscriptionListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MigrationSubscriptionListPage

    /** @see list */
    fun list(migrationId: String, requestOptions: RequestOptions): MigrationSubscriptionListPage =
        list(migrationId, MigrationSubscriptionListParams.none(), requestOptions)

    /**
     * A view of [SubscriptionService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): SubscriptionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /migrations/{migration_id}/subscriptions`, but is
         * otherwise the same as [SubscriptionService.list].
         */
        @MustBeClosed
        fun list(
            migrationId: String,
            params: MigrationSubscriptionListParams = MigrationSubscriptionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MigrationSubscriptionListPage> =
            list(params.toBuilder().migrationId(migrationId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            params: MigrationSubscriptionListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MigrationSubscriptionListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            migrationId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MigrationSubscriptionListPage> =
            list(migrationId, MigrationSubscriptionListParams.none(), requestOptions)
    }
}
