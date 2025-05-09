// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.AutoPager
import com.withorb.api.core.Page
import com.withorb.api.core.checkRequired
import com.withorb.api.services.blocking.events.BackfillService
import java.util.Objects

/** @see [BackfillService.list] */
class EventBackfillListPage
private constructor(
    private val service: BackfillService,
    private val params: EventBackfillListParams,
    private val response: EventBackfillListPageResponse,
) : Page<EventBackfillListResponse> {

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

    override fun nextPage(): EventBackfillListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<EventBackfillListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): EventBackfillListParams = params

    /** The response that this page was parsed from. */
    fun response(): EventBackfillListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EventBackfillListPage].
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

    /** A builder for [EventBackfillListPage]. */
    class Builder internal constructor() {

        private var service: BackfillService? = null
        private var params: EventBackfillListParams? = null
        private var response: EventBackfillListPageResponse? = null

        internal fun from(eventBackfillListPage: EventBackfillListPage) = apply {
            service = eventBackfillListPage.service
            params = eventBackfillListPage.params
            response = eventBackfillListPage.response
        }

        fun service(service: BackfillService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: EventBackfillListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: EventBackfillListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [EventBackfillListPage].
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
        fun build(): EventBackfillListPage =
            EventBackfillListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EventBackfillListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "EventBackfillListPage{service=$service, params=$params, response=$response}"
}
