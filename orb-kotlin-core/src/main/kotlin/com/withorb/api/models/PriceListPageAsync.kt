// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.checkRequired
import com.withorb.api.services.async.PriceServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** @see [PriceServiceAsync.list] */
class PriceListPageAsync
private constructor(
    private val service: PriceServiceAsync,
    private val params: PriceListParams,
    private val response: PriceListPageResponse,
) {

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

    fun hasNextPage(): Boolean =
        data().isNotEmpty() &&
            paginationMetadata()?.let { it._nextCursor().getNullable("next_cursor") } != null

    fun getNextPageParams(): PriceListParams? {
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

    suspend fun getNextPage(): PriceListPageAsync? = getNextPageParams()?.let { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): PriceListParams = params

    /** The response that this page was parsed from. */
    fun response(): PriceListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PriceListPageAsync].
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

    /** A builder for [PriceListPageAsync]. */
    class Builder internal constructor() {

        private var service: PriceServiceAsync? = null
        private var params: PriceListParams? = null
        private var response: PriceListPageResponse? = null

        internal fun from(priceListPageAsync: PriceListPageAsync) = apply {
            service = priceListPageAsync.service
            params = priceListPageAsync.params
            response = priceListPageAsync.response
        }

        fun service(service: PriceServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PriceListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PriceListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [PriceListPageAsync].
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
        fun build(): PriceListPageAsync =
            PriceListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: PriceListPageAsync) : Flow<Price> {

        override suspend fun collect(collector: FlowCollector<Price>) {
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

        return /* spotless:off */ other is PriceListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "PriceListPageAsync{service=$service, params=$params, response=$response}"
}
