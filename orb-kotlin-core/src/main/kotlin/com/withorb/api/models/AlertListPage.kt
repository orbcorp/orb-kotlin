// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.AutoPager
import com.withorb.api.core.Page
import com.withorb.api.core.checkRequired
import com.withorb.api.services.blocking.AlertService
import java.util.Objects

/** @see AlertService.list */
class AlertListPage
private constructor(
    private val service: AlertService,
    private val params: AlertListParams,
    private val response: AlertListPageResponse,
) : Page<Alert> {

    /**
     * Delegates to [AlertListPageResponse], but gracefully handles missing data.
     *
     * @see AlertListPageResponse.data
     */
    fun data(): List<Alert> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [AlertListPageResponse], but gracefully handles missing data.
     *
     * @see AlertListPageResponse.paginationMetadata
     */
    fun paginationMetadata(): PaginationMetadata? =
        response._paginationMetadata().getNullable("pagination_metadata")

    override fun items(): List<Alert> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paginationMetadata()?.let { it._nextCursor().getNullable("next_cursor") } != null

    fun nextPageParams(): AlertListParams {
        val nextCursor =
            paginationMetadata()?.let { it._nextCursor().getNullable("next_cursor") }
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): AlertListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<Alert> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AlertListParams = params

    /** The response that this page was parsed from. */
    fun response(): AlertListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AlertListPage].
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

    /** A builder for [AlertListPage]. */
    class Builder internal constructor() {

        private var service: AlertService? = null
        private var params: AlertListParams? = null
        private var response: AlertListPageResponse? = null

        internal fun from(alertListPage: AlertListPage) = apply {
            service = alertListPage.service
            params = alertListPage.params
            response = alertListPage.response
        }

        fun service(service: AlertService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AlertListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AlertListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AlertListPage].
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
        fun build(): AlertListPage =
            AlertListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AlertListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "AlertListPage{service=$service, params=$params, response=$response}"
}
