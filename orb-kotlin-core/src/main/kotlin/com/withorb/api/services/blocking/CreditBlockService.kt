// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponse
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.CreditBlockDeleteParams
import com.withorb.api.models.CreditBlockRetrieveParams
import com.withorb.api.models.CreditBlockRetrieveResponse

interface CreditBlockService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CreditBlockService

    /** This endpoint returns a credit block identified by its block_id. */
    fun retrieve(
        blockId: String,
        params: CreditBlockRetrieveParams = CreditBlockRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreditBlockRetrieveResponse =
        retrieve(params.toBuilder().blockId(blockId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: CreditBlockRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreditBlockRetrieveResponse

    /** @see retrieve */
    fun retrieve(blockId: String, requestOptions: RequestOptions): CreditBlockRetrieveResponse =
        retrieve(blockId, CreditBlockRetrieveParams.none(), requestOptions)

    /**
     * This endpoint deletes a credit block by its ID.
     *
     * When a credit block is deleted:
     * - The block is removed from the customer's credit ledger.
     * - Any usage of the credit block is reversed, and the ledger is replayed as if the block never
     *   existed.
     * - If invoices were generated from the purchase of the credit block, they will be deleted if
     *   in draft status, voided if issued, or a credit note will be issued if the invoice is paid.
     *
     * <Note> Issued invoices that had credits applied from this block will not be regenerated, but
     * the ledger will reflect the state as if credits from the deleted block were never applied.
     * </Note>
     */
    fun delete(
        blockId: String,
        params: CreditBlockDeleteParams = CreditBlockDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().blockId(blockId).build(), requestOptions)

    /** @see delete */
    fun delete(
        params: CreditBlockDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(blockId: String, requestOptions: RequestOptions) =
        delete(blockId, CreditBlockDeleteParams.none(), requestOptions)

    /**
     * A view of [CreditBlockService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): CreditBlockService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /credit_blocks/{block_id}`, but is otherwise the
         * same as [CreditBlockService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            blockId: String,
            params: CreditBlockRetrieveParams = CreditBlockRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreditBlockRetrieveResponse> =
            retrieve(params.toBuilder().blockId(blockId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: CreditBlockRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreditBlockRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            blockId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CreditBlockRetrieveResponse> =
            retrieve(blockId, CreditBlockRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /credit_blocks/{block_id}`, but is otherwise the
         * same as [CreditBlockService.delete].
         */
        @MustBeClosed
        fun delete(
            blockId: String,
            params: CreditBlockDeleteParams = CreditBlockDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().blockId(blockId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: CreditBlockDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(blockId: String, requestOptions: RequestOptions): HttpResponse =
            delete(blockId, CreditBlockDeleteParams.none(), requestOptions)
    }
}
