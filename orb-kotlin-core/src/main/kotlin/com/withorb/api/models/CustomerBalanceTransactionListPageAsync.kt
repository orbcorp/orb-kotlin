// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.services.async.customers.BalanceTransactionServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/**
 * ## The customer balance
 *
 * The customer balance is an amount in the customer's currency, which Orb automatically applies to
 * subsequent invoices. This balance can be adjusted manually via Orb's webapp on the customer
 * details page. You can use this balance to provide a fixed mid-period credit to the customer.
 * Commonly, this is done due to system downtime/SLA violation, or an adhoc adjustment discussed
 * with the customer.
 *
 * If the balance is a positive value at the time of invoicing, it represents that the customer has
 * credit that should be used to offset the amount due on the next issued invoice. In this case, Orb
 * will automatically reduce the next invoice by the balance amount, and roll over any remaining
 * balance if the invoice is fully discounted.
 *
 * If the balance is a negative value at the time of invoicing, Orb will increase the invoice's
 * amount due with a positive adjustment, and reset the balance to 0.
 *
 * This endpoint retrieves all customer balance transactions in reverse chronological order for a
 * single customer, providing a complete audit trail of all adjustments and invoice applications.
 *
 * ## Eligibility
 *
 * The customer balance can only be applied to invoices or adjusted manually if invoices are not
 * synced to a separate invoicing provider. If a payment gateway such as Stripe is used, the balance
 * will be applied to the invoice before forwarding payment to the gateway.
 */
class CustomerBalanceTransactionListPageAsync
private constructor(
    private val balanceTransactionsService: BalanceTransactionServiceAsync,
    private val params: CustomerBalanceTransactionListParams,
    private val response: CustomerBalanceTransactionListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): CustomerBalanceTransactionListPageResponse = response

    /**
     * Delegates to [CustomerBalanceTransactionListPageResponse], but gracefully handles missing
     * data.
     *
     * @see [CustomerBalanceTransactionListPageResponse.data]
     */
    fun data(): List<CustomerBalanceTransactionListResponse> =
        response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [CustomerBalanceTransactionListPageResponse], but gracefully handles missing
     * data.
     *
     * @see [CustomerBalanceTransactionListPageResponse.paginationMetadata]
     */
    fun paginationMetadata(): PaginationMetadata? =
        response._paginationMetadata().getNullable("pagination_metadata")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerBalanceTransactionListPageAsync && balanceTransactionsService == other.balanceTransactionsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(balanceTransactionsService, params, response) /* spotless:on */

    override fun toString() =
        "CustomerBalanceTransactionListPageAsync{balanceTransactionsService=$balanceTransactionsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean =
        data().isNotEmpty() &&
            paginationMetadata()?.let { it._nextCursor().getNullable("next_cursor") } != null

    fun getNextPageParams(): CustomerBalanceTransactionListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params
            .toBuilder()
            .apply {
                paginationMetadata()
                    ?.let { it._nextCursor().getNullable("next_cursor") }
                    ?.let { cursor(it) }
            }
            .build()
    }

    suspend fun getNextPage(): CustomerBalanceTransactionListPageAsync? {
        return getNextPageParams()?.let { balanceTransactionsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            balanceTransactionsService: BalanceTransactionServiceAsync,
            params: CustomerBalanceTransactionListParams,
            response: CustomerBalanceTransactionListPageResponse,
        ) = CustomerBalanceTransactionListPageAsync(balanceTransactionsService, params, response)
    }

    class AutoPager(private val firstPage: CustomerBalanceTransactionListPageAsync) :
        Flow<CustomerBalanceTransactionListResponse> {

        override suspend fun collect(
            collector: FlowCollector<CustomerBalanceTransactionListResponse>
        ) {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.data().size) {
                    collector.emit(page.data()[index++])
                }
                page = page.getNextPage() ?: break
                index = 0
            }
        }
    }
}
