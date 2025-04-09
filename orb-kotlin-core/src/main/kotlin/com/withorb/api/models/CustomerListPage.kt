// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.services.blocking.CustomerService
import java.util.Objects

/**
 * This endpoint returns a list of all customers for an account. The list of customers is ordered
 * starting from the most recently created customer. This endpoint follows Orb's
 * [standardized pagination format](/api-reference/pagination).
 *
 * See [Customer](/core-concepts##customer) for an overview of the customer model.
 */
class CustomerListPage
private constructor(
    private val customersService: CustomerService,
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

        return /* spotless:off */ other is CustomerListPage && customersService == other.customersService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(customersService, params, response) /* spotless:on */

    override fun toString() =
        "CustomerListPage{customersService=$customersService, params=$params, response=$response}"

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

    fun getNextPage(): CustomerListPage? {
        return getNextPageParams()?.let { customersService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            customersService: CustomerService,
            params: CustomerListParams,
            response: CustomerListPageResponse,
        ) = CustomerListPage(customersService, params, response)
    }

    class AutoPager(private val firstPage: CustomerListPage) : Sequence<Customer> {

        override fun iterator(): Iterator<Customer> = iterator {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.data().size) {
                    yield(page.data()[index++])
                }
                page = page.getNextPage() ?: break
                index = 0
            }
        }
    }
}
