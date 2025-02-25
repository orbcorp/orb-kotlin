// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import com.withorb.api.core.RequestOptions
import com.withorb.api.models.CreditNote
import com.withorb.api.models.CreditNoteCreateParams
import com.withorb.api.models.CreditNoteFetchParams
import com.withorb.api.models.CreditNoteListPage
import com.withorb.api.models.CreditNoteListParams

interface CreditNoteService {

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

    /**
     * Get a paginated list of CreditNotes. Users can also filter by customer_id, subscription_id,
     * or external_customer_id. The credit notes will be returned in reverse chronological order by
     * `creation_time`.
     */
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
}
