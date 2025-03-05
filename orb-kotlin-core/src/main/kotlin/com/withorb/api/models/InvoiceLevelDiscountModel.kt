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

@JsonDeserialize(using = InvoiceLevelDiscountModel.Deserializer::class)
@JsonSerialize(using = InvoiceLevelDiscountModel.Serializer::class)
class InvoiceLevelDiscountModel
private constructor(
    private val percentageDiscount: PercentageDiscount? = null,
    private val amountDiscount: AmountDiscount? = null,
    private val trialDiscount: TrialDiscount? = null,
    private val _json: JsonValue? = null,
) {

    fun percentageDiscount(): PercentageDiscount? = percentageDiscount

    fun amountDiscount(): AmountDiscount? = amountDiscount

    fun trialDiscount(): TrialDiscount? = trialDiscount

    fun isPercentageDiscount(): Boolean = percentageDiscount != null

    fun isAmountDiscount(): Boolean = amountDiscount != null

    fun isTrialDiscount(): Boolean = trialDiscount != null

    fun asPercentageDiscount(): PercentageDiscount =
        percentageDiscount.getOrThrow("percentageDiscount")

    fun asAmountDiscount(): AmountDiscount = amountDiscount.getOrThrow("amountDiscount")

    fun asTrialDiscount(): TrialDiscount = trialDiscount.getOrThrow("trialDiscount")

    fun _json(): JsonValue? = _json

    fun <T> accept(visitor: Visitor<T>): T {
        return when {
            percentageDiscount != null -> visitor.visitPercentageDiscount(percentageDiscount)
            amountDiscount != null -> visitor.visitAmountDiscount(amountDiscount)
            trialDiscount != null -> visitor.visitTrialDiscount(trialDiscount)
            else -> visitor.unknown(_json)
        }
    }

    private var validated: Boolean = false

    fun validate(): InvoiceLevelDiscountModel = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitPercentageDiscount(percentageDiscount: PercentageDiscount) {
                    percentageDiscount.validate()
                }

                override fun visitAmountDiscount(amountDiscount: AmountDiscount) {
                    amountDiscount.validate()
                }

                override fun visitTrialDiscount(trialDiscount: TrialDiscount) {
                    trialDiscount.validate()
                }
            }
        )
        validated = true
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InvoiceLevelDiscountModel && percentageDiscount == other.percentageDiscount && amountDiscount == other.amountDiscount && trialDiscount == other.trialDiscount /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(percentageDiscount, amountDiscount, trialDiscount) /* spotless:on */

    override fun toString(): String =
        when {
            percentageDiscount != null ->
                "InvoiceLevelDiscountModel{percentageDiscount=$percentageDiscount}"
            amountDiscount != null -> "InvoiceLevelDiscountModel{amountDiscount=$amountDiscount}"
            trialDiscount != null -> "InvoiceLevelDiscountModel{trialDiscount=$trialDiscount}"
            _json != null -> "InvoiceLevelDiscountModel{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid InvoiceLevelDiscountModel")
        }

    companion object {

        fun ofPercentageDiscount(percentageDiscount: PercentageDiscount) =
            InvoiceLevelDiscountModel(percentageDiscount = percentageDiscount)

        fun ofAmountDiscount(amountDiscount: AmountDiscount) =
            InvoiceLevelDiscountModel(amountDiscount = amountDiscount)

        fun ofTrialDiscount(trialDiscount: TrialDiscount) =
            InvoiceLevelDiscountModel(trialDiscount = trialDiscount)
    }

    /**
     * An interface that defines how to map each variant of [InvoiceLevelDiscountModel] to a value
     * of type [T].
     */
    interface Visitor<out T> {

        fun visitPercentageDiscount(percentageDiscount: PercentageDiscount): T

        fun visitAmountDiscount(amountDiscount: AmountDiscount): T

        fun visitTrialDiscount(trialDiscount: TrialDiscount): T

        /**
         * Maps an unknown variant of [InvoiceLevelDiscountModel] to a value of type [T].
         *
         * An instance of [InvoiceLevelDiscountModel] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws OrbInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw OrbInvalidDataException("Unknown InvoiceLevelDiscountModel: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<InvoiceLevelDiscountModel>(InvoiceLevelDiscountModel::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): InvoiceLevelDiscountModel {
            val json = JsonValue.fromJsonNode(node)
            val discountType = json.asObject()?.get("discount_type")?.asString()

            when (discountType) {
                "percentage" -> {
                    tryDeserialize(node, jacksonTypeRef<PercentageDiscount>()) { it.validate() }
                        ?.let {
                            return InvoiceLevelDiscountModel(percentageDiscount = it, _json = json)
                        }
                }
                "amount" -> {
                    tryDeserialize(node, jacksonTypeRef<AmountDiscount>()) { it.validate() }
                        ?.let {
                            return InvoiceLevelDiscountModel(amountDiscount = it, _json = json)
                        }
                }
                "trial" -> {
                    tryDeserialize(node, jacksonTypeRef<TrialDiscount>()) { it.validate() }
                        ?.let {
                            return InvoiceLevelDiscountModel(trialDiscount = it, _json = json)
                        }
                }
            }

            return InvoiceLevelDiscountModel(_json = json)
        }
    }

    internal class Serializer :
        BaseSerializer<InvoiceLevelDiscountModel>(InvoiceLevelDiscountModel::class) {

        override fun serialize(
            value: InvoiceLevelDiscountModel,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.percentageDiscount != null -> generator.writeObject(value.percentageDiscount)
                value.amountDiscount != null -> generator.writeObject(value.amountDiscount)
                value.trialDiscount != null -> generator.writeObject(value.trialDiscount)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid InvoiceLevelDiscountModel")
            }
        }
    }
}
