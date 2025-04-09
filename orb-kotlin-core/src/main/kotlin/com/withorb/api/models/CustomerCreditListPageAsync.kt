// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.services.async.customers.CreditServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/**
 * Returns a paginated list of unexpired, non-zero credit blocks for a customer.
 *
 * If `include_all_blocks` is set to `true`, all credit blocks (including expired and depleted
 * blocks) will be included in the response.
 *
 * Note that `currency` defaults to credits if not specified. To use a real world currency, set
 * `currency` to an ISO 4217 string.
 */
class CustomerCreditListPageAsync
private constructor(
    private val creditsService: CreditServiceAsync,
    private val params: CustomerCreditListParams,
    private val response: CustomerCreditListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): CustomerCreditListPageResponse = response

    /**
     * Delegates to [CustomerCreditListPageResponse], but gracefully handles missing data.
     *
     * @see [CustomerCreditListPageResponse.data]
     */
    fun data(): List<CustomerCreditListResponse> =
        response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [CustomerCreditListPageResponse], but gracefully handles missing data.
     *
     * @see [CustomerCreditListPageResponse.paginationMetadata]
     */
    fun paginationMetadata(): PaginationMetadata? =
        response._paginationMetadata().getNullable("pagination_metadata")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerCreditListPageAsync && creditsService == other.creditsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(creditsService, params, response) /* spotless:on */

    override fun toString() =
        "CustomerCreditListPageAsync{creditsService=$creditsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean =
        data().isNotEmpty() &&
            paginationMetadata()?.let { it._nextCursor().getNullable("next_cursor") } != null

    fun getNextPageParams(): CustomerCreditListParams? {
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

    suspend fun getNextPage(): CustomerCreditListPageAsync? {
        return getNextPageParams()?.let { creditsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            creditsService: CreditServiceAsync,
            params: CustomerCreditListParams,
            response: CustomerCreditListPageResponse,
        ) = CustomerCreditListPageAsync(creditsService, params, response)
    }

    class AutoPager(private val firstPage: CustomerCreditListPageAsync) :
        Flow<CustomerCreditListResponse> {

        override suspend fun collect(collector: FlowCollector<CustomerCreditListResponse>) {
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
