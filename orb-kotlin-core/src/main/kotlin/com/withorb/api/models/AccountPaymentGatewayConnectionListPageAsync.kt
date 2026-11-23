// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.AutoPagerAsync
import com.withorb.api.core.PageAsync
import com.withorb.api.core.checkRequired
import com.withorb.api.services.async.account.PaymentGatewayConnectionServiceAsync
import java.util.Objects

/** @see PaymentGatewayConnectionServiceAsync.list */
class AccountPaymentGatewayConnectionListPageAsync
private constructor(
    private val service: PaymentGatewayConnectionServiceAsync,
    private val params: AccountPaymentGatewayConnectionListParams,
    private val response: AccountPaymentGatewayConnectionListPageResponse,
) : PageAsync<PaymentGatewayConnection> {

    /**
     * Delegates to [AccountPaymentGatewayConnectionListPageResponse], but gracefully handles
     * missing data.
     *
     * @see AccountPaymentGatewayConnectionListPageResponse.data
     */
    fun data(): List<PaymentGatewayConnection> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [AccountPaymentGatewayConnectionListPageResponse], but gracefully handles
     * missing data.
     *
     * @see AccountPaymentGatewayConnectionListPageResponse.paginationMetadata
     */
    fun paginationMetadata(): PaginationMetadata? =
        response._paginationMetadata().getNullable("pagination_metadata")

    override fun items(): List<PaymentGatewayConnection> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paginationMetadata()?.let { it._nextCursor().getNullable("next_cursor") } != null

    fun nextPageParams(): AccountPaymentGatewayConnectionListParams {
        val nextCursor =
            paginationMetadata()?.let { it._nextCursor().getNullable("next_cursor") }
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override suspend fun nextPage(): AccountPaymentGatewayConnectionListPageAsync =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<PaymentGatewayConnection> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AccountPaymentGatewayConnectionListParams = params

    /** The response that this page was parsed from. */
    fun response(): AccountPaymentGatewayConnectionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [AccountPaymentGatewayConnectionListPageAsync].
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

    /** A builder for [AccountPaymentGatewayConnectionListPageAsync]. */
    class Builder internal constructor() {

        private var service: PaymentGatewayConnectionServiceAsync? = null
        private var params: AccountPaymentGatewayConnectionListParams? = null
        private var response: AccountPaymentGatewayConnectionListPageResponse? = null

        internal fun from(
            accountPaymentGatewayConnectionListPageAsync:
                AccountPaymentGatewayConnectionListPageAsync
        ) = apply {
            service = accountPaymentGatewayConnectionListPageAsync.service
            params = accountPaymentGatewayConnectionListPageAsync.params
            response = accountPaymentGatewayConnectionListPageAsync.response
        }

        fun service(service: PaymentGatewayConnectionServiceAsync) = apply {
            this.service = service
        }

        /** The parameters that were used to request this page. */
        fun params(params: AccountPaymentGatewayConnectionListParams) = apply {
            this.params = params
        }

        /** The response that this page was parsed from. */
        fun response(response: AccountPaymentGatewayConnectionListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [AccountPaymentGatewayConnectionListPageAsync].
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
        fun build(): AccountPaymentGatewayConnectionListPageAsync =
            AccountPaymentGatewayConnectionListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AccountPaymentGatewayConnectionListPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "AccountPaymentGatewayConnectionListPageAsync{service=$service, params=$params, response=$response}"
}
