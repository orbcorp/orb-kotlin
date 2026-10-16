// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking.dimensionalPriceGroups

import com.google.errorprone.annotations.MustBeClosed
import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.DimensionalPriceGroupPriceCreateParams
import com.withorb.api.models.DimensionalPriceGroupPriceCreateResponse
import com.withorb.api.models.DimensionalPriceGroupPriceListPage
import com.withorb.api.models.DimensionalPriceGroupPriceListParams

interface PriceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PriceService

    /**
     * Create prices in a dimensional price group. Every price shares `item_id`, `cadence`,
     * `currency`, and `model_type`. Tiered prices also share tier boundaries; each row supplies its
     * own amounts. The request is one transaction.
     */
    fun create(
        dimensionalPriceGroupId: String,
        params: DimensionalPriceGroupPriceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DimensionalPriceGroupPriceCreateResponse =
        create(
            params.toBuilder().dimensionalPriceGroupId(dimensionalPriceGroupId).build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        params: DimensionalPriceGroupPriceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DimensionalPriceGroupPriceCreateResponse

    /**
     * This endpoint returns the prices in a dimensional price group. Subscription overrides are
     * omitted. Archived prices are omitted unless `status` is `archived` or `all`.
     */
    fun list(
        dimensionalPriceGroupId: String,
        params: DimensionalPriceGroupPriceListParams = DimensionalPriceGroupPriceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DimensionalPriceGroupPriceListPage =
        list(
            params.toBuilder().dimensionalPriceGroupId(dimensionalPriceGroupId).build(),
            requestOptions,
        )

    /** @see list */
    fun list(
        params: DimensionalPriceGroupPriceListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DimensionalPriceGroupPriceListPage

    /** @see list */
    fun list(
        dimensionalPriceGroupId: String,
        requestOptions: RequestOptions,
    ): DimensionalPriceGroupPriceListPage =
        list(dimensionalPriceGroupId, DimensionalPriceGroupPriceListParams.none(), requestOptions)

    /** A view of [PriceService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PriceService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /dimensional_price_groups/{dimensional_price_group_id}/prices`, but is otherwise the same
         * as [PriceService.create].
         */
        @MustBeClosed
        fun create(
            dimensionalPriceGroupId: String,
            params: DimensionalPriceGroupPriceCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DimensionalPriceGroupPriceCreateResponse> =
            create(
                params.toBuilder().dimensionalPriceGroupId(dimensionalPriceGroupId).build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            params: DimensionalPriceGroupPriceCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DimensionalPriceGroupPriceCreateResponse>

        /**
         * Returns a raw HTTP response for `get
         * /dimensional_price_groups/{dimensional_price_group_id}/prices`, but is otherwise the same
         * as [PriceService.list].
         */
        @MustBeClosed
        fun list(
            dimensionalPriceGroupId: String,
            params: DimensionalPriceGroupPriceListParams =
                DimensionalPriceGroupPriceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DimensionalPriceGroupPriceListPage> =
            list(
                params.toBuilder().dimensionalPriceGroupId(dimensionalPriceGroupId).build(),
                requestOptions,
            )

        /** @see list */
        @MustBeClosed
        fun list(
            params: DimensionalPriceGroupPriceListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DimensionalPriceGroupPriceListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            dimensionalPriceGroupId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DimensionalPriceGroupPriceListPage> =
            list(
                dimensionalPriceGroupId,
                DimensionalPriceGroupPriceListParams.none(),
                requestOptions,
            )
    }
}
