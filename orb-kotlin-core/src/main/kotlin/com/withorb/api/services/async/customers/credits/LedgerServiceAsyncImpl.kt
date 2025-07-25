// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.customers.credits

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
import com.withorb.api.models.CustomerCreditLedgerCreateEntryByExternalIdParams
import com.withorb.api.models.CustomerCreditLedgerCreateEntryByExternalIdResponse
import com.withorb.api.models.CustomerCreditLedgerCreateEntryParams
import com.withorb.api.models.CustomerCreditLedgerCreateEntryResponse
import com.withorb.api.models.CustomerCreditLedgerListByExternalIdPageAsync
import com.withorb.api.models.CustomerCreditLedgerListByExternalIdPageResponse
import com.withorb.api.models.CustomerCreditLedgerListByExternalIdParams
import com.withorb.api.models.CustomerCreditLedgerListPageAsync
import com.withorb.api.models.CustomerCreditLedgerListPageResponse
import com.withorb.api.models.CustomerCreditLedgerListParams

class LedgerServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    LedgerServiceAsync {

    private val withRawResponse: LedgerServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LedgerServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): LedgerServiceAsync =
        LedgerServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun list(
        params: CustomerCreditLedgerListParams,
        requestOptions: RequestOptions,
    ): CustomerCreditLedgerListPageAsync =
        // get /customers/{customer_id}/credits/ledger
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun createEntry(
        params: CustomerCreditLedgerCreateEntryParams,
        requestOptions: RequestOptions,
    ): CustomerCreditLedgerCreateEntryResponse =
        // post /customers/{customer_id}/credits/ledger_entry
        withRawResponse().createEntry(params, requestOptions).parse()

    override suspend fun createEntryByExternalId(
        params: CustomerCreditLedgerCreateEntryByExternalIdParams,
        requestOptions: RequestOptions,
    ): CustomerCreditLedgerCreateEntryByExternalIdResponse =
        // post /customers/external_customer_id/{external_customer_id}/credits/ledger_entry
        withRawResponse().createEntryByExternalId(params, requestOptions).parse()

    override suspend fun listByExternalId(
        params: CustomerCreditLedgerListByExternalIdParams,
        requestOptions: RequestOptions,
    ): CustomerCreditLedgerListByExternalIdPageAsync =
        // get /customers/external_customer_id/{external_customer_id}/credits/ledger
        withRawResponse().listByExternalId(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LedgerServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): LedgerServiceAsync.WithRawResponse =
            LedgerServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val listHandler: Handler<CustomerCreditLedgerListPageResponse> =
            jsonHandler<CustomerCreditLedgerListPageResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: CustomerCreditLedgerListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomerCreditLedgerListPageAsync> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("customerId", params.customerId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("customers", params._pathParam(0), "credits", "ledger")
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
                        CustomerCreditLedgerListPageAsync.builder()
                            .service(LedgerServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val createEntryHandler: Handler<CustomerCreditLedgerCreateEntryResponse> =
            jsonHandler<CustomerCreditLedgerCreateEntryResponse>(clientOptions.jsonMapper)

        override suspend fun createEntry(
            params: CustomerCreditLedgerCreateEntryParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomerCreditLedgerCreateEntryResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("customerId", params.customerId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("customers", params._pathParam(0), "credits", "ledger_entry")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createEntryHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val createEntryByExternalIdHandler:
            Handler<CustomerCreditLedgerCreateEntryByExternalIdResponse> =
            jsonHandler<CustomerCreditLedgerCreateEntryByExternalIdResponse>(
                clientOptions.jsonMapper
            )

        override suspend fun createEntryByExternalId(
            params: CustomerCreditLedgerCreateEntryByExternalIdParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomerCreditLedgerCreateEntryByExternalIdResponse> {
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
                        "credits",
                        "ledger_entry",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createEntryByExternalIdHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listByExternalIdHandler:
            Handler<CustomerCreditLedgerListByExternalIdPageResponse> =
            jsonHandler<CustomerCreditLedgerListByExternalIdPageResponse>(clientOptions.jsonMapper)

        override suspend fun listByExternalId(
            params: CustomerCreditLedgerListByExternalIdParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomerCreditLedgerListByExternalIdPageAsync> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("externalCustomerId", params.externalCustomerId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "customers",
                        "external_customer_id",
                        params._pathParam(0),
                        "credits",
                        "ledger",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listByExternalIdHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        CustomerCreditLedgerListByExternalIdPageAsync.builder()
                            .service(LedgerServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
