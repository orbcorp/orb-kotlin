// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

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
import com.withorb.api.models.PriceCreateParams
import com.withorb.api.models.PriceEvaluateParams
import com.withorb.api.models.PriceEvaluateResponse
import com.withorb.api.models.PriceFetchParams
import com.withorb.api.models.PriceListPageAsync
import com.withorb.api.models.PriceListPageResponse
import com.withorb.api.models.PriceListParams
import com.withorb.api.models.PriceUpdateParams
import com.withorb.api.services.async.prices.ExternalPriceIdServiceAsync
import com.withorb.api.services.async.prices.ExternalPriceIdServiceAsyncImpl

class PriceServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PriceServiceAsync {

    private val withRawResponse: PriceServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val externalPriceId: ExternalPriceIdServiceAsync by lazy {
        ExternalPriceIdServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): PriceServiceAsync.WithRawResponse = withRawResponse

    override fun externalPriceId(): ExternalPriceIdServiceAsync = externalPriceId

    override suspend fun create(params: PriceCreateParams, requestOptions: RequestOptions): Price =
        // post /prices
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun update(params: PriceUpdateParams, requestOptions: RequestOptions): Price =
        // put /prices/{price_id}
        withRawResponse().update(params, requestOptions).parse()

    override suspend fun list(
        params: PriceListParams,
        requestOptions: RequestOptions,
    ): PriceListPageAsync =
        // get /prices
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun evaluate(
        params: PriceEvaluateParams,
        requestOptions: RequestOptions,
    ): PriceEvaluateResponse =
        // post /prices/{price_id}/evaluate
        withRawResponse().evaluate(params, requestOptions).parse()

    override suspend fun fetch(params: PriceFetchParams, requestOptions: RequestOptions): Price =
        // get /prices/{price_id}
        withRawResponse().fetch(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PriceServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val externalPriceId: ExternalPriceIdServiceAsync.WithRawResponse by lazy {
            ExternalPriceIdServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun externalPriceId(): ExternalPriceIdServiceAsync.WithRawResponse =
            externalPriceId

        private val createHandler: Handler<Price> =
            jsonHandler<Price>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun create(
            params: PriceCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Price> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("prices")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<Price> =
            jsonHandler<Price>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun update(
            params: PriceUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Price> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("priceId", params.priceId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments("prices", params._pathParam(0))
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

        private val listHandler: Handler<PriceListPageResponse> =
            jsonHandler<PriceListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun list(
            params: PriceListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PriceListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("prices")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        PriceListPageAsync.builder()
                            .service(PriceServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val evaluateHandler: Handler<PriceEvaluateResponse> =
            jsonHandler<PriceEvaluateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun evaluate(
            params: PriceEvaluateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PriceEvaluateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("priceId", params.priceId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("prices", params._pathParam(0), "evaluate")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { evaluateHandler.handle(it) }
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
            params: PriceFetchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Price> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("priceId", params.priceId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("prices", params._pathParam(0))
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
