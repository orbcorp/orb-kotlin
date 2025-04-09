// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.services.blocking.CouponService
import java.util.Objects

/**
 * This endpoint returns a list of all coupons for an account in a list format.
 *
 * The list of coupons is ordered starting from the most recently created coupon. The response also
 * includes `pagination_metadata`, which lets the caller retrieve the next page of results if they
 * exist. More information about pagination can be found in the Pagination-metadata schema.
 */
class CouponListPage
private constructor(
    private val couponsService: CouponService,
    private val params: CouponListParams,
    private val response: CouponListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): CouponListPageResponse = response

    /**
     * Delegates to [CouponListPageResponse], but gracefully handles missing data.
     *
     * @see [CouponListPageResponse.data]
     */
    fun data(): List<Coupon> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [CouponListPageResponse], but gracefully handles missing data.
     *
     * @see [CouponListPageResponse.paginationMetadata]
     */
    fun paginationMetadata(): PaginationMetadata? =
        response._paginationMetadata().getNullable("pagination_metadata")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CouponListPage && couponsService == other.couponsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(couponsService, params, response) /* spotless:on */

    override fun toString() =
        "CouponListPage{couponsService=$couponsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean =
        data().isNotEmpty() &&
            paginationMetadata()?.let { it._nextCursor().getNullable("next_cursor") } != null

    fun getNextPageParams(): CouponListParams? {
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

    fun getNextPage(): CouponListPage? {
        return getNextPageParams()?.let { couponsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            couponsService: CouponService,
            params: CouponListParams,
            response: CouponListPageResponse,
        ) = CouponListPage(couponsService, params, response)
    }

    class AutoPager(private val firstPage: CouponListPage) : Sequence<Coupon> {

        override fun iterator(): Iterator<Coupon> = iterator {
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
