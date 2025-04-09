// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.services.blocking.customers.CreditService
import java.util.Objects

/**
 * Returns a paginated list of unexpired, non-zero credit blocks for a customer.
 *
 * If `include_all_blocks` is set to `true`, all credit blocks (including expired and depleted
 * blocks) will be included in the response.
 *
 * Note that `currency` defaults to credits if not specified. To use a real world currency, set
 * `currency` to an ISO 4217 string.
 */
class CustomerCreditListByExternalIdPage
private constructor(
    private val creditsService: CreditService,
    private val params: CustomerCreditListByExternalIdParams,
    private val response: CustomerCreditListByExternalIdPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): CustomerCreditListByExternalIdPageResponse = response

    /**
     * Delegates to [CustomerCreditListByExternalIdPageResponse], but gracefully handles missing
     * data.
     *
     * @see [CustomerCreditListByExternalIdPageResponse.data]
     */
    fun data(): List<CustomerCreditListByExternalIdResponse> =
        response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [CustomerCreditListByExternalIdPageResponse], but gracefully handles missing
     * data.
     *
     * @see [CustomerCreditListByExternalIdPageResponse.paginationMetadata]
     */
    fun paginationMetadata(): PaginationMetadata? =
        response._paginationMetadata().getNullable("pagination_metadata")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerCreditListByExternalIdPage && creditsService == other.creditsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(creditsService, params, response) /* spotless:on */

    override fun toString() =
        "CustomerCreditListByExternalIdPage{creditsService=$creditsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean =
        data().isNotEmpty() &&
            paginationMetadata()?.let { it._nextCursor().getNullable("next_cursor") } != null

    fun getNextPageParams(): CustomerCreditListByExternalIdParams? {
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

    fun getNextPage(): CustomerCreditListByExternalIdPage? {
        return getNextPageParams()?.let { creditsService.listByExternalId(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            creditsService: CreditService,
            params: CustomerCreditListByExternalIdParams,
            response: CustomerCreditListByExternalIdPageResponse,
        ) = CustomerCreditListByExternalIdPage(creditsService, params, response)
    }

    class AutoPager(private val firstPage: CustomerCreditListByExternalIdPage) :
        Sequence<CustomerCreditListByExternalIdResponse> {

        override fun iterator(): Iterator<CustomerCreditListByExternalIdResponse> = iterator {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.data().size) {
                    yield(page.data()[index++])
                }
                page = page.getNextPage() ?: break
                index = 0
            }
        }
    }
}
