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
import com.withorb.api.errors.OrbError
import com.withorb.api.models.CustomerCreditListByExternalIdPageAsync
import com.withorb.api.models.CustomerCreditListByExternalIdParams
import com.withorb.api.models.CustomerCreditListPageAsync
import com.withorb.api.models.CustomerCreditListParams
import com.withorb.api.services.async.customers.credits.LedgerServiceAsync
import com.withorb.api.services.async.customers.credits.LedgerServiceAsyncImpl
import com.withorb.api.services.async.customers.credits.TopUpServiceAsync
import com.withorb.api.services.async.customers.credits.TopUpServiceAsyncImpl

class CreditServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : CreditServiceAsync {

    private val errorHandler: Handler<OrbError> = errorHandler(clientOptions.jsonMapper)

    private val ledger: LedgerServiceAsync by lazy { LedgerServiceAsyncImpl(clientOptions) }

    private val topUps: TopUpServiceAsync by lazy { TopUpServiceAsyncImpl(clientOptions) }

    override fun ledger(): LedgerServiceAsync = ledger

    override fun topUps(): TopUpServiceAsync = topUps

    private val listHandler: Handler<CustomerCreditListPageAsync.Response> =
        jsonHandler<CustomerCreditListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Returns a paginated list of unexpired, non-zero credit blocks for a customer.
     *
     * If `include_all_blocks` is set to `true`, all credit blocks (including expired and depleted
     * blocks) will be included in the response.
     *
     * Note that `currency` defaults to credits if not specified. To use a real world currency, set
     * `currency` to an ISO 4217 string.
     */
    override suspend fun list(
        params: CustomerCreditListParams,
        requestOptions: RequestOptions
    ): CustomerCreditListPageAsync {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("customers", params.getPathParam(0), "credits")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { CustomerCreditListPageAsync.of(this, params, it) }
        }
    }

    private val listByExternalIdHandler: Handler<CustomerCreditListByExternalIdPageAsync.Response> =
        jsonHandler<CustomerCreditListByExternalIdPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Returns a paginated list of unexpired, non-zero credit blocks for a customer.
     *
     * If `include_all_blocks` is set to `true`, all credit blocks (including expired and depleted
     * blocks) will be included in the response.
     *
     * Note that `currency` defaults to credits if not specified. To use a real world currency, set
     * `currency` to an ISO 4217 string.
     */
    override suspend fun listByExternalId(
        params: CustomerCreditListByExternalIdParams,
        requestOptions: RequestOptions
    ): CustomerCreditListByExternalIdPageAsync {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "customers",
                    "external_customer_id",
                    params.getPathParam(0),
                    "credits"
                )
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response
                .use { listByExternalIdHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { CustomerCreditListByExternalIdPageAsync.of(this, params, it) }
        }
    }
}
