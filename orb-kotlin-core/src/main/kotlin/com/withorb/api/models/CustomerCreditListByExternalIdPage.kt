// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.AutoPager
import com.withorb.api.core.Page
import com.withorb.api.core.checkRequired
import com.withorb.api.services.blocking.customers.CreditService
import java.util.Objects

/** @see [CreditService.listByExternalId] */
class CustomerCreditListByExternalIdPage
private constructor(
    private val service: CreditService,
    private val params: CustomerCreditListByExternalIdParams,
    private val response: CustomerCreditListByExternalIdPageResponse,
) : Page<CustomerCreditListByExternalIdResponse> {

    /**
     * Delegates to [CustomerCreditListByExternalIdPageResponse], but gracefully handles missing
     * data.
     *
     * @see [CustomerCreditListByExternalIdPageResponse.data]
     */
    fun data(): List<CustomerCreditListByExternalIdResponse> =
        response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [CustomerCreditListByExternalIdPageResponse], but gracefully handles missing
     * data.
     *
     * @see [CustomerCreditListByExternalIdPageResponse.paginationMetadata]
     */
    fun paginationMetadata(): PaginationMetadata? =
        response._paginationMetadata().getNullable("pagination_metadata")

    override fun items(): List<CustomerCreditListByExternalIdResponse> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paginationMetadata()?.let { it._nextCursor().getNullable("next_cursor") } != null

    fun nextPageParams(): CustomerCreditListByExternalIdParams {
        val nextCursor =
            paginationMetadata()?.let { it._nextCursor().getNullable("next_cursor") }
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CustomerCreditListByExternalIdPage =
        service.listByExternalId(nextPageParams())

    fun autoPager(): AutoPager<CustomerCreditListByExternalIdResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CustomerCreditListByExternalIdParams = params

    /** The response that this page was parsed from. */
    fun response(): CustomerCreditListByExternalIdPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [CustomerCreditListByExternalIdPage].
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

    /** A builder for [CustomerCreditListByExternalIdPage]. */
    class Builder internal constructor() {

        private var service: CreditService? = null
        private var params: CustomerCreditListByExternalIdParams? = null
        private var response: CustomerCreditListByExternalIdPageResponse? = null

        internal fun from(customerCreditListByExternalIdPage: CustomerCreditListByExternalIdPage) =
            apply {
                service = customerCreditListByExternalIdPage.service
                params = customerCreditListByExternalIdPage.params
                response = customerCreditListByExternalIdPage.response
            }

        fun service(service: CreditService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CustomerCreditListByExternalIdParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CustomerCreditListByExternalIdPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [CustomerCreditListByExternalIdPage].
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
        fun build(): CustomerCreditListByExternalIdPage =
            CustomerCreditListByExternalIdPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerCreditListByExternalIdPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "CustomerCreditListByExternalIdPage{service=$service, params=$params, response=$response}"
}
