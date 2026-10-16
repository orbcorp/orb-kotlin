// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.AutoPagerAsync
import com.withorb.api.core.PageAsync
import com.withorb.api.core.checkRequired
import com.withorb.api.services.async.WebhookEndpointServiceAsync
import java.util.Objects

/** @see WebhookEndpointServiceAsync.list */
class WebhookEndpointListPageAsync
private constructor(
    private val service: WebhookEndpointServiceAsync,
    private val params: WebhookEndpointListParams,
    private val response: WebhookEndpointListPageResponse,
) : PageAsync<WebhookEndpoint> {

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

    override suspend fun nextPage(): WebhookEndpointListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<WebhookEndpoint> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): WebhookEndpointListParams = params

    /** The response that this page was parsed from. */
    fun response(): WebhookEndpointListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [WebhookEndpointListPageAsync].
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

    /** A builder for [WebhookEndpointListPageAsync]. */
    class Builder internal constructor() {

        private var service: WebhookEndpointServiceAsync? = null
        private var params: WebhookEndpointListParams? = null
        private var response: WebhookEndpointListPageResponse? = null

        internal fun from(webhookEndpointListPageAsync: WebhookEndpointListPageAsync) = apply {
            service = webhookEndpointListPageAsync.service
            params = webhookEndpointListPageAsync.params
            response = webhookEndpointListPageAsync.response
        }

        fun service(service: WebhookEndpointServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: WebhookEndpointListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: WebhookEndpointListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [WebhookEndpointListPageAsync].
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
        fun build(): WebhookEndpointListPageAsync =
            WebhookEndpointListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WebhookEndpointListPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "WebhookEndpointListPageAsync{service=$service, params=$params, response=$response}"
}
