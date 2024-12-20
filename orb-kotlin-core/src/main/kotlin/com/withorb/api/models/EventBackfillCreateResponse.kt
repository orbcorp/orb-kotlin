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
class EventBackfillCreateResponse
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<Status> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("timeframe_start")
    @ExcludeMissing
    private val timeframeStart: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("timeframe_end")
    @ExcludeMissing
    private val timeframeEnd: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("events_ingested")
    @ExcludeMissing
    private val eventsIngested: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("close_time")
    @ExcludeMissing
    private val closeTime: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("reverted_at")
    @ExcludeMissing
    private val revertedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("customer_id")
    @ExcludeMissing
    private val customerId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("deprecation_filter")
    @ExcludeMissing
    private val deprecationFilter: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun id(): String = id.getRequired("id")

    /** The status of the backfill. */
    fun status(): Status = status.getRequired("status")

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    fun timeframeStart(): OffsetDateTime = timeframeStart.getRequired("timeframe_start")

    fun timeframeEnd(): OffsetDateTime = timeframeEnd.getRequired("timeframe_end")

    /** The number of events ingested in this backfill. */
    fun eventsIngested(): Long = eventsIngested.getRequired("events_ingested")

    /**
     * If in the future, the time at which the backfill will automatically close. If in the past,
     * the time at which the backfill was closed.
     */
    fun closeTime(): OffsetDateTime? = closeTime.getNullable("close_time")

    /** The time at which this backfill was reverted. */
    fun revertedAt(): OffsetDateTime? = revertedAt.getNullable("reverted_at")

    /**
     * The Orb-generated ID of the customer to which this backfill is scoped. If `null`, this
     * backfill is scoped to all customers.
     */
    fun customerId(): String? = customerId.getNullable("customer_id")

    /**
     * A boolean [computed property](../guides/extensibility/advanced-metrics#computed-properties)
     * used to filter the set of events to deprecate
     */
    fun deprecationFilter(): String? = deprecationFilter.getNullable("deprecation_filter")

    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /** The status of the backfill. */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    @JsonProperty("timeframe_start") @ExcludeMissing fun _timeframeStart() = timeframeStart

    @JsonProperty("timeframe_end") @ExcludeMissing fun _timeframeEnd() = timeframeEnd

    /** The number of events ingested in this backfill. */
    @JsonProperty("events_ingested") @ExcludeMissing fun _eventsIngested() = eventsIngested

    /**
     * If in the future, the time at which the backfill will automatically close. If in the past,
     * the time at which the backfill was closed.
     */
    @JsonProperty("close_time") @ExcludeMissing fun _closeTime() = closeTime

    /** The time at which this backfill was reverted. */
    @JsonProperty("reverted_at") @ExcludeMissing fun _revertedAt() = revertedAt

    /**
     * The Orb-generated ID of the customer to which this backfill is scoped. If `null`, this
     * backfill is scoped to all customers.
     */
    @JsonProperty("customer_id") @ExcludeMissing fun _customerId() = customerId

    /**
     * A boolean [computed property](../guides/extensibility/advanced-metrics#computed-properties)
     * used to filter the set of events to deprecate
     */
    @JsonProperty("deprecation_filter") @ExcludeMissing fun _deprecationFilter() = deprecationFilter

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): EventBackfillCreateResponse = apply {
        if (!validated) {
            id()
            status()
            createdAt()
            timeframeStart()
            timeframeEnd()
            eventsIngested()
            closeTime()
            revertedAt()
            customerId()
            deprecationFilter()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var timeframeStart: JsonField<OffsetDateTime> = JsonMissing.of()
        private var timeframeEnd: JsonField<OffsetDateTime> = JsonMissing.of()
        private var eventsIngested: JsonField<Long> = JsonMissing.of()
        private var closeTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var revertedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var customerId: JsonField<String> = JsonMissing.of()
        private var deprecationFilter: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(eventBackfillCreateResponse: EventBackfillCreateResponse) = apply {
            id = eventBackfillCreateResponse.id
            status = eventBackfillCreateResponse.status
            createdAt = eventBackfillCreateResponse.createdAt
            timeframeStart = eventBackfillCreateResponse.timeframeStart
            timeframeEnd = eventBackfillCreateResponse.timeframeEnd
            eventsIngested = eventBackfillCreateResponse.eventsIngested
            closeTime = eventBackfillCreateResponse.closeTime
            revertedAt = eventBackfillCreateResponse.revertedAt
            customerId = eventBackfillCreateResponse.customerId
            deprecationFilter = eventBackfillCreateResponse.deprecationFilter
            additionalProperties = eventBackfillCreateResponse.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The status of the backfill. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The status of the backfill. */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun timeframeStart(timeframeStart: OffsetDateTime) =
            timeframeStart(JsonField.of(timeframeStart))

        fun timeframeStart(timeframeStart: JsonField<OffsetDateTime>) = apply {
            this.timeframeStart = timeframeStart
        }

        fun timeframeEnd(timeframeEnd: OffsetDateTime) = timeframeEnd(JsonField.of(timeframeEnd))

        fun timeframeEnd(timeframeEnd: JsonField<OffsetDateTime>) = apply {
            this.timeframeEnd = timeframeEnd
        }

        /** The number of events ingested in this backfill. */
        fun eventsIngested(eventsIngested: Long) = eventsIngested(JsonField.of(eventsIngested))

        /** The number of events ingested in this backfill. */
        fun eventsIngested(eventsIngested: JsonField<Long>) = apply {
            this.eventsIngested = eventsIngested
        }

        /**
         * If in the future, the time at which the backfill will automatically close. If in the
         * past, the time at which the backfill was closed.
         */
        fun closeTime(closeTime: OffsetDateTime) = closeTime(JsonField.of(closeTime))

        /**
         * If in the future, the time at which the backfill will automatically close. If in the
         * past, the time at which the backfill was closed.
         */
        fun closeTime(closeTime: JsonField<OffsetDateTime>) = apply { this.closeTime = closeTime }

        /** The time at which this backfill was reverted. */
        fun revertedAt(revertedAt: OffsetDateTime) = revertedAt(JsonField.of(revertedAt))

        /** The time at which this backfill was reverted. */
        fun revertedAt(revertedAt: JsonField<OffsetDateTime>) = apply {
            this.revertedAt = revertedAt
        }

        /**
         * The Orb-generated ID of the customer to which this backfill is scoped. If `null`, this
         * backfill is scoped to all customers.
         */
        fun customerId(customerId: String) = customerId(JsonField.of(customerId))

        /**
         * The Orb-generated ID of the customer to which this backfill is scoped. If `null`, this
         * backfill is scoped to all customers.
         */
        fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

        /**
         * A boolean
         * [computed property](../guides/extensibility/advanced-metrics#computed-properties) used to
         * filter the set of events to deprecate
         */
        fun deprecationFilter(deprecationFilter: String) =
            deprecationFilter(JsonField.of(deprecationFilter))

        /**
         * A boolean
         * [computed property](../guides/extensibility/advanced-metrics#computed-properties) used to
         * filter the set of events to deprecate
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

        fun build(): EventBackfillCreateResponse =
            EventBackfillCreateResponse(
                id,
                status,
                createdAt,
                timeframeStart,
                timeframeEnd,
                eventsIngested,
                closeTime,
                revertedAt,
                customerId,
                deprecationFilter,
                additionalProperties.toImmutable(),
            )
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val PENDING = of("pending")

            val REFLECTED = of("reflected")

            val PENDING_REVERT = of("pending_revert")

            val REVERTED = of("reverted")

            fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            PENDING,
            REFLECTED,
            PENDING_REVERT,
            REVERTED,
        }

        enum class Value {
            PENDING,
            REFLECTED,
            PENDING_REVERT,
            REVERTED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PENDING -> Value.PENDING
                REFLECTED -> Value.REFLECTED
                PENDING_REVERT -> Value.PENDING_REVERT
                REVERTED -> Value.REVERTED
                else -> Value._UNKNOWN
            }

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

        return /* spotless:off */ other is EventBackfillCreateResponse && id == other.id && status == other.status && createdAt == other.createdAt && timeframeStart == other.timeframeStart && timeframeEnd == other.timeframeEnd && eventsIngested == other.eventsIngested && closeTime == other.closeTime && revertedAt == other.revertedAt && customerId == other.customerId && deprecationFilter == other.deprecationFilter && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, status, createdAt, timeframeStart, timeframeEnd, eventsIngested, closeTime, revertedAt, customerId, deprecationFilter, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EventBackfillCreateResponse{id=$id, status=$status, createdAt=$createdAt, timeframeStart=$timeframeStart, timeframeEnd=$timeframeEnd, eventsIngested=$eventsIngested, closeTime=$closeTime, revertedAt=$revertedAt, customerId=$customerId, deprecationFilter=$deprecationFilter, additionalProperties=$additionalProperties}"
}
