// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.checkRequired
import com.withorb.api.services.async.CouponServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** @see [CouponServiceAsync.list] */
class CouponListPageAsync
private constructor(
    private val service: CouponServiceAsync,
    private val params: CouponListParams,
    private val response: CouponListPageResponse,
) {

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

    suspend fun getNextPage(): CouponListPageAsync? = getNextPageParams()?.let { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): CouponListParams = params

    /** The response that this page was parsed from. */
    fun response(): CouponListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CouponListPageAsync].
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

    /** A builder for [CouponListPageAsync]. */
    class Builder internal constructor() {

        private var service: CouponServiceAsync? = null
        private var params: CouponListParams? = null
        private var response: CouponListPageResponse? = null

        internal fun from(couponListPageAsync: CouponListPageAsync) = apply {
            service = couponListPageAsync.service
            params = couponListPageAsync.params
            response = couponListPageAsync.response
        }

        fun service(service: CouponServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CouponListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CouponListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CouponListPageAsync].
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
        fun build(): CouponListPageAsync =
            CouponListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: CouponListPageAsync) : Flow<Coupon> {

        override suspend fun collect(collector: FlowCollector<Coupon>) {
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

        return /* spotless:off */ other is CouponListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "CouponListPageAsync{service=$service, params=$params, response=$response}"
}
