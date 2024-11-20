// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.withorb.api.core.Enum
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.util.Objects

@JsonDeserialize(builder = TrialDiscount.Builder::class)
@NoAutoDetect
class TrialDiscount
private constructor(
    private val discountType: JsonField<DiscountType>,
    private val appliesToPriceIds: JsonField<List<String>>,
    private val reason: JsonField<String>,
    private val trialAmountDiscount: JsonField<String>,
    private val trialPercentageDiscount: JsonField<Double>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun discountType(): DiscountType = discountType.getRequired("discount_type")

    /**
     * List of price_ids that this discount applies to. For plan/plan phase discounts, this can be a
     * subset of prices.
     */
    fun appliesToPriceIds(): List<String> = appliesToPriceIds.getRequired("applies_to_price_ids")

    fun reason(): String? = reason.getNullable("reason")

    /** Only available if discount_type is `trial` */
    fun trialAmountDiscount(): String? = trialAmountDiscount.getNullable("trial_amount_discount")

    /** Only available if discount_type is `trial` */
    fun trialPercentageDiscount(): Double? =
        trialPercentageDiscount.getNullable("trial_percentage_discount")

    @JsonProperty("discount_type") @ExcludeMissing fun _discountType() = discountType

    /**
     * List of price_ids that this discount applies to. For plan/plan phase discounts, this can be a
     * subset of prices.
     */
    @JsonProperty("applies_to_price_ids")
    @ExcludeMissing
    fun _appliesToPriceIds() = appliesToPriceIds

    @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

    /** Only available if discount_type is `trial` */
    @JsonProperty("trial_amount_discount")
    @ExcludeMissing
    fun _trialAmountDiscount() = trialAmountDiscount

    /** Only available if discount_type is `trial` */
    @JsonProperty("trial_percentage_discount")
    @ExcludeMissing
    fun _trialPercentageDiscount() = trialPercentageDiscount

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): TrialDiscount = apply {
        if (!validated) {
            discountType()
            appliesToPriceIds()
            reason()
            trialAmountDiscount()
            trialPercentageDiscount()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var discountType: JsonField<DiscountType> = JsonMissing.of()
        private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
        private var reason: JsonField<String> = JsonMissing.of()
        private var trialAmountDiscount: JsonField<String> = JsonMissing.of()
        private var trialPercentageDiscount: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(trialDiscount: TrialDiscount) = apply {
            this.discountType = trialDiscount.discountType
            this.appliesToPriceIds = trialDiscount.appliesToPriceIds
            this.reason = trialDiscount.reason
            this.trialAmountDiscount = trialDiscount.trialAmountDiscount
            this.trialPercentageDiscount = trialDiscount.trialPercentageDiscount
            additionalProperties(trialDiscount.additionalProperties)
        }

        fun discountType(discountType: DiscountType) = discountType(JsonField.of(discountType))

        @JsonProperty("discount_type")
        @ExcludeMissing
        fun discountType(discountType: JsonField<DiscountType>) = apply {
            this.discountType = discountType
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
        @JsonProperty("applies_to_price_ids")
        @ExcludeMissing
        fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
            this.appliesToPriceIds = appliesToPriceIds
        }

        fun reason(reason: String) = reason(JsonField.of(reason))

        @JsonProperty("reason")
        @ExcludeMissing
        fun reason(reason: JsonField<String>) = apply { this.reason = reason }

        /** Only available if discount_type is `trial` */
        fun trialAmountDiscount(trialAmountDiscount: String) =
            trialAmountDiscount(JsonField.of(trialAmountDiscount))

        /** Only available if discount_type is `trial` */
        @JsonProperty("trial_amount_discount")
        @ExcludeMissing
        fun trialAmountDiscount(trialAmountDiscount: JsonField<String>) = apply {
            this.trialAmountDiscount = trialAmountDiscount
        }

        /** Only available if discount_type is `trial` */
        fun trialPercentageDiscount(trialPercentageDiscount: Double) =
            trialPercentageDiscount(JsonField.of(trialPercentageDiscount))

        /** Only available if discount_type is `trial` */
        @JsonProperty("trial_percentage_discount")
        @ExcludeMissing
        fun trialPercentageDiscount(trialPercentageDiscount: JsonField<Double>) = apply {
            this.trialPercentageDiscount = trialPercentageDiscount
        }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            this.additionalProperties.putAll(additionalProperties)
        }

        @JsonAnySetter
        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            this.additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun build(): TrialDiscount =
            TrialDiscount(
                discountType,
                appliesToPriceIds.map { it.toImmutable() },
                reason,
                trialAmountDiscount,
                trialPercentageDiscount,
                additionalProperties.toImmutable(),
            )
    }

    class DiscountType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DiscountType && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val TRIAL = DiscountType(JsonField.of("trial"))

            fun of(value: String) = DiscountType(JsonField.of(value))
        }

        enum class Known {
            TRIAL,
        }

        enum class Value {
            TRIAL,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                TRIAL -> Value.TRIAL
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                TRIAL -> Known.TRIAL
                else -> throw OrbInvalidDataException("Unknown DiscountType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TrialDiscount && this.discountType == other.discountType && this.appliesToPriceIds == other.appliesToPriceIds && this.reason == other.reason && this.trialAmountDiscount == other.trialAmountDiscount && this.trialPercentageDiscount == other.trialPercentageDiscount && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(discountType, appliesToPriceIds, reason, trialAmountDiscount, trialPercentageDiscount, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "TrialDiscount{discountType=$discountType, appliesToPriceIds=$appliesToPriceIds, reason=$reason, trialAmountDiscount=$trialAmountDiscount, trialPercentageDiscount=$trialPercentageDiscount, additionalProperties=$additionalProperties}"
}
