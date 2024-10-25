// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.prices

import com.withorb.api.core.RequestOptions
import com.withorb.api.models.Price
import com.withorb.api.models.PriceExternalPriceIdFetchParams
import com.withorb.api.models.PriceExternalPriceIdUpdateParams

interface ExternalPriceIdServiceAsync {

    /**
     * This endpoint allows you to update the `metadata` property on a price. If you pass null for
     * the metadata value, it will clear any existing metadata for that price.
     */
    suspend fun update(
        params: PriceExternalPriceIdUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Price

    /**
     * This endpoint returns a price given an external price id. See the
     * [price creation API](../reference/create-price) for more information about external price
     * aliases.
     */
    suspend fun fetch(
        params: PriceExternalPriceIdFetchParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Price
}
