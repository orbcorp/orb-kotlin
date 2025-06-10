// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.AutoPager
import com.withorb.api.core.Page
import com.withorb.api.core.checkRequired
import com.withorb.api.services.blocking.PriceService
import java.util.Objects

/** @see [PriceService.list] */
class PriceListPage
private constructor(
    private val service: PriceService,
    private val params: PriceListParams,
    private val response: PriceListPageResponse,
) : Page<Price> {

    /**
     * Delegates to [PriceListPageResponse], but gracefully handles missing data.
     *
     * @see [PriceListPageResponse.data]
     */
    fun data(): List<Price> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [PriceListPageResponse], but gracefully handles missing data.
     *
     * @see [PriceListPageResponse.paginationMetadata]
     */
    fun paginationMetadata(): PaginationMetadata? =
        response._paginationMetadata().getNullable("pagination_metadata")

    override fun items(): List<Price> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paginationMetadata()?.let { it._nextCursor().getNullable("next_cursor") } != null

    fun nextPageParams(): PriceListParams {
        val nextCursor =
            paginationMetadata()?.let { it._nextCursor().getNullable("next_cursor") }
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): PriceListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<Price> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): PriceListParams = params

    /** The response that this page was parsed from. */
    fun response(): PriceListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PriceListPage].
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

    /** A builder for [PriceListPage]. */
    class Builder internal constructor() {

        private var service: PriceService? = null
        private var params: PriceListParams? = null
        private var response: PriceListPageResponse? = null

        internal fun from(priceListPage: PriceListPage) = apply {
            service = priceListPage.service
            params = priceListPage.params
            response = priceListPage.response
        }

        fun service(service: PriceService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PriceListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PriceListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [PriceListPage].
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
        fun build(): PriceListPage =
            PriceListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PriceListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() = "PriceListPage{service=$service, params=$params, response=$response}"
}
