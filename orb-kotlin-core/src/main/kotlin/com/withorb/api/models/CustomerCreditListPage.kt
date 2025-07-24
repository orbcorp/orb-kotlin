// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.AutoPager
import com.withorb.api.core.Page
import com.withorb.api.core.checkRequired
import com.withorb.api.services.blocking.customers.CreditService
import java.util.Objects

/** @see CreditService.list */
class CustomerCreditListPage
private constructor(
    private val service: CreditService,
    private val params: CustomerCreditListParams,
    private val response: CustomerCreditListPageResponse,
) : Page<CustomerCreditListResponse> {

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

    override fun nextPage(): CustomerCreditListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<CustomerCreditListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CustomerCreditListParams = params

    /** The response that this page was parsed from. */
    fun response(): CustomerCreditListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CustomerCreditListPage].
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

    /** A builder for [CustomerCreditListPage]. */
    class Builder internal constructor() {

        private var service: CreditService? = null
        private var params: CustomerCreditListParams? = null
        private var response: CustomerCreditListPageResponse? = null

        internal fun from(customerCreditListPage: CustomerCreditListPage) = apply {
            service = customerCreditListPage.service
            params = customerCreditListPage.params
            response = customerCreditListPage.response
        }

        fun service(service: CreditService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CustomerCreditListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CustomerCreditListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CustomerCreditListPage].
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
        fun build(): CustomerCreditListPage =
            CustomerCreditListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerCreditListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "CustomerCreditListPage{service=$service, params=$params, response=$response}"
}
