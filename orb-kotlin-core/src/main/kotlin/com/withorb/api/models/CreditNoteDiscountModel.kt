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
import java.util.Objects

@NoAutoDetect
class CreditNoteDiscountModel
@JsonCreator
private constructor(
    @JsonProperty("amount_applied")
    @ExcludeMissing
    private val amountApplied: JsonField<String> = JsonMissing.of(),
    @JsonProperty("discount_type")
    @ExcludeMissing
    private val discountType: JsonField<DiscountType> = JsonMissing.of(),
    @JsonProperty("percentage_discount")
    @ExcludeMissing
    private val percentageDiscount: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("applies_to_prices")
    @ExcludeMissing
    private val appliesToPrices: JsonField<List<AppliesToPrice>> = JsonMissing.of(),
    @JsonProperty("reason")
    @ExcludeMissing
    private val reason: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun amountApplied(): String = amountApplied.getRequired("amount_applied")

    fun discountType(): DiscountType = discountType.getRequired("discount_type")

    fun percentageDiscount(): Double = percentageDiscount.getRequired("percentage_discount")

    fun appliesToPrices(): List<AppliesToPrice>? = appliesToPrices.getNullable("applies_to_prices")

    fun reason(): String? = reason.getNullable("reason")

    @JsonProperty("amount_applied")
    @ExcludeMissing
    fun _amountApplied(): JsonField<String> = amountApplied

    @JsonProperty("discount_type")
    @ExcludeMissing
    fun _discountType(): JsonField<DiscountType> = discountType

    @JsonProperty("percentage_discount")
    @ExcludeMissing
    fun _percentageDiscount(): JsonField<Double> = percentageDiscount

    @JsonProperty("applies_to_prices")
    @ExcludeMissing
    fun _appliesToPrices(): JsonField<List<AppliesToPrice>> = appliesToPrices

    @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): CreditNoteDiscountModel = apply {
        if (validated) {
            return@apply
        }

        amountApplied()
        discountType()
        percentageDiscount()
        appliesToPrices()?.forEach { it.validate() }
        reason()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CreditNoteDiscountModel].
         *
         * The following fields are required:
         * ```kotlin
         * .amountApplied()
         * .discountType()
         * .percentageDiscount()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [CreditNoteDiscountModel]. */
    class Builder internal constructor() {

        private var amountApplied: JsonField<String>? = null
        private var discountType: JsonField<DiscountType>? = null
        private var percentageDiscount: JsonField<Double>? = null
        private var appliesToPrices: JsonField<MutableList<AppliesToPrice>>? = null
        private var reason: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(creditNoteDiscountModel: CreditNoteDiscountModel) = apply {
            amountApplied = creditNoteDiscountModel.amountApplied
            discountType = creditNoteDiscountModel.discountType
            percentageDiscount = creditNoteDiscountModel.percentageDiscount
            appliesToPrices = creditNoteDiscountModel.appliesToPrices.map { it.toMutableList() }
            reason = creditNoteDiscountModel.reason
            additionalProperties = creditNoteDiscountModel.additionalProperties.toMutableMap()
        }

        fun amountApplied(amountApplied: String) = amountApplied(JsonField.of(amountApplied))

        fun amountApplied(amountApplied: JsonField<String>) = apply {
            this.amountApplied = amountApplied
        }

        fun discountType(discountType: DiscountType) = discountType(JsonField.of(discountType))

        fun discountType(discountType: JsonField<DiscountType>) = apply {
            this.discountType = discountType
        }

        fun percentageDiscount(percentageDiscount: Double) =
            percentageDiscount(JsonField.of(percentageDiscount))

        fun percentageDiscount(percentageDiscount: JsonField<Double>) = apply {
            this.percentageDiscount = percentageDiscount
        }

        fun appliesToPrices(appliesToPrices: List<AppliesToPrice>?) =
            appliesToPrices(JsonField.ofNullable(appliesToPrices))

        fun appliesToPrices(appliesToPrices: JsonField<List<AppliesToPrice>>) = apply {
            this.appliesToPrices = appliesToPrices.map { it.toMutableList() }
        }

        fun addAppliesToPrice(appliesToPrice: AppliesToPrice) = apply {
            appliesToPrices =
                (appliesToPrices ?: JsonField.of(mutableListOf())).also {
                    checkKnown("appliesToPrices", it).add(appliesToPrice)
                }
        }

        fun reason(reason: String?) = reason(JsonField.ofNullable(reason))

        fun reason(reason: JsonField<String>) = apply { this.reason = reason }

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

        fun build(): CreditNoteDiscountModel =
            CreditNoteDiscountModel(
                checkRequired("amountApplied", amountApplied),
                checkRequired("discountType", discountType),
                checkRequired("percentageDiscount", percentageDiscount),
                (appliesToPrices ?: JsonMissing.of()).map { it.toImmutable() },
                reason,
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

    @NoAutoDetect
    class AppliesToPrice
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun id(): String = id.getRequired("id")

        fun name(): String = name.getRequired("name")

        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): AppliesToPrice = apply {
            if (validated) {
                return@apply
            }

            id()
            name()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [AppliesToPrice].
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .name()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [AppliesToPrice]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(appliesToPrice: AppliesToPrice) = apply {
                id = appliesToPrice.id
                name = appliesToPrice.name
                additionalProperties = appliesToPrice.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            fun id(id: JsonField<String>) = apply { this.id = id }

            fun name(name: String) = name(JsonField.of(name))

            fun name(name: JsonField<String>) = apply { this.name = name }

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

            fun build(): AppliesToPrice =
                AppliesToPrice(
                    checkRequired("id", id),
                    checkRequired("name", name),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AppliesToPrice && id == other.id && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, name, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AppliesToPrice{id=$id, name=$name, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CreditNoteDiscountModel && amountApplied == other.amountApplied && discountType == other.discountType && percentageDiscount == other.percentageDiscount && appliesToPrices == other.appliesToPrices && reason == other.reason && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(amountApplied, discountType, percentageDiscount, appliesToPrices, reason, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CreditNoteDiscountModel{amountApplied=$amountApplied, discountType=$discountType, percentageDiscount=$percentageDiscount, appliesToPrices=$appliesToPrices, reason=$reason, additionalProperties=$additionalProperties}"
}
