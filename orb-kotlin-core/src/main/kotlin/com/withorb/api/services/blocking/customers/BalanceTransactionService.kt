// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking.customers

import com.withorb.api.core.RequestOptions
import com.withorb.api.models.CustomerBalanceTransactionCreateParams
import com.withorb.api.models.CustomerBalanceTransactionCreateResponse
import com.withorb.api.models.CustomerBalanceTransactionListPage
import com.withorb.api.models.CustomerBalanceTransactionListParams

interface BalanceTransactionService {

    /**
     * Creates an immutable balance transaction that updates the customer's balance and returns back
     * the newly created transaction.
     */
    fun create(
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
     *
     * ## Eligibility
     *
     * The customer balance can only be applied to invoices or adjusted manually if invoices are not
     * synced to a separate invoicing provider. If a payment gateway such as Stripe is used, the
     * balance will be applied to the invoice before forwarding payment to the gateway.
     */
    fun list(
        params: CustomerBalanceTransactionListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerBalanceTransactionListPage
}
