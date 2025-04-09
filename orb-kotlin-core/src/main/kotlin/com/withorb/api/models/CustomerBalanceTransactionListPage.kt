// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.checkRequired
import com.withorb.api.services.blocking.customers.BalanceTransactionService
import java.util.Objects

/** @see [BalanceTransactionService.list] */
class CustomerBalanceTransactionListPage
private constructor(
    private val service: BalanceTransactionService,
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

    fun getNextPage(): CustomerBalanceTransactionListPage? =
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
         * [CustomerBalanceTransactionListPage].
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

    /** A builder for [CustomerBalanceTransactionListPage]. */
    class Builder internal constructor() {

        private var service: BalanceTransactionService? = null
        private var params: CustomerBalanceTransactionListParams? = null
        private var response: CustomerBalanceTransactionListPageResponse? = null

        internal fun from(customerBalanceTransactionListPage: CustomerBalanceTransactionListPage) =
            apply {
                service = customerBalanceTransactionListPage.service
                params = customerBalanceTransactionListPage.params
                response = customerBalanceTransactionListPage.response
            }

        fun service(service: BalanceTransactionService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CustomerBalanceTransactionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CustomerBalanceTransactionListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [CustomerBalanceTransactionListPage].
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
        fun build(): CustomerBalanceTransactionListPage =
            CustomerBalanceTransactionListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: CustomerBalanceTransactionListPage) :
        Sequence<CustomerBalanceTransactionListResponse> {

        override fun iterator(): Iterator<CustomerBalanceTransactionListResponse> = iterator {
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerBalanceTransactionListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "CustomerBalanceTransactionListPage{service=$service, params=$params, response=$response}"
}
