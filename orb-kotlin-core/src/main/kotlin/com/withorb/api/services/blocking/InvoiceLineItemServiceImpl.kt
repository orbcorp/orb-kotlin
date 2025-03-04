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
import com.withorb.api.core.json
import com.withorb.api.core.prepare
import com.withorb.api.errors.OrbError
import com.withorb.api.models.InvoiceLineItemCreateParams
import com.withorb.api.models.InvoiceLineItemCreateResponse

class InvoiceLineItemServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    InvoiceLineItemService {

    private val errorHandler: Handler<OrbError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<InvoiceLineItemCreateResponse> =
        jsonHandler<InvoiceLineItemCreateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * This creates a one-off fixed fee invoice line item on an Invoice. This can only be done for
     * invoices that are in a `draft` status.
     */
    override fun create(
        params: InvoiceLineItemCreateParams,
        requestOptions: RequestOptions,
    ): InvoiceLineItemCreateResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("invoice_line_items")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { createHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
    }
}
