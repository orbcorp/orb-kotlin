// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.services.async.events.BackfillServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/**
 * This endpoint returns a list of all backfills in a list format.
 *
 * The list of backfills is ordered starting from the most recently created backfill. The response
 * also includes [`pagination_metadata`](/api-reference/pagination), which lets the caller retrieve
 * the next page of results if they exist. More information about pagination can be found in the
 * [Pagination-metadata schema](pagination).
 */
class EventBackfillListPageAsync
private constructor(
    private val backfillsService: BackfillServiceAsync,
    private val params: EventBackfillListParams,
    private val response: EventBackfillListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): EventBackfillListPageResponse = response

    /**
     * Delegates to [EventBackfillListPageResponse], but gracefully handles missing data.
     *
     * @see [EventBackfillListPageResponse.data]
     */
    fun data(): List<EventBackfillListResponse> =
        response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [EventBackfillListPageResponse], but gracefully handles missing data.
     *
     * @see [EventBackfillListPageResponse.paginationMetadata]
     */
    fun paginationMetadata(): PaginationMetadata? =
        response._paginationMetadata().getNullable("pagination_metadata")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EventBackfillListPageAsync && backfillsService == other.backfillsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(backfillsService, params, response) /* spotless:on */

    override fun toString() =
        "EventBackfillListPageAsync{backfillsService=$backfillsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean =
        data().isNotEmpty() &&
            paginationMetadata()?.let { it._nextCursor().getNullable("next_cursor") } != null

    fun getNextPageParams(): EventBackfillListParams? {
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

    suspend fun getNextPage(): EventBackfillListPageAsync? {
        return getNextPageParams()?.let { backfillsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            backfillsService: BackfillServiceAsync,
            params: EventBackfillListParams,
            response: EventBackfillListPageResponse,
        ) = EventBackfillListPageAsync(backfillsService, params, response)
    }

    class AutoPager(private val firstPage: EventBackfillListPageAsync) :
        Flow<EventBackfillListResponse> {

        override suspend fun collect(collector: FlowCollector<EventBackfillListResponse>) {
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
