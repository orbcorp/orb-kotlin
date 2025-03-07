// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
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

    /** This endpoint is used to create a single [`Credit Note`](/invoicing/credit-notes). */
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
        params: CreditNoteFetchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreditNote

    /** A view of [CreditNoteService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

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
            params: CreditNoteFetchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreditNote>
    }
}
