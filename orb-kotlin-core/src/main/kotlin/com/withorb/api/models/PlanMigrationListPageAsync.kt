// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.AutoPagerAsync
import com.withorb.api.core.PageAsync
import com.withorb.api.core.checkRequired
import com.withorb.api.services.async.plans.MigrationServiceAsync
import java.util.Objects

/** @see MigrationServiceAsync.list */
class PlanMigrationListPageAsync
private constructor(
    private val service: MigrationServiceAsync,
    private val params: PlanMigrationListParams,
    private val response: PlanMigrationListPageResponse,
) : PageAsync<PlanMigrationListResponse> {

    /**
     * Delegates to [PlanMigrationListPageResponse], but gracefully handles missing data.
     *
     * @see PlanMigrationListPageResponse.data
     */
    fun data(): List<PlanMigrationListResponse> =
        response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [PlanMigrationListPageResponse], but gracefully handles missing data.
     *
     * @see PlanMigrationListPageResponse.paginationMetadata
     */
    fun paginationMetadata(): PaginationMetadata? =
        response._paginationMetadata().getNullable("pagination_metadata")

    override fun items(): List<PlanMigrationListResponse> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paginationMetadata()?.let { it._nextCursor().getNullable("next_cursor") } != null

    fun nextPageParams(): PlanMigrationListParams {
        val nextCursor =
            paginationMetadata()?.let { it._nextCursor().getNullable("next_cursor") }
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override suspend fun nextPage(): PlanMigrationListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<PlanMigrationListResponse> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): PlanMigrationListParams = params

    /** The response that this page was parsed from. */
    fun response(): PlanMigrationListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PlanMigrationListPageAsync].
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

    /** A builder for [PlanMigrationListPageAsync]. */
    class Builder internal constructor() {

        private var service: MigrationServiceAsync? = null
        private var params: PlanMigrationListParams? = null
        private var response: PlanMigrationListPageResponse? = null

        internal fun from(planMigrationListPageAsync: PlanMigrationListPageAsync) = apply {
            service = planMigrationListPageAsync.service
            params = planMigrationListPageAsync.params
            response = planMigrationListPageAsync.response
        }

        fun service(service: MigrationServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PlanMigrationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PlanMigrationListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [PlanMigrationListPageAsync].
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
        fun build(): PlanMigrationListPageAsync =
            PlanMigrationListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PlanMigrationListPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "PlanMigrationListPageAsync{service=$service, params=$params, response=$response}"
}
