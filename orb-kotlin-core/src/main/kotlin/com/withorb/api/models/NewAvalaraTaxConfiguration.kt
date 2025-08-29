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

class NewAvalaraTaxConfiguration
private constructor(
    private val taxExempt: JsonField<Boolean>,
    private val taxProvider: JsonField<TaxProvider>,
    private val taxExemptionCode: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("tax_exempt")
        @ExcludeMissing
        taxExempt: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("tax_provider")
        @ExcludeMissing
        taxProvider: JsonField<TaxProvider> = JsonMissing.of(),
        @JsonProperty("tax_exemption_code")
        @ExcludeMissing
        taxExemptionCode: JsonField<String> = JsonMissing.of(),
    ) : this(taxExempt, taxProvider, taxExemptionCode, mutableMapOf())

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun taxExempt(): Boolean = taxExempt.getRequired("tax_exempt")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun taxProvider(): TaxProvider = taxProvider.getRequired("tax_provider")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun taxExemptionCode(): String? = taxExemptionCode.getNullable("tax_exemption_code")

    /**
     * Returns the raw JSON value of [taxExempt].
     *
     * Unlike [taxExempt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tax_exempt") @ExcludeMissing fun _taxExempt(): JsonField<Boolean> = taxExempt

    /**
     * Returns the raw JSON value of [taxProvider].
     *
     * Unlike [taxProvider], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tax_provider")
    @ExcludeMissing
    fun _taxProvider(): JsonField<TaxProvider> = taxProvider

    /**
     * Returns the raw JSON value of [taxExemptionCode].
     *
     * Unlike [taxExemptionCode], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("tax_exemption_code")
    @ExcludeMissing
    fun _taxExemptionCode(): JsonField<String> = taxExemptionCode

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
         * Returns a mutable builder for constructing an instance of [NewAvalaraTaxConfiguration].
         *
         * The following fields are required:
         * ```kotlin
         * .taxExempt()
         * .taxProvider()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [NewAvalaraTaxConfiguration]. */
    class Builder internal constructor() {

        private var taxExempt: JsonField<Boolean>? = null
        private var taxProvider: JsonField<TaxProvider>? = null
        private var taxExemptionCode: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(newAvalaraTaxConfiguration: NewAvalaraTaxConfiguration) = apply {
            taxExempt = newAvalaraTaxConfiguration.taxExempt
            taxProvider = newAvalaraTaxConfiguration.taxProvider
            taxExemptionCode = newAvalaraTaxConfiguration.taxExemptionCode
            additionalProperties = newAvalaraTaxConfiguration.additionalProperties.toMutableMap()
        }

        fun taxExempt(taxExempt: Boolean) = taxExempt(JsonField.of(taxExempt))

        /**
         * Sets [Builder.taxExempt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.taxExempt] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun taxExempt(taxExempt: JsonField<Boolean>) = apply { this.taxExempt = taxExempt }

        fun taxProvider(taxProvider: TaxProvider) = taxProvider(JsonField.of(taxProvider))

        /**
         * Sets [Builder.taxProvider] to an arbitrary JSON value.
         *
         * You should usually call [Builder.taxProvider] with a well-typed [TaxProvider] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun taxProvider(taxProvider: JsonField<TaxProvider>) = apply {
            this.taxProvider = taxProvider
        }

        fun taxExemptionCode(taxExemptionCode: String?) =
            taxExemptionCode(JsonField.ofNullable(taxExemptionCode))

        /**
         * Sets [Builder.taxExemptionCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.taxExemptionCode] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun taxExemptionCode(taxExemptionCode: JsonField<String>) = apply {
            this.taxExemptionCode = taxExemptionCode
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
         * Returns an immutable instance of [NewAvalaraTaxConfiguration].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .taxExempt()
         * .taxProvider()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): NewAvalaraTaxConfiguration =
            NewAvalaraTaxConfiguration(
                checkRequired("taxExempt", taxExempt),
                checkRequired("taxProvider", taxProvider),
                taxExemptionCode,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): NewAvalaraTaxConfiguration = apply {
        if (validated) {
            return@apply
        }

        taxExempt()
        taxProvider().validate()
        taxExemptionCode()
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
        (if (taxExempt.asKnown() == null) 0 else 1) +
            (taxProvider.asKnown()?.validity() ?: 0) +
            (if (taxExemptionCode.asKnown() == null) 0 else 1)

    class TaxProvider @JsonCreator private constructor(private val value: JsonField<String>) :
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

            val AVALARA = of("avalara")

            fun of(value: String) = TaxProvider(JsonField.of(value))
        }

        /** An enum containing [TaxProvider]'s known values. */
        enum class Known {
            AVALARA
        }

        /**
         * An enum containing [TaxProvider]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [TaxProvider] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AVALARA,
            /**
             * An enum member indicating that [TaxProvider] was instantiated with an unknown value.
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
                AVALARA -> Value.AVALARA
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
                AVALARA -> Known.AVALARA
                else -> throw OrbInvalidDataException("Unknown TaxProvider: $value")
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

        fun validate(): TaxProvider = apply {
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

            return other is TaxProvider && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is NewAvalaraTaxConfiguration &&
            taxExempt == other.taxExempt &&
            taxProvider == other.taxProvider &&
            taxExemptionCode == other.taxExemptionCode &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(taxExempt, taxProvider, taxExemptionCode, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "NewAvalaraTaxConfiguration{taxExempt=$taxExempt, taxProvider=$taxProvider, taxExemptionCode=$taxExemptionCode, additionalProperties=$additionalProperties}"
}
