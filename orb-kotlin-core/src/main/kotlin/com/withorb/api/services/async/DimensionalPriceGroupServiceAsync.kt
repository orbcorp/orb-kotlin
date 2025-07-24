// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.DimensionalPriceGroup
import com.withorb.api.models.DimensionalPriceGroupCreateParams
import com.withorb.api.models.DimensionalPriceGroupListPageAsync
import com.withorb.api.models.DimensionalPriceGroupListParams
import com.withorb.api.models.DimensionalPriceGroupRetrieveParams
import com.withorb.api.services.async.dimensionalPriceGroups.ExternalDimensionalPriceGroupIdServiceAsync

interface DimensionalPriceGroupServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DimensionalPriceGroupServiceAsync

    fun externalDimensionalPriceGroupId(): ExternalDimensionalPriceGroupIdServiceAsync

    /**
     * A dimensional price group is used to partition the result of a billable metric by a set of
     * dimensions. Prices in a price group must specify the parition used to derive their usage.
     *
     * For example, suppose we have a billable metric that measures the number of widgets used and
     * we want to charge differently depending on the color of the widget. We can create a price
     * group with a dimension "color" and two prices: one that charges \$10 per red widget and one
     * that charges \$20 per blue widget.
     */
    suspend fun create(
        params: DimensionalPriceGroupCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DimensionalPriceGroup

    /** Fetch dimensional price group */
    suspend fun retrieve(
        dimensionalPriceGroupId: String,
        params: DimensionalPriceGroupRetrieveParams = DimensionalPriceGroupRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DimensionalPriceGroup =
        retrieve(
            params.toBuilder().dimensionalPriceGroupId(dimensionalPriceGroupId).build(),
            requestOptions,
        )

    /** @see retrieve */
    suspend fun retrieve(
        params: DimensionalPriceGroupRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DimensionalPriceGroup

    /** @see retrieve */
    suspend fun retrieve(
        dimensionalPriceGroupId: String,
        requestOptions: RequestOptions,
    ): DimensionalPriceGroup =
        retrieve(
            dimensionalPriceGroupId,
            DimensionalPriceGroupRetrieveParams.none(),
            requestOptions,
        )

    /** List dimensional price groups */
    suspend fun list(
        params: DimensionalPriceGroupListParams = DimensionalPriceGroupListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DimensionalPriceGroupListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): DimensionalPriceGroupListPageAsync =
        list(DimensionalPriceGroupListParams.none(), requestOptions)

    /**
     * A view of [DimensionalPriceGroupServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): DimensionalPriceGroupServiceAsync.WithRawResponse

        fun externalDimensionalPriceGroupId():
            ExternalDimensionalPriceGroupIdServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /dimensional_price_groups`, but is otherwise the
         * same as [DimensionalPriceGroupServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: DimensionalPriceGroupCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DimensionalPriceGroup>

        /**
         * Returns a raw HTTP response for `get
         * /dimensional_price_groups/{dimensional_price_group_id}`, but is otherwise the same as
         * [DimensionalPriceGroupServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            dimensionalPriceGroupId: String,
            params: DimensionalPriceGroupRetrieveParams =
                DimensionalPriceGroupRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DimensionalPriceGroup> =
            retrieve(
                params.toBuilder().dimensionalPriceGroupId(dimensionalPriceGroupId).build(),
                requestOptions,
            )

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: DimensionalPriceGroupRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DimensionalPriceGroup>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            dimensionalPriceGroupId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DimensionalPriceGroup> =
            retrieve(
                dimensionalPriceGroupId,
                DimensionalPriceGroupRetrieveParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /dimensional_price_groups`, but is otherwise the
         * same as [DimensionalPriceGroupServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: DimensionalPriceGroupListParams = DimensionalPriceGroupListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DimensionalPriceGroupListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<DimensionalPriceGroupListPageAsync> =
            list(DimensionalPriceGroupListParams.none(), requestOptions)
    }
}
