// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.services.async.MetricServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/**
 * This endpoint is used to fetch [metric](/core-concepts##metric) details given a metric
 * identifier. It returns information about the metrics including its name, description, and item.
 */
class MetricListPageAsync
private constructor(
    private val metricsService: MetricServiceAsync,
    private val params: MetricListParams,
    private val response: MetricListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): MetricListPageResponse = response

    /**
     * Delegates to [MetricListPageResponse], but gracefully handles missing data.
     *
     * @see [MetricListPageResponse.data]
     */
    fun data(): List<BillableMetric> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [MetricListPageResponse], but gracefully handles missing data.
     *
     * @see [MetricListPageResponse.paginationMetadata]
     */
    fun paginationMetadata(): PaginationMetadata? =
        response._paginationMetadata().getNullable("pagination_metadata")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is MetricListPageAsync && metricsService == other.metricsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(metricsService, params, response) /* spotless:on */

    override fun toString() =
        "MetricListPageAsync{metricsService=$metricsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean =
        data().isNotEmpty() &&
            paginationMetadata()?.let { it._nextCursor().getNullable("next_cursor") } != null

    fun getNextPageParams(): MetricListParams? {
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

    suspend fun getNextPage(): MetricListPageAsync? {
        return getNextPageParams()?.let { metricsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            metricsService: MetricServiceAsync,
            params: MetricListParams,
            response: MetricListPageResponse,
        ) = MetricListPageAsync(metricsService, params, response)
    }

    class AutoPager(private val firstPage: MetricListPageAsync) : Flow<BillableMetric> {

        override suspend fun collect(collector: FlowCollector<BillableMetric>) {
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
