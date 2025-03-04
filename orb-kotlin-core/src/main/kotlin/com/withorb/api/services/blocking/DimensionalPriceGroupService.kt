// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.DimensionalPriceGroup
import com.withorb.api.models.DimensionalPriceGroupCreateParams
import com.withorb.api.models.DimensionalPriceGroupListPage
import com.withorb.api.models.DimensionalPriceGroupListParams
import com.withorb.api.models.DimensionalPriceGroupRetrieveParams
import com.withorb.api.services.blocking.dimensionalPriceGroups.ExternalDimensionalPriceGroupIdService

interface DimensionalPriceGroupService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun externalDimensionalPriceGroupId(): ExternalDimensionalPriceGroupIdService

    /**
     * A dimensional price group is used to partition the result of a billable metric by a set of
     * dimensions. Prices in a price group must specify the parition used to derive their usage.
     *
     * For example, suppose we have a billable metric that measures the number of widgets used and
     * we want to charge differently depending on the color of the widget. We can create a price
     * group with a dimension "color" and two prices: one that charges $10 per red widget and one
     * that charges $20 per blue widget.
     */
    fun create(
        params: DimensionalPriceGroupCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DimensionalPriceGroup

    /** Fetch dimensional price group */
    fun retrieve(
        params: DimensionalPriceGroupRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DimensionalPriceGroup

    /** List dimensional price groups */
    fun list(
        params: DimensionalPriceGroupListParams = DimensionalPriceGroupListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DimensionalPriceGroupListPage

    /** List dimensional price groups */
    fun list(requestOptions: RequestOptions): DimensionalPriceGroupListPage =
        list(DimensionalPriceGroupListParams.none(), requestOptions)

    /**
     * A view of [DimensionalPriceGroupService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        fun externalDimensionalPriceGroupId():
            ExternalDimensionalPriceGroupIdService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /dimensional_price_groups`, but is otherwise the
         * same as [DimensionalPriceGroupService.create].
         */
        @MustBeClosed
        fun create(
            params: DimensionalPriceGroupCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DimensionalPriceGroup>

        /**
         * Returns a raw HTTP response for `get
         * /dimensional_price_groups/{dimensional_price_group_id}`, but is otherwise the same as
         * [DimensionalPriceGroupService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: DimensionalPriceGroupRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DimensionalPriceGroup>

        /**
         * Returns a raw HTTP response for `get /dimensional_price_groups`, but is otherwise the
         * same as [DimensionalPriceGroupService.list].
         */
        @MustBeClosed
        fun list(
            params: DimensionalPriceGroupListParams = DimensionalPriceGroupListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DimensionalPriceGroupListPage>

        /**
         * Returns a raw HTTP response for `get /dimensional_price_groups`, but is otherwise the
         * same as [DimensionalPriceGroupService.list].
         */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<DimensionalPriceGroupListPage> =
            list(DimensionalPriceGroupListParams.none(), requestOptions)
    }
}
