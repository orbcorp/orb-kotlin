// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.services.async.PriceServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/**
 * This endpoint is used to list all add-on prices created using the
 * [price creation endpoint](/api-reference/price/create-price).
 */
class PriceListPageAsync
private constructor(
    private val pricesService: PriceServiceAsync,
    private val params: PriceListParams,
    private val response: PriceListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): PriceListPageResponse = response

    /**
     * Delegates to [PriceListPageResponse], but gracefully handles missing data.
     *
     * @see [PriceListPageResponse.data]
     */
    fun data(): List<Price> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [PriceListPageResponse], but gracefully handles missing data.
     *
     * @see [PriceListPageResponse.paginationMetadata]
     */
    fun paginationMetadata(): PaginationMetadata? =
        response._paginationMetadata().getNullable("pagination_metadata")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PriceListPageAsync && pricesService == other.pricesService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(pricesService, params, response) /* spotless:on */

    override fun toString() =
        "PriceListPageAsync{pricesService=$pricesService, params=$params, response=$response}"

    fun hasNextPage(): Boolean =
        data().isNotEmpty() &&
            paginationMetadata()?.let { it._nextCursor().getNullable("next_cursor") } != null

    fun getNextPageParams(): PriceListParams? {
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

    suspend fun getNextPage(): PriceListPageAsync? {
        return getNextPageParams()?.let { pricesService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            pricesService: PriceServiceAsync,
            params: PriceListParams,
            response: PriceListPageResponse,
        ) = PriceListPageAsync(pricesService, params, response)
    }

    class AutoPager(private val firstPage: PriceListPageAsync) : Flow<Price> {

        override suspend fun collect(collector: FlowCollector<Price>) {
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
