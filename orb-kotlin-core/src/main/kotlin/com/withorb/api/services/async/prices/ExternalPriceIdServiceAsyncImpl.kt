// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.prices

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.JsonValue
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.checkRequired
import com.withorb.api.core.handlers.errorHandler
import com.withorb.api.core.handlers.jsonHandler
import com.withorb.api.core.handlers.withErrorHandler
import com.withorb.api.core.http.HttpMethod
import com.withorb.api.core.http.HttpRequest
import com.withorb.api.core.http.HttpResponse.Handler
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.core.http.json
import com.withorb.api.core.http.parseable
import com.withorb.api.core.prepareAsync
import com.withorb.api.models.Price
import com.withorb.api.models.PriceExternalPriceIdFetchParams
import com.withorb.api.models.PriceExternalPriceIdUpdateParams

class ExternalPriceIdServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : ExternalPriceIdServiceAsync {

    private val withRawResponse: ExternalPriceIdServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ExternalPriceIdServiceAsync.WithRawResponse = withRawResponse

    override suspend fun update(
        params: PriceExternalPriceIdUpdateParams,
        requestOptions: RequestOptions,
    ): Price =
        // put /prices/external_price_id/{external_price_id}
        withRawResponse().update(params, requestOptions).parse()

    override suspend fun fetch(
        params: PriceExternalPriceIdFetchParams,
        requestOptions: RequestOptions,
    ): Price =
        // get /prices/external_price_id/{external_price_id}
        withRawResponse().fetch(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ExternalPriceIdServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val updateHandler: Handler<Price> =
            jsonHandler<Price>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun update(
            params: PriceExternalPriceIdUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Price> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("externalPriceId", params.externalPriceId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments("prices", "external_price_id", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val fetchHandler: Handler<Price> =
            jsonHandler<Price>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun fetch(
            params: PriceExternalPriceIdFetchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Price> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("externalPriceId", params.externalPriceId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("prices", "external_price_id", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { fetchHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
