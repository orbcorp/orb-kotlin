// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.checkRequired
import com.withorb.api.services.async.customers.credits.LedgerServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** @see [LedgerServiceAsync.listByExternalId] */
class CustomerCreditLedgerListByExternalIdPageAsync
private constructor(
    private val service: LedgerServiceAsync,
    private val params: CustomerCreditLedgerListByExternalIdParams,
    private val response: CustomerCreditLedgerListByExternalIdPageResponse,
) {

    /**
     * Delegates to [CustomerCreditLedgerListByExternalIdPageResponse], but gracefully handles
     * missing data.
     *
     * @see [CustomerCreditLedgerListByExternalIdPageResponse.data]
     */
    fun data(): List<CustomerCreditLedgerListByExternalIdResponse> =
        response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [CustomerCreditLedgerListByExternalIdPageResponse], but gracefully handles
     * missing data.
     *
     * @see [CustomerCreditLedgerListByExternalIdPageResponse.paginationMetadata]
     */
    fun paginationMetadata(): PaginationMetadata? =
        response._paginationMetadata().getNullable("pagination_metadata")

    fun hasNextPage(): Boolean =
        data().isNotEmpty() &&
            paginationMetadata()?.let { it._nextCursor().getNullable("next_cursor") } != null

    fun getNextPageParams(): CustomerCreditLedgerListByExternalIdParams? {
        if (!hasNextPage()) {
            return null
        }

        return params
            .toBuilder()
            .apply {
                paginationMetadata()
                    ?.let { it._nextCursor().getNullable("next_cursor") }
                    ?.let { cursor(it) }
            }
            .build()
    }

    suspend fun getNextPage(): CustomerCreditLedgerListByExternalIdPageAsync? =
        getNextPageParams()?.let { service.listByExternalId(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): CustomerCreditLedgerListByExternalIdParams = params

    /** The response that this page was parsed from. */
    fun response(): CustomerCreditLedgerListByExternalIdPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [CustomerCreditLedgerListByExternalIdPageAsync].
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

    /** A builder for [CustomerCreditLedgerListByExternalIdPageAsync]. */
    class Builder internal constructor() {

        private var service: LedgerServiceAsync? = null
        private var params: CustomerCreditLedgerListByExternalIdParams? = null
        private var response: CustomerCreditLedgerListByExternalIdPageResponse? = null

        internal fun from(
            customerCreditLedgerListByExternalIdPageAsync:
                CustomerCreditLedgerListByExternalIdPageAsync
        ) = apply {
            service = customerCreditLedgerListByExternalIdPageAsync.service
            params = customerCreditLedgerListByExternalIdPageAsync.params
            response = customerCreditLedgerListByExternalIdPageAsync.response
        }

        fun service(service: LedgerServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CustomerCreditLedgerListByExternalIdParams) = apply {
            this.params = params
        }

        /** The response that this page was parsed from. */
        fun response(response: CustomerCreditLedgerListByExternalIdPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [CustomerCreditLedgerListByExternalIdPageAsync].
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
        fun build(): CustomerCreditLedgerListByExternalIdPageAsync =
            CustomerCreditLedgerListByExternalIdPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: CustomerCreditLedgerListByExternalIdPageAsync) :
        Flow<CustomerCreditLedgerListByExternalIdResponse> {

        override suspend fun collect(
            collector: FlowCollector<CustomerCreditLedgerListByExternalIdResponse>
        ) {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.data().size) {
                    collector.emit(page.data()[index++])
                }
                page = page.getNextPage() ?: break
                index = 0
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerCreditLedgerListByExternalIdPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "CustomerCreditLedgerListByExternalIdPageAsync{service=$service, params=$params, response=$response}"
}
