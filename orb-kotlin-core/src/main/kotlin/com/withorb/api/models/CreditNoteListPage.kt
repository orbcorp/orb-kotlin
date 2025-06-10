// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.AutoPager
import com.withorb.api.core.Page
import com.withorb.api.core.checkRequired
import com.withorb.api.services.blocking.CreditNoteService
import java.util.Objects

/** @see [CreditNoteService.list] */
class CreditNoteListPage
private constructor(
    private val service: CreditNoteService,
    private val params: CreditNoteListParams,
    private val response: CreditNoteListPageResponse,
) : Page<CreditNote> {

    /**
     * Delegates to [CreditNoteListPageResponse], but gracefully handles missing data.
     *
     * @see [CreditNoteListPageResponse.data]
     */
    fun data(): List<CreditNote> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [CreditNoteListPageResponse], but gracefully handles missing data.
     *
     * @see [CreditNoteListPageResponse.paginationMetadata]
     */
    fun paginationMetadata(): PaginationMetadata? =
        response._paginationMetadata().getNullable("pagination_metadata")

    override fun items(): List<CreditNote> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paginationMetadata()?.let { it._nextCursor().getNullable("next_cursor") } != null

    fun nextPageParams(): CreditNoteListParams {
        val nextCursor =
            paginationMetadata()?.let { it._nextCursor().getNullable("next_cursor") }
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CreditNoteListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<CreditNote> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CreditNoteListParams = params

    /** The response that this page was parsed from. */
    fun response(): CreditNoteListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CreditNoteListPage].
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

    /** A builder for [CreditNoteListPage]. */
    class Builder internal constructor() {

        private var service: CreditNoteService? = null
        private var params: CreditNoteListParams? = null
        private var response: CreditNoteListPageResponse? = null

        internal fun from(creditNoteListPage: CreditNoteListPage) = apply {
            service = creditNoteListPage.service
            params = creditNoteListPage.params
            response = creditNoteListPage.response
        }

        fun service(service: CreditNoteService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CreditNoteListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CreditNoteListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CreditNoteListPage].
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
        fun build(): CreditNoteListPage =
            CreditNoteListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CreditNoteListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "CreditNoteListPage{service=$service, params=$params, response=$response}"
}
