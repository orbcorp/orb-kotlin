// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.CreditNote
import com.withorb.api.models.CreditNoteCreateParams
import com.withorb.api.models.CreditNoteFetchParams
import com.withorb.api.models.CreditNoteListPage
import com.withorb.api.models.CreditNoteListParams

interface CreditNoteService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CreditNoteService

    /**
     * This endpoint is used to create a single [`Credit Note`](/invoicing/credit-notes).
     *
     * The credit note service period configuration supports two explicit modes:
     * 1. Global service periods: Specify start_date and end_date at the credit note level. These
     *    dates will be applied to all line items uniformly.
     * 2. Individual service periods: Specify start_date and end_date for each line item. When using
     *    this mode, ALL line items must have individual periods specified.
     * 3. Default behavior: If no service periods are specified (neither global nor individual), the
     *    original invoice line item service periods will be used.
     *
     * Note: Mixing global and individual service periods in the same request is not allowed to
     * prevent confusion.
     *
     * Service period dates are normalized to the start of the day in the customer's timezone to
     * ensure consistent handling across different timezones.
     *
     * Date Format: Use start_date and end_date with format "YYYY-MM-DD" (e.g., "2023-09-22") to
     * match other Orb APIs like /v1/invoice_line_items.
     *
     * Note: Both start_date and end_date are inclusive - the service period will cover both the
     * start date and end date completely (from start of start_date to end of end_date).
     */
    fun create(
        params: CreditNoteCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreditNote

    /**
     * Get a paginated list of CreditNotes. Users can also filter by customer_id, subscription_id,
     * or external_customer_id. The credit notes will be returned in reverse chronological order by
     * `creation_time`.
     */
    fun list(
        params: CreditNoteListParams = CreditNoteListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreditNoteListPage

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CreditNoteListPage =
        list(CreditNoteListParams.none(), requestOptions)

    /**
     * This endpoint is used to fetch a single [`Credit Note`](/invoicing/credit-notes) given an
     * identifier.
     */
    fun fetch(
        creditNoteId: String,
        params: CreditNoteFetchParams = CreditNoteFetchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreditNote = fetch(params.toBuilder().creditNoteId(creditNoteId).build(), requestOptions)

    /** @see [fetch] */
    fun fetch(
        params: CreditNoteFetchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreditNote

    /** @see [fetch] */
    fun fetch(creditNoteId: String, requestOptions: RequestOptions): CreditNote =
        fetch(creditNoteId, CreditNoteFetchParams.none(), requestOptions)

    /** A view of [CreditNoteService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): CreditNoteService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /credit_notes`, but is otherwise the same as
         * [CreditNoteService.create].
         */
        @MustBeClosed
        fun create(
            params: CreditNoteCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreditNote>

        /**
         * Returns a raw HTTP response for `get /credit_notes`, but is otherwise the same as
         * [CreditNoteService.list].
         */
        @MustBeClosed
        fun list(
            params: CreditNoteListParams = CreditNoteListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreditNoteListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CreditNoteListPage> =
            list(CreditNoteListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /credit_notes/{credit_note_id}`, but is otherwise
         * the same as [CreditNoteService.fetch].
         */
        @MustBeClosed
        fun fetch(
            creditNoteId: String,
            params: CreditNoteFetchParams = CreditNoteFetchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreditNote> =
            fetch(params.toBuilder().creditNoteId(creditNoteId).build(), requestOptions)

        /** @see [fetch] */
        @MustBeClosed
        fun fetch(
            params: CreditNoteFetchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreditNote>

        /** @see [fetch] */
        @MustBeClosed
        fun fetch(
            creditNoteId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CreditNote> =
            fetch(creditNoteId, CreditNoteFetchParams.none(), requestOptions)
    }
}
