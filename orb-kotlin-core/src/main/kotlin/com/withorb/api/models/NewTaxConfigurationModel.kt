// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.BaseDeserializer
import com.withorb.api.core.BaseSerializer
import com.withorb.api.core.Enum
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.checkRequired
import com.withorb.api.core.getOrThrow
import com.withorb.api.core.immutableEmptyMap
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.util.Objects

@JsonDeserialize(using = NewTaxConfigurationModel.Deserializer::class)
@JsonSerialize(using = NewTaxConfigurationModel.Serializer::class)
class NewTaxConfigurationModel
private constructor(
    private val avalaraTaxConfiguration: NewAvalaraTaxConfiguration? = null,
    private val jarConfiguration: NewTaxJarConfiguration? = null,
    private val _json: JsonValue? = null,
) {

    fun avalaraTaxConfiguration(): NewAvalaraTaxConfiguration? = avalaraTaxConfiguration

    fun jarConfiguration(): NewTaxJarConfiguration? = jarConfiguration

    fun isAvalaraTaxConfiguration(): Boolean = avalaraTaxConfiguration != null

    fun isJarConfiguration(): Boolean = jarConfiguration != null

    fun asAvalaraTaxConfiguration(): NewAvalaraTaxConfiguration =
        avalaraTaxConfiguration.getOrThrow("avalaraTaxConfiguration")

    fun asJarConfiguration(): NewTaxJarConfiguration =
        jarConfiguration.getOrThrow("jarConfiguration")

    fun _json(): JsonValue? = _json

    fun <T> accept(visitor: Visitor<T>): T {
        return when {
            avalaraTaxConfiguration != null ->
                visitor.visitAvalaraTaxConfiguration(avalaraTaxConfiguration)
            jarConfiguration != null -> visitor.visitJarConfiguration(jarConfiguration)
            else -> visitor.unknown(_json)
        }
    }

    private var validated: Boolean = false

    fun validate(): NewTaxConfigurationModel = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitAvalaraTaxConfiguration(
                    avalaraTaxConfiguration: NewAvalaraTaxConfiguration
                ) {
                    avalaraTaxConfiguration.validate()
                }

                override fun visitJarConfiguration(jarConfiguration: NewTaxJarConfiguration) {
                    jarConfiguration.validate()
                }
            }
        )
        validated = true
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is NewTaxConfigurationModel && avalaraTaxConfiguration == other.avalaraTaxConfiguration && jarConfiguration == other.jarConfiguration /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(avalaraTaxConfiguration, jarConfiguration) /* spotless:on */

    override fun toString(): String =
        when {
            avalaraTaxConfiguration != null ->
                "NewTaxConfigurationModel{avalaraTaxConfiguration=$avalaraTaxConfiguration}"
            jarConfiguration != null ->
                "NewTaxConfigurationModel{jarConfiguration=$jarConfiguration}"
            _json != null -> "NewTaxConfigurationModel{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid NewTaxConfigurationModel")
        }

    companion object {

        fun ofAvalaraTaxConfiguration(avalaraTaxConfiguration: NewAvalaraTaxConfiguration) =
            NewTaxConfigurationModel(avalaraTaxConfiguration = avalaraTaxConfiguration)

        fun ofJarConfiguration(jarConfiguration: NewTaxJarConfiguration) =
            NewTaxConfigurationModel(jarConfiguration = jarConfiguration)
    }

    /**
     * An interface that defines how to map each variant of [NewTaxConfigurationModel] to a value of
     * type [T].
     */
    interface Visitor<out T> {

        fun visitAvalaraTaxConfiguration(avalaraTaxConfiguration: NewAvalaraTaxConfiguration): T

        fun visitJarConfiguration(jarConfiguration: NewTaxJarConfiguration): T

        /**
         * Maps an unknown variant of [NewTaxConfigurationModel] to a value of type [T].
         *
         * An instance of [NewTaxConfigurationModel] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws OrbInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw OrbInvalidDataException("Unknown NewTaxConfigurationModel: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<NewTaxConfigurationModel>(NewTaxConfigurationModel::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): NewTaxConfigurationModel {
            val json = JsonValue.fromJsonNode(node)
            val taxProvider = json.asObject()?.get("tax_provider")?.asString()

            when (taxProvider) {
                "avalara" -> {
                    tryDeserialize(node, jacksonTypeRef<NewAvalaraTaxConfiguration>()) {
                            it.validate()
                        }
                        ?.let {
                            return NewTaxConfigurationModel(
                                avalaraTaxConfiguration = it,
                                _json = json,
                            )
                        }
                }
                "taxjar" -> {
                    tryDeserialize(node, jacksonTypeRef<NewTaxJarConfiguration>()) { it.validate() }
                        ?.let {
                            return NewTaxConfigurationModel(jarConfiguration = it, _json = json)
                        }
                }
            }

            return NewTaxConfigurationModel(_json = json)
        }
    }

    internal class Serializer :
        BaseSerializer<NewTaxConfigurationModel>(NewTaxConfigurationModel::class) {

        override fun serialize(
            value: NewTaxConfigurationModel,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.avalaraTaxConfiguration != null ->
                    generator.writeObject(value.avalaraTaxConfiguration)
                value.jarConfiguration != null -> generator.writeObject(value.jarConfiguration)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid NewTaxConfigurationModel")
            }
        }
    }

    @NoAutoDetect
    class NewAvalaraTaxConfiguration
    @JsonCreator
    private constructor(
        @JsonProperty("tax_exempt")
        @ExcludeMissing
        private val taxExempt: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("tax_provider")
        @ExcludeMissing
        private val taxProvider: JsonField<TaxProvider> = JsonMissing.of(),
        @JsonProperty("tax_exemption_code")
        @ExcludeMissing
        private val taxExemptionCode: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun taxExempt(): Boolean = taxExempt.getRequired("tax_exempt")

        fun taxProvider(): TaxProvider = taxProvider.getRequired("tax_provider")

        fun taxExemptionCode(): String? = taxExemptionCode.getNullable("tax_exemption_code")

        @JsonProperty("tax_exempt") @ExcludeMissing fun _taxExempt(): JsonField<Boolean> = taxExempt

        @JsonProperty("tax_provider")
        @ExcludeMissing
        fun _taxProvider(): JsonField<TaxProvider> = taxProvider

        @JsonProperty("tax_exemption_code")
        @ExcludeMissing
        fun _taxExemptionCode(): JsonField<String> = taxExemptionCode

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): NewAvalaraTaxConfiguration = apply {
            if (validated) {
                return@apply
            }

            taxExempt()
            taxProvider()
            taxExemptionCode()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of
             * [NewAvalaraTaxConfiguration].
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
                additionalProperties =
                    newAvalaraTaxConfiguration.additionalProperties.toMutableMap()
            }

            fun taxExempt(taxExempt: Boolean) = taxExempt(JsonField.of(taxExempt))

            fun taxExempt(taxExempt: JsonField<Boolean>) = apply { this.taxExempt = taxExempt }

            fun taxProvider(taxProvider: TaxProvider) = taxProvider(JsonField.of(taxProvider))

            fun taxProvider(taxProvider: JsonField<TaxProvider>) = apply {
                this.taxProvider = taxProvider
            }

            fun taxExemptionCode(taxExemptionCode: String?) =
                taxExemptionCode(JsonField.ofNullable(taxExemptionCode))

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

            fun build(): NewAvalaraTaxConfiguration =
                NewAvalaraTaxConfiguration(
                    checkRequired("taxExempt", taxExempt),
                    checkRequired("taxProvider", taxProvider),
                    taxExemptionCode,
                    additionalProperties.toImmutable(),
                )
        }

        class TaxProvider @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
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
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                AVALARA,
                /**
                 * An enum member indicating that [TaxProvider] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    AVALARA -> Value.AVALARA
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws OrbInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    AVALARA -> Known.AVALARA
                    else -> throw OrbInvalidDataException("Unknown TaxProvider: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws OrbInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString() ?: throw OrbInvalidDataException("Value is not a String")

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is TaxProvider && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is NewAvalaraTaxConfiguration && taxExempt == other.taxExempt && taxProvider == other.taxProvider && taxExemptionCode == other.taxExemptionCode && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(taxExempt, taxProvider, taxExemptionCode, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "NewAvalaraTaxConfiguration{taxExempt=$taxExempt, taxProvider=$taxProvider, taxExemptionCode=$taxExemptionCode, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class NewTaxJarConfiguration
    @JsonCreator
    private constructor(
        @JsonProperty("tax_exempt")
        @ExcludeMissing
        private val taxExempt: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("tax_provider")
        @ExcludeMissing
        private val taxProvider: JsonField<TaxProvider> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun taxExempt(): Boolean = taxExempt.getRequired("tax_exempt")

        fun taxProvider(): TaxProvider = taxProvider.getRequired("tax_provider")

        @JsonProperty("tax_exempt") @ExcludeMissing fun _taxExempt(): JsonField<Boolean> = taxExempt

        @JsonProperty("tax_provider")
        @ExcludeMissing
        fun _taxProvider(): JsonField<TaxProvider> = taxProvider

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): NewTaxJarConfiguration = apply {
            if (validated) {
                return@apply
            }

            taxExempt()
            taxProvider()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [NewTaxJarConfiguration].
             *
             * The following fields are required:
             * ```kotlin
             * .taxExempt()
             * .taxProvider()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [NewTaxJarConfiguration]. */
        class Builder internal constructor() {

            private var taxExempt: JsonField<Boolean>? = null
            private var taxProvider: JsonField<TaxProvider>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(newTaxJarConfiguration: NewTaxJarConfiguration) = apply {
                taxExempt = newTaxJarConfiguration.taxExempt
                taxProvider = newTaxJarConfiguration.taxProvider
                additionalProperties = newTaxJarConfiguration.additionalProperties.toMutableMap()
            }

            fun taxExempt(taxExempt: Boolean) = taxExempt(JsonField.of(taxExempt))

            fun taxExempt(taxExempt: JsonField<Boolean>) = apply { this.taxExempt = taxExempt }

            fun taxProvider(taxProvider: TaxProvider) = taxProvider(JsonField.of(taxProvider))

            fun taxProvider(taxProvider: JsonField<TaxProvider>) = apply {
                this.taxProvider = taxProvider
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

            fun build(): NewTaxJarConfiguration =
                NewTaxJarConfiguration(
                    checkRequired("taxExempt", taxExempt),
                    checkRequired("taxProvider", taxProvider),
                    additionalProperties.toImmutable(),
                )
        }

        class TaxProvider @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val TAXJAR = of("taxjar")

                fun of(value: String) = TaxProvider(JsonField.of(value))
            }

            /** An enum containing [TaxProvider]'s known values. */
            enum class Known {
                TAXJAR
            }

            /**
             * An enum containing [TaxProvider]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [TaxProvider] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                TAXJAR,
                /**
                 * An enum member indicating that [TaxProvider] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    TAXJAR -> Value.TAXJAR
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws OrbInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    TAXJAR -> Known.TAXJAR
                    else -> throw OrbInvalidDataException("Unknown TaxProvider: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws OrbInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString() ?: throw OrbInvalidDataException("Value is not a String")

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is TaxProvider && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is NewTaxJarConfiguration && taxExempt == other.taxExempt && taxProvider == other.taxProvider && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(taxExempt, taxProvider, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "NewTaxJarConfiguration{taxExempt=$taxExempt, taxProvider=$taxProvider, additionalProperties=$additionalProperties}"
    }
}
