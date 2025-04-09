// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.services.async.SubscriptionServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/**
 * This endpoint returns a [paginated](/api-reference/pagination) list of all plans associated with
 * a subscription along with their start and end dates. This list contains the subscription's
 * initial plan along with past and future plan changes.
 */
class SubscriptionFetchSchedulePageAsync
private constructor(
    private val subscriptionsService: SubscriptionServiceAsync,
    private val params: SubscriptionFetchScheduleParams,
    private val response: SubscriptionFetchSchedulePageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): SubscriptionFetchSchedulePageResponse = response

    /**
     * Delegates to [SubscriptionFetchSchedulePageResponse], but gracefully handles missing data.
     *
     * @see [SubscriptionFetchSchedulePageResponse.data]
     */
    fun data(): List<SubscriptionFetchScheduleResponse> =
        response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [SubscriptionFetchSchedulePageResponse], but gracefully handles missing data.
     *
     * @see [SubscriptionFetchSchedulePageResponse.paginationMetadata]
     */
    fun paginationMetadata(): PaginationMetadata? =
        response._paginationMetadata().getNullable("pagination_metadata")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SubscriptionFetchSchedulePageAsync && subscriptionsService == other.subscriptionsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(subscriptionsService, params, response) /* spotless:on */

    override fun toString() =
        "SubscriptionFetchSchedulePageAsync{subscriptionsService=$subscriptionsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean =
        data().isNotEmpty() &&
            paginationMetadata()?.let { it._nextCursor().getNullable("next_cursor") } != null

    fun getNextPageParams(): SubscriptionFetchScheduleParams? {
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

    suspend fun getNextPage(): SubscriptionFetchSchedulePageAsync? {
        return getNextPageParams()?.let { subscriptionsService.fetchSchedule(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            subscriptionsService: SubscriptionServiceAsync,
            params: SubscriptionFetchScheduleParams,
            response: SubscriptionFetchSchedulePageResponse,
        ) = SubscriptionFetchSchedulePageAsync(subscriptionsService, params, response)
    }

    class AutoPager(private val firstPage: SubscriptionFetchSchedulePageAsync) :
        Flow<SubscriptionFetchScheduleResponse> {

        override suspend fun collect(collector: FlowCollector<SubscriptionFetchScheduleResponse>) {
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
