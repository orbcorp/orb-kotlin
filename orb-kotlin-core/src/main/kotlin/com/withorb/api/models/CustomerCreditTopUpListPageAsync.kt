// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.services.async.customers.credits.TopUpServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** List top-ups */
class CustomerCreditTopUpListPageAsync
private constructor(
    private val topUpsService: TopUpServiceAsync,
    private val params: CustomerCreditTopUpListParams,
    private val response: CustomerCreditTopUpListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): CustomerCreditTopUpListPageResponse = response

    /**
     * Delegates to [CustomerCreditTopUpListPageResponse], but gracefully handles missing data.
     *
     * @see [CustomerCreditTopUpListPageResponse.data]
     */
    fun data(): List<CustomerCreditTopUpListResponse> =
        response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [CustomerCreditTopUpListPageResponse], but gracefully handles missing data.
     *
     * @see [CustomerCreditTopUpListPageResponse.paginationMetadata]
     */
    fun paginationMetadata(): PaginationMetadata? =
        response._paginationMetadata().getNullable("pagination_metadata")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerCreditTopUpListPageAsync && topUpsService == other.topUpsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(topUpsService, params, response) /* spotless:on */

    override fun toString() =
        "CustomerCreditTopUpListPageAsync{topUpsService=$topUpsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean =
        data().isNotEmpty() &&
            paginationMetadata()?.let { it._nextCursor().getNullable("next_cursor") } != null

    fun getNextPageParams(): CustomerCreditTopUpListParams? {
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

    suspend fun getNextPage(): CustomerCreditTopUpListPageAsync? {
        return getNextPageParams()?.let { topUpsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            topUpsService: TopUpServiceAsync,
            params: CustomerCreditTopUpListParams,
            response: CustomerCreditTopUpListPageResponse,
        ) = CustomerCreditTopUpListPageAsync(topUpsService, params, response)
    }

    class AutoPager(private val firstPage: CustomerCreditTopUpListPageAsync) :
        Flow<CustomerCreditTopUpListResponse> {

        override suspend fun collect(collector: FlowCollector<CustomerCreditTopUpListResponse>) {
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
