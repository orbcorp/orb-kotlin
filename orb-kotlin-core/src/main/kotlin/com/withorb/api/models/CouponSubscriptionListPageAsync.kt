// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.services.async.coupons.SubscriptionServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/**
 * This endpoint returns a list of all subscriptions that have redeemed a given coupon as a
 * [paginated](/api-reference/pagination) list, ordered starting from the most recently created
 * subscription. For a full discussion of the subscription resource, see
 * [Subscription](/core-concepts#subscription).
 */
class CouponSubscriptionListPageAsync
private constructor(
    private val subscriptionsService: SubscriptionServiceAsync,
    private val params: CouponSubscriptionListParams,
    private val response: Subscriptions,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): Subscriptions = response

    /**
     * Delegates to [Subscriptions], but gracefully handles missing data.
     *
     * @see [Subscriptions.data]
     */
    fun data(): List<Subscription> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [Subscriptions], but gracefully handles missing data.
     *
     * @see [Subscriptions.paginationMetadata]
     */
    fun paginationMetadata(): PaginationMetadata? =
        response._paginationMetadata().getNullable("pagination_metadata")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CouponSubscriptionListPageAsync && subscriptionsService == other.subscriptionsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(subscriptionsService, params, response) /* spotless:on */

    override fun toString() =
        "CouponSubscriptionListPageAsync{subscriptionsService=$subscriptionsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean =
        data().isNotEmpty() &&
            paginationMetadata()?.let { it._nextCursor().getNullable("next_cursor") } != null

    fun getNextPageParams(): CouponSubscriptionListParams? {
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

    suspend fun getNextPage(): CouponSubscriptionListPageAsync? {
        return getNextPageParams()?.let { subscriptionsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            subscriptionsService: SubscriptionServiceAsync,
            params: CouponSubscriptionListParams,
            response: Subscriptions,
        ) = CouponSubscriptionListPageAsync(subscriptionsService, params, response)
    }

    class AutoPager(private val firstPage: CouponSubscriptionListPageAsync) : Flow<Subscription> {

        override suspend fun collect(collector: FlowCollector<Subscription>) {
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
