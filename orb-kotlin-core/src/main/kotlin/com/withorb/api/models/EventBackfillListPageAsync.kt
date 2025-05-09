// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.AutoPagerAsync
import com.withorb.api.core.PageAsync
import com.withorb.api.core.checkRequired
import com.withorb.api.services.async.events.BackfillServiceAsync
import java.util.Objects

/** @see [BackfillServiceAsync.list] */
class EventBackfillListPageAsync
private constructor(
    private val service: BackfillServiceAsync,
    private val params: EventBackfillListParams,
    private val response: EventBackfillListPageResponse,
) : PageAsync<EventBackfillListResponse> {

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

    override fun items(): List<EventBackfillListResponse> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paginationMetadata()?.let { it._nextCursor().getNullable("next_cursor") } != null

    fun nextPageParams(): EventBackfillListParams {
        val nextCursor =
            paginationMetadata()?.let { it._nextCursor().getNullable("next_cursor") }
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override suspend fun nextPage(): EventBackfillListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<EventBackfillListResponse> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): EventBackfillListParams = params

    /** The response that this page was parsed from. */
    fun response(): EventBackfillListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EventBackfillListPageAsync].
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

    /** A builder for [EventBackfillListPageAsync]. */
    class Builder internal constructor() {

        private var service: BackfillServiceAsync? = null
        private var params: EventBackfillListParams? = null
        private var response: EventBackfillListPageResponse? = null

        internal fun from(eventBackfillListPageAsync: EventBackfillListPageAsync) = apply {
            service = eventBackfillListPageAsync.service
            params = eventBackfillListPageAsync.params
            response = eventBackfillListPageAsync.response
        }

        fun service(service: BackfillServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: EventBackfillListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: EventBackfillListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [EventBackfillListPageAsync].
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
        fun build(): EventBackfillListPageAsync =
            EventBackfillListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EventBackfillListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "EventBackfillListPageAsync{service=$service, params=$params, response=$response}"
}
