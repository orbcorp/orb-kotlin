// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.AutoPager
import com.withorb.api.core.Page
import com.withorb.api.core.checkRequired
import com.withorb.api.services.blocking.InvoiceService
import java.util.Objects

/** @see InvoiceService.listSummary */
class InvoiceListSummaryPage
private constructor(
    private val service: InvoiceService,
    private val params: InvoiceListSummaryParams,
    private val response: InvoiceListSummaryPageResponse,
) : Page<InvoiceListSummaryResponse> {

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

    override fun nextPage(): InvoiceListSummaryPage = service.listSummary(nextPageParams())

    fun autoPager(): AutoPager<InvoiceListSummaryResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): InvoiceListSummaryParams = params

    /** The response that this page was parsed from. */
    fun response(): InvoiceListSummaryPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [InvoiceListSummaryPage].
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

    /** A builder for [InvoiceListSummaryPage]. */
    class Builder internal constructor() {

        private var service: InvoiceService? = null
        private var params: InvoiceListSummaryParams? = null
        private var response: InvoiceListSummaryPageResponse? = null

        internal fun from(invoiceListSummaryPage: InvoiceListSummaryPage) = apply {
            service = invoiceListSummaryPage.service
            params = invoiceListSummaryPage.params
            response = invoiceListSummaryPage.response
        }

        fun service(service: InvoiceService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: InvoiceListSummaryParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: InvoiceListSummaryPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [InvoiceListSummaryPage].
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
        fun build(): InvoiceListSummaryPage =
            InvoiceListSummaryPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InvoiceListSummaryPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "InvoiceListSummaryPage{service=$service, params=$params, response=$response}"
}
