// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.AutoPager
import com.withorb.api.core.Page
import com.withorb.api.core.checkRequired
import com.withorb.api.services.blocking.LicenseService
import java.util.Objects

/** @see LicenseService.list */
class LicenseListPage
private constructor(
    private val service: LicenseService,
    private val params: LicenseListParams,
    private val response: LicenseListPageResponse,
) : Page<LicenseListResponse> {

    /**
     * Delegates to [LicenseListPageResponse], but gracefully handles missing data.
     *
     * @see LicenseListPageResponse.data
     */
    fun data(): List<LicenseListResponse> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [LicenseListPageResponse], but gracefully handles missing data.
     *
     * @see LicenseListPageResponse.paginationMetadata
     */
    fun paginationMetadata(): PaginationMetadata? =
        response._paginationMetadata().getNullable("pagination_metadata")

    override fun items(): List<LicenseListResponse> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paginationMetadata()?.let { it._nextCursor().getNullable("next_cursor") } != null

    fun nextPageParams(): LicenseListParams {
        val nextCursor =
            paginationMetadata()?.let { it._nextCursor().getNullable("next_cursor") }
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): LicenseListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<LicenseListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): LicenseListParams = params

    /** The response that this page was parsed from. */
    fun response(): LicenseListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [LicenseListPage].
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

    /** A builder for [LicenseListPage]. */
    class Builder internal constructor() {

        private var service: LicenseService? = null
        private var params: LicenseListParams? = null
        private var response: LicenseListPageResponse? = null

        internal fun from(licenseListPage: LicenseListPage) = apply {
            service = licenseListPage.service
            params = licenseListPage.params
            response = licenseListPage.response
        }

        fun service(service: LicenseService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: LicenseListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: LicenseListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [LicenseListPage].
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
        fun build(): LicenseListPage =
            LicenseListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LicenseListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "LicenseListPage{service=$service, params=$params, response=$response}"
}
