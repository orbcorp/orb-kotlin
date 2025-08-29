// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.AutoPagerAsync
import com.withorb.api.core.PageAsync
import com.withorb.api.core.checkRequired
import com.withorb.api.services.async.customers.CreditServiceAsync
import java.util.Objects

/** @see CreditServiceAsync.listByExternalId */
class CustomerCreditListByExternalIdPageAsync
private constructor(
    private val service: CreditServiceAsync,
    private val params: CustomerCreditListByExternalIdParams,
    private val response: CustomerCreditListByExternalIdPageResponse,
) : PageAsync<CustomerCreditListByExternalIdResponse> {

    /**
     * Delegates to [CustomerCreditListByExternalIdPageResponse], but gracefully handles missing
     * data.
     *
     * @see CustomerCreditListByExternalIdPageResponse.data
     */
    fun data(): List<CustomerCreditListByExternalIdResponse> =
        response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [CustomerCreditListByExternalIdPageResponse], but gracefully handles missing
     * data.
     *
     * @see CustomerCreditListByExternalIdPageResponse.paginationMetadata
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

    override suspend fun nextPage(): CustomerCreditListByExternalIdPageAsync =
        service.listByExternalId(nextPageParams())

    fun autoPager(): AutoPagerAsync<CustomerCreditListByExternalIdResponse> =
        AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CustomerCreditListByExternalIdParams = params

    /** The response that this page was parsed from. */
    fun response(): CustomerCreditListByExternalIdPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [CustomerCreditListByExternalIdPageAsync].
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

    /** A builder for [CustomerCreditListByExternalIdPageAsync]. */
    class Builder internal constructor() {

        private var service: CreditServiceAsync? = null
        private var params: CustomerCreditListByExternalIdParams? = null
        private var response: CustomerCreditListByExternalIdPageResponse? = null

        internal fun from(
            customerCreditListByExternalIdPageAsync: CustomerCreditListByExternalIdPageAsync
        ) = apply {
            service = customerCreditListByExternalIdPageAsync.service
            params = customerCreditListByExternalIdPageAsync.params
            response = customerCreditListByExternalIdPageAsync.response
        }

        fun service(service: CreditServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CustomerCreditListByExternalIdParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CustomerCreditListByExternalIdPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [CustomerCreditListByExternalIdPageAsync].
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
        fun build(): CustomerCreditListByExternalIdPageAsync =
            CustomerCreditListByExternalIdPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomerCreditListByExternalIdPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "CustomerCreditListByExternalIdPageAsync{service=$service, params=$params, response=$response}"
}
