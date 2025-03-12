// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking.dimensionalPriceGroups

import com.google.errorprone.annotations.MustBeClosed
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.DimensionalPriceGroup
import com.withorb.api.models.DimensionalPriceGroupExternalDimensionalPriceGroupIdRetrieveParams

interface ExternalDimensionalPriceGroupIdService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Fetch dimensional price group by external ID */
    fun retrieve(params: DimensionalPriceGroupExternalDimensionalPriceGroupIdRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): DimensionalPriceGroup

    /**
     * A view of [ExternalDimensionalPriceGroupIdService] that provides access to raw
     * HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for
         * `get /dimensional_price_groups/external_dimensional_price_group_id/{external_dimensional_price_group_id}`,
         * but is otherwise the same as [ExternalDimensionalPriceGroupIdService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: DimensionalPriceGroupExternalDimensionalPriceGroupIdRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<DimensionalPriceGroup>
    }
}
