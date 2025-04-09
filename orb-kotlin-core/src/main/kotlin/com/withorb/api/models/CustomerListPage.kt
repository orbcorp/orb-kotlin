// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.checkRequired
import com.withorb.api.services.blocking.CustomerService
import java.util.Objects

/** @see [CustomerService.list] */
class CustomerListPage
private constructor(
    private val service: CustomerService,
    private val params: CustomerListParams,
    private val response: CustomerListPageResponse,
) {

    /**
     * Delegates to [CustomerListPageResponse], but gracefully handles missing data.
     *
     * @see [CustomerListPageResponse.data]
     */
    fun data(): List<Customer> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [CustomerListPageResponse], but gracefully handles missing data.
     *
     * @see [CustomerListPageResponse.paginationMetadata]
     */
    fun paginationMetadata(): PaginationMetadata? =
        response._paginationMetadata().getNullable("pagination_metadata")

    fun hasNextPage(): Boolean =
        data().isNotEmpty() &&
            paginationMetadata()?.let { it._nextCursor().getNullable("next_cursor") } != null

    fun getNextPageParams(): CustomerListParams? {
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

    fun getNextPage(): CustomerListPage? = getNextPageParams()?.let { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): CustomerListParams = params

    /** The response that this page was parsed from. */
    fun response(): CustomerListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CustomerListPage].
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

    /** A builder for [CustomerListPage]. */
    class Builder internal constructor() {

        private var service: CustomerService? = null
        private var params: CustomerListParams? = null
        private var response: CustomerListPageResponse? = null

        internal fun from(customerListPage: CustomerListPage) = apply {
            service = customerListPage.service
            params = customerListPage.params
            response = customerListPage.response
        }

        fun service(service: CustomerService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CustomerListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CustomerListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CustomerListPage].
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
        fun build(): CustomerListPage =
            CustomerListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: CustomerListPage) : Sequence<Customer> {

        override fun iterator(): Iterator<Customer> = iterator {
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

        return /* spotless:off */ other is CustomerListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "CustomerListPage{service=$service, params=$params, response=$response}"
}
