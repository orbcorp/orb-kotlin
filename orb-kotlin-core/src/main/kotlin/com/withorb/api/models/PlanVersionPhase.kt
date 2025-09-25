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
import java.util.Collections
import java.util.Objects

class PlanVersionPhase
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val description: JsonField<String>,
    private val duration: JsonField<Long>,
    private val durationUnit: JsonField<DurationUnit>,
    private val name: JsonField<String>,
    private val order: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("duration") @ExcludeMissing duration: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("duration_unit")
        @ExcludeMissing
        durationUnit: JsonField<DurationUnit> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("order") @ExcludeMissing order: JsonField<Long> = JsonMissing.of(),
    ) : this(id, description, duration, durationUnit, name, order, mutableMapOf())

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun description(): String? = description.getNullable("description")

    /**
     * How many terms of length `duration_unit` this phase is active for. If null, this phase is
     * evergreen and active indefinitely
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun duration(): Long? = duration.getNullable("duration")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun durationUnit(): DurationUnit? = durationUnit.getNullable("duration_unit")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * Determines the ordering of the phase in a plan's lifecycle. 1 = first phase.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun order(): Long = order.getRequired("order")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [duration].
     *
     * Unlike [duration], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("duration") @ExcludeMissing fun _duration(): JsonField<Long> = duration

    /**
     * Returns the raw JSON value of [durationUnit].
     *
     * Unlike [durationUnit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("duration_unit")
    @ExcludeMissing
    fun _durationUnit(): JsonField<DurationUnit> = durationUnit

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [order].
     *
     * Unlike [order], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("order") @ExcludeMissing fun _order(): JsonField<Long> = order

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
         * Returns a mutable builder for constructing an instance of [PlanVersionPhase].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .description()
         * .duration()
         * .durationUnit()
         * .name()
         * .order()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [PlanVersionPhase]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var description: JsonField<String>? = null
        private var duration: JsonField<Long>? = null
        private var durationUnit: JsonField<DurationUnit>? = null
        private var name: JsonField<String>? = null
        private var order: JsonField<Long>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(planVersionPhase: PlanVersionPhase) = apply {
            id = planVersionPhase.id
            description = planVersionPhase.description
            duration = planVersionPhase.duration
            durationUnit = planVersionPhase.durationUnit
            name = planVersionPhase.name
            order = planVersionPhase.order
            additionalProperties = planVersionPhase.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun description(description: String?) = description(JsonField.ofNullable(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /**
         * How many terms of length `duration_unit` this phase is active for. If null, this phase is
         * evergreen and active indefinitely
         */
        fun duration(duration: Long?) = duration(JsonField.ofNullable(duration))

        /**
         * Alias for [Builder.duration].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun duration(duration: Long) = duration(duration as Long?)

        /**
         * Sets [Builder.duration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.duration] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun duration(duration: JsonField<Long>) = apply { this.duration = duration }

        fun durationUnit(durationUnit: DurationUnit?) =
            durationUnit(JsonField.ofNullable(durationUnit))

        /**
         * Sets [Builder.durationUnit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.durationUnit] with a well-typed [DurationUnit] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun durationUnit(durationUnit: JsonField<DurationUnit>) = apply {
            this.durationUnit = durationUnit
        }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Determines the ordering of the phase in a plan's lifecycle. 1 = first phase. */
        fun order(order: Long) = order(JsonField.of(order))

        /**
         * Sets [Builder.order] to an arbitrary JSON value.
         *
         * You should usually call [Builder.order] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun order(order: JsonField<Long>) = apply { this.order = order }

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
         * Returns an immutable instance of [PlanVersionPhase].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .description()
         * .duration()
         * .durationUnit()
         * .name()
         * .order()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PlanVersionPhase =
            PlanVersionPhase(
                checkRequired("id", id),
                checkRequired("description", description),
                checkRequired("duration", duration),
                checkRequired("durationUnit", durationUnit),
                checkRequired("name", name),
                checkRequired("order", order),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PlanVersionPhase = apply {
        if (validated) {
            return@apply
        }

        id()
        description()
        duration()
        durationUnit()?.validate()
        name()
        order()
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
            (if (description.asKnown() == null) 0 else 1) +
            (if (duration.asKnown() == null) 0 else 1) +
            (durationUnit.asKnown()?.validity() ?: 0) +
            (if (name.asKnown() == null) 0 else 1) +
            (if (order.asKnown() == null) 0 else 1)

    class DurationUnit @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            val DAILY = of("daily")

            val MONTHLY = of("monthly")

            val QUARTERLY = of("quarterly")

            val SEMI_ANNUAL = of("semi_annual")

            val ANNUAL = of("annual")

            fun of(value: String) = DurationUnit(JsonField.of(value))
        }

        /** An enum containing [DurationUnit]'s known values. */
        enum class Known {
            DAILY,
            MONTHLY,
            QUARTERLY,
            SEMI_ANNUAL,
            ANNUAL,
        }

        /**
         * An enum containing [DurationUnit]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [DurationUnit] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DAILY,
            MONTHLY,
            QUARTERLY,
            SEMI_ANNUAL,
            ANNUAL,
            /**
             * An enum member indicating that [DurationUnit] was instantiated with an unknown value.
             */
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
                DAILY -> Value.DAILY
                MONTHLY -> Value.MONTHLY
                QUARTERLY -> Value.QUARTERLY
                SEMI_ANNUAL -> Value.SEMI_ANNUAL
                ANNUAL -> Value.ANNUAL
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
                DAILY -> Known.DAILY
                MONTHLY -> Known.MONTHLY
                QUARTERLY -> Known.QUARTERLY
                SEMI_ANNUAL -> Known.SEMI_ANNUAL
                ANNUAL -> Known.ANNUAL
                else -> throw OrbInvalidDataException("Unknown DurationUnit: $value")
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

        fun validate(): DurationUnit = apply {
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

            return other is DurationUnit && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PlanVersionPhase &&
            id == other.id &&
            description == other.description &&
            duration == other.duration &&
            durationUnit == other.durationUnit &&
            name == other.name &&
            order == other.order &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(id, description, duration, durationUnit, name, order, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PlanVersionPhase{id=$id, description=$description, duration=$duration, durationUnit=$durationUnit, name=$name, order=$order, additionalProperties=$additionalProperties}"
}
