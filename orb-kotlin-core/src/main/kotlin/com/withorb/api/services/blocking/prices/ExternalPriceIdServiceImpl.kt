// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking.prices

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpMethod
import com.withorb.api.core.http.HttpRequest
import com.withorb.api.core.http.HttpResponse.Handler
import com.withorb.api.errors.OrbError
import com.withorb.api.models.Price
import com.withorb.api.models.PriceExternalPriceIdFetchParams
import com.withorb.api.models.PriceExternalPriceIdUpdateParams
import com.withorb.api.services.errorHandler
import com.withorb.api.services.json
import com.withorb.api.services.jsonHandler
import com.withorb.api.services.withErrorHandler

class ExternalPriceIdServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : ExternalPriceIdService {

    private val errorHandler: Handler<OrbError> = errorHandler(clientOptions.jsonMapper)

    private val updateHandler: Handler<Price> =
        jsonHandler<Price>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * This endpoint allows you to update the `metadata` property on a price. If you pass null for
     * the metadata value, it will clear any existing metadata for that price.
     */
    override fun update(
        params: PriceExternalPriceIdUpdateParams,
        requestOptions: RequestOptions
    ): Price {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments("prices", "external_price_id", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { updateHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val fetchHandler: Handler<Price> =
        jsonHandler<Price>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * This endpoint returns a price given an external price id. See the
     * [price creation API](../reference/create-price) for more information about external price
     * aliases.
     */
    override fun fetch(
        params: PriceExternalPriceIdFetchParams,
        requestOptions: RequestOptions
    ): Price {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("prices", "external_price_id", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { fetchHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
