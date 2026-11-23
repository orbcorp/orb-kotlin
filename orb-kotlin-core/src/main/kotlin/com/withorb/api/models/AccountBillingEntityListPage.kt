// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.AutoPager
import com.withorb.api.core.Page
import com.withorb.api.core.checkRequired
import com.withorb.api.services.blocking.account.BillingEntityService
import java.util.Objects

/** @see BillingEntityService.list */
class AccountBillingEntityListPage
private constructor(
    private val service: BillingEntityService,
    private val params: AccountBillingEntityListParams,
    private val response: AccountBillingEntityListPageResponse,
) : Page<BillingEntity> {

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

    override fun nextPage(): AccountBillingEntityListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<BillingEntity> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AccountBillingEntityListParams = params

    /** The response that this page was parsed from. */
    fun response(): AccountBillingEntityListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AccountBillingEntityListPage].
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

    /** A builder for [AccountBillingEntityListPage]. */
    class Builder internal constructor() {

        private var service: BillingEntityService? = null
        private var params: AccountBillingEntityListParams? = null
        private var response: AccountBillingEntityListPageResponse? = null

        internal fun from(accountBillingEntityListPage: AccountBillingEntityListPage) = apply {
            service = accountBillingEntityListPage.service
            params = accountBillingEntityListPage.params
            response = accountBillingEntityListPage.response
        }

        fun service(service: BillingEntityService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AccountBillingEntityListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AccountBillingEntityListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [AccountBillingEntityListPage].
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
        fun build(): AccountBillingEntityListPage =
            AccountBillingEntityListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AccountBillingEntityListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "AccountBillingEntityListPage{service=$service, params=$params, response=$response}"
}
