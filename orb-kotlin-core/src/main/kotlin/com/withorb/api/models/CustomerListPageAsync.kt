// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.services.async.CustomerServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/**
 * This endpoint returns a list of all customers for an account. The list of customers is ordered
 * starting from the most recently created customer. This endpoint follows Orb's
 * [standardized pagination format](/api-reference/pagination).
 *
 * See [Customer](/core-concepts##customer) for an overview of the customer model.
 */
class CustomerListPageAsync
private constructor(
    private val customersService: CustomerServiceAsync,
    private val params: CustomerListParams,
    private val response: CustomerListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): CustomerListPageResponse = response

    /**
     * Delegates to [CustomerListPageResponse], but gracefully handles missing data.
     *
     * @see [CustomerListPageResponse.data]
     */
    fun data(): List<Customer> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [CustomerListPageResponse], but gracefully handles missing data.
     *
     * @see [CustomerListPageResponse.paginationMetadata]
     */
    fun paginationMetadata(): PaginationMetadata? =
        response._paginationMetadata().getNullable("pagination_metadata")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerListPageAsync && customersService == other.customersService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(customersService, params, response) /* spotless:on */

    override fun toString() =
        "CustomerListPageAsync{customersService=$customersService, params=$params, response=$response}"

    fun hasNextPage(): Boolean =
        data().isNotEmpty() &&
            paginationMetadata()?.let { it._nextCursor().getNullable("next_cursor") } != null

    fun getNextPageParams(): CustomerListParams? {
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

    suspend fun getNextPage(): CustomerListPageAsync? {
        return getNextPageParams()?.let { customersService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            customersService: CustomerServiceAsync,
            params: CustomerListParams,
            response: CustomerListPageResponse,
        ) = CustomerListPageAsync(customersService, params, response)
    }

    class AutoPager(private val firstPage: CustomerListPageAsync) : Flow<Customer> {

        override suspend fun collect(collector: FlowCollector<Customer>) {
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
