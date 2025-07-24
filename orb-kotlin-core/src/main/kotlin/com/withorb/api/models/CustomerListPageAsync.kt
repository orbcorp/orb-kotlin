// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.AutoPagerAsync
import com.withorb.api.core.PageAsync
import com.withorb.api.core.checkRequired
import com.withorb.api.services.async.CustomerServiceAsync
import java.util.Objects

/** @see CustomerServiceAsync.list */
class CustomerListPageAsync
private constructor(
    private val service: CustomerServiceAsync,
    private val params: CustomerListParams,
    private val response: CustomerListPageResponse,
) : PageAsync<Customer> {

    /**
     * Delegates to [CustomerListPageResponse], but gracefully handles missing data.
     *
     * @see CustomerListPageResponse.data
     */
    fun data(): List<Customer> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [CustomerListPageResponse], but gracefully handles missing data.
     *
     * @see CustomerListPageResponse.paginationMetadata
     */
    fun paginationMetadata(): PaginationMetadata? =
        response._paginationMetadata().getNullable("pagination_metadata")

    override fun items(): List<Customer> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paginationMetadata()?.let { it._nextCursor().getNullable("next_cursor") } != null

    fun nextPageParams(): CustomerListParams {
        val nextCursor =
            paginationMetadata()?.let { it._nextCursor().getNullable("next_cursor") }
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override suspend fun nextPage(): CustomerListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<Customer> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CustomerListParams = params

    /** The response that this page was parsed from. */
    fun response(): CustomerListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CustomerListPageAsync].
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

    /** A builder for [CustomerListPageAsync]. */
    class Builder internal constructor() {

        private var service: CustomerServiceAsync? = null
        private var params: CustomerListParams? = null
        private var response: CustomerListPageResponse? = null

        internal fun from(customerListPageAsync: CustomerListPageAsync) = apply {
            service = customerListPageAsync.service
            params = customerListPageAsync.params
            response = customerListPageAsync.response
        }

        fun service(service: CustomerServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CustomerListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CustomerListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CustomerListPageAsync].
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
        fun build(): CustomerListPageAsync =
            CustomerListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "CustomerListPageAsync{service=$service, params=$params, response=$response}"
}
