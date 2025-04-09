// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.services.blocking.events.BackfillService
import java.util.Objects

/**
 * This endpoint returns a list of all backfills in a list format.
 *
 * The list of backfills is ordered starting from the most recently created backfill. The response
 * also includes [`pagination_metadata`](/api-reference/pagination), which lets the caller retrieve
 * the next page of results if they exist. More information about pagination can be found in the
 * [Pagination-metadata schema](pagination).
 */
class EventBackfillListPage
private constructor(
    private val backfillsService: BackfillService,
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

        return /* spotless:off */ other is EventBackfillListPage && backfillsService == other.backfillsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(backfillsService, params, response) /* spotless:on */

    override fun toString() =
        "EventBackfillListPage{backfillsService=$backfillsService, params=$params, response=$response}"

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

    fun getNextPage(): EventBackfillListPage? {
        return getNextPageParams()?.let { backfillsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            backfillsService: BackfillService,
            params: EventBackfillListParams,
            response: EventBackfillListPageResponse,
        ) = EventBackfillListPage(backfillsService, params, response)
    }

    class AutoPager(private val firstPage: EventBackfillListPage) :
        Sequence<EventBackfillListResponse> {

        override fun iterator(): Iterator<EventBackfillListResponse> = iterator {
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
