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

class TieredConversionRateConfig
private constructor(
    private val conversionRateType: JsonField<ConversionRateType>,
    private val tieredConfig: JsonField<ConversionRateTieredConfig>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("conversion_rate_type")
        @ExcludeMissing
        conversionRateType: JsonField<ConversionRateType> = JsonMissing.of(),
        @JsonProperty("tiered_config")
        @ExcludeMissing
        tieredConfig: JsonField<ConversionRateTieredConfig> = JsonMissing.of(),
    ) : this(conversionRateType, tieredConfig, mutableMapOf())

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun conversionRateType(): ConversionRateType =
        conversionRateType.getRequired("conversion_rate_type")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tieredConfig(): ConversionRateTieredConfig = tieredConfig.getRequired("tiered_config")

    /**
     * Returns the raw JSON value of [conversionRateType].
     *
     * Unlike [conversionRateType], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("conversion_rate_type")
    @ExcludeMissing
    fun _conversionRateType(): JsonField<ConversionRateType> = conversionRateType

    /**
     * Returns the raw JSON value of [tieredConfig].
     *
     * Unlike [tieredConfig], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tiered_config")
    @ExcludeMissing
    fun _tieredConfig(): JsonField<ConversionRateTieredConfig> = tieredConfig

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
         * Returns a mutable builder for constructing an instance of [TieredConversionRateConfig].
         *
         * The following fields are required:
         * ```kotlin
         * .conversionRateType()
         * .tieredConfig()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [TieredConversionRateConfig]. */
    class Builder internal constructor() {

        private var conversionRateType: JsonField<ConversionRateType>? = null
        private var tieredConfig: JsonField<ConversionRateTieredConfig>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(tieredConversionRateConfig: TieredConversionRateConfig) = apply {
            conversionRateType = tieredConversionRateConfig.conversionRateType
            tieredConfig = tieredConversionRateConfig.tieredConfig
            additionalProperties = tieredConversionRateConfig.additionalProperties.toMutableMap()
        }

        fun conversionRateType(conversionRateType: ConversionRateType) =
            conversionRateType(JsonField.of(conversionRateType))

        /**
         * Sets [Builder.conversionRateType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.conversionRateType] with a well-typed
         * [ConversionRateType] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun conversionRateType(conversionRateType: JsonField<ConversionRateType>) = apply {
            this.conversionRateType = conversionRateType
        }

        fun tieredConfig(tieredConfig: ConversionRateTieredConfig) =
            tieredConfig(JsonField.of(tieredConfig))

        /**
         * Sets [Builder.tieredConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tieredConfig] with a well-typed
         * [ConversionRateTieredConfig] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun tieredConfig(tieredConfig: JsonField<ConversionRateTieredConfig>) = apply {
            this.tieredConfig = tieredConfig
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
         * Returns an immutable instance of [TieredConversionRateConfig].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .conversionRateType()
         * .tieredConfig()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TieredConversionRateConfig =
            TieredConversionRateConfig(
                checkRequired("conversionRateType", conversionRateType),
                checkRequired("tieredConfig", tieredConfig),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): TieredConversionRateConfig = apply {
        if (validated) {
            return@apply
        }

        conversionRateType().validate()
        tieredConfig().validate()
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
        (conversionRateType.asKnown()?.validity() ?: 0) + (tieredConfig.asKnown()?.validity() ?: 0)

    class ConversionRateType
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            val TIERED = of("tiered")

            fun of(value: String) = ConversionRateType(JsonField.of(value))
        }

        /** An enum containing [ConversionRateType]'s known values. */
        enum class Known {
            TIERED
        }

        /**
         * An enum containing [ConversionRateType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ConversionRateType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TIERED,
            /**
             * An enum member indicating that [ConversionRateType] was instantiated with an unknown
             * value.
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
                TIERED -> Value.TIERED
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
                TIERED -> Known.TIERED
                else -> throw OrbInvalidDataException("Unknown ConversionRateType: $value")
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

        fun validate(): ConversionRateType = apply {
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

            return /* spotless:off */ other is ConversionRateType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TieredConversionRateConfig && conversionRateType == other.conversionRateType && tieredConfig == other.tieredConfig && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(conversionRateType, tieredConfig, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TieredConversionRateConfig{conversionRateType=$conversionRateType, tieredConfig=$tieredConfig, additionalProperties=$additionalProperties}"
}
