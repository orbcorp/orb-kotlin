// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.checkRequired
import com.withorb.api.services.async.SubscriptionServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** @see [SubscriptionServiceAsync.fetchSchedule] */
class SubscriptionFetchSchedulePageAsync
private constructor(
    private val service: SubscriptionServiceAsync,
    private val params: SubscriptionFetchScheduleParams,
    private val response: SubscriptionFetchSchedulePageResponse,
) {

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

    suspend fun getNextPage(): SubscriptionFetchSchedulePageAsync? =
        getNextPageParams()?.let { service.fetchSchedule(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): SubscriptionFetchScheduleParams = params

    /** The response that this page was parsed from. */
    fun response(): SubscriptionFetchSchedulePageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [SubscriptionFetchSchedulePageAsync].
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

    /** A builder for [SubscriptionFetchSchedulePageAsync]. */
    class Builder internal constructor() {

        private var service: SubscriptionServiceAsync? = null
        private var params: SubscriptionFetchScheduleParams? = null
        private var response: SubscriptionFetchSchedulePageResponse? = null

        internal fun from(subscriptionFetchSchedulePageAsync: SubscriptionFetchSchedulePageAsync) =
            apply {
                service = subscriptionFetchSchedulePageAsync.service
                params = subscriptionFetchSchedulePageAsync.params
                response = subscriptionFetchSchedulePageAsync.response
            }

        fun service(service: SubscriptionServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: SubscriptionFetchScheduleParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: SubscriptionFetchSchedulePageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [SubscriptionFetchSchedulePageAsync].
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
        fun build(): SubscriptionFetchSchedulePageAsync =
            SubscriptionFetchSchedulePageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SubscriptionFetchSchedulePageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "SubscriptionFetchSchedulePageAsync{service=$service, params=$params, response=$response}"
}
