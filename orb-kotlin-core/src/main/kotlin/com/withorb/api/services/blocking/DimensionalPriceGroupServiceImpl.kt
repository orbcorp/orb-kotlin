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
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.core.http.json
import com.withorb.api.core.http.parseable
import com.withorb.api.core.prepare
import com.withorb.api.errors.OrbError
import com.withorb.api.models.DimensionalPriceGroupCreateParams
import com.withorb.api.models.DimensionalPriceGroupListPage
import com.withorb.api.models.DimensionalPriceGroupListParams
import com.withorb.api.models.DimensionalPriceGroupModel
import com.withorb.api.models.DimensionalPriceGroupRetrieveParams
import com.withorb.api.services.blocking.dimensionalPriceGroups.ExternalDimensionalPriceGroupIdService
import com.withorb.api.services.blocking.dimensionalPriceGroups.ExternalDimensionalPriceGroupIdServiceImpl

class DimensionalPriceGroupServiceImpl
internal constructor(private val clientOptions: ClientOptions) : DimensionalPriceGroupService {

    private val withRawResponse: DimensionalPriceGroupService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val externalDimensionalPriceGroupId: ExternalDimensionalPriceGroupIdService by lazy {
        ExternalDimensionalPriceGroupIdServiceImpl(clientOptions)
    }

    override fun withRawResponse(): DimensionalPriceGroupService.WithRawResponse = withRawResponse

    override fun externalDimensionalPriceGroupId(): ExternalDimensionalPriceGroupIdService =
        externalDimensionalPriceGroupId

    override fun create(
        params: DimensionalPriceGroupCreateParams,
        requestOptions: RequestOptions,
    ): DimensionalPriceGroupModel =
        // post /dimensional_price_groups
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: DimensionalPriceGroupRetrieveParams,
        requestOptions: RequestOptions,
    ): DimensionalPriceGroupModel =
        // get /dimensional_price_groups/{dimensional_price_group_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: DimensionalPriceGroupListParams,
        requestOptions: RequestOptions,
    ): DimensionalPriceGroupListPage =
        // get /dimensional_price_groups
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DimensionalPriceGroupService.WithRawResponse {

        private val errorHandler: Handler<OrbError> = errorHandler(clientOptions.jsonMapper)

        private val externalDimensionalPriceGroupId:
            ExternalDimensionalPriceGroupIdService.WithRawResponse by lazy {
            ExternalDimensionalPriceGroupIdServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun externalDimensionalPriceGroupId():
            ExternalDimensionalPriceGroupIdService.WithRawResponse = externalDimensionalPriceGroupId

        private val createHandler: Handler<DimensionalPriceGroupModel> =
            jsonHandler<DimensionalPriceGroupModel>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: DimensionalPriceGroupCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DimensionalPriceGroupModel> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("dimensional_price_groups")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        private val retrieveHandler: Handler<DimensionalPriceGroupModel> =
            jsonHandler<DimensionalPriceGroupModel>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: DimensionalPriceGroupRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DimensionalPriceGroupModel> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("dimensional_price_groups", params.getPathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<DimensionalPriceGroupListPage.Response> =
            jsonHandler<DimensionalPriceGroupListPage.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: DimensionalPriceGroupListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DimensionalPriceGroupListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("dimensional_price_groups")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        DimensionalPriceGroupListPage.of(
                            DimensionalPriceGroupServiceImpl(clientOptions),
                            params,
                            it,
                        )
                    }
            }
        }
    }
}
