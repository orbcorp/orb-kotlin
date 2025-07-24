// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.Price
import com.withorb.api.models.PriceCreateParams
import com.withorb.api.models.PriceEvaluateMultipleParams
import com.withorb.api.models.PriceEvaluateMultipleResponse
import com.withorb.api.models.PriceEvaluateParams
import com.withorb.api.models.PriceEvaluatePreviewEventsParams
import com.withorb.api.models.PriceEvaluatePreviewEventsResponse
import com.withorb.api.models.PriceEvaluateResponse
import com.withorb.api.models.PriceFetchParams
import com.withorb.api.models.PriceListPage
import com.withorb.api.models.PriceListParams
import com.withorb.api.models.PriceUpdateParams
import com.withorb.api.services.blocking.prices.ExternalPriceIdService

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

    fun externalPriceId(): ExternalPriceIdService

    /**
     * This endpoint is used to create a [price](/product-catalog/price-configuration). A price
     * created using this endpoint is always an add-on, meaning that it's not associated with a
     * specific plan and can instead be individually added to subscriptions, including subscriptions
     * on different plans.
     *
     * An `external_price_id` can be optionally specified as an alias to allow ergonomic interaction
     * with prices in the Orb API.
     *
     * See the [Price resource](/product-catalog/price-configuration) for the specification of
     * different price model configurations possible in this endpoint.
     */
    fun create(
        params: PriceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Price

    /**
     * This endpoint allows you to update the `metadata` property on a price. If you pass null for
     * the metadata value, it will clear any existing metadata for that price.
     */
    fun update(
        priceId: String,
        params: PriceUpdateParams = PriceUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Price = update(params.toBuilder().priceId(priceId).build(), requestOptions)

    /** @see update */
    fun update(
        params: PriceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Price

    /** @see update */
    fun update(priceId: String, requestOptions: RequestOptions): Price =
        update(priceId, PriceUpdateParams.none(), requestOptions)

    /**
     * This endpoint is used to list all add-on prices created using the
     * [price creation endpoint](/api-reference/price/create-price).
     */
    fun list(
        params: PriceListParams = PriceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PriceListPage

    /** @see list */
    fun list(requestOptions: RequestOptions): PriceListPage =
        list(PriceListParams.none(), requestOptions)

    /**
     * [NOTE] It is recommended to use the `/v1/prices/evaluate` which offers further functionality,
     * such as multiple prices, inline price definitions, and querying over preview events.
     *
     * This endpoint is used to evaluate the output of a price for a given customer and time range.
     * It enables filtering and grouping the output using
     * [computed properties](/extensibility/advanced-metrics#computed-properties), supporting the
     * following workflows:
     * 1. Showing detailed usage and costs to the end customer.
     * 2. Auditing subtotals on invoice line items.
     *
     * For these workflows, the expressiveness of computed properties in both the filters and
     * grouping is critical. For example, if you'd like to show your customer their usage grouped by
     * hour and another property, you can do so with the following `grouping_keys`:
     * `["hour_floor_timestamp_millis(timestamp_millis)", "my_property"]`. If you'd like to examine
     * a customer's usage for a specific property value, you can do so with the following `filter`:
     * `my_property = 'foo' AND my_other_property = 'bar'`.
     *
     * By default, the start of the time range must be no more than 100 days ago and the length of
     * the results must be no greater than 1000. Note that this is a POST endpoint rather than a GET
     * endpoint because it employs a JSON body rather than query parameters.
     */
    fun evaluate(
        priceId: String,
        params: PriceEvaluateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PriceEvaluateResponse = evaluate(params.toBuilder().priceId(priceId).build(), requestOptions)

    /** @see evaluate */
    fun evaluate(
        params: PriceEvaluateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PriceEvaluateResponse

    /**
     * This endpoint is used to evaluate the output of price(s) for a given customer and time range
     * over ingested events. It enables filtering and grouping the output using
     * [computed properties](/extensibility/advanced-metrics#computed-properties), supporting the
     * following workflows:
     * 1. Showing detailed usage and costs to the end customer.
     * 2. Auditing subtotals on invoice line items.
     *
     * For these workflows, the expressiveness of computed properties in both the filters and
     * grouping is critical. For example, if you'd like to show your customer their usage grouped by
     * hour and another property, you can do so with the following `grouping_keys`:
     * `["hour_floor_timestamp_millis(timestamp_millis)", "my_property"]`. If you'd like to examine
     * a customer's usage for a specific property value, you can do so with the following `filter`:
     * `my_property = 'foo' AND my_other_property = 'bar'`.
     *
     * Prices may either reference existing prices in your Orb account or be defined inline in the
     * request body. Up to 100 prices can be evaluated in a single request.
     *
     * Prices are evaluated on ingested events and the start of the time range must be no more than
     * 100 days ago. To evaluate based off a set of provided events, the
     * [evaluate preview events](/api-reference/price/evaluate-preview-events) endpoint can be used
     * instead.
     *
     * Note that this is a POST endpoint rather than a GET endpoint because it employs a JSON body
     * rather than query parameters.
     */
    fun evaluateMultiple(
        params: PriceEvaluateMultipleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PriceEvaluateMultipleResponse

    /**
     * This endpoint evaluates prices on preview events instead of actual usage, making it ideal for
     * building price calculators and cost estimation tools. You can filter and group results using
     * [computed properties](/extensibility/advanced-metrics#computed-properties) to analyze pricing
     * across different dimensions.
     *
     * Prices may either reference existing prices in your Orb account or be defined inline in the
     * request body. The endpoint has the following limitations:
     * 1. Up to 100 prices can be evaluated in a single request.
     * 2. Up to 500 preview events can be provided in a single request.
     *
     * A top-level customer_id is required to evaluate the preview events. Additionally, all events
     * without a customer_id will have the top-level customer_id added.
     *
     * Note that this is a POST endpoint rather than a GET endpoint because it employs a JSON body
     * rather than query parameters.
     */
    fun evaluatePreviewEvents(
        params: PriceEvaluatePreviewEventsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PriceEvaluatePreviewEventsResponse

    /** This endpoint returns a price given an identifier. */
    fun fetch(
        priceId: String,
        params: PriceFetchParams = PriceFetchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Price = fetch(params.toBuilder().priceId(priceId).build(), requestOptions)

    /** @see fetch */
    fun fetch(
        params: PriceFetchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Price

    /** @see fetch */
    fun fetch(priceId: String, requestOptions: RequestOptions): Price =
        fetch(priceId, PriceFetchParams.none(), requestOptions)

    /** A view of [PriceService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PriceService.WithRawResponse

        fun externalPriceId(): ExternalPriceIdService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /prices`, but is otherwise the same as
         * [PriceService.create].
         */
        @MustBeClosed
        fun create(
            params: PriceCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Price>

        /**
         * Returns a raw HTTP response for `put /prices/{price_id}`, but is otherwise the same as
         * [PriceService.update].
         */
        @MustBeClosed
        fun update(
            priceId: String,
            params: PriceUpdateParams = PriceUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Price> =
            update(params.toBuilder().priceId(priceId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: PriceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Price>

        /** @see update */
        @MustBeClosed
        fun update(priceId: String, requestOptions: RequestOptions): HttpResponseFor<Price> =
            update(priceId, PriceUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /prices`, but is otherwise the same as
         * [PriceService.list].
         */
        @MustBeClosed
        fun list(
            params: PriceListParams = PriceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PriceListPage>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<PriceListPage> =
            list(PriceListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /prices/{price_id}/evaluate`, but is otherwise the
         * same as [PriceService.evaluate].
         */
        @MustBeClosed
        fun evaluate(
            priceId: String,
            params: PriceEvaluateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PriceEvaluateResponse> =
            evaluate(params.toBuilder().priceId(priceId).build(), requestOptions)

        /** @see evaluate */
        @MustBeClosed
        fun evaluate(
            params: PriceEvaluateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PriceEvaluateResponse>

        /**
         * Returns a raw HTTP response for `post /prices/evaluate`, but is otherwise the same as
         * [PriceService.evaluateMultiple].
         */
        @MustBeClosed
        fun evaluateMultiple(
            params: PriceEvaluateMultipleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PriceEvaluateMultipleResponse>

        /**
         * Returns a raw HTTP response for `post /prices/evaluate_preview_events`, but is otherwise
         * the same as [PriceService.evaluatePreviewEvents].
         */
        @MustBeClosed
        fun evaluatePreviewEvents(
            params: PriceEvaluatePreviewEventsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PriceEvaluatePreviewEventsResponse>

        /**
         * Returns a raw HTTP response for `get /prices/{price_id}`, but is otherwise the same as
         * [PriceService.fetch].
         */
        @MustBeClosed
        fun fetch(
            priceId: String,
            params: PriceFetchParams = PriceFetchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Price> =
            fetch(params.toBuilder().priceId(priceId).build(), requestOptions)

        /** @see fetch */
        @MustBeClosed
        fun fetch(
            params: PriceFetchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Price>

        /** @see fetch */
        @MustBeClosed
        fun fetch(priceId: String, requestOptions: RequestOptions): HttpResponseFor<Price> =
            fetch(priceId, PriceFetchParams.none(), requestOptions)
    }
}
