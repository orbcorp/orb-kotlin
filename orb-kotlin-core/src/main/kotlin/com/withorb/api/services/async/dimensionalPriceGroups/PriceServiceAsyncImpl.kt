// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.dimensionalPriceGroups

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.checkRequired
import com.withorb.api.core.handlers.errorBodyHandler
import com.withorb.api.core.handlers.errorHandler
import com.withorb.api.core.handlers.jsonHandler
import com.withorb.api.core.http.HttpMethod
import com.withorb.api.core.http.HttpRequest
import com.withorb.api.core.http.HttpResponse
import com.withorb.api.core.http.HttpResponse.Handler
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.core.http.json
import com.withorb.api.core.http.parseable
import com.withorb.api.core.prepareAsync
import com.withorb.api.models.DimensionalPriceGroupPriceCreateParams
import com.withorb.api.models.DimensionalPriceGroupPriceCreateResponse
import com.withorb.api.models.DimensionalPriceGroupPriceListPageAsync
import com.withorb.api.models.DimensionalPriceGroupPriceListPageResponse
import com.withorb.api.models.DimensionalPriceGroupPriceListParams

class PriceServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PriceServiceAsync {

    private val withRawResponse: PriceServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PriceServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PriceServiceAsync =
        PriceServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun create(
        params: DimensionalPriceGroupPriceCreateParams,
        requestOptions: RequestOptions,
    ): DimensionalPriceGroupPriceCreateResponse =
        // post /dimensional_price_groups/{dimensional_price_group_id}/prices
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun list(
        params: DimensionalPriceGroupPriceListParams,
        requestOptions: RequestOptions,
    ): DimensionalPriceGroupPriceListPageAsync =
        // get /dimensional_price_groups/{dimensional_price_group_id}/prices
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PriceServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): PriceServiceAsync.WithRawResponse =
            PriceServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<DimensionalPriceGroupPriceCreateResponse> =
            jsonHandler<DimensionalPriceGroupPriceCreateResponse>(clientOptions.jsonMapper)

        override suspend fun create(
            params: DimensionalPriceGroupPriceCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DimensionalPriceGroupPriceCreateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("dimensionalPriceGroupId", params.dimensionalPriceGroupId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("dimensional_price_groups", params._pathParam(0), "prices")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<DimensionalPriceGroupPriceListPageResponse> =
            jsonHandler<DimensionalPriceGroupPriceListPageResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: DimensionalPriceGroupPriceListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DimensionalPriceGroupPriceListPageAsync> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("dimensionalPriceGroupId", params.dimensionalPriceGroupId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("dimensional_price_groups", params._pathParam(0), "prices")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        DimensionalPriceGroupPriceListPageAsync.builder()
                            .service(PriceServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
