// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.toUnmodifiable
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
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun subscriptionId(): String = subscriptionId

    fun cursor(): String? = cursor

    fun limit(): Long? = limit

    fun startDateGt(): OffsetDateTime? = startDateGt

    fun startDateGte(): OffsetDateTime? = startDateGte

    fun startDateLt(): OffsetDateTime? = startDateLt

    fun startDateLte(): OffsetDateTime? = startDateLte

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
        return params.toUnmodifiable()
    }

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> subscriptionId
            else -> ""
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SubscriptionFetchScheduleParams && this.subscriptionId == other.subscriptionId && this.cursor == other.cursor && this.limit == other.limit && this.startDateGt == other.startDateGt && this.startDateGte == other.startDateGte && this.startDateLt == other.startDateLt && this.startDateLte == other.startDateLte && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(subscriptionId, cursor, limit, startDateGt, startDateGte, startDateLt, startDateLte, additionalQueryParams, additionalHeaders) /* spotless:on */
    }

    override fun toString() =
        "SubscriptionFetchScheduleParams{subscriptionId=$subscriptionId, cursor=$cursor, limit=$limit, startDateGt=$startDateGt, startDateGte=$startDateGte, startDateLt=$startDateLt, startDateLte=$startDateLte, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

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
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        internal fun from(subscriptionFetchScheduleParams: SubscriptionFetchScheduleParams) =
            apply {
                this.subscriptionId = subscriptionFetchScheduleParams.subscriptionId
                this.cursor = subscriptionFetchScheduleParams.cursor
                this.limit = subscriptionFetchScheduleParams.limit
                this.startDateGt = subscriptionFetchScheduleParams.startDateGt
                this.startDateGte = subscriptionFetchScheduleParams.startDateGte
                this.startDateLt = subscriptionFetchScheduleParams.startDateLt
                this.startDateLte = subscriptionFetchScheduleParams.startDateLte
                additionalQueryParams(subscriptionFetchScheduleParams.additionalQueryParams)
                additionalHeaders(subscriptionFetchScheduleParams.additionalHeaders)
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

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun build(): SubscriptionFetchScheduleParams =
            SubscriptionFetchScheduleParams(
                checkNotNull(subscriptionId) { "`subscriptionId` is required but was not set" },
                cursor,
                limit,
                startDateGt,
                startDateGte,
                startDateLt,
                startDateLte,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            )
    }
}
