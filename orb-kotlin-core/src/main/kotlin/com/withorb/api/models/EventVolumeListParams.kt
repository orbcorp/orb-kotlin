// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.toUnmodifiable
import com.withorb.api.models.*
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects

class EventVolumeListParams
constructor(
    private val timeframeStart: OffsetDateTime,
    private val cursor: String?,
    private val limit: Long?,
    private val timeframeEnd: OffsetDateTime?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun timeframeStart(): OffsetDateTime = timeframeStart

    fun cursor(): String? = cursor

    fun limit(): Long? = limit

    fun timeframeEnd(): OffsetDateTime? = timeframeEnd

    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.timeframeStart.let {
            params.put("timeframe_start", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
        }
        this.cursor?.let { params.put("cursor", listOf(it.toString())) }
        this.limit?.let { params.put("limit", listOf(it.toString())) }
        this.timeframeEnd?.let {
            params.put("timeframe_end", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
        }
        params.putAll(additionalQueryParams)
        return params.toUnmodifiable()
    }

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EventVolumeListParams && this.timeframeStart == other.timeframeStart && this.cursor == other.cursor && this.limit == other.limit && this.timeframeEnd == other.timeframeEnd && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(timeframeStart, cursor, limit, timeframeEnd, additionalQueryParams, additionalHeaders) /* spotless:on */
    }

    override fun toString() =
        "EventVolumeListParams{timeframeStart=$timeframeStart, cursor=$cursor, limit=$limit, timeframeEnd=$timeframeEnd, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var timeframeStart: OffsetDateTime? = null
        private var cursor: String? = null
        private var limit: Long? = null
        private var timeframeEnd: OffsetDateTime? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        internal fun from(eventVolumeListParams: EventVolumeListParams) = apply {
            this.timeframeStart = eventVolumeListParams.timeframeStart
            this.cursor = eventVolumeListParams.cursor
            this.limit = eventVolumeListParams.limit
            this.timeframeEnd = eventVolumeListParams.timeframeEnd
            additionalQueryParams(eventVolumeListParams.additionalQueryParams)
            additionalHeaders(eventVolumeListParams.additionalHeaders)
        }

        /**
         * The start of the timeframe, inclusive, in which to return event volume. All datetime
         * values are converted to UTC time. If the specified time isn't hour-aligned, the response
         * includes the event volume count for the hour the time falls in.
         */
        fun timeframeStart(timeframeStart: OffsetDateTime) = apply {
            this.timeframeStart = timeframeStart
        }

        /**
         * Cursor for pagination. This can be populated by the `next_cursor` value returned from the
         * initial request.
         */
        fun cursor(cursor: String) = apply { this.cursor = cursor }

        /** The number of items to fetch. Defaults to 20. */
        fun limit(limit: Long) = apply { this.limit = limit }

        /**
         * The end of the timeframe, exclusive, in which to return event volume. If not specified,
         * the current time is used. All datetime values are converted to UTC time.If the specified
         * time isn't hour-aligned, the response includes the event volumecount for the hour the
         * time falls in.
         */
        fun timeframeEnd(timeframeEnd: OffsetDateTime) = apply { this.timeframeEnd = timeframeEnd }

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

        fun build(): EventVolumeListParams =
            EventVolumeListParams(
                checkNotNull(timeframeStart) { "`timeframeStart` is required but was not set" },
                cursor,
                limit,
                timeframeEnd,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            )
    }
}
