// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.services.blocking.PlanService
import java.util.Objects

/**
 * This endpoint returns a list of all [plans](/core-concepts#plan-and-price) for an account in a
 * list format. The list of plans is ordered starting from the most recently created plan. The
 * response also includes [`pagination_metadata`](/api-reference/pagination), which lets the caller
 * retrieve the next page of results if they exist.
 */
class PlanListPage
private constructor(
    private val plansService: PlanService,
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

        return /* spotless:off */ other is PlanListPage && plansService == other.plansService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(plansService, params, response) /* spotless:on */

    override fun toString() =
        "PlanListPage{plansService=$plansService, params=$params, response=$response}"

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

    fun getNextPage(): PlanListPage? {
        return getNextPageParams()?.let { plansService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(plansService: PlanService, params: PlanListParams, response: PlanListPageResponse) =
            PlanListPage(plansService, params, response)
    }

    class AutoPager(private val firstPage: PlanListPage) : Sequence<Plan> {

        override fun iterator(): Iterator<Plan> = iterator {
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
