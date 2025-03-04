// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.handlers.errorHandler
import com.withorb.api.core.handlers.jsonHandler
import com.withorb.api.core.handlers.withErrorHandler
import com.withorb.api.core.http.HttpMethod
import com.withorb.api.core.http.HttpRequest
import com.withorb.api.core.http.HttpResponse.Handler
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.core.http.parseable
import com.withorb.api.core.json
import com.withorb.api.core.prepare
import com.withorb.api.errors.OrbError
import com.withorb.api.models.InvoiceLineItemCreateParams
import com.withorb.api.models.InvoiceLineItemCreateResponse

class InvoiceLineItemServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    InvoiceLineItemService {

    private val withRawResponse: InvoiceLineItemService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InvoiceLineItemService.WithRawResponse = withRawResponse

    override fun create(
        params: InvoiceLineItemCreateParams,
        requestOptions: RequestOptions,
    ): InvoiceLineItemCreateResponse =
        // post /invoice_line_items
        withRawResponse().create(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InvoiceLineItemService.WithRawResponse {

        private val errorHandler: Handler<OrbError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<InvoiceLineItemCreateResponse> =
            jsonHandler<InvoiceLineItemCreateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: InvoiceLineItemCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InvoiceLineItemCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("invoice_line_items")
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
    }
}
