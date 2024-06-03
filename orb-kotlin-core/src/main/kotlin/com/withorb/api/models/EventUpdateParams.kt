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

class EventUpdateParams
constructor(
    private val eventId: String,
    private val eventName: String,
    private val properties: JsonValue,
    private val timestamp: OffsetDateTime,
    private val customerId: String?,
    private val externalCustomerId: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun eventId(): String = eventId

    fun eventName(): String = eventName

    fun properties(): JsonValue = properties

    fun timestamp(): OffsetDateTime = timestamp

    fun customerId(): String? = customerId

    fun externalCustomerId(): String? = externalCustomerId

    internal fun getBody(): EventUpdateBody {
        return EventUpdateBody(
            eventName,
            properties,
            timestamp,
            customerId,
            externalCustomerId,
            additionalBodyProperties,
        )
    }

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> eventId
            else -> ""
        }
    }

    @JsonDeserialize(builder = EventUpdateBody.Builder::class)
    @NoAutoDetect
    class EventUpdateBody
    internal constructor(
        private val eventName: String?,
        private val properties: JsonValue?,
        private val timestamp: OffsetDateTime?,
        private val customerId: String?,
        private val externalCustomerId: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** A name to meaningfully identify the action or event type. */
        @JsonProperty("event_name") fun eventName(): String? = eventName

        /**
         * A dictionary of custom properties. Values in this dictionary must be numeric, boolean, or
         * strings. Nested dictionaries are disallowed.
         */
        @JsonProperty("properties") fun properties(): JsonValue? = properties

        /**
         * An ISO 8601 format date with no timezone offset (i.e. UTC). This should represent the
         * time that usage was recorded, and is particularly important to attribute usage to a given
         * billing period.
         */
        @JsonProperty("timestamp") fun timestamp(): OffsetDateTime? = timestamp

        /** The Orb Customer identifier */
        @JsonProperty("customer_id") fun customerId(): String? = customerId

        /** An alias for the Orb customer, whose mapping is specified when creating the customer */
        @JsonProperty("external_customer_id") fun externalCustomerId(): String? = externalCustomerId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is EventUpdateBody &&
                this.eventName == other.eventName &&
                this.properties == other.properties &&
                this.timestamp == other.timestamp &&
                this.customerId == other.customerId &&
                this.externalCustomerId == other.externalCustomerId &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        eventName,
                        properties,
                        timestamp,
                        customerId,
                        externalCustomerId,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "EventUpdateBody{eventName=$eventName, properties=$properties, timestamp=$timestamp, customerId=$customerId, externalCustomerId=$externalCustomerId, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var eventName: String? = null
            private var properties: JsonValue? = null
            private var timestamp: OffsetDateTime? = null
            private var customerId: String? = null
            private var externalCustomerId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(eventUpdateBody: EventUpdateBody) = apply {
                this.eventName = eventUpdateBody.eventName
                this.properties = eventUpdateBody.properties
                this.timestamp = eventUpdateBody.timestamp
                this.customerId = eventUpdateBody.customerId
                this.externalCustomerId = eventUpdateBody.externalCustomerId
                additionalProperties(eventUpdateBody.additionalProperties)
            }

            /** A name to meaningfully identify the action or event type. */
            @JsonProperty("event_name")
            fun eventName(eventName: String) = apply { this.eventName = eventName }

            /**
             * A dictionary of custom properties. Values in this dictionary must be numeric,
             * boolean, or strings. Nested dictionaries are disallowed.
             */
            @JsonProperty("properties")
            fun properties(properties: JsonValue) = apply { this.properties = properties }

            /**
             * An ISO 8601 format date with no timezone offset (i.e. UTC). This should represent the
             * time that usage was recorded, and is particularly important to attribute usage to a
             * given billing period.
             */
            @JsonProperty("timestamp")
            fun timestamp(timestamp: OffsetDateTime) = apply { this.timestamp = timestamp }

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

            fun build(): EventUpdateBody =
                EventUpdateBody(
                    checkNotNull(eventName) { "`eventName` is required but was not set" },
                    checkNotNull(properties) { "`properties` is required but was not set" },
                    checkNotNull(timestamp) { "`timestamp` is required but was not set" },
                    customerId,
                    externalCustomerId,
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

        return other is EventUpdateParams &&
            this.eventId == other.eventId &&
            this.eventName == other.eventName &&
            this.properties == other.properties &&
            this.timestamp == other.timestamp &&
            this.customerId == other.customerId &&
            this.externalCustomerId == other.externalCustomerId &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            eventId,
            eventName,
            properties,
            timestamp,
            customerId,
            externalCustomerId,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "EventUpdateParams{eventId=$eventId, eventName=$eventName, properties=$properties, timestamp=$timestamp, customerId=$customerId, externalCustomerId=$externalCustomerId, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var eventId: String? = null
        private var eventName: String? = null
        private var properties: JsonValue? = null
        private var timestamp: OffsetDateTime? = null
        private var customerId: String? = null
        private var externalCustomerId: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(eventUpdateParams: EventUpdateParams) = apply {
            this.eventId = eventUpdateParams.eventId
            this.eventName = eventUpdateParams.eventName
            this.properties = eventUpdateParams.properties
            this.timestamp = eventUpdateParams.timestamp
            this.customerId = eventUpdateParams.customerId
            this.externalCustomerId = eventUpdateParams.externalCustomerId
            additionalQueryParams(eventUpdateParams.additionalQueryParams)
            additionalHeaders(eventUpdateParams.additionalHeaders)
            additionalBodyProperties(eventUpdateParams.additionalBodyProperties)
        }

        fun eventId(eventId: String) = apply { this.eventId = eventId }

        /** A name to meaningfully identify the action or event type. */
        fun eventName(eventName: String) = apply { this.eventName = eventName }

        /**
         * A dictionary of custom properties. Values in this dictionary must be numeric, boolean, or
         * strings. Nested dictionaries are disallowed.
         */
        fun properties(properties: JsonValue) = apply { this.properties = properties }

        /**
         * An ISO 8601 format date with no timezone offset (i.e. UTC). This should represent the
         * time that usage was recorded, and is particularly important to attribute usage to a given
         * billing period.
         */
        fun timestamp(timestamp: OffsetDateTime) = apply { this.timestamp = timestamp }

        /** The Orb Customer identifier */
        fun customerId(customerId: String) = apply { this.customerId = customerId }

        /** An alias for the Orb customer, whose mapping is specified when creating the customer */
        fun externalCustomerId(externalCustomerId: String) = apply {
            this.externalCustomerId = externalCustomerId
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

        fun build(): EventUpdateParams =
            EventUpdateParams(
                checkNotNull(eventId) { "`eventId` is required but was not set" },
                checkNotNull(eventName) { "`eventName` is required but was not set" },
                checkNotNull(properties) { "`properties` is required but was not set" },
                checkNotNull(timestamp) { "`timestamp` is required but was not set" },
                customerId,
                externalCustomerId,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}
