// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking.customers

import com.google.errorprone.annotations.MustBeClosed
import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.CustomerCreditFetchBalanceByExternalIdParams
import com.withorb.api.models.CustomerCreditFetchBalanceByExternalIdResponse
import com.withorb.api.models.CustomerCreditFetchBalanceParams
import com.withorb.api.models.CustomerCreditFetchBalanceResponse
import com.withorb.api.models.CustomerCreditListByExternalIdPage
import com.withorb.api.models.CustomerCreditListByExternalIdParams
import com.withorb.api.models.CustomerCreditListPage
import com.withorb.api.models.CustomerCreditListParams
import com.withorb.api.services.blocking.customers.credits.LedgerService
import com.withorb.api.services.blocking.customers.credits.TopUpService

/**
 * The [Credit Ledger Entry resource](/product-catalog/prepurchase) models prepaid credits within
 * Orb.
 */
interface CreditService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CreditService

    /**
     * The [Credit Ledger Entry resource](/product-catalog/prepurchase) models prepaid credits
     * within Orb.
     */
    fun ledger(): LedgerService

    /**
     * The [Credit Ledger Entry resource](/product-catalog/prepurchase) models prepaid credits
     * within Orb.
     */
    fun topUps(): TopUpService

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
    fun list(
        customerId: String,
        params: CustomerCreditListParams = CustomerCreditListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerCreditListPage =
        list(params.toBuilder().customerId(customerId).build(), requestOptions)

    /** @see list */
    fun list(
        params: CustomerCreditListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerCreditListPage

    /** @see list */
    fun list(customerId: String, requestOptions: RequestOptions): CustomerCreditListPage =
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
    fun fetchBalance(
        customerId: String,
        params: CustomerCreditFetchBalanceParams = CustomerCreditFetchBalanceParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerCreditFetchBalanceResponse =
        fetchBalance(params.toBuilder().customerId(customerId).build(), requestOptions)

    /** @see fetchBalance */
    fun fetchBalance(
        params: CustomerCreditFetchBalanceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerCreditFetchBalanceResponse

    /** @see fetchBalance */
    fun fetchBalance(
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
    fun fetchBalanceByExternalId(
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
    fun fetchBalanceByExternalId(
        params: CustomerCreditFetchBalanceByExternalIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerCreditFetchBalanceByExternalIdResponse

    /** @see fetchBalanceByExternalId */
    fun fetchBalanceByExternalId(
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
    fun listByExternalId(
        externalCustomerId: String,
        params: CustomerCreditListByExternalIdParams = CustomerCreditListByExternalIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerCreditListByExternalIdPage =
        listByExternalId(
            params.toBuilder().externalCustomerId(externalCustomerId).build(),
            requestOptions,
        )

    /** @see listByExternalId */
    fun listByExternalId(
        params: CustomerCreditListByExternalIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerCreditListByExternalIdPage

    /** @see listByExternalId */
    fun listByExternalId(
        externalCustomerId: String,
        requestOptions: RequestOptions,
    ): CustomerCreditListByExternalIdPage =
        listByExternalId(
            externalCustomerId,
            CustomerCreditListByExternalIdParams.none(),
            requestOptions,
        )

    /** A view of [CreditService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CreditService.WithRawResponse

        /**
         * The [Credit Ledger Entry resource](/product-catalog/prepurchase) models prepaid credits
         * within Orb.
         */
        fun ledger(): LedgerService.WithRawResponse

        /**
         * The [Credit Ledger Entry resource](/product-catalog/prepurchase) models prepaid credits
         * within Orb.
         */
        fun topUps(): TopUpService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /customers/{customer_id}/credits`, but is otherwise
         * the same as [CreditService.list].
         */
        @MustBeClosed
        fun list(
            customerId: String,
            params: CustomerCreditListParams = CustomerCreditListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerCreditListPage> =
            list(params.toBuilder().customerId(customerId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            params: CustomerCreditListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerCreditListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            customerId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomerCreditListPage> =
            list(customerId, CustomerCreditListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /customers/{customer_id}/credits/balance`, but is
         * otherwise the same as [CreditService.fetchBalance].
         */
        @MustBeClosed
        fun fetchBalance(
            customerId: String,
            params: CustomerCreditFetchBalanceParams = CustomerCreditFetchBalanceParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerCreditFetchBalanceResponse> =
            fetchBalance(params.toBuilder().customerId(customerId).build(), requestOptions)

        /** @see fetchBalance */
        @MustBeClosed
        fun fetchBalance(
            params: CustomerCreditFetchBalanceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerCreditFetchBalanceResponse>

        /** @see fetchBalance */
        @MustBeClosed
        fun fetchBalance(
            customerId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomerCreditFetchBalanceResponse> =
            fetchBalance(customerId, CustomerCreditFetchBalanceParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /customers/external_customer_id/{external_customer_id}/credits/balance`, but is otherwise
         * the same as [CreditService.fetchBalanceByExternalId].
         */
        @MustBeClosed
        fun fetchBalanceByExternalId(
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
        fun fetchBalanceByExternalId(
            params: CustomerCreditFetchBalanceByExternalIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerCreditFetchBalanceByExternalIdResponse>

        /** @see fetchBalanceByExternalId */
        @MustBeClosed
        fun fetchBalanceByExternalId(
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
         * same as [CreditService.listByExternalId].
         */
        @MustBeClosed
        fun listByExternalId(
            externalCustomerId: String,
            params: CustomerCreditListByExternalIdParams =
                CustomerCreditListByExternalIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerCreditListByExternalIdPage> =
            listByExternalId(
                params.toBuilder().externalCustomerId(externalCustomerId).build(),
                requestOptions,
            )

        /** @see listByExternalId */
        @MustBeClosed
        fun listByExternalId(
            params: CustomerCreditListByExternalIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerCreditListByExternalIdPage>

        /** @see listByExternalId */
        @MustBeClosed
        fun listByExternalId(
            externalCustomerId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomerCreditListByExternalIdPage> =
            listByExternalId(
                externalCustomerId,
                CustomerCreditListByExternalIdParams.none(),
                requestOptions,
            )
    }
}
