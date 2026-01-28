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

class DiscountOverride
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val discountType: JsonField<DiscountType>,
    private val amountDiscount: JsonField<String>,
    private val percentageDiscount: JsonField<Double>,
    private val usageDiscount: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("discount_type")
        @ExcludeMissing
        discountType: JsonField<DiscountType> = JsonMissing.of(),
        @JsonProperty("amount_discount")
        @ExcludeMissing
        amountDiscount: JsonField<String> = JsonMissing.of(),
        @JsonProperty("percentage_discount")
        @ExcludeMissing
        percentageDiscount: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("usage_discount")
        @ExcludeMissing
        usageDiscount: JsonField<Double> = JsonMissing.of(),
    ) : this(discountType, amountDiscount, percentageDiscount, usageDiscount, mutableMapOf())

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun discountType(): DiscountType = discountType.getRequired("discount_type")

    /**
     * Only available if discount_type is `amount`.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun amountDiscount(): String? = amountDiscount.getNullable("amount_discount")

    /**
     * Only available if discount_type is `percentage`. This is a number between 0 and 1.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun percentageDiscount(): Double? = percentageDiscount.getNullable("percentage_discount")

    /**
     * Only available if discount_type is `usage`. Number of usage units that this discount is for
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun usageDiscount(): Double? = usageDiscount.getNullable("usage_discount")

    /**
     * Returns the raw JSON value of [discountType].
     *
     * Unlike [discountType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("discount_type")
    @ExcludeMissing
    fun _discountType(): JsonField<DiscountType> = discountType

    /**
     * Returns the raw JSON value of [amountDiscount].
     *
     * Unlike [amountDiscount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amount_discount")
    @ExcludeMissing
    fun _amountDiscount(): JsonField<String> = amountDiscount

    /**
     * Returns the raw JSON value of [percentageDiscount].
     *
     * Unlike [percentageDiscount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("percentage_discount")
    @ExcludeMissing
    fun _percentageDiscount(): JsonField<Double> = percentageDiscount

    /**
     * Returns the raw JSON value of [usageDiscount].
     *
     * Unlike [usageDiscount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("usage_discount")
    @ExcludeMissing
    fun _usageDiscount(): JsonField<Double> = usageDiscount

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
         * Returns a mutable builder for constructing an instance of [DiscountOverride].
         *
         * The following fields are required:
         * ```kotlin
         * .discountType()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [DiscountOverride]. */
    class Builder internal constructor() {

        private var discountType: JsonField<DiscountType>? = null
        private var amountDiscount: JsonField<String> = JsonMissing.of()
        private var percentageDiscount: JsonField<Double> = JsonMissing.of()
        private var usageDiscount: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(discountOverride: DiscountOverride) = apply {
            discountType = discountOverride.discountType
            amountDiscount = discountOverride.amountDiscount
            percentageDiscount = discountOverride.percentageDiscount
            usageDiscount = discountOverride.usageDiscount
            additionalProperties = discountOverride.additionalProperties.toMutableMap()
        }

        fun discountType(discountType: DiscountType) = discountType(JsonField.of(discountType))

        /**
         * Sets [Builder.discountType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.discountType] with a well-typed [DiscountType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun discountType(discountType: JsonField<DiscountType>) = apply {
            this.discountType = discountType
        }

        /** Only available if discount_type is `amount`. */
        fun amountDiscount(amountDiscount: String?) =
            amountDiscount(JsonField.ofNullable(amountDiscount))

        /**
         * Sets [Builder.amountDiscount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amountDiscount] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun amountDiscount(amountDiscount: JsonField<String>) = apply {
            this.amountDiscount = amountDiscount
        }

        /** Only available if discount_type is `percentage`. This is a number between 0 and 1. */
        fun percentageDiscount(percentageDiscount: Double?) =
            percentageDiscount(JsonField.ofNullable(percentageDiscount))

        /**
         * Alias for [Builder.percentageDiscount].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun percentageDiscount(percentageDiscount: Double) =
            percentageDiscount(percentageDiscount as Double?)

        /**
         * Sets [Builder.percentageDiscount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.percentageDiscount] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun percentageDiscount(percentageDiscount: JsonField<Double>) = apply {
            this.percentageDiscount = percentageDiscount
        }

        /**
         * Only available if discount_type is `usage`. Number of usage units that this discount is
         * for
         */
        fun usageDiscount(usageDiscount: Double?) =
            usageDiscount(JsonField.ofNullable(usageDiscount))

        /**
         * Alias for [Builder.usageDiscount].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun usageDiscount(usageDiscount: Double) = usageDiscount(usageDiscount as Double?)

        /**
         * Sets [Builder.usageDiscount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.usageDiscount] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun usageDiscount(usageDiscount: JsonField<Double>) = apply {
            this.usageDiscount = usageDiscount
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
         * Returns an immutable instance of [DiscountOverride].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .discountType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DiscountOverride =
            DiscountOverride(
                checkRequired("discountType", discountType),
                amountDiscount,
                percentageDiscount,
                usageDiscount,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): DiscountOverride = apply {
        if (validated) {
            return@apply
        }

        discountType().validate()
        amountDiscount()
        percentageDiscount()
        usageDiscount()
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
        (discountType.asKnown()?.validity() ?: 0) +
            (if (amountDiscount.asKnown() == null) 0 else 1) +
            (if (percentageDiscount.asKnown() == null) 0 else 1) +
            (if (usageDiscount.asKnown() == null) 0 else 1)

    class DiscountType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            val PERCENTAGE = of("percentage")

            val USAGE = of("usage")

            val AMOUNT = of("amount")

            fun of(value: String) = DiscountType(JsonField.of(value))
        }

        /** An enum containing [DiscountType]'s known values. */
        enum class Known {
            PERCENTAGE,
            USAGE,
            AMOUNT,
        }

        /**
         * An enum containing [DiscountType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [DiscountType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PERCENTAGE,
            USAGE,
            AMOUNT,
            /**
             * An enum member indicating that [DiscountType] was instantiated with an unknown value.
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
                PERCENTAGE -> Value.PERCENTAGE
                USAGE -> Value.USAGE
                AMOUNT -> Value.AMOUNT
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
                PERCENTAGE -> Known.PERCENTAGE
                USAGE -> Known.USAGE
                AMOUNT -> Known.AMOUNT
                else -> throw OrbInvalidDataException("Unknown DiscountType: $value")
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

        fun validate(): DiscountType = apply {
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

            return other is DiscountType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DiscountOverride &&
            discountType == other.discountType &&
            amountDiscount == other.amountDiscount &&
            percentageDiscount == other.percentageDiscount &&
            usageDiscount == other.usageDiscount &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            discountType,
            amountDiscount,
            percentageDiscount,
            usageDiscount,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DiscountOverride{discountType=$discountType, amountDiscount=$amountDiscount, percentageDiscount=$percentageDiscount, usageDiscount=$usageDiscount, additionalProperties=$additionalProperties}"
}
