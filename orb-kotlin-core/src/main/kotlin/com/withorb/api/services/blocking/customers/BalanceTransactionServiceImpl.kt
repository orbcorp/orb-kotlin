// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking.customers

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
import com.withorb.api.models.CustomerBalanceTransactionCreateParams
import com.withorb.api.models.CustomerBalanceTransactionCreateResponse
import com.withorb.api.models.CustomerBalanceTransactionListPage
import com.withorb.api.models.CustomerBalanceTransactionListParams

class BalanceTransactionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    BalanceTransactionService {

    private val withRawResponse: BalanceTransactionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BalanceTransactionService.WithRawResponse = withRawResponse

    override fun create(
        params: CustomerBalanceTransactionCreateParams,
        requestOptions: RequestOptions,
    ): CustomerBalanceTransactionCreateResponse =
        // post /customers/{customer_id}/balance_transactions
        withRawResponse().create(params, requestOptions).parse()

    override fun list(
        params: CustomerBalanceTransactionListParams,
        requestOptions: RequestOptions,
    ): CustomerBalanceTransactionListPage =
        // get /customers/{customer_id}/balance_transactions
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BalanceTransactionService.WithRawResponse {

        private val errorHandler: Handler<OrbError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<CustomerBalanceTransactionCreateResponse> =
            jsonHandler<CustomerBalanceTransactionCreateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: CustomerBalanceTransactionCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomerBalanceTransactionCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("customers", params.getPathParam(0), "balance_transactions")
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

        private val listHandler: Handler<CustomerBalanceTransactionListPage.Response> =
            jsonHandler<CustomerBalanceTransactionListPage.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: CustomerBalanceTransactionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomerBalanceTransactionListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("customers", params.getPathParam(0), "balance_transactions")
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
                        CustomerBalanceTransactionListPage.of(
                            BalanceTransactionServiceImpl(clientOptions),
                            params,
                            it,
                        )
                    }
            }
        }
    }
}
