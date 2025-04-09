// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.checkRequired
import com.withorb.api.services.blocking.PlanService
import java.util.Objects

/** @see [PlanService.list] */
class PlanListPage
private constructor(
    private val service: PlanService,
    private val params: PlanListParams,
    private val response: PlanListPageResponse,
) {

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

    fun getNextPage(): PlanListPage? = getNextPageParams()?.let { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): PlanListParams = params

    /** The response that this page was parsed from. */
    fun response(): PlanListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PlanListPage].
         *
         * The following fields are required:
         * ```kotlin
         * .service()
         * .params()
         * .response()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [PlanListPage]. */
    class Builder internal constructor() {

        private var service: PlanService? = null
        private var params: PlanListParams? = null
        private var response: PlanListPageResponse? = null

        internal fun from(planListPage: PlanListPage) = apply {
            service = planListPage.service
            params = planListPage.params
            response = planListPage.response
        }

        fun service(service: PlanService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PlanListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PlanListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [PlanListPage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .service()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PlanListPage =
            PlanListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PlanListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() = "PlanListPage{service=$service, params=$params, response=$response}"
}
