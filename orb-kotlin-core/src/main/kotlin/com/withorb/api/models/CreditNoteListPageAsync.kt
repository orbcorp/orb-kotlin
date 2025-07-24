// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.AutoPagerAsync
import com.withorb.api.core.PageAsync
import com.withorb.api.core.checkRequired
import com.withorb.api.services.async.CreditNoteServiceAsync
import java.util.Objects

/** @see CreditNoteServiceAsync.list */
class CreditNoteListPageAsync
private constructor(
    private val service: CreditNoteServiceAsync,
    private val params: CreditNoteListParams,
    private val response: CreditNoteListPageResponse,
) : PageAsync<CreditNote> {

    /**
     * Delegates to [CreditNoteListPageResponse], but gracefully handles missing data.
     *
     * @see CreditNoteListPageResponse.data
     */
    fun data(): List<CreditNote> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [CreditNoteListPageResponse], but gracefully handles missing data.
     *
     * @see CreditNoteListPageResponse.paginationMetadata
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

    override suspend fun nextPage(): CreditNoteListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<CreditNote> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CreditNoteListParams = params

    /** The response that this page was parsed from. */
    fun response(): CreditNoteListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CreditNoteListPageAsync].
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

    /** A builder for [CreditNoteListPageAsync]. */
    class Builder internal constructor() {

        private var service: CreditNoteServiceAsync? = null
        private var params: CreditNoteListParams? = null
        private var response: CreditNoteListPageResponse? = null

        internal fun from(creditNoteListPageAsync: CreditNoteListPageAsync) = apply {
            service = creditNoteListPageAsync.service
            params = creditNoteListPageAsync.params
            response = creditNoteListPageAsync.response
        }

        fun service(service: CreditNoteServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CreditNoteListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CreditNoteListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CreditNoteListPageAsync].
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
        fun build(): CreditNoteListPageAsync =
            CreditNoteListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CreditNoteListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "CreditNoteListPageAsync{service=$service, params=$params, response=$response}"
}
