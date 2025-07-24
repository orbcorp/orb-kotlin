// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.AutoPagerAsync
import com.withorb.api.core.PageAsync
import com.withorb.api.core.checkRequired
import com.withorb.api.services.async.customers.credits.LedgerServiceAsync
import java.util.Objects

/** @see LedgerServiceAsync.list */
class CustomerCreditLedgerListPageAsync
private constructor(
    private val service: LedgerServiceAsync,
    private val params: CustomerCreditLedgerListParams,
    private val response: CustomerCreditLedgerListPageResponse,
) : PageAsync<CustomerCreditLedgerListResponse> {

    /**
     * Delegates to [CustomerCreditLedgerListPageResponse], but gracefully handles missing data.
     *
     * @see CustomerCreditLedgerListPageResponse.data
     */
    fun data(): List<CustomerCreditLedgerListResponse> =
        response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [CustomerCreditLedgerListPageResponse], but gracefully handles missing data.
     *
     * @see CustomerCreditLedgerListPageResponse.paginationMetadata
     */
    fun paginationMetadata(): PaginationMetadata? =
        response._paginationMetadata().getNullable("pagination_metadata")

    override fun items(): List<CustomerCreditLedgerListResponse> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paginationMetadata()?.let { it._nextCursor().getNullable("next_cursor") } != null

    fun nextPageParams(): CustomerCreditLedgerListParams {
        val nextCursor =
            paginationMetadata()?.let { it._nextCursor().getNullable("next_cursor") }
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override suspend fun nextPage(): CustomerCreditLedgerListPageAsync =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<CustomerCreditLedgerListResponse> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CustomerCreditLedgerListParams = params

    /** The response that this page was parsed from. */
    fun response(): CustomerCreditLedgerListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [CustomerCreditLedgerListPageAsync].
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

    /** A builder for [CustomerCreditLedgerListPageAsync]. */
    class Builder internal constructor() {

        private var service: LedgerServiceAsync? = null
        private var params: CustomerCreditLedgerListParams? = null
        private var response: CustomerCreditLedgerListPageResponse? = null

        internal fun from(customerCreditLedgerListPageAsync: CustomerCreditLedgerListPageAsync) =
            apply {
                service = customerCreditLedgerListPageAsync.service
                params = customerCreditLedgerListPageAsync.params
                response = customerCreditLedgerListPageAsync.response
            }

        fun service(service: LedgerServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CustomerCreditLedgerListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CustomerCreditLedgerListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [CustomerCreditLedgerListPageAsync].
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
        fun build(): CustomerCreditLedgerListPageAsync =
            CustomerCreditLedgerListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerCreditLedgerListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "CustomerCreditLedgerListPageAsync{service=$service, params=$params, response=$response}"
}
