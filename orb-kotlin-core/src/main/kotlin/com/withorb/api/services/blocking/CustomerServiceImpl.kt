// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.JsonValue
import com.withorb.api.core.RequestOptions
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
import com.withorb.api.core.prepare
import com.withorb.api.models.Customer
import com.withorb.api.models.CustomerCreateParams
import com.withorb.api.models.CustomerDeleteParams
import com.withorb.api.models.CustomerFetchByExternalIdParams
import com.withorb.api.models.CustomerFetchParams
import com.withorb.api.models.CustomerListPage
import com.withorb.api.models.CustomerListPageResponse
import com.withorb.api.models.CustomerListParams
import com.withorb.api.models.CustomerSyncPaymentMethodsFromGatewayByExternalCustomerIdParams
import com.withorb.api.models.CustomerSyncPaymentMethodsFromGatewayParams
import com.withorb.api.models.CustomerUpdateByExternalIdParams
import com.withorb.api.models.CustomerUpdateParams
import com.withorb.api.services.blocking.customers.BalanceTransactionService
import com.withorb.api.services.blocking.customers.BalanceTransactionServiceImpl
import com.withorb.api.services.blocking.customers.CostService
import com.withorb.api.services.blocking.customers.CostServiceImpl
import com.withorb.api.services.blocking.customers.CreditService
import com.withorb.api.services.blocking.customers.CreditServiceImpl

class CustomerServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CustomerService {

    private val withRawResponse: CustomerService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val costs: CostService by lazy { CostServiceImpl(clientOptions) }

    private val credits: CreditService by lazy { CreditServiceImpl(clientOptions) }

    private val balanceTransactions: BalanceTransactionService by lazy {
        BalanceTransactionServiceImpl(clientOptions)
    }

    override fun withRawResponse(): CustomerService.WithRawResponse = withRawResponse

    override fun costs(): CostService = costs

    override fun credits(): CreditService = credits

    override fun balanceTransactions(): BalanceTransactionService = balanceTransactions

    override fun create(params: CustomerCreateParams, requestOptions: RequestOptions): Customer =
        // post /customers
        withRawResponse().create(params, requestOptions).parse()

    override fun update(params: CustomerUpdateParams, requestOptions: RequestOptions): Customer =
        // put /customers/{customer_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: CustomerListParams,
        requestOptions: RequestOptions,
    ): CustomerListPage =
        // get /customers
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: CustomerDeleteParams, requestOptions: RequestOptions) {
        // delete /customers/{customer_id}
        withRawResponse().delete(params, requestOptions)
    }

    override fun fetch(params: CustomerFetchParams, requestOptions: RequestOptions): Customer =
        // get /customers/{customer_id}
        withRawResponse().fetch(params, requestOptions).parse()

    override fun fetchByExternalId(
        params: CustomerFetchByExternalIdParams,
        requestOptions: RequestOptions,
    ): Customer =
        // get /customers/external_customer_id/{external_customer_id}
        withRawResponse().fetchByExternalId(params, requestOptions).parse()

    override fun syncPaymentMethodsFromGateway(
        params: CustomerSyncPaymentMethodsFromGatewayParams,
        requestOptions: RequestOptions,
    ) {
        // post /customers/{customer_id}/sync_payment_methods_from_gateway
        withRawResponse().syncPaymentMethodsFromGateway(params, requestOptions)
    }

    override fun syncPaymentMethodsFromGatewayByExternalCustomerId(
        params: CustomerSyncPaymentMethodsFromGatewayByExternalCustomerIdParams,
        requestOptions: RequestOptions,
    ) {
        // post
        // /customers/external_customer_id/{external_customer_id}/sync_payment_methods_from_gateway
        withRawResponse().syncPaymentMethodsFromGatewayByExternalCustomerId(params, requestOptions)
    }

    override fun updateByExternalId(
        params: CustomerUpdateByExternalIdParams,
        requestOptions: RequestOptions,
    ): Customer =
        // put /customers/external_customer_id/{external_customer_id}
        withRawResponse().updateByExternalId(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CustomerService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val costs: CostService.WithRawResponse by lazy {
            CostServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val credits: CreditService.WithRawResponse by lazy {
            CreditServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val balanceTransactions: BalanceTransactionService.WithRawResponse by lazy {
            BalanceTransactionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun costs(): CostService.WithRawResponse = costs

        override fun credits(): CreditService.WithRawResponse = credits

        override fun balanceTransactions(): BalanceTransactionService.WithRawResponse =
            balanceTransactions

        private val createHandler: Handler<Customer> =
            jsonHandler<Customer>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: CustomerCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Customer> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("customers")
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

        private val updateHandler: Handler<Customer> =
            jsonHandler<Customer>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: CustomerUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Customer> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments("customers", params._pathParam(0))
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

        private val listHandler: Handler<CustomerListPageResponse> =
            jsonHandler<CustomerListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: CustomerListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomerListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("customers")
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
                    .let { CustomerListPage.of(CustomerServiceImpl(clientOptions), params, it) }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

        override fun delete(
            params: CustomerDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("customers", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable { response.use { deleteHandler.handle(it) } }
        }

        private val fetchHandler: Handler<Customer> =
            jsonHandler<Customer>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun fetch(
            params: CustomerFetchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Customer> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("customers", params._pathParam(0))
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

        private val fetchByExternalIdHandler: Handler<Customer> =
            jsonHandler<Customer>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun fetchByExternalId(
            params: CustomerFetchByExternalIdParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Customer> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("customers", "external_customer_id", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        override fun syncPaymentMethodsFromGateway(
            params: CustomerSyncPaymentMethodsFromGatewayParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "customers",
                        params._pathParam(0),
                        "sync_payment_methods_from_gateway",
                    )
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response.use { syncPaymentMethodsFromGatewayHandler.handle(it) }
            }
        }

        private val syncPaymentMethodsFromGatewayByExternalCustomerIdHandler: Handler<Void?> =
            emptyHandler().withErrorHandler(errorHandler)

        override fun syncPaymentMethodsFromGatewayByExternalCustomerId(
            params: CustomerSyncPaymentMethodsFromGatewayByExternalCustomerIdParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "customers",
                        "external_customer_id",
                        params._pathParam(0),
                        "sync_payment_methods_from_gateway",
                    )
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response.use { syncPaymentMethodsFromGatewayByExternalCustomerIdHandler.handle(it) }
            }
        }

        private val updateByExternalIdHandler: Handler<Customer> =
            jsonHandler<Customer>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun updateByExternalId(
            params: CustomerUpdateByExternalIdParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Customer> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments("customers", "external_customer_id", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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
