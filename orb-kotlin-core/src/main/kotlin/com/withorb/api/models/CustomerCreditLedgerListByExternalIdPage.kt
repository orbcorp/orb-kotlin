// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.AutoPager
import com.withorb.api.core.Page
import com.withorb.api.core.checkRequired
import com.withorb.api.services.blocking.customers.credits.LedgerService
import java.util.Objects

/** @see LedgerService.listByExternalId */
class CustomerCreditLedgerListByExternalIdPage
private constructor(
    private val service: LedgerService,
    private val params: CustomerCreditLedgerListByExternalIdParams,
    private val response: CustomerCreditLedgerListByExternalIdPageResponse,
) : Page<CustomerCreditLedgerListByExternalIdResponse> {

    /**
     * Delegates to [CustomerCreditLedgerListByExternalIdPageResponse], but gracefully handles
     * missing data.
     *
     * @see CustomerCreditLedgerListByExternalIdPageResponse.data
     */
    fun data(): List<CustomerCreditLedgerListByExternalIdResponse> =
        response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [CustomerCreditLedgerListByExternalIdPageResponse], but gracefully handles
     * missing data.
     *
     * @see CustomerCreditLedgerListByExternalIdPageResponse.paginationMetadata
     */
    fun paginationMetadata(): PaginationMetadata? =
        response._paginationMetadata().getNullable("pagination_metadata")

    override fun items(): List<CustomerCreditLedgerListByExternalIdResponse> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paginationMetadata()?.let { it._nextCursor().getNullable("next_cursor") } != null

    fun nextPageParams(): CustomerCreditLedgerListByExternalIdParams {
        val nextCursor =
            paginationMetadata()?.let { it._nextCursor().getNullable("next_cursor") }
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CustomerCreditLedgerListByExternalIdPage =
        service.listByExternalId(nextPageParams())

    fun autoPager(): AutoPager<CustomerCreditLedgerListByExternalIdResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CustomerCreditLedgerListByExternalIdParams = params

    /** The response that this page was parsed from. */
    fun response(): CustomerCreditLedgerListByExternalIdPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [CustomerCreditLedgerListByExternalIdPage].
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

    /** A builder for [CustomerCreditLedgerListByExternalIdPage]. */
    class Builder internal constructor() {

        private var service: LedgerService? = null
        private var params: CustomerCreditLedgerListByExternalIdParams? = null
        private var response: CustomerCreditLedgerListByExternalIdPageResponse? = null

        internal fun from(
            customerCreditLedgerListByExternalIdPage: CustomerCreditLedgerListByExternalIdPage
        ) = apply {
            service = customerCreditLedgerListByExternalIdPage.service
            params = customerCreditLedgerListByExternalIdPage.params
            response = customerCreditLedgerListByExternalIdPage.response
        }

        fun service(service: LedgerService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CustomerCreditLedgerListByExternalIdParams) = apply {
            this.params = params
        }

        /** The response that this page was parsed from. */
        fun response(response: CustomerCreditLedgerListByExternalIdPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [CustomerCreditLedgerListByExternalIdPage].
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
        fun build(): CustomerCreditLedgerListByExternalIdPage =
            CustomerCreditLedgerListByExternalIdPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerCreditLedgerListByExternalIdPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "CustomerCreditLedgerListByExternalIdPage{service=$service, params=$params, response=$response}"
}
