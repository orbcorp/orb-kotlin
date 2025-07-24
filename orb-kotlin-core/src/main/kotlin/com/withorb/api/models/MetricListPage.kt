// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.AutoPager
import com.withorb.api.core.Page
import com.withorb.api.core.checkRequired
import com.withorb.api.services.blocking.MetricService
import java.util.Objects

/** @see MetricService.list */
class MetricListPage
private constructor(
    private val service: MetricService,
    private val params: MetricListParams,
    private val response: MetricListPageResponse,
) : Page<BillableMetric> {

    /**
     * Delegates to [MetricListPageResponse], but gracefully handles missing data.
     *
     * @see MetricListPageResponse.data
     */
    fun data(): List<BillableMetric> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [MetricListPageResponse], but gracefully handles missing data.
     *
     * @see MetricListPageResponse.paginationMetadata
     */
    fun paginationMetadata(): PaginationMetadata? =
        response._paginationMetadata().getNullable("pagination_metadata")

    override fun items(): List<BillableMetric> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paginationMetadata()?.let { it._nextCursor().getNullable("next_cursor") } != null

    fun nextPageParams(): MetricListParams {
        val nextCursor =
            paginationMetadata()?.let { it._nextCursor().getNullable("next_cursor") }
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): MetricListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<BillableMetric> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): MetricListParams = params

    /** The response that this page was parsed from. */
    fun response(): MetricListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [MetricListPage].
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

    /** A builder for [MetricListPage]. */
    class Builder internal constructor() {

        private var service: MetricService? = null
        private var params: MetricListParams? = null
        private var response: MetricListPageResponse? = null

        internal fun from(metricListPage: MetricListPage) = apply {
            service = metricListPage.service
            params = metricListPage.params
            response = metricListPage.response
        }

        fun service(service: MetricService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: MetricListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: MetricListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [MetricListPage].
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
        fun build(): MetricListPage =
            MetricListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is MetricListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() = "MetricListPage{service=$service, params=$params, response=$response}"
}
