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
import com.withorb.api.models.DimensionalPriceGroup
import com.withorb.api.models.DimensionalPriceGroupExternalDimensionalPriceGroupIdRetrieveParams
import com.withorb.api.models.DimensionalPriceGroupExternalDimensionalPriceGroupIdUpdateParams

class ExternalDimensionalPriceGroupIdServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) :
    ExternalDimensionalPriceGroupIdServiceAsync {

    private val withRawResponse:
        ExternalDimensionalPriceGroupIdServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ExternalDimensionalPriceGroupIdServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: (ClientOptions.Builder) -> Unit
    ): ExternalDimensionalPriceGroupIdServiceAsync =
        ExternalDimensionalPriceGroupIdServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier).build()
        )

    override suspend fun retrieve(
        params: DimensionalPriceGroupExternalDimensionalPriceGroupIdRetrieveParams,
        requestOptions: RequestOptions,
    ): DimensionalPriceGroup =
        // get
        // /dimensional_price_groups/external_dimensional_price_group_id/{external_dimensional_price_group_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun update(
        params: DimensionalPriceGroupExternalDimensionalPriceGroupIdUpdateParams,
        requestOptions: RequestOptions,
    ): DimensionalPriceGroup =
        // put
        // /dimensional_price_groups/external_dimensional_price_group_id/{external_dimensional_price_group_id}
        withRawResponse().update(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ExternalDimensionalPriceGroupIdServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ExternalDimensionalPriceGroupIdServiceAsync.WithRawResponse =
            ExternalDimensionalPriceGroupIdServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val retrieveHandler: Handler<DimensionalPriceGroup> =
            jsonHandler<DimensionalPriceGroup>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: DimensionalPriceGroupExternalDimensionalPriceGroupIdRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DimensionalPriceGroup> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired(
                "externalDimensionalPriceGroupId",
                params.externalDimensionalPriceGroupId(),
            )
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "dimensional_price_groups",
                        "external_dimensional_price_group_id",
                        params._pathParam(0),
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<DimensionalPriceGroup> =
            jsonHandler<DimensionalPriceGroup>(clientOptions.jsonMapper)

        override suspend fun update(
            params: DimensionalPriceGroupExternalDimensionalPriceGroupIdUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DimensionalPriceGroup> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired(
                "pathExternalDimensionalPriceGroupId",
                params.pathExternalDimensionalPriceGroupId(),
            )
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "dimensional_price_groups",
                        "external_dimensional_price_group_id",
                        params._pathParam(0),
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
