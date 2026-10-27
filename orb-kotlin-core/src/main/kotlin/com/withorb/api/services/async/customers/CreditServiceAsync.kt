// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.customers

import com.google.errorprone.annotations.MustBeClosed
import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.CustomerCreditFetchBalanceByExternalIdParams
import com.withorb.api.models.CustomerCreditFetchBalanceByExternalIdResponse
import com.withorb.api.models.CustomerCreditFetchBalanceParams
import com.withorb.api.models.CustomerCreditFetchBalanceResponse
import com.withorb.api.models.CustomerCreditListByExternalIdPageAsync
import com.withorb.api.models.CustomerCreditListByExternalIdParams
import com.withorb.api.models.CustomerCreditListPageAsync
import com.withorb.api.models.CustomerCreditListParams
import com.withorb.api.services.async.customers.credits.LedgerServiceAsync
import com.withorb.api.services.async.customers.credits.TopUpServiceAsync

/**
 * The [Credit Ledger Entry resource](/product-catalog/prepurchase) models prepaid credits within
 * Orb.
 */
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

    /**
     * The [Credit Ledger Entry resource](/product-catalog/prepurchase) models prepaid credits
     * within Orb.
     */
    fun ledger(): LedgerServiceAsync

    /**
     * The [Credit Ledger Entry resource](/product-catalog/prepurchase) models prepaid credits
     * within Orb.
     */
    fun topUps(): TopUpServiceAsync

    /**
     * Returns a paginated list of unexpired, non-zero credit blocks for a customer.
     *
     * If `include_all_blocks` is set to `true`, all credit blocks (including expired and depleted
     * blocks) will be included in the response.
     *
     * Note that `currency` defaults to credits if not specified. To use a real world currency, set
     * `currency` to an ISO 4217 string.
     *
     * Results can be filtered by the block's `effective_date` using the `effective_date[gte]`,
     * `effective_date[gt]`, `effective_date[lt]`, and `effective_date[lte]` query parameters. This
     * filters on when the credit block becomes effective, which may differ from creation time for
     * backdated credits.
     */
    suspend fun list(
        customerId: String,
        params: CustomerCreditListParams = CustomerCreditListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerCreditListPageAsync =
        list(params.toBuilder().customerId(customerId).build(), requestOptions)

    /** @see list */
    suspend fun list(
        params: CustomerCreditListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerCreditListPageAsync

    /** @see list */
    suspend fun list(
        customerId: String,
        requestOptions: RequestOptions,
    ): CustomerCreditListPageAsync =
        list(customerId, CustomerCreditListParams.none(), requestOptions)

    /**
     * This endpoint returns a customer's credit balance in a single currency or custom pricing
     * unit: the total available balance, the balance waiting on payment, and the next upcoming
     * expiration.
     *
     * `balance` is the sum of `balance` across the customer's `active` credit blocks, as listed by
     * [Fetch customer credit balance](/api-reference/credit/fetch-customer-credit-balance).
     * Expired, depleted, and voided blocks are not included. Blocks in `pending_payment` status are
     * totaled in `pending_payment_balance` instead, and become available once their invoice is
     * paid.
     *
     * Note that `currency` defaults to credits if not specified. To use a real world currency, set
     * `currency` to an ISO 4217 string. A customer with no credits in that currency returns a
     * balance of `0`.
     */
    suspend fun fetchBalance(
        customerId: String,
        params: CustomerCreditFetchBalanceParams = CustomerCreditFetchBalanceParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerCreditFetchBalanceResponse =
        fetchBalance(params.toBuilder().customerId(customerId).build(), requestOptions)

    /** @see fetchBalance */
    suspend fun fetchBalance(
        params: CustomerCreditFetchBalanceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerCreditFetchBalanceResponse

    /** @see fetchBalance */
    suspend fun fetchBalance(
        customerId: String,
        requestOptions: RequestOptions,
    ): CustomerCreditFetchBalanceResponse =
        fetchBalance(customerId, CustomerCreditFetchBalanceParams.none(), requestOptions)

    /**
     * This endpoint returns a customer's credit balance in a single currency or custom pricing
     * unit: the total available balance, the balance waiting on payment, and the next upcoming
     * expiration.
     *
     * `balance` is the sum of `balance` across the customer's `active` credit blocks, as listed by
     * [Fetch customer credit balance](/api-reference/credit/fetch-customer-credit-balance).
     * Expired, depleted, and voided blocks are not included. Blocks in `pending_payment` status are
     * totaled in `pending_payment_balance` instead, and become available once their invoice is
     * paid.
     *
     * Note that `currency` defaults to credits if not specified. To use a real world currency, set
     * `currency` to an ISO 4217 string. A customer with no credits in that currency returns a
     * balance of `0`.
     */
    suspend fun fetchBalanceByExternalId(
        externalCustomerId: String,
        params: CustomerCreditFetchBalanceByExternalIdParams =
            CustomerCreditFetchBalanceByExternalIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerCreditFetchBalanceByExternalIdResponse =
        fetchBalanceByExternalId(
            params.toBuilder().externalCustomerId(externalCustomerId).build(),
            requestOptions,
        )

    /** @see fetchBalanceByExternalId */
    suspend fun fetchBalanceByExternalId(
        params: CustomerCreditFetchBalanceByExternalIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerCreditFetchBalanceByExternalIdResponse

    /** @see fetchBalanceByExternalId */
    suspend fun fetchBalanceByExternalId(
        externalCustomerId: String,
        requestOptions: RequestOptions,
    ): CustomerCreditFetchBalanceByExternalIdResponse =
        fetchBalanceByExternalId(
            externalCustomerId,
            CustomerCreditFetchBalanceByExternalIdParams.none(),
            requestOptions,
        )

    /**
     * Returns a paginated list of unexpired, non-zero credit blocks for a customer.
     *
     * If `include_all_blocks` is set to `true`, all credit blocks (including expired and depleted
     * blocks) will be included in the response.
     *
     * Note that `currency` defaults to credits if not specified. To use a real world currency, set
     * `currency` to an ISO 4217 string.
     *
     * Results can be filtered by the block's `effective_date` using the `effective_date[gte]`,
     * `effective_date[gt]`, `effective_date[lt]`, and `effective_date[lte]` query parameters. This
     * filters on when the credit block becomes effective, which may differ from creation time for
     * backdated credits.
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

    /** @see listByExternalId */
    suspend fun listByExternalId(
        params: CustomerCreditListByExternalIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerCreditListByExternalIdPageAsync

    /** @see listByExternalId */
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

        /**
         * The [Credit Ledger Entry resource](/product-catalog/prepurchase) models prepaid credits
         * within Orb.
         */
        fun ledger(): LedgerServiceAsync.WithRawResponse

        /**
         * The [Credit Ledger Entry resource](/product-catalog/prepurchase) models prepaid credits
         * within Orb.
         */
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

        /** @see list */
        @MustBeClosed
        suspend fun list(
            params: CustomerCreditListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerCreditListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            customerId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomerCreditListPageAsync> =
            list(customerId, CustomerCreditListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /customers/{customer_id}/credits/balance`, but is
         * otherwise the same as [CreditServiceAsync.fetchBalance].
         */
        @MustBeClosed
        suspend fun fetchBalance(
            customerId: String,
            params: CustomerCreditFetchBalanceParams = CustomerCreditFetchBalanceParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerCreditFetchBalanceResponse> =
            fetchBalance(params.toBuilder().customerId(customerId).build(), requestOptions)

        /** @see fetchBalance */
        @MustBeClosed
        suspend fun fetchBalance(
            params: CustomerCreditFetchBalanceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerCreditFetchBalanceResponse>

        /** @see fetchBalance */
        @MustBeClosed
        suspend fun fetchBalance(
            customerId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomerCreditFetchBalanceResponse> =
            fetchBalance(customerId, CustomerCreditFetchBalanceParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /customers/external_customer_id/{external_customer_id}/credits/balance`, but is otherwise
         * the same as [CreditServiceAsync.fetchBalanceByExternalId].
         */
        @MustBeClosed
        suspend fun fetchBalanceByExternalId(
            externalCustomerId: String,
            params: CustomerCreditFetchBalanceByExternalIdParams =
                CustomerCreditFetchBalanceByExternalIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerCreditFetchBalanceByExternalIdResponse> =
            fetchBalanceByExternalId(
                params.toBuilder().externalCustomerId(externalCustomerId).build(),
                requestOptions,
            )

        /** @see fetchBalanceByExternalId */
        @MustBeClosed
        suspend fun fetchBalanceByExternalId(
            params: CustomerCreditFetchBalanceByExternalIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerCreditFetchBalanceByExternalIdResponse>

        /** @see fetchBalanceByExternalId */
        @MustBeClosed
        suspend fun fetchBalanceByExternalId(
            externalCustomerId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomerCreditFetchBalanceByExternalIdResponse> =
            fetchBalanceByExternalId(
                externalCustomerId,
                CustomerCreditFetchBalanceByExternalIdParams.none(),
                requestOptions,
            )

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

        /** @see listByExternalId */
        @MustBeClosed
        suspend fun listByExternalId(
            params: CustomerCreditListByExternalIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerCreditListByExternalIdPageAsync>

        /** @see listByExternalId */
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
