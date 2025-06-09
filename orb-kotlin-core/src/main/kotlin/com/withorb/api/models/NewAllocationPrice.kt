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

class NewAllocationPrice
private constructor(
    private val amount: JsonField<String>,
    private val cadence: JsonField<Cadence>,
    private val currency: JsonField<String>,
    private val customExpiration: JsonField<CustomExpiration>,
    private val expiresAtEndOfCadence: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("amount") @ExcludeMissing amount: JsonField<String> = JsonMissing.of(),
        @JsonProperty("cadence") @ExcludeMissing cadence: JsonField<Cadence> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("custom_expiration")
        @ExcludeMissing
        customExpiration: JsonField<CustomExpiration> = JsonMissing.of(),
        @JsonProperty("expires_at_end_of_cadence")
        @ExcludeMissing
        expiresAtEndOfCadence: JsonField<Boolean> = JsonMissing.of(),
    ) : this(amount, cadence, currency, customExpiration, expiresAtEndOfCadence, mutableMapOf())

    /**
     * An amount of the currency to allocate to the customer at the specified cadence.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): String = amount.getRequired("amount")

    /**
     * The cadence at which to allocate the amount to the customer.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun cadence(): Cadence = cadence.getRequired("cadence")

    /**
     * An ISO 4217 currency string or a custom pricing unit identifier in which to bill this price.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): String = currency.getRequired("currency")

    /**
     * The custom expiration for the allocation.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun customExpiration(): CustomExpiration? = customExpiration.getNullable("custom_expiration")

    /**
     * Whether the allocated amount should expire at the end of the cadence or roll over to the next
     * period. Set to null if using custom_expiration.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun expiresAtEndOfCadence(): Boolean? =
        expiresAtEndOfCadence.getNullable("expires_at_end_of_cadence")

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

    /**
     * Returns the raw JSON value of [cadence].
     *
     * Unlike [cadence], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cadence") @ExcludeMissing fun _cadence(): JsonField<Cadence> = cadence

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

    /**
     * Returns the raw JSON value of [customExpiration].
     *
     * Unlike [customExpiration], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("custom_expiration")
    @ExcludeMissing
    fun _customExpiration(): JsonField<CustomExpiration> = customExpiration

    /**
     * Returns the raw JSON value of [expiresAtEndOfCadence].
     *
     * Unlike [expiresAtEndOfCadence], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("expires_at_end_of_cadence")
    @ExcludeMissing
    fun _expiresAtEndOfCadence(): JsonField<Boolean> = expiresAtEndOfCadence

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
         * Returns a mutable builder for constructing an instance of [NewAllocationPrice].
         *
         * The following fields are required:
         * ```kotlin
         * .amount()
         * .cadence()
         * .currency()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [NewAllocationPrice]. */
    class Builder internal constructor() {

        private var amount: JsonField<String>? = null
        private var cadence: JsonField<Cadence>? = null
        private var currency: JsonField<String>? = null
        private var customExpiration: JsonField<CustomExpiration> = JsonMissing.of()
        private var expiresAtEndOfCadence: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(newAllocationPrice: NewAllocationPrice) = apply {
            amount = newAllocationPrice.amount
            cadence = newAllocationPrice.cadence
            currency = newAllocationPrice.currency
            customExpiration = newAllocationPrice.customExpiration
            expiresAtEndOfCadence = newAllocationPrice.expiresAtEndOfCadence
            additionalProperties = newAllocationPrice.additionalProperties.toMutableMap()
        }

        /** An amount of the currency to allocate to the customer at the specified cadence. */
        fun amount(amount: String) = amount(JsonField.of(amount))

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<String>) = apply { this.amount = amount }

        /** The cadence at which to allocate the amount to the customer. */
        fun cadence(cadence: Cadence) = cadence(JsonField.of(cadence))

        /**
         * Sets [Builder.cadence] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cadence] with a well-typed [Cadence] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cadence(cadence: JsonField<Cadence>) = apply { this.cadence = cadence }

        /**
         * An ISO 4217 currency string or a custom pricing unit identifier in which to bill this
         * price.
         */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /** The custom expiration for the allocation. */
        fun customExpiration(customExpiration: CustomExpiration?) =
            customExpiration(JsonField.ofNullable(customExpiration))

        /**
         * Sets [Builder.customExpiration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customExpiration] with a well-typed [CustomExpiration]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun customExpiration(customExpiration: JsonField<CustomExpiration>) = apply {
            this.customExpiration = customExpiration
        }

        /**
         * Whether the allocated amount should expire at the end of the cadence or roll over to the
         * next period. Set to null if using custom_expiration.
         */
        fun expiresAtEndOfCadence(expiresAtEndOfCadence: Boolean?) =
            expiresAtEndOfCadence(JsonField.ofNullable(expiresAtEndOfCadence))

        /**
         * Alias for [Builder.expiresAtEndOfCadence].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun expiresAtEndOfCadence(expiresAtEndOfCadence: Boolean) =
            expiresAtEndOfCadence(expiresAtEndOfCadence as Boolean?)

        /**
         * Sets [Builder.expiresAtEndOfCadence] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiresAtEndOfCadence] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
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

        /**
         * Returns an immutable instance of [NewAllocationPrice].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .amount()
         * .cadence()
         * .currency()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): NewAllocationPrice =
            NewAllocationPrice(
                checkRequired("amount", amount),
                checkRequired("cadence", cadence),
                checkRequired("currency", currency),
                customExpiration,
                expiresAtEndOfCadence,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): NewAllocationPrice = apply {
        if (validated) {
            return@apply
        }

        amount()
        cadence().validate()
        currency()
        customExpiration()?.validate()
        expiresAtEndOfCadence()
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
        (if (amount.asKnown() == null) 0 else 1) +
            (cadence.asKnown()?.validity() ?: 0) +
            (if (currency.asKnown() == null) 0 else 1) +
            (customExpiration.asKnown()?.validity() ?: 0) +
            (if (expiresAtEndOfCadence.asKnown() == null) 0 else 1)

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

        private var validated: Boolean = false

        fun validate(): Cadence = apply {
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

            return /* spotless:off */ other is Cadence && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is NewAllocationPrice && amount == other.amount && cadence == other.cadence && currency == other.currency && customExpiration == other.customExpiration && expiresAtEndOfCadence == other.expiresAtEndOfCadence && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(amount, cadence, currency, customExpiration, expiresAtEndOfCadence, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "NewAllocationPrice{amount=$amount, cadence=$cadence, currency=$currency, customExpiration=$customExpiration, expiresAtEndOfCadence=$expiresAtEndOfCadence, additionalProperties=$additionalProperties}"
}
