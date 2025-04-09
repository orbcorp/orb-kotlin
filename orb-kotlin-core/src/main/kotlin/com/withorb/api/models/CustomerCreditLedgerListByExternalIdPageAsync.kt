// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.services.async.customers.credits.LedgerServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/**
 * The credits ledger provides _auditing_ functionality over Orb's credits system with a list of
 * actions that have taken place to modify a customer's credit balance. This
 * [paginated endpoint](/api-reference/pagination) lists these entries, starting from the most
 * recent ledger entry.
 *
 * More details on using Orb's real-time credit feature are [here](/product-catalog/prepurchase).
 *
 * There are four major types of modifications to credit balance, detailed below.
 *
 * ## Increment
 *
 * Credits (which optionally expire on a future date) can be added via the API ([Add Ledger
 * Entry](create-ledger-entry)). The ledger entry for such an action will always contain the total
 * eligible starting and ending balance for the customer at the time the entry was added to the
 * ledger.
 *
 * ## Decrement
 *
 * Deductions can occur as a result of an API call to create a ledger entry (see
 * [Add Ledger Entry](create-ledger-entry)), or automatically as a result of incurring usage. Both
 * ledger entries present the `decrement` entry type.
 *
 * As usage for a customer is reported into Orb, credits may be deducted according to the customer's
 * plan configuration. An automated deduction of this type will result in a ledger entry, also with
 * a starting and ending balance. In order to provide better tracing capabilities for automatic
 * deductions, Orb always associates each automatic deduction with the `event_id` at the time of
 * ingestion, used to pinpoint _why_ credit deduction took place and to ensure that credits are
 * never deducted without an associated usage event.
 *
 * By default, Orb uses an algorithm that automatically deducts from the _soonest expiring credit
 * block_ first in order to ensure that all credits are utilized appropriately. As an example, if
 * trial credits with an expiration date of 2 weeks from now are present for a customer, they will
 * be used before any deductions take place from a non-expiring credit block.
 *
 * If there are multiple blocks with the same expiration date, Orb will deduct from the block with
 * the _lower cost basis_ first (e.g. trial credits with a $0 cost basis before paid credits with a
 * $5.00 cost basis).
 *
 * It's also possible for a single usage event's deduction to _span_ credit blocks. In this case,
 * Orb will deduct from the next block, ending at the credit block which consists of unexpiring
 * credits. Each of these deductions will lead to a _separate_ ledger entry, one per credit block
 * that is deducted from. By default, the customer's total credit balance in Orb can be negative as
 * a result of a decrement.
 *
 * ## Expiration change
 *
 * The expiry of credits can be changed as a result of the API (See
 * [Add Ledger Entry](create-ledger-entry)). This will create a ledger entry that specifies the
 * balance as well as the initial and target expiry dates.
 *
 * Note that for this entry type, `starting_balance` will equal `ending_balance`, and the `amount`
 * represents the balance transferred. The credit block linked to the ledger entry is the source
 * credit block from which there was an expiration change
 *
 * ## Credits expiry
 *
 * When a set of credits expire on pre-set expiration date, the customer's balance automatically
 * reflects this change and adds an entry to the ledger indicating this event. Note that credit
 * expiry should always happen close to a date boundary in the customer's timezone.
 *
 * ## Void initiated
 *
 * Credit blocks can be voided via the API. The `amount` on this entry corresponds to the number of
 * credits that were remaining in the block at time of void. `void_reason` will be populated if the
 * void is created with a reason.
 *
 * ## Void
 *
 * When a set of credits is voided, the customer's balance automatically reflects this change and
 * adds an entry to the ledger indicating this event.
 *
 * ## Amendment
 *
 * When credits are added to a customer's balance as a result of a correction, this entry will be
 * added to the ledger to indicate the adjustment of credits.
 */
class CustomerCreditLedgerListByExternalIdPageAsync
private constructor(
    private val ledgerService: LedgerServiceAsync,
    private val params: CustomerCreditLedgerListByExternalIdParams,
    private val response: CustomerCreditLedgerListByExternalIdPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): CustomerCreditLedgerListByExternalIdPageResponse = response

    /**
     * Delegates to [CustomerCreditLedgerListByExternalIdPageResponse], but gracefully handles
     * missing data.
     *
     * @see [CustomerCreditLedgerListByExternalIdPageResponse.data]
     */
    fun data(): List<CustomerCreditLedgerListByExternalIdResponse> =
        response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [CustomerCreditLedgerListByExternalIdPageResponse], but gracefully handles
     * missing data.
     *
     * @see [CustomerCreditLedgerListByExternalIdPageResponse.paginationMetadata]
     */
    fun paginationMetadata(): PaginationMetadata? =
        response._paginationMetadata().getNullable("pagination_metadata")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerCreditLedgerListByExternalIdPageAsync && ledgerService == other.ledgerService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(ledgerService, params, response) /* spotless:on */

    override fun toString() =
        "CustomerCreditLedgerListByExternalIdPageAsync{ledgerService=$ledgerService, params=$params, response=$response}"

    fun hasNextPage(): Boolean =
        data().isNotEmpty() &&
            paginationMetadata()?.let { it._nextCursor().getNullable("next_cursor") } != null

    fun getNextPageParams(): CustomerCreditLedgerListByExternalIdParams? {
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

    suspend fun getNextPage(): CustomerCreditLedgerListByExternalIdPageAsync? {
        return getNextPageParams()?.let { ledgerService.listByExternalId(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            ledgerService: LedgerServiceAsync,
            params: CustomerCreditLedgerListByExternalIdParams,
            response: CustomerCreditLedgerListByExternalIdPageResponse,
        ) = CustomerCreditLedgerListByExternalIdPageAsync(ledgerService, params, response)
    }

    class AutoPager(private val firstPage: CustomerCreditLedgerListByExternalIdPageAsync) :
        Flow<CustomerCreditLedgerListByExternalIdResponse> {

        override suspend fun collect(
            collector: FlowCollector<CustomerCreditLedgerListByExternalIdResponse>
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
