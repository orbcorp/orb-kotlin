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
import java.time.format.DateTimeFormatter
import java.util.Objects

class CustomerUsageUpdateByExternalIdParams
constructor(
    private val id: String,
    private val events: List<Event>,
    private val timeframeEnd: OffsetDateTime?,
    private val timeframeStart: OffsetDateTime?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun id(): String = id

    fun events(): List<Event> = events

    fun timeframeEnd(): OffsetDateTime? = timeframeEnd

    fun timeframeStart(): OffsetDateTime? = timeframeStart

    internal fun getBody(): CustomerUsageUpdateByExternalIdBody {
        return CustomerUsageUpdateByExternalIdBody(events, additionalBodyProperties)
    }

    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.timeframeEnd?.let {
            params.put("timeframe_end", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
        }
        this.timeframeStart?.let {
            params.put("timeframe_start", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
        }
        params.putAll(additionalQueryParams)
        return params.toUnmodifiable()
    }

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> id
            else -> ""
        }
    }

    @JsonDeserialize(builder = CustomerUsageUpdateByExternalIdBody.Builder::class)
    @NoAutoDetect
    class CustomerUsageUpdateByExternalIdBody
    internal constructor(
        private val events: List<Event>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** Events to update */
        @JsonProperty("events") fun events(): List<Event>? = events

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CustomerUsageUpdateByExternalIdBody &&
                this.events == other.events &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(events, additionalProperties)
            }
            return hashCode
        }

        override fun toString() =
            "CustomerUsageUpdateByExternalIdBody{events=$events, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var events: List<Event>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                customerUsageUpdateByExternalIdBody: CustomerUsageUpdateByExternalIdBody
            ) = apply {
                this.events = customerUsageUpdateByExternalIdBody.events
                additionalProperties(customerUsageUpdateByExternalIdBody.additionalProperties)
            }

            /** Events to update */
            @JsonProperty("events") fun events(events: List<Event>) = apply { this.events = events }

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

            fun build(): CustomerUsageUpdateByExternalIdBody =
                CustomerUsageUpdateByExternalIdBody(
                    checkNotNull(events) { "`events` is required but was not set" }
                        .toUnmodifiable(),
                    additionalProperties.toUnmodifiable()
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

        return other is CustomerUsageUpdateByExternalIdParams &&
            this.id == other.id &&
            this.events == other.events &&
            this.timeframeEnd == other.timeframeEnd &&
            this.timeframeStart == other.timeframeStart &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            id,
            events,
            timeframeEnd,
            timeframeStart,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "CustomerUsageUpdateByExternalIdParams{id=$id, events=$events, timeframeEnd=$timeframeEnd, timeframeStart=$timeframeStart, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var id: String? = null
        private var events: MutableList<Event> = mutableListOf()
        private var timeframeEnd: OffsetDateTime? = null
        private var timeframeStart: OffsetDateTime? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(
            customerUsageUpdateByExternalIdParams: CustomerUsageUpdateByExternalIdParams
        ) = apply {
            this.id = customerUsageUpdateByExternalIdParams.id
            this.events(customerUsageUpdateByExternalIdParams.events)
            this.timeframeEnd = customerUsageUpdateByExternalIdParams.timeframeEnd
            this.timeframeStart = customerUsageUpdateByExternalIdParams.timeframeStart
            additionalQueryParams(customerUsageUpdateByExternalIdParams.additionalQueryParams)
            additionalHeaders(customerUsageUpdateByExternalIdParams.additionalHeaders)
            additionalBodyProperties(customerUsageUpdateByExternalIdParams.additionalBodyProperties)
        }

        fun id(id: String) = apply { this.id = id }

        /** Events to update */
        fun events(events: List<Event>) = apply {
            this.events.clear()
            this.events.addAll(events)
        }

        /** Events to update */
        fun addEvent(event: Event) = apply { this.events.add(event) }

        /** This bound is exclusive (i.e. events before this timestamp will be updated) */
        fun timeframeEnd(timeframeEnd: OffsetDateTime) = apply { this.timeframeEnd = timeframeEnd }

        /**
         * This bound is inclusive (i.e. events with this timestamp onward, inclusive will be
         * updated)
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

        fun build(): CustomerUsageUpdateByExternalIdParams =
            CustomerUsageUpdateByExternalIdParams(
                checkNotNull(id) { "`id` is required but was not set" },
                checkNotNull(events) { "`events` is required but was not set" }.toUnmodifiable(),
                timeframeEnd,
                timeframeStart,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = Event.Builder::class)
    @NoAutoDetect
    class Event
    private constructor(
        private val customerId: String?,
        private val externalCustomerId: String?,
        private val eventName: String?,
        private val timestamp: OffsetDateTime?,
        private val properties: JsonValue?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The Orb Customer identifier */
        @JsonProperty("customer_id") fun customerId(): String? = customerId

        /** An alias for the Orb customer, whose mapping is specified when creating the customer */
        @JsonProperty("external_customer_id") fun externalCustomerId(): String? = externalCustomerId

        /** A name to meaningfully identify the action or event type. */
        @JsonProperty("event_name") fun eventName(): String? = eventName

        /**
         * An ISO 8601 format date with no timezone offset (i.e. UTC). This should represent the
         * time that usage was recorded, and is particularly important to attribute usage to a given
         * billing period.
         */
        @JsonProperty("timestamp") fun timestamp(): OffsetDateTime? = timestamp

        /**
         * A dictionary of custom properties. Values in this dictionary must be numeric, boolean, or
         * strings. Nested dictionaries are disallowed.
         */
        @JsonProperty("properties") fun properties(): JsonValue? = properties

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Event &&
                this.customerId == other.customerId &&
                this.externalCustomerId == other.externalCustomerId &&
                this.eventName == other.eventName &&
                this.timestamp == other.timestamp &&
                this.properties == other.properties &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        customerId,
                        externalCustomerId,
                        eventName,
                        timestamp,
                        properties,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Event{customerId=$customerId, externalCustomerId=$externalCustomerId, eventName=$eventName, timestamp=$timestamp, properties=$properties, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var customerId: String? = null
            private var externalCustomerId: String? = null
            private var eventName: String? = null
            private var timestamp: OffsetDateTime? = null
            private var properties: JsonValue? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(event: Event) = apply {
                this.customerId = event.customerId
                this.externalCustomerId = event.externalCustomerId
                this.eventName = event.eventName
                this.timestamp = event.timestamp
                this.properties = event.properties
                additionalProperties(event.additionalProperties)
            }

            /** The Orb Customer identifier */
            @JsonProperty("customer_id")
            fun customerId(customerId: String) = apply { this.customerId = customerId }

            /**
             * An alias for the Orb customer, whose mapping is specified when creating the customer
             */
            @JsonProperty("external_customer_id")
            fun externalCustomerId(externalCustomerId: String) = apply {
                this.externalCustomerId = externalCustomerId
            }

            /** A name to meaningfully identify the action or event type. */
            @JsonProperty("event_name")
            fun eventName(eventName: String) = apply { this.eventName = eventName }

            /**
             * An ISO 8601 format date with no timezone offset (i.e. UTC). This should represent the
             * time that usage was recorded, and is particularly important to attribute usage to a
             * given billing period.
             */
            @JsonProperty("timestamp")
            fun timestamp(timestamp: OffsetDateTime) = apply { this.timestamp = timestamp }

            /**
             * A dictionary of custom properties. Values in this dictionary must be numeric,
             * boolean, or strings. Nested dictionaries are disallowed.
             */
            @JsonProperty("properties")
            fun properties(properties: JsonValue) = apply { this.properties = properties }

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

            fun build(): Event =
                Event(
                    customerId,
                    externalCustomerId,
                    checkNotNull(eventName) { "`eventName` is required but was not set" },
                    checkNotNull(timestamp) { "`timestamp` is required but was not set" },
                    checkNotNull(properties) { "`properties` is required but was not set" },
                    additionalProperties.toUnmodifiable(),
                )
        }
    }
}
