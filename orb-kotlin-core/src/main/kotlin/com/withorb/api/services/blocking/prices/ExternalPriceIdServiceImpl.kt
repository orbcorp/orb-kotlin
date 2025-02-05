// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking.prices

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.handlers.errorHandler
import com.withorb.api.core.handlers.jsonHandler
import com.withorb.api.core.handlers.withErrorHandler
import com.withorb.api.core.http.HttpMethod
import com.withorb.api.core.http.HttpRequest
import com.withorb.api.core.http.HttpResponse.Handler
import com.withorb.api.core.json
import com.withorb.api.core.prepare
import com.withorb.api.errors.OrbError
import com.withorb.api.models.Price
import com.withorb.api.models.PriceExternalPriceIdFetchParams
import com.withorb.api.models.PriceExternalPriceIdUpdateParams

class ExternalPriceIdServiceImpl
internal constructor(
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
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { updateHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val fetchHandler: Handler<Price> =
        jsonHandler<Price>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * This endpoint returns a price given an external price id. See the
     * [price creation API](/api-reference/price/create-price) for more information about external
     * price aliases.
     */
    override fun fetch(
        params: PriceExternalPriceIdFetchParams,
        requestOptions: RequestOptions
    ): Price {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("prices", "external_price_id", params.getPathParam(0))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { fetchHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }
}
