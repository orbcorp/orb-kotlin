// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.services.async.CreditNoteServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/**
 * Get a paginated list of CreditNotes. Users can also filter by customer_id, subscription_id, or
 * external_customer_id. The credit notes will be returned in reverse chronological order by
 * `creation_time`.
 */
class CreditNoteListPageAsync
private constructor(
    private val creditNotesService: CreditNoteServiceAsync,
    private val params: CreditNoteListParams,
    private val response: CreditNoteListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): CreditNoteListPageResponse = response

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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CreditNoteListPageAsync && creditNotesService == other.creditNotesService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(creditNotesService, params, response) /* spotless:on */

    override fun toString() =
        "CreditNoteListPageAsync{creditNotesService=$creditNotesService, params=$params, response=$response}"

    fun hasNextPage(): Boolean =
        data().isNotEmpty() &&
            paginationMetadata()?.let { it._nextCursor().getNullable("next_cursor") } != null

    fun getNextPageParams(): CreditNoteListParams? {
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

    suspend fun getNextPage(): CreditNoteListPageAsync? {
        return getNextPageParams()?.let { creditNotesService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            creditNotesService: CreditNoteServiceAsync,
            params: CreditNoteListParams,
            response: CreditNoteListPageResponse,
        ) = CreditNoteListPageAsync(creditNotesService, params, response)
    }

    class AutoPager(private val firstPage: CreditNoteListPageAsync) : Flow<CreditNote> {

        override suspend fun collect(collector: FlowCollector<CreditNote>) {
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
}
