// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.Params
import com.withorb.api.core.checkRequired
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import java.time.LocalDate
import java.util.Objects

/**
 * Returns usage and remaining credits for a license identified by its external license ID.
 *
 * Date range defaults to the current billing period if not specified.
 */
class LicenseExternalLicenseGetUsageParams
private constructor(
    private val externalLicenseId: String?,
    private val licenseTypeId: String,
    private val subscriptionId: String,
    private val cursor: String?,
    private val endDate: LocalDate?,
    private val groupBy: String?,
    private val limit: Long?,
    private val startDate: LocalDate?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun externalLicenseId(): String? = externalLicenseId

    /** The license type ID to filter licenses by. */
    fun licenseTypeId(): String = licenseTypeId

    /** The subscription ID to get license usage for. */
    fun subscriptionId(): String = subscriptionId

    /** Pagination cursor from a previous request. */
    fun cursor(): String? = cursor

    /** End date for the usage period (YYYY-MM-DD). Defaults to end of current billing period. */
    fun endDate(): LocalDate? = endDate

    /**
     * How to group the results. Valid values: 'license', 'day'. Can be combined (e.g.,
     * 'license,day').
     */
    fun groupBy(): String? = groupBy

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

        /**
         * Returns a mutable builder for constructing an instance of
         * [LicenseExternalLicenseGetUsageParams].
         *
         * The following fields are required:
         * ```kotlin
         * .licenseTypeId()
         * .subscriptionId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [LicenseExternalLicenseGetUsageParams]. */
    class Builder internal constructor() {

        private var externalLicenseId: String? = null
        private var licenseTypeId: String? = null
        private var subscriptionId: String? = null
        private var cursor: String? = null
        private var endDate: LocalDate? = null
        private var groupBy: String? = null
        private var limit: Long? = null
        private var startDate: LocalDate? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(
            licenseExternalLicenseGetUsageParams: LicenseExternalLicenseGetUsageParams
        ) = apply {
            externalLicenseId = licenseExternalLicenseGetUsageParams.externalLicenseId
            licenseTypeId = licenseExternalLicenseGetUsageParams.licenseTypeId
            subscriptionId = licenseExternalLicenseGetUsageParams.subscriptionId
            cursor = licenseExternalLicenseGetUsageParams.cursor
            endDate = licenseExternalLicenseGetUsageParams.endDate
            groupBy = licenseExternalLicenseGetUsageParams.groupBy
            limit = licenseExternalLicenseGetUsageParams.limit
            startDate = licenseExternalLicenseGetUsageParams.startDate
            additionalHeaders = licenseExternalLicenseGetUsageParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                licenseExternalLicenseGetUsageParams.additionalQueryParams.toBuilder()
        }

        fun externalLicenseId(externalLicenseId: String?) = apply {
            this.externalLicenseId = externalLicenseId
        }

        /** The license type ID to filter licenses by. */
        fun licenseTypeId(licenseTypeId: String) = apply { this.licenseTypeId = licenseTypeId }

        /** The subscription ID to get license usage for. */
        fun subscriptionId(subscriptionId: String) = apply { this.subscriptionId = subscriptionId }

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
        fun groupBy(groupBy: String?) = apply { this.groupBy = groupBy }

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
         * Returns an immutable instance of [LicenseExternalLicenseGetUsageParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .licenseTypeId()
         * .subscriptionId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): LicenseExternalLicenseGetUsageParams =
            LicenseExternalLicenseGetUsageParams(
                externalLicenseId,
                checkRequired("licenseTypeId", licenseTypeId),
                checkRequired("subscriptionId", subscriptionId),
                cursor,
                endDate,
                groupBy,
                limit,
                startDate,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> externalLicenseId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("license_type_id", licenseTypeId)
                put("subscription_id", subscriptionId)
                cursor?.let { put("cursor", it) }
                endDate?.let { put("end_date", it.toString()) }
                groupBy?.let { put("group_by", it) }
                limit?.let { put("limit", it.toString()) }
                startDate?.let { put("start_date", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LicenseExternalLicenseGetUsageParams &&
            externalLicenseId == other.externalLicenseId &&
            licenseTypeId == other.licenseTypeId &&
            subscriptionId == other.subscriptionId &&
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
            externalLicenseId,
            licenseTypeId,
            subscriptionId,
            cursor,
            endDate,
            groupBy,
            limit,
            startDate,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "LicenseExternalLicenseGetUsageParams{externalLicenseId=$externalLicenseId, licenseTypeId=$licenseTypeId, subscriptionId=$subscriptionId, cursor=$cursor, endDate=$endDate, groupBy=$groupBy, limit=$limit, startDate=$startDate, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
