// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.services.async.ItemServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** This endpoint returns a list of all Items, ordered in descending order by creation time. */
class ItemListPageAsync
private constructor(
    private val itemsService: ItemServiceAsync,
    private val params: ItemListParams,
    private val response: ItemListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): ItemListPageResponse = response

    /**
     * Delegates to [ItemListPageResponse], but gracefully handles missing data.
     *
     * @see [ItemListPageResponse.data]
     */
    fun data(): List<Item> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [ItemListPageResponse], but gracefully handles missing data.
     *
     * @see [ItemListPageResponse.paginationMetadata]
     */
    fun paginationMetadata(): PaginationMetadata? =
        response._paginationMetadata().getNullable("pagination_metadata")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ItemListPageAsync && itemsService == other.itemsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(itemsService, params, response) /* spotless:on */

    override fun toString() =
        "ItemListPageAsync{itemsService=$itemsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean =
        data().isNotEmpty() &&
            paginationMetadata()?.let { it._nextCursor().getNullable("next_cursor") } != null

    fun getNextPageParams(): ItemListParams? {
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

    suspend fun getNextPage(): ItemListPageAsync? {
        return getNextPageParams()?.let { itemsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            itemsService: ItemServiceAsync,
            params: ItemListParams,
            response: ItemListPageResponse,
        ) = ItemListPageAsync(itemsService, params, response)
    }

    class AutoPager(private val firstPage: ItemListPageAsync) : Flow<Item> {

        override suspend fun collect(collector: FlowCollector<Item>) {
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
