// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.checkRequired
import com.withorb.api.services.async.customers.BalanceTransactionServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** @see [BalanceTransactionServiceAsync.list] */
class CustomerBalanceTransactionListPageAsync
private constructor(
    private val service: BalanceTransactionServiceAsync,
    private val params: CustomerBalanceTransactionListParams,
    private val response: CustomerBalanceTransactionListPageResponse,
) {

    /**
     * Delegates to [CustomerBalanceTransactionListPageResponse], but gracefully handles missing
     * data.
     *
     * @see [CustomerBalanceTransactionListPageResponse.data]
     */
    fun data(): List<CustomerBalanceTransactionListResponse> =
        response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [CustomerBalanceTransactionListPageResponse], but gracefully handles missing
     * data.
     *
     * @see [CustomerBalanceTransactionListPageResponse.paginationMetadata]
     */
    fun paginationMetadata(): PaginationMetadata? =
        response._paginationMetadata().getNullable("pagination_metadata")

    fun hasNextPage(): Boolean =
        data().isNotEmpty() &&
            paginationMetadata()?.let { it._nextCursor().getNullable("next_cursor") } != null

    fun getNextPageParams(): CustomerBalanceTransactionListParams? {
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

    suspend fun getNextPage(): CustomerBalanceTransactionListPageAsync? =
        getNextPageParams()?.let { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): CustomerBalanceTransactionListParams = params

    /** The response that this page was parsed from. */
    fun response(): CustomerBalanceTransactionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [CustomerBalanceTransactionListPageAsync].
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

    /** A builder for [CustomerBalanceTransactionListPageAsync]. */
    class Builder internal constructor() {

        private var service: BalanceTransactionServiceAsync? = null
        private var params: CustomerBalanceTransactionListParams? = null
        private var response: CustomerBalanceTransactionListPageResponse? = null

        internal fun from(
            customerBalanceTransactionListPageAsync: CustomerBalanceTransactionListPageAsync
        ) = apply {
            service = customerBalanceTransactionListPageAsync.service
            params = customerBalanceTransactionListPageAsync.params
            response = customerBalanceTransactionListPageAsync.response
        }

        fun service(service: BalanceTransactionServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CustomerBalanceTransactionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CustomerBalanceTransactionListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [CustomerBalanceTransactionListPageAsync].
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
        fun build(): CustomerBalanceTransactionListPageAsync =
            CustomerBalanceTransactionListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: CustomerBalanceTransactionListPageAsync) :
        Flow<CustomerBalanceTransactionListResponse> {

        override suspend fun collect(
            collector: FlowCollector<CustomerBalanceTransactionListResponse>
        ) {
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

        return /* spotless:off */ other is CustomerBalanceTransactionListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "CustomerBalanceTransactionListPageAsync{service=$service, params=$params, response=$response}"
}
