// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.services.blocking.AlertService
import java.util.Objects

/**
 * This endpoint returns a list of alerts within Orb.
 *
 * The request must specify one of `customer_id`, `external_customer_id`, or `subscription_id`.
 *
 * If querying by subscripion_id, the endpoint will return the subscription level alerts as well as
 * the plan level alerts associated with the subscription.
 *
 * The list of alerts is ordered starting from the most recently created alert. This endpoint
 * follows Orb's [standardized pagination format](/api-reference/pagination).
 */
class AlertListPage
private constructor(
    private val alertsService: AlertService,
    private val params: AlertListParams,
    private val response: AlertListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): AlertListPageResponse = response

    /**
     * Delegates to [AlertListPageResponse], but gracefully handles missing data.
     *
     * @see [AlertListPageResponse.data]
     */
    fun data(): List<Alert> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [AlertListPageResponse], but gracefully handles missing data.
     *
     * @see [AlertListPageResponse.paginationMetadata]
     */
    fun paginationMetadata(): PaginationMetadata? =
        response._paginationMetadata().getNullable("pagination_metadata")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AlertListPage && alertsService == other.alertsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(alertsService, params, response) /* spotless:on */

    override fun toString() =
        "AlertListPage{alertsService=$alertsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean =
        data().isNotEmpty() &&
            paginationMetadata()?.let { it._nextCursor().getNullable("next_cursor") } != null

    fun getNextPageParams(): AlertListParams? {
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

    fun getNextPage(): AlertListPage? {
        return getNextPageParams()?.let { alertsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            alertsService: AlertService,
            params: AlertListParams,
            response: AlertListPageResponse,
        ) = AlertListPage(alertsService, params, response)
    }

    class AutoPager(private val firstPage: AlertListPage) : Sequence<Alert> {

        override fun iterator(): Iterator<Alert> = iterator {
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
