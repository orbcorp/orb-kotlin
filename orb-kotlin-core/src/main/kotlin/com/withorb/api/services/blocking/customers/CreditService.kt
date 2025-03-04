// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking.customers

import com.google.errorprone.annotations.MustBeClosed
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.CustomerCreditListByExternalIdPage
import com.withorb.api.models.CustomerCreditListByExternalIdParams
import com.withorb.api.models.CustomerCreditListPage
import com.withorb.api.models.CustomerCreditListParams
import com.withorb.api.services.blocking.customers.credits.LedgerService
import com.withorb.api.services.blocking.customers.credits.TopUpService

interface CreditService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun ledger(): LedgerService

    fun topUps(): TopUpService

    /**
     * Returns a paginated list of unexpired, non-zero credit blocks for a customer.
     *
     * If `include_all_blocks` is set to `true`, all credit blocks (including expired and depleted
     * blocks) will be included in the response.
     *
     * Note that `currency` defaults to credits if not specified. To use a real world currency, set
     * `currency` to an ISO 4217 string.
     */
    fun list(
        params: CustomerCreditListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerCreditListPage

    /**
     * Returns a paginated list of unexpired, non-zero credit blocks for a customer.
     *
     * If `include_all_blocks` is set to `true`, all credit blocks (including expired and depleted
     * blocks) will be included in the response.
     *
     * Note that `currency` defaults to credits if not specified. To use a real world currency, set
     * `currency` to an ISO 4217 string.
     */
    fun listByExternalId(
        params: CustomerCreditListByExternalIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerCreditListByExternalIdPage

    /** A view of [CreditService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        fun ledger(): LedgerService.WithRawResponse

        fun topUps(): TopUpService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /customers/{customer_id}/credits`, but is otherwise
         * the same as [CreditService.list].
         */
        @MustBeClosed
        fun list(
            params: CustomerCreditListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerCreditListPage>

        /**
         * Returns a raw HTTP response for `get
         * /customers/external_customer_id/{external_customer_id}/credits`, but is otherwise the
         * same as [CreditService.listByExternalId].
         */
        @MustBeClosed
        fun listByExternalId(
            params: CustomerCreditListByExternalIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerCreditListByExternalIdPage>
    }
}
