// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponse
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.Invoice
import com.withorb.api.models.InvoiceCreateParams
import com.withorb.api.models.InvoiceDeleteLineItemParams
import com.withorb.api.models.InvoiceFetchParams
import com.withorb.api.models.InvoiceFetchUpcomingParams
import com.withorb.api.models.InvoiceFetchUpcomingResponse
import com.withorb.api.models.InvoiceIssueParams
import com.withorb.api.models.InvoiceIssueSummaryParams
import com.withorb.api.models.InvoiceIssueSummaryResponse
import com.withorb.api.models.InvoiceListPage
import com.withorb.api.models.InvoiceListParams
import com.withorb.api.models.InvoiceListSummaryPage
import com.withorb.api.models.InvoiceListSummaryParams
import com.withorb.api.models.InvoiceMarkPaidParams
import com.withorb.api.models.InvoicePayParams
import com.withorb.api.models.InvoiceRegenerateInvoicePdfParams
import com.withorb.api.models.InvoiceRegenerateReceiptPdfParams
import com.withorb.api.models.InvoiceUpdateParams
import com.withorb.api.models.InvoiceVoidParams

/**
 * An [`Invoice`](/core-concepts#invoice) is a fundamental billing entity, representing the request
 * for payment for a single subscription. This includes a set of line items, which correspond to
 * prices in the subscription's plan and can represent fixed recurring fees or usage-based fees.
 * They are generated at the end of a billing period, or as the result of an action, such as a
 * cancellation.
 */
interface InvoiceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): InvoiceService

    /** This endpoint is used to create a one-off invoice for a customer. */
    fun create(
        params: InvoiceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice

    /**
     * This endpoint allows you to update the `metadata`, `net_terms`, `due_date`, `invoice_date`,
     * and `auto_collection` properties on an invoice. If you pass null for the metadata value, it
     * will clear any existing metadata for that invoice.
     *
     * `metadata` can be modified regardless of invoice state. `net_terms`, `due_date`,
     * `invoice_date`, and `auto_collection` can only be modified if the invoice is in a `draft`
     * state. `invoice_date` can only be modified for non-subscription invoices.
     */
    fun update(
        invoiceId: String,
        params: InvoiceUpdateParams = InvoiceUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice = update(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

    /** @see update */
    fun update(
        params: InvoiceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice

    /** @see update */
    fun update(invoiceId: String, requestOptions: RequestOptions): Invoice =
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
     *
     * If you don't need line item details, minimums, maximums, or discounts, prefer the
     * [list invoices summary](/api-reference/invoice/list-invoices-summary) endpoint for better
     * performance.
     */
    fun list(
        params: InvoiceListParams = InvoiceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InvoiceListPage

    /** @see list */
    fun list(requestOptions: RequestOptions): InvoiceListPage =
        list(InvoiceListParams.none(), requestOptions)

    /**
     * This endpoint deletes an invoice line item from a draft invoice.
     *
     * This endpoint only allows deletion of one-off line items (not subscription-based line items).
     * The invoice must be in a draft status for this operation to succeed.
     */
    fun deleteLineItem(
        lineItemId: String,
        params: InvoiceDeleteLineItemParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = deleteLineItem(params.toBuilder().lineItemId(lineItemId).build(), requestOptions)

    /** @see deleteLineItem */
    fun deleteLineItem(
        params: InvoiceDeleteLineItemParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * This endpoint is used to fetch an [`Invoice`](/core-concepts#invoice) given an identifier.
     */
    fun fetch(
        invoiceId: String,
        params: InvoiceFetchParams = InvoiceFetchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice = fetch(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

    /** @see fetch */
    fun fetch(
        params: InvoiceFetchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice

    /** @see fetch */
    fun fetch(invoiceId: String, requestOptions: RequestOptions): Invoice =
        fetch(invoiceId, InvoiceFetchParams.none(), requestOptions)

    /**
     * This endpoint can be used to fetch the upcoming [invoice](/core-concepts#invoice) for the
     * current billing period given a subscription.
     */
    fun fetchUpcoming(
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
    fun issue(
        invoiceId: String,
        params: InvoiceIssueParams = InvoiceIssueParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice = issue(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

    /** @see issue */
    fun issue(
        params: InvoiceIssueParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice

    /** @see issue */
    fun issue(invoiceId: String, requestOptions: RequestOptions): Invoice =
        issue(invoiceId, InvoiceIssueParams.none(), requestOptions)

    /**
     * This endpoint allows an eligible invoice to be issued manually. This is only possible with
     * invoices where status is `draft`, `will_auto_issue` is false, and an `eligible_to_issue_at`
     * is a time in the past. Issuing an invoice could possibly trigger side effects, some of which
     * could be customer-visible (e.g. sending emails, auto-collecting payment, syncing the invoice
     * to external providers, etc).
     *
     * This is a lighter-weight alternative to the issue invoice endpoint, returning an invoice
     * summary without any line item details.
     */
    fun issueSummary(
        invoiceId: String,
        params: InvoiceIssueSummaryParams = InvoiceIssueSummaryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InvoiceIssueSummaryResponse =
        issueSummary(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

    /** @see issueSummary */
    fun issueSummary(
        params: InvoiceIssueSummaryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InvoiceIssueSummaryResponse

    /** @see issueSummary */
    fun issueSummary(
        invoiceId: String,
        requestOptions: RequestOptions,
    ): InvoiceIssueSummaryResponse =
        issueSummary(invoiceId, InvoiceIssueSummaryParams.none(), requestOptions)

    /**
     * This is a lighter-weight endpoint that returns a list of all
     * [`Invoice`](/core-concepts#invoice) summaries for an account in a list format.
     *
     * These invoice summaries do not include line item details, minimums, maximums, and discounts,
     * making this endpoint more efficient.
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
    fun listSummary(
        params: InvoiceListSummaryParams = InvoiceListSummaryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InvoiceListSummaryPage

    /** @see listSummary */
    fun listSummary(requestOptions: RequestOptions): InvoiceListSummaryPage =
        listSummary(InvoiceListSummaryParams.none(), requestOptions)

    /**
     * This endpoint allows an invoice's status to be set to the `paid` status. This can only be
     * done to invoices that are in the `issued` or `synced` status.
     */
    fun markPaid(
        invoiceId: String,
        params: InvoiceMarkPaidParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice = markPaid(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

    /** @see markPaid */
    fun markPaid(
        params: InvoiceMarkPaidParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice

    /**
     * This endpoint collects payment for an invoice. By default, it uses the customer's default
     * payment method. Optionally, a shared payment token (SPT) can be provided to pay using
     * agent-granted credentials instead. This action can only be taken on invoices with status
     * "issued".
     */
    fun pay(
        invoiceId: String,
        params: InvoicePayParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice = pay(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

    /** @see pay */
    fun pay(
        params: InvoicePayParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice

    /**
     * This endpoint triggers a regeneration of the PDF for a finalized invoice.
     *
     * The invoice must be finalized (`issued`, `paid`, `synced`, or `void`) and must already have
     * an existing PDF. The original PDF is archived (not permanently deleted) to maintain an audit
     * trail.
     *
     * **Important Legal Considerations:**
     *
     * Regenerating invoice PDFs may not be permitted in all jurisdictions. Many tax authorities
     * require that issued invoices remain unmodified. Before using this endpoint, ensure that:
     * - Your local tax regulations permit modification of issued billing documents
     * - You have a legitimate business reason (e.g., fixing template errors, updating branding)
     * - You maintain proper records of the original PDF (archived automatically by Orb)
     *
     * Recommended use cases:
     * - Correcting template rendering issues
     * - Applying updated company branding
     * - Updating customer data that was incorrect at issuance
     */
    fun regenerateInvoicePdf(
        invoiceId: String,
        params: InvoiceRegenerateInvoicePdfParams = InvoiceRegenerateInvoicePdfParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice =
        regenerateInvoicePdf(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

    /** @see regenerateInvoicePdf */
    fun regenerateInvoicePdf(
        params: InvoiceRegenerateInvoicePdfParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice

    /** @see regenerateInvoicePdf */
    fun regenerateInvoicePdf(invoiceId: String, requestOptions: RequestOptions): Invoice =
        regenerateInvoicePdf(invoiceId, InvoiceRegenerateInvoicePdfParams.none(), requestOptions)

    /**
     * This endpoint triggers a regeneration of the receipt PDF for a paid invoice.
     *
     * The invoice must be in `paid` status and must already have an existing receipt PDF. The
     * original PDF is archived (not permanently deleted) to maintain an audit trail.
     *
     * **Important Legal Considerations:**
     *
     * Regenerating receipt PDFs may not be permitted in all jurisdictions. Many tax authorities
     * require that issued receipts remain unmodified. Before using this endpoint, ensure that:
     * - Your local tax regulations permit modification of issued billing documents
     * - You have a legitimate business reason (e.g., fixing template errors, updating branding)
     * - You maintain proper records of the original PDF (archived automatically by Orb)
     *
     * Recommended use cases:
     * - Correcting template rendering issues
     * - Applying updated company branding
     * - Updating customer data that was incorrect at issuance
     */
    fun regenerateReceiptPdf(
        invoiceId: String,
        params: InvoiceRegenerateReceiptPdfParams = InvoiceRegenerateReceiptPdfParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice =
        regenerateReceiptPdf(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

    /** @see regenerateReceiptPdf */
    fun regenerateReceiptPdf(
        params: InvoiceRegenerateReceiptPdfParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice

    /** @see regenerateReceiptPdf */
    fun regenerateReceiptPdf(invoiceId: String, requestOptions: RequestOptions): Invoice =
        regenerateReceiptPdf(invoiceId, InvoiceRegenerateReceiptPdfParams.none(), requestOptions)

    /**
     * This endpoint allows an invoice's status to be set to the `void` status. This can only be
     * done to invoices that are in the `issued` status.
     *
     * If the associated invoice has used the customer balance to change the amount due, the
     * customer balance operation will be reverted. For example, if the invoice used \$10 of
     * customer balance, that amount will be added back to the customer balance upon voiding.
     *
     * If the invoice was used to purchase a credit block, but the invoice is not yet paid, the
     * credit block will be voided. If the invoice was created due to a top-up, the top-up will be
     * disabled.
     */
    fun void(
        invoiceId: String,
        params: InvoiceVoidParams = InvoiceVoidParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice = void(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

    /** @see void */
    fun void(
        params: InvoiceVoidParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice

    /** @see void */
    fun void(invoiceId: String, requestOptions: RequestOptions): Invoice =
        void(invoiceId, InvoiceVoidParams.none(), requestOptions)

    /** A view of [InvoiceService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): InvoiceService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /invoices`, but is otherwise the same as
         * [InvoiceService.create].
         */
        @MustBeClosed
        fun create(
            params: InvoiceCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice>

        /**
         * Returns a raw HTTP response for `put /invoices/{invoice_id}`, but is otherwise the same
         * as [InvoiceService.update].
         */
        @MustBeClosed
        fun update(
            invoiceId: String,
            params: InvoiceUpdateParams = InvoiceUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice> =
            update(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: InvoiceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice>

        /** @see update */
        @MustBeClosed
        fun update(invoiceId: String, requestOptions: RequestOptions): HttpResponseFor<Invoice> =
            update(invoiceId, InvoiceUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /invoices`, but is otherwise the same as
         * [InvoiceService.list].
         */
        @MustBeClosed
        fun list(
            params: InvoiceListParams = InvoiceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InvoiceListPage>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<InvoiceListPage> =
            list(InvoiceListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /invoices/{invoice_id}/invoice_line_items/{line_item_id}`, but is otherwise the same as
         * [InvoiceService.deleteLineItem].
         */
        @MustBeClosed
        fun deleteLineItem(
            lineItemId: String,
            params: InvoiceDeleteLineItemParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            deleteLineItem(params.toBuilder().lineItemId(lineItemId).build(), requestOptions)

        /** @see deleteLineItem */
        @MustBeClosed
        fun deleteLineItem(
            params: InvoiceDeleteLineItemParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /invoices/{invoice_id}`, but is otherwise the same
         * as [InvoiceService.fetch].
         */
        @MustBeClosed
        fun fetch(
            invoiceId: String,
            params: InvoiceFetchParams = InvoiceFetchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice> =
            fetch(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

        /** @see fetch */
        @MustBeClosed
        fun fetch(
            params: InvoiceFetchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice>

        /** @see fetch */
        @MustBeClosed
        fun fetch(invoiceId: String, requestOptions: RequestOptions): HttpResponseFor<Invoice> =
            fetch(invoiceId, InvoiceFetchParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /invoices/upcoming`, but is otherwise the same as
         * [InvoiceService.fetchUpcoming].
         */
        @MustBeClosed
        fun fetchUpcoming(
            params: InvoiceFetchUpcomingParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InvoiceFetchUpcomingResponse>

        /**
         * Returns a raw HTTP response for `post /invoices/{invoice_id}/issue`, but is otherwise the
         * same as [InvoiceService.issue].
         */
        @MustBeClosed
        fun issue(
            invoiceId: String,
            params: InvoiceIssueParams = InvoiceIssueParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice> =
            issue(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

        /** @see issue */
        @MustBeClosed
        fun issue(
            params: InvoiceIssueParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice>

        /** @see issue */
        @MustBeClosed
        fun issue(invoiceId: String, requestOptions: RequestOptions): HttpResponseFor<Invoice> =
            issue(invoiceId, InvoiceIssueParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /invoices/summary/{invoice_id}/issue`, but is
         * otherwise the same as [InvoiceService.issueSummary].
         */
        @MustBeClosed
        fun issueSummary(
            invoiceId: String,
            params: InvoiceIssueSummaryParams = InvoiceIssueSummaryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InvoiceIssueSummaryResponse> =
            issueSummary(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

        /** @see issueSummary */
        @MustBeClosed
        fun issueSummary(
            params: InvoiceIssueSummaryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InvoiceIssueSummaryResponse>

        /** @see issueSummary */
        @MustBeClosed
        fun issueSummary(
            invoiceId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InvoiceIssueSummaryResponse> =
            issueSummary(invoiceId, InvoiceIssueSummaryParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /invoices/summary`, but is otherwise the same as
         * [InvoiceService.listSummary].
         */
        @MustBeClosed
        fun listSummary(
            params: InvoiceListSummaryParams = InvoiceListSummaryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InvoiceListSummaryPage>

        /** @see listSummary */
        @MustBeClosed
        fun listSummary(requestOptions: RequestOptions): HttpResponseFor<InvoiceListSummaryPage> =
            listSummary(InvoiceListSummaryParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /invoices/{invoice_id}/mark_paid`, but is otherwise
         * the same as [InvoiceService.markPaid].
         */
        @MustBeClosed
        fun markPaid(
            invoiceId: String,
            params: InvoiceMarkPaidParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice> =
            markPaid(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

        /** @see markPaid */
        @MustBeClosed
        fun markPaid(
            params: InvoiceMarkPaidParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice>

        /**
         * Returns a raw HTTP response for `post /invoices/{invoice_id}/pay`, but is otherwise the
         * same as [InvoiceService.pay].
         */
        @MustBeClosed
        fun pay(
            invoiceId: String,
            params: InvoicePayParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice> =
            pay(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

        /** @see pay */
        @MustBeClosed
        fun pay(
            params: InvoicePayParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice>

        /**
         * Returns a raw HTTP response for `post /invoices/{invoice_id}/regenerate_invoice_pdf`, but
         * is otherwise the same as [InvoiceService.regenerateInvoicePdf].
         */
        @MustBeClosed
        fun regenerateInvoicePdf(
            invoiceId: String,
            params: InvoiceRegenerateInvoicePdfParams = InvoiceRegenerateInvoicePdfParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice> =
            regenerateInvoicePdf(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

        /** @see regenerateInvoicePdf */
        @MustBeClosed
        fun regenerateInvoicePdf(
            params: InvoiceRegenerateInvoicePdfParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice>

        /** @see regenerateInvoicePdf */
        @MustBeClosed
        fun regenerateInvoicePdf(
            invoiceId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Invoice> =
            regenerateInvoicePdf(
                invoiceId,
                InvoiceRegenerateInvoicePdfParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post /invoices/{invoice_id}/regenerate_receipt_pdf`, but
         * is otherwise the same as [InvoiceService.regenerateReceiptPdf].
         */
        @MustBeClosed
        fun regenerateReceiptPdf(
            invoiceId: String,
            params: InvoiceRegenerateReceiptPdfParams = InvoiceRegenerateReceiptPdfParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice> =
            regenerateReceiptPdf(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

        /** @see regenerateReceiptPdf */
        @MustBeClosed
        fun regenerateReceiptPdf(
            params: InvoiceRegenerateReceiptPdfParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice>

        /** @see regenerateReceiptPdf */
        @MustBeClosed
        fun regenerateReceiptPdf(
            invoiceId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Invoice> =
            regenerateReceiptPdf(
                invoiceId,
                InvoiceRegenerateReceiptPdfParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post /invoices/{invoice_id}/void`, but is otherwise the
         * same as [InvoiceService.void].
         */
        @MustBeClosed
        fun void(
            invoiceId: String,
            params: InvoiceVoidParams = InvoiceVoidParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice> =
            void(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

        /** @see void */
        @MustBeClosed
        fun void(
            params: InvoiceVoidParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice>

        /** @see void */
        @MustBeClosed
        fun void(invoiceId: String, requestOptions: RequestOptions): HttpResponseFor<Invoice> =
            void(invoiceId, InvoiceVoidParams.none(), requestOptions)
    }
}
