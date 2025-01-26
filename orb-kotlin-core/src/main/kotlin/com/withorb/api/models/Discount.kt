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

@JsonDeserialize(using = Discount.Deserializer::class)
@JsonSerialize(using = Discount.Serializer::class)
class Discount
private constructor(
    private val percentage: PercentageDiscount? = null,
    private val trial: TrialDiscount? = null,
    private val usage: UsageDiscount? = null,
    private val amount: AmountDiscount? = null,
    private val _json: JsonValue? = null,
) {

    fun percentage(): PercentageDiscount? = percentage

    fun trial(): TrialDiscount? = trial

    fun usage(): UsageDiscount? = usage

    fun amount(): AmountDiscount? = amount

    fun isPercentage(): Boolean = percentage != null

    fun isTrial(): Boolean = trial != null

    fun isUsage(): Boolean = usage != null

    fun isAmount(): Boolean = amount != null

    fun asPercentage(): PercentageDiscount = percentage.getOrThrow("percentage")

    fun asTrial(): TrialDiscount = trial.getOrThrow("trial")

    fun asUsage(): UsageDiscount = usage.getOrThrow("usage")

    fun asAmount(): AmountDiscount = amount.getOrThrow("amount")

    fun _json(): JsonValue? = _json

    fun <T> accept(visitor: Visitor<T>): T {
        return when {
            percentage != null -> visitor.visitPercentage(percentage)
            trial != null -> visitor.visitTrial(trial)
            usage != null -> visitor.visitUsage(usage)
            amount != null -> visitor.visitAmount(amount)
            else -> visitor.unknown(_json)
        }
    }

    private var validated: Boolean = false

    fun validate(): Discount = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitPercentage(percentage: PercentageDiscount) {
                    percentage.validate()
                }

                override fun visitTrial(trial: TrialDiscount) {
                    trial.validate()
                }

                override fun visitUsage(usage: UsageDiscount) {
                    usage.validate()
                }

                override fun visitAmount(amount: AmountDiscount) {
                    amount.validate()
                }
            }
        )
        validated = true
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Discount && percentage == other.percentage && trial == other.trial && usage == other.usage && amount == other.amount /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(percentage, trial, usage, amount) /* spotless:on */

    override fun toString(): String =
        when {
            percentage != null -> "Discount{percentage=$percentage}"
            trial != null -> "Discount{trial=$trial}"
            usage != null -> "Discount{usage=$usage}"
            amount != null -> "Discount{amount=$amount}"
            _json != null -> "Discount{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid Discount")
        }

    companion object {

        fun ofPercentage(percentage: PercentageDiscount) = Discount(percentage = percentage)

        fun ofTrial(trial: TrialDiscount) = Discount(trial = trial)

        fun ofUsage(usage: UsageDiscount) = Discount(usage = usage)

        fun ofAmount(amount: AmountDiscount) = Discount(amount = amount)
    }

    interface Visitor<out T> {

        fun visitPercentage(percentage: PercentageDiscount): T

        fun visitTrial(trial: TrialDiscount): T

        fun visitUsage(usage: UsageDiscount): T

        fun visitAmount(amount: AmountDiscount): T

        fun unknown(json: JsonValue?): T {
            throw OrbInvalidDataException("Unknown Discount: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<Discount>(Discount::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): Discount {
            val json = JsonValue.fromJsonNode(node)
            val discountType = json.asObject()?.get("discount_type")?.asString()

            when (discountType) {
                "percentage" -> {
                    tryDeserialize(node, jacksonTypeRef<PercentageDiscount>()) { it.validate() }
                        ?.let {
                            return Discount(percentage = it, _json = json)
                        }
                }
                "trial" -> {
                    tryDeserialize(node, jacksonTypeRef<TrialDiscount>()) { it.validate() }
                        ?.let {
                            return Discount(trial = it, _json = json)
                        }
                }
                "usage" -> {
                    tryDeserialize(node, jacksonTypeRef<UsageDiscount>()) { it.validate() }
                        ?.let {
                            return Discount(usage = it, _json = json)
                        }
                }
                "amount" -> {
                    tryDeserialize(node, jacksonTypeRef<AmountDiscount>()) { it.validate() }
                        ?.let {
                            return Discount(amount = it, _json = json)
                        }
                }
            }

            return Discount(_json = json)
        }
    }

    internal class Serializer : BaseSerializer<Discount>(Discount::class) {

        override fun serialize(
            value: Discount,
            generator: JsonGenerator,
            provider: SerializerProvider
        ) {
            when {
                value.percentage != null -> generator.writeObject(value.percentage)
                value.trial != null -> generator.writeObject(value.trial)
                value.usage != null -> generator.writeObject(value.usage)
                value.amount != null -> generator.writeObject(value.amount)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid Discount")
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

            fun builder() = Builder()
        }

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
                    (appliesToPriceIds ?: JsonField.of(mutableListOf())).apply {
                        (asKnown()
                                ?: throw IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                ))
                            .add(appliesToPriceId)
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

        class DiscountType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val USAGE = of("usage")

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
