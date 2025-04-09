// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.checkRequired
import com.withorb.api.services.async.AlertServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** @see [AlertServiceAsync.list] */
class AlertListPageAsync
private constructor(
    private val service: AlertServiceAsync,
    private val params: AlertListParams,
    private val response: AlertListPageResponse,
) {

    /**
     * Delegates to [AlertListPageResponse], but gracefully handles missing data.
     *
     * @see [AlertListPageResponse.data]
     */
    fun data(): List<Alert> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [AlertListPageResponse], but gracefully handles missing data.
     *
     * @see [AlertListPageResponse.paginationMetadata]
     */
    fun paginationMetadata(): PaginationMetadata? =
        response._paginationMetadata().getNullable("pagination_metadata")

    fun hasNextPage(): Boolean =
        data().isNotEmpty() &&
            paginationMetadata()?.let { it._nextCursor().getNullable("next_cursor") } != null

    fun getNextPageParams(): AlertListParams? {
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

    suspend fun getNextPage(): AlertListPageAsync? = getNextPageParams()?.let { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): AlertListParams = params

    /** The response that this page was parsed from. */
    fun response(): AlertListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AlertListPageAsync].
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

    /** A builder for [AlertListPageAsync]. */
    class Builder internal constructor() {

        private var service: AlertServiceAsync? = null
        private var params: AlertListParams? = null
        private var response: AlertListPageResponse? = null

        internal fun from(alertListPageAsync: AlertListPageAsync) = apply {
            service = alertListPageAsync.service
            params = alertListPageAsync.params
            response = alertListPageAsync.response
        }

        fun service(service: AlertServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AlertListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AlertListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AlertListPageAsync].
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
        fun build(): AlertListPageAsync =
            AlertListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: AlertListPageAsync) : Flow<Alert> {

        override suspend fun collect(collector: FlowCollector<Alert>) {
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AlertListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "AlertListPageAsync{service=$service, params=$params, response=$response}"
}
