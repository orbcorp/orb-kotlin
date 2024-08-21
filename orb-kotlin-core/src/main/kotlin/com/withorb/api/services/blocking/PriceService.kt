// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.withorb.api.services.blocking

import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import kotlin.LazyThreadSafetyMode.PUBLICATION
import java.time.LocalDate
import java.time.Duration
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Base64
import java.util.Optional
import java.util.UUID
import java.util.concurrent.CompletableFuture
import java.util.stream.Stream
import com.withorb.api.core.Enum
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.errors.OrbInvalidDataException
import com.withorb.api.models.EvaluatePriceGroup
import com.withorb.api.models.Price
import com.withorb.api.models.PriceCreateParams
import com.withorb.api.models.PriceEvaluateParams
import com.withorb.api.models.PriceEvaluateResponse
import com.withorb.api.models.PriceFetchParams
import com.withorb.api.models.PriceListPage
import com.withorb.api.models.PriceListParams
import com.withorb.api.models.PriceUpdateParams
import com.withorb.api.core.ClientOptions
import com.withorb.api.core.http.HttpMethod
import com.withorb.api.core.http.HttpRequest
import com.withorb.api.core.http.HttpResponse.Handler
import com.withorb.api.core.http.BinaryResponseContent
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonValue
import com.withorb.api.core.RequestOptions
import com.withorb.api.errors.OrbError
import com.withorb.api.services.emptyHandler
import com.withorb.api.services.errorHandler
import com.withorb.api.services.json
import com.withorb.api.services.jsonHandler
import com.withorb.api.services.multipartFormData
import com.withorb.api.services.stringHandler
import com.withorb.api.services.binaryHandler
import com.withorb.api.services.withErrorHandler
import com.withorb.api.services.blocking.prices.ExternalPriceIdService
import com.withorb.api.services.blocking.prices.ExternalPriceIdServiceImpl

interface PriceService {

    fun externalPriceId(): ExternalPriceIdService

    /**
     * This endpoint is used to create a [price](../reference/price). A price created
     * using this endpoint is always an add-on, meaning that it’s not associated with a
     * specific plan and can instead be individually added to subscriptions, including
     * subscriptions on different plans.
     *
     * An `external_price_id` can be optionally specified as an alias to allow
     * ergonomic interaction with prices in the Orb API.
     *
     * See the [Price resource](../reference/price) for the specification of different
     * price model configurations possible in this endpoint.
     */
    fun create(params: PriceCreateParams, requestOptions: RequestOptions = RequestOptions.none()): Price

    /**
     * This endpoint allows you to update the `metadata` property on a price. If you
     * pass null for the metadata value, it will clear any existing metadata for that
     * price.
     */
    fun update(params: PriceUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): Price

    /**
     * This endpoint is used to list all add-on prices created using the
     * [price creation endpoint](../reference/create-price).
     */
    fun list(params: PriceListParams, requestOptions: RequestOptions = RequestOptions.none()): PriceListPage

    /**
     * This endpoint is used to evaluate the output of a price for a given customer and
     * time range. It enables filtering and grouping the output using
     * [computed properties](../guides/extensibility/advanced-metrics#computed-properties),
     * supporting the following workflows:
     *
     * 1. Showing detailed usage and costs to the end customer.
     * 2. Auditing subtotals on invoice line items.
     *
     * For these workflows, the expressiveness of computed properties in both the
     * filters and grouping is critical. For example, if you'd like to show your
     * customer their usage grouped by hour and another property, you can do so with
     * the following `grouping_keys`:
     * `["hour_floor_timestamp_millis(timestamp_millis)", "my_property"]`. If you'd
     * like to examine a customer's usage for a specific property value, you can do so
     * with the following `filter`:
     * `my_property = 'foo' AND my_other_property = 'bar'`.
     *
     * By default, the start of the time range must be no more than 100 days ago and
     * the length of the results must be no greater than 1000. Note that this is a POST
     * endpoint rather than a GET endpoint because it employs a JSON body rather than
     * query parameters.
     */
    fun evaluate(params: PriceEvaluateParams, requestOptions: RequestOptions = RequestOptions.none()): PriceEvaluateResponse

    /** This endpoint returns a price given an identifier. */
    fun fetch(params: PriceFetchParams, requestOptions: RequestOptions = RequestOptions.none()): Price
}
