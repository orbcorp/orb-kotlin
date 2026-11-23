// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.AutoPagerAsync
import com.withorb.api.core.PageAsync
import com.withorb.api.core.checkRequired
import com.withorb.api.services.async.account.BillingEntityServiceAsync
import java.util.Objects

/** @see BillingEntityServiceAsync.list */
class AccountBillingEntityListPageAsync
private constructor(
    private val service: BillingEntityServiceAsync,
    private val params: AccountBillingEntityListParams,
    private val response: AccountBillingEntityListPageResponse,
) : PageAsync<BillingEntity> {

    /**
     * Delegates to [AccountBillingEntityListPageResponse], but gracefully handles missing data.
     *
     * @see AccountBillingEntityListPageResponse.data
     */
    fun data(): List<BillingEntity> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [AccountBillingEntityListPageResponse], but gracefully handles missing data.
     *
     * @see AccountBillingEntityListPageResponse.paginationMetadata
     */
    fun paginationMetadata(): PaginationMetadata? =
        response._paginationMetadata().getNullable("pagination_metadata")

    override fun items(): List<BillingEntity> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paginationMetadata()?.let { it._nextCursor().getNullable("next_cursor") } != null

    fun nextPageParams(): AccountBillingEntityListParams {
        val nextCursor =
            paginationMetadata()?.let { it._nextCursor().getNullable("next_cursor") }
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override suspend fun nextPage(): AccountBillingEntityListPageAsync =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<BillingEntity> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AccountBillingEntityListParams = params

    /** The response that this page was parsed from. */
    fun response(): AccountBillingEntityListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [AccountBillingEntityListPageAsync].
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

    /** A builder for [AccountBillingEntityListPageAsync]. */
    class Builder internal constructor() {

        private var service: BillingEntityServiceAsync? = null
        private var params: AccountBillingEntityListParams? = null
        private var response: AccountBillingEntityListPageResponse? = null

        internal fun from(accountBillingEntityListPageAsync: AccountBillingEntityListPageAsync) =
            apply {
                service = accountBillingEntityListPageAsync.service
                params = accountBillingEntityListPageAsync.params
                response = accountBillingEntityListPageAsync.response
            }

        fun service(service: BillingEntityServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AccountBillingEntityListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AccountBillingEntityListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [AccountBillingEntityListPageAsync].
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
        fun build(): AccountBillingEntityListPageAsync =
            AccountBillingEntityListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AccountBillingEntityListPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "AccountBillingEntityListPageAsync{service=$service, params=$params, response=$response}"
}
