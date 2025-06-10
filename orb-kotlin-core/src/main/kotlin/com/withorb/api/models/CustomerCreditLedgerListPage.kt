// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.AutoPager
import com.withorb.api.core.Page
import com.withorb.api.core.checkRequired
import com.withorb.api.services.blocking.customers.credits.LedgerService
import java.util.Objects

/** @see [LedgerService.list] */
class CustomerCreditLedgerListPage
private constructor(
    private val service: LedgerService,
    private val params: CustomerCreditLedgerListParams,
    private val response: CustomerCreditLedgerListPageResponse,
) : Page<CustomerCreditLedgerListResponse> {

    /**
     * Delegates to [CustomerCreditLedgerListPageResponse], but gracefully handles missing data.
     *
     * @see [CustomerCreditLedgerListPageResponse.data]
     */
    fun data(): List<CustomerCreditLedgerListResponse> =
        response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [CustomerCreditLedgerListPageResponse], but gracefully handles missing data.
     *
     * @see [CustomerCreditLedgerListPageResponse.paginationMetadata]
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

    override fun nextPage(): CustomerCreditLedgerListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<CustomerCreditLedgerListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CustomerCreditLedgerListParams = params

    /** The response that this page was parsed from. */
    fun response(): CustomerCreditLedgerListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CustomerCreditLedgerListPage].
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

    /** A builder for [CustomerCreditLedgerListPage]. */
    class Builder internal constructor() {

        private var service: LedgerService? = null
        private var params: CustomerCreditLedgerListParams? = null
        private var response: CustomerCreditLedgerListPageResponse? = null

        internal fun from(customerCreditLedgerListPage: CustomerCreditLedgerListPage) = apply {
            service = customerCreditLedgerListPage.service
            params = customerCreditLedgerListPage.params
            response = customerCreditLedgerListPage.response
        }

        fun service(service: LedgerService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CustomerCreditLedgerListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CustomerCreditLedgerListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [CustomerCreditLedgerListPage].
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
        fun build(): CustomerCreditLedgerListPage =
            CustomerCreditLedgerListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerCreditLedgerListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "CustomerCreditLedgerListPage{service=$service, params=$params, response=$response}"
}
