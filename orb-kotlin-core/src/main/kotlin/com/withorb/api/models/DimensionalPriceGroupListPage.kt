// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.AutoPager
import com.withorb.api.core.Page
import com.withorb.api.core.checkRequired
import com.withorb.api.services.blocking.DimensionalPriceGroupService
import java.util.Objects

/** @see [DimensionalPriceGroupService.list] */
class DimensionalPriceGroupListPage
private constructor(
    private val service: DimensionalPriceGroupService,
    private val params: DimensionalPriceGroupListParams,
    private val response: DimensionalPriceGroups,
) : Page<DimensionalPriceGroup> {

    /**
     * Delegates to [DimensionalPriceGroups], but gracefully handles missing data.
     *
     * @see [DimensionalPriceGroups.data]
     */
    fun data(): List<DimensionalPriceGroup> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [DimensionalPriceGroups], but gracefully handles missing data.
     *
     * @see [DimensionalPriceGroups.paginationMetadata]
     */
    fun paginationMetadata(): PaginationMetadata? =
        response._paginationMetadata().getNullable("pagination_metadata")

    override fun items(): List<DimensionalPriceGroup> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paginationMetadata()?.let { it._nextCursor().getNullable("next_cursor") } != null

    fun nextPageParams(): DimensionalPriceGroupListParams {
        val nextCursor =
            paginationMetadata()?.let { it._nextCursor().getNullable("next_cursor") }
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): DimensionalPriceGroupListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<DimensionalPriceGroup> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): DimensionalPriceGroupListParams = params

    /** The response that this page was parsed from. */
    fun response(): DimensionalPriceGroups = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [DimensionalPriceGroupListPage].
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

    /** A builder for [DimensionalPriceGroupListPage]. */
    class Builder internal constructor() {

        private var service: DimensionalPriceGroupService? = null
        private var params: DimensionalPriceGroupListParams? = null
        private var response: DimensionalPriceGroups? = null

        internal fun from(dimensionalPriceGroupListPage: DimensionalPriceGroupListPage) = apply {
            service = dimensionalPriceGroupListPage.service
            params = dimensionalPriceGroupListPage.params
            response = dimensionalPriceGroupListPage.response
        }

        fun service(service: DimensionalPriceGroupService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: DimensionalPriceGroupListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: DimensionalPriceGroups) = apply { this.response = response }

        /**
         * Returns an immutable instance of [DimensionalPriceGroupListPage].
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
        fun build(): DimensionalPriceGroupListPage =
            DimensionalPriceGroupListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DimensionalPriceGroupListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "DimensionalPriceGroupListPage{service=$service, params=$params, response=$response}"
}
