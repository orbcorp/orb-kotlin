// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.AutoPager
import com.withorb.api.core.Page
import com.withorb.api.core.checkRequired
import com.withorb.api.services.blocking.LicenseTypeService
import java.util.Objects

/** @see LicenseTypeService.list */
class LicenseTypeListPage
private constructor(
    private val service: LicenseTypeService,
    private val params: LicenseTypeListParams,
    private val response: LicenseTypeListPageResponse,
) : Page<LicenseTypeListResponse> {

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

    override fun nextPage(): LicenseTypeListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<LicenseTypeListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): LicenseTypeListParams = params

    /** The response that this page was parsed from. */
    fun response(): LicenseTypeListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [LicenseTypeListPage].
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

    /** A builder for [LicenseTypeListPage]. */
    class Builder internal constructor() {

        private var service: LicenseTypeService? = null
        private var params: LicenseTypeListParams? = null
        private var response: LicenseTypeListPageResponse? = null

        internal fun from(licenseTypeListPage: LicenseTypeListPage) = apply {
            service = licenseTypeListPage.service
            params = licenseTypeListPage.params
            response = licenseTypeListPage.response
        }

        fun service(service: LicenseTypeService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: LicenseTypeListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: LicenseTypeListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [LicenseTypeListPage].
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
        fun build(): LicenseTypeListPage =
            LicenseTypeListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LicenseTypeListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "LicenseTypeListPage{service=$service, params=$params, response=$response}"
}
