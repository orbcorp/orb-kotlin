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
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.core.http.json
import com.withorb.api.core.http.parseable
import com.withorb.api.core.prepare
import com.withorb.api.errors.OrbError
import com.withorb.api.models.PriceExternalPriceIdFetchParams
import com.withorb.api.models.PriceExternalPriceIdUpdateParams
import com.withorb.api.models.PriceModel

class ExternalPriceIdServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ExternalPriceIdService {

    private val withRawResponse: ExternalPriceIdService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ExternalPriceIdService.WithRawResponse = withRawResponse

    override fun update(
        params: PriceExternalPriceIdUpdateParams,
        requestOptions: RequestOptions,
    ): PriceModel =
        // put /prices/external_price_id/{external_price_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun fetch(
        params: PriceExternalPriceIdFetchParams,
        requestOptions: RequestOptions,
    ): PriceModel =
        // get /prices/external_price_id/{external_price_id}
        withRawResponse().fetch(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ExternalPriceIdService.WithRawResponse {

        private val errorHandler: Handler<OrbError> = errorHandler(clientOptions.jsonMapper)

        private val updateHandler: Handler<PriceModel> =
            jsonHandler<PriceModel>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: PriceExternalPriceIdUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PriceModel> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments("prices", "external_price_id", params.getPathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        private val fetchHandler: Handler<PriceModel> =
            jsonHandler<PriceModel>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun fetch(
            params: PriceExternalPriceIdFetchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PriceModel> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("prices", "external_price_id", params.getPathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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
