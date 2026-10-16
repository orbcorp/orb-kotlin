// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.AutoPager
import com.withorb.api.core.Page
import com.withorb.api.core.checkRequired
import com.withorb.api.services.blocking.dimensionalPriceGroups.PriceService
import java.util.Objects

/** @see PriceService.list */
class DimensionalPriceGroupPriceListPage
private constructor(
    private val service: PriceService,
    private val params: DimensionalPriceGroupPriceListParams,
    private val response: DimensionalPriceGroupPriceListPageResponse,
) : Page<Price> {

    /**
     * Delegates to [DimensionalPriceGroupPriceListPageResponse], but gracefully handles missing
     * data.
     *
     * @see DimensionalPriceGroupPriceListPageResponse.data
     */
    fun data(): List<Price> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [DimensionalPriceGroupPriceListPageResponse], but gracefully handles missing
     * data.
     *
     * @see DimensionalPriceGroupPriceListPageResponse.paginationMetadata
     */
    fun paginationMetadata(): PaginationMetadata? =
        response._paginationMetadata().getNullable("pagination_metadata")

    override fun items(): List<Price> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paginationMetadata()?.let { it._nextCursor().getNullable("next_cursor") } != null

    fun nextPageParams(): DimensionalPriceGroupPriceListParams {
        val nextCursor =
            paginationMetadata()?.let { it._nextCursor().getNullable("next_cursor") }
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): DimensionalPriceGroupPriceListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<Price> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): DimensionalPriceGroupPriceListParams = params

    /** The response that this page was parsed from. */
    fun response(): DimensionalPriceGroupPriceListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [DimensionalPriceGroupPriceListPage].
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

    /** A builder for [DimensionalPriceGroupPriceListPage]. */
    class Builder internal constructor() {

        private var service: PriceService? = null
        private var params: DimensionalPriceGroupPriceListParams? = null
        private var response: DimensionalPriceGroupPriceListPageResponse? = null

        internal fun from(dimensionalPriceGroupPriceListPage: DimensionalPriceGroupPriceListPage) =
            apply {
                service = dimensionalPriceGroupPriceListPage.service
                params = dimensionalPriceGroupPriceListPage.params
                response = dimensionalPriceGroupPriceListPage.response
            }

        fun service(service: PriceService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: DimensionalPriceGroupPriceListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: DimensionalPriceGroupPriceListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [DimensionalPriceGroupPriceListPage].
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
        fun build(): DimensionalPriceGroupPriceListPage =
            DimensionalPriceGroupPriceListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DimensionalPriceGroupPriceListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "DimensionalPriceGroupPriceListPage{service=$service, params=$params, response=$response}"
}
