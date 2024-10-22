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

class EventIngestParams
constructor(
    private val events: List<Event>,
    private val backfillId: String?,
    private val debug: Boolean?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun events(): List<Event> = events

    fun backfillId(): String? = backfillId

    fun debug(): Boolean? = debug

    internal fun getBody(): EventIngestBody {
        return EventIngestBody(events, additionalBodyProperties)
    }

    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.backfillId?.let { params.put("backfill_id", listOf(it.toString())) }
        this.debug?.let { params.put("debug", listOf(it.toString())) }
        params.putAll(additionalQueryParams)
        return params.toUnmodifiable()
    }

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = EventIngestBody.Builder::class)
    @NoAutoDetect
    class EventIngestBody
    internal constructor(
        private val events: List<Event>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("events") fun events(): List<Event>? = events

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var events: List<Event>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(eventIngestBody: EventIngestBody) = apply {
                this.events = eventIngestBody.events
                additionalProperties(eventIngestBody.additionalProperties)
            }

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

            fun build(): EventIngestBody =
                EventIngestBody(
                    checkNotNull(events) { "`events` is required but was not set" }
                        .toUnmodifiable(),
                    additionalProperties.toUnmodifiable()
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is EventIngestBody && this.events == other.events && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(events, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "EventIngestBody{events=$events, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EventIngestParams && this.events == other.events && this.backfillId == other.backfillId && this.debug == other.debug && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(events, backfillId, debug, additionalQueryParams, additionalHeaders, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "EventIngestParams{events=$events, backfillId=$backfillId, debug=$debug, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var events: MutableList<Event> = mutableListOf()
        private var backfillId: String? = null
        private var debug: Boolean? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(eventIngestParams: EventIngestParams) = apply {
            this.events(eventIngestParams.events)
            this.backfillId = eventIngestParams.backfillId
            this.debug = eventIngestParams.debug
            additionalQueryParams(eventIngestParams.additionalQueryParams)
            additionalHeaders(eventIngestParams.additionalHeaders)
            additionalBodyProperties(eventIngestParams.additionalBodyProperties)
        }

        fun events(events: List<Event>) = apply {
            this.events.clear()
            this.events.addAll(events)
        }

        fun addEvent(event: Event) = apply { this.events.add(event) }

        /**
         * If this ingestion request is part of a backfill, this parameter ties the ingested events
         * to the backfill
         */
        fun backfillId(backfillId: String) = apply { this.backfillId = backfillId }

        /** Flag to enable additional debug information in the endpoint response */
        fun debug(debug: Boolean) = apply { this.debug = debug }

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

        fun build(): EventIngestParams =
            EventIngestParams(
                checkNotNull(events) { "`events` is required but was not set" }.toUnmodifiable(),
                backfillId,
                debug,
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
        private val idempotencyKey: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

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

        /**
         * A unique value, generated by the client, that is used to de-duplicate events. Exactly one
         * event with a given idempotency key will be ingested, which allows for safe request
         * retries.
         */
        @JsonProperty("idempotency_key") fun idempotencyKey(): String? = idempotencyKey

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var customerId: String? = null
            private var externalCustomerId: String? = null
            private var eventName: String? = null
            private var timestamp: OffsetDateTime? = null
            private var properties: JsonValue? = null
            private var idempotencyKey: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(event: Event) = apply {
                this.customerId = event.customerId
                this.externalCustomerId = event.externalCustomerId
                this.eventName = event.eventName
                this.timestamp = event.timestamp
                this.properties = event.properties
                this.idempotencyKey = event.idempotencyKey
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

            /**
             * A unique value, generated by the client, that is used to de-duplicate events. Exactly
             * one event with a given idempotency key will be ingested, which allows for safe
             * request retries.
             */
            @JsonProperty("idempotency_key")
            fun idempotencyKey(idempotencyKey: String) = apply {
                this.idempotencyKey = idempotencyKey
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

            fun build(): Event =
                Event(
                    customerId,
                    externalCustomerId,
                    checkNotNull(eventName) { "`eventName` is required but was not set" },
                    checkNotNull(timestamp) { "`timestamp` is required but was not set" },
                    checkNotNull(properties) { "`properties` is required but was not set" },
                    checkNotNull(idempotencyKey) { "`idempotencyKey` is required but was not set" },
                    additionalProperties.toUnmodifiable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Event && this.customerId == other.customerId && this.externalCustomerId == other.externalCustomerId && this.eventName == other.eventName && this.timestamp == other.timestamp && this.properties == other.properties && this.idempotencyKey == other.idempotencyKey && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(customerId, externalCustomerId, eventName, timestamp, properties, idempotencyKey, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "Event{customerId=$customerId, externalCustomerId=$externalCustomerId, eventName=$eventName, timestamp=$timestamp, properties=$properties, idempotencyKey=$idempotencyKey, additionalProperties=$additionalProperties}"
    }
}
