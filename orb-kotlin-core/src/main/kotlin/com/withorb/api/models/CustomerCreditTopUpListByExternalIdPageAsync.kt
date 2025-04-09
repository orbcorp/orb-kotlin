// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.services.async.customers.credits.TopUpServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** List top-ups by external ID */
class CustomerCreditTopUpListByExternalIdPageAsync
private constructor(
    private val topUpsService: TopUpServiceAsync,
    private val params: CustomerCreditTopUpListByExternalIdParams,
    private val response: CustomerCreditTopUpListByExternalIdPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): CustomerCreditTopUpListByExternalIdPageResponse = response

    /**
     * Delegates to [CustomerCreditTopUpListByExternalIdPageResponse], but gracefully handles
     * missing data.
     *
     * @see [CustomerCreditTopUpListByExternalIdPageResponse.data]
     */
    fun data(): List<CustomerCreditTopUpListByExternalIdResponse> =
        response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [CustomerCreditTopUpListByExternalIdPageResponse], but gracefully handles
     * missing data.
     *
     * @see [CustomerCreditTopUpListByExternalIdPageResponse.paginationMetadata]
     */
    fun paginationMetadata(): PaginationMetadata? =
        response._paginationMetadata().getNullable("pagination_metadata")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerCreditTopUpListByExternalIdPageAsync && topUpsService == other.topUpsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(topUpsService, params, response) /* spotless:on */

    override fun toString() =
        "CustomerCreditTopUpListByExternalIdPageAsync{topUpsService=$topUpsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean =
        data().isNotEmpty() &&
            paginationMetadata()?.let { it._nextCursor().getNullable("next_cursor") } != null

    fun getNextPageParams(): CustomerCreditTopUpListByExternalIdParams? {
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

    suspend fun getNextPage(): CustomerCreditTopUpListByExternalIdPageAsync? {
        return getNextPageParams()?.let { topUpsService.listByExternalId(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            topUpsService: TopUpServiceAsync,
            params: CustomerCreditTopUpListByExternalIdParams,
            response: CustomerCreditTopUpListByExternalIdPageResponse,
        ) = CustomerCreditTopUpListByExternalIdPageAsync(topUpsService, params, response)
    }

    class AutoPager(private val firstPage: CustomerCreditTopUpListByExternalIdPageAsync) :
        Flow<CustomerCreditTopUpListByExternalIdResponse> {

        override suspend fun collect(
            collector: FlowCollector<CustomerCreditTopUpListByExternalIdResponse>
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
