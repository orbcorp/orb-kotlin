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
import com.withorb.api.core.getOrThrow
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.util.Objects

@JsonDeserialize(using = Discount.Deserializer::class)
@JsonSerialize(using = Discount.Serializer::class)
class Discount
private constructor(
    private val percentageDiscount: PercentageDiscount? = null,
    private val trialDiscount: TrialDiscount? = null,
    private val usageDiscount: UsageDiscount? = null,
    private val amountDiscount: AmountDiscount? = null,
    private val _json: JsonValue? = null,
) {

    private var validated: Boolean = false

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

    fun validate(): Discount = apply {
        if (!validated) {
            if (
                percentageDiscount == null &&
                    trialDiscount == null &&
                    usageDiscount == null &&
                    amountDiscount == null
            ) {
                throw OrbInvalidDataException("Unknown Discount: $_json")
            }
            percentageDiscount?.validate()
            trialDiscount?.validate()
            usageDiscount?.validate()
            amountDiscount?.validate()
            validated = true
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Discount && this.percentageDiscount == other.percentageDiscount && this.trialDiscount == other.trialDiscount && this.usageDiscount == other.usageDiscount && this.amountDiscount == other.amountDiscount /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(percentageDiscount, trialDiscount, usageDiscount, amountDiscount) /* spotless:on */
    }

    override fun toString(): String {
        return when {
            percentageDiscount != null -> "Discount{percentageDiscount=$percentageDiscount}"
            trialDiscount != null -> "Discount{trialDiscount=$trialDiscount}"
            usageDiscount != null -> "Discount{usageDiscount=$usageDiscount}"
            amountDiscount != null -> "Discount{amountDiscount=$amountDiscount}"
            _json != null -> "Discount{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid Discount")
        }
    }

    companion object {

        fun ofPercentageDiscount(percentageDiscount: PercentageDiscount) =
            Discount(percentageDiscount = percentageDiscount)

        fun ofTrialDiscount(trialDiscount: TrialDiscount) = Discount(trialDiscount = trialDiscount)

        fun ofUsageDiscount(usageDiscount: UsageDiscount) = Discount(usageDiscount = usageDiscount)

        fun ofAmountDiscount(amountDiscount: AmountDiscount) =
            Discount(amountDiscount = amountDiscount)
    }

    interface Visitor<out T> {

        fun visitPercentageDiscount(percentageDiscount: PercentageDiscount): T

        fun visitTrialDiscount(trialDiscount: TrialDiscount): T

        fun visitUsageDiscount(usageDiscount: UsageDiscount): T

        fun visitAmountDiscount(amountDiscount: AmountDiscount): T

        fun unknown(json: JsonValue?): T {
            throw OrbInvalidDataException("Unknown Discount: $json")
        }
    }

    class Deserializer : BaseDeserializer<Discount>(Discount::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): Discount {
            val json = JsonValue.fromJsonNode(node)
            val discountType = json.asObject()?.get("discount_type")?.asString()

            when (discountType) {
                "percentage" -> {
                    tryDeserialize(node, jacksonTypeRef<PercentageDiscount>()) { it.validate() }
                        ?.let {
                            return Discount(percentageDiscount = it, _json = json)
                        }
                }
                "trial" -> {
                    tryDeserialize(node, jacksonTypeRef<TrialDiscount>()) { it.validate() }
                        ?.let {
                            return Discount(trialDiscount = it, _json = json)
                        }
                }
                "usage" -> {
                    tryDeserialize(node, jacksonTypeRef<UsageDiscount>()) { it.validate() }
                        ?.let {
                            return Discount(usageDiscount = it, _json = json)
                        }
                }
                "amount" -> {
                    tryDeserialize(node, jacksonTypeRef<AmountDiscount>()) { it.validate() }
                        ?.let {
                            return Discount(amountDiscount = it, _json = json)
                        }
                }
            }

            return Discount(_json = json)
        }
    }

    class Serializer : BaseSerializer<Discount>(Discount::class) {

        override fun serialize(
            value: Discount,
            generator: JsonGenerator,
            provider: SerializerProvider
        ) {
            when {
                value.percentageDiscount != null -> generator.writeObject(value.percentageDiscount)
                value.trialDiscount != null -> generator.writeObject(value.trialDiscount)
                value.usageDiscount != null -> generator.writeObject(value.usageDiscount)
                value.amountDiscount != null -> generator.writeObject(value.amountDiscount)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid Discount")
            }
        }
    }

    @JsonDeserialize(builder = UsageDiscount.Builder::class)
    @NoAutoDetect
    class UsageDiscount
    private constructor(
        private val discountType: JsonField<DiscountType>,
        private val appliesToPriceIds: JsonField<List<String>>,
        private val reason: JsonField<String>,
        private val usageDiscount: JsonField<Double>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun discountType(): DiscountType = discountType.getRequired("discount_type")

        /**
         * List of price_ids that this discount applies to. For plan/plan phase discounts, this can
         * be a subset of prices.
         */
        fun appliesToPriceIds(): List<String> =
            appliesToPriceIds.getRequired("applies_to_price_ids")

        fun reason(): String? = reason.getNullable("reason")

        /**
         * Only available if discount_type is `usage`. Number of usage units that this discount is
         * for
         */
        fun usageDiscount(): Double = usageDiscount.getRequired("usage_discount")

        @JsonProperty("discount_type") @ExcludeMissing fun _discountType() = discountType

        /**
         * List of price_ids that this discount applies to. For plan/plan phase discounts, this can
         * be a subset of prices.
         */
        @JsonProperty("applies_to_price_ids")
        @ExcludeMissing
        fun _appliesToPriceIds() = appliesToPriceIds

        @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

        /**
         * Only available if discount_type is `usage`. Number of usage units that this discount is
         * for
         */
        @JsonProperty("usage_discount") @ExcludeMissing fun _usageDiscount() = usageDiscount

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): UsageDiscount = apply {
            if (!validated) {
                discountType()
                appliesToPriceIds()
                reason()
                usageDiscount()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var discountType: JsonField<DiscountType> = JsonMissing.of()
            private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
            private var reason: JsonField<String> = JsonMissing.of()
            private var usageDiscount: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(usageDiscount: UsageDiscount) = apply {
                this.discountType = usageDiscount.discountType
                this.appliesToPriceIds = usageDiscount.appliesToPriceIds
                this.reason = usageDiscount.reason
                this.usageDiscount = usageDiscount.usageDiscount
                additionalProperties(usageDiscount.additionalProperties)
            }

            fun discountType(discountType: DiscountType) = discountType(JsonField.of(discountType))

            @JsonProperty("discount_type")
            @ExcludeMissing
            fun discountType(discountType: JsonField<DiscountType>) = apply {
                this.discountType = discountType
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
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                this.appliesToPriceIds = appliesToPriceIds
            }

            fun reason(reason: String) = reason(JsonField.of(reason))

            @JsonProperty("reason")
            @ExcludeMissing
            fun reason(reason: JsonField<String>) = apply { this.reason = reason }

            /**
             * Only available if discount_type is `usage`. Number of usage units that this discount
             * is for
             */
            fun usageDiscount(usageDiscount: Double) = usageDiscount(JsonField.of(usageDiscount))

            /**
             * Only available if discount_type is `usage`. Number of usage units that this discount
             * is for
             */
            @JsonProperty("usage_discount")
            @ExcludeMissing
            fun usageDiscount(usageDiscount: JsonField<Double>) = apply {
                this.usageDiscount = usageDiscount
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): UsageDiscount =
                UsageDiscount(
                    discountType,
                    appliesToPriceIds.map { it.toImmutable() },
                    reason,
                    usageDiscount,
                    additionalProperties.toImmutable(),
                )
        }

        class DiscountType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is DiscountType && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val USAGE = DiscountType(JsonField.of("usage"))

                fun of(value: String) = DiscountType(JsonField.of(value))
            }

            enum class Known {
                USAGE,
            }

            enum class Value {
                USAGE,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    USAGE -> Value.USAGE
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    USAGE -> Known.USAGE
                    else -> throw OrbInvalidDataException("Unknown DiscountType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is UsageDiscount && this.discountType == other.discountType && this.appliesToPriceIds == other.appliesToPriceIds && this.reason == other.reason && this.usageDiscount == other.usageDiscount && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(discountType, appliesToPriceIds, reason, usageDiscount, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "UsageDiscount{discountType=$discountType, appliesToPriceIds=$appliesToPriceIds, reason=$reason, usageDiscount=$usageDiscount, additionalProperties=$additionalProperties}"
    }
}
