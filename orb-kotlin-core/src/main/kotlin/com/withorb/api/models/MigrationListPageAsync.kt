// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.AutoPagerAsync
import com.withorb.api.core.PageAsync
import com.withorb.api.core.checkRequired
import com.withorb.api.services.async.MigrationServiceAsync
import java.util.Objects

/** @see MigrationServiceAsync.list */
class MigrationListPageAsync
private constructor(
    private val service: MigrationServiceAsync,
    private val params: MigrationListParams,
    private val response: MigrationListPageResponse,
) : PageAsync<MigrationListResponse> {

    /**
     * Delegates to [MigrationListPageResponse], but gracefully handles missing data.
     *
     * @see MigrationListPageResponse.data
     */
    fun data(): List<MigrationListResponse> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [MigrationListPageResponse], but gracefully handles missing data.
     *
     * @see MigrationListPageResponse.paginationMetadata
     */
    fun paginationMetadata(): PaginationMetadata? =
        response._paginationMetadata().getNullable("pagination_metadata")

    override fun items(): List<MigrationListResponse> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paginationMetadata()?.let { it._nextCursor().getNullable("next_cursor") } != null

    fun nextPageParams(): MigrationListParams {
        val nextCursor =
            paginationMetadata()?.let { it._nextCursor().getNullable("next_cursor") }
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override suspend fun nextPage(): MigrationListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<MigrationListResponse> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): MigrationListParams = params

    /** The response that this page was parsed from. */
    fun response(): MigrationListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [MigrationListPageAsync].
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

    /** A builder for [MigrationListPageAsync]. */
    class Builder internal constructor() {

        private var service: MigrationServiceAsync? = null
        private var params: MigrationListParams? = null
        private var response: MigrationListPageResponse? = null

        internal fun from(migrationListPageAsync: MigrationListPageAsync) = apply {
            service = migrationListPageAsync.service
            params = migrationListPageAsync.params
            response = migrationListPageAsync.response
        }

        fun service(service: MigrationServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: MigrationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: MigrationListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [MigrationListPageAsync].
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
        fun build(): MigrationListPageAsync =
            MigrationListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MigrationListPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "MigrationListPageAsync{service=$service, params=$params, response=$response}"
}
