// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking.customers.credits

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.JsonValue
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.checkRequired
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
import com.withorb.api.models.CustomerCreditLedgerCreateEntryByExternalIdParams
import com.withorb.api.models.CustomerCreditLedgerCreateEntryByExternalIdResponse
import com.withorb.api.models.CustomerCreditLedgerCreateEntryParams
import com.withorb.api.models.CustomerCreditLedgerCreateEntryResponse
import com.withorb.api.models.CustomerCreditLedgerListByExternalIdPage
import com.withorb.api.models.CustomerCreditLedgerListByExternalIdPageResponse
import com.withorb.api.models.CustomerCreditLedgerListByExternalIdParams
import com.withorb.api.models.CustomerCreditLedgerListPage
import com.withorb.api.models.CustomerCreditLedgerListPageResponse
import com.withorb.api.models.CustomerCreditLedgerListParams

class LedgerServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    LedgerService {

    private val withRawResponse: LedgerService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LedgerService.WithRawResponse = withRawResponse

    override fun list(
        params: CustomerCreditLedgerListParams,
        requestOptions: RequestOptions,
    ): CustomerCreditLedgerListPage =
        // get /customers/{customer_id}/credits/ledger
        withRawResponse().list(params, requestOptions).parse()

    override fun createEntry(
        params: CustomerCreditLedgerCreateEntryParams,
        requestOptions: RequestOptions,
    ): CustomerCreditLedgerCreateEntryResponse =
        // post /customers/{customer_id}/credits/ledger_entry
        withRawResponse().createEntry(params, requestOptions).parse()

    override fun createEntryByExternalId(
        params: CustomerCreditLedgerCreateEntryByExternalIdParams,
        requestOptions: RequestOptions,
    ): CustomerCreditLedgerCreateEntryByExternalIdResponse =
        // post /customers/external_customer_id/{external_customer_id}/credits/ledger_entry
        withRawResponse().createEntryByExternalId(params, requestOptions).parse()

    override fun listByExternalId(
        params: CustomerCreditLedgerListByExternalIdParams,
        requestOptions: RequestOptions,
    ): CustomerCreditLedgerListByExternalIdPage =
        // get /customers/external_customer_id/{external_customer_id}/credits/ledger
        withRawResponse().listByExternalId(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LedgerService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val listHandler: Handler<CustomerCreditLedgerListPageResponse> =
            jsonHandler<CustomerCreditLedgerListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: CustomerCreditLedgerListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomerCreditLedgerListPage> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("customerId", params.customerId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("customers", params._pathParam(0), "credits", "ledger")
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
                        CustomerCreditLedgerListPage.builder()
                            .service(LedgerServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val createEntryHandler: Handler<CustomerCreditLedgerCreateEntryResponse> =
            jsonHandler<CustomerCreditLedgerCreateEntryResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun createEntry(
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        private val createEntryByExternalIdHandler:
            Handler<CustomerCreditLedgerCreateEntryByExternalIdResponse> =
            jsonHandler<CustomerCreditLedgerCreateEntryByExternalIdResponse>(
                    clientOptions.jsonMapper
                )
                .withErrorHandler(errorHandler)

        override fun createEntryByExternalId(
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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
            Handler<CustomerCreditLedgerListByExternalIdPageResponse> =
            jsonHandler<CustomerCreditLedgerListByExternalIdPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun listByExternalId(
            params: CustomerCreditLedgerListByExternalIdParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomerCreditLedgerListByExternalIdPage> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { listByExternalIdHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        CustomerCreditLedgerListByExternalIdPage.builder()
                            .service(LedgerServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
