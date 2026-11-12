// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.MigrationCancelParams
import com.withorb.api.models.MigrationCancelResponse
import com.withorb.api.models.MigrationCreateParams
import com.withorb.api.models.MigrationCreateResponse
import com.withorb.api.models.MigrationListPageAsync
import com.withorb.api.models.MigrationListParams
import com.withorb.api.models.MigrationRetrieveParams
import com.withorb.api.models.MigrationRetrieveResponse
import com.withorb.api.services.async.migrations.SubscriptionServiceAsync

/**
 * The [Plan](/core-concepts#plan-and-price) resource represents a plan that can be subscribed to by
 * a customer. Plans define the billing behavior of the subscription. You can see more about how to
 * configure prices in the [Price resource](/reference/price).
 */
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

    /**
     * The [Plan](/core-concepts#plan-and-price) resource represents a plan that can be subscribed
     * to by a customer. Plans define the billing behavior of the subscription. You can see more
     * about how to configure prices in the [Price resource](/reference/price).
     */
    fun subscriptions(): SubscriptionServiceAsync

    /**
     * This endpoint creates a migration of a plan's subscriptions to one of its versions. With
     * `included_subscription_ids` it migrates exactly those subscriptions; otherwise it migrates
     * the plan's subscriptions that match the filters. Each subscription is migrated
     * asynchronously; fetch the migration to follow its status.
     */
    suspend fun create(
        params: MigrationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MigrationCreateResponse

    /** This endpoint returns a migration identified by its ID. */
    suspend fun retrieve(
        migrationId: String,
        params: MigrationRetrieveParams = MigrationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MigrationRetrieveResponse =
        retrieve(params.toBuilder().migrationId(migrationId).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: MigrationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MigrationRetrieveResponse

    /** @see retrieve */
    suspend fun retrieve(
        migrationId: String,
        requestOptions: RequestOptions,
    ): MigrationRetrieveResponse =
        retrieve(migrationId, MigrationRetrieveParams.none(), requestOptions)

    /**
     * This endpoint returns a list of migrations across all plans in the account, optionally
     * filtered by plan (`plan_id` or `external_plan_id`). The list of migrations is ordered
     * starting from the most recently created migration. The response also includes
     * pagination_metadata, which lets the caller retrieve the next page of results if they exist.
     */
    suspend fun list(
        params: MigrationListParams = MigrationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MigrationListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): MigrationListPageAsync =
        list(MigrationListParams.none(), requestOptions)

    /** This endpoint cancels a migration identified by its ID. */
    suspend fun cancel(
        migrationId: String,
        params: MigrationCancelParams = MigrationCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MigrationCancelResponse =
        cancel(params.toBuilder().migrationId(migrationId).build(), requestOptions)

    /** @see cancel */
    suspend fun cancel(
        params: MigrationCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MigrationCancelResponse

    /** @see cancel */
    suspend fun cancel(
        migrationId: String,
        requestOptions: RequestOptions,
    ): MigrationCancelResponse = cancel(migrationId, MigrationCancelParams.none(), requestOptions)

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
         * The [Plan](/core-concepts#plan-and-price) resource represents a plan that can be
         * subscribed to by a customer. Plans define the billing behavior of the subscription. You
         * can see more about how to configure prices in the [Price resource](/reference/price).
         */
        fun subscriptions(): SubscriptionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /migrations`, but is otherwise the same as
         * [MigrationServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: MigrationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MigrationCreateResponse>

        /**
         * Returns a raw HTTP response for `get /migrations/{migration_id}`, but is otherwise the
         * same as [MigrationServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            migrationId: String,
            params: MigrationRetrieveParams = MigrationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MigrationRetrieveResponse> =
            retrieve(params.toBuilder().migrationId(migrationId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: MigrationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MigrationRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            migrationId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MigrationRetrieveResponse> =
            retrieve(migrationId, MigrationRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /migrations`, but is otherwise the same as
         * [MigrationServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: MigrationListParams = MigrationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MigrationListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<MigrationListPageAsync> =
            list(MigrationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /migrations/{migration_id}/cancel`, but is
         * otherwise the same as [MigrationServiceAsync.cancel].
         */
        @MustBeClosed
        suspend fun cancel(
            migrationId: String,
            params: MigrationCancelParams = MigrationCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MigrationCancelResponse> =
            cancel(params.toBuilder().migrationId(migrationId).build(), requestOptions)

        /** @see cancel */
        @MustBeClosed
        suspend fun cancel(
            params: MigrationCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MigrationCancelResponse>

        /** @see cancel */
        @MustBeClosed
        suspend fun cancel(
            migrationId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MigrationCancelResponse> =
            cancel(migrationId, MigrationCancelParams.none(), requestOptions)
    }
}
