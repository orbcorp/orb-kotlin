// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.services.blocking.coupons.SubscriptionService
import java.util.Objects

/**
 * This endpoint returns a list of all subscriptions that have redeemed a given coupon as a
 * [paginated](/api-reference/pagination) list, ordered starting from the most recently created
 * subscription. For a full discussion of the subscription resource, see
 * [Subscription](/core-concepts#subscription).
 */
class CouponSubscriptionListPage
private constructor(
    private val subscriptionsService: SubscriptionService,
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

        return /* spotless:off */ other is CouponSubscriptionListPage && subscriptionsService == other.subscriptionsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(subscriptionsService, params, response) /* spotless:on */

    override fun toString() =
        "CouponSubscriptionListPage{subscriptionsService=$subscriptionsService, params=$params, response=$response}"

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

    fun getNextPage(): CouponSubscriptionListPage? {
        return getNextPageParams()?.let { subscriptionsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            subscriptionsService: SubscriptionService,
            params: CouponSubscriptionListParams,
            response: Subscriptions,
        ) = CouponSubscriptionListPage(subscriptionsService, params, response)
    }

    class AutoPager(private val firstPage: CouponSubscriptionListPage) : Sequence<Subscription> {

        override fun iterator(): Iterator<Subscription> = iterator {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.data().size) {
                    yield(page.data()[index++])
                }
                page = page.getNextPage() ?: break
                index = 0
            }
        }
    }
}
