// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.toUnmodifiable
import com.withorb.api.models.*
import java.time.OffsetDateTime
import java.util.Objects

class EventSearchParams
constructor(
    private val eventIds: List<String>,
    private val timeframeEnd: OffsetDateTime?,
    private val timeframeStart: OffsetDateTime?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun eventIds(): List<String> = eventIds

    fun timeframeEnd(): OffsetDateTime? = timeframeEnd

    fun timeframeStart(): OffsetDateTime? = timeframeStart

    internal fun getBody(): EventSearchBody {
        return EventSearchBody(
            eventIds,
            timeframeEnd,
            timeframeStart,
            additionalBodyProperties,
        )
    }

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = EventSearchBody.Builder::class)
    @NoAutoDetect
    class EventSearchBody
    internal constructor(
        private val eventIds: List<String>?,
        private val timeframeEnd: OffsetDateTime?,
        private val timeframeStart: OffsetDateTime?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /**
         * This is an explicit array of IDs to filter by. Note that an event's ID is the
         * idempotency_key that was originally used for ingestion, and this only supports events
         * that have not been amended. Values in this array will be treated case sensitively.
         */
        @JsonProperty("event_ids") fun eventIds(): List<String>? = eventIds

        /**
         * The end of the timeframe, exclusive, in which to search events. If not specified, the
         * current time is used.
         */
        @JsonProperty("timeframe_end") fun timeframeEnd(): OffsetDateTime? = timeframeEnd

        /**
         * The start of the timeframe, inclusive, in which to search events. If not specified, the
         * one week ago is used.
         */
        @JsonProperty("timeframe_start") fun timeframeStart(): OffsetDateTime? = timeframeStart

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is EventSearchBody &&
                this.eventIds == other.eventIds &&
                this.timeframeEnd == other.timeframeEnd &&
                this.timeframeStart == other.timeframeStart &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        eventIds,
                        timeframeEnd,
                        timeframeStart,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "EventSearchBody{eventIds=$eventIds, timeframeEnd=$timeframeEnd, timeframeStart=$timeframeStart, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var eventIds: List<String>? = null
            private var timeframeEnd: OffsetDateTime? = null
            private var timeframeStart: OffsetDateTime? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(eventSearchBody: EventSearchBody) = apply {
                this.eventIds = eventSearchBody.eventIds
                this.timeframeEnd = eventSearchBody.timeframeEnd
                this.timeframeStart = eventSearchBody.timeframeStart
                additionalProperties(eventSearchBody.additionalProperties)
            }

            /**
             * This is an explicit array of IDs to filter by. Note that an event's ID is the
             * idempotency_key that was originally used for ingestion, and this only supports events
             * that have not been amended. Values in this array will be treated case sensitively.
             */
            @JsonProperty("event_ids")
            fun eventIds(eventIds: List<String>) = apply { this.eventIds = eventIds }

            /**
             * The end of the timeframe, exclusive, in which to search events. If not specified, the
             * current time is used.
             */
            @JsonProperty("timeframe_end")
            fun timeframeEnd(timeframeEnd: OffsetDateTime) = apply {
                this.timeframeEnd = timeframeEnd
            }

            /**
             * The start of the timeframe, inclusive, in which to search events. If not specified,
             * the one week ago is used.
             */
            @JsonProperty("timeframe_start")
            fun timeframeStart(timeframeStart: OffsetDateTime) = apply {
                this.timeframeStart = timeframeStart
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): EventSearchBody =
                EventSearchBody(
                    checkNotNull(eventIds) { "`eventIds` is required but was not set" }
                        .toUnmodifiable(),
                    timeframeEnd,
                    timeframeStart,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EventSearchParams &&
            this.eventIds == other.eventIds &&
            this.timeframeEnd == other.timeframeEnd &&
            this.timeframeStart == other.timeframeStart &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            eventIds,
            timeframeEnd,
            timeframeStart,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "EventSearchParams{eventIds=$eventIds, timeframeEnd=$timeframeEnd, timeframeStart=$timeframeStart, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var eventIds: MutableList<String> = mutableListOf()
        private var timeframeEnd: OffsetDateTime? = null
        private var timeframeStart: OffsetDateTime? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(eventSearchParams: EventSearchParams) = apply {
            this.eventIds(eventSearchParams.eventIds)
            this.timeframeEnd = eventSearchParams.timeframeEnd
            this.timeframeStart = eventSearchParams.timeframeStart
            additionalQueryParams(eventSearchParams.additionalQueryParams)
            additionalHeaders(eventSearchParams.additionalHeaders)
            additionalBodyProperties(eventSearchParams.additionalBodyProperties)
        }

        /**
         * This is an explicit array of IDs to filter by. Note that an event's ID is the
         * idempotency_key that was originally used for ingestion, and this only supports events
         * that have not been amended. Values in this array will be treated case sensitively.
         */
        fun eventIds(eventIds: List<String>) = apply {
            this.eventIds.clear()
            this.eventIds.addAll(eventIds)
        }

        /**
         * This is an explicit array of IDs to filter by. Note that an event's ID is the
         * idempotency_key that was originally used for ingestion, and this only supports events
         * that have not been amended. Values in this array will be treated case sensitively.
         */
        fun addEventId(eventId: String) = apply { this.eventIds.add(eventId) }

        /**
         * The end of the timeframe, exclusive, in which to search events. If not specified, the
         * current time is used.
         */
        fun timeframeEnd(timeframeEnd: OffsetDateTime) = apply { this.timeframeEnd = timeframeEnd }

        /**
         * The start of the timeframe, inclusive, in which to search events. If not specified, the
         * one week ago is used.
         */
        fun timeframeStart(timeframeStart: OffsetDateTime) = apply {
            this.timeframeStart = timeframeStart
        }

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

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): EventSearchParams =
            EventSearchParams(
                checkNotNull(eventIds) { "`eventIds` is required but was not set" }
                    .toUnmodifiable(),
                timeframeEnd,
                timeframeStart,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}
