// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.AutoPagerAsync
import com.withorb.api.core.PageAsync
import com.withorb.api.core.checkRequired
import com.withorb.api.services.async.SubscriptionServiceAsync
import java.util.Objects

/** @see SubscriptionServiceAsync.listSummary */
class SubscriptionListSummaryPageAsync
private constructor(
    private val service: SubscriptionServiceAsync,
    private val params: SubscriptionListSummaryParams,
    private val response: SubscriptionListSummaryPageResponse,
) : PageAsync<SubscriptionListSummaryResponse> {

    /**
     * Delegates to [SubscriptionListSummaryPageResponse], but gracefully handles missing data.
     *
     * @see SubscriptionListSummaryPageResponse.data
     */
    fun data(): List<SubscriptionListSummaryResponse> =
        response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [SubscriptionListSummaryPageResponse], but gracefully handles missing data.
     *
     * @see SubscriptionListSummaryPageResponse.paginationMetadata
     */
    fun paginationMetadata(): PaginationMetadata? =
        response._paginationMetadata().getNullable("pagination_metadata")

    override fun items(): List<SubscriptionListSummaryResponse> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paginationMetadata()?.let { it._nextCursor().getNullable("next_cursor") } != null

    fun nextPageParams(): SubscriptionListSummaryParams {
        val nextCursor =
            paginationMetadata()?.let { it._nextCursor().getNullable("next_cursor") }
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override suspend fun nextPage(): SubscriptionListSummaryPageAsync =
        service.listSummary(nextPageParams())

    fun autoPager(): AutoPagerAsync<SubscriptionListSummaryResponse> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): SubscriptionListSummaryParams = params

    /** The response that this page was parsed from. */
    fun response(): SubscriptionListSummaryPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [SubscriptionListSummaryPageAsync].
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

    /** A builder for [SubscriptionListSummaryPageAsync]. */
    class Builder internal constructor() {

        private var service: SubscriptionServiceAsync? = null
        private var params: SubscriptionListSummaryParams? = null
        private var response: SubscriptionListSummaryPageResponse? = null

        internal fun from(subscriptionListSummaryPageAsync: SubscriptionListSummaryPageAsync) =
            apply {
                service = subscriptionListSummaryPageAsync.service
                params = subscriptionListSummaryPageAsync.params
                response = subscriptionListSummaryPageAsync.response
            }

        fun service(service: SubscriptionServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: SubscriptionListSummaryParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: SubscriptionListSummaryPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [SubscriptionListSummaryPageAsync].
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
        fun build(): SubscriptionListSummaryPageAsync =
            SubscriptionListSummaryPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SubscriptionListSummaryPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "SubscriptionListSummaryPageAsync{service=$service, params=$params, response=$response}"
}
