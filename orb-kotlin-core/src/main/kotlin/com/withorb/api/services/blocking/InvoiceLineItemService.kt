// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.InvoiceLineItemCreateParams
import com.withorb.api.models.InvoiceLineItemCreateResponse

interface InvoiceLineItemService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * This creates a one-off fixed fee invoice line item on an Invoice. This can only
     * be done for invoices that are in a `draft` status.
     */
    fun create(params: InvoiceLineItemCreateParams, requestOptions: RequestOptions = RequestOptions.none()): InvoiceLineItemCreateResponse

    /**
     * A view of [InvoiceLineItemService] that provides access to raw HTTP responses
     * for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /invoice_line_items`, but is otherwise the
         * same as [InvoiceLineItemService.create].
         */
        @MustBeClosed
        fun create(params: InvoiceLineItemCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<InvoiceLineItemCreateResponse>
    }
}
