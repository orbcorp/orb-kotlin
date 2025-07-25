// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.customers

import com.google.errorprone.annotations.MustBeClosed
import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.CustomerBalanceTransactionCreateParams
import com.withorb.api.models.CustomerBalanceTransactionCreateResponse
import com.withorb.api.models.CustomerBalanceTransactionListPageAsync
import com.withorb.api.models.CustomerBalanceTransactionListParams

interface BalanceTransactionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): BalanceTransactionServiceAsync

    /**
     * Creates an immutable balance transaction that updates the customer's balance and returns back
     * the newly created transaction.
     */
    suspend fun create(
        customerId: String,
        params: CustomerBalanceTransactionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerBalanceTransactionCreateResponse =
        create(params.toBuilder().customerId(customerId).build(), requestOptions)

    /** @see create */
    suspend fun create(
        params: CustomerBalanceTransactionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerBalanceTransactionCreateResponse

    /**
     * ## The customer balance
     *
     * The customer balance is an amount in the customer's currency, which Orb automatically applies
     * to subsequent invoices. This balance can be adjusted manually via Orb's webapp on the
     * customer details page. You can use this balance to provide a fixed mid-period credit to the
     * customer. Commonly, this is done due to system downtime/SLA violation, or an adhoc adjustment
     * discussed with the customer.
     *
     * If the balance is a positive value at the time of invoicing, it represents that the customer
     * has credit that should be used to offset the amount due on the next issued invoice. In this
     * case, Orb will automatically reduce the next invoice by the balance amount, and roll over any
     * remaining balance if the invoice is fully discounted.
     *
     * If the balance is a negative value at the time of invoicing, Orb will increase the invoice's
     * amount due with a positive adjustment, and reset the balance to 0.
     *
     * This endpoint retrieves all customer balance transactions in reverse chronological order for
     * a single customer, providing a complete audit trail of all adjustments and invoice
     * applications.
     */
    suspend fun list(
        customerId: String,
        params: CustomerBalanceTransactionListParams = CustomerBalanceTransactionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerBalanceTransactionListPageAsync =
        list(params.toBuilder().customerId(customerId).build(), requestOptions)

    /** @see list */
    suspend fun list(
        params: CustomerBalanceTransactionListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerBalanceTransactionListPageAsync

    /** @see list */
    suspend fun list(
        customerId: String,
        requestOptions: RequestOptions,
    ): CustomerBalanceTransactionListPageAsync =
        list(customerId, CustomerBalanceTransactionListParams.none(), requestOptions)

    /**
     * A view of [BalanceTransactionServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): BalanceTransactionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /customers/{customer_id}/balance_transactions`, but
         * is otherwise the same as [BalanceTransactionServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            customerId: String,
            params: CustomerBalanceTransactionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerBalanceTransactionCreateResponse> =
            create(params.toBuilder().customerId(customerId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        suspend fun create(
            params: CustomerBalanceTransactionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerBalanceTransactionCreateResponse>

        /**
         * Returns a raw HTTP response for `get /customers/{customer_id}/balance_transactions`, but
         * is otherwise the same as [BalanceTransactionServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            customerId: String,
            params: CustomerBalanceTransactionListParams =
                CustomerBalanceTransactionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerBalanceTransactionListPageAsync> =
            list(params.toBuilder().customerId(customerId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        suspend fun list(
            params: CustomerBalanceTransactionListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerBalanceTransactionListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            customerId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomerBalanceTransactionListPageAsync> =
            list(customerId, CustomerBalanceTransactionListParams.none(), requestOptions)
    }
}
