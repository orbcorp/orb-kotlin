// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.toImmutable
import com.withorb.api.models.*
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
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
) {

    fun subscriptionId(): String = subscriptionId

    fun cursor(): String? = cursor

    fun limit(): Long? = limit

    fun startDateGt(): OffsetDateTime? = startDateGt

    fun startDateGte(): OffsetDateTime? = startDateGte

    fun startDateLt(): OffsetDateTime? = startDateLt

    fun startDateLte(): OffsetDateTime? = startDateLte

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.cursor?.let { params.put("cursor", listOf(it.toString())) }
        this.limit?.let { params.put("limit", listOf(it.toString())) }
        this.startDateGt?.let {
            params.put("start_date[gt]", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
        }
        this.startDateGte?.let {
            params.put("start_date[gte]", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
        }
        this.startDateLt?.let {
            params.put("start_date[lt]", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
        }
        this.startDateLte?.let {
            params.put("start_date[lte]", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
        }
        params.putAll(additionalQueryParams)
        return params.toImmutable()
    }

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> subscriptionId
            else -> ""
        }
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SubscriptionFetchScheduleParams && this.subscriptionId == other.subscriptionId && this.cursor == other.cursor && this.limit == other.limit && this.startDateGt == other.startDateGt && this.startDateGte == other.startDateGte && this.startDateLt == other.startDateLt && this.startDateLte == other.startDateLte && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(subscriptionId, cursor, limit, startDateGt, startDateGte, startDateLt, startDateLte, additionalHeaders, additionalQueryParams) /* spotless:on */
    }

    override fun toString() =
        "SubscriptionFetchScheduleParams{subscriptionId=$subscriptionId, cursor=$cursor, limit=$limit, startDateGt=$startDateGt, startDateGte=$startDateGte, startDateLt=$startDateLt, startDateLte=$startDateLte, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"

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
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()

        internal fun from(subscriptionFetchScheduleParams: SubscriptionFetchScheduleParams) =
            apply {
                this.subscriptionId = subscriptionFetchScheduleParams.subscriptionId
                this.cursor = subscriptionFetchScheduleParams.cursor
                this.limit = subscriptionFetchScheduleParams.limit
                this.startDateGt = subscriptionFetchScheduleParams.startDateGt
                this.startDateGte = subscriptionFetchScheduleParams.startDateGte
                this.startDateLt = subscriptionFetchScheduleParams.startDateLt
                this.startDateLte = subscriptionFetchScheduleParams.startDateLte
                additionalHeaders(subscriptionFetchScheduleParams.additionalHeaders)
                additionalQueryParams(subscriptionFetchScheduleParams.additionalQueryParams)
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

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.putAll(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::putAdditionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replaceValues(name, listOf(value))
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replaceValues(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::replaceAdditionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.removeAll(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            names.forEach(::removeAdditionalHeaders)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.putAll(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::putAdditionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replaceValues(key, listOf(value))
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replaceValues(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::replaceAdditionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply {
            additionalQueryParams.removeAll(key)
        }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalQueryParams)
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
                additionalHeaders
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalQueryParams
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
            )
    }
}
