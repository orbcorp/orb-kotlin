// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.NewFloatingBulkPrice
import com.withorb.api.models.NewFloatingBulkWithProrationPrice
import com.withorb.api.models.NewFloatingCumulativeGroupedBulkPrice
import com.withorb.api.models.NewFloatingGroupedAllocationPrice
import com.withorb.api.models.NewFloatingGroupedTieredPackagePrice
import com.withorb.api.models.NewFloatingGroupedTieredPrice
import com.withorb.api.models.NewFloatingGroupedWithMeteredMinimumPrice
import com.withorb.api.models.NewFloatingGroupedWithProratedMinimumPrice
import com.withorb.api.models.NewFloatingMatrixPrice
import com.withorb.api.models.NewFloatingMatrixWithAllocationPrice
import com.withorb.api.models.NewFloatingMatrixWithDisplayNamePrice
import com.withorb.api.models.NewFloatingMaxGroupTieredPackagePrice
import com.withorb.api.models.NewFloatingMinimumCompositePrice
import com.withorb.api.models.NewFloatingPackagePrice
import com.withorb.api.models.NewFloatingPackageWithAllocationPrice
import com.withorb.api.models.NewFloatingScalableMatrixWithTieredPricingPrice
import com.withorb.api.models.NewFloatingScalableMatrixWithUnitPricingPrice
import com.withorb.api.models.NewFloatingThresholdTotalAmountPrice
import com.withorb.api.models.NewFloatingTieredPackagePrice
import com.withorb.api.models.NewFloatingTieredPackageWithMinimumPrice
import com.withorb.api.models.NewFloatingTieredPrice
import com.withorb.api.models.NewFloatingTieredWithMinimumPrice
import com.withorb.api.models.NewFloatingTieredWithProrationPrice
import com.withorb.api.models.NewFloatingUnitPrice
import com.withorb.api.models.NewFloatingUnitWithPercentPrice
import com.withorb.api.models.NewFloatingUnitWithProrationPrice
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

/**
 * The Price resource represents a price that can be billed on a subscription, resulting in a charge
 * on an invoice in the form of an invoice line item. Prices take a quantity and determine an amount
 * to bill.
 *
 * Orb supports a few different pricing models out of the box. Each of these models is serialized
 * differently in a given Price object. The model_type field determines the key for the
 * configuration object that is present.
 *
 * For more on the types of prices, see
 * [the core concepts documentation](/core-concepts#plan-and-price)
 */
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
     * The Price resource represents a price that can be billed on a subscription, resulting in a
     * charge on an invoice in the form of an invoice line item. Prices take a quantity and
     * determine an amount to bill.
     *
     * Orb supports a few different pricing models out of the box. Each of these models is
     * serialized differently in a given Price object. The model_type field determines the key for
     * the configuration object that is present.
     *
     * For more on the types of prices, see
     * [the core concepts documentation](/core-concepts#plan-and-price)
     */
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

    /** @see create */
    fun create(
        body: PriceCreateParams.Body,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Price = create(PriceCreateParams.builder().body(body).build(), requestOptions)

    /** @see create */
    fun create(
        unit: NewFloatingUnitPrice,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Price = create(PriceCreateParams.Body.ofUnit(unit), requestOptions)

    /** @see create */
    fun create(
        tiered: NewFloatingTieredPrice,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Price = create(PriceCreateParams.Body.ofTiered(tiered), requestOptions)

    /** @see create */
    fun create(
        bulk: NewFloatingBulkPrice,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Price = create(PriceCreateParams.Body.ofBulk(bulk), requestOptions)

    /** @see create */
    fun create(
        bulkWithFilters: PriceCreateParams.Body.BulkWithFilters,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Price = create(PriceCreateParams.Body.ofBulkWithFilters(bulkWithFilters), requestOptions)

    /** @see create */
    fun create(
        package_: NewFloatingPackagePrice,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Price = create(PriceCreateParams.Body.ofPackage(package_), requestOptions)

    /** @see create */
    fun create(
        matrix: NewFloatingMatrixPrice,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Price = create(PriceCreateParams.Body.ofMatrix(matrix), requestOptions)

    /** @see create */
    fun create(
        thresholdTotalAmount: NewFloatingThresholdTotalAmountPrice,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Price =
        create(PriceCreateParams.Body.ofThresholdTotalAmount(thresholdTotalAmount), requestOptions)

    /** @see create */
    fun create(
        tieredPackage: NewFloatingTieredPackagePrice,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Price = create(PriceCreateParams.Body.ofTieredPackage(tieredPackage), requestOptions)

    /** @see create */
    fun create(
        tieredWithMinimum: NewFloatingTieredWithMinimumPrice,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Price = create(PriceCreateParams.Body.ofTieredWithMinimum(tieredWithMinimum), requestOptions)

    /** @see create */
    fun create(
        groupedTiered: NewFloatingGroupedTieredPrice,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Price = create(PriceCreateParams.Body.ofGroupedTiered(groupedTiered), requestOptions)

    /** @see create */
    fun create(
        tieredPackageWithMinimum: NewFloatingTieredPackageWithMinimumPrice,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Price =
        create(
            PriceCreateParams.Body.ofTieredPackageWithMinimum(tieredPackageWithMinimum),
            requestOptions,
        )

    /** @see create */
    fun create(
        packageWithAllocation: NewFloatingPackageWithAllocationPrice,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Price =
        create(
            PriceCreateParams.Body.ofPackageWithAllocation(packageWithAllocation),
            requestOptions,
        )

    /** @see create */
    fun create(
        unitWithPercent: NewFloatingUnitWithPercentPrice,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Price = create(PriceCreateParams.Body.ofUnitWithPercent(unitWithPercent), requestOptions)

    /** @see create */
    fun create(
        matrixWithAllocation: NewFloatingMatrixWithAllocationPrice,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Price =
        create(PriceCreateParams.Body.ofMatrixWithAllocation(matrixWithAllocation), requestOptions)

    /** @see create */
    fun create(
        tieredWithProration: NewFloatingTieredWithProrationPrice,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Price =
        create(PriceCreateParams.Body.ofTieredWithProration(tieredWithProration), requestOptions)

    /** @see create */
    fun create(
        unitWithProration: NewFloatingUnitWithProrationPrice,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Price = create(PriceCreateParams.Body.ofUnitWithProration(unitWithProration), requestOptions)

    /** @see create */
    fun create(
        groupedAllocation: NewFloatingGroupedAllocationPrice,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Price = create(PriceCreateParams.Body.ofGroupedAllocation(groupedAllocation), requestOptions)

    /** @see create */
    fun create(
        bulkWithProration: NewFloatingBulkWithProrationPrice,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Price = create(PriceCreateParams.Body.ofBulkWithProration(bulkWithProration), requestOptions)

    /** @see create */
    fun create(
        groupedWithProratedMinimum: NewFloatingGroupedWithProratedMinimumPrice,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Price =
        create(
            PriceCreateParams.Body.ofGroupedWithProratedMinimum(groupedWithProratedMinimum),
            requestOptions,
        )

    /** @see create */
    fun create(
        groupedWithMeteredMinimum: NewFloatingGroupedWithMeteredMinimumPrice,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Price =
        create(
            PriceCreateParams.Body.ofGroupedWithMeteredMinimum(groupedWithMeteredMinimum),
            requestOptions,
        )

    /** @see create */
    fun create(
        groupedWithMinMaxThresholds: PriceCreateParams.Body.GroupedWithMinMaxThresholds,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Price =
        create(
            PriceCreateParams.Body.ofGroupedWithMinMaxThresholds(groupedWithMinMaxThresholds),
            requestOptions,
        )

    /** @see create */
    fun create(
        matrixWithDisplayName: NewFloatingMatrixWithDisplayNamePrice,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Price =
        create(
            PriceCreateParams.Body.ofMatrixWithDisplayName(matrixWithDisplayName),
            requestOptions,
        )

    /** @see create */
    fun create(
        groupedTieredPackage: NewFloatingGroupedTieredPackagePrice,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Price =
        create(PriceCreateParams.Body.ofGroupedTieredPackage(groupedTieredPackage), requestOptions)

    /** @see create */
    fun create(
        maxGroupTieredPackage: NewFloatingMaxGroupTieredPackagePrice,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Price =
        create(
            PriceCreateParams.Body.ofMaxGroupTieredPackage(maxGroupTieredPackage),
            requestOptions,
        )

    /** @see create */
    fun create(
        scalableMatrixWithUnitPricing: NewFloatingScalableMatrixWithUnitPricingPrice,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Price =
        create(
            PriceCreateParams.Body.ofScalableMatrixWithUnitPricing(scalableMatrixWithUnitPricing),
            requestOptions,
        )

    /** @see create */
    fun create(
        scalableMatrixWithTieredPricing: NewFloatingScalableMatrixWithTieredPricingPrice,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Price =
        create(
            PriceCreateParams.Body.ofScalableMatrixWithTieredPricing(
                scalableMatrixWithTieredPricing
            ),
            requestOptions,
        )

    /** @see create */
    fun create(
        cumulativeGroupedBulk: NewFloatingCumulativeGroupedBulkPrice,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Price =
        create(
            PriceCreateParams.Body.ofCumulativeGroupedBulk(cumulativeGroupedBulk),
            requestOptions,
        )

    /** @see create */
    fun create(
        cumulativeGroupedAllocation: PriceCreateParams.Body.CumulativeGroupedAllocation,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Price =
        create(
            PriceCreateParams.Body.ofCumulativeGroupedAllocation(cumulativeGroupedAllocation),
            requestOptions,
        )

    /** @see create */
    fun create(
        dailyCreditAllowance: PriceCreateParams.Body.DailyCreditAllowance,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Price =
        create(PriceCreateParams.Body.ofDailyCreditAllowance(dailyCreditAllowance), requestOptions)

    /** @see create */
    fun create(
        minimumComposite: NewFloatingMinimumCompositePrice,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Price = create(PriceCreateParams.Body.ofMinimumComposite(minimumComposite), requestOptions)

    /** @see create */
    fun create(
        percent: PriceCreateParams.Body.Percent,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Price = create(PriceCreateParams.Body.ofPercent(percent), requestOptions)

    /** @see create */
    fun create(
        eventOutput: PriceCreateParams.Body.EventOutput,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Price = create(PriceCreateParams.Body.ofEventOutput(eventOutput), requestOptions)

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

        /**
         * The Price resource represents a price that can be billed on a subscription, resulting in
         * a charge on an invoice in the form of an invoice line item. Prices take a quantity and
         * determine an amount to bill.
         *
         * Orb supports a few different pricing models out of the box. Each of these models is
         * serialized differently in a given Price object. The model_type field determines the key
         * for the configuration object that is present.
         *
         * For more on the types of prices, see
         * [the core concepts documentation](/core-concepts#plan-and-price)
         */
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

        /** @see create */
        @MustBeClosed
        fun create(
            body: PriceCreateParams.Body,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Price> =
            create(PriceCreateParams.builder().body(body).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            unit: NewFloatingUnitPrice,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Price> = create(PriceCreateParams.Body.ofUnit(unit), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            tiered: NewFloatingTieredPrice,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Price> = create(PriceCreateParams.Body.ofTiered(tiered), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            bulk: NewFloatingBulkPrice,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Price> = create(PriceCreateParams.Body.ofBulk(bulk), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            bulkWithFilters: PriceCreateParams.Body.BulkWithFilters,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Price> =
            create(PriceCreateParams.Body.ofBulkWithFilters(bulkWithFilters), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            package_: NewFloatingPackagePrice,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Price> =
            create(PriceCreateParams.Body.ofPackage(package_), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            matrix: NewFloatingMatrixPrice,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Price> = create(PriceCreateParams.Body.ofMatrix(matrix), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            thresholdTotalAmount: NewFloatingThresholdTotalAmountPrice,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Price> =
            create(
                PriceCreateParams.Body.ofThresholdTotalAmount(thresholdTotalAmount),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            tieredPackage: NewFloatingTieredPackagePrice,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Price> =
            create(PriceCreateParams.Body.ofTieredPackage(tieredPackage), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            tieredWithMinimum: NewFloatingTieredWithMinimumPrice,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Price> =
            create(PriceCreateParams.Body.ofTieredWithMinimum(tieredWithMinimum), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            groupedTiered: NewFloatingGroupedTieredPrice,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Price> =
            create(PriceCreateParams.Body.ofGroupedTiered(groupedTiered), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            tieredPackageWithMinimum: NewFloatingTieredPackageWithMinimumPrice,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Price> =
            create(
                PriceCreateParams.Body.ofTieredPackageWithMinimum(tieredPackageWithMinimum),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            packageWithAllocation: NewFloatingPackageWithAllocationPrice,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Price> =
            create(
                PriceCreateParams.Body.ofPackageWithAllocation(packageWithAllocation),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            unitWithPercent: NewFloatingUnitWithPercentPrice,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Price> =
            create(PriceCreateParams.Body.ofUnitWithPercent(unitWithPercent), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            matrixWithAllocation: NewFloatingMatrixWithAllocationPrice,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Price> =
            create(
                PriceCreateParams.Body.ofMatrixWithAllocation(matrixWithAllocation),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            tieredWithProration: NewFloatingTieredWithProrationPrice,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Price> =
            create(
                PriceCreateParams.Body.ofTieredWithProration(tieredWithProration),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            unitWithProration: NewFloatingUnitWithProrationPrice,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Price> =
            create(PriceCreateParams.Body.ofUnitWithProration(unitWithProration), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            groupedAllocation: NewFloatingGroupedAllocationPrice,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Price> =
            create(PriceCreateParams.Body.ofGroupedAllocation(groupedAllocation), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            bulkWithProration: NewFloatingBulkWithProrationPrice,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Price> =
            create(PriceCreateParams.Body.ofBulkWithProration(bulkWithProration), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            groupedWithProratedMinimum: NewFloatingGroupedWithProratedMinimumPrice,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Price> =
            create(
                PriceCreateParams.Body.ofGroupedWithProratedMinimum(groupedWithProratedMinimum),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            groupedWithMeteredMinimum: NewFloatingGroupedWithMeteredMinimumPrice,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Price> =
            create(
                PriceCreateParams.Body.ofGroupedWithMeteredMinimum(groupedWithMeteredMinimum),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            groupedWithMinMaxThresholds: PriceCreateParams.Body.GroupedWithMinMaxThresholds,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Price> =
            create(
                PriceCreateParams.Body.ofGroupedWithMinMaxThresholds(groupedWithMinMaxThresholds),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            matrixWithDisplayName: NewFloatingMatrixWithDisplayNamePrice,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Price> =
            create(
                PriceCreateParams.Body.ofMatrixWithDisplayName(matrixWithDisplayName),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            groupedTieredPackage: NewFloatingGroupedTieredPackagePrice,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Price> =
            create(
                PriceCreateParams.Body.ofGroupedTieredPackage(groupedTieredPackage),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            maxGroupTieredPackage: NewFloatingMaxGroupTieredPackagePrice,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Price> =
            create(
                PriceCreateParams.Body.ofMaxGroupTieredPackage(maxGroupTieredPackage),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            scalableMatrixWithUnitPricing: NewFloatingScalableMatrixWithUnitPricingPrice,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Price> =
            create(
                PriceCreateParams.Body.ofScalableMatrixWithUnitPricing(
                    scalableMatrixWithUnitPricing
                ),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            scalableMatrixWithTieredPricing: NewFloatingScalableMatrixWithTieredPricingPrice,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Price> =
            create(
                PriceCreateParams.Body.ofScalableMatrixWithTieredPricing(
                    scalableMatrixWithTieredPricing
                ),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            cumulativeGroupedBulk: NewFloatingCumulativeGroupedBulkPrice,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Price> =
            create(
                PriceCreateParams.Body.ofCumulativeGroupedBulk(cumulativeGroupedBulk),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            cumulativeGroupedAllocation: PriceCreateParams.Body.CumulativeGroupedAllocation,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Price> =
            create(
                PriceCreateParams.Body.ofCumulativeGroupedAllocation(cumulativeGroupedAllocation),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            dailyCreditAllowance: PriceCreateParams.Body.DailyCreditAllowance,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Price> =
            create(
                PriceCreateParams.Body.ofDailyCreditAllowance(dailyCreditAllowance),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            minimumComposite: NewFloatingMinimumCompositePrice,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Price> =
            create(PriceCreateParams.Body.ofMinimumComposite(minimumComposite), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            percent: PriceCreateParams.Body.Percent,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Price> =
            create(PriceCreateParams.Body.ofPercent(percent), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            eventOutput: PriceCreateParams.Body.EventOutput,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Price> =
            create(PriceCreateParams.Body.ofEventOutput(eventOutput), requestOptions)

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
