// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects

class SubscriptionFetchScheduleParams
constructor(
    private val subscriptionId: String,
    private val cursor: String?,
    private val limit: Long?,
    private val startDateGt: OffsetDateTime?,
    private val startDateGte: OffsetDateTime?,
    private val startDateLt: OffsetDateTime?,
    private val startDateLte: OffsetDateTime?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun subscriptionId(): String = subscriptionId

    fun cursor(): String? = cursor

    fun limit(): Long? = limit

    fun startDateGt(): OffsetDateTime? = startDateGt

    fun startDateGte(): OffsetDateTime? = startDateGte

    fun startDateLt(): OffsetDateTime? = startDateLt

    fun startDateLte(): OffsetDateTime? = startDateLte

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.cursor?.let { queryParams.put("cursor", listOf(it.toString())) }
        this.limit?.let { queryParams.put("limit", listOf(it.toString())) }
        this.startDateGt?.let {
            queryParams.put(
                "start_date[gt]",
                listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
            )
        }
        this.startDateGte?.let {
            queryParams.put(
                "start_date[gte]",
                listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
            )
        }
        this.startDateLt?.let {
            queryParams.put(
                "start_date[lt]",
                listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
            )
        }
        this.startDateLte?.let {
            queryParams.put(
                "start_date[lte]",
                listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
            )
        }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> subscriptionId
            else -> ""
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var subscriptionId: String? = null
        private var cursor: String? = null
        private var limit: Long? = null
        private var startDateGt: OffsetDateTime? = null
        private var startDateGte: OffsetDateTime? = null
        private var startDateLt: OffsetDateTime? = null
        private var startDateLte: OffsetDateTime? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(subscriptionFetchScheduleParams: SubscriptionFetchScheduleParams) =
            apply {
                subscriptionId = subscriptionFetchScheduleParams.subscriptionId
                cursor = subscriptionFetchScheduleParams.cursor
                limit = subscriptionFetchScheduleParams.limit
                startDateGt = subscriptionFetchScheduleParams.startDateGt
                startDateGte = subscriptionFetchScheduleParams.startDateGte
                startDateLt = subscriptionFetchScheduleParams.startDateLt
                startDateLte = subscriptionFetchScheduleParams.startDateLte
                additionalHeaders = subscriptionFetchScheduleParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    subscriptionFetchScheduleParams.additionalQueryParams.toBuilder()
            }

        fun subscriptionId(subscriptionId: String) = apply { this.subscriptionId = subscriptionId }

        /**
         * Cursor for pagination. This can be populated by the `next_cursor` value returned from the
         * initial request.
         */
        fun cursor(cursor: String) = apply { this.cursor = cursor }

        /** The number of items to fetch. Defaults to 20. */
        fun limit(limit: Long) = apply { this.limit = limit }

        fun startDateGt(startDateGt: OffsetDateTime) = apply { this.startDateGt = startDateGt }

        fun startDateGte(startDateGte: OffsetDateTime) = apply { this.startDateGte = startDateGte }

        fun startDateLt(startDateLt: OffsetDateTime) = apply { this.startDateLt = startDateLt }

        fun startDateLte(startDateLte: OffsetDateTime) = apply { this.startDateLte = startDateLte }

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

        fun build(): SubscriptionFetchScheduleParams =
            SubscriptionFetchScheduleParams(
                checkNotNull(subscriptionId) { "`subscriptionId` is required but was not set" },
                cursor,
                limit,
                startDateGt,
                startDateGte,
                startDateLt,
                startDateLte,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SubscriptionFetchScheduleParams && subscriptionId == other.subscriptionId && cursor == other.cursor && limit == other.limit && startDateGt == other.startDateGt && startDateGte == other.startDateGte && startDateLt == other.startDateLt && startDateLte == other.startDateLte && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(subscriptionId, cursor, limit, startDateGt, startDateGte, startDateLt, startDateLte, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "SubscriptionFetchScheduleParams{subscriptionId=$subscriptionId, cursor=$cursor, limit=$limit, startDateGt=$startDateGt, startDateGte=$startDateGte, startDateLt=$startDateLt, startDateLte=$startDateLte, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
