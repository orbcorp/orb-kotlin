// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.Params
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import com.withorb.api.core.toImmutable
import java.time.LocalDate
import java.util.Objects

/**
 * Returns usage and remaining credits for a specific license over a date range.
 *
 * Date range defaults to the current billing period if not specified.
 */
class LicenseUsageGetUsageParams
private constructor(
    private val licenseId: String?,
    private val cursor: String?,
    private val endDate: LocalDate?,
    private val groupBy: List<String>?,
    private val limit: Long?,
    private val startDate: LocalDate?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun licenseId(): String? = licenseId

    /** Pagination cursor from a previous request. */
    fun cursor(): String? = cursor

    /** End date for the usage period (YYYY-MM-DD). Defaults to end of current billing period. */
    fun endDate(): LocalDate? = endDate

    /**
     * How to group the results. Valid values: 'license', 'day'. Can be combined (e.g.,
     * 'license,day').
     */
    fun groupBy(): List<String>? = groupBy

    /** Maximum number of rows in the response data (default 20, max 100). */
    fun limit(): Long? = limit

    /**
     * Start date for the usage period (YYYY-MM-DD). Defaults to start of current billing period.
     */
    fun startDate(): LocalDate? = startDate

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): LicenseUsageGetUsageParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [LicenseUsageGetUsageParams].
         */
        fun builder() = Builder()
    }

    /** A builder for [LicenseUsageGetUsageParams]. */
    class Builder internal constructor() {

        private var licenseId: String? = null
        private var cursor: String? = null
        private var endDate: LocalDate? = null
        private var groupBy: MutableList<String>? = null
        private var limit: Long? = null
        private var startDate: LocalDate? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(licenseUsageGetUsageParams: LicenseUsageGetUsageParams) = apply {
            licenseId = licenseUsageGetUsageParams.licenseId
            cursor = licenseUsageGetUsageParams.cursor
            endDate = licenseUsageGetUsageParams.endDate
            groupBy = licenseUsageGetUsageParams.groupBy?.toMutableList()
            limit = licenseUsageGetUsageParams.limit
            startDate = licenseUsageGetUsageParams.startDate
            additionalHeaders = licenseUsageGetUsageParams.additionalHeaders.toBuilder()
            additionalQueryParams = licenseUsageGetUsageParams.additionalQueryParams.toBuilder()
        }

        fun licenseId(licenseId: String?) = apply { this.licenseId = licenseId }

        /** Pagination cursor from a previous request. */
        fun cursor(cursor: String?) = apply { this.cursor = cursor }

        /**
         * End date for the usage period (YYYY-MM-DD). Defaults to end of current billing period.
         */
        fun endDate(endDate: LocalDate?) = apply { this.endDate = endDate }

        /**
         * How to group the results. Valid values: 'license', 'day'. Can be combined (e.g.,
         * 'license,day').
         */
        fun groupBy(groupBy: List<String>?) = apply { this.groupBy = groupBy?.toMutableList() }

        /**
         * Adds a single [String] to [Builder.groupBy].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addGroupBy(groupBy: String) = apply {
            this.groupBy = (this.groupBy ?: mutableListOf()).apply { add(groupBy) }
        }

        /** Maximum number of rows in the response data (default 20, max 100). */
        fun limit(limit: Long?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Long) = limit(limit as Long?)

        /**
         * Start date for the usage period (YYYY-MM-DD). Defaults to start of current billing
         * period.
         */
        fun startDate(startDate: LocalDate?) = apply { this.startDate = startDate }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [LicenseUsageGetUsageParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): LicenseUsageGetUsageParams =
            LicenseUsageGetUsageParams(
                licenseId,
                cursor,
                endDate,
                groupBy?.toImmutable(),
                limit,
                startDate,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> licenseId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                cursor?.let { put("cursor", it) }
                endDate?.let { put("end_date", it.toString()) }
                groupBy?.forEach { put("group_by[]", it) }
                limit?.let { put("limit", it.toString()) }
                startDate?.let { put("start_date", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LicenseUsageGetUsageParams &&
            licenseId == other.licenseId &&
            cursor == other.cursor &&
            endDate == other.endDate &&
            groupBy == other.groupBy &&
            limit == other.limit &&
            startDate == other.startDate &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            licenseId,
            cursor,
            endDate,
            groupBy,
            limit,
            startDate,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "LicenseUsageGetUsageParams{licenseId=$licenseId, cursor=$cursor, endDate=$endDate, groupBy=$groupBy, limit=$limit, startDate=$startDate, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
