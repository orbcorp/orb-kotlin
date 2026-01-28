// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.checkRequired
import com.withorb.api.core.handlers.emptyHandler
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
import com.withorb.api.core.prepare
import com.withorb.api.models.Invoice
import com.withorb.api.models.InvoiceCreateParams
import com.withorb.api.models.InvoiceDeleteLineItemParams
import com.withorb.api.models.InvoiceFetchParams
import com.withorb.api.models.InvoiceFetchUpcomingParams
import com.withorb.api.models.InvoiceFetchUpcomingResponse
import com.withorb.api.models.InvoiceIssueParams
import com.withorb.api.models.InvoiceListPage
import com.withorb.api.models.InvoiceListPageResponse
import com.withorb.api.models.InvoiceListParams
import com.withorb.api.models.InvoiceListSummaryPage
import com.withorb.api.models.InvoiceListSummaryPageResponse
import com.withorb.api.models.InvoiceListSummaryParams
import com.withorb.api.models.InvoiceMarkPaidParams
import com.withorb.api.models.InvoicePayParams
import com.withorb.api.models.InvoiceUpdateParams
import com.withorb.api.models.InvoiceVoidParams

class InvoiceServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    InvoiceService {

    private val withRawResponse: InvoiceService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InvoiceService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): InvoiceService =
        InvoiceServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun create(params: InvoiceCreateParams, requestOptions: RequestOptions): Invoice =
        // post /invoices
        withRawResponse().create(params, requestOptions).parse()

    override fun update(params: InvoiceUpdateParams, requestOptions: RequestOptions): Invoice =
        // put /invoices/{invoice_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: InvoiceListParams, requestOptions: RequestOptions): InvoiceListPage =
        // get /invoices
        withRawResponse().list(params, requestOptions).parse()

    override fun deleteLineItem(
        params: InvoiceDeleteLineItemParams,
        requestOptions: RequestOptions,
    ) {
        // delete /invoices/{invoice_id}/invoice_line_items/{line_item_id}
        withRawResponse().deleteLineItem(params, requestOptions)
    }

    override fun fetch(params: InvoiceFetchParams, requestOptions: RequestOptions): Invoice =
        // get /invoices/{invoice_id}
        withRawResponse().fetch(params, requestOptions).parse()

    override fun fetchUpcoming(
        params: InvoiceFetchUpcomingParams,
        requestOptions: RequestOptions,
    ): InvoiceFetchUpcomingResponse =
        // get /invoices/upcoming
        withRawResponse().fetchUpcoming(params, requestOptions).parse()

    override fun issue(params: InvoiceIssueParams, requestOptions: RequestOptions): Invoice =
        // post /invoices/{invoice_id}/issue
        withRawResponse().issue(params, requestOptions).parse()

    override fun listSummary(
        params: InvoiceListSummaryParams,
        requestOptions: RequestOptions,
    ): InvoiceListSummaryPage =
        // get /invoices/summary
        withRawResponse().listSummary(params, requestOptions).parse()

    override fun markPaid(params: InvoiceMarkPaidParams, requestOptions: RequestOptions): Invoice =
        // post /invoices/{invoice_id}/mark_paid
        withRawResponse().markPaid(params, requestOptions).parse()

    override fun pay(params: InvoicePayParams, requestOptions: RequestOptions): Invoice =
        // post /invoices/{invoice_id}/pay
        withRawResponse().pay(params, requestOptions).parse()

    override fun void(params: InvoiceVoidParams, requestOptions: RequestOptions): Invoice =
        // post /invoices/{invoice_id}/void
        withRawResponse().void(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InvoiceService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): InvoiceService.WithRawResponse =
            InvoiceServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<Invoice> = jsonHandler<Invoice>(clientOptions.jsonMapper)

        override fun create(
            params: InvoiceCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Invoice> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("invoices")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        private val updateHandler: Handler<Invoice> = jsonHandler<Invoice>(clientOptions.jsonMapper)

        override fun update(
            params: InvoiceUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Invoice> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("invoiceId", params.invoiceId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("invoices", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<InvoiceListPageResponse> =
            jsonHandler<InvoiceListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: InvoiceListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InvoiceListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("invoices")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        InvoiceListPage.builder()
                            .service(InvoiceServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteLineItemHandler: Handler<Void?> = emptyHandler()

        override fun deleteLineItem(
            params: InvoiceDeleteLineItemParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("lineItemId", params.lineItemId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "invoices",
                        params._pathParam(0),
                        "invoice_line_items",
                        params._pathParam(1),
                    )
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteLineItemHandler.handle(it) }
            }
        }

        private val fetchHandler: Handler<Invoice> = jsonHandler<Invoice>(clientOptions.jsonMapper)

        override fun fetch(
            params: InvoiceFetchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Invoice> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("invoiceId", params.invoiceId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("invoices", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { fetchHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val fetchUpcomingHandler: Handler<InvoiceFetchUpcomingResponse> =
            jsonHandler<InvoiceFetchUpcomingResponse>(clientOptions.jsonMapper)

        override fun fetchUpcoming(
            params: InvoiceFetchUpcomingParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InvoiceFetchUpcomingResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("invoices", "upcoming")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { fetchUpcomingHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val issueHandler: Handler<Invoice> = jsonHandler<Invoice>(clientOptions.jsonMapper)

        override fun issue(
            params: InvoiceIssueParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Invoice> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("invoiceId", params.invoiceId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("invoices", params._pathParam(0), "issue")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { issueHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listSummaryHandler: Handler<InvoiceListSummaryPageResponse> =
            jsonHandler<InvoiceListSummaryPageResponse>(clientOptions.jsonMapper)

        override fun listSummary(
            params: InvoiceListSummaryParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InvoiceListSummaryPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("invoices", "summary")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listSummaryHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        InvoiceListSummaryPage.builder()
                            .service(InvoiceServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val markPaidHandler: Handler<Invoice> =
            jsonHandler<Invoice>(clientOptions.jsonMapper)

        override fun markPaid(
            params: InvoiceMarkPaidParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Invoice> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("invoiceId", params.invoiceId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("invoices", params._pathParam(0), "mark_paid")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { markPaidHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val payHandler: Handler<Invoice> = jsonHandler<Invoice>(clientOptions.jsonMapper)

        override fun pay(
            params: InvoicePayParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Invoice> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("invoiceId", params.invoiceId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("invoices", params._pathParam(0), "pay")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { payHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val voidHandler: Handler<Invoice> = jsonHandler<Invoice>(clientOptions.jsonMapper)

        override fun void(
            params: InvoiceVoidParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Invoice> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("invoiceId", params.invoiceId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("invoices", params._pathParam(0), "void")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { voidHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
