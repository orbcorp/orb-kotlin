// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking.prices

import com.google.errorprone.annotations.MustBeClosed
import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.Price
import com.withorb.api.models.PriceExternalPriceIdFetchParams
import com.withorb.api.models.PriceExternalPriceIdUpdateParams

interface ExternalPriceIdService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ExternalPriceIdService

    /**
     * This endpoint allows you to update the `metadata` property on a price. If you pass null for
     * the metadata value, it will clear any existing metadata for that price.
     */
    fun update(
        externalPriceId: String,
        params: PriceExternalPriceIdUpdateParams = PriceExternalPriceIdUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Price = update(params.toBuilder().externalPriceId(externalPriceId).build(), requestOptions)

    /** @see update */
    fun update(
        params: PriceExternalPriceIdUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Price

    /** @see update */
    fun update(externalPriceId: String, requestOptions: RequestOptions): Price =
        update(externalPriceId, PriceExternalPriceIdUpdateParams.none(), requestOptions)

    /**
     * This endpoint returns a price given an external price id. See the
     * [price creation API](/api-reference/price/create-price) for more information about external
     * price aliases.
     */
    fun fetch(
        externalPriceId: String,
        params: PriceExternalPriceIdFetchParams = PriceExternalPriceIdFetchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Price = fetch(params.toBuilder().externalPriceId(externalPriceId).build(), requestOptions)

    /** @see fetch */
    fun fetch(
        params: PriceExternalPriceIdFetchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Price

    /** @see fetch */
    fun fetch(externalPriceId: String, requestOptions: RequestOptions): Price =
        fetch(externalPriceId, PriceExternalPriceIdFetchParams.none(), requestOptions)

    /**
     * A view of [ExternalPriceIdService] that provides access to raw HTTP responses for each
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
        ): ExternalPriceIdService.WithRawResponse

        /**
         * Returns a raw HTTP response for `put /prices/external_price_id/{external_price_id}`, but
         * is otherwise the same as [ExternalPriceIdService.update].
         */
        @MustBeClosed
        fun update(
            externalPriceId: String,
            params: PriceExternalPriceIdUpdateParams = PriceExternalPriceIdUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Price> =
            update(params.toBuilder().externalPriceId(externalPriceId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: PriceExternalPriceIdUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Price>

        /** @see update */
        @MustBeClosed
        fun update(
            externalPriceId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Price> =
            update(externalPriceId, PriceExternalPriceIdUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /prices/external_price_id/{external_price_id}`, but
         * is otherwise the same as [ExternalPriceIdService.fetch].
         */
        @MustBeClosed
        fun fetch(
            externalPriceId: String,
            params: PriceExternalPriceIdFetchParams = PriceExternalPriceIdFetchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Price> =
            fetch(params.toBuilder().externalPriceId(externalPriceId).build(), requestOptions)

        /** @see fetch */
        @MustBeClosed
        fun fetch(
            params: PriceExternalPriceIdFetchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Price>

        /** @see fetch */
        @MustBeClosed
        fun fetch(externalPriceId: String, requestOptions: RequestOptions): HttpResponseFor<Price> =
            fetch(externalPriceId, PriceExternalPriceIdFetchParams.none(), requestOptions)
    }
}
