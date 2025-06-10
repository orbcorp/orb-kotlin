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
 * A subscription change represents a desired new subscription / pending change to an existing
 * subscription. It is a way to first preview the effects on the subscription as well as any
 * changes/creation of invoices (see `subscription.changed_resources`).
 */
class SubscriptionChangeCancelResponse
private constructor(
    private val id: JsonField<String>,
    private val expirationTime: JsonField<OffsetDateTime>,
    private val status: JsonField<Status>,
    private val subscription: JsonField<MutatedSubscription>,
    private val appliedAt: JsonField<OffsetDateTime>,
    private val cancelledAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("expiration_time")
        @ExcludeMissing
        expirationTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("subscription")
        @ExcludeMissing
        subscription: JsonField<MutatedSubscription> = JsonMissing.of(),
        @JsonProperty("applied_at")
        @ExcludeMissing
        appliedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("cancelled_at")
        @ExcludeMissing
        cancelledAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(id, expirationTime, status, subscription, appliedAt, cancelledAt, mutableMapOf())

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Subscription change will be cancelled at this time and can no longer be applied.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun expirationTime(): OffsetDateTime = expirationTime.getRequired("expiration_time")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun subscription(): MutatedSubscription? = subscription.getNullable("subscription")

    /**
     * When this change was applied.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun appliedAt(): OffsetDateTime? = appliedAt.getNullable("applied_at")

    /**
     * When this change was cancelled.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun cancelledAt(): OffsetDateTime? = cancelledAt.getNullable("cancelled_at")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [expirationTime].
     *
     * Unlike [expirationTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expiration_time")
    @ExcludeMissing
    fun _expirationTime(): JsonField<OffsetDateTime> = expirationTime

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [subscription].
     *
     * Unlike [subscription], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("subscription")
    @ExcludeMissing
    fun _subscription(): JsonField<MutatedSubscription> = subscription

    /**
     * Returns the raw JSON value of [appliedAt].
     *
     * Unlike [appliedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("applied_at")
    @ExcludeMissing
    fun _appliedAt(): JsonField<OffsetDateTime> = appliedAt

    /**
     * Returns the raw JSON value of [cancelledAt].
     *
     * Unlike [cancelledAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cancelled_at")
    @ExcludeMissing
    fun _cancelledAt(): JsonField<OffsetDateTime> = cancelledAt

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
         * Returns a mutable builder for constructing an instance of
         * [SubscriptionChangeCancelResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .expirationTime()
         * .status()
         * .subscription()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [SubscriptionChangeCancelResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var expirationTime: JsonField<OffsetDateTime>? = null
        private var status: JsonField<Status>? = null
        private var subscription: JsonField<MutatedSubscription>? = null
        private var appliedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var cancelledAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(subscriptionChangeCancelResponse: SubscriptionChangeCancelResponse) =
            apply {
                id = subscriptionChangeCancelResponse.id
                expirationTime = subscriptionChangeCancelResponse.expirationTime
                status = subscriptionChangeCancelResponse.status
                subscription = subscriptionChangeCancelResponse.subscription
                appliedAt = subscriptionChangeCancelResponse.appliedAt
                cancelledAt = subscriptionChangeCancelResponse.cancelledAt
                additionalProperties =
                    subscriptionChangeCancelResponse.additionalProperties.toMutableMap()
            }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Subscription change will be cancelled at this time and can no longer be applied. */
        fun expirationTime(expirationTime: OffsetDateTime) =
            expirationTime(JsonField.of(expirationTime))

        /**
         * Sets [Builder.expirationTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expirationTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expirationTime(expirationTime: JsonField<OffsetDateTime>) = apply {
            this.expirationTime = expirationTime
        }

        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        fun subscription(subscription: MutatedSubscription?) =
            subscription(JsonField.ofNullable(subscription))

        /**
         * Sets [Builder.subscription] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subscription] with a well-typed [MutatedSubscription]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun subscription(subscription: JsonField<MutatedSubscription>) = apply {
            this.subscription = subscription
        }

        /** When this change was applied. */
        fun appliedAt(appliedAt: OffsetDateTime?) = appliedAt(JsonField.ofNullable(appliedAt))

        /**
         * Sets [Builder.appliedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.appliedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun appliedAt(appliedAt: JsonField<OffsetDateTime>) = apply { this.appliedAt = appliedAt }

        /** When this change was cancelled. */
        fun cancelledAt(cancelledAt: OffsetDateTime?) =
            cancelledAt(JsonField.ofNullable(cancelledAt))

        /**
         * Sets [Builder.cancelledAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cancelledAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun cancelledAt(cancelledAt: JsonField<OffsetDateTime>) = apply {
            this.cancelledAt = cancelledAt
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
         * Returns an immutable instance of [SubscriptionChangeCancelResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .expirationTime()
         * .status()
         * .subscription()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SubscriptionChangeCancelResponse =
            SubscriptionChangeCancelResponse(
                checkRequired("id", id),
                checkRequired("expirationTime", expirationTime),
                checkRequired("status", status),
                checkRequired("subscription", subscription),
                appliedAt,
                cancelledAt,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SubscriptionChangeCancelResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        expirationTime()
        status().validate()
        subscription()?.validate()
        appliedAt()
        cancelledAt()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: OrbInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        (if (id.asKnown() == null) 0 else 1) +
            (if (expirationTime.asKnown() == null) 0 else 1) +
            (status.asKnown()?.validity() ?: 0) +
            (subscription.asKnown()?.validity() ?: 0) +
            (if (appliedAt.asKnown() == null) 0 else 1) +
            (if (cancelledAt.asKnown() == null) 0 else 1)

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

            val APPLIED = of("applied")

            val CANCELLED = of("cancelled")

            fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            PENDING,
            APPLIED,
            CANCELLED,
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
            APPLIED,
            CANCELLED,
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
                APPLIED -> Value.APPLIED
                CANCELLED -> Value.CANCELLED
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
                APPLIED -> Known.APPLIED
                CANCELLED -> Known.CANCELLED
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

        private var validated: Boolean = false

        fun validate(): Status = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: OrbInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

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

        return /* spotless:off */ other is SubscriptionChangeCancelResponse && id == other.id && expirationTime == other.expirationTime && status == other.status && subscription == other.subscription && appliedAt == other.appliedAt && cancelledAt == other.cancelledAt && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, expirationTime, status, subscription, appliedAt, cancelledAt, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SubscriptionChangeCancelResponse{id=$id, expirationTime=$expirationTime, status=$status, subscription=$subscription, appliedAt=$appliedAt, cancelledAt=$cancelledAt, additionalProperties=$additionalProperties}"
}
