// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.InvoiceLineItemCreateParams
import com.withorb.api.models.InvoiceLineItemCreateResponse

interface InvoiceLineItemService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): InvoiceLineItemService

    /**
     * This creates a one-off fixed fee invoice line item on an Invoice. This can only be done for
     * invoices that are in a `draft` status.
     *
     * The behavior depends on which parameters are provided:
     * - If `item_id` is provided without `name`: The item is looked up by ID, and the item's name
     *   is used for the line item.
     * - If `name` is provided without `item_id`: An item with the given name is searched for in the
     *   account. If found, that item is used. If not found, a new item is created with that name.
     *   The new item's name is used for the line item.
     * - If both `item_id` and `name` are provided: The item is looked up by ID for association, but
     *   the provided `name` is used for the line item (not the item's name).
     */
    fun create(
        params: InvoiceLineItemCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InvoiceLineItemCreateResponse

    /**
     * A view of [InvoiceLineItemService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): InvoiceLineItemService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /invoice_line_items`, but is otherwise the same as
         * [InvoiceLineItemService.create].
         */
        @MustBeClosed
        fun create(
            params: InvoiceLineItemCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InvoiceLineItemCreateResponse>
    }
}
