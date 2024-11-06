// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.toImmutable
import com.withorb.api.models.*
import java.time.OffsetDateTime
import java.util.Objects

class EventBackfillCreateParams
constructor(
    private val timeframeEnd: OffsetDateTime,
    private val timeframeStart: OffsetDateTime,
    private val closeTime: OffsetDateTime?,
    private val customerId: String?,
    private val deprecationFilter: String?,
    private val externalCustomerId: String?,
    private val replaceExistingEvents: Boolean?,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun timeframeEnd(): OffsetDateTime = timeframeEnd

    fun timeframeStart(): OffsetDateTime = timeframeStart

    fun closeTime(): OffsetDateTime? = closeTime

    fun customerId(): String? = customerId

    fun deprecationFilter(): String? = deprecationFilter

    fun externalCustomerId(): String? = externalCustomerId

    fun replaceExistingEvents(): Boolean? = replaceExistingEvents

    internal fun getBody(): EventBackfillCreateBody {
        return EventBackfillCreateBody(
            timeframeEnd,
            timeframeStart,
            closeTime,
            customerId,
            deprecationFilter,
            externalCustomerId,
            replaceExistingEvents,
            additionalBodyProperties,
        )
    }

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JsonDeserialize(builder = EventBackfillCreateBody.Builder::class)
    @NoAutoDetect
    class EventBackfillCreateBody
    internal constructor(
        private val timeframeEnd: OffsetDateTime?,
        private val timeframeStart: OffsetDateTime?,
        private val closeTime: OffsetDateTime?,
        private val customerId: String?,
        private val deprecationFilter: String?,
        private val externalCustomerId: String?,
        private val replaceExistingEvents: Boolean?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The (exclusive) end of the usage timeframe affected by this backfill. */
        @JsonProperty("timeframe_end") fun timeframeEnd(): OffsetDateTime? = timeframeEnd

        /** The (inclusive) start of the usage timeframe affected by this backfill. */
        @JsonProperty("timeframe_start") fun timeframeStart(): OffsetDateTime? = timeframeStart

        /**
         * The time at which no more events will be accepted for this backfill. The backfill will
         * automatically begin reflecting throughout Orb at the close time. If not specified, it
         * will default to 1 day after the creation of the backfill.
         */
        @JsonProperty("close_time") fun closeTime(): OffsetDateTime? = closeTime

        /**
         * The Orb-generated ID of the customer to which this backfill is scoped. Omitting this
         * field will scope the backfill to all customers.
         */
        @JsonProperty("customer_id") fun customerId(): String? = customerId

        /**
         * A boolean
         * [computed property](../guides/extensibility/advanced-metrics#computed-properties) used to
         * filter the set of events to deprecate
         */
        @JsonProperty("deprecation_filter") fun deprecationFilter(): String? = deprecationFilter

        /**
         * The external customer ID of the customer to which this backfill is scoped. Omitting this
         * field will scope the backfill to all customers.
         */
        @JsonProperty("external_customer_id") fun externalCustomerId(): String? = externalCustomerId

        /**
         * If true, replaces all existing events in the timeframe with the newly ingested events. If
         * false, adds the newly ingested events to the existing events.
         */
        @JsonProperty("replace_existing_events")
        fun replaceExistingEvents(): Boolean? = replaceExistingEvents

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var timeframeEnd: OffsetDateTime? = null
            private var timeframeStart: OffsetDateTime? = null
            private var closeTime: OffsetDateTime? = null
            private var customerId: String? = null
            private var deprecationFilter: String? = null
            private var externalCustomerId: String? = null
            private var replaceExistingEvents: Boolean? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(eventBackfillCreateBody: EventBackfillCreateBody) = apply {
                this.timeframeEnd = eventBackfillCreateBody.timeframeEnd
                this.timeframeStart = eventBackfillCreateBody.timeframeStart
                this.closeTime = eventBackfillCreateBody.closeTime
                this.customerId = eventBackfillCreateBody.customerId
                this.deprecationFilter = eventBackfillCreateBody.deprecationFilter
                this.externalCustomerId = eventBackfillCreateBody.externalCustomerId
                this.replaceExistingEvents = eventBackfillCreateBody.replaceExistingEvents
                additionalProperties(eventBackfillCreateBody.additionalProperties)
            }

            /** The (exclusive) end of the usage timeframe affected by this backfill. */
            @JsonProperty("timeframe_end")
            fun timeframeEnd(timeframeEnd: OffsetDateTime) = apply {
                this.timeframeEnd = timeframeEnd
            }

            /** The (inclusive) start of the usage timeframe affected by this backfill. */
            @JsonProperty("timeframe_start")
            fun timeframeStart(timeframeStart: OffsetDateTime) = apply {
                this.timeframeStart = timeframeStart
            }

            /**
             * The time at which no more events will be accepted for this backfill. The backfill
             * will automatically begin reflecting throughout Orb at the close time. If not
             * specified, it will default to 1 day after the creation of the backfill.
             */
            @JsonProperty("close_time")
            fun closeTime(closeTime: OffsetDateTime) = apply { this.closeTime = closeTime }

            /**
             * The Orb-generated ID of the customer to which this backfill is scoped. Omitting this
             * field will scope the backfill to all customers.
             */
            @JsonProperty("customer_id")
            fun customerId(customerId: String) = apply { this.customerId = customerId }

            /**
             * A boolean
             * [computed property](../guides/extensibility/advanced-metrics#computed-properties)
             * used to filter the set of events to deprecate
             */
            @JsonProperty("deprecation_filter")
            fun deprecationFilter(deprecationFilter: String) = apply {
                this.deprecationFilter = deprecationFilter
            }

            /**
             * The external customer ID of the customer to which this backfill is scoped. Omitting
             * this field will scope the backfill to all customers.
             */
            @JsonProperty("external_customer_id")
            fun externalCustomerId(externalCustomerId: String) = apply {
                this.externalCustomerId = externalCustomerId
            }

            /**
             * If true, replaces all existing events in the timeframe with the newly ingested
             * events. If false, adds the newly ingested events to the existing events.
             */
            @JsonProperty("replace_existing_events")
            fun replaceExistingEvents(replaceExistingEvents: Boolean) = apply {
                this.replaceExistingEvents = replaceExistingEvents
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

            fun build(): EventBackfillCreateBody =
                EventBackfillCreateBody(
                    checkNotNull(timeframeEnd) { "`timeframeEnd` is required but was not set" },
                    checkNotNull(timeframeStart) { "`timeframeStart` is required but was not set" },
                    closeTime,
                    customerId,
                    deprecationFilter,
                    externalCustomerId,
                    replaceExistingEvents,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is EventBackfillCreateBody && this.timeframeEnd == other.timeframeEnd && this.timeframeStart == other.timeframeStart && this.closeTime == other.closeTime && this.customerId == other.customerId && this.deprecationFilter == other.deprecationFilter && this.externalCustomerId == other.externalCustomerId && this.replaceExistingEvents == other.replaceExistingEvents && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(timeframeEnd, timeframeStart, closeTime, customerId, deprecationFilter, externalCustomerId, replaceExistingEvents, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "EventBackfillCreateBody{timeframeEnd=$timeframeEnd, timeframeStart=$timeframeStart, closeTime=$closeTime, customerId=$customerId, deprecationFilter=$deprecationFilter, externalCustomerId=$externalCustomerId, replaceExistingEvents=$replaceExistingEvents, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EventBackfillCreateParams && this.timeframeEnd == other.timeframeEnd && this.timeframeStart == other.timeframeStart && this.closeTime == other.closeTime && this.customerId == other.customerId && this.deprecationFilter == other.deprecationFilter && this.externalCustomerId == other.externalCustomerId && this.replaceExistingEvents == other.replaceExistingEvents && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(timeframeEnd, timeframeStart, closeTime, customerId, deprecationFilter, externalCustomerId, replaceExistingEvents, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "EventBackfillCreateParams{timeframeEnd=$timeframeEnd, timeframeStart=$timeframeStart, closeTime=$closeTime, customerId=$customerId, deprecationFilter=$deprecationFilter, externalCustomerId=$externalCustomerId, replaceExistingEvents=$replaceExistingEvents, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var timeframeEnd: OffsetDateTime? = null
        private var timeframeStart: OffsetDateTime? = null
        private var closeTime: OffsetDateTime? = null
        private var customerId: String? = null
        private var deprecationFilter: String? = null
        private var externalCustomerId: String? = null
        private var replaceExistingEvents: Boolean? = null
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(eventBackfillCreateParams: EventBackfillCreateParams) = apply {
            this.timeframeEnd = eventBackfillCreateParams.timeframeEnd
            this.timeframeStart = eventBackfillCreateParams.timeframeStart
            this.closeTime = eventBackfillCreateParams.closeTime
            this.customerId = eventBackfillCreateParams.customerId
            this.deprecationFilter = eventBackfillCreateParams.deprecationFilter
            this.externalCustomerId = eventBackfillCreateParams.externalCustomerId
            this.replaceExistingEvents = eventBackfillCreateParams.replaceExistingEvents
            additionalHeaders(eventBackfillCreateParams.additionalHeaders)
            additionalQueryParams(eventBackfillCreateParams.additionalQueryParams)
            additionalBodyProperties(eventBackfillCreateParams.additionalBodyProperties)
        }

        /** The (exclusive) end of the usage timeframe affected by this backfill. */
        fun timeframeEnd(timeframeEnd: OffsetDateTime) = apply { this.timeframeEnd = timeframeEnd }

        /** The (inclusive) start of the usage timeframe affected by this backfill. */
        fun timeframeStart(timeframeStart: OffsetDateTime) = apply {
            this.timeframeStart = timeframeStart
        }

        /**
         * The time at which no more events will be accepted for this backfill. The backfill will
         * automatically begin reflecting throughout Orb at the close time. If not specified, it
         * will default to 1 day after the creation of the backfill.
         */
        fun closeTime(closeTime: OffsetDateTime) = apply { this.closeTime = closeTime }

        /**
         * The Orb-generated ID of the customer to which this backfill is scoped. Omitting this
         * field will scope the backfill to all customers.
         */
        fun customerId(customerId: String) = apply { this.customerId = customerId }

        /**
         * A boolean
         * [computed property](../guides/extensibility/advanced-metrics#computed-properties) used to
         * filter the set of events to deprecate
         */
        fun deprecationFilter(deprecationFilter: String) = apply {
            this.deprecationFilter = deprecationFilter
        }

        /**
         * The external customer ID of the customer to which this backfill is scoped. Omitting this
         * field will scope the backfill to all customers.
         */
        fun externalCustomerId(externalCustomerId: String) = apply {
            this.externalCustomerId = externalCustomerId
        }

        /**
         * If true, replaces all existing events in the timeframe with the newly ingested events. If
         * false, adds the newly ingested events to the existing events.
         */
        fun replaceExistingEvents(replaceExistingEvents: Boolean) = apply {
            this.replaceExistingEvents = replaceExistingEvents
        }

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

        fun build(): EventBackfillCreateParams =
            EventBackfillCreateParams(
                checkNotNull(timeframeEnd) { "`timeframeEnd` is required but was not set" },
                checkNotNull(timeframeStart) { "`timeframeStart` is required but was not set" },
                closeTime,
                customerId,
                deprecationFilter,
                externalCustomerId,
                replaceExistingEvents,
                additionalHeaders
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalQueryParams
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalBodyProperties.toImmutable(),
            )
    }
}
