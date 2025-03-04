// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.checkKnown
import com.withorb.api.core.checkRequired
import com.withorb.api.core.immutableEmptyMap
import com.withorb.api.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects

@NoAutoDetect
class EventSearchResponse
@JsonCreator
private constructor(
    @JsonProperty("data")
    @ExcludeMissing
    private val data: JsonField<List<Data>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun data(): List<Data> = data.getRequired("data")

    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<Data>> = data

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): EventSearchResponse = apply {
        if (validated) {
            return@apply
        }

        data().forEach { it.validate() }
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EventSearchResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .data()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [EventSearchResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<Data>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(eventSearchResponse: EventSearchResponse) = apply {
            data = eventSearchResponse.data.map { it.toMutableList() }
            additionalProperties = eventSearchResponse.additionalProperties.toMutableMap()
        }

        fun data(data: List<Data>) = data(JsonField.of(data))

        fun data(data: JsonField<List<Data>>) = apply {
            this.data = data.map { it.toMutableList() }
        }

        fun addData(data: Data) = apply {
            this.data =
                (this.data ?: JsonField.of(mutableListOf())).also {
                    checkKnown("data", it).add(data)
                }
        }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        fun build(): EventSearchResponse =
            EventSearchResponse(
                checkRequired("data", data).map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    /**
     * The [Event](/core-concepts#event) resource represents a usage event that has been created for
     * a customer. Events are the core of Orb's usage-based billing model, and are used to calculate
     * the usage charges for a given billing period.
     */
    @NoAutoDetect
    class Data
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("customer_id")
        @ExcludeMissing
        private val customerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("deprecated")
        @ExcludeMissing
        private val deprecated: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("event_name")
        @ExcludeMissing
        private val eventName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("external_customer_id")
        @ExcludeMissing
        private val externalCustomerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("properties")
        @ExcludeMissing
        private val properties: JsonValue = JsonMissing.of(),
        @JsonProperty("timestamp")
        @ExcludeMissing
        private val timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * A unique value, generated by the client, that is used to de-duplicate events. Exactly one
         * event with a given idempotency key will be ingested, which allows for safe request
         * retries.
         */
        fun id(): String = id.getRequired("id")

        /** The Orb Customer identifier */
        fun customerId(): String? = customerId.getNullable("customer_id")

        /** A boolean indicating whether the event is currently deprecated. */
        fun deprecated(): Boolean = deprecated.getRequired("deprecated")

        /** A name to meaningfully identify the action or event type. */
        fun eventName(): String = eventName.getRequired("event_name")

        /** An alias for the Orb customer, whose mapping is specified when creating the customer */
        fun externalCustomerId(): String? = externalCustomerId.getNullable("external_customer_id")

        /**
         * A dictionary of custom properties. Values in this dictionary must be numeric, boolean, or
         * strings. Nested dictionaries are disallowed.
         */
        @JsonProperty("properties") @ExcludeMissing fun _properties(): JsonValue = properties

        /**
         * An ISO 8601 format date with no timezone offset (i.e. UTC). This should represent the
         * time that usage was recorded, and is particularly important to attribute usage to a given
         * billing period.
         */
        fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

        /**
         * A unique value, generated by the client, that is used to de-duplicate events. Exactly one
         * event with a given idempotency key will be ingested, which allows for safe request
         * retries.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /** The Orb Customer identifier */
        @JsonProperty("customer_id")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

        /** A boolean indicating whether the event is currently deprecated. */
        @JsonProperty("deprecated")
        @ExcludeMissing
        fun _deprecated(): JsonField<Boolean> = deprecated

        /** A name to meaningfully identify the action or event type. */
        @JsonProperty("event_name") @ExcludeMissing fun _eventName(): JsonField<String> = eventName

        /** An alias for the Orb customer, whose mapping is specified when creating the customer */
        @JsonProperty("external_customer_id")
        @ExcludeMissing
        fun _externalCustomerId(): JsonField<String> = externalCustomerId

        /**
         * An ISO 8601 format date with no timezone offset (i.e. UTC). This should represent the
         * time that usage was recorded, and is particularly important to attribute usage to a given
         * billing period.
         */
        @JsonProperty("timestamp")
        @ExcludeMissing
        fun _timestamp(): JsonField<OffsetDateTime> = timestamp

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            id()
            customerId()
            deprecated()
            eventName()
            externalCustomerId()
            timestamp()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Data].
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .customerId()
             * .deprecated()
             * .eventName()
             * .externalCustomerId()
             * .properties()
             * .timestamp()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var customerId: JsonField<String>? = null
            private var deprecated: JsonField<Boolean>? = null
            private var eventName: JsonField<String>? = null
            private var externalCustomerId: JsonField<String>? = null
            private var properties: JsonValue? = null
            private var timestamp: JsonField<OffsetDateTime>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(data: Data) = apply {
                id = data.id
                customerId = data.customerId
                deprecated = data.deprecated
                eventName = data.eventName
                externalCustomerId = data.externalCustomerId
                properties = data.properties
                timestamp = data.timestamp
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /**
             * A unique value, generated by the client, that is used to de-duplicate events. Exactly
             * one event with a given idempotency key will be ingested, which allows for safe
             * request retries.
             */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * A unique value, generated by the client, that is used to de-duplicate events. Exactly
             * one event with a given idempotency key will be ingested, which allows for safe
             * request retries.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** The Orb Customer identifier */
            fun customerId(customerId: String?) = customerId(JsonField.ofNullable(customerId))

            /** The Orb Customer identifier */
            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

            /** A boolean indicating whether the event is currently deprecated. */
            fun deprecated(deprecated: Boolean) = deprecated(JsonField.of(deprecated))

            /** A boolean indicating whether the event is currently deprecated. */
            fun deprecated(deprecated: JsonField<Boolean>) = apply { this.deprecated = deprecated }

            /** A name to meaningfully identify the action or event type. */
            fun eventName(eventName: String) = eventName(JsonField.of(eventName))

            /** A name to meaningfully identify the action or event type. */
            fun eventName(eventName: JsonField<String>) = apply { this.eventName = eventName }

            /**
             * An alias for the Orb customer, whose mapping is specified when creating the customer
             */
            fun externalCustomerId(externalCustomerId: String?) =
                externalCustomerId(JsonField.ofNullable(externalCustomerId))

            /**
             * An alias for the Orb customer, whose mapping is specified when creating the customer
             */
            fun externalCustomerId(externalCustomerId: JsonField<String>) = apply {
                this.externalCustomerId = externalCustomerId
            }

            /**
             * A dictionary of custom properties. Values in this dictionary must be numeric,
             * boolean, or strings. Nested dictionaries are disallowed.
             */
            fun properties(properties: JsonValue) = apply { this.properties = properties }

            /**
             * An ISO 8601 format date with no timezone offset (i.e. UTC). This should represent the
             * time that usage was recorded, and is particularly important to attribute usage to a
             * given billing period.
             */
            fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

            /**
             * An ISO 8601 format date with no timezone offset (i.e. UTC). This should represent the
             * time that usage was recorded, and is particularly important to attribute usage to a
             * given billing period.
             */
            fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                this.timestamp = timestamp
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): Data =
                Data(
                    checkRequired("id", id),
                    checkRequired("customerId", customerId),
                    checkRequired("deprecated", deprecated),
                    checkRequired("eventName", eventName),
                    checkRequired("externalCustomerId", externalCustomerId),
                    checkRequired("properties", properties),
                    checkRequired("timestamp", timestamp),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Data && id == other.id && customerId == other.customerId && deprecated == other.deprecated && eventName == other.eventName && externalCustomerId == other.externalCustomerId && properties == other.properties && timestamp == other.timestamp && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, customerId, deprecated, eventName, externalCustomerId, properties, timestamp, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{id=$id, customerId=$customerId, deprecated=$deprecated, eventName=$eventName, externalCustomerId=$externalCustomerId, properties=$properties, timestamp=$timestamp, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EventSearchResponse && data == other.data && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EventSearchResponse{data=$data, additionalProperties=$additionalProperties}"
}
