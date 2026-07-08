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

class AccountingProviderConfig
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val externalProviderId: JsonField<String>,
    private val providerType: JsonField<ProviderType>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("external_provider_id")
        @ExcludeMissing
        externalProviderId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("provider_type")
        @ExcludeMissing
        providerType: JsonField<ProviderType> = JsonMissing.of(),
    ) : this(externalProviderId, providerType, mutableMapOf())

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun externalProviderId(): String = externalProviderId.getRequired("external_provider_id")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun providerType(): ProviderType = providerType.getRequired("provider_type")

    /**
     * Returns the raw JSON value of [externalProviderId].
     *
     * Unlike [externalProviderId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("external_provider_id")
    @ExcludeMissing
    fun _externalProviderId(): JsonField<String> = externalProviderId

    /**
     * Returns the raw JSON value of [providerType].
     *
     * Unlike [providerType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("provider_type")
    @ExcludeMissing
    fun _providerType(): JsonField<ProviderType> = providerType

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
         * Returns a mutable builder for constructing an instance of [AccountingProviderConfig].
         *
         * The following fields are required:
         * ```kotlin
         * .externalProviderId()
         * .providerType()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [AccountingProviderConfig]. */
    class Builder internal constructor() {

        private var externalProviderId: JsonField<String>? = null
        private var providerType: JsonField<ProviderType>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(accountingProviderConfig: AccountingProviderConfig) = apply {
            externalProviderId = accountingProviderConfig.externalProviderId
            providerType = accountingProviderConfig.providerType
            additionalProperties = accountingProviderConfig.additionalProperties.toMutableMap()
        }

        fun externalProviderId(externalProviderId: String) =
            externalProviderId(JsonField.of(externalProviderId))

        /**
         * Sets [Builder.externalProviderId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalProviderId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun externalProviderId(externalProviderId: JsonField<String>) = apply {
            this.externalProviderId = externalProviderId
        }

        fun providerType(providerType: ProviderType) = providerType(JsonField.of(providerType))

        /**
         * Sets [Builder.providerType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.providerType] with a well-typed [ProviderType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun providerType(providerType: JsonField<ProviderType>) = apply {
            this.providerType = providerType
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
         * Returns an immutable instance of [AccountingProviderConfig].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .externalProviderId()
         * .providerType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AccountingProviderConfig =
            AccountingProviderConfig(
                checkRequired("externalProviderId", externalProviderId),
                checkRequired("providerType", providerType),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws OrbInvalidDataException if any value type in this object doesn't match its expected
     *   type.
     */
    fun validate(): AccountingProviderConfig = apply {
        if (validated) {
            return@apply
        }

        externalProviderId()
        providerType().validate()
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
        (if (externalProviderId.asKnown() == null) 0 else 1) +
            (providerType.asKnown()?.validity() ?: 0)

    class ProviderType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            val QUICKBOOKS = of("quickbooks")

            val NETSUITE = of("netsuite")

            fun of(value: String) = ProviderType(JsonField.of(value))
        }

        /** An enum containing [ProviderType]'s known values. */
        enum class Known {
            QUICKBOOKS,
            NETSUITE,
        }

        /**
         * An enum containing [ProviderType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ProviderType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            QUICKBOOKS,
            NETSUITE,
            /**
             * An enum member indicating that [ProviderType] was instantiated with an unknown value.
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
                QUICKBOOKS -> Value.QUICKBOOKS
                NETSUITE -> Value.NETSUITE
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
                QUICKBOOKS -> Known.QUICKBOOKS
                NETSUITE -> Known.NETSUITE
                else -> throw OrbInvalidDataException("Unknown ProviderType: $value")
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws OrbInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): ProviderType = apply {
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

            return other is ProviderType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AccountingProviderConfig &&
            externalProviderId == other.externalProviderId &&
            providerType == other.providerType &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(externalProviderId, providerType, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AccountingProviderConfig{externalProviderId=$externalProviderId, providerType=$providerType, additionalProperties=$additionalProperties}"
}
