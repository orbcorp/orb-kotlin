// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpMethod
import com.withorb.api.core.http.HttpRequest
import com.withorb.api.core.http.HttpResponse.Handler
import com.withorb.api.errors.OrbError
import com.withorb.api.models.Invoice
import com.withorb.api.models.InvoiceCreateParams
import com.withorb.api.models.InvoiceFetchParams
import com.withorb.api.models.InvoiceFetchUpcomingParams
import com.withorb.api.models.InvoiceFetchUpcomingResponse
import com.withorb.api.models.InvoiceIssueParams
import com.withorb.api.models.InvoiceListPage
import com.withorb.api.models.InvoiceListParams
import com.withorb.api.models.InvoiceMarkPaidParams
import com.withorb.api.models.InvoiceVoidParams
import com.withorb.api.services.errorHandler
import com.withorb.api.services.json
import com.withorb.api.services.jsonHandler
import com.withorb.api.services.withErrorHandler

class InvoiceServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : InvoiceService {

    private val errorHandler: Handler<OrbError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<Invoice> =
        jsonHandler<Invoice>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** This endpoint is used to create a one-off invoice for a customer. */
    override fun create(params: InvoiceCreateParams, requestOptions: RequestOptions): Invoice {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("invoices")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { createHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<InvoiceListPage.Response> =
        jsonHandler<InvoiceListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * This endpoint returns a list of all [`Invoice`](../guides/concepts#invoice)s for an account
     * in a list format.
     *
     * The list of invoices is ordered starting from the most recently issued invoice date. The
     * response also includes [`pagination_metadata`](../reference/pagination), which lets the
     * caller retrieve the next page of results if they exist.
     *
     * By default, this only returns invoices that are `issued`, `paid`, or `synced`.
     */
    override fun list(params: InvoiceListParams, requestOptions: RequestOptions): InvoiceListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("invoices")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { InvoiceListPage.of(this, params, it) }
        }
    }

    private val fetchHandler: Handler<Invoice> =
        jsonHandler<Invoice>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * This endpoint is used to fetch an [`Invoice`](../guides/concepts#invoice) given an
     * identifier.
     */
    override fun fetch(params: InvoiceFetchParams, requestOptions: RequestOptions): Invoice {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("invoices", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { fetchHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val fetchUpcomingHandler: Handler<InvoiceFetchUpcomingResponse> =
        jsonHandler<InvoiceFetchUpcomingResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * This endpoint can be used to fetch the upcoming [invoice](../guides/concepts#invoice) for the
     * current billing period given a subscription.
     */
    override fun fetchUpcoming(
        params: InvoiceFetchUpcomingParams,
        requestOptions: RequestOptions
    ): InvoiceFetchUpcomingResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("invoices", "upcoming")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { fetchUpcomingHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val issueHandler: Handler<Invoice> =
        jsonHandler<Invoice>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * This endpoint allows an eligible invoice to be issued manually. This is only possible with
     * invoices where status is `draft`, `will_auto_issue` is false, and an `eligible_to_issue_at`
     * is a time in the past. Issuing an invoice could possibly trigger side effects, some of which
     * could be customer-visible (e.g. sending emails, auto-collecting payment, syncing the invoice
     * to external providers, etc).
     */
    override fun issue(params: InvoiceIssueParams, requestOptions: RequestOptions): Invoice {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("invoices", params.getPathParam(0), "issue")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .apply { params.getBody()?.also { body(json(clientOptions.jsonMapper, it)) } }
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { issueHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val markPaidHandler: Handler<Invoice> =
        jsonHandler<Invoice>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * This endpoint allows an invoice's status to be set the `paid` status. This can only be done
     * to invoices that are in the `issued` status.
     */
    override fun markPaid(params: InvoiceMarkPaidParams, requestOptions: RequestOptions): Invoice {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("invoices", params.getPathParam(0), "mark_paid")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { markPaidHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val voidHandler: Handler<Invoice> =
        jsonHandler<Invoice>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * This endpoint allows an invoice's status to be set the `void` status. This can only be done
     * to invoices that are in the `issued` status.
     *
     * If the associated invoice has used the customer balance to change the amount due, the
     * customer balance operation will be reverted. For example, if the invoice used $10 of customer
     * balance, that amount will be added back to the customer balance upon voiding.
     */
    override fun void(params: InvoiceVoidParams, requestOptions: RequestOptions): Invoice {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("invoices", params.getPathParam(0), "void")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .apply { params.getBody()?.also { body(json(clientOptions.jsonMapper, it)) } }
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { voidHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
