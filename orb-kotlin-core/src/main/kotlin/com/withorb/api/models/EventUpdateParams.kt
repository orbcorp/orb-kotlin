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
import com.withorb.api.core.checkRequired
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import com.withorb.api.core.immutableEmptyMap
import com.withorb.api.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects

/**
 * This endpoint is used to amend a single usage event with a given `event_id`. `event_id` refers to
 * the `idempotency_key` passed in during ingestion. The event will maintain its existing `event_id`
 * after the amendment.
 *
 * This endpoint will mark the existing event as ignored, and Orb will only use the new event passed
 * in the body of this request as the source of truth for that `event_id`. Note that a single event
 * can be amended any number of times, so the same event can be overwritten in subsequent calls to
 * this endpoint. Only a single event with a given `event_id` will be considered the source of truth
 * at any given time.
 *
 * This is a powerful and audit-safe mechanism to retroactively update a single event in cases where
 * you need to:
 * - update an event with new metadata as you iterate on your pricing model
 * - update an event based on the result of an external API call (e.g. call to a payment gateway
 *   succeeded or failed)
 *
 * This amendment API is always audit-safe. The process will still retain the original event, though
 * it will be ignored for billing calculations. For auditing and data fidelity purposes, Orb never
 * overwrites or permanently deletes ingested usage data.
 *
 * ## Request validation
 * - The `timestamp` of the new event must match the `timestamp` of the existing event already
 *   ingested. As with ingestion, all timestamps must be sent in ISO8601 format with UTC timezone
 *   offset.
 * - The `customer_id` or `external_customer_id` of the new event must match the `customer_id` or
 *   `external_customer_id` of the existing event already ingested. Exactly one of `customer_id` and
 *   `external_customer_id` should be specified, and similar to ingestion, the ID must identify a
 *   Customer resource within Orb. Unlike ingestion, for event amendment, we strictly enforce that
 *   the Customer must be in the Orb system, even during the initial integration period. We do not
 *   allow updating the `Customer` an event is associated with.
 * - Orb does not accept an `idempotency_key` with the event in this endpoint, since this request is
 *   by design idempotent. On retryable errors, you should retry the request and assume the
 *   amendment operation has not succeeded until receipt of a 2xx.
 * - The event's `timestamp` must fall within the customer's current subscription's billing period,
 *   or within the grace period of the customer's current subscription's previous billing period.
 * - By default, no more than 100 events can be amended for a single customer in a 100 day period.
 *   For higher volume updates, consider using the [event backfill](create-backfill) endpoint.
 */
class EventUpdateParams
private constructor(
    private val eventId: String,
    private val body: EventUpdateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun eventId(): String = eventId

    /** A name to meaningfully identify the action or event type. */
    fun eventName(): String = body.eventName()

    /**
     * A dictionary of custom properties. Values in this dictionary must be numeric, boolean, or
     * strings. Nested dictionaries are disallowed.
     */
    fun _properties(): JsonValue = body._properties()

    /**
     * An ISO 8601 format date with no timezone offset (i.e. UTC). This should represent the time
     * that usage was recorded, and is particularly important to attribute usage to a given billing
     * period.
     */
    fun timestamp(): OffsetDateTime = body.timestamp()

    /** The Orb Customer identifier */
    fun customerId(): String? = body.customerId()

    /** An alias for the Orb customer, whose mapping is specified when creating the customer */
    fun externalCustomerId(): String? = body.externalCustomerId()

    /** A name to meaningfully identify the action or event type. */
    fun _eventName(): JsonField<String> = body._eventName()

    /**
     * An ISO 8601 format date with no timezone offset (i.e. UTC). This should represent the time
     * that usage was recorded, and is particularly important to attribute usage to a given billing
     * period.
     */
    fun _timestamp(): JsonField<OffsetDateTime> = body._timestamp()

    /** The Orb Customer identifier */
    fun _customerId(): JsonField<String> = body._customerId()

    /** An alias for the Orb customer, whose mapping is specified when creating the customer */
    fun _externalCustomerId(): JsonField<String> = body._externalCustomerId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun getBody(): EventUpdateBody = body

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> eventId
            else -> ""
        }
    }

    @NoAutoDetect
    class EventUpdateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("event_name")
        @ExcludeMissing
        private val eventName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("properties")
        @ExcludeMissing
        private val properties: JsonValue = JsonMissing.of(),
        @JsonProperty("timestamp")
        @ExcludeMissing
        private val timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("customer_id")
        @ExcludeMissing
        private val customerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("external_customer_id")
        @ExcludeMissing
        private val externalCustomerId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** A name to meaningfully identify the action or event type. */
        fun eventName(): String = eventName.getRequired("event_name")

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

        /** The Orb Customer identifier */
        fun customerId(): String? = customerId.getNullable("customer_id")

        /** An alias for the Orb customer, whose mapping is specified when creating the customer */
        fun externalCustomerId(): String? = externalCustomerId.getNullable("external_customer_id")

        /** A name to meaningfully identify the action or event type. */
        @JsonProperty("event_name") @ExcludeMissing fun _eventName(): JsonField<String> = eventName

        /**
         * An ISO 8601 format date with no timezone offset (i.e. UTC). This should represent the
         * time that usage was recorded, and is particularly important to attribute usage to a given
         * billing period.
         */
        @JsonProperty("timestamp")
        @ExcludeMissing
        fun _timestamp(): JsonField<OffsetDateTime> = timestamp

        /** The Orb Customer identifier */
        @JsonProperty("customer_id")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

        /** An alias for the Orb customer, whose mapping is specified when creating the customer */
        @JsonProperty("external_customer_id")
        @ExcludeMissing
        fun _externalCustomerId(): JsonField<String> = externalCustomerId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): EventUpdateBody = apply {
            if (validated) {
                return@apply
            }

            eventName()
            timestamp()
            customerId()
            externalCustomerId()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [EventUpdateBody]. */
        class Builder internal constructor() {

            private var eventName: JsonField<String>? = null
            private var properties: JsonValue? = null
            private var timestamp: JsonField<OffsetDateTime>? = null
            private var customerId: JsonField<String> = JsonMissing.of()
            private var externalCustomerId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(eventUpdateBody: EventUpdateBody) = apply {
                eventName = eventUpdateBody.eventName
                properties = eventUpdateBody.properties
                timestamp = eventUpdateBody.timestamp
                customerId = eventUpdateBody.customerId
                externalCustomerId = eventUpdateBody.externalCustomerId
                additionalProperties = eventUpdateBody.additionalProperties.toMutableMap()
            }

            /** A name to meaningfully identify the action or event type. */
            fun eventName(eventName: String) = eventName(JsonField.of(eventName))

            /** A name to meaningfully identify the action or event type. */
            fun eventName(eventName: JsonField<String>) = apply { this.eventName = eventName }

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

            /** The Orb Customer identifier */
            fun customerId(customerId: String?) = customerId(JsonField.ofNullable(customerId))

            /** The Orb Customer identifier */
            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

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

            fun build(): EventUpdateBody =
                EventUpdateBody(
                    checkRequired("eventName", eventName),
                    checkRequired("properties", properties),
                    checkRequired("timestamp", timestamp),
                    customerId,
                    externalCustomerId,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is EventUpdateBody && eventName == other.eventName && properties == other.properties && timestamp == other.timestamp && customerId == other.customerId && externalCustomerId == other.externalCustomerId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(eventName, properties, timestamp, customerId, externalCustomerId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "EventUpdateBody{eventName=$eventName, properties=$properties, timestamp=$timestamp, customerId=$customerId, externalCustomerId=$externalCustomerId, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    /** A builder for [EventUpdateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var eventId: String? = null
        private var body: EventUpdateBody.Builder = EventUpdateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(eventUpdateParams: EventUpdateParams) = apply {
            eventId = eventUpdateParams.eventId
            body = eventUpdateParams.body.toBuilder()
            additionalHeaders = eventUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = eventUpdateParams.additionalQueryParams.toBuilder()
        }

        fun eventId(eventId: String) = apply { this.eventId = eventId }

        /** A name to meaningfully identify the action or event type. */
        fun eventName(eventName: String) = apply { body.eventName(eventName) }

        /** A name to meaningfully identify the action or event type. */
        fun eventName(eventName: JsonField<String>) = apply { body.eventName(eventName) }

        /**
         * A dictionary of custom properties. Values in this dictionary must be numeric, boolean, or
         * strings. Nested dictionaries are disallowed.
         */
        fun properties(properties: JsonValue) = apply { body.properties(properties) }

        /**
         * An ISO 8601 format date with no timezone offset (i.e. UTC). This should represent the
         * time that usage was recorded, and is particularly important to attribute usage to a given
         * billing period.
         */
        fun timestamp(timestamp: OffsetDateTime) = apply { body.timestamp(timestamp) }

        /**
         * An ISO 8601 format date with no timezone offset (i.e. UTC). This should represent the
         * time that usage was recorded, and is particularly important to attribute usage to a given
         * billing period.
         */
        fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply { body.timestamp(timestamp) }

        /** The Orb Customer identifier */
        fun customerId(customerId: String?) = apply { body.customerId(customerId) }

        /** The Orb Customer identifier */
        fun customerId(customerId: JsonField<String>) = apply { body.customerId(customerId) }

        /** An alias for the Orb customer, whose mapping is specified when creating the customer */
        fun externalCustomerId(externalCustomerId: String?) = apply {
            body.externalCustomerId(externalCustomerId)
        }

        /** An alias for the Orb customer, whose mapping is specified when creating the customer */
        fun externalCustomerId(externalCustomerId: JsonField<String>) = apply {
            body.externalCustomerId(externalCustomerId)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

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

        fun build(): EventUpdateParams =
            EventUpdateParams(
                checkRequired("eventId", eventId),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EventUpdateParams && eventId == other.eventId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(eventId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "EventUpdateParams{eventId=$eventId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
