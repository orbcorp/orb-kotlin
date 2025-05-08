// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.dimensionalPriceGroups

import com.google.errorprone.annotations.MustBeClosed
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.DimensionalPriceGroup
import com.withorb.api.models.DimensionalPriceGroupExternalDimensionalPriceGroupIdRetrieveParams

interface ExternalDimensionalPriceGroupIdServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Fetch dimensional price group by external ID */
    suspend fun retrieve(
        externalDimensionalPriceGroupId: String,
        params: DimensionalPriceGroupExternalDimensionalPriceGroupIdRetrieveParams =
            DimensionalPriceGroupExternalDimensionalPriceGroupIdRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DimensionalPriceGroup =
        retrieve(
            params
                .toBuilder()
                .externalDimensionalPriceGroupId(externalDimensionalPriceGroupId)
                .build(),
            requestOptions,
        )

    /** @see [retrieve] */
    suspend fun retrieve(
        params: DimensionalPriceGroupExternalDimensionalPriceGroupIdRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DimensionalPriceGroup

    /** @see [retrieve] */
    suspend fun retrieve(
        externalDimensionalPriceGroupId: String,
        requestOptions: RequestOptions,
    ): DimensionalPriceGroup =
        retrieve(
            externalDimensionalPriceGroupId,
            DimensionalPriceGroupExternalDimensionalPriceGroupIdRetrieveParams.none(),
            requestOptions,
        )

    /**
     * A view of [ExternalDimensionalPriceGroupIdServiceAsync] that provides access to raw HTTP
     * responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get
         * /dimensional_price_groups/external_dimensional_price_group_id/{external_dimensional_price_group_id}`,
         * but is otherwise the same as [ExternalDimensionalPriceGroupIdServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            externalDimensionalPriceGroupId: String,
            params: DimensionalPriceGroupExternalDimensionalPriceGroupIdRetrieveParams =
                DimensionalPriceGroupExternalDimensionalPriceGroupIdRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DimensionalPriceGroup> =
            retrieve(
                params
                    .toBuilder()
                    .externalDimensionalPriceGroupId(externalDimensionalPriceGroupId)
                    .build(),
                requestOptions,
            )

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            params: DimensionalPriceGroupExternalDimensionalPriceGroupIdRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DimensionalPriceGroup>

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            externalDimensionalPriceGroupId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DimensionalPriceGroup> =
            retrieve(
                externalDimensionalPriceGroupId,
                DimensionalPriceGroupExternalDimensionalPriceGroupIdRetrieveParams.none(),
                requestOptions,
            )
    }
}
