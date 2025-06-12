// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.JsonValue
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.checkRequired
import com.withorb.api.core.handlers.emptyHandler
import com.withorb.api.core.handlers.errorHandler
import com.withorb.api.core.handlers.jsonHandler
import com.withorb.api.core.handlers.withErrorHandler
import com.withorb.api.core.http.HttpMethod
import com.withorb.api.core.http.HttpRequest
import com.withorb.api.core.http.HttpResponse
import com.withorb.api.core.http.HttpResponse.Handler
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.core.http.json
import com.withorb.api.core.http.parseable
import com.withorb.api.core.prepareAsync
import com.withorb.api.models.Customer
import com.withorb.api.models.CustomerCreateParams
import com.withorb.api.models.CustomerDeleteParams
import com.withorb.api.models.CustomerFetchByExternalIdParams
import com.withorb.api.models.CustomerFetchParams
import com.withorb.api.models.CustomerListPageAsync
import com.withorb.api.models.CustomerListPageResponse
import com.withorb.api.models.CustomerListParams
import com.withorb.api.models.CustomerSyncPaymentMethodsFromGatewayByExternalCustomerIdParams
import com.withorb.api.models.CustomerSyncPaymentMethodsFromGatewayParams
import com.withorb.api.models.CustomerUpdateByExternalIdParams
import com.withorb.api.models.CustomerUpdateParams
import com.withorb.api.services.async.customers.BalanceTransactionServiceAsync
import com.withorb.api.services.async.customers.BalanceTransactionServiceAsyncImpl
import com.withorb.api.services.async.customers.CostServiceAsync
import com.withorb.api.services.async.customers.CostServiceAsyncImpl
import com.withorb.api.services.async.customers.CreditServiceAsync
import com.withorb.api.services.async.customers.CreditServiceAsyncImpl

class CustomerServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CustomerServiceAsync {

    private val withRawResponse: CustomerServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val costs: CostServiceAsync by lazy { CostServiceAsyncImpl(clientOptions) }

    private val credits: CreditServiceAsync by lazy { CreditServiceAsyncImpl(clientOptions) }

    private val balanceTransactions: BalanceTransactionServiceAsync by lazy {
        BalanceTransactionServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): CustomerServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CustomerServiceAsync =
        CustomerServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun costs(): CostServiceAsync = costs

    override fun credits(): CreditServiceAsync = credits

    override fun balanceTransactions(): BalanceTransactionServiceAsync = balanceTransactions

    override suspend fun create(
        params: CustomerCreateParams,
        requestOptions: RequestOptions,
    ): Customer =
        // post /customers
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun update(
        params: CustomerUpdateParams,
        requestOptions: RequestOptions,
    ): Customer =
        // put /customers/{customer_id}
        withRawResponse().update(params, requestOptions).parse()

    override suspend fun list(
        params: CustomerListParams,
        requestOptions: RequestOptions,
    ): CustomerListPageAsync =
        // get /customers
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun delete(params: CustomerDeleteParams, requestOptions: RequestOptions) {
        // delete /customers/{customer_id}
        withRawResponse().delete(params, requestOptions)
    }

    override suspend fun fetch(
        params: CustomerFetchParams,
        requestOptions: RequestOptions,
    ): Customer =
        // get /customers/{customer_id}
        withRawResponse().fetch(params, requestOptions).parse()

    override suspend fun fetchByExternalId(
        params: CustomerFetchByExternalIdParams,
        requestOptions: RequestOptions,
    ): Customer =
        // get /customers/external_customer_id/{external_customer_id}
        withRawResponse().fetchByExternalId(params, requestOptions).parse()

    override suspend fun syncPaymentMethodsFromGateway(
        params: CustomerSyncPaymentMethodsFromGatewayParams,
        requestOptions: RequestOptions,
    ) {
        // post /customers/{customer_id}/sync_payment_methods_from_gateway
        withRawResponse().syncPaymentMethodsFromGateway(params, requestOptions)
    }

    override suspend fun syncPaymentMethodsFromGatewayByExternalCustomerId(
        params: CustomerSyncPaymentMethodsFromGatewayByExternalCustomerIdParams,
        requestOptions: RequestOptions,
    ) {
        // post
        // /customers/external_customer_id/{external_customer_id}/sync_payment_methods_from_gateway
        withRawResponse().syncPaymentMethodsFromGatewayByExternalCustomerId(params, requestOptions)
    }

    override suspend fun updateByExternalId(
        params: CustomerUpdateByExternalIdParams,
        requestOptions: RequestOptions,
    ): Customer =
        // put /customers/external_customer_id/{external_customer_id}
        withRawResponse().updateByExternalId(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CustomerServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val costs: CostServiceAsync.WithRawResponse by lazy {
            CostServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val credits: CreditServiceAsync.WithRawResponse by lazy {
            CreditServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val balanceTransactions: BalanceTransactionServiceAsync.WithRawResponse by lazy {
            BalanceTransactionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): CustomerServiceAsync.WithRawResponse =
            CustomerServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun costs(): CostServiceAsync.WithRawResponse = costs

        override fun credits(): CreditServiceAsync.WithRawResponse = credits

        override fun balanceTransactions(): BalanceTransactionServiceAsync.WithRawResponse =
            balanceTransactions

        private val createHandler: Handler<Customer> =
            jsonHandler<Customer>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun create(
            params: CustomerCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Customer> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("customers")
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

        private val updateHandler: Handler<Customer> =
            jsonHandler<Customer>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun update(
            params: CustomerUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Customer> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("customerId", params.customerId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("customers", params._pathParam(0))
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

        private val listHandler: Handler<CustomerListPageResponse> =
            jsonHandler<CustomerListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun list(
            params: CustomerListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomerListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("customers")
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
                        CustomerListPageAsync.builder()
                            .service(CustomerServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

        override suspend fun delete(
            params: CustomerDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("customerId", params.customerId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("customers", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable { response.use { deleteHandler.handle(it) } }
        }

        private val fetchHandler: Handler<Customer> =
            jsonHandler<Customer>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun fetch(
            params: CustomerFetchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Customer> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("customerId", params.customerId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("customers", params._pathParam(0))
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

        private val fetchByExternalIdHandler: Handler<Customer> =
            jsonHandler<Customer>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun fetchByExternalId(
            params: CustomerFetchByExternalIdParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Customer> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("externalCustomerId", params.externalCustomerId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("customers", "external_customer_id", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { fetchByExternalIdHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val syncPaymentMethodsFromGatewayHandler: Handler<Void?> =
            emptyHandler().withErrorHandler(errorHandler)

        override suspend fun syncPaymentMethodsFromGateway(
            params: CustomerSyncPaymentMethodsFromGatewayParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("customerId", params.customerId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "customers",
                        params._pathParam(0),
                        "sync_payment_methods_from_gateway",
                    )
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response.use { syncPaymentMethodsFromGatewayHandler.handle(it) }
            }
        }

        private val syncPaymentMethodsFromGatewayByExternalCustomerIdHandler: Handler<Void?> =
            emptyHandler().withErrorHandler(errorHandler)

        override suspend fun syncPaymentMethodsFromGatewayByExternalCustomerId(
            params: CustomerSyncPaymentMethodsFromGatewayByExternalCustomerIdParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("externalCustomerId", params.externalCustomerId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "customers",
                        "external_customer_id",
                        params._pathParam(0),
                        "sync_payment_methods_from_gateway",
                    )
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response.use { syncPaymentMethodsFromGatewayByExternalCustomerIdHandler.handle(it) }
            }
        }

        private val updateByExternalIdHandler: Handler<Customer> =
            jsonHandler<Customer>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun updateByExternalId(
            params: CustomerUpdateByExternalIdParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Customer> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("customers", "external_customer_id", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { updateByExternalIdHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
