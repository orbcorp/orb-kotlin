// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.AutoPager
import com.withorb.api.core.Page
import com.withorb.api.core.checkRequired
import com.withorb.api.services.blocking.SubscriptionChangeService
import java.util.Objects

/** @see SubscriptionChangeService.list */
class SubscriptionChangeListPage
private constructor(
    private val service: SubscriptionChangeService,
    private val params: SubscriptionChangeListParams,
    private val response: SubscriptionChangeListPageResponse,
) : Page<SubscriptionChangeListResponse> {

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

    override fun nextPage(): SubscriptionChangeListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<SubscriptionChangeListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): SubscriptionChangeListParams = params

    /** The response that this page was parsed from. */
    fun response(): SubscriptionChangeListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SubscriptionChangeListPage].
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

    /** A builder for [SubscriptionChangeListPage]. */
    class Builder internal constructor() {

        private var service: SubscriptionChangeService? = null
        private var params: SubscriptionChangeListParams? = null
        private var response: SubscriptionChangeListPageResponse? = null

        internal fun from(subscriptionChangeListPage: SubscriptionChangeListPage) = apply {
            service = subscriptionChangeListPage.service
            params = subscriptionChangeListPage.params
            response = subscriptionChangeListPage.response
        }

        fun service(service: SubscriptionChangeService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: SubscriptionChangeListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: SubscriptionChangeListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [SubscriptionChangeListPage].
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
        fun build(): SubscriptionChangeListPage =
            SubscriptionChangeListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SubscriptionChangeListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "SubscriptionChangeListPage{service=$service, params=$params, response=$response}"
}
