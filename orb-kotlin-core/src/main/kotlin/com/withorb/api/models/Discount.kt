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

    /** An interface that defines how to map each variant of [Discount] to a value of type [T]. */
    interface Visitor<out T> {

        fun visitPercentage(percentage: PercentageDiscount): T

        fun visitTrial(trial: TrialDiscount): T

        fun visitUsage(usage: UsageDiscount): T

        fun visitAmount(amount: AmountDiscount): T

        /**
         * Maps an unknown variant of [Discount] to a value of type [T].
         *
         * An instance of [Discount] can contain an unknown variant if it was deserialized from data
         * that doesn't match any known variant. For example, if the SDK is on an older version than
         * the API, then the API may respond with new variants that the SDK is unaware of.
         *
         * @throws OrbInvalidDataException in the default implementation.
         */
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
                    return Discount(
                        percentage = deserialize(node, jacksonTypeRef<PercentageDiscount>()),
                        _json = json,
                    )
                }
                "trial" -> {
                    return Discount(
                        trial = deserialize(node, jacksonTypeRef<TrialDiscount>()),
                        _json = json,
                    )
                }
                "usage" -> {
                    return Discount(
                        usage = deserialize(node, jacksonTypeRef<UsageDiscount>()),
                        _json = json,
                    )
                }
                "amount" -> {
                    return Discount(
                        amount = deserialize(node, jacksonTypeRef<AmountDiscount>()),
                        _json = json,
                    )
                }
            }

            return Discount(_json = json)
        }
    }

    internal class Serializer : BaseSerializer<Discount>(Discount::class) {

        override fun serialize(
            value: Discount,
            generator: JsonGenerator,
            provider: SerializerProvider,
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
}
