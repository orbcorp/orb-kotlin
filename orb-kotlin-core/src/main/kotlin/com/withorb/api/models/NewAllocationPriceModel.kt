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
class NewAllocationPriceModel
@JsonCreator
private constructor(
    @JsonProperty("amount")
    @ExcludeMissing
    private val amount: JsonField<String> = JsonMissing.of(),
    @JsonProperty("cadence")
    @ExcludeMissing
    private val cadence: JsonField<Cadence> = JsonMissing.of(),
    @JsonProperty("currency")
    @ExcludeMissing
    private val currency: JsonField<String> = JsonMissing.of(),
    @JsonProperty("expires_at_end_of_cadence")
    @ExcludeMissing
    private val expiresAtEndOfCadence: JsonField<Boolean> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** An amount of the currency to allocate to the customer at the specified cadence. */
    fun amount(): String = amount.getRequired("amount")

    /** The cadence at which to allocate the amount to the customer. */
    fun cadence(): Cadence = cadence.getRequired("cadence")

    /**
     * An ISO 4217 currency string or a custom pricing unit identifier in which to bill this price.
     */
    fun currency(): String = currency.getRequired("currency")

    /**
     * Whether the allocated amount should expire at the end of the cadence or roll over to the next
     * period.
     */
    fun expiresAtEndOfCadence(): Boolean =
        expiresAtEndOfCadence.getRequired("expires_at_end_of_cadence")

    /** An amount of the currency to allocate to the customer at the specified cadence. */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

    /** The cadence at which to allocate the amount to the customer. */
    @JsonProperty("cadence") @ExcludeMissing fun _cadence(): JsonField<Cadence> = cadence

    /**
     * An ISO 4217 currency string or a custom pricing unit identifier in which to bill this price.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

    /**
     * Whether the allocated amount should expire at the end of the cadence or roll over to the next
     * period.
     */
    @JsonProperty("expires_at_end_of_cadence")
    @ExcludeMissing
    fun _expiresAtEndOfCadence(): JsonField<Boolean> = expiresAtEndOfCadence

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): NewAllocationPriceModel = apply {
        if (validated) {
            return@apply
        }

        amount()
        cadence()
        currency()
        expiresAtEndOfCadence()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [NewAllocationPriceModel].
         *
         * The following fields are required:
         * ```kotlin
         * .amount()
         * .cadence()
         * .currency()
         * .expiresAtEndOfCadence()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [NewAllocationPriceModel]. */
    class Builder internal constructor() {

        private var amount: JsonField<String>? = null
        private var cadence: JsonField<Cadence>? = null
        private var currency: JsonField<String>? = null
        private var expiresAtEndOfCadence: JsonField<Boolean>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(newAllocationPriceModel: NewAllocationPriceModel) = apply {
            amount = newAllocationPriceModel.amount
            cadence = newAllocationPriceModel.cadence
            currency = newAllocationPriceModel.currency
            expiresAtEndOfCadence = newAllocationPriceModel.expiresAtEndOfCadence
            additionalProperties = newAllocationPriceModel.additionalProperties.toMutableMap()
        }

        /** An amount of the currency to allocate to the customer at the specified cadence. */
        fun amount(amount: String) = amount(JsonField.of(amount))

        /** An amount of the currency to allocate to the customer at the specified cadence. */
        fun amount(amount: JsonField<String>) = apply { this.amount = amount }

        /** The cadence at which to allocate the amount to the customer. */
        fun cadence(cadence: Cadence) = cadence(JsonField.of(cadence))

        /** The cadence at which to allocate the amount to the customer. */
        fun cadence(cadence: JsonField<Cadence>) = apply { this.cadence = cadence }

        /**
         * An ISO 4217 currency string or a custom pricing unit identifier in which to bill this
         * price.
         */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /**
         * An ISO 4217 currency string or a custom pricing unit identifier in which to bill this
         * price.
         */
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /**
         * Whether the allocated amount should expire at the end of the cadence or roll over to the
         * next period.
         */
        fun expiresAtEndOfCadence(expiresAtEndOfCadence: Boolean) =
            expiresAtEndOfCadence(JsonField.of(expiresAtEndOfCadence))

        /**
         * Whether the allocated amount should expire at the end of the cadence or roll over to the
         * next period.
         */
        fun expiresAtEndOfCadence(expiresAtEndOfCadence: JsonField<Boolean>) = apply {
            this.expiresAtEndOfCadence = expiresAtEndOfCadence
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

        fun build(): NewAllocationPriceModel =
            NewAllocationPriceModel(
                checkRequired("amount", amount),
                checkRequired("cadence", cadence),
                checkRequired("currency", currency),
                checkRequired("expiresAtEndOfCadence", expiresAtEndOfCadence),
                additionalProperties.toImmutable(),
            )
    }

    /** The cadence at which to allocate the amount to the customer. */
    class Cadence @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val ONE_TIME = of("one_time")

            val MONTHLY = of("monthly")

            val QUARTERLY = of("quarterly")

            val SEMI_ANNUAL = of("semi_annual")

            val ANNUAL = of("annual")

            val CUSTOM = of("custom")

            fun of(value: String) = Cadence(JsonField.of(value))
        }

        /** An enum containing [Cadence]'s known values. */
        enum class Known {
            ONE_TIME,
            MONTHLY,
            QUARTERLY,
            SEMI_ANNUAL,
            ANNUAL,
            CUSTOM,
        }

        /**
         * An enum containing [Cadence]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Cadence] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ONE_TIME,
            MONTHLY,
            QUARTERLY,
            SEMI_ANNUAL,
            ANNUAL,
            CUSTOM,
            /** An enum member indicating that [Cadence] was instantiated with an unknown value. */
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
                ONE_TIME -> Value.ONE_TIME
                MONTHLY -> Value.MONTHLY
                QUARTERLY -> Value.QUARTERLY
                SEMI_ANNUAL -> Value.SEMI_ANNUAL
                ANNUAL -> Value.ANNUAL
                CUSTOM -> Value.CUSTOM
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
                ONE_TIME -> Known.ONE_TIME
                MONTHLY -> Known.MONTHLY
                QUARTERLY -> Known.QUARTERLY
                SEMI_ANNUAL -> Known.SEMI_ANNUAL
                ANNUAL -> Known.ANNUAL
                CUSTOM -> Known.CUSTOM
                else -> throw OrbInvalidDataException("Unknown Cadence: $value")
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

            return /* spotless:off */ other is Cadence && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is NewAllocationPriceModel && amount == other.amount && cadence == other.cadence && currency == other.currency && expiresAtEndOfCadence == other.expiresAtEndOfCadence && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(amount, cadence, currency, expiresAtEndOfCadence, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "NewAllocationPriceModel{amount=$amount, cadence=$cadence, currency=$currency, expiresAtEndOfCadence=$expiresAtEndOfCadence, additionalProperties=$additionalProperties}"
}
