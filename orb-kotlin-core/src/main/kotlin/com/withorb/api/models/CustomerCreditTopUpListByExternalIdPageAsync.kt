// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.AutoPagerAsync
import com.withorb.api.core.PageAsync
import com.withorb.api.core.checkRequired
import com.withorb.api.services.async.customers.credits.TopUpServiceAsync
import java.util.Objects

/** @see [TopUpServiceAsync.listByExternalId] */
class CustomerCreditTopUpListByExternalIdPageAsync
private constructor(
    private val service: TopUpServiceAsync,
    private val params: CustomerCreditTopUpListByExternalIdParams,
    private val response: CustomerCreditTopUpListByExternalIdPageResponse,
) : PageAsync<CustomerCreditTopUpListByExternalIdResponse> {

    /**
     * Delegates to [CustomerCreditTopUpListByExternalIdPageResponse], but gracefully handles
     * missing data.
     *
     * @see [CustomerCreditTopUpListByExternalIdPageResponse.data]
     */
    fun data(): List<CustomerCreditTopUpListByExternalIdResponse> =
        response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [CustomerCreditTopUpListByExternalIdPageResponse], but gracefully handles
     * missing data.
     *
     * @see [CustomerCreditTopUpListByExternalIdPageResponse.paginationMetadata]
     */
    fun paginationMetadata(): PaginationMetadata? =
        response._paginationMetadata().getNullable("pagination_metadata")

    override fun items(): List<CustomerCreditTopUpListByExternalIdResponse> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paginationMetadata()?.let { it._nextCursor().getNullable("next_cursor") } != null

    fun nextPageParams(): CustomerCreditTopUpListByExternalIdParams {
        val nextCursor =
            paginationMetadata()?.let { it._nextCursor().getNullable("next_cursor") }
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override suspend fun nextPage(): CustomerCreditTopUpListByExternalIdPageAsync =
        service.listByExternalId(nextPageParams())

    fun autoPager(): AutoPagerAsync<CustomerCreditTopUpListByExternalIdResponse> =
        AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CustomerCreditTopUpListByExternalIdParams = params

    /** The response that this page was parsed from. */
    fun response(): CustomerCreditTopUpListByExternalIdPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [CustomerCreditTopUpListByExternalIdPageAsync].
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

    /** A builder for [CustomerCreditTopUpListByExternalIdPageAsync]. */
    class Builder internal constructor() {

        private var service: TopUpServiceAsync? = null
        private var params: CustomerCreditTopUpListByExternalIdParams? = null
        private var response: CustomerCreditTopUpListByExternalIdPageResponse? = null

        internal fun from(
            customerCreditTopUpListByExternalIdPageAsync:
                CustomerCreditTopUpListByExternalIdPageAsync
        ) = apply {
            service = customerCreditTopUpListByExternalIdPageAsync.service
            params = customerCreditTopUpListByExternalIdPageAsync.params
            response = customerCreditTopUpListByExternalIdPageAsync.response
        }

        fun service(service: TopUpServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CustomerCreditTopUpListByExternalIdParams) = apply {
            this.params = params
        }

        /** The response that this page was parsed from. */
        fun response(response: CustomerCreditTopUpListByExternalIdPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [CustomerCreditTopUpListByExternalIdPageAsync].
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
        fun build(): CustomerCreditTopUpListByExternalIdPageAsync =
            CustomerCreditTopUpListByExternalIdPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerCreditTopUpListByExternalIdPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "CustomerCreditTopUpListByExternalIdPageAsync{service=$service, params=$params, response=$response}"
}
