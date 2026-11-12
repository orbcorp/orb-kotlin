// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.AutoPagerAsync
import com.withorb.api.core.PageAsync
import com.withorb.api.core.checkRequired
import com.withorb.api.services.async.migrations.SubscriptionServiceAsync
import java.util.Objects

/** @see SubscriptionServiceAsync.list */
class MigrationSubscriptionListPageAsync
private constructor(
    private val service: SubscriptionServiceAsync,
    private val params: MigrationSubscriptionListParams,
    private val response: MigrationSubscriptionListPageResponse,
) : PageAsync<MigrationSubscription> {

    /**
     * Delegates to [MigrationSubscriptionListPageResponse], but gracefully handles missing data.
     *
     * @see MigrationSubscriptionListPageResponse.data
     */
    fun data(): List<MigrationSubscription> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [MigrationSubscriptionListPageResponse], but gracefully handles missing data.
     *
     * @see MigrationSubscriptionListPageResponse.paginationMetadata
     */
    fun paginationMetadata(): PaginationMetadata? =
        response._paginationMetadata().getNullable("pagination_metadata")

    override fun items(): List<MigrationSubscription> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paginationMetadata()?.let { it._nextCursor().getNullable("next_cursor") } != null

    fun nextPageParams(): MigrationSubscriptionListParams {
        val nextCursor =
            paginationMetadata()?.let { it._nextCursor().getNullable("next_cursor") }
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override suspend fun nextPage(): MigrationSubscriptionListPageAsync =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<MigrationSubscription> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): MigrationSubscriptionListParams = params

    /** The response that this page was parsed from. */
    fun response(): MigrationSubscriptionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [MigrationSubscriptionListPageAsync].
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

    /** A builder for [MigrationSubscriptionListPageAsync]. */
    class Builder internal constructor() {

        private var service: SubscriptionServiceAsync? = null
        private var params: MigrationSubscriptionListParams? = null
        private var response: MigrationSubscriptionListPageResponse? = null

        internal fun from(migrationSubscriptionListPageAsync: MigrationSubscriptionListPageAsync) =
            apply {
                service = migrationSubscriptionListPageAsync.service
                params = migrationSubscriptionListPageAsync.params
                response = migrationSubscriptionListPageAsync.response
            }

        fun service(service: SubscriptionServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: MigrationSubscriptionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: MigrationSubscriptionListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [MigrationSubscriptionListPageAsync].
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
        fun build(): MigrationSubscriptionListPageAsync =
            MigrationSubscriptionListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MigrationSubscriptionListPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "MigrationSubscriptionListPageAsync{service=$service, params=$params, response=$response}"
}
