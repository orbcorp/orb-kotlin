// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.handlers.errorHandler
import com.withorb.api.core.handlers.jsonHandler
import com.withorb.api.core.handlers.withErrorHandler
import com.withorb.api.core.http.HttpMethod
import com.withorb.api.core.http.HttpRequest
import com.withorb.api.core.http.HttpResponse.Handler
import com.withorb.api.core.json
import com.withorb.api.core.prepareAsync
import com.withorb.api.errors.OrbError
import com.withorb.api.models.Invoice
import com.withorb.api.models.InvoiceCreateParams
import com.withorb.api.models.InvoiceFetchParams
import com.withorb.api.models.InvoiceFetchUpcomingParams
import com.withorb.api.models.InvoiceFetchUpcomingResponse
import com.withorb.api.models.InvoiceIssueParams
import com.withorb.api.models.InvoiceListPageAsync
import com.withorb.api.models.InvoiceListParams
import com.withorb.api.models.InvoiceMarkPaidParams
import com.withorb.api.models.InvoicePayParams
import com.withorb.api.models.InvoiceUpdateParams
import com.withorb.api.models.InvoiceVoidParams

class InvoiceServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    InvoiceServiceAsync {

    private val errorHandler: Handler<OrbError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<Invoice> =
        jsonHandler<Invoice>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** This endpoint is used to create a one-off invoice for a customer. */
    override suspend fun create(
        params: InvoiceCreateParams,
        requestOptions: RequestOptions,
    ): Invoice {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("invoices")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { createHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
    }

    private val updateHandler: Handler<Invoice> =
        jsonHandler<Invoice>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * This endpoint allows you to update the `metadata` property on an invoice. If you pass null
     * for the metadata value, it will clear any existing metadata for that invoice.
     *
     * `metadata` can be modified regardless of invoice state.
     */
    override suspend fun update(
        params: InvoiceUpdateParams,
        requestOptions: RequestOptions,
    ): Invoice {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments("invoices", params.getPathParam(0))
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { updateHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
    }

    private val listHandler: Handler<InvoiceListPageAsync.Response> =
        jsonHandler<InvoiceListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * This endpoint returns a list of all [`Invoice`](/core-concepts#invoice)s for an account in a
     * list format.
     *
     * The list of invoices is ordered starting from the most recently issued invoice date. The
     * response also includes [`pagination_metadata`](/api-reference/pagination), which lets the
     * caller retrieve the next page of results if they exist.
     *
     * By default, this only returns invoices that are `issued`, `paid`, or `synced`.
     *
     * When fetching any `draft` invoices, this returns the last-computed invoice values for each
     * draft invoice, which may not always be up-to-date since Orb regularly refreshes invoices
     * asynchronously.
     */
    override suspend fun list(
        params: InvoiceListParams,
        requestOptions: RequestOptions,
    ): InvoiceListPageAsync {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("invoices")
                .build()
                .prepareAsync(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { listHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
            .let { InvoiceListPageAsync.of(this, params, it) }
    }

    private val fetchHandler: Handler<Invoice> =
        jsonHandler<Invoice>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * This endpoint is used to fetch an [`Invoice`](/core-concepts#invoice) given an identifier.
     */
    override suspend fun fetch(
        params: InvoiceFetchParams,
        requestOptions: RequestOptions,
    ): Invoice {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("invoices", params.getPathParam(0))
                .build()
                .prepareAsync(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { fetchHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
    }

    private val fetchUpcomingHandler: Handler<InvoiceFetchUpcomingResponse> =
        jsonHandler<InvoiceFetchUpcomingResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * This endpoint can be used to fetch the upcoming [invoice](/core-concepts#invoice) for the
     * current billing period given a subscription.
     */
    override suspend fun fetchUpcoming(
        params: InvoiceFetchUpcomingParams,
        requestOptions: RequestOptions,
    ): InvoiceFetchUpcomingResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("invoices", "upcoming")
                .build()
                .prepareAsync(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { fetchUpcomingHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
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
    override suspend fun issue(
        params: InvoiceIssueParams,
        requestOptions: RequestOptions,
    ): Invoice {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("invoices", params.getPathParam(0), "issue")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { issueHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
    }

    private val markPaidHandler: Handler<Invoice> =
        jsonHandler<Invoice>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * This endpoint allows an invoice's status to be set the `paid` status. This can only be done
     * to invoices that are in the `issued` status.
     */
    override suspend fun markPaid(
        params: InvoiceMarkPaidParams,
        requestOptions: RequestOptions,
    ): Invoice {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("invoices", params.getPathParam(0), "mark_paid")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { markPaidHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
    }

    private val payHandler: Handler<Invoice> =
        jsonHandler<Invoice>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * This endpoint collects payment for an invoice using the customer's default payment method.
     * This action can only be taken on invoices with status "issued".
     */
    override suspend fun pay(params: InvoicePayParams, requestOptions: RequestOptions): Invoice {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("invoices", params.getPathParam(0), "pay")
                .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepareAsync(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { payHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
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
     *
     * If the invoice was used to purchase a credit block, but the invoice is not yet paid, the
     * credit block will be voided. If the invoice was created due to a top-up, the top-up will be
     * disabled.
     */
    override suspend fun void(params: InvoiceVoidParams, requestOptions: RequestOptions): Invoice {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("invoices", params.getPathParam(0), "void")
                .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepareAsync(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { voidHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
    }
}
