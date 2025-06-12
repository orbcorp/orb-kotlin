// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
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

interface InvoiceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): InvoiceServiceAsync

    /** This endpoint is used to create a one-off invoice for a customer. */
    suspend fun create(
        params: InvoiceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice

    /**
     * This endpoint allows you to update the `metadata` property on an invoice. If you pass null
     * for the metadata value, it will clear any existing metadata for that invoice.
     *
     * `metadata` can be modified regardless of invoice state.
     */
    suspend fun update(
        invoiceId: String,
        params: InvoiceUpdateParams = InvoiceUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice = update(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

    /** @see [update] */
    suspend fun update(
        params: InvoiceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice

    /** @see [update] */
    suspend fun update(invoiceId: String, requestOptions: RequestOptions): Invoice =
        update(invoiceId, InvoiceUpdateParams.none(), requestOptions)

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
    suspend fun list(
        params: InvoiceListParams = InvoiceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InvoiceListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): InvoiceListPageAsync =
        list(InvoiceListParams.none(), requestOptions)

    /**
     * This endpoint is used to fetch an [`Invoice`](/core-concepts#invoice) given an identifier.
     */
    suspend fun fetch(
        invoiceId: String,
        params: InvoiceFetchParams = InvoiceFetchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice = fetch(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

    /** @see [fetch] */
    suspend fun fetch(
        params: InvoiceFetchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice

    /** @see [fetch] */
    suspend fun fetch(invoiceId: String, requestOptions: RequestOptions): Invoice =
        fetch(invoiceId, InvoiceFetchParams.none(), requestOptions)

    /**
     * This endpoint can be used to fetch the upcoming [invoice](/core-concepts#invoice) for the
     * current billing period given a subscription.
     */
    suspend fun fetchUpcoming(
        params: InvoiceFetchUpcomingParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InvoiceFetchUpcomingResponse

    /**
     * This endpoint allows an eligible invoice to be issued manually. This is only possible with
     * invoices where status is `draft`, `will_auto_issue` is false, and an `eligible_to_issue_at`
     * is a time in the past. Issuing an invoice could possibly trigger side effects, some of which
     * could be customer-visible (e.g. sending emails, auto-collecting payment, syncing the invoice
     * to external providers, etc).
     */
    suspend fun issue(
        invoiceId: String,
        params: InvoiceIssueParams = InvoiceIssueParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice = issue(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

    /** @see [issue] */
    suspend fun issue(
        params: InvoiceIssueParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice

    /** @see [issue] */
    suspend fun issue(invoiceId: String, requestOptions: RequestOptions): Invoice =
        issue(invoiceId, InvoiceIssueParams.none(), requestOptions)

    /**
     * This endpoint allows an invoice's status to be set the `paid` status. This can only be done
     * to invoices that are in the `issued` status.
     */
    suspend fun markPaid(
        invoiceId: String,
        params: InvoiceMarkPaidParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice = markPaid(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

    /** @see [markPaid] */
    suspend fun markPaid(
        params: InvoiceMarkPaidParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice

    /**
     * This endpoint collects payment for an invoice using the customer's default payment method.
     * This action can only be taken on invoices with status "issued".
     */
    suspend fun pay(
        invoiceId: String,
        params: InvoicePayParams = InvoicePayParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice = pay(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

    /** @see [pay] */
    suspend fun pay(
        params: InvoicePayParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice

    /** @see [pay] */
    suspend fun pay(invoiceId: String, requestOptions: RequestOptions): Invoice =
        pay(invoiceId, InvoicePayParams.none(), requestOptions)

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
    suspend fun void(
        invoiceId: String,
        params: InvoiceVoidParams = InvoiceVoidParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice = void(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

    /** @see [void] */
    suspend fun void(
        params: InvoiceVoidParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice

    /** @see [void] */
    suspend fun void(invoiceId: String, requestOptions: RequestOptions): Invoice =
        void(invoiceId, InvoiceVoidParams.none(), requestOptions)

    /**
     * A view of [InvoiceServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): InvoiceServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /invoices`, but is otherwise the same as
         * [InvoiceServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: InvoiceCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice>

        /**
         * Returns a raw HTTP response for `put /invoices/{invoice_id}`, but is otherwise the same
         * as [InvoiceServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            invoiceId: String,
            params: InvoiceUpdateParams = InvoiceUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice> =
            update(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        suspend fun update(
            params: InvoiceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice>

        /** @see [update] */
        @MustBeClosed
        suspend fun update(
            invoiceId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Invoice> = update(invoiceId, InvoiceUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /invoices`, but is otherwise the same as
         * [InvoiceServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: InvoiceListParams = InvoiceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InvoiceListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<InvoiceListPageAsync> =
            list(InvoiceListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /invoices/{invoice_id}`, but is otherwise the same
         * as [InvoiceServiceAsync.fetch].
         */
        @MustBeClosed
        suspend fun fetch(
            invoiceId: String,
            params: InvoiceFetchParams = InvoiceFetchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice> =
            fetch(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

        /** @see [fetch] */
        @MustBeClosed
        suspend fun fetch(
            params: InvoiceFetchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice>

        /** @see [fetch] */
        @MustBeClosed
        suspend fun fetch(
            invoiceId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Invoice> = fetch(invoiceId, InvoiceFetchParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /invoices/upcoming`, but is otherwise the same as
         * [InvoiceServiceAsync.fetchUpcoming].
         */
        @MustBeClosed
        suspend fun fetchUpcoming(
            params: InvoiceFetchUpcomingParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InvoiceFetchUpcomingResponse>

        /**
         * Returns a raw HTTP response for `post /invoices/{invoice_id}/issue`, but is otherwise the
         * same as [InvoiceServiceAsync.issue].
         */
        @MustBeClosed
        suspend fun issue(
            invoiceId: String,
            params: InvoiceIssueParams = InvoiceIssueParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice> =
            issue(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

        /** @see [issue] */
        @MustBeClosed
        suspend fun issue(
            params: InvoiceIssueParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice>

        /** @see [issue] */
        @MustBeClosed
        suspend fun issue(
            invoiceId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Invoice> = issue(invoiceId, InvoiceIssueParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /invoices/{invoice_id}/mark_paid`, but is otherwise
         * the same as [InvoiceServiceAsync.markPaid].
         */
        @MustBeClosed
        suspend fun markPaid(
            invoiceId: String,
            params: InvoiceMarkPaidParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice> =
            markPaid(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

        /** @see [markPaid] */
        @MustBeClosed
        suspend fun markPaid(
            params: InvoiceMarkPaidParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice>

        /**
         * Returns a raw HTTP response for `post /invoices/{invoice_id}/pay`, but is otherwise the
         * same as [InvoiceServiceAsync.pay].
         */
        @MustBeClosed
        suspend fun pay(
            invoiceId: String,
            params: InvoicePayParams = InvoicePayParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice> =
            pay(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

        /** @see [pay] */
        @MustBeClosed
        suspend fun pay(
            params: InvoicePayParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice>

        /** @see [pay] */
        @MustBeClosed
        suspend fun pay(
            invoiceId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Invoice> = pay(invoiceId, InvoicePayParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /invoices/{invoice_id}/void`, but is otherwise the
         * same as [InvoiceServiceAsync.void].
         */
        @MustBeClosed
        suspend fun void(
            invoiceId: String,
            params: InvoiceVoidParams = InvoiceVoidParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice> =
            void(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

        /** @see [void] */
        @MustBeClosed
        suspend fun void(
            params: InvoiceVoidParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice>

        /** @see [void] */
        @MustBeClosed
        suspend fun void(
            invoiceId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Invoice> = void(invoiceId, InvoiceVoidParams.none(), requestOptions)
    }
}
