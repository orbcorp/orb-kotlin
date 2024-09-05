// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.apache.hc.core5.http.ContentType
import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import java.util.UUID
import com.withorb.api.core.BaseDeserializer
import com.withorb.api.core.BaseSerializer
import com.withorb.api.core.getOrThrow
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.core.MultipartFormValue
import com.withorb.api.core.toUnmodifiable
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.Enum
import com.withorb.api.core.ContentTypes
import com.withorb.api.errors.OrbInvalidDataException
import com.withorb.api.models.*

class SubscriptionUpdateFixedFeeQuantityParams constructor(
  private val subscriptionId: String,
  private val priceId: String,
  private val quantity: Double,
  private val changeOption: ChangeOption?,
  private val effectiveDate: LocalDate?,
  private val additionalQueryParams: Map<String, List<String>>,
  private val additionalHeaders: Map<String, List<String>>,
  private val additionalBodyProperties: Map<String, JsonValue>,

) {

    fun subscriptionId(): String = subscriptionId

    fun priceId(): String = priceId

    fun quantity(): Double = quantity

    fun changeOption(): ChangeOption? = changeOption

    fun effectiveDate(): LocalDate? = effectiveDate

    internal fun getBody(): SubscriptionUpdateFixedFeeQuantityBody {
      return SubscriptionUpdateFixedFeeQuantityBody(
          priceId,
          quantity,
          changeOption,
          effectiveDate,
          additionalBodyProperties,
      )
    }

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
      return when (index) {
          0 -> subscriptionId
          else -> ""
      }
    }

    @JsonDeserialize(builder = SubscriptionUpdateFixedFeeQuantityBody.Builder::class)
    @NoAutoDetect
    class SubscriptionUpdateFixedFeeQuantityBody internal constructor(
      private val priceId: String?,
      private val quantity: Double?,
      private val changeOption: ChangeOption?,
      private val effectiveDate: LocalDate?,
      private val additionalProperties: Map<String, JsonValue>,

    ) {

        private var hashCode: Int = 0

        /** Price for which the quantity should be updated. Must be a fixed fee. */
        @JsonProperty("price_id")
        fun priceId(): String? = priceId

        @JsonProperty("quantity")
        fun quantity(): Double? = quantity

        /**
         * Determines when the change takes effect. Note that if `effective_date` is
         * specified, this defaults to `effective_date`. Otherwise, this defaults to
         * `immediate` unless it's explicitly set to `upcoming_invoice.
         */
        @JsonProperty("change_option")
        fun changeOption(): ChangeOption? = changeOption

        /**
         * The date that the quantity change should take effect, localized to the
         * customer's timezone. Ifthis parameter is not passed in, the quantity change is
         * effective according to `change_option`.
         */
        @JsonProperty("effective_date")
        fun effectiveDate(): LocalDate? = effectiveDate

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is SubscriptionUpdateFixedFeeQuantityBody &&
              this.priceId == other.priceId &&
              this.quantity == other.quantity &&
              this.changeOption == other.changeOption &&
              this.effectiveDate == other.effectiveDate &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(
                priceId,
                quantity,
                changeOption,
                effectiveDate,
                additionalProperties,
            )
          }
          return hashCode
        }

        override fun toString() = "SubscriptionUpdateFixedFeeQuantityBody{priceId=$priceId, quantity=$quantity, changeOption=$changeOption, effectiveDate=$effectiveDate, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var priceId: String? = null
            private var quantity: Double? = null
            private var changeOption: ChangeOption? = null
            private var effectiveDate: LocalDate? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(subscriptionUpdateFixedFeeQuantityBody: SubscriptionUpdateFixedFeeQuantityBody) = apply {
                this.priceId = subscriptionUpdateFixedFeeQuantityBody.priceId
                this.quantity = subscriptionUpdateFixedFeeQuantityBody.quantity
                this.changeOption = subscriptionUpdateFixedFeeQuantityBody.changeOption
                this.effectiveDate = subscriptionUpdateFixedFeeQuantityBody.effectiveDate
                additionalProperties(subscriptionUpdateFixedFeeQuantityBody.additionalProperties)
            }

            /** Price for which the quantity should be updated. Must be a fixed fee. */
            @JsonProperty("price_id")
            fun priceId(priceId: String) = apply {
                this.priceId = priceId
            }

            @JsonProperty("quantity")
            fun quantity(quantity: Double) = apply {
                this.quantity = quantity
            }

            /**
             * Determines when the change takes effect. Note that if `effective_date` is
             * specified, this defaults to `effective_date`. Otherwise, this defaults to
             * `immediate` unless it's explicitly set to `upcoming_invoice.
             */
            @JsonProperty("change_option")
            fun changeOption(changeOption: ChangeOption) = apply {
                this.changeOption = changeOption
            }

            /**
             * The date that the quantity change should take effect, localized to the
             * customer's timezone. Ifthis parameter is not passed in, the quantity change is
             * effective according to `change_option`.
             */
            @JsonProperty("effective_date")
            fun effectiveDate(effectiveDate: LocalDate) = apply {
                this.effectiveDate = effectiveDate
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

            fun build(): SubscriptionUpdateFixedFeeQuantityBody = SubscriptionUpdateFixedFeeQuantityBody(
                checkNotNull(priceId) {
                    "`priceId` is required but was not set"
                },
                checkNotNull(quantity) {
                    "`quantity` is required but was not set"
                },
                changeOption,
                effectiveDate,
                additionalProperties.toUnmodifiable(),
            )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is SubscriptionUpdateFixedFeeQuantityParams &&
          this.subscriptionId == other.subscriptionId &&
          this.priceId == other.priceId &&
          this.quantity == other.quantity &&
          this.changeOption == other.changeOption &&
          this.effectiveDate == other.effectiveDate &&
          this.additionalQueryParams == other.additionalQueryParams &&
          this.additionalHeaders == other.additionalHeaders &&
          this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
      return Objects.hash(
          subscriptionId,
          priceId,
          quantity,
          changeOption,
          effectiveDate,
          additionalQueryParams,
          additionalHeaders,
          additionalBodyProperties,
      )
    }

    override fun toString() = "SubscriptionUpdateFixedFeeQuantityParams{subscriptionId=$subscriptionId, priceId=$priceId, quantity=$quantity, changeOption=$changeOption, effectiveDate=$effectiveDate, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var subscriptionId: String? = null
        private var priceId: String? = null
        private var quantity: Double? = null
        private var changeOption: ChangeOption? = null
        private var effectiveDate: LocalDate? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(subscriptionUpdateFixedFeeQuantityParams: SubscriptionUpdateFixedFeeQuantityParams) = apply {
            this.subscriptionId = subscriptionUpdateFixedFeeQuantityParams.subscriptionId
            this.priceId = subscriptionUpdateFixedFeeQuantityParams.priceId
            this.quantity = subscriptionUpdateFixedFeeQuantityParams.quantity
            this.changeOption = subscriptionUpdateFixedFeeQuantityParams.changeOption
            this.effectiveDate = subscriptionUpdateFixedFeeQuantityParams.effectiveDate
            additionalQueryParams(subscriptionUpdateFixedFeeQuantityParams.additionalQueryParams)
            additionalHeaders(subscriptionUpdateFixedFeeQuantityParams.additionalHeaders)
            additionalBodyProperties(subscriptionUpdateFixedFeeQuantityParams.additionalBodyProperties)
        }

        fun subscriptionId(subscriptionId: String) = apply {
            this.subscriptionId = subscriptionId
        }

        /** Price for which the quantity should be updated. Must be a fixed fee. */
        fun priceId(priceId: String) = apply {
            this.priceId = priceId
        }

        fun quantity(quantity: Double) = apply {
            this.quantity = quantity
        }

        /**
         * Determines when the change takes effect. Note that if `effective_date` is
         * specified, this defaults to `effective_date`. Otherwise, this defaults to
         * `immediate` unless it's explicitly set to `upcoming_invoice.
         */
        fun changeOption(changeOption: ChangeOption) = apply {
            this.changeOption = changeOption
        }

        /**
         * The date that the quantity change should take effect, localized to the
         * customer's timezone. Ifthis parameter is not passed in, the quantity change is
         * effective according to `change_option`.
         */
        fun effectiveDate(effectiveDate: LocalDate) = apply {
            this.effectiveDate = effectiveDate
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply {
            this.additionalHeaders.put(name, mutableListOf())
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun build(): SubscriptionUpdateFixedFeeQuantityParams = SubscriptionUpdateFixedFeeQuantityParams(
            checkNotNull(subscriptionId) {
                "`subscriptionId` is required but was not set"
            },
            checkNotNull(priceId) {
                "`priceId` is required but was not set"
            },
            checkNotNull(quantity) {
                "`quantity` is required but was not set"
            },
            changeOption,
            effectiveDate,
            additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalBodyProperties.toUnmodifiable(),
        )
    }

    class ChangeOption @JsonCreator private constructor(private val value: JsonField<String>, ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is ChangeOption &&
              this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val IMMEDIATE = ChangeOption(JsonField.of("immediate"))

            val UPCOMING_INVOICE = ChangeOption(JsonField.of("upcoming_invoice"))

            val EFFECTIVE_DATE = ChangeOption(JsonField.of("effective_date"))

            fun of(value: String) = ChangeOption(JsonField.of(value))
        }

        enum class Known {
            IMMEDIATE,
            UPCOMING_INVOICE,
            EFFECTIVE_DATE,
        }

        enum class Value {
            IMMEDIATE,
            UPCOMING_INVOICE,
            EFFECTIVE_DATE,
            _UNKNOWN,
        }

        fun value(): Value = when (this) {
            IMMEDIATE -> Value.IMMEDIATE
            UPCOMING_INVOICE -> Value.UPCOMING_INVOICE
            EFFECTIVE_DATE -> Value.EFFECTIVE_DATE
            else -> Value._UNKNOWN
        }

        fun known(): Known = when (this) {
            IMMEDIATE -> Known.IMMEDIATE
            UPCOMING_INVOICE -> Known.UPCOMING_INVOICE
            EFFECTIVE_DATE -> Known.EFFECTIVE_DATE
            else -> throw OrbInvalidDataException("Unknown ChangeOption: $value")
        }

        fun asString(): String = _value().asStringOrThrow()
    }
}
