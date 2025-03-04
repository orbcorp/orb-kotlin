// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.customers

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.handlers.errorHandler
import com.withorb.api.core.handlers.jsonHandler
import com.withorb.api.core.handlers.withErrorHandler
import com.withorb.api.core.http.HttpMethod
import com.withorb.api.core.http.HttpRequest
import com.withorb.api.core.http.HttpResponse.Handler
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.core.http.parseable
import com.withorb.api.core.prepareAsync
import com.withorb.api.errors.OrbError
import com.withorb.api.models.CustomerCostListByExternalIdParams
import com.withorb.api.models.CustomerCostListByExternalIdResponse
import com.withorb.api.models.CustomerCostListParams
import com.withorb.api.models.CustomerCostListResponse

class CostServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CostServiceAsync {

    private val withRawResponse: CostServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CostServiceAsync.WithRawResponse = withRawResponse

    override suspend fun list(
        params: CustomerCostListParams,
        requestOptions: RequestOptions,
    ): CustomerCostListResponse =
        // get /customers/{customer_id}/costs
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun listByExternalId(
        params: CustomerCostListByExternalIdParams,
        requestOptions: RequestOptions,
    ): CustomerCostListByExternalIdResponse =
        // get /customers/external_customer_id/{external_customer_id}/costs
        withRawResponse().listByExternalId(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CostServiceAsync.WithRawResponse {

        private val errorHandler: Handler<OrbError> = errorHandler(clientOptions.jsonMapper)

        private val listHandler: Handler<CustomerCostListResponse> =
            jsonHandler<CustomerCostListResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun list(
            params: CustomerCostListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomerCostListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("customers", params.getPathParam(0), "costs")
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
            }
        }

        private val listByExternalIdHandler: Handler<CustomerCostListByExternalIdResponse> =
            jsonHandler<CustomerCostListByExternalIdResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun listByExternalId(
            params: CustomerCostListByExternalIdParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomerCostListByExternalIdResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "customers",
                        "external_customer_id",
                        params.getPathParam(0),
                        "costs",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { listByExternalIdHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
