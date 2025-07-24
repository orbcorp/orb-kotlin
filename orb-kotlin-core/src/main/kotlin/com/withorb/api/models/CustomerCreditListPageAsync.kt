// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.AutoPagerAsync
import com.withorb.api.core.PageAsync
import com.withorb.api.core.checkRequired
import com.withorb.api.services.async.customers.CreditServiceAsync
import java.util.Objects

/** @see CreditServiceAsync.list */
class CustomerCreditListPageAsync
private constructor(
    private val service: CreditServiceAsync,
    private val params: CustomerCreditListParams,
    private val response: CustomerCreditListPageResponse,
) : PageAsync<CustomerCreditListResponse> {

    /**
     * Delegates to [CustomerCreditListPageResponse], but gracefully handles missing data.
     *
     * @see CustomerCreditListPageResponse.data
     */
    fun data(): List<CustomerCreditListResponse> =
        response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [CustomerCreditListPageResponse], but gracefully handles missing data.
     *
     * @see CustomerCreditListPageResponse.paginationMetadata
     */
    fun paginationMetadata(): PaginationMetadata? =
        response._paginationMetadata().getNullable("pagination_metadata")

    override fun items(): List<CustomerCreditListResponse> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paginationMetadata()?.let { it._nextCursor().getNullable("next_cursor") } != null

    fun nextPageParams(): CustomerCreditListParams {
        val nextCursor =
            paginationMetadata()?.let { it._nextCursor().getNullable("next_cursor") }
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override suspend fun nextPage(): CustomerCreditListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<CustomerCreditListResponse> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CustomerCreditListParams = params

    /** The response that this page was parsed from. */
    fun response(): CustomerCreditListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CustomerCreditListPageAsync].
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

    /** A builder for [CustomerCreditListPageAsync]. */
    class Builder internal constructor() {

        private var service: CreditServiceAsync? = null
        private var params: CustomerCreditListParams? = null
        private var response: CustomerCreditListPageResponse? = null

        internal fun from(customerCreditListPageAsync: CustomerCreditListPageAsync) = apply {
            service = customerCreditListPageAsync.service
            params = customerCreditListPageAsync.params
            response = customerCreditListPageAsync.response
        }

        fun service(service: CreditServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CustomerCreditListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CustomerCreditListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CustomerCreditListPageAsync].
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
        fun build(): CustomerCreditListPageAsync =
            CustomerCreditListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerCreditListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "CustomerCreditListPageAsync{service=$service, params=$params, response=$response}"
}
