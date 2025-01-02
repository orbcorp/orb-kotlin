// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.handlers.errorHandler
import com.withorb.api.core.handlers.jsonHandler
import com.withorb.api.core.handlers.withErrorHandler
import com.withorb.api.core.http.HttpMethod
import com.withorb.api.core.http.HttpRequest
import com.withorb.api.core.http.HttpResponse.Handler
import com.withorb.api.core.json
import com.withorb.api.errors.OrbError
import com.withorb.api.models.DimensionalPriceGroup
import com.withorb.api.models.DimensionalPriceGroupCreateParams
import com.withorb.api.models.DimensionalPriceGroupListPage
import com.withorb.api.models.DimensionalPriceGroupListParams
import com.withorb.api.models.DimensionalPriceGroupRetrieveParams
import com.withorb.api.services.blocking.dimensionalPriceGroups.ExternalDimensionalPriceGroupIdService
import com.withorb.api.services.blocking.dimensionalPriceGroups.ExternalDimensionalPriceGroupIdServiceImpl

class DimensionalPriceGroupServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : DimensionalPriceGroupService {

    private val errorHandler: Handler<OrbError> = errorHandler(clientOptions.jsonMapper)

    private val externalDimensionalPriceGroupId: ExternalDimensionalPriceGroupIdService by lazy {
        ExternalDimensionalPriceGroupIdServiceImpl(clientOptions)
    }

    override fun externalDimensionalPriceGroupId(): ExternalDimensionalPriceGroupIdService =
        externalDimensionalPriceGroupId

    private val createHandler: Handler<DimensionalPriceGroup> =
        jsonHandler<DimensionalPriceGroup>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * A dimensional price group is used to partition the result of a billable metric by a set of
     * dimensions. Prices in a price group must specify the parition used to derive their usage.
     *
     * For example, suppose we have a billable metric that measures the number of widgets used and
     * we want to charge differently depending on the color of the widget. We can create a price
     * group with a dimension "color" and two prices: one that charges $10 per red widget and one
     * that charges $20 per blue widget.
     */
    override fun create(
        params: DimensionalPriceGroupCreateParams,
        requestOptions: RequestOptions
    ): DimensionalPriceGroup {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("dimensional_price_groups")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { createHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val retrieveHandler: Handler<DimensionalPriceGroup> =
        jsonHandler<DimensionalPriceGroup>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Fetch dimensional price group */
    override fun retrieve(
        params: DimensionalPriceGroupRetrieveParams,
        requestOptions: RequestOptions
    ): DimensionalPriceGroup {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("dimensional_price_groups", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<DimensionalPriceGroupListPage.Response> =
        jsonHandler<DimensionalPriceGroupListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List dimensional price groups */
    override fun list(
        params: DimensionalPriceGroupListParams,
        requestOptions: RequestOptions
    ): DimensionalPriceGroupListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("dimensional_price_groups")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { DimensionalPriceGroupListPage.of(this, params, it) }
        }
    }
}
