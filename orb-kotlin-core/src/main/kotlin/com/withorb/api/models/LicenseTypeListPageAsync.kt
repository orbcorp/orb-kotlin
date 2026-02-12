// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.AutoPagerAsync
import com.withorb.api.core.PageAsync
import com.withorb.api.core.checkRequired
import com.withorb.api.services.async.LicenseTypeServiceAsync
import java.util.Objects

/** @see LicenseTypeServiceAsync.list */
class LicenseTypeListPageAsync
private constructor(
    private val service: LicenseTypeServiceAsync,
    private val params: LicenseTypeListParams,
    private val response: LicenseTypeListPageResponse,
) : PageAsync<LicenseTypeListResponse> {

    /**
     * Delegates to [LicenseTypeListPageResponse], but gracefully handles missing data.
     *
     * @see LicenseTypeListPageResponse.data
     */
    fun data(): List<LicenseTypeListResponse> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [LicenseTypeListPageResponse], but gracefully handles missing data.
     *
     * @see LicenseTypeListPageResponse.paginationMetadata
     */
    fun paginationMetadata(): PaginationMetadata? =
        response._paginationMetadata().getNullable("pagination_metadata")

    override fun items(): List<LicenseTypeListResponse> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paginationMetadata()?.let { it._nextCursor().getNullable("next_cursor") } != null

    fun nextPageParams(): LicenseTypeListParams {
        val nextCursor =
            paginationMetadata()?.let { it._nextCursor().getNullable("next_cursor") }
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override suspend fun nextPage(): LicenseTypeListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<LicenseTypeListResponse> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): LicenseTypeListParams = params

    /** The response that this page was parsed from. */
    fun response(): LicenseTypeListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [LicenseTypeListPageAsync].
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

    /** A builder for [LicenseTypeListPageAsync]. */
    class Builder internal constructor() {

        private var service: LicenseTypeServiceAsync? = null
        private var params: LicenseTypeListParams? = null
        private var response: LicenseTypeListPageResponse? = null

        internal fun from(licenseTypeListPageAsync: LicenseTypeListPageAsync) = apply {
            service = licenseTypeListPageAsync.service
            params = licenseTypeListPageAsync.params
            response = licenseTypeListPageAsync.response
        }

        fun service(service: LicenseTypeServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: LicenseTypeListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: LicenseTypeListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [LicenseTypeListPageAsync].
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
        fun build(): LicenseTypeListPageAsync =
            LicenseTypeListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LicenseTypeListPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "LicenseTypeListPageAsync{service=$service, params=$params, response=$response}"
}
