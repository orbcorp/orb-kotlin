// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.customers

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
import com.withorb.api.models.CustomerBalanceTransactionCreateParams
import com.withorb.api.models.CustomerBalanceTransactionCreateResponse
import com.withorb.api.models.CustomerBalanceTransactionListPageAsync
import com.withorb.api.models.CustomerBalanceTransactionListPageResponse
import com.withorb.api.models.CustomerBalanceTransactionListParams

class BalanceTransactionServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : BalanceTransactionServiceAsync {

    private val withRawResponse: BalanceTransactionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BalanceTransactionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: (ClientOptions.Builder) -> Unit
    ): BalanceTransactionServiceAsync =
        BalanceTransactionServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun create(
        params: CustomerBalanceTransactionCreateParams,
        requestOptions: RequestOptions,
    ): CustomerBalanceTransactionCreateResponse =
        // post /customers/{customer_id}/balance_transactions
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun list(
        params: CustomerBalanceTransactionListParams,
        requestOptions: RequestOptions,
    ): CustomerBalanceTransactionListPageAsync =
        // get /customers/{customer_id}/balance_transactions
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BalanceTransactionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): BalanceTransactionServiceAsync.WithRawResponse =
            BalanceTransactionServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<CustomerBalanceTransactionCreateResponse> =
            jsonHandler<CustomerBalanceTransactionCreateResponse>(clientOptions.jsonMapper)

        override suspend fun create(
            params: CustomerBalanceTransactionCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomerBalanceTransactionCreateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("customerId", params.customerId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("customers", params._pathParam(0), "balance_transactions")
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

        private val listHandler: Handler<CustomerBalanceTransactionListPageResponse> =
            jsonHandler<CustomerBalanceTransactionListPageResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: CustomerBalanceTransactionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomerBalanceTransactionListPageAsync> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("customerId", params.customerId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("customers", params._pathParam(0), "balance_transactions")
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
                        CustomerBalanceTransactionListPageAsync.builder()
                            .service(BalanceTransactionServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
