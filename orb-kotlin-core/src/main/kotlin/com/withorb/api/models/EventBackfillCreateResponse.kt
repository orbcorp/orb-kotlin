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
import com.withorb.api.core.checkRequired
import com.withorb.api.errors.OrbInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/**
 * A backfill represents an update to historical usage data, adding or replacing events in a
 * timeframe.
 */
class EventBackfillCreateResponse
private constructor(
    private val id: JsonField<String>,
    private val closeTime: JsonField<OffsetDateTime>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val customerId: JsonField<String>,
    private val eventsIngested: JsonField<Long>,
    private val replaceExistingEvents: JsonField<Boolean>,
    private val revertedAt: JsonField<OffsetDateTime>,
    private val status: JsonField<Status>,
    private val timeframeEnd: JsonField<OffsetDateTime>,
    private val timeframeStart: JsonField<OffsetDateTime>,
    private val deprecationFilter: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("close_time")
        @ExcludeMissing
        closeTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("customer_id")
        @ExcludeMissing
        customerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("events_ingested")
        @ExcludeMissing
        eventsIngested: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("replace_existing_events")
        @ExcludeMissing
        replaceExistingEvents: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("reverted_at")
        @ExcludeMissing
        revertedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("timeframe_end")
        @ExcludeMissing
        timeframeEnd: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("timeframe_start")
        @ExcludeMissing
        timeframeStart: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("deprecation_filter")
        @ExcludeMissing
        deprecationFilter: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        closeTime,
        createdAt,
        customerId,
        eventsIngested,
        replaceExistingEvents,
        revertedAt,
        status,
        timeframeEnd,
        timeframeStart,
        deprecationFilter,
        mutableMapOf(),
    )

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * If in the future, the time at which the backfill will automatically close. If in the past,
     * the time at which the backfill was closed.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun closeTime(): OffsetDateTime? = closeTime.getNullable("close_time")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * The Orb-generated ID of the customer to which this backfill is scoped. If `null`, this
     * backfill is scoped to all customers.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun customerId(): String? = customerId.getNullable("customer_id")

    /**
     * The number of events ingested in this backfill.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun eventsIngested(): Long = eventsIngested.getRequired("events_ingested")

    /**
     * If `true`, existing events in the backfill's timeframe will be replaced with the newly
     * ingested events associated with the backfill. If `false`, newly ingested events will be added
     * to the existing events.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun replaceExistingEvents(): Boolean =
        replaceExistingEvents.getRequired("replace_existing_events")

    /**
     * The time at which this backfill was reverted.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun revertedAt(): OffsetDateTime? = revertedAt.getNullable("reverted_at")

    /**
     * The status of the backfill.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun timeframeEnd(): OffsetDateTime = timeframeEnd.getRequired("timeframe_end")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun timeframeStart(): OffsetDateTime = timeframeStart.getRequired("timeframe_start")

    /**
     * A boolean [computed property](/extensibility/advanced-metrics#computed-properties) used to
     * filter the set of events to deprecate
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun deprecationFilter(): String? = deprecationFilter.getNullable("deprecation_filter")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [closeTime].
     *
     * Unlike [closeTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("close_time")
    @ExcludeMissing
    fun _closeTime(): JsonField<OffsetDateTime> = closeTime

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [customerId].
     *
     * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("customer_id") @ExcludeMissing fun _customerId(): JsonField<String> = customerId

    /**
     * Returns the raw JSON value of [eventsIngested].
     *
     * Unlike [eventsIngested], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("events_ingested")
    @ExcludeMissing
    fun _eventsIngested(): JsonField<Long> = eventsIngested

    /**
     * Returns the raw JSON value of [replaceExistingEvents].
     *
     * Unlike [replaceExistingEvents], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("replace_existing_events")
    @ExcludeMissing
    fun _replaceExistingEvents(): JsonField<Boolean> = replaceExistingEvents

    /**
     * Returns the raw JSON value of [revertedAt].
     *
     * Unlike [revertedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reverted_at")
    @ExcludeMissing
    fun _revertedAt(): JsonField<OffsetDateTime> = revertedAt

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [timeframeEnd].
     *
     * Unlike [timeframeEnd], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timeframe_end")
    @ExcludeMissing
    fun _timeframeEnd(): JsonField<OffsetDateTime> = timeframeEnd

    /**
     * Returns the raw JSON value of [timeframeStart].
     *
     * Unlike [timeframeStart], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timeframe_start")
    @ExcludeMissing
    fun _timeframeStart(): JsonField<OffsetDateTime> = timeframeStart

    /**
     * Returns the raw JSON value of [deprecationFilter].
     *
     * Unlike [deprecationFilter], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("deprecation_filter")
    @ExcludeMissing
    fun _deprecationFilter(): JsonField<String> = deprecationFilter

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EventBackfillCreateResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .closeTime()
         * .createdAt()
         * .customerId()
         * .eventsIngested()
         * .replaceExistingEvents()
         * .revertedAt()
         * .status()
         * .timeframeEnd()
         * .timeframeStart()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [EventBackfillCreateResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var closeTime: JsonField<OffsetDateTime>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var customerId: JsonField<String>? = null
        private var eventsIngested: JsonField<Long>? = null
        private var replaceExistingEvents: JsonField<Boolean>? = null
        private var revertedAt: JsonField<OffsetDateTime>? = null
        private var status: JsonField<Status>? = null
        private var timeframeEnd: JsonField<OffsetDateTime>? = null
        private var timeframeStart: JsonField<OffsetDateTime>? = null
        private var deprecationFilter: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(eventBackfillCreateResponse: EventBackfillCreateResponse) = apply {
            id = eventBackfillCreateResponse.id
            closeTime = eventBackfillCreateResponse.closeTime
            createdAt = eventBackfillCreateResponse.createdAt
            customerId = eventBackfillCreateResponse.customerId
            eventsIngested = eventBackfillCreateResponse.eventsIngested
            replaceExistingEvents = eventBackfillCreateResponse.replaceExistingEvents
            revertedAt = eventBackfillCreateResponse.revertedAt
            status = eventBackfillCreateResponse.status
            timeframeEnd = eventBackfillCreateResponse.timeframeEnd
            timeframeStart = eventBackfillCreateResponse.timeframeStart
            deprecationFilter = eventBackfillCreateResponse.deprecationFilter
            additionalProperties = eventBackfillCreateResponse.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * If in the future, the time at which the backfill will automatically close. If in the
         * past, the time at which the backfill was closed.
         */
        fun closeTime(closeTime: OffsetDateTime?) = closeTime(JsonField.ofNullable(closeTime))

        /**
         * Sets [Builder.closeTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.closeTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun closeTime(closeTime: JsonField<OffsetDateTime>) = apply { this.closeTime = closeTime }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /**
         * The Orb-generated ID of the customer to which this backfill is scoped. If `null`, this
         * backfill is scoped to all customers.
         */
        fun customerId(customerId: String?) = customerId(JsonField.ofNullable(customerId))

        /**
         * Sets [Builder.customerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

        /** The number of events ingested in this backfill. */
        fun eventsIngested(eventsIngested: Long) = eventsIngested(JsonField.of(eventsIngested))

        /**
         * Sets [Builder.eventsIngested] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventsIngested] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun eventsIngested(eventsIngested: JsonField<Long>) = apply {
            this.eventsIngested = eventsIngested
        }

        /**
         * If `true`, existing events in the backfill's timeframe will be replaced with the newly
         * ingested events associated with the backfill. If `false`, newly ingested events will be
         * added to the existing events.
         */
        fun replaceExistingEvents(replaceExistingEvents: Boolean) =
            replaceExistingEvents(JsonField.of(replaceExistingEvents))

        /**
         * Sets [Builder.replaceExistingEvents] to an arbitrary JSON value.
         *
         * You should usually call [Builder.replaceExistingEvents] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun replaceExistingEvents(replaceExistingEvents: JsonField<Boolean>) = apply {
            this.replaceExistingEvents = replaceExistingEvents
        }

        /** The time at which this backfill was reverted. */
        fun revertedAt(revertedAt: OffsetDateTime?) = revertedAt(JsonField.ofNullable(revertedAt))

        /**
         * Sets [Builder.revertedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.revertedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun revertedAt(revertedAt: JsonField<OffsetDateTime>) = apply {
            this.revertedAt = revertedAt
        }

        /** The status of the backfill. */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        fun timeframeEnd(timeframeEnd: OffsetDateTime) = timeframeEnd(JsonField.of(timeframeEnd))

        /**
         * Sets [Builder.timeframeEnd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timeframeEnd] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun timeframeEnd(timeframeEnd: JsonField<OffsetDateTime>) = apply {
            this.timeframeEnd = timeframeEnd
        }

        fun timeframeStart(timeframeStart: OffsetDateTime) =
            timeframeStart(JsonField.of(timeframeStart))

        /**
         * Sets [Builder.timeframeStart] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timeframeStart] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
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
         * Sets [Builder.deprecationFilter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deprecationFilter] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
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

        /**
         * Returns an immutable instance of [EventBackfillCreateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .closeTime()
         * .createdAt()
         * .customerId()
         * .eventsIngested()
         * .replaceExistingEvents()
         * .revertedAt()
         * .status()
         * .timeframeEnd()
         * .timeframeStart()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EventBackfillCreateResponse =
            EventBackfillCreateResponse(
                checkRequired("id", id),
                checkRequired("closeTime", closeTime),
                checkRequired("createdAt", createdAt),
                checkRequired("customerId", customerId),
                checkRequired("eventsIngested", eventsIngested),
                checkRequired("replaceExistingEvents", replaceExistingEvents),
                checkRequired("revertedAt", revertedAt),
                checkRequired("status", status),
                checkRequired("timeframeEnd", timeframeEnd),
                checkRequired("timeframeStart", timeframeStart),
                deprecationFilter,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): EventBackfillCreateResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        closeTime()
        createdAt()
        customerId()
        eventsIngested()
        replaceExistingEvents()
        revertedAt()
        status()
        timeframeEnd()
        timeframeStart()
        deprecationFilter()
        validated = true
    }

    /** The status of the backfill. */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws OrbInvalidDataException if this class instance's value does not have the expected
         *   primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw OrbInvalidDataException("Value is not a String")

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

        return /* spotless:off */ other is EventBackfillCreateResponse && id == other.id && closeTime == other.closeTime && createdAt == other.createdAt && customerId == other.customerId && eventsIngested == other.eventsIngested && replaceExistingEvents == other.replaceExistingEvents && revertedAt == other.revertedAt && status == other.status && timeframeEnd == other.timeframeEnd && timeframeStart == other.timeframeStart && deprecationFilter == other.deprecationFilter && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, closeTime, createdAt, customerId, eventsIngested, replaceExistingEvents, revertedAt, status, timeframeEnd, timeframeStart, deprecationFilter, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EventBackfillCreateResponse{id=$id, closeTime=$closeTime, createdAt=$createdAt, customerId=$customerId, eventsIngested=$eventsIngested, replaceExistingEvents=$replaceExistingEvents, revertedAt=$revertedAt, status=$status, timeframeEnd=$timeframeEnd, timeframeStart=$timeframeStart, deprecationFilter=$deprecationFilter, additionalProperties=$additionalProperties}"
}
