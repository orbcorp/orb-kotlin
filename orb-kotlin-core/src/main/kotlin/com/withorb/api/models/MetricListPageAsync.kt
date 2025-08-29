// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.AutoPagerAsync
import com.withorb.api.core.PageAsync
import com.withorb.api.core.checkRequired
import com.withorb.api.services.async.MetricServiceAsync
import java.util.Objects

/** @see MetricServiceAsync.list */
class MetricListPageAsync
private constructor(
    private val service: MetricServiceAsync,
    private val params: MetricListParams,
    private val response: MetricListPageResponse,
) : PageAsync<BillableMetric> {

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

    override suspend fun nextPage(): MetricListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<BillableMetric> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): MetricListParams = params

    /** The response that this page was parsed from. */
    fun response(): MetricListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [MetricListPageAsync].
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

    /** A builder for [MetricListPageAsync]. */
    class Builder internal constructor() {

        private var service: MetricServiceAsync? = null
        private var params: MetricListParams? = null
        private var response: MetricListPageResponse? = null

        internal fun from(metricListPageAsync: MetricListPageAsync) = apply {
            service = metricListPageAsync.service
            params = metricListPageAsync.params
            response = metricListPageAsync.response
        }

        fun service(service: MetricServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: MetricListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: MetricListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [MetricListPageAsync].
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
        fun build(): MetricListPageAsync =
            MetricListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MetricListPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "MetricListPageAsync{service=$service, params=$params, response=$response}"
}
