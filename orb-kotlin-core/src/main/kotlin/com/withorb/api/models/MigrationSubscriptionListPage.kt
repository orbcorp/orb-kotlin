// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.AutoPager
import com.withorb.api.core.Page
import com.withorb.api.core.checkRequired
import com.withorb.api.services.blocking.migrations.SubscriptionService
import java.util.Objects

/** @see SubscriptionService.list */
class MigrationSubscriptionListPage
private constructor(
    private val service: SubscriptionService,
    private val params: MigrationSubscriptionListParams,
    private val response: MigrationSubscriptionListPageResponse,
) : Page<MigrationSubscription> {

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

    override fun nextPage(): MigrationSubscriptionListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<MigrationSubscription> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): MigrationSubscriptionListParams = params

    /** The response that this page was parsed from. */
    fun response(): MigrationSubscriptionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [MigrationSubscriptionListPage].
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

    /** A builder for [MigrationSubscriptionListPage]. */
    class Builder internal constructor() {

        private var service: SubscriptionService? = null
        private var params: MigrationSubscriptionListParams? = null
        private var response: MigrationSubscriptionListPageResponse? = null

        internal fun from(migrationSubscriptionListPage: MigrationSubscriptionListPage) = apply {
            service = migrationSubscriptionListPage.service
            params = migrationSubscriptionListPage.params
            response = migrationSubscriptionListPage.response
        }

        fun service(service: SubscriptionService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: MigrationSubscriptionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: MigrationSubscriptionListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [MigrationSubscriptionListPage].
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
        fun build(): MigrationSubscriptionListPage =
            MigrationSubscriptionListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MigrationSubscriptionListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "MigrationSubscriptionListPage{service=$service, params=$params, response=$response}"
}
