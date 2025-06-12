// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.CreditNote
import com.withorb.api.models.CreditNoteCreateParams
import com.withorb.api.models.CreditNoteFetchParams
import com.withorb.api.models.CreditNoteListPageAsync
import com.withorb.api.models.CreditNoteListParams

interface CreditNoteServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CreditNoteServiceAsync

    /** This endpoint is used to create a single [`Credit Note`](/invoicing/credit-notes). */
    suspend fun create(
        params: CreditNoteCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreditNote

    /**
     * Get a paginated list of CreditNotes. Users can also filter by customer_id, subscription_id,
     * or external_customer_id. The credit notes will be returned in reverse chronological order by
     * `creation_time`.
     */
    suspend fun list(
        params: CreditNoteListParams = CreditNoteListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreditNoteListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): CreditNoteListPageAsync =
        list(CreditNoteListParams.none(), requestOptions)

    /**
     * This endpoint is used to fetch a single [`Credit Note`](/invoicing/credit-notes) given an
     * identifier.
     */
    suspend fun fetch(
        creditNoteId: String,
        params: CreditNoteFetchParams = CreditNoteFetchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreditNote = fetch(params.toBuilder().creditNoteId(creditNoteId).build(), requestOptions)

    /** @see [fetch] */
    suspend fun fetch(
        params: CreditNoteFetchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreditNote

    /** @see [fetch] */
    suspend fun fetch(creditNoteId: String, requestOptions: RequestOptions): CreditNote =
        fetch(creditNoteId, CreditNoteFetchParams.none(), requestOptions)

    /**
     * A view of [CreditNoteServiceAsync] that provides access to raw HTTP responses for each
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
        ): CreditNoteServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /credit_notes`, but is otherwise the same as
         * [CreditNoteServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: CreditNoteCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreditNote>

        /**
         * Returns a raw HTTP response for `get /credit_notes`, but is otherwise the same as
         * [CreditNoteServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: CreditNoteListParams = CreditNoteListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreditNoteListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<CreditNoteListPageAsync> =
            list(CreditNoteListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /credit_notes/{credit_note_id}`, but is otherwise
         * the same as [CreditNoteServiceAsync.fetch].
         */
        @MustBeClosed
        suspend fun fetch(
            creditNoteId: String,
            params: CreditNoteFetchParams = CreditNoteFetchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreditNote> =
            fetch(params.toBuilder().creditNoteId(creditNoteId).build(), requestOptions)

        /** @see [fetch] */
        @MustBeClosed
        suspend fun fetch(
            params: CreditNoteFetchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreditNote>

        /** @see [fetch] */
        @MustBeClosed
        suspend fun fetch(
            creditNoteId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CreditNote> =
            fetch(creditNoteId, CreditNoteFetchParams.none(), requestOptions)
    }
}
