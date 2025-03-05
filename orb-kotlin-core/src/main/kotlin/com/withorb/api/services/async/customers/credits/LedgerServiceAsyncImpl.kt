// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.customers.credits

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
import com.withorb.api.core.prepareAsync
import com.withorb.api.errors.OrbError
import com.withorb.api.models.CreditLedgerEntryModel
import com.withorb.api.models.CustomerCreditLedgerCreateEntryByExternalIdParams
import com.withorb.api.models.CustomerCreditLedgerCreateEntryParams
import com.withorb.api.models.CustomerCreditLedgerListByExternalIdPageAsync
import com.withorb.api.models.CustomerCreditLedgerListByExternalIdParams
import com.withorb.api.models.CustomerCreditLedgerListPageAsync
import com.withorb.api.models.CustomerCreditLedgerListParams

class LedgerServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    LedgerServiceAsync {

    private val withRawResponse: LedgerServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LedgerServiceAsync.WithRawResponse = withRawResponse

    override suspend fun list(
        params: CustomerCreditLedgerListParams,
        requestOptions: RequestOptions,
    ): CustomerCreditLedgerListPageAsync =
        // get /customers/{customer_id}/credits/ledger
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun createEntry(
        params: CustomerCreditLedgerCreateEntryParams,
        requestOptions: RequestOptions,
    ): CreditLedgerEntryModel =
        // post /customers/{customer_id}/credits/ledger_entry
        withRawResponse().createEntry(params, requestOptions).parse()

    override suspend fun createEntryByExternalId(
        params: CustomerCreditLedgerCreateEntryByExternalIdParams,
        requestOptions: RequestOptions,
    ): CreditLedgerEntryModel =
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

        private val errorHandler: Handler<OrbError> = errorHandler(clientOptions.jsonMapper)

        private val listHandler: Handler<CustomerCreditLedgerListPageAsync.Response> =
            jsonHandler<CustomerCreditLedgerListPageAsync.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun list(
            params: CustomerCreditLedgerListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomerCreditLedgerListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("customers", params.getPathParam(0), "credits", "ledger")
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
                        CustomerCreditLedgerListPageAsync.of(
                            LedgerServiceAsyncImpl(clientOptions),
                            params,
                            it,
                        )
                    }
            }
        }

        private val createEntryHandler: Handler<CreditLedgerEntryModel> =
            jsonHandler<CreditLedgerEntryModel>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun createEntry(
            params: CustomerCreditLedgerCreateEntryParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CreditLedgerEntryModel> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("customers", params.getPathParam(0), "credits", "ledger_entry")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { createEntryHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val createEntryByExternalIdHandler: Handler<CreditLedgerEntryModel> =
            jsonHandler<CreditLedgerEntryModel>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun createEntryByExternalId(
            params: CustomerCreditLedgerCreateEntryByExternalIdParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CreditLedgerEntryModel> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "customers",
                        "external_customer_id",
                        params.getPathParam(0),
                        "credits",
                        "ledger_entry",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
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
            Handler<CustomerCreditLedgerListByExternalIdPageAsync.Response> =
            jsonHandler<CustomerCreditLedgerListByExternalIdPageAsync.Response>(
                    clientOptions.jsonMapper
                )
                .withErrorHandler(errorHandler)

        override suspend fun listByExternalId(
            params: CustomerCreditLedgerListByExternalIdParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomerCreditLedgerListByExternalIdPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "customers",
                        "external_customer_id",
                        params.getPathParam(0),
                        "credits",
                        "ledger",
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
                    .let {
                        CustomerCreditLedgerListByExternalIdPageAsync.of(
                            LedgerServiceAsyncImpl(clientOptions),
                            params,
                            it,
                        )
                    }
            }
        }
    }
}
