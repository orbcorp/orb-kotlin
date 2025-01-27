// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.withorb.api.core.Enum
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.checkRequired
import com.withorb.api.core.immutableEmptyMap
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

/**
 * A backfill represents an update to historical usage data, adding or replacing events in a
 * timeframe.
 */
@NoAutoDetect
class EventBackfillFetchResponse
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("close_time")
    @ExcludeMissing
    private val closeTime: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("customer_id")
    @ExcludeMissing
    private val customerId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("events_ingested")
    @ExcludeMissing
    private val eventsIngested: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("reverted_at")
    @ExcludeMissing
    private val revertedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<Status> = JsonMissing.of(),
    @JsonProperty("timeframe_end")
    @ExcludeMissing
    private val timeframeEnd: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("timeframe_start")
    @ExcludeMissing
    private val timeframeStart: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("deprecation_filter")
    @ExcludeMissing
    private val deprecationFilter: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun id(): String = id.getRequired("id")

    /**
     * If in the future, the time at which the backfill will automatically close. If in the past,
     * the time at which the backfill was closed.
     */
    fun closeTime(): OffsetDateTime? = closeTime.getNullable("close_time")

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * The Orb-generated ID of the customer to which this backfill is scoped. If `null`, this
     * backfill is scoped to all customers.
     */
    fun customerId(): String? = customerId.getNullable("customer_id")

    /** The number of events ingested in this backfill. */
    fun eventsIngested(): Long = eventsIngested.getRequired("events_ingested")

    /** The time at which this backfill was reverted. */
    fun revertedAt(): OffsetDateTime? = revertedAt.getNullable("reverted_at")

    /** The status of the backfill. */
    fun status(): Status = status.getRequired("status")

    fun timeframeEnd(): OffsetDateTime = timeframeEnd.getRequired("timeframe_end")

    fun timeframeStart(): OffsetDateTime = timeframeStart.getRequired("timeframe_start")

    /**
     * A boolean [computed property](/extensibility/advanced-metrics#computed-properties) used to
     * filter the set of events to deprecate
     */
    fun deprecationFilter(): String? = deprecationFilter.getNullable("deprecation_filter")

    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * If in the future, the time at which the backfill will automatically close. If in the past,
     * the time at which the backfill was closed.
     */
    @JsonProperty("close_time")
    @ExcludeMissing
    fun _closeTime(): JsonField<OffsetDateTime> = closeTime

    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * The Orb-generated ID of the customer to which this backfill is scoped. If `null`, this
     * backfill is scoped to all customers.
     */
    @JsonProperty("customer_id") @ExcludeMissing fun _customerId(): JsonField<String> = customerId

    /** The number of events ingested in this backfill. */
    @JsonProperty("events_ingested")
    @ExcludeMissing
    fun _eventsIngested(): JsonField<Long> = eventsIngested

    /** The time at which this backfill was reverted. */
    @JsonProperty("reverted_at")
    @ExcludeMissing
    fun _revertedAt(): JsonField<OffsetDateTime> = revertedAt

    /** The status of the backfill. */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    @JsonProperty("timeframe_end")
    @ExcludeMissing
    fun _timeframeEnd(): JsonField<OffsetDateTime> = timeframeEnd

    @JsonProperty("timeframe_start")
    @ExcludeMissing
    fun _timeframeStart(): JsonField<OffsetDateTime> = timeframeStart

    /**
     * A boolean [computed property](/extensibility/advanced-metrics#computed-properties) used to
     * filter the set of events to deprecate
     */
    @JsonProperty("deprecation_filter")
    @ExcludeMissing
    fun _deprecationFilter(): JsonField<String> = deprecationFilter

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): EventBackfillFetchResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        closeTime()
        createdAt()
        customerId()
        eventsIngested()
        revertedAt()
        status()
        timeframeEnd()
        timeframeStart()
        deprecationFilter()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    /** A builder for [EventBackfillFetchResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var closeTime: JsonField<OffsetDateTime>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var customerId: JsonField<String>? = null
        private var eventsIngested: JsonField<Long>? = null
        private var revertedAt: JsonField<OffsetDateTime>? = null
        private var status: JsonField<Status>? = null
        private var timeframeEnd: JsonField<OffsetDateTime>? = null
        private var timeframeStart: JsonField<OffsetDateTime>? = null
        private var deprecationFilter: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(eventBackfillFetchResponse: EventBackfillFetchResponse) = apply {
            id = eventBackfillFetchResponse.id
            closeTime = eventBackfillFetchResponse.closeTime
            createdAt = eventBackfillFetchResponse.createdAt
            customerId = eventBackfillFetchResponse.customerId
            eventsIngested = eventBackfillFetchResponse.eventsIngested
            revertedAt = eventBackfillFetchResponse.revertedAt
            status = eventBackfillFetchResponse.status
            timeframeEnd = eventBackfillFetchResponse.timeframeEnd
            timeframeStart = eventBackfillFetchResponse.timeframeStart
            deprecationFilter = eventBackfillFetchResponse.deprecationFilter
            additionalProperties = eventBackfillFetchResponse.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * If in the future, the time at which the backfill will automatically close. If in the
         * past, the time at which the backfill was closed.
         */
        fun closeTime(closeTime: OffsetDateTime?) = closeTime(JsonField.ofNullable(closeTime))

        /**
         * If in the future, the time at which the backfill will automatically close. If in the
         * past, the time at which the backfill was closed.
         */
        fun closeTime(closeTime: JsonField<OffsetDateTime>) = apply { this.closeTime = closeTime }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /**
         * The Orb-generated ID of the customer to which this backfill is scoped. If `null`, this
         * backfill is scoped to all customers.
         */
        fun customerId(customerId: String?) = customerId(JsonField.ofNullable(customerId))

        /**
         * The Orb-generated ID of the customer to which this backfill is scoped. If `null`, this
         * backfill is scoped to all customers.
         */
        fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

        /** The number of events ingested in this backfill. */
        fun eventsIngested(eventsIngested: Long) = eventsIngested(JsonField.of(eventsIngested))

        /** The number of events ingested in this backfill. */
        fun eventsIngested(eventsIngested: JsonField<Long>) = apply {
            this.eventsIngested = eventsIngested
        }

        /** The time at which this backfill was reverted. */
        fun revertedAt(revertedAt: OffsetDateTime?) = revertedAt(JsonField.ofNullable(revertedAt))

        /** The time at which this backfill was reverted. */
        fun revertedAt(revertedAt: JsonField<OffsetDateTime>) = apply {
            this.revertedAt = revertedAt
        }

        /** The status of the backfill. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The status of the backfill. */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        fun timeframeEnd(timeframeEnd: OffsetDateTime) = timeframeEnd(JsonField.of(timeframeEnd))

        fun timeframeEnd(timeframeEnd: JsonField<OffsetDateTime>) = apply {
            this.timeframeEnd = timeframeEnd
        }

        fun timeframeStart(timeframeStart: OffsetDateTime) =
            timeframeStart(JsonField.of(timeframeStart))

        fun timeframeStart(timeframeStart: JsonField<OffsetDateTime>) = apply {
            this.timeframeStart = timeframeStart
        }

        /**
         * A boolean [computed property](/extensibility/advanced-metrics#computed-properties) used
         * to filter the set of events to deprecate
         */
        fun deprecationFilter(deprecationFilter: String?) =
            deprecationFilter(JsonField.ofNullable(deprecationFilter))

        /**
         * A boolean [computed property](/extensibility/advanced-metrics#computed-properties) used
         * to filter the set of events to deprecate
         */
        fun deprecationFilter(deprecationFilter: JsonField<String>) = apply {
            this.deprecationFilter = deprecationFilter
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

        fun build(): EventBackfillFetchResponse =
            EventBackfillFetchResponse(
                checkRequired("id", id),
                checkRequired("closeTime", closeTime),
                checkRequired("createdAt", createdAt),
                checkRequired("customerId", customerId),
                checkRequired("eventsIngested", eventsIngested),
                checkRequired("revertedAt", revertedAt),
                checkRequired("status", status),
                checkRequired("timeframeEnd", timeframeEnd),
                checkRequired("timeframeStart", timeframeStart),
                deprecationFilter,
                additionalProperties.toImmutable(),
            )
    }

    /** The status of the backfill. */
    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val PENDING = of("pending")

            val REFLECTED = of("reflected")

            val PENDING_REVERT = of("pending_revert")

            val REVERTED = of("reverted")

            fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            PENDING,
            REFLECTED,
            PENDING_REVERT,
            REVERTED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PENDING,
            REFLECTED,
            PENDING_REVERT,
            REVERTED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                PENDING -> Value.PENDING
                REFLECTED -> Value.REFLECTED
                PENDING_REVERT -> Value.PENDING_REVERT
                REVERTED -> Value.REVERTED
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws OrbInvalidDataException if this class instance's value is a not a known member.
         */
        fun known(): Known =
            when (this) {
                PENDING -> Known.PENDING
                REFLECTED -> Known.REFLECTED
                PENDING_REVERT -> Known.PENDING_REVERT
                REVERTED -> Known.REVERTED
                else -> throw OrbInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EventBackfillFetchResponse && id == other.id && closeTime == other.closeTime && createdAt == other.createdAt && customerId == other.customerId && eventsIngested == other.eventsIngested && revertedAt == other.revertedAt && status == other.status && timeframeEnd == other.timeframeEnd && timeframeStart == other.timeframeStart && deprecationFilter == other.deprecationFilter && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, closeTime, createdAt, customerId, eventsIngested, revertedAt, status, timeframeEnd, timeframeStart, deprecationFilter, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EventBackfillFetchResponse{id=$id, closeTime=$closeTime, createdAt=$createdAt, customerId=$customerId, eventsIngested=$eventsIngested, revertedAt=$revertedAt, status=$status, timeframeEnd=$timeframeEnd, timeframeStart=$timeframeStart, deprecationFilter=$deprecationFilter, additionalProperties=$additionalProperties}"
}
