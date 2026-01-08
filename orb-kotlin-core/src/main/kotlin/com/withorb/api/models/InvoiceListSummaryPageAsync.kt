// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.AutoPagerAsync
import com.withorb.api.core.PageAsync
import com.withorb.api.core.checkRequired
import com.withorb.api.services.async.InvoiceServiceAsync
import java.util.Objects

/** @see InvoiceServiceAsync.listSummary */
class InvoiceListSummaryPageAsync
private constructor(
    private val service: InvoiceServiceAsync,
    private val params: InvoiceListSummaryParams,
    private val response: InvoiceListSummaryPageResponse,
) : PageAsync<InvoiceListSummaryResponse> {

    /**
     * Delegates to [InvoiceListSummaryPageResponse], but gracefully handles missing data.
     *
     * @see InvoiceListSummaryPageResponse.data
     */
    fun data(): List<InvoiceListSummaryResponse> =
        response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [InvoiceListSummaryPageResponse], but gracefully handles missing data.
     *
     * @see InvoiceListSummaryPageResponse.paginationMetadata
     */
    fun paginationMetadata(): PaginationMetadata? =
        response._paginationMetadata().getNullable("pagination_metadata")

    override fun items(): List<InvoiceListSummaryResponse> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paginationMetadata()?.let { it._nextCursor().getNullable("next_cursor") } != null

    fun nextPageParams(): InvoiceListSummaryParams {
        val nextCursor =
            paginationMetadata()?.let { it._nextCursor().getNullable("next_cursor") }
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override suspend fun nextPage(): InvoiceListSummaryPageAsync =
        service.listSummary(nextPageParams())

    fun autoPager(): AutoPagerAsync<InvoiceListSummaryResponse> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): InvoiceListSummaryParams = params

    /** The response that this page was parsed from. */
    fun response(): InvoiceListSummaryPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [InvoiceListSummaryPageAsync].
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

    /** A builder for [InvoiceListSummaryPageAsync]. */
    class Builder internal constructor() {

        private var service: InvoiceServiceAsync? = null
        private var params: InvoiceListSummaryParams? = null
        private var response: InvoiceListSummaryPageResponse? = null

        internal fun from(invoiceListSummaryPageAsync: InvoiceListSummaryPageAsync) = apply {
            service = invoiceListSummaryPageAsync.service
            params = invoiceListSummaryPageAsync.params
            response = invoiceListSummaryPageAsync.response
        }

        fun service(service: InvoiceServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: InvoiceListSummaryParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: InvoiceListSummaryPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [InvoiceListSummaryPageAsync].
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
        fun build(): InvoiceListSummaryPageAsync =
            InvoiceListSummaryPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InvoiceListSummaryPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "InvoiceListSummaryPageAsync{service=$service, params=$params, response=$response}"
}
