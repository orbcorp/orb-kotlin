// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.customers

import com.google.errorprone.annotations.MustBeClosed
import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.CustomerCreditListByExternalIdPageAsync
import com.withorb.api.models.CustomerCreditListByExternalIdParams
import com.withorb.api.models.CustomerCreditListPageAsync
import com.withorb.api.models.CustomerCreditListParams
import com.withorb.api.services.async.customers.credits.LedgerServiceAsync
import com.withorb.api.services.async.customers.credits.TopUpServiceAsync

interface CreditServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CreditServiceAsync

    fun ledger(): LedgerServiceAsync

    fun topUps(): TopUpServiceAsync

    /**
     * Returns a paginated list of unexpired, non-zero credit blocks for a customer.
     *
     * If `include_all_blocks` is set to `true`, all credit blocks (including expired and depleted
     * blocks) will be included in the response.
     *
     * Note that `currency` defaults to credits if not specified. To use a real world currency, set
     * `currency` to an ISO 4217 string.
     */
    suspend fun list(
        customerId: String,
        params: CustomerCreditListParams = CustomerCreditListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerCreditListPageAsync =
        list(params.toBuilder().customerId(customerId).build(), requestOptions)

    /** @see [list] */
    suspend fun list(
        params: CustomerCreditListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerCreditListPageAsync

    /** @see [list] */
    suspend fun list(
        customerId: String,
        requestOptions: RequestOptions,
    ): CustomerCreditListPageAsync =
        list(customerId, CustomerCreditListParams.none(), requestOptions)

    /**
     * Returns a paginated list of unexpired, non-zero credit blocks for a customer.
     *
     * If `include_all_blocks` is set to `true`, all credit blocks (including expired and depleted
     * blocks) will be included in the response.
     *
     * Note that `currency` defaults to credits if not specified. To use a real world currency, set
     * `currency` to an ISO 4217 string.
     */
    suspend fun listByExternalId(
        externalCustomerId: String,
        params: CustomerCreditListByExternalIdParams = CustomerCreditListByExternalIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerCreditListByExternalIdPageAsync =
        listByExternalId(
            params.toBuilder().externalCustomerId(externalCustomerId).build(),
            requestOptions,
        )

    /** @see [listByExternalId] */
    suspend fun listByExternalId(
        params: CustomerCreditListByExternalIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerCreditListByExternalIdPageAsync

    /** @see [listByExternalId] */
    suspend fun listByExternalId(
        externalCustomerId: String,
        requestOptions: RequestOptions,
    ): CustomerCreditListByExternalIdPageAsync =
        listByExternalId(
            externalCustomerId,
            CustomerCreditListByExternalIdParams.none(),
            requestOptions,
        )

    /**
     * A view of [CreditServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): CreditServiceAsync.WithRawResponse

        fun ledger(): LedgerServiceAsync.WithRawResponse

        fun topUps(): TopUpServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /customers/{customer_id}/credits`, but is otherwise
         * the same as [CreditServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            customerId: String,
            params: CustomerCreditListParams = CustomerCreditListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerCreditListPageAsync> =
            list(params.toBuilder().customerId(customerId).build(), requestOptions)

        /** @see [list] */
        @MustBeClosed
        suspend fun list(
            params: CustomerCreditListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerCreditListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(
            customerId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomerCreditListPageAsync> =
            list(customerId, CustomerCreditListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /customers/external_customer_id/{external_customer_id}/credits`, but is otherwise the
         * same as [CreditServiceAsync.listByExternalId].
         */
        @MustBeClosed
        suspend fun listByExternalId(
            externalCustomerId: String,
            params: CustomerCreditListByExternalIdParams =
                CustomerCreditListByExternalIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerCreditListByExternalIdPageAsync> =
            listByExternalId(
                params.toBuilder().externalCustomerId(externalCustomerId).build(),
                requestOptions,
            )

        /** @see [listByExternalId] */
        @MustBeClosed
        suspend fun listByExternalId(
            params: CustomerCreditListByExternalIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerCreditListByExternalIdPageAsync>

        /** @see [listByExternalId] */
        @MustBeClosed
        suspend fun listByExternalId(
            externalCustomerId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomerCreditListByExternalIdPageAsync> =
            listByExternalId(
                externalCustomerId,
                CustomerCreditListByExternalIdParams.none(),
                requestOptions,
            )
    }
}
