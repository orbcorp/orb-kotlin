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
class TrialDiscount
@JsonCreator
private constructor(
    @JsonProperty("applies_to_price_ids")
    @ExcludeMissing
    private val appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("discount_type")
    @ExcludeMissing
    private val discountType: JsonField<DiscountType> = JsonMissing.of(),
    @JsonProperty("reason")
    @ExcludeMissing
    private val reason: JsonField<String> = JsonMissing.of(),
    @JsonProperty("trial_amount_discount")
    @ExcludeMissing
    private val trialAmountDiscount: JsonField<String> = JsonMissing.of(),
    @JsonProperty("trial_percentage_discount")
    @ExcludeMissing
    private val trialPercentageDiscount: JsonField<Double> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * List of price_ids that this discount applies to. For plan/plan phase discounts, this can be a
     * subset of prices.
     */
    fun appliesToPriceIds(): List<String> = appliesToPriceIds.getRequired("applies_to_price_ids")

    fun discountType(): DiscountType = discountType.getRequired("discount_type")

    fun reason(): String? = reason.getNullable("reason")

    /** Only available if discount_type is `trial` */
    fun trialAmountDiscount(): String? = trialAmountDiscount.getNullable("trial_amount_discount")

    /** Only available if discount_type is `trial` */
    fun trialPercentageDiscount(): Double? =
        trialPercentageDiscount.getNullable("trial_percentage_discount")

    /**
     * List of price_ids that this discount applies to. For plan/plan phase discounts, this can be a
     * subset of prices.
     */
    @JsonProperty("applies_to_price_ids")
    @ExcludeMissing
    fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

    @JsonProperty("discount_type")
    @ExcludeMissing
    fun _discountType(): JsonField<DiscountType> = discountType

    @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

    /** Only available if discount_type is `trial` */
    @JsonProperty("trial_amount_discount")
    @ExcludeMissing
    fun _trialAmountDiscount(): JsonField<String> = trialAmountDiscount

    /** Only available if discount_type is `trial` */
    @JsonProperty("trial_percentage_discount")
    @ExcludeMissing
    fun _trialPercentageDiscount(): JsonField<Double> = trialPercentageDiscount

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): TrialDiscount = apply {
        if (validated) {
            return@apply
        }

        appliesToPriceIds()
        discountType()
        reason()
        trialAmountDiscount()
        trialPercentageDiscount()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    /** A builder for [TrialDiscount]. */
    class Builder internal constructor() {

        private var appliesToPriceIds: JsonField<MutableList<String>>? = null
        private var discountType: JsonField<DiscountType>? = null
        private var reason: JsonField<String> = JsonMissing.of()
        private var trialAmountDiscount: JsonField<String> = JsonMissing.of()
        private var trialPercentageDiscount: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(trialDiscount: TrialDiscount) = apply {
            appliesToPriceIds = trialDiscount.appliesToPriceIds.map { it.toMutableList() }
            discountType = trialDiscount.discountType
            reason = trialDiscount.reason
            trialAmountDiscount = trialDiscount.trialAmountDiscount
            trialPercentageDiscount = trialDiscount.trialPercentageDiscount
            additionalProperties = trialDiscount.additionalProperties.toMutableMap()
        }

        /**
         * List of price_ids that this discount applies to. For plan/plan phase discounts, this can
         * be a subset of prices.
         */
        fun appliesToPriceIds(appliesToPriceIds: List<String>) =
            appliesToPriceIds(JsonField.of(appliesToPriceIds))

        /**
         * List of price_ids that this discount applies to. For plan/plan phase discounts, this can
         * be a subset of prices.
         */
        fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
            this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
        }

        /**
         * List of price_ids that this discount applies to. For plan/plan phase discounts, this can
         * be a subset of prices.
         */
        fun addAppliesToPriceId(appliesToPriceId: String) = apply {
            appliesToPriceIds =
                (appliesToPriceIds ?: JsonField.of(mutableListOf())).apply {
                    (asKnown()
                            ?: throw IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            ))
                        .add(appliesToPriceId)
                }
        }

        fun discountType(discountType: DiscountType) = discountType(JsonField.of(discountType))

        fun discountType(discountType: JsonField<DiscountType>) = apply {
            this.discountType = discountType
        }

        fun reason(reason: String?) = reason(JsonField.ofNullable(reason))

        fun reason(reason: JsonField<String>) = apply { this.reason = reason }

        /** Only available if discount_type is `trial` */
        fun trialAmountDiscount(trialAmountDiscount: String?) =
            trialAmountDiscount(JsonField.ofNullable(trialAmountDiscount))

        /** Only available if discount_type is `trial` */
        fun trialAmountDiscount(trialAmountDiscount: JsonField<String>) = apply {
            this.trialAmountDiscount = trialAmountDiscount
        }

        /** Only available if discount_type is `trial` */
        fun trialPercentageDiscount(trialPercentageDiscount: Double?) =
            trialPercentageDiscount(JsonField.ofNullable(trialPercentageDiscount))

        /** Only available if discount_type is `trial` */
        fun trialPercentageDiscount(trialPercentageDiscount: Double) =
            trialPercentageDiscount(trialPercentageDiscount as Double?)

        /** Only available if discount_type is `trial` */
        fun trialPercentageDiscount(trialPercentageDiscount: JsonField<Double>) = apply {
            this.trialPercentageDiscount = trialPercentageDiscount
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

        fun build(): TrialDiscount =
            TrialDiscount(
                checkRequired("appliesToPriceIds", appliesToPriceIds).map { it.toImmutable() },
                checkRequired("discountType", discountType),
                reason,
                trialAmountDiscount,
                trialPercentageDiscount,
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

            val TRIAL = of("trial")

            fun of(value: String) = DiscountType(JsonField.of(value))
        }

        /** An enum containing [DiscountType]'s known values. */
        enum class Known {
            TRIAL
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
            TRIAL,
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
                TRIAL -> Value.TRIAL
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
                TRIAL -> Known.TRIAL
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

        return /* spotless:off */ other is TrialDiscount && appliesToPriceIds == other.appliesToPriceIds && discountType == other.discountType && reason == other.reason && trialAmountDiscount == other.trialAmountDiscount && trialPercentageDiscount == other.trialPercentageDiscount && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(appliesToPriceIds, discountType, reason, trialAmountDiscount, trialPercentageDiscount, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TrialDiscount{appliesToPriceIds=$appliesToPriceIds, discountType=$discountType, reason=$reason, trialAmountDiscount=$trialAmountDiscount, trialPercentageDiscount=$trialPercentageDiscount, additionalProperties=$additionalProperties}"
}
