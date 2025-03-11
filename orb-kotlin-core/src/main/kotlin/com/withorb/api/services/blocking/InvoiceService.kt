// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.Invoice
import com.withorb.api.models.InvoiceCreateParams
import com.withorb.api.models.InvoiceFetchParams
import com.withorb.api.models.InvoiceFetchUpcomingParams
import com.withorb.api.models.InvoiceFetchUpcomingResponse
import com.withorb.api.models.InvoiceIssueParams
import com.withorb.api.models.InvoiceListPage
import com.withorb.api.models.InvoiceListParams
import com.withorb.api.models.InvoiceMarkPaidParams
import com.withorb.api.models.InvoicePayParams
import com.withorb.api.models.InvoiceUpdateParams
import com.withorb.api.models.InvoiceVoidParams

interface InvoiceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /** This endpoint is used to create a one-off invoice for a customer. */
    fun create(params: InvoiceCreateParams, requestOptions: RequestOptions = RequestOptions.none()): Invoice

    /**
     * This endpoint allows you to update the `metadata` property on an invoice. If you
     * pass null for the metadata value, it will clear any existing metadata for that
     * invoice.
     *
     * `metadata` can be modified regardless of invoice state.
     */
    fun update(params: InvoiceUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): Invoice

    /**
     * This endpoint returns a list of all [`Invoice`](/core-concepts#invoice)s for an
     * account in a list format.
     *
     * The list of invoices is ordered starting from the most recently issued invoice
     * date. The response also includes
     * [`pagination_metadata`](/api-reference/pagination), which lets the caller
     * retrieve the next page of results if they exist.
     *
     * By default, this only returns invoices that are `issued`, `paid`, or `synced`.
     *
     * When fetching any `draft` invoices, this returns the last-computed invoice
     * values for each draft invoice, which may not always be up-to-date since Orb
     * regularly refreshes invoices asynchronously.
     */
    fun list(params: InvoiceListParams = InvoiceListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): InvoiceListPage

    /** @see [list] */
    fun list(requestOptions: RequestOptions): InvoiceListPage = list(InvoiceListParams.none(), requestOptions)

    /**
     * This endpoint is used to fetch an [`Invoice`](/core-concepts#invoice) given an
     * identifier.
     */
    fun fetch(params: InvoiceFetchParams, requestOptions: RequestOptions = RequestOptions.none()): Invoice

    /**
     * This endpoint can be used to fetch the upcoming
     * [invoice](/core-concepts#invoice) for the current billing period given a
     * subscription.
     */
    fun fetchUpcoming(params: InvoiceFetchUpcomingParams, requestOptions: RequestOptions = RequestOptions.none()): InvoiceFetchUpcomingResponse

    /**
     * This endpoint allows an eligible invoice to be issued manually. This is only
     * possible with invoices where status is `draft`, `will_auto_issue` is false, and
     * an `eligible_to_issue_at` is a time in the past. Issuing an invoice could
     * possibly trigger side effects, some of which could be customer-visible (e.g.
     * sending emails, auto-collecting payment, syncing the invoice to external
     * providers, etc).
     */
    fun issue(params: InvoiceIssueParams, requestOptions: RequestOptions = RequestOptions.none()): Invoice

    /**
     * This endpoint allows an invoice's status to be set the `paid` status. This can
     * only be done to invoices that are in the `issued` status.
     */
    fun markPaid(params: InvoiceMarkPaidParams, requestOptions: RequestOptions = RequestOptions.none()): Invoice

    /**
     * This endpoint collects payment for an invoice using the customer's default
     * payment method. This action can only be taken on invoices with status "issued".
     */
    fun pay(params: InvoicePayParams, requestOptions: RequestOptions = RequestOptions.none()): Invoice

    /**
     * This endpoint allows an invoice's status to be set the `void` status. This can
     * only be done to invoices that are in the `issued` status.
     *
     * If the associated invoice has used the customer balance to change the amount
     * due, the customer balance operation will be reverted. For example, if the
     * invoice used $10 of customer balance, that amount will be added back to the
     * customer balance upon voiding.
     *
     * If the invoice was used to purchase a credit block, but the invoice is not yet
     * paid, the credit block will be voided. If the invoice was created due to a
     * top-up, the top-up will be disabled.
     */
    fun void(params: InvoiceVoidParams, requestOptions: RequestOptions = RequestOptions.none()): Invoice

    /**
     * A view of [InvoiceService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /invoices`, but is otherwise the same as
         * [InvoiceService.create].
         */
        @MustBeClosed
        fun create(params: InvoiceCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<Invoice>

        /**
         * Returns a raw HTTP response for `put /invoices/{invoice_id}`, but is otherwise
         * the same as [InvoiceService.update].
         */
        @MustBeClosed
        fun update(params: InvoiceUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<Invoice>

        /**
         * Returns a raw HTTP response for `get /invoices`, but is otherwise the same as
         * [InvoiceService.list].
         */
        @MustBeClosed
        fun list(params: InvoiceListParams = InvoiceListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<InvoiceListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<InvoiceListPage> = list(InvoiceListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /invoices/{invoice_id}`, but is otherwise
         * the same as [InvoiceService.fetch].
         */
        @MustBeClosed
        fun fetch(params: InvoiceFetchParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<Invoice>

        /**
         * Returns a raw HTTP response for `get /invoices/upcoming`, but is otherwise the
         * same as [InvoiceService.fetchUpcoming].
         */
        @MustBeClosed
        fun fetchUpcoming(params: InvoiceFetchUpcomingParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<InvoiceFetchUpcomingResponse>

        /**
         * Returns a raw HTTP response for `post /invoices/{invoice_id}/issue`, but is
         * otherwise the same as [InvoiceService.issue].
         */
        @MustBeClosed
        fun issue(params: InvoiceIssueParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<Invoice>

        /**
         * Returns a raw HTTP response for `post /invoices/{invoice_id}/mark_paid`, but is
         * otherwise the same as [InvoiceService.markPaid].
         */
        @MustBeClosed
        fun markPaid(params: InvoiceMarkPaidParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<Invoice>

        /**
         * Returns a raw HTTP response for `post /invoices/{invoice_id}/pay`, but is
         * otherwise the same as [InvoiceService.pay].
         */
        @MustBeClosed
        fun pay(params: InvoicePayParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<Invoice>

        /**
         * Returns a raw HTTP response for `post /invoices/{invoice_id}/void`, but is
         * otherwise the same as [InvoiceService.void].
         */
        @MustBeClosed
        fun void(params: InvoiceVoidParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<Invoice>
    }
}
