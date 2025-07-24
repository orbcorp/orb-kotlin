// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.Params
import com.withorb.api.core.checkRequired
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects

/**
 * This endpoint returns the event volume for an account in a
 * [paginated list format](/api-reference/pagination).
 *
 * The event volume is aggregated by the hour and the
 * [timestamp](/api-reference/event/ingest-events) field is used to determine which hour an event is
 * associated with. Note, this means that late-arriving events increment the volume count for the
 * hour window the timestamp is in, not the latest hour window.
 *
 * Each item in the response contains the count of events aggregated by the hour where the start and
 * end time are hour-aligned and in UTC. When a specific timestamp is passed in for either start or
 * end time, the response includes the hours the timestamp falls in.
 */
class EventVolumeListParams
private constructor(
    private val timeframeStart: OffsetDateTime,
    private val cursor: String?,
    private val limit: Long?,
    private val timeframeEnd: OffsetDateTime?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The start of the timeframe, inclusive, in which to return event volume. All datetime values
     * are converted to UTC time. If the specified time isn't hour-aligned, the response includes
     * the event volume count for the hour the time falls in.
     */
    fun timeframeStart(): OffsetDateTime = timeframeStart

    /**
     * Cursor for pagination. This can be populated by the `next_cursor` value returned from the
     * initial request.
     */
    fun cursor(): String? = cursor

    /** The number of items to fetch. Defaults to 20. */
    fun limit(): Long? = limit

    /**
     * The end of the timeframe, exclusive, in which to return event volume. If not specified, the
     * current time is used. All datetime values are converted to UTC time.If the specified time
     * isn't hour-aligned, the response includes the event volumecount for the hour the time falls
     * in.
     */
    fun timeframeEnd(): OffsetDateTime? = timeframeEnd

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EventVolumeListParams].
         *
         * The following fields are required:
         * ```kotlin
         * .timeframeStart()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [EventVolumeListParams]. */
    class Builder internal constructor() {

        private var timeframeStart: OffsetDateTime? = null
        private var cursor: String? = null
        private var limit: Long? = null
        private var timeframeEnd: OffsetDateTime? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(eventVolumeListParams: EventVolumeListParams) = apply {
            timeframeStart = eventVolumeListParams.timeframeStart
            cursor = eventVolumeListParams.cursor
            limit = eventVolumeListParams.limit
            timeframeEnd = eventVolumeListParams.timeframeEnd
            additionalHeaders = eventVolumeListParams.additionalHeaders.toBuilder()
            additionalQueryParams = eventVolumeListParams.additionalQueryParams.toBuilder()
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
        fun cursor(cursor: String?) = apply { this.cursor = cursor }

        /** The number of items to fetch. Defaults to 20. */
        fun limit(limit: Long?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Long) = limit(limit as Long?)

        /**
         * The end of the timeframe, exclusive, in which to return event volume. If not specified,
         * the current time is used. All datetime values are converted to UTC time.If the specified
         * time isn't hour-aligned, the response includes the event volumecount for the hour the
         * time falls in.
         */
        fun timeframeEnd(timeframeEnd: OffsetDateTime?) = apply { this.timeframeEnd = timeframeEnd }

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
         * Returns an immutable instance of [EventVolumeListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .timeframeStart()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EventVolumeListParams =
            EventVolumeListParams(
                checkRequired("timeframeStart", timeframeStart),
                cursor,
                limit,
                timeframeEnd,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put(
                    "timeframe_start",
                    DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(timeframeStart),
                )
                cursor?.let { put("cursor", it) }
                limit?.let { put("limit", it.toString()) }
                timeframeEnd?.let {
                    put("timeframe_end", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EventVolumeListParams && timeframeStart == other.timeframeStart && cursor == other.cursor && limit == other.limit && timeframeEnd == other.timeframeEnd && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(timeframeStart, cursor, limit, timeframeEnd, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "EventVolumeListParams{timeframeStart=$timeframeStart, cursor=$cursor, limit=$limit, timeframeEnd=$timeframeEnd, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
