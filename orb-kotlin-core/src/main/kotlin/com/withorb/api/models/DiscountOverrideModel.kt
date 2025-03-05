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
import java.util.Objects

@NoAutoDetect
class DiscountOverrideModel
@JsonCreator
private constructor(
    @JsonProperty("discount_type")
    @ExcludeMissing
    private val discountType: JsonField<DiscountType> = JsonMissing.of(),
    @JsonProperty("amount_discount")
    @ExcludeMissing
    private val amountDiscount: JsonField<String> = JsonMissing.of(),
    @JsonProperty("percentage_discount")
    @ExcludeMissing
    private val percentageDiscount: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("usage_discount")
    @ExcludeMissing
    private val usageDiscount: JsonField<Double> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun discountType(): DiscountType = discountType.getRequired("discount_type")

    /** Only available if discount_type is `amount`. */
    fun amountDiscount(): String? = amountDiscount.getNullable("amount_discount")

    /** Only available if discount_type is `percentage`. This is a number between 0 and 1. */
    fun percentageDiscount(): Double? = percentageDiscount.getNullable("percentage_discount")

    /**
     * Only available if discount_type is `usage`. Number of usage units that this discount is for
     */
    fun usageDiscount(): Double? = usageDiscount.getNullable("usage_discount")

    @JsonProperty("discount_type")
    @ExcludeMissing
    fun _discountType(): JsonField<DiscountType> = discountType

    /** Only available if discount_type is `amount`. */
    @JsonProperty("amount_discount")
    @ExcludeMissing
    fun _amountDiscount(): JsonField<String> = amountDiscount

    /** Only available if discount_type is `percentage`. This is a number between 0 and 1. */
    @JsonProperty("percentage_discount")
    @ExcludeMissing
    fun _percentageDiscount(): JsonField<Double> = percentageDiscount

    /**
     * Only available if discount_type is `usage`. Number of usage units that this discount is for
     */
    @JsonProperty("usage_discount")
    @ExcludeMissing
    fun _usageDiscount(): JsonField<Double> = usageDiscount

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): DiscountOverrideModel = apply {
        if (validated) {
            return@apply
        }

        discountType()
        amountDiscount()
        percentageDiscount()
        usageDiscount()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DiscountOverrideModel].
         *
         * The following fields are required:
         * ```kotlin
         * .discountType()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [DiscountOverrideModel]. */
    class Builder internal constructor() {

        private var discountType: JsonField<DiscountType>? = null
        private var amountDiscount: JsonField<String> = JsonMissing.of()
        private var percentageDiscount: JsonField<Double> = JsonMissing.of()
        private var usageDiscount: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(discountOverrideModel: DiscountOverrideModel) = apply {
            discountType = discountOverrideModel.discountType
            amountDiscount = discountOverrideModel.amountDiscount
            percentageDiscount = discountOverrideModel.percentageDiscount
            usageDiscount = discountOverrideModel.usageDiscount
            additionalProperties = discountOverrideModel.additionalProperties.toMutableMap()
        }

        fun discountType(discountType: DiscountType) = discountType(JsonField.of(discountType))

        fun discountType(discountType: JsonField<DiscountType>) = apply {
            this.discountType = discountType
        }

        /** Only available if discount_type is `amount`. */
        fun amountDiscount(amountDiscount: String?) =
            amountDiscount(JsonField.ofNullable(amountDiscount))

        /** Only available if discount_type is `amount`. */
        fun amountDiscount(amountDiscount: JsonField<String>) = apply {
            this.amountDiscount = amountDiscount
        }

        /** Only available if discount_type is `percentage`. This is a number between 0 and 1. */
        fun percentageDiscount(percentageDiscount: Double?) =
            percentageDiscount(JsonField.ofNullable(percentageDiscount))

        /** Only available if discount_type is `percentage`. This is a number between 0 and 1. */
        fun percentageDiscount(percentageDiscount: Double) =
            percentageDiscount(percentageDiscount as Double?)

        /** Only available if discount_type is `percentage`. This is a number between 0 and 1. */
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
         * Only available if discount_type is `usage`. Number of usage units that this discount is
         * for
         */
        fun usageDiscount(usageDiscount: Double) = usageDiscount(usageDiscount as Double?)

        /**
         * Only available if discount_type is `usage`. Number of usage units that this discount is
         * for
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

        fun build(): DiscountOverrideModel =
            DiscountOverrideModel(
                checkRequired("discountType", discountType),
                amountDiscount,
                percentageDiscount,
                usageDiscount,
                additionalProperties.toImmutable(),
            )
    }

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DiscountType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DiscountOverrideModel && discountType == other.discountType && amountDiscount == other.amountDiscount && percentageDiscount == other.percentageDiscount && usageDiscount == other.usageDiscount && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(discountType, amountDiscount, percentageDiscount, usageDiscount, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DiscountOverrideModel{discountType=$discountType, amountDiscount=$amountDiscount, percentageDiscount=$percentageDiscount, usageDiscount=$usageDiscount, additionalProperties=$additionalProperties}"
}
