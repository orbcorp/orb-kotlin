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
import java.util.Optional

@JsonDeserialize(using = InvoiceLevelDiscount.Deserializer::class)
@JsonSerialize(using = InvoiceLevelDiscount.Serializer::class)
class InvoiceLevelDiscount private constructor(
    private val percentage: PercentageDiscount? = null,
    private val amount: AmountDiscount? = null,
    private val trial: TrialDiscount? = null,
    private val _json: JsonValue? = null,

) {

    fun percentage(): PercentageDiscount? = percentage

    fun amount(): AmountDiscount? = amount

    fun trial(): TrialDiscount? = trial

    fun isPercentage(): Boolean = percentage != null

    fun isAmount(): Boolean = amount != null

    fun isTrial(): Boolean = trial != null

    fun asPercentage(): PercentageDiscount = percentage.getOrThrow("percentage")

    fun asAmount(): AmountDiscount = amount.getOrThrow("amount")

    fun asTrial(): TrialDiscount = trial.getOrThrow("trial")

    fun _json(): JsonValue? = _json

    fun <T> accept(visitor: Visitor<T>): T {
      return when {
          percentage != null -> visitor.visitPercentage(percentage)
          amount != null -> visitor.visitAmount(amount)
          trial != null -> visitor.visitTrial(trial)
          else -> visitor.unknown(_json)
      }
    }

    private var validated: Boolean = false

    fun validate(): InvoiceLevelDiscount =
        apply {
            if (validated) {
              return@apply
            }

            accept(object : Visitor<Unit> {
                override fun visitPercentage(percentage: PercentageDiscount) {
                  percentage.validate()
                }

                override fun visitAmount(amount: AmountDiscount) {
                  amount.validate()
                }

                override fun visitTrial(trial: TrialDiscount) {
                  trial.validate()
                }
            })
            validated = true
        }

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return /* spotless:off */ other is InvoiceLevelDiscount && percentage == other.percentage && amount == other.amount && trial == other.trial /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(percentage, amount, trial) /* spotless:on */

    override fun toString(): String =
        when {
            percentage != null -> "InvoiceLevelDiscount{percentage=$percentage}"
            amount != null -> "InvoiceLevelDiscount{amount=$amount}"
            trial != null -> "InvoiceLevelDiscount{trial=$trial}"
            _json != null -> "InvoiceLevelDiscount{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid InvoiceLevelDiscount")
        }

    companion object {

        fun ofPercentage(percentage: PercentageDiscount) = InvoiceLevelDiscount(percentage = percentage)

        fun ofAmount(amount: AmountDiscount) = InvoiceLevelDiscount(amount = amount)

        fun ofTrial(trial: TrialDiscount) = InvoiceLevelDiscount(trial = trial)
    }

    /**
     * An interface that defines how to map each variant of [InvoiceLevelDiscount] to a
     * value of type [T].
     */
    interface Visitor<out T> {

        fun visitPercentage(percentage: PercentageDiscount): T

        fun visitAmount(amount: AmountDiscount): T

        fun visitTrial(trial: TrialDiscount): T

        /**
         * Maps an unknown variant of [InvoiceLevelDiscount] to a value of type [T].
         *
         * An instance of [InvoiceLevelDiscount] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the
         * SDK is on an older version than the API, then the API may respond with new
         * variants that the SDK is unaware of.
         *
         * @throws OrbInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
          throw OrbInvalidDataException("Unknown InvoiceLevelDiscount: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<InvoiceLevelDiscount>(InvoiceLevelDiscount::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): InvoiceLevelDiscount {
          val json = JsonValue.fromJsonNode(node)
          val discountType = json.asObject()?.get("discount_type")?.asString()

          when (discountType) {
              "percentage" -> {
                  tryDeserialize(node, jacksonTypeRef<PercentageDiscount>()){ it.validate() }?.let {
                      return InvoiceLevelDiscount(percentage = it, _json = json)
                  }
              }
              "amount" -> {
                  tryDeserialize(node, jacksonTypeRef<AmountDiscount>()){ it.validate() }?.let {
                      return InvoiceLevelDiscount(amount = it, _json = json)
                  }
              }
              "trial" -> {
                  tryDeserialize(node, jacksonTypeRef<TrialDiscount>()){ it.validate() }?.let {
                      return InvoiceLevelDiscount(trial = it, _json = json)
                  }
              }
          }

          return InvoiceLevelDiscount(_json = json)
        }
    }

    internal class Serializer : BaseSerializer<InvoiceLevelDiscount>(InvoiceLevelDiscount::class) {

        override fun serialize(value: InvoiceLevelDiscount, generator: JsonGenerator, provider: SerializerProvider) {
          when {
              value.percentage != null -> generator.writeObject(value.percentage)
              value.amount != null -> generator.writeObject(value.amount)
              value.trial != null -> generator.writeObject(value.trial)
              value._json != null -> generator.writeObject(value._json)
              else -> throw IllegalStateException("Invalid InvoiceLevelDiscount")
          }
        }
    }
}
