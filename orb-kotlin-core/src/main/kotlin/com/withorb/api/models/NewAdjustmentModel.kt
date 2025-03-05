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
import com.withorb.api.core.checkKnown
import com.withorb.api.core.checkRequired
import com.withorb.api.core.getOrThrow
import com.withorb.api.core.immutableEmptyMap
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.util.Objects

@JsonDeserialize(using = NewAdjustmentModel.Deserializer::class)
@JsonSerialize(using = NewAdjustmentModel.Serializer::class)
class NewAdjustmentModel
private constructor(
    private val percentageDiscount: NewPercentageDiscount? = null,
    private val usageDiscount: NewUsageDiscount? = null,
    private val amountDiscount: NewAmountDiscount? = null,
    private val minimum: NewMinimum? = null,
    private val maximum: NewMaximum? = null,
    private val _json: JsonValue? = null,
) {

    fun percentageDiscount(): NewPercentageDiscount? = percentageDiscount

    fun usageDiscount(): NewUsageDiscount? = usageDiscount

    fun amountDiscount(): NewAmountDiscount? = amountDiscount

    fun minimum(): NewMinimum? = minimum

    fun maximum(): NewMaximum? = maximum

    fun isPercentageDiscount(): Boolean = percentageDiscount != null

    fun isUsageDiscount(): Boolean = usageDiscount != null

    fun isAmountDiscount(): Boolean = amountDiscount != null

    fun isMinimum(): Boolean = minimum != null

    fun isMaximum(): Boolean = maximum != null

    fun asPercentageDiscount(): NewPercentageDiscount =
        percentageDiscount.getOrThrow("percentageDiscount")

    fun asUsageDiscount(): NewUsageDiscount = usageDiscount.getOrThrow("usageDiscount")

    fun asAmountDiscount(): NewAmountDiscount = amountDiscount.getOrThrow("amountDiscount")

    fun asMinimum(): NewMinimum = minimum.getOrThrow("minimum")

    fun asMaximum(): NewMaximum = maximum.getOrThrow("maximum")

    fun _json(): JsonValue? = _json

    fun <T> accept(visitor: Visitor<T>): T {
        return when {
            percentageDiscount != null -> visitor.visitPercentageDiscount(percentageDiscount)
            usageDiscount != null -> visitor.visitUsageDiscount(usageDiscount)
            amountDiscount != null -> visitor.visitAmountDiscount(amountDiscount)
            minimum != null -> visitor.visitMinimum(minimum)
            maximum != null -> visitor.visitMaximum(maximum)
            else -> visitor.unknown(_json)
        }
    }

    private var validated: Boolean = false

    fun validate(): NewAdjustmentModel = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitPercentageDiscount(percentageDiscount: NewPercentageDiscount) {
                    percentageDiscount.validate()
                }

                override fun visitUsageDiscount(usageDiscount: NewUsageDiscount) {
                    usageDiscount.validate()
                }

                override fun visitAmountDiscount(amountDiscount: NewAmountDiscount) {
                    amountDiscount.validate()
                }

                override fun visitMinimum(minimum: NewMinimum) {
                    minimum.validate()
                }

                override fun visitMaximum(maximum: NewMaximum) {
                    maximum.validate()
                }
            }
        )
        validated = true
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is NewAdjustmentModel && percentageDiscount == other.percentageDiscount && usageDiscount == other.usageDiscount && amountDiscount == other.amountDiscount && minimum == other.minimum && maximum == other.maximum /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(percentageDiscount, usageDiscount, amountDiscount, minimum, maximum) /* spotless:on */

    override fun toString(): String =
        when {
            percentageDiscount != null ->
                "NewAdjustmentModel{percentageDiscount=$percentageDiscount}"
            usageDiscount != null -> "NewAdjustmentModel{usageDiscount=$usageDiscount}"
            amountDiscount != null -> "NewAdjustmentModel{amountDiscount=$amountDiscount}"
            minimum != null -> "NewAdjustmentModel{minimum=$minimum}"
            maximum != null -> "NewAdjustmentModel{maximum=$maximum}"
            _json != null -> "NewAdjustmentModel{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid NewAdjustmentModel")
        }

    companion object {

        fun ofPercentageDiscount(percentageDiscount: NewPercentageDiscount) =
            NewAdjustmentModel(percentageDiscount = percentageDiscount)

        fun ofUsageDiscount(usageDiscount: NewUsageDiscount) =
            NewAdjustmentModel(usageDiscount = usageDiscount)

        fun ofAmountDiscount(amountDiscount: NewAmountDiscount) =
            NewAdjustmentModel(amountDiscount = amountDiscount)

        fun ofMinimum(minimum: NewMinimum) = NewAdjustmentModel(minimum = minimum)

        fun ofMaximum(maximum: NewMaximum) = NewAdjustmentModel(maximum = maximum)
    }

    /**
     * An interface that defines how to map each variant of [NewAdjustmentModel] to a value of type
     * [T].
     */
    interface Visitor<out T> {

        fun visitPercentageDiscount(percentageDiscount: NewPercentageDiscount): T

        fun visitUsageDiscount(usageDiscount: NewUsageDiscount): T

        fun visitAmountDiscount(amountDiscount: NewAmountDiscount): T

        fun visitMinimum(minimum: NewMinimum): T

        fun visitMaximum(maximum: NewMaximum): T

        /**
         * Maps an unknown variant of [NewAdjustmentModel] to a value of type [T].
         *
         * An instance of [NewAdjustmentModel] can contain an unknown variant if it was deserialized
         * from data that doesn't match any known variant. For example, if the SDK is on an older
         * version than the API, then the API may respond with new variants that the SDK is unaware
         * of.
         *
         * @throws OrbInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw OrbInvalidDataException("Unknown NewAdjustmentModel: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<NewAdjustmentModel>(NewAdjustmentModel::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): NewAdjustmentModel {
            val json = JsonValue.fromJsonNode(node)
            val adjustmentType = json.asObject()?.get("adjustment_type")?.asString()

            when (adjustmentType) {
                "percentage_discount" -> {
                    tryDeserialize(node, jacksonTypeRef<NewPercentageDiscount>()) { it.validate() }
                        ?.let {
                            return NewAdjustmentModel(percentageDiscount = it, _json = json)
                        }
                }
                "usage_discount" -> {
                    tryDeserialize(node, jacksonTypeRef<NewUsageDiscount>()) { it.validate() }
                        ?.let {
                            return NewAdjustmentModel(usageDiscount = it, _json = json)
                        }
                }
                "amount_discount" -> {
                    tryDeserialize(node, jacksonTypeRef<NewAmountDiscount>()) { it.validate() }
                        ?.let {
                            return NewAdjustmentModel(amountDiscount = it, _json = json)
                        }
                }
                "minimum" -> {
                    tryDeserialize(node, jacksonTypeRef<NewMinimum>()) { it.validate() }
                        ?.let {
                            return NewAdjustmentModel(minimum = it, _json = json)
                        }
                }
                "maximum" -> {
                    tryDeserialize(node, jacksonTypeRef<NewMaximum>()) { it.validate() }
                        ?.let {
                            return NewAdjustmentModel(maximum = it, _json = json)
                        }
                }
            }

            return NewAdjustmentModel(_json = json)
        }
    }

    internal class Serializer : BaseSerializer<NewAdjustmentModel>(NewAdjustmentModel::class) {

        override fun serialize(
            value: NewAdjustmentModel,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.percentageDiscount != null -> generator.writeObject(value.percentageDiscount)
                value.usageDiscount != null -> generator.writeObject(value.usageDiscount)
                value.amountDiscount != null -> generator.writeObject(value.amountDiscount)
                value.minimum != null -> generator.writeObject(value.minimum)
                value.maximum != null -> generator.writeObject(value.maximum)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid NewAdjustmentModel")
            }
        }
    }

    @NoAutoDetect
    class NewPercentageDiscount
    @JsonCreator
    private constructor(
        @JsonProperty("adjustment_type")
        @ExcludeMissing
        private val adjustmentType: JsonField<AdjustmentType> = JsonMissing.of(),
        @JsonProperty("applies_to_price_ids")
        @ExcludeMissing
        private val appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("percentage_discount")
        @ExcludeMissing
        private val percentageDiscount: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("is_invoice_level")
        @ExcludeMissing
        private val isInvoiceLevel: JsonField<Boolean> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun adjustmentType(): AdjustmentType = adjustmentType.getRequired("adjustment_type")

        /** The set of price IDs to which this adjustment applies. */
        fun appliesToPriceIds(): List<String> =
            appliesToPriceIds.getRequired("applies_to_price_ids")

        fun percentageDiscount(): Double = percentageDiscount.getRequired("percentage_discount")

        /**
         * When false, this adjustment will be applied to a single price. Otherwise, it will be
         * applied at the invoice level, possibly to multiple prices.
         */
        fun isInvoiceLevel(): Boolean? = isInvoiceLevel.getNullable("is_invoice_level")

        @JsonProperty("adjustment_type")
        @ExcludeMissing
        fun _adjustmentType(): JsonField<AdjustmentType> = adjustmentType

        /** The set of price IDs to which this adjustment applies. */
        @JsonProperty("applies_to_price_ids")
        @ExcludeMissing
        fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

        @JsonProperty("percentage_discount")
        @ExcludeMissing
        fun _percentageDiscount(): JsonField<Double> = percentageDiscount

        /**
         * When false, this adjustment will be applied to a single price. Otherwise, it will be
         * applied at the invoice level, possibly to multiple prices.
         */
        @JsonProperty("is_invoice_level")
        @ExcludeMissing
        fun _isInvoiceLevel(): JsonField<Boolean> = isInvoiceLevel

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): NewPercentageDiscount = apply {
            if (validated) {
                return@apply
            }

            adjustmentType()
            appliesToPriceIds()
            percentageDiscount()
            isInvoiceLevel()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [NewPercentageDiscount].
             *
             * The following fields are required:
             * ```kotlin
             * .adjustmentType()
             * .appliesToPriceIds()
             * .percentageDiscount()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [NewPercentageDiscount]. */
        class Builder internal constructor() {

            private var adjustmentType: JsonField<AdjustmentType>? = null
            private var appliesToPriceIds: JsonField<MutableList<String>>? = null
            private var percentageDiscount: JsonField<Double>? = null
            private var isInvoiceLevel: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(newPercentageDiscount: NewPercentageDiscount) = apply {
                adjustmentType = newPercentageDiscount.adjustmentType
                appliesToPriceIds =
                    newPercentageDiscount.appliesToPriceIds.map { it.toMutableList() }
                percentageDiscount = newPercentageDiscount.percentageDiscount
                isInvoiceLevel = newPercentageDiscount.isInvoiceLevel
                additionalProperties = newPercentageDiscount.additionalProperties.toMutableMap()
            }

            fun adjustmentType(adjustmentType: AdjustmentType) =
                adjustmentType(JsonField.of(adjustmentType))

            fun adjustmentType(adjustmentType: JsonField<AdjustmentType>) = apply {
                this.adjustmentType = adjustmentType
            }

            /** The set of price IDs to which this adjustment applies. */
            fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                appliesToPriceIds(JsonField.of(appliesToPriceIds))

            /** The set of price IDs to which this adjustment applies. */
            fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
            }

            /** The set of price IDs to which this adjustment applies. */
            fun addAppliesToPriceId(appliesToPriceId: String) = apply {
                appliesToPriceIds =
                    (appliesToPriceIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("appliesToPriceIds", it).add(appliesToPriceId)
                    }
            }

            fun percentageDiscount(percentageDiscount: Double) =
                percentageDiscount(JsonField.of(percentageDiscount))

            fun percentageDiscount(percentageDiscount: JsonField<Double>) = apply {
                this.percentageDiscount = percentageDiscount
            }

            /**
             * When false, this adjustment will be applied to a single price. Otherwise, it will be
             * applied at the invoice level, possibly to multiple prices.
             */
            fun isInvoiceLevel(isInvoiceLevel: Boolean) =
                isInvoiceLevel(JsonField.of(isInvoiceLevel))

            /**
             * When false, this adjustment will be applied to a single price. Otherwise, it will be
             * applied at the invoice level, possibly to multiple prices.
             */
            fun isInvoiceLevel(isInvoiceLevel: JsonField<Boolean>) = apply {
                this.isInvoiceLevel = isInvoiceLevel
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

            fun build(): NewPercentageDiscount =
                NewPercentageDiscount(
                    checkRequired("adjustmentType", adjustmentType),
                    checkRequired("appliesToPriceIds", appliesToPriceIds).map { it.toImmutable() },
                    checkRequired("percentageDiscount", percentageDiscount),
                    isInvoiceLevel,
                    additionalProperties.toImmutable(),
                )
        }

        class AdjustmentType
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

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

                val PERCENTAGE_DISCOUNT = of("percentage_discount")

                fun of(value: String) = AdjustmentType(JsonField.of(value))
            }

            /** An enum containing [AdjustmentType]'s known values. */
            enum class Known {
                PERCENTAGE_DISCOUNT
            }

            /**
             * An enum containing [AdjustmentType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [AdjustmentType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                PERCENTAGE_DISCOUNT,
                /**
                 * An enum member indicating that [AdjustmentType] was instantiated with an unknown
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
                    PERCENTAGE_DISCOUNT -> Value.PERCENTAGE_DISCOUNT
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
                    PERCENTAGE_DISCOUNT -> Known.PERCENTAGE_DISCOUNT
                    else -> throw OrbInvalidDataException("Unknown AdjustmentType: $value")
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

                return /* spotless:off */ other is AdjustmentType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is NewPercentageDiscount && adjustmentType == other.adjustmentType && appliesToPriceIds == other.appliesToPriceIds && percentageDiscount == other.percentageDiscount && isInvoiceLevel == other.isInvoiceLevel && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(adjustmentType, appliesToPriceIds, percentageDiscount, isInvoiceLevel, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "NewPercentageDiscount{adjustmentType=$adjustmentType, appliesToPriceIds=$appliesToPriceIds, percentageDiscount=$percentageDiscount, isInvoiceLevel=$isInvoiceLevel, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class NewUsageDiscount
    @JsonCreator
    private constructor(
        @JsonProperty("adjustment_type")
        @ExcludeMissing
        private val adjustmentType: JsonField<AdjustmentType> = JsonMissing.of(),
        @JsonProperty("applies_to_price_ids")
        @ExcludeMissing
        private val appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("usage_discount")
        @ExcludeMissing
        private val usageDiscount: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("is_invoice_level")
        @ExcludeMissing
        private val isInvoiceLevel: JsonField<Boolean> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun adjustmentType(): AdjustmentType = adjustmentType.getRequired("adjustment_type")

        /** The set of price IDs to which this adjustment applies. */
        fun appliesToPriceIds(): List<String> =
            appliesToPriceIds.getRequired("applies_to_price_ids")

        fun usageDiscount(): Double = usageDiscount.getRequired("usage_discount")

        /**
         * When false, this adjustment will be applied to a single price. Otherwise, it will be
         * applied at the invoice level, possibly to multiple prices.
         */
        fun isInvoiceLevel(): Boolean? = isInvoiceLevel.getNullable("is_invoice_level")

        @JsonProperty("adjustment_type")
        @ExcludeMissing
        fun _adjustmentType(): JsonField<AdjustmentType> = adjustmentType

        /** The set of price IDs to which this adjustment applies. */
        @JsonProperty("applies_to_price_ids")
        @ExcludeMissing
        fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

        @JsonProperty("usage_discount")
        @ExcludeMissing
        fun _usageDiscount(): JsonField<Double> = usageDiscount

        /**
         * When false, this adjustment will be applied to a single price. Otherwise, it will be
         * applied at the invoice level, possibly to multiple prices.
         */
        @JsonProperty("is_invoice_level")
        @ExcludeMissing
        fun _isInvoiceLevel(): JsonField<Boolean> = isInvoiceLevel

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): NewUsageDiscount = apply {
            if (validated) {
                return@apply
            }

            adjustmentType()
            appliesToPriceIds()
            usageDiscount()
            isInvoiceLevel()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [NewUsageDiscount].
             *
             * The following fields are required:
             * ```kotlin
             * .adjustmentType()
             * .appliesToPriceIds()
             * .usageDiscount()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [NewUsageDiscount]. */
        class Builder internal constructor() {

            private var adjustmentType: JsonField<AdjustmentType>? = null
            private var appliesToPriceIds: JsonField<MutableList<String>>? = null
            private var usageDiscount: JsonField<Double>? = null
            private var isInvoiceLevel: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(newUsageDiscount: NewUsageDiscount) = apply {
                adjustmentType = newUsageDiscount.adjustmentType
                appliesToPriceIds = newUsageDiscount.appliesToPriceIds.map { it.toMutableList() }
                usageDiscount = newUsageDiscount.usageDiscount
                isInvoiceLevel = newUsageDiscount.isInvoiceLevel
                additionalProperties = newUsageDiscount.additionalProperties.toMutableMap()
            }

            fun adjustmentType(adjustmentType: AdjustmentType) =
                adjustmentType(JsonField.of(adjustmentType))

            fun adjustmentType(adjustmentType: JsonField<AdjustmentType>) = apply {
                this.adjustmentType = adjustmentType
            }

            /** The set of price IDs to which this adjustment applies. */
            fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                appliesToPriceIds(JsonField.of(appliesToPriceIds))

            /** The set of price IDs to which this adjustment applies. */
            fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
            }

            /** The set of price IDs to which this adjustment applies. */
            fun addAppliesToPriceId(appliesToPriceId: String) = apply {
                appliesToPriceIds =
                    (appliesToPriceIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("appliesToPriceIds", it).add(appliesToPriceId)
                    }
            }

            fun usageDiscount(usageDiscount: Double) = usageDiscount(JsonField.of(usageDiscount))

            fun usageDiscount(usageDiscount: JsonField<Double>) = apply {
                this.usageDiscount = usageDiscount
            }

            /**
             * When false, this adjustment will be applied to a single price. Otherwise, it will be
             * applied at the invoice level, possibly to multiple prices.
             */
            fun isInvoiceLevel(isInvoiceLevel: Boolean) =
                isInvoiceLevel(JsonField.of(isInvoiceLevel))

            /**
             * When false, this adjustment will be applied to a single price. Otherwise, it will be
             * applied at the invoice level, possibly to multiple prices.
             */
            fun isInvoiceLevel(isInvoiceLevel: JsonField<Boolean>) = apply {
                this.isInvoiceLevel = isInvoiceLevel
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

            fun build(): NewUsageDiscount =
                NewUsageDiscount(
                    checkRequired("adjustmentType", adjustmentType),
                    checkRequired("appliesToPriceIds", appliesToPriceIds).map { it.toImmutable() },
                    checkRequired("usageDiscount", usageDiscount),
                    isInvoiceLevel,
                    additionalProperties.toImmutable(),
                )
        }

        class AdjustmentType
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

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

                val USAGE_DISCOUNT = of("usage_discount")

                fun of(value: String) = AdjustmentType(JsonField.of(value))
            }

            /** An enum containing [AdjustmentType]'s known values. */
            enum class Known {
                USAGE_DISCOUNT
            }

            /**
             * An enum containing [AdjustmentType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [AdjustmentType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                USAGE_DISCOUNT,
                /**
                 * An enum member indicating that [AdjustmentType] was instantiated with an unknown
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
                    USAGE_DISCOUNT -> Value.USAGE_DISCOUNT
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
                    USAGE_DISCOUNT -> Known.USAGE_DISCOUNT
                    else -> throw OrbInvalidDataException("Unknown AdjustmentType: $value")
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

                return /* spotless:off */ other is AdjustmentType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is NewUsageDiscount && adjustmentType == other.adjustmentType && appliesToPriceIds == other.appliesToPriceIds && usageDiscount == other.usageDiscount && isInvoiceLevel == other.isInvoiceLevel && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(adjustmentType, appliesToPriceIds, usageDiscount, isInvoiceLevel, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "NewUsageDiscount{adjustmentType=$adjustmentType, appliesToPriceIds=$appliesToPriceIds, usageDiscount=$usageDiscount, isInvoiceLevel=$isInvoiceLevel, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class NewAmountDiscount
    @JsonCreator
    private constructor(
        @JsonProperty("adjustment_type")
        @ExcludeMissing
        private val adjustmentType: JsonField<AdjustmentType> = JsonMissing.of(),
        @JsonProperty("amount_discount")
        @ExcludeMissing
        private val amountDiscount: JsonField<String> = JsonMissing.of(),
        @JsonProperty("applies_to_price_ids")
        @ExcludeMissing
        private val appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("is_invoice_level")
        @ExcludeMissing
        private val isInvoiceLevel: JsonField<Boolean> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun adjustmentType(): AdjustmentType = adjustmentType.getRequired("adjustment_type")

        fun amountDiscount(): String = amountDiscount.getRequired("amount_discount")

        /** The set of price IDs to which this adjustment applies. */
        fun appliesToPriceIds(): List<String> =
            appliesToPriceIds.getRequired("applies_to_price_ids")

        /**
         * When false, this adjustment will be applied to a single price. Otherwise, it will be
         * applied at the invoice level, possibly to multiple prices.
         */
        fun isInvoiceLevel(): Boolean? = isInvoiceLevel.getNullable("is_invoice_level")

        @JsonProperty("adjustment_type")
        @ExcludeMissing
        fun _adjustmentType(): JsonField<AdjustmentType> = adjustmentType

        @JsonProperty("amount_discount")
        @ExcludeMissing
        fun _amountDiscount(): JsonField<String> = amountDiscount

        /** The set of price IDs to which this adjustment applies. */
        @JsonProperty("applies_to_price_ids")
        @ExcludeMissing
        fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

        /**
         * When false, this adjustment will be applied to a single price. Otherwise, it will be
         * applied at the invoice level, possibly to multiple prices.
         */
        @JsonProperty("is_invoice_level")
        @ExcludeMissing
        fun _isInvoiceLevel(): JsonField<Boolean> = isInvoiceLevel

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): NewAmountDiscount = apply {
            if (validated) {
                return@apply
            }

            adjustmentType()
            amountDiscount()
            appliesToPriceIds()
            isInvoiceLevel()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [NewAmountDiscount].
             *
             * The following fields are required:
             * ```kotlin
             * .adjustmentType()
             * .amountDiscount()
             * .appliesToPriceIds()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [NewAmountDiscount]. */
        class Builder internal constructor() {

            private var adjustmentType: JsonField<AdjustmentType>? = null
            private var amountDiscount: JsonField<String>? = null
            private var appliesToPriceIds: JsonField<MutableList<String>>? = null
            private var isInvoiceLevel: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(newAmountDiscount: NewAmountDiscount) = apply {
                adjustmentType = newAmountDiscount.adjustmentType
                amountDiscount = newAmountDiscount.amountDiscount
                appliesToPriceIds = newAmountDiscount.appliesToPriceIds.map { it.toMutableList() }
                isInvoiceLevel = newAmountDiscount.isInvoiceLevel
                additionalProperties = newAmountDiscount.additionalProperties.toMutableMap()
            }

            fun adjustmentType(adjustmentType: AdjustmentType) =
                adjustmentType(JsonField.of(adjustmentType))

            fun adjustmentType(adjustmentType: JsonField<AdjustmentType>) = apply {
                this.adjustmentType = adjustmentType
            }

            fun amountDiscount(amountDiscount: String) =
                amountDiscount(JsonField.of(amountDiscount))

            fun amountDiscount(amountDiscount: JsonField<String>) = apply {
                this.amountDiscount = amountDiscount
            }

            /** The set of price IDs to which this adjustment applies. */
            fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                appliesToPriceIds(JsonField.of(appliesToPriceIds))

            /** The set of price IDs to which this adjustment applies. */
            fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
            }

            /** The set of price IDs to which this adjustment applies. */
            fun addAppliesToPriceId(appliesToPriceId: String) = apply {
                appliesToPriceIds =
                    (appliesToPriceIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("appliesToPriceIds", it).add(appliesToPriceId)
                    }
            }

            /**
             * When false, this adjustment will be applied to a single price. Otherwise, it will be
             * applied at the invoice level, possibly to multiple prices.
             */
            fun isInvoiceLevel(isInvoiceLevel: Boolean) =
                isInvoiceLevel(JsonField.of(isInvoiceLevel))

            /**
             * When false, this adjustment will be applied to a single price. Otherwise, it will be
             * applied at the invoice level, possibly to multiple prices.
             */
            fun isInvoiceLevel(isInvoiceLevel: JsonField<Boolean>) = apply {
                this.isInvoiceLevel = isInvoiceLevel
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

            fun build(): NewAmountDiscount =
                NewAmountDiscount(
                    checkRequired("adjustmentType", adjustmentType),
                    checkRequired("amountDiscount", amountDiscount),
                    checkRequired("appliesToPriceIds", appliesToPriceIds).map { it.toImmutable() },
                    isInvoiceLevel,
                    additionalProperties.toImmutable(),
                )
        }

        class AdjustmentType
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

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

                val AMOUNT_DISCOUNT = of("amount_discount")

                fun of(value: String) = AdjustmentType(JsonField.of(value))
            }

            /** An enum containing [AdjustmentType]'s known values. */
            enum class Known {
                AMOUNT_DISCOUNT
            }

            /**
             * An enum containing [AdjustmentType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [AdjustmentType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                AMOUNT_DISCOUNT,
                /**
                 * An enum member indicating that [AdjustmentType] was instantiated with an unknown
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
                    AMOUNT_DISCOUNT -> Value.AMOUNT_DISCOUNT
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
                    AMOUNT_DISCOUNT -> Known.AMOUNT_DISCOUNT
                    else -> throw OrbInvalidDataException("Unknown AdjustmentType: $value")
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

                return /* spotless:off */ other is AdjustmentType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is NewAmountDiscount && adjustmentType == other.adjustmentType && amountDiscount == other.amountDiscount && appliesToPriceIds == other.appliesToPriceIds && isInvoiceLevel == other.isInvoiceLevel && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(adjustmentType, amountDiscount, appliesToPriceIds, isInvoiceLevel, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "NewAmountDiscount{adjustmentType=$adjustmentType, amountDiscount=$amountDiscount, appliesToPriceIds=$appliesToPriceIds, isInvoiceLevel=$isInvoiceLevel, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class NewMinimum
    @JsonCreator
    private constructor(
        @JsonProperty("adjustment_type")
        @ExcludeMissing
        private val adjustmentType: JsonField<AdjustmentType> = JsonMissing.of(),
        @JsonProperty("applies_to_price_ids")
        @ExcludeMissing
        private val appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("item_id")
        @ExcludeMissing
        private val itemId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("minimum_amount")
        @ExcludeMissing
        private val minimumAmount: JsonField<String> = JsonMissing.of(),
        @JsonProperty("is_invoice_level")
        @ExcludeMissing
        private val isInvoiceLevel: JsonField<Boolean> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun adjustmentType(): AdjustmentType = adjustmentType.getRequired("adjustment_type")

        /** The set of price IDs to which this adjustment applies. */
        fun appliesToPriceIds(): List<String> =
            appliesToPriceIds.getRequired("applies_to_price_ids")

        /** The item ID that revenue from this minimum will be attributed to. */
        fun itemId(): String = itemId.getRequired("item_id")

        fun minimumAmount(): String = minimumAmount.getRequired("minimum_amount")

        /**
         * When false, this adjustment will be applied to a single price. Otherwise, it will be
         * applied at the invoice level, possibly to multiple prices.
         */
        fun isInvoiceLevel(): Boolean? = isInvoiceLevel.getNullable("is_invoice_level")

        @JsonProperty("adjustment_type")
        @ExcludeMissing
        fun _adjustmentType(): JsonField<AdjustmentType> = adjustmentType

        /** The set of price IDs to which this adjustment applies. */
        @JsonProperty("applies_to_price_ids")
        @ExcludeMissing
        fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

        /** The item ID that revenue from this minimum will be attributed to. */
        @JsonProperty("item_id") @ExcludeMissing fun _itemId(): JsonField<String> = itemId

        @JsonProperty("minimum_amount")
        @ExcludeMissing
        fun _minimumAmount(): JsonField<String> = minimumAmount

        /**
         * When false, this adjustment will be applied to a single price. Otherwise, it will be
         * applied at the invoice level, possibly to multiple prices.
         */
        @JsonProperty("is_invoice_level")
        @ExcludeMissing
        fun _isInvoiceLevel(): JsonField<Boolean> = isInvoiceLevel

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): NewMinimum = apply {
            if (validated) {
                return@apply
            }

            adjustmentType()
            appliesToPriceIds()
            itemId()
            minimumAmount()
            isInvoiceLevel()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [NewMinimum].
             *
             * The following fields are required:
             * ```kotlin
             * .adjustmentType()
             * .appliesToPriceIds()
             * .itemId()
             * .minimumAmount()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [NewMinimum]. */
        class Builder internal constructor() {

            private var adjustmentType: JsonField<AdjustmentType>? = null
            private var appliesToPriceIds: JsonField<MutableList<String>>? = null
            private var itemId: JsonField<String>? = null
            private var minimumAmount: JsonField<String>? = null
            private var isInvoiceLevel: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(newMinimum: NewMinimum) = apply {
                adjustmentType = newMinimum.adjustmentType
                appliesToPriceIds = newMinimum.appliesToPriceIds.map { it.toMutableList() }
                itemId = newMinimum.itemId
                minimumAmount = newMinimum.minimumAmount
                isInvoiceLevel = newMinimum.isInvoiceLevel
                additionalProperties = newMinimum.additionalProperties.toMutableMap()
            }

            fun adjustmentType(adjustmentType: AdjustmentType) =
                adjustmentType(JsonField.of(adjustmentType))

            fun adjustmentType(adjustmentType: JsonField<AdjustmentType>) = apply {
                this.adjustmentType = adjustmentType
            }

            /** The set of price IDs to which this adjustment applies. */
            fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                appliesToPriceIds(JsonField.of(appliesToPriceIds))

            /** The set of price IDs to which this adjustment applies. */
            fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
            }

            /** The set of price IDs to which this adjustment applies. */
            fun addAppliesToPriceId(appliesToPriceId: String) = apply {
                appliesToPriceIds =
                    (appliesToPriceIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("appliesToPriceIds", it).add(appliesToPriceId)
                    }
            }

            /** The item ID that revenue from this minimum will be attributed to. */
            fun itemId(itemId: String) = itemId(JsonField.of(itemId))

            /** The item ID that revenue from this minimum will be attributed to. */
            fun itemId(itemId: JsonField<String>) = apply { this.itemId = itemId }

            fun minimumAmount(minimumAmount: String) = minimumAmount(JsonField.of(minimumAmount))

            fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                this.minimumAmount = minimumAmount
            }

            /**
             * When false, this adjustment will be applied to a single price. Otherwise, it will be
             * applied at the invoice level, possibly to multiple prices.
             */
            fun isInvoiceLevel(isInvoiceLevel: Boolean) =
                isInvoiceLevel(JsonField.of(isInvoiceLevel))

            /**
             * When false, this adjustment will be applied to a single price. Otherwise, it will be
             * applied at the invoice level, possibly to multiple prices.
             */
            fun isInvoiceLevel(isInvoiceLevel: JsonField<Boolean>) = apply {
                this.isInvoiceLevel = isInvoiceLevel
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

            fun build(): NewMinimum =
                NewMinimum(
                    checkRequired("adjustmentType", adjustmentType),
                    checkRequired("appliesToPriceIds", appliesToPriceIds).map { it.toImmutable() },
                    checkRequired("itemId", itemId),
                    checkRequired("minimumAmount", minimumAmount),
                    isInvoiceLevel,
                    additionalProperties.toImmutable(),
                )
        }

        class AdjustmentType
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

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

                val MINIMUM = of("minimum")

                fun of(value: String) = AdjustmentType(JsonField.of(value))
            }

            /** An enum containing [AdjustmentType]'s known values. */
            enum class Known {
                MINIMUM
            }

            /**
             * An enum containing [AdjustmentType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [AdjustmentType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                MINIMUM,
                /**
                 * An enum member indicating that [AdjustmentType] was instantiated with an unknown
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
                    MINIMUM -> Value.MINIMUM
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
                    MINIMUM -> Known.MINIMUM
                    else -> throw OrbInvalidDataException("Unknown AdjustmentType: $value")
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

                return /* spotless:off */ other is AdjustmentType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is NewMinimum && adjustmentType == other.adjustmentType && appliesToPriceIds == other.appliesToPriceIds && itemId == other.itemId && minimumAmount == other.minimumAmount && isInvoiceLevel == other.isInvoiceLevel && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(adjustmentType, appliesToPriceIds, itemId, minimumAmount, isInvoiceLevel, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "NewMinimum{adjustmentType=$adjustmentType, appliesToPriceIds=$appliesToPriceIds, itemId=$itemId, minimumAmount=$minimumAmount, isInvoiceLevel=$isInvoiceLevel, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class NewMaximum
    @JsonCreator
    private constructor(
        @JsonProperty("adjustment_type")
        @ExcludeMissing
        private val adjustmentType: JsonField<AdjustmentType> = JsonMissing.of(),
        @JsonProperty("applies_to_price_ids")
        @ExcludeMissing
        private val appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("maximum_amount")
        @ExcludeMissing
        private val maximumAmount: JsonField<String> = JsonMissing.of(),
        @JsonProperty("is_invoice_level")
        @ExcludeMissing
        private val isInvoiceLevel: JsonField<Boolean> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun adjustmentType(): AdjustmentType = adjustmentType.getRequired("adjustment_type")

        /** The set of price IDs to which this adjustment applies. */
        fun appliesToPriceIds(): List<String> =
            appliesToPriceIds.getRequired("applies_to_price_ids")

        fun maximumAmount(): String = maximumAmount.getRequired("maximum_amount")

        /**
         * When false, this adjustment will be applied to a single price. Otherwise, it will be
         * applied at the invoice level, possibly to multiple prices.
         */
        fun isInvoiceLevel(): Boolean? = isInvoiceLevel.getNullable("is_invoice_level")

        @JsonProperty("adjustment_type")
        @ExcludeMissing
        fun _adjustmentType(): JsonField<AdjustmentType> = adjustmentType

        /** The set of price IDs to which this adjustment applies. */
        @JsonProperty("applies_to_price_ids")
        @ExcludeMissing
        fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

        @JsonProperty("maximum_amount")
        @ExcludeMissing
        fun _maximumAmount(): JsonField<String> = maximumAmount

        /**
         * When false, this adjustment will be applied to a single price. Otherwise, it will be
         * applied at the invoice level, possibly to multiple prices.
         */
        @JsonProperty("is_invoice_level")
        @ExcludeMissing
        fun _isInvoiceLevel(): JsonField<Boolean> = isInvoiceLevel

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): NewMaximum = apply {
            if (validated) {
                return@apply
            }

            adjustmentType()
            appliesToPriceIds()
            maximumAmount()
            isInvoiceLevel()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [NewMaximum].
             *
             * The following fields are required:
             * ```kotlin
             * .adjustmentType()
             * .appliesToPriceIds()
             * .maximumAmount()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [NewMaximum]. */
        class Builder internal constructor() {

            private var adjustmentType: JsonField<AdjustmentType>? = null
            private var appliesToPriceIds: JsonField<MutableList<String>>? = null
            private var maximumAmount: JsonField<String>? = null
            private var isInvoiceLevel: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(newMaximum: NewMaximum) = apply {
                adjustmentType = newMaximum.adjustmentType
                appliesToPriceIds = newMaximum.appliesToPriceIds.map { it.toMutableList() }
                maximumAmount = newMaximum.maximumAmount
                isInvoiceLevel = newMaximum.isInvoiceLevel
                additionalProperties = newMaximum.additionalProperties.toMutableMap()
            }

            fun adjustmentType(adjustmentType: AdjustmentType) =
                adjustmentType(JsonField.of(adjustmentType))

            fun adjustmentType(adjustmentType: JsonField<AdjustmentType>) = apply {
                this.adjustmentType = adjustmentType
            }

            /** The set of price IDs to which this adjustment applies. */
            fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                appliesToPriceIds(JsonField.of(appliesToPriceIds))

            /** The set of price IDs to which this adjustment applies. */
            fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
            }

            /** The set of price IDs to which this adjustment applies. */
            fun addAppliesToPriceId(appliesToPriceId: String) = apply {
                appliesToPriceIds =
                    (appliesToPriceIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("appliesToPriceIds", it).add(appliesToPriceId)
                    }
            }

            fun maximumAmount(maximumAmount: String) = maximumAmount(JsonField.of(maximumAmount))

            fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                this.maximumAmount = maximumAmount
            }

            /**
             * When false, this adjustment will be applied to a single price. Otherwise, it will be
             * applied at the invoice level, possibly to multiple prices.
             */
            fun isInvoiceLevel(isInvoiceLevel: Boolean) =
                isInvoiceLevel(JsonField.of(isInvoiceLevel))

            /**
             * When false, this adjustment will be applied to a single price. Otherwise, it will be
             * applied at the invoice level, possibly to multiple prices.
             */
            fun isInvoiceLevel(isInvoiceLevel: JsonField<Boolean>) = apply {
                this.isInvoiceLevel = isInvoiceLevel
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

            fun build(): NewMaximum =
                NewMaximum(
                    checkRequired("adjustmentType", adjustmentType),
                    checkRequired("appliesToPriceIds", appliesToPriceIds).map { it.toImmutable() },
                    checkRequired("maximumAmount", maximumAmount),
                    isInvoiceLevel,
                    additionalProperties.toImmutable(),
                )
        }

        class AdjustmentType
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

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

                val MAXIMUM = of("maximum")

                fun of(value: String) = AdjustmentType(JsonField.of(value))
            }

            /** An enum containing [AdjustmentType]'s known values. */
            enum class Known {
                MAXIMUM
            }

            /**
             * An enum containing [AdjustmentType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [AdjustmentType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                MAXIMUM,
                /**
                 * An enum member indicating that [AdjustmentType] was instantiated with an unknown
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
                    MAXIMUM -> Value.MAXIMUM
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
                    MAXIMUM -> Known.MAXIMUM
                    else -> throw OrbInvalidDataException("Unknown AdjustmentType: $value")
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

                return /* spotless:off */ other is AdjustmentType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is NewMaximum && adjustmentType == other.adjustmentType && appliesToPriceIds == other.appliesToPriceIds && maximumAmount == other.maximumAmount && isInvoiceLevel == other.isInvoiceLevel && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(adjustmentType, appliesToPriceIds, maximumAmount, isInvoiceLevel, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "NewMaximum{adjustmentType=$adjustmentType, appliesToPriceIds=$appliesToPriceIds, maximumAmount=$maximumAmount, isInvoiceLevel=$isInvoiceLevel, additionalProperties=$additionalProperties}"
    }
}
