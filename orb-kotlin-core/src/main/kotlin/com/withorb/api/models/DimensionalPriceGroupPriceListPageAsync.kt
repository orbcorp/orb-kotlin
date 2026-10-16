// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.AutoPagerAsync
import com.withorb.api.core.PageAsync
import com.withorb.api.core.checkRequired
import com.withorb.api.services.async.dimensionalPriceGroups.PriceServiceAsync
import java.util.Objects

/** @see PriceServiceAsync.list */
class DimensionalPriceGroupPriceListPageAsync
private constructor(
    private val service: PriceServiceAsync,
    private val params: DimensionalPriceGroupPriceListParams,
    private val response: DimensionalPriceGroupPriceListPageResponse,
) : PageAsync<Price> {

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

    override suspend fun nextPage(): DimensionalPriceGroupPriceListPageAsync =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<Price> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): DimensionalPriceGroupPriceListParams = params

    /** The response that this page was parsed from. */
    fun response(): DimensionalPriceGroupPriceListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [DimensionalPriceGroupPriceListPageAsync].
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

    /** A builder for [DimensionalPriceGroupPriceListPageAsync]. */
    class Builder internal constructor() {

        private var service: PriceServiceAsync? = null
        private var params: DimensionalPriceGroupPriceListParams? = null
        private var response: DimensionalPriceGroupPriceListPageResponse? = null

        internal fun from(
            dimensionalPriceGroupPriceListPageAsync: DimensionalPriceGroupPriceListPageAsync
        ) = apply {
            service = dimensionalPriceGroupPriceListPageAsync.service
            params = dimensionalPriceGroupPriceListPageAsync.params
            response = dimensionalPriceGroupPriceListPageAsync.response
        }

        fun service(service: PriceServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: DimensionalPriceGroupPriceListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: DimensionalPriceGroupPriceListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [DimensionalPriceGroupPriceListPageAsync].
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
        fun build(): DimensionalPriceGroupPriceListPageAsync =
            DimensionalPriceGroupPriceListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DimensionalPriceGroupPriceListPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "DimensionalPriceGroupPriceListPageAsync{service=$service, params=$params, response=$response}"
}
