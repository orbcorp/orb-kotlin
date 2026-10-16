// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.AutoPager
import com.withorb.api.core.Page
import com.withorb.api.core.checkRequired
import com.withorb.api.services.blocking.WebhookEndpointService
import java.util.Objects

/** @see WebhookEndpointService.list */
class WebhookEndpointListPage
private constructor(
    private val service: WebhookEndpointService,
    private val params: WebhookEndpointListParams,
    private val response: WebhookEndpointListPageResponse,
) : Page<WebhookEndpoint> {

    /**
     * Delegates to [WebhookEndpointListPageResponse], but gracefully handles missing data.
     *
     * @see WebhookEndpointListPageResponse.data
     */
    fun data(): List<WebhookEndpoint> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [WebhookEndpointListPageResponse], but gracefully handles missing data.
     *
     * @see WebhookEndpointListPageResponse.paginationMetadata
     */
    fun paginationMetadata(): PaginationMetadata? =
        response._paginationMetadata().getNullable("pagination_metadata")

    override fun items(): List<WebhookEndpoint> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paginationMetadata()?.let { it._nextCursor().getNullable("next_cursor") } != null

    fun nextPageParams(): WebhookEndpointListParams {
        val nextCursor =
            paginationMetadata()?.let { it._nextCursor().getNullable("next_cursor") }
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): WebhookEndpointListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<WebhookEndpoint> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): WebhookEndpointListParams = params

    /** The response that this page was parsed from. */
    fun response(): WebhookEndpointListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [WebhookEndpointListPage].
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

    /** A builder for [WebhookEndpointListPage]. */
    class Builder internal constructor() {

        private var service: WebhookEndpointService? = null
        private var params: WebhookEndpointListParams? = null
        private var response: WebhookEndpointListPageResponse? = null

        internal fun from(webhookEndpointListPage: WebhookEndpointListPage) = apply {
            service = webhookEndpointListPage.service
            params = webhookEndpointListPage.params
            response = webhookEndpointListPage.response
        }

        fun service(service: WebhookEndpointService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: WebhookEndpointListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: WebhookEndpointListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [WebhookEndpointListPage].
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
        fun build(): WebhookEndpointListPage =
            WebhookEndpointListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WebhookEndpointListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "WebhookEndpointListPage{service=$service, params=$params, response=$response}"
}
