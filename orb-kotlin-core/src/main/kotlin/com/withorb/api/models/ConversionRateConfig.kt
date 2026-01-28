// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.BaseDeserializer
import com.withorb.api.core.BaseSerializer
import com.withorb.api.core.JsonValue
import com.withorb.api.core.getOrThrow
import com.withorb.api.errors.OrbInvalidDataException
import java.util.Objects

@JsonDeserialize(using = ConversionRateConfig.Deserializer::class)
@JsonSerialize(using = ConversionRateConfig.Serializer::class)
class ConversionRateConfig
private constructor(
    private val unit: UnitConversionRateConfig? = null,
    private val tiered: TieredConversionRateConfig? = null,
    private val _json: JsonValue? = null,
) {

    fun unit(): UnitConversionRateConfig? = unit

    fun tiered(): TieredConversionRateConfig? = tiered

    fun isUnit(): Boolean = unit != null

    fun isTiered(): Boolean = tiered != null

    fun asUnit(): UnitConversionRateConfig = unit.getOrThrow("unit")

    fun asTiered(): TieredConversionRateConfig = tiered.getOrThrow("tiered")

    fun _json(): JsonValue? = _json

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            unit != null -> visitor.visitUnit(unit)
            tiered != null -> visitor.visitTiered(tiered)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): ConversionRateConfig = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitUnit(unit: UnitConversionRateConfig) {
                    unit.validate()
                }

                override fun visitTiered(tiered: TieredConversionRateConfig) {
                    tiered.validate()
                }
            }
        )
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
        accept(
            object : Visitor<Int> {
                override fun visitUnit(unit: UnitConversionRateConfig) = unit.validity()

                override fun visitTiered(tiered: TieredConversionRateConfig) = tiered.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ConversionRateConfig && unit == other.unit && tiered == other.tiered
    }

    override fun hashCode(): Int = Objects.hash(unit, tiered)

    override fun toString(): String =
        when {
            unit != null -> "ConversionRateConfig{unit=$unit}"
            tiered != null -> "ConversionRateConfig{tiered=$tiered}"
            _json != null -> "ConversionRateConfig{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid ConversionRateConfig")
        }

    companion object {

        fun ofUnit(unit: UnitConversionRateConfig) = ConversionRateConfig(unit = unit)

        fun ofTiered(tiered: TieredConversionRateConfig) = ConversionRateConfig(tiered = tiered)
    }

    /**
     * An interface that defines how to map each variant of [ConversionRateConfig] to a value of
     * type [T].
     */
    interface Visitor<out T> {

        fun visitUnit(unit: UnitConversionRateConfig): T

        fun visitTiered(tiered: TieredConversionRateConfig): T

        /**
         * Maps an unknown variant of [ConversionRateConfig] to a value of type [T].
         *
         * An instance of [ConversionRateConfig] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws OrbInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw OrbInvalidDataException("Unknown ConversionRateConfig: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<ConversionRateConfig>(ConversionRateConfig::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): ConversionRateConfig {
            val json = JsonValue.fromJsonNode(node)
            val conversionRateType = json.asObject()?.get("conversion_rate_type")?.asString()

            when (conversionRateType) {
                "unit" -> {
                    return tryDeserialize(node, jacksonTypeRef<UnitConversionRateConfig>())?.let {
                        ConversionRateConfig(unit = it, _json = json)
                    } ?: ConversionRateConfig(_json = json)
                }
                "tiered" -> {
                    return tryDeserialize(node, jacksonTypeRef<TieredConversionRateConfig>())?.let {
                        ConversionRateConfig(tiered = it, _json = json)
                    } ?: ConversionRateConfig(_json = json)
                }
            }

            return ConversionRateConfig(_json = json)
        }
    }

    internal class Serializer : BaseSerializer<ConversionRateConfig>(ConversionRateConfig::class) {

        override fun serialize(
            value: ConversionRateConfig,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.unit != null -> generator.writeObject(value.unit)
                value.tiered != null -> generator.writeObject(value.tiered)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid ConversionRateConfig")
            }
        }
    }
}
