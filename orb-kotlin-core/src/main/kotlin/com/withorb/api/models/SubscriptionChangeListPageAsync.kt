// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.AutoPagerAsync
import com.withorb.api.core.PageAsync
import com.withorb.api.core.checkRequired
import com.withorb.api.services.async.SubscriptionChangeServiceAsync
import java.util.Objects

/** @see SubscriptionChangeServiceAsync.list */
class SubscriptionChangeListPageAsync
private constructor(
    private val service: SubscriptionChangeServiceAsync,
    private val params: SubscriptionChangeListParams,
    private val response: SubscriptionChangeListPageResponse,
) : PageAsync<SubscriptionChangeListResponse> {

    /**
     * Delegates to [SubscriptionChangeListPageResponse], but gracefully handles missing data.
     *
     * @see SubscriptionChangeListPageResponse.data
     */
    fun data(): List<SubscriptionChangeListResponse> =
        response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [SubscriptionChangeListPageResponse], but gracefully handles missing data.
     *
     * @see SubscriptionChangeListPageResponse.paginationMetadata
     */
    fun paginationMetadata(): PaginationMetadata? =
        response._paginationMetadata().getNullable("pagination_metadata")

    override fun items(): List<SubscriptionChangeListResponse> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paginationMetadata()?.let { it._nextCursor().getNullable("next_cursor") } != null

    fun nextPageParams(): SubscriptionChangeListParams {
        val nextCursor =
            paginationMetadata()?.let { it._nextCursor().getNullable("next_cursor") }
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override suspend fun nextPage(): SubscriptionChangeListPageAsync =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<SubscriptionChangeListResponse> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): SubscriptionChangeListParams = params

    /** The response that this page was parsed from. */
    fun response(): SubscriptionChangeListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [SubscriptionChangeListPageAsync].
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

    /** A builder for [SubscriptionChangeListPageAsync]. */
    class Builder internal constructor() {

        private var service: SubscriptionChangeServiceAsync? = null
        private var params: SubscriptionChangeListParams? = null
        private var response: SubscriptionChangeListPageResponse? = null

        internal fun from(subscriptionChangeListPageAsync: SubscriptionChangeListPageAsync) =
            apply {
                service = subscriptionChangeListPageAsync.service
                params = subscriptionChangeListPageAsync.params
                response = subscriptionChangeListPageAsync.response
            }

        fun service(service: SubscriptionChangeServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: SubscriptionChangeListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: SubscriptionChangeListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [SubscriptionChangeListPageAsync].
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
        fun build(): SubscriptionChangeListPageAsync =
            SubscriptionChangeListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SubscriptionChangeListPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "SubscriptionChangeListPageAsync{service=$service, params=$params, response=$response}"
}
