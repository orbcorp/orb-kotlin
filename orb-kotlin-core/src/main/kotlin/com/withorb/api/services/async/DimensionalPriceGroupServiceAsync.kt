// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.withorb.api.core.RequestOptions
import com.withorb.api.models.DimensionalPriceGroup
import com.withorb.api.models.DimensionalPriceGroupCreateParams
import com.withorb.api.models.DimensionalPriceGroupListPageAsync
import com.withorb.api.models.DimensionalPriceGroupListParams
import com.withorb.api.models.DimensionalPriceGroupRetrieveParams
import com.withorb.api.services.async.dimensionalPriceGroups.ExternalDimensionalPriceGroupIdServiceAsync

interface DimensionalPriceGroupServiceAsync {

    fun externalDimensionalPriceGroupId(): ExternalDimensionalPriceGroupIdServiceAsync

    /**
     * A dimensional price group is used to partition the result of a billable metric by a set of
     * dimensions. Prices in a price group must specify the parition used to derive their usage.
     *
     * For example, suppose we have a billable metric that measures the number of widgets used and
     * we want to charge differently depending on the color of the widget. We can create a price
     * group with a dimension "color" and two prices: one that charges $10 per red widget and one
     * that charges $20 per blue widget.
     */
    suspend fun create(
        params: DimensionalPriceGroupCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DimensionalPriceGroup

    /** Fetch dimensional price group */
    suspend fun retrieve(
        params: DimensionalPriceGroupRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DimensionalPriceGroup

    /** List dimensional price groups */
    suspend fun list(
        params: DimensionalPriceGroupListParams = DimensionalPriceGroupListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DimensionalPriceGroupListPageAsync

    /** List dimensional price groups */
    suspend fun list(requestOptions: RequestOptions): DimensionalPriceGroupListPageAsync =
        list(DimensionalPriceGroupListParams.none(), requestOptions)
}
