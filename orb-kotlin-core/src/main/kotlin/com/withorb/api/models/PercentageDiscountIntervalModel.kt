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
import com.withorb.api.core.checkKnown
import com.withorb.api.core.checkRequired
import com.withorb.api.core.immutableEmptyMap
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

@NoAutoDetect
class PercentageDiscountIntervalModel
@JsonCreator
private constructor(
    @JsonProperty("applies_to_price_ids")
    @ExcludeMissing
    private val appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("applies_to_price_interval_ids")
    @ExcludeMissing
    private val appliesToPriceIntervalIds: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("discount_type")
    @ExcludeMissing
    private val discountType: JsonField<DiscountType> = JsonMissing.of(),
    @JsonProperty("end_date")
    @ExcludeMissing
    private val endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("percentage_discount")
    @ExcludeMissing
    private val percentageDiscount: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("start_date")
    @ExcludeMissing
    private val startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The price ids that this discount interval applies to. */
    fun appliesToPriceIds(): List<String> = appliesToPriceIds.getRequired("applies_to_price_ids")

    /** The price interval ids that this discount interval applies to. */
    fun appliesToPriceIntervalIds(): List<String> =
        appliesToPriceIntervalIds.getRequired("applies_to_price_interval_ids")

    fun discountType(): DiscountType = discountType.getRequired("discount_type")

    /** The end date of the discount interval. */
    fun endDate(): OffsetDateTime? = endDate.getNullable("end_date")

    /** Only available if discount_type is `percentage`.This is a number between 0 and 1. */
    fun percentageDiscount(): Double = percentageDiscount.getRequired("percentage_discount")

    /** The start date of the discount interval. */
    fun startDate(): OffsetDateTime = startDate.getRequired("start_date")

    /** The price ids that this discount interval applies to. */
    @JsonProperty("applies_to_price_ids")
    @ExcludeMissing
    fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

    /** The price interval ids that this discount interval applies to. */
    @JsonProperty("applies_to_price_interval_ids")
    @ExcludeMissing
    fun _appliesToPriceIntervalIds(): JsonField<List<String>> = appliesToPriceIntervalIds

    @JsonProperty("discount_type")
    @ExcludeMissing
    fun _discountType(): JsonField<DiscountType> = discountType

    /** The end date of the discount interval. */
    @JsonProperty("end_date") @ExcludeMissing fun _endDate(): JsonField<OffsetDateTime> = endDate

    /** Only available if discount_type is `percentage`.This is a number between 0 and 1. */
    @JsonProperty("percentage_discount")
    @ExcludeMissing
    fun _percentageDiscount(): JsonField<Double> = percentageDiscount

    /** The start date of the discount interval. */
    @JsonProperty("start_date")
    @ExcludeMissing
    fun _startDate(): JsonField<OffsetDateTime> = startDate

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): PercentageDiscountIntervalModel = apply {
        if (validated) {
            return@apply
        }

        appliesToPriceIds()
        appliesToPriceIntervalIds()
        discountType()
        endDate()
        percentageDiscount()
        startDate()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [PercentageDiscountIntervalModel].
         *
         * The following fields are required:
         * ```kotlin
         * .appliesToPriceIds()
         * .appliesToPriceIntervalIds()
         * .discountType()
         * .endDate()
         * .percentageDiscount()
         * .startDate()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [PercentageDiscountIntervalModel]. */
    class Builder internal constructor() {

        private var appliesToPriceIds: JsonField<MutableList<String>>? = null
        private var appliesToPriceIntervalIds: JsonField<MutableList<String>>? = null
        private var discountType: JsonField<DiscountType>? = null
        private var endDate: JsonField<OffsetDateTime>? = null
        private var percentageDiscount: JsonField<Double>? = null
        private var startDate: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(percentageDiscountIntervalModel: PercentageDiscountIntervalModel) =
            apply {
                appliesToPriceIds =
                    percentageDiscountIntervalModel.appliesToPriceIds.map { it.toMutableList() }
                appliesToPriceIntervalIds =
                    percentageDiscountIntervalModel.appliesToPriceIntervalIds.map {
                        it.toMutableList()
                    }
                discountType = percentageDiscountIntervalModel.discountType
                endDate = percentageDiscountIntervalModel.endDate
                percentageDiscount = percentageDiscountIntervalModel.percentageDiscount
                startDate = percentageDiscountIntervalModel.startDate
                additionalProperties =
                    percentageDiscountIntervalModel.additionalProperties.toMutableMap()
            }

        /** The price ids that this discount interval applies to. */
        fun appliesToPriceIds(appliesToPriceIds: List<String>) =
            appliesToPriceIds(JsonField.of(appliesToPriceIds))

        /** The price ids that this discount interval applies to. */
        fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
            this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
        }

        /** The price ids that this discount interval applies to. */
        fun addAppliesToPriceId(appliesToPriceId: String) = apply {
            appliesToPriceIds =
                (appliesToPriceIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("appliesToPriceIds", it).add(appliesToPriceId)
                }
        }

        /** The price interval ids that this discount interval applies to. */
        fun appliesToPriceIntervalIds(appliesToPriceIntervalIds: List<String>) =
            appliesToPriceIntervalIds(JsonField.of(appliesToPriceIntervalIds))

        /** The price interval ids that this discount interval applies to. */
        fun appliesToPriceIntervalIds(appliesToPriceIntervalIds: JsonField<List<String>>) = apply {
            this.appliesToPriceIntervalIds = appliesToPriceIntervalIds.map { it.toMutableList() }
        }

        /** The price interval ids that this discount interval applies to. */
        fun addAppliesToPriceIntervalId(appliesToPriceIntervalId: String) = apply {
            appliesToPriceIntervalIds =
                (appliesToPriceIntervalIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("appliesToPriceIntervalIds", it).add(appliesToPriceIntervalId)
                }
        }

        fun discountType(discountType: DiscountType) = discountType(JsonField.of(discountType))

        fun discountType(discountType: JsonField<DiscountType>) = apply {
            this.discountType = discountType
        }

        /** The end date of the discount interval. */
        fun endDate(endDate: OffsetDateTime?) = endDate(JsonField.ofNullable(endDate))

        /** The end date of the discount interval. */
        fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

        /** Only available if discount_type is `percentage`.This is a number between 0 and 1. */
        fun percentageDiscount(percentageDiscount: Double) =
            percentageDiscount(JsonField.of(percentageDiscount))

        /** Only available if discount_type is `percentage`.This is a number between 0 and 1. */
        fun percentageDiscount(percentageDiscount: JsonField<Double>) = apply {
            this.percentageDiscount = percentageDiscount
        }

        /** The start date of the discount interval. */
        fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

        /** The start date of the discount interval. */
        fun startDate(startDate: JsonField<OffsetDateTime>) = apply { this.startDate = startDate }

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

        fun build(): PercentageDiscountIntervalModel =
            PercentageDiscountIntervalModel(
                checkRequired("appliesToPriceIds", appliesToPriceIds).map { it.toImmutable() },
                checkRequired("appliesToPriceIntervalIds", appliesToPriceIntervalIds).map {
                    it.toImmutable()
                },
                checkRequired("discountType", discountType),
                checkRequired("endDate", endDate),
                checkRequired("percentageDiscount", percentageDiscount),
                checkRequired("startDate", startDate),
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

            fun of(value: String) = DiscountType(JsonField.of(value))
        }

        /** An enum containing [DiscountType]'s known values. */
        enum class Known {
            PERCENTAGE
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

        return /* spotless:off */ other is PercentageDiscountIntervalModel && appliesToPriceIds == other.appliesToPriceIds && appliesToPriceIntervalIds == other.appliesToPriceIntervalIds && discountType == other.discountType && endDate == other.endDate && percentageDiscount == other.percentageDiscount && startDate == other.startDate && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(appliesToPriceIds, appliesToPriceIntervalIds, discountType, endDate, percentageDiscount, startDate, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PercentageDiscountIntervalModel{appliesToPriceIds=$appliesToPriceIds, appliesToPriceIntervalIds=$appliesToPriceIntervalIds, discountType=$discountType, endDate=$endDate, percentageDiscount=$percentageDiscount, startDate=$startDate, additionalProperties=$additionalProperties}"
}
