// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.services.async.DimensionalPriceGroupServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** List dimensional price groups */
class DimensionalPriceGroupListPageAsync
private constructor(
    private val dimensionalPriceGroupsService: DimensionalPriceGroupServiceAsync,
    private val params: DimensionalPriceGroupListParams,
    private val response: DimensionalPriceGroups,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): DimensionalPriceGroups = response

    /**
     * Delegates to [DimensionalPriceGroups], but gracefully handles missing data.
     *
     * @see [DimensionalPriceGroups.data]
     */
    fun data(): List<DimensionalPriceGroup> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [DimensionalPriceGroups], but gracefully handles missing data.
     *
     * @see [DimensionalPriceGroups.paginationMetadata]
     */
    fun paginationMetadata(): PaginationMetadata? =
        response._paginationMetadata().getNullable("pagination_metadata")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DimensionalPriceGroupListPageAsync && dimensionalPriceGroupsService == other.dimensionalPriceGroupsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(dimensionalPriceGroupsService, params, response) /* spotless:on */

    override fun toString() =
        "DimensionalPriceGroupListPageAsync{dimensionalPriceGroupsService=$dimensionalPriceGroupsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean =
        data().isNotEmpty() &&
            paginationMetadata()?.let { it._nextCursor().getNullable("next_cursor") } != null

    fun getNextPageParams(): DimensionalPriceGroupListParams? {
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

    suspend fun getNextPage(): DimensionalPriceGroupListPageAsync? {
        return getNextPageParams()?.let { dimensionalPriceGroupsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            dimensionalPriceGroupsService: DimensionalPriceGroupServiceAsync,
            params: DimensionalPriceGroupListParams,
            response: DimensionalPriceGroups,
        ) = DimensionalPriceGroupListPageAsync(dimensionalPriceGroupsService, params, response)
    }

    class AutoPager(private val firstPage: DimensionalPriceGroupListPageAsync) :
        Flow<DimensionalPriceGroup> {

        override suspend fun collect(collector: FlowCollector<DimensionalPriceGroup>) {
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
