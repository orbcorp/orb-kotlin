// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.services.async.PlanServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/**
 * This endpoint returns a list of all [plans](/core-concepts#plan-and-price) for an account in a
 * list format. The list of plans is ordered starting from the most recently created plan. The
 * response also includes [`pagination_metadata`](/api-reference/pagination), which lets the caller
 * retrieve the next page of results if they exist.
 */
class PlanListPageAsync
private constructor(
    private val plansService: PlanServiceAsync,
    private val params: PlanListParams,
    private val response: PlanListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): PlanListPageResponse = response

    /**
     * Delegates to [PlanListPageResponse], but gracefully handles missing data.
     *
     * @see [PlanListPageResponse.data]
     */
    fun data(): List<Plan> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [PlanListPageResponse], but gracefully handles missing data.
     *
     * @see [PlanListPageResponse.paginationMetadata]
     */
    fun paginationMetadata(): PaginationMetadata? =
        response._paginationMetadata().getNullable("pagination_metadata")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PlanListPageAsync && plansService == other.plansService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(plansService, params, response) /* spotless:on */

    override fun toString() =
        "PlanListPageAsync{plansService=$plansService, params=$params, response=$response}"

    fun hasNextPage(): Boolean =
        data().isNotEmpty() &&
            paginationMetadata()?.let { it._nextCursor().getNullable("next_cursor") } != null

    fun getNextPageParams(): PlanListParams? {
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

    suspend fun getNextPage(): PlanListPageAsync? {
        return getNextPageParams()?.let { plansService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            plansService: PlanServiceAsync,
            params: PlanListParams,
            response: PlanListPageResponse,
        ) = PlanListPageAsync(plansService, params, response)
    }

    class AutoPager(private val firstPage: PlanListPageAsync) : Flow<Plan> {

        override suspend fun collect(collector: FlowCollector<Plan>) {
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
