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

@JsonDeserialize(using = DiscountModel.Deserializer::class)
@JsonSerialize(using = DiscountModel.Serializer::class)
class DiscountModel
private constructor(
    private val percentageDiscount: PercentageDiscount? = null,
    private val trialDiscount: TrialDiscount? = null,
    private val usageDiscount: UsageDiscount? = null,
    private val amountDiscount: AmountDiscount? = null,
    private val _json: JsonValue? = null,
) {

    fun percentageDiscount(): PercentageDiscount? = percentageDiscount

    fun trialDiscount(): TrialDiscount? = trialDiscount

    fun usageDiscount(): UsageDiscount? = usageDiscount

    fun amountDiscount(): AmountDiscount? = amountDiscount

    fun isPercentageDiscount(): Boolean = percentageDiscount != null

    fun isTrialDiscount(): Boolean = trialDiscount != null

    fun isUsageDiscount(): Boolean = usageDiscount != null

    fun isAmountDiscount(): Boolean = amountDiscount != null

    fun asPercentageDiscount(): PercentageDiscount =
        percentageDiscount.getOrThrow("percentageDiscount")

    fun asTrialDiscount(): TrialDiscount = trialDiscount.getOrThrow("trialDiscount")

    fun asUsageDiscount(): UsageDiscount = usageDiscount.getOrThrow("usageDiscount")

    fun asAmountDiscount(): AmountDiscount = amountDiscount.getOrThrow("amountDiscount")

    fun _json(): JsonValue? = _json

    fun <T> accept(visitor: Visitor<T>): T {
        return when {
            percentageDiscount != null -> visitor.visitPercentageDiscount(percentageDiscount)
            trialDiscount != null -> visitor.visitTrialDiscount(trialDiscount)
            usageDiscount != null -> visitor.visitUsageDiscount(usageDiscount)
            amountDiscount != null -> visitor.visitAmountDiscount(amountDiscount)
            else -> visitor.unknown(_json)
        }
    }

    private var validated: Boolean = false

    fun validate(): DiscountModel = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitPercentageDiscount(percentageDiscount: PercentageDiscount) {
                    percentageDiscount.validate()
                }

                override fun visitTrialDiscount(trialDiscount: TrialDiscount) {
                    trialDiscount.validate()
                }

                override fun visitUsageDiscount(usageDiscount: UsageDiscount) {
                    usageDiscount.validate()
                }

                override fun visitAmountDiscount(amountDiscount: AmountDiscount) {
                    amountDiscount.validate()
                }
            }
        )
        validated = true
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DiscountModel && percentageDiscount == other.percentageDiscount && trialDiscount == other.trialDiscount && usageDiscount == other.usageDiscount && amountDiscount == other.amountDiscount /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(percentageDiscount, trialDiscount, usageDiscount, amountDiscount) /* spotless:on */

    override fun toString(): String =
        when {
            percentageDiscount != null -> "DiscountModel{percentageDiscount=$percentageDiscount}"
            trialDiscount != null -> "DiscountModel{trialDiscount=$trialDiscount}"
            usageDiscount != null -> "DiscountModel{usageDiscount=$usageDiscount}"
            amountDiscount != null -> "DiscountModel{amountDiscount=$amountDiscount}"
            _json != null -> "DiscountModel{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid DiscountModel")
        }

    companion object {

        fun ofPercentageDiscount(percentageDiscount: PercentageDiscount) =
            DiscountModel(percentageDiscount = percentageDiscount)

        fun ofTrialDiscount(trialDiscount: TrialDiscount) =
            DiscountModel(trialDiscount = trialDiscount)

        fun ofUsageDiscount(usageDiscount: UsageDiscount) =
            DiscountModel(usageDiscount = usageDiscount)

        fun ofAmountDiscount(amountDiscount: AmountDiscount) =
            DiscountModel(amountDiscount = amountDiscount)
    }

    /**
     * An interface that defines how to map each variant of [DiscountModel] to a value of type [T].
     */
    interface Visitor<out T> {

        fun visitPercentageDiscount(percentageDiscount: PercentageDiscount): T

        fun visitTrialDiscount(trialDiscount: TrialDiscount): T

        fun visitUsageDiscount(usageDiscount: UsageDiscount): T

        fun visitAmountDiscount(amountDiscount: AmountDiscount): T

        /**
         * Maps an unknown variant of [DiscountModel] to a value of type [T].
         *
         * An instance of [DiscountModel] can contain an unknown variant if it was deserialized from
         * data that doesn't match any known variant. For example, if the SDK is on an older version
         * than the API, then the API may respond with new variants that the SDK is unaware of.
         *
         * @throws OrbInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw OrbInvalidDataException("Unknown DiscountModel: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<DiscountModel>(DiscountModel::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): DiscountModel {
            val json = JsonValue.fromJsonNode(node)
            val discountType = json.asObject()?.get("discount_type")?.asString()

            when (discountType) {
                "percentage" -> {
                    tryDeserialize(node, jacksonTypeRef<PercentageDiscount>()) { it.validate() }
                        ?.let {
                            return DiscountModel(percentageDiscount = it, _json = json)
                        }
                }
                "trial" -> {
                    tryDeserialize(node, jacksonTypeRef<TrialDiscount>()) { it.validate() }
                        ?.let {
                            return DiscountModel(trialDiscount = it, _json = json)
                        }
                }
                "usage" -> {
                    tryDeserialize(node, jacksonTypeRef<UsageDiscount>()) { it.validate() }
                        ?.let {
                            return DiscountModel(usageDiscount = it, _json = json)
                        }
                }
                "amount" -> {
                    tryDeserialize(node, jacksonTypeRef<AmountDiscount>()) { it.validate() }
                        ?.let {
                            return DiscountModel(amountDiscount = it, _json = json)
                        }
                }
            }

            return DiscountModel(_json = json)
        }
    }

    internal class Serializer : BaseSerializer<DiscountModel>(DiscountModel::class) {

        override fun serialize(
            value: DiscountModel,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.percentageDiscount != null -> generator.writeObject(value.percentageDiscount)
                value.trialDiscount != null -> generator.writeObject(value.trialDiscount)
                value.usageDiscount != null -> generator.writeObject(value.usageDiscount)
                value.amountDiscount != null -> generator.writeObject(value.amountDiscount)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid DiscountModel")
            }
        }
    }

    @NoAutoDetect
    class UsageDiscount
    @JsonCreator
    private constructor(
        @JsonProperty("applies_to_price_ids")
        @ExcludeMissing
        private val appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("discount_type")
        @ExcludeMissing
        private val discountType: JsonField<DiscountType> = JsonMissing.of(),
        @JsonProperty("usage_discount")
        @ExcludeMissing
        private val usageDiscount: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("reason")
        @ExcludeMissing
        private val reason: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * List of price_ids that this discount applies to. For plan/plan phase discounts, this can
         * be a subset of prices.
         */
        fun appliesToPriceIds(): List<String> =
            appliesToPriceIds.getRequired("applies_to_price_ids")

        fun discountType(): DiscountType = discountType.getRequired("discount_type")

        /**
         * Only available if discount_type is `usage`. Number of usage units that this discount is
         * for
         */
        fun usageDiscount(): Double = usageDiscount.getRequired("usage_discount")

        fun reason(): String? = reason.getNullable("reason")

        /**
         * List of price_ids that this discount applies to. For plan/plan phase discounts, this can
         * be a subset of prices.
         */
        @JsonProperty("applies_to_price_ids")
        @ExcludeMissing
        fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

        @JsonProperty("discount_type")
        @ExcludeMissing
        fun _discountType(): JsonField<DiscountType> = discountType

        /**
         * Only available if discount_type is `usage`. Number of usage units that this discount is
         * for
         */
        @JsonProperty("usage_discount")
        @ExcludeMissing
        fun _usageDiscount(): JsonField<Double> = usageDiscount

        @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): UsageDiscount = apply {
            if (validated) {
                return@apply
            }

            appliesToPriceIds()
            discountType()
            usageDiscount()
            reason()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [UsageDiscount].
             *
             * The following fields are required:
             * ```kotlin
             * .appliesToPriceIds()
             * .discountType()
             * .usageDiscount()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [UsageDiscount]. */
        class Builder internal constructor() {

            private var appliesToPriceIds: JsonField<MutableList<String>>? = null
            private var discountType: JsonField<DiscountType>? = null
            private var usageDiscount: JsonField<Double>? = null
            private var reason: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(usageDiscount: UsageDiscount) = apply {
                appliesToPriceIds = usageDiscount.appliesToPriceIds.map { it.toMutableList() }
                discountType = usageDiscount.discountType
                this.usageDiscount = usageDiscount.usageDiscount
                reason = usageDiscount.reason
                additionalProperties = usageDiscount.additionalProperties.toMutableMap()
            }

            /**
             * List of price_ids that this discount applies to. For plan/plan phase discounts, this
             * can be a subset of prices.
             */
            fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                appliesToPriceIds(JsonField.of(appliesToPriceIds))

            /**
             * List of price_ids that this discount applies to. For plan/plan phase discounts, this
             * can be a subset of prices.
             */
            fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
            }

            /**
             * List of price_ids that this discount applies to. For plan/plan phase discounts, this
             * can be a subset of prices.
             */
            fun addAppliesToPriceId(appliesToPriceId: String) = apply {
                appliesToPriceIds =
                    (appliesToPriceIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("appliesToPriceIds", it).add(appliesToPriceId)
                    }
            }

            fun discountType(discountType: DiscountType) = discountType(JsonField.of(discountType))

            fun discountType(discountType: JsonField<DiscountType>) = apply {
                this.discountType = discountType
            }

            /**
             * Only available if discount_type is `usage`. Number of usage units that this discount
             * is for
             */
            fun usageDiscount(usageDiscount: Double) = usageDiscount(JsonField.of(usageDiscount))

            /**
             * Only available if discount_type is `usage`. Number of usage units that this discount
             * is for
             */
            fun usageDiscount(usageDiscount: JsonField<Double>) = apply {
                this.usageDiscount = usageDiscount
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

            fun build(): UsageDiscount =
                UsageDiscount(
                    checkRequired("appliesToPriceIds", appliesToPriceIds).map { it.toImmutable() },
                    checkRequired("discountType", discountType),
                    checkRequired("usageDiscount", usageDiscount),
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
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val USAGE = of("usage")

                fun of(value: String) = DiscountType(JsonField.of(value))
            }

            /** An enum containing [DiscountType]'s known values. */
            enum class Known {
                USAGE
            }

            /**
             * An enum containing [DiscountType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [DiscountType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                USAGE,
                /**
                 * An enum member indicating that [DiscountType] was instantiated with an unknown
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
                    USAGE -> Value.USAGE
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
                    USAGE -> Known.USAGE
                    else -> throw OrbInvalidDataException("Unknown DiscountType: $value")
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

                return /* spotless:off */ other is DiscountType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is UsageDiscount && appliesToPriceIds == other.appliesToPriceIds && discountType == other.discountType && usageDiscount == other.usageDiscount && reason == other.reason && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(appliesToPriceIds, discountType, usageDiscount, reason, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "UsageDiscount{appliesToPriceIds=$appliesToPriceIds, discountType=$discountType, usageDiscount=$usageDiscount, reason=$reason, additionalProperties=$additionalProperties}"
    }
}
