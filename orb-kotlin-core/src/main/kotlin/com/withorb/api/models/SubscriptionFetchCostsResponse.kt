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
import com.withorb.api.core.JsonMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.core.JsonNull
import com.withorb.api.core.JsonField
import com.withorb.api.core.Enum
import com.withorb.api.core.toUnmodifiable
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.errors.OrbInvalidDataException

@JsonDeserialize(builder = SubscriptionFetchCostsResponse.Builder::class)
@NoAutoDetect
class SubscriptionFetchCostsResponse private constructor(private val data: JsonField<List<Data>>, private val additionalProperties: Map<String, JsonValue>, ) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun data(): List<Data> = data.getRequired("data")

    @JsonProperty("data")
    @ExcludeMissing
    fun _data() = data

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): SubscriptionFetchCostsResponse = apply {
        if (!validated) {
          data().forEach { it.validate() }
          validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is SubscriptionFetchCostsResponse &&
          this.data == other.data &&
          this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
      if (hashCode == 0) {
        hashCode = Objects.hash(data, additionalProperties)
      }
      return hashCode
    }

    override fun toString() = "SubscriptionFetchCostsResponse{data=$data, additionalProperties=$additionalProperties}"

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var data: JsonField<List<Data>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(subscriptionFetchCostsResponse: SubscriptionFetchCostsResponse) = apply {
            this.data = subscriptionFetchCostsResponse.data
            additionalProperties(subscriptionFetchCostsResponse.additionalProperties)
        }

        fun data(data: List<Data>) = data(JsonField.of(data))

        @JsonProperty("data")
        @ExcludeMissing
        fun data(data: JsonField<List<Data>>) = apply {
            this.data = data
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

        fun build(): SubscriptionFetchCostsResponse = SubscriptionFetchCostsResponse(data.map { it.toUnmodifiable() }, additionalProperties.toUnmodifiable())
    }

    @JsonDeserialize(builder = Data.Builder::class)
    @NoAutoDetect
    class Data private constructor(
      private val subtotal: JsonField<String>,
      private val total: JsonField<String>,
      private val timeframeStart: JsonField<OffsetDateTime>,
      private val timeframeEnd: JsonField<OffsetDateTime>,
      private val perPriceCosts: JsonField<List<PerPriceCost>>,
      private val additionalProperties: Map<String, JsonValue>,

    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** Total costs for the timeframe, excluding any minimums and discounts. */
        fun subtotal(): String = subtotal.getRequired("subtotal")

        /** Total costs for the timeframe, including any minimums and discounts. */
        fun total(): String = total.getRequired("total")

        fun timeframeStart(): OffsetDateTime = timeframeStart.getRequired("timeframe_start")

        fun timeframeEnd(): OffsetDateTime = timeframeEnd.getRequired("timeframe_end")

        fun perPriceCosts(): List<PerPriceCost> = perPriceCosts.getRequired("per_price_costs")

        /** Total costs for the timeframe, excluding any minimums and discounts. */
        @JsonProperty("subtotal")
        @ExcludeMissing
        fun _subtotal() = subtotal

        /** Total costs for the timeframe, including any minimums and discounts. */
        @JsonProperty("total")
        @ExcludeMissing
        fun _total() = total

        @JsonProperty("timeframe_start")
        @ExcludeMissing
        fun _timeframeStart() = timeframeStart

        @JsonProperty("timeframe_end")
        @ExcludeMissing
        fun _timeframeEnd() = timeframeEnd

        @JsonProperty("per_price_costs")
        @ExcludeMissing
        fun _perPriceCosts() = perPriceCosts

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Data = apply {
            if (!validated) {
              subtotal()
              total()
              timeframeStart()
              timeframeEnd()
              perPriceCosts().forEach { it.validate() }
              validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is Data &&
              this.subtotal == other.subtotal &&
              this.total == other.total &&
              this.timeframeStart == other.timeframeStart &&
              this.timeframeEnd == other.timeframeEnd &&
              this.perPriceCosts == other.perPriceCosts &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(
                subtotal,
                total,
                timeframeStart,
                timeframeEnd,
                perPriceCosts,
                additionalProperties,
            )
          }
          return hashCode
        }

        override fun toString() = "Data{subtotal=$subtotal, total=$total, timeframeStart=$timeframeStart, timeframeEnd=$timeframeEnd, perPriceCosts=$perPriceCosts, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var subtotal: JsonField<String> = JsonMissing.of()
            private var total: JsonField<String> = JsonMissing.of()
            private var timeframeStart: JsonField<OffsetDateTime> = JsonMissing.of()
            private var timeframeEnd: JsonField<OffsetDateTime> = JsonMissing.of()
            private var perPriceCosts: JsonField<List<PerPriceCost>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(data: Data) = apply {
                this.subtotal = data.subtotal
                this.total = data.total
                this.timeframeStart = data.timeframeStart
                this.timeframeEnd = data.timeframeEnd
                this.perPriceCosts = data.perPriceCosts
                additionalProperties(data.additionalProperties)
            }

            /** Total costs for the timeframe, excluding any minimums and discounts. */
            fun subtotal(subtotal: String) = subtotal(JsonField.of(subtotal))

            /** Total costs for the timeframe, excluding any minimums and discounts. */
            @JsonProperty("subtotal")
            @ExcludeMissing
            fun subtotal(subtotal: JsonField<String>) = apply {
                this.subtotal = subtotal
            }

            /** Total costs for the timeframe, including any minimums and discounts. */
            fun total(total: String) = total(JsonField.of(total))

            /** Total costs for the timeframe, including any minimums and discounts. */
            @JsonProperty("total")
            @ExcludeMissing
            fun total(total: JsonField<String>) = apply {
                this.total = total
            }

            fun timeframeStart(timeframeStart: OffsetDateTime) = timeframeStart(JsonField.of(timeframeStart))

            @JsonProperty("timeframe_start")
            @ExcludeMissing
            fun timeframeStart(timeframeStart: JsonField<OffsetDateTime>) = apply {
                this.timeframeStart = timeframeStart
            }

            fun timeframeEnd(timeframeEnd: OffsetDateTime) = timeframeEnd(JsonField.of(timeframeEnd))

            @JsonProperty("timeframe_end")
            @ExcludeMissing
            fun timeframeEnd(timeframeEnd: JsonField<OffsetDateTime>) = apply {
                this.timeframeEnd = timeframeEnd
            }

            fun perPriceCosts(perPriceCosts: List<PerPriceCost>) = perPriceCosts(JsonField.of(perPriceCosts))

            @JsonProperty("per_price_costs")
            @ExcludeMissing
            fun perPriceCosts(perPriceCosts: JsonField<List<PerPriceCost>>) = apply {
                this.perPriceCosts = perPriceCosts
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

            fun build(): Data = Data(
                subtotal,
                total,
                timeframeStart,
                timeframeEnd,
                perPriceCosts.map { it.toUnmodifiable() },
                additionalProperties.toUnmodifiable(),
            )
        }

        @JsonDeserialize(builder = PerPriceCost.Builder::class)
        @NoAutoDetect
        class PerPriceCost private constructor(
          private val quantity: JsonField<Double>,
          private val subtotal: JsonField<String>,
          private val total: JsonField<String>,
          private val price: JsonField<Price>,
          private val additionalProperties: Map<String, JsonValue>,

        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** The price's quantity for the timeframe */
            fun quantity(): Double? = quantity.getNullable("quantity")

            /** Price's contributions for the timeframe, excluding any minimums and discounts. */
            fun subtotal(): String = subtotal.getRequired("subtotal")

            /** Price's contributions for the timeframe, including minimums and discounts. */
            fun total(): String = total.getRequired("total")

            /**
             * The Price resource represents a price that can be billed on a subscription,
             * resulting in a charge on an invoice in the form of an invoice line item. Prices
             * take a quantity and determine an amount to bill.
             *
             * Orb supports a few different pricing models out of the box. Each of these models
             * is serialized differently in a given Price object. The model_type field
             * determines the key for the configuration object that is present.
             *
             * ## Unit pricing
             *
             * With unit pricing, each unit costs a fixed amount.
             *
             * ```json
             * {
             *     ...
             *     "model_type": "unit",
             *     "unit_config": {
             *         "unit_amount": "0.50"
             *     }
             *     ...
             * }
             * ```
             *
             * ## Tiered pricing
             *
             * In tiered pricing, the cost of a given unit depends on the tier range that it
             * falls into, where each tier range is defined by an upper and lower bound. For
             * example, the first ten units may cost $0.50 each and all units thereafter may
             * cost $0.10 each.
             *
             * ```json
             * {
             *     ...
             *     "model_type": "tiered",
             *     "tiered_config": {
             *         "tiers": [
             *             {
             *                 "first_unit": 1,
             *                 "last_unit": 10,
             *                 "unit_amount": "0.50"
             *             },
             *             {
             *                 "first_unit": 11,
             *                 "last_unit": null,
             *                 "unit_amount": "0.10"
             *             }
             *         ]
             *     }
             *     ...
             * ```
             *
             * ## Bulk pricing
             *
             * Bulk pricing applies when the number of units determine the cost of all units.
             * For example, if you've bought less than 10 units, they may each be $0.50 for a
             * total of $5.00. Once you've bought more than 10 units, all units may now be
             * priced at $0.40 (i.e. 101 units total would be $40.40).
             *
             * ```json
             * {
             *     ...
             *     "model_type": "bulk",
             *     "bulk_config": {
             *         "tiers": [
             *             {
             *                 "maximum_units": 10,
             *                 "unit_amount": "0.50"
             *             },
             *             {
             *                 "maximum_units": 1000,
             *                 "unit_amount": "0.40"
             *             }
             *         ]
             *     }
             *     ...
             * }
             * ```
             *
             * ## Package pricing
             *
             * Package pricing defines the size or granularity of a unit for billing purposes.
             * For example, if the package size is set to 5, then 4 units will be billed as 5
             * and 6 units will be billed at 10.
             *
             * ```json
             * {
             *     ...
             *     "model_type": "package",
             *     "package_config": {
             *         "package_amount": "0.80",
             *         "package_size": 10
             *     }
             *     ...
             * }
             * ```
             *
             * ## BPS pricing
             *
             * BPS pricing specifies a per-event (e.g. per-payment) rate in one hundredth of a
             * percent (the number of basis points to charge), as well as a cap per event to
             * assess. For example, this would allow you to assess a fee of 0.25% on every
             * payment you process, with a maximum charge of $25 per payment.
             *
             * ```json
             * {
             *     ...
             *     "model_type": "bps",
             *     "bps_config": {
             *        "bps": 125,
             *        "per_unit_maximum": "11.00"
             *     }
             *     ...
             *  }
             * ```
             *
             * ## Bulk BPS pricing
             *
             * Bulk BPS pricing specifies BPS parameters in a tiered manner, dependent on the
             * total quantity across all events. Similar to bulk pricing, the BPS parameters of
             * a given event depends on the tier range that the billing period falls into. Each
             * tier range is defined by an upper bound. For example, after $1.5M of payment
             * volume is reached, each individual payment may have a lower cap or a smaller
             * take-rate.
             *
             * ```json
             *     ...
             *     "model_type": "bulk_bps",
             *     "bulk_bps_config": {
             *         "tiers": [
             *            {
             *                 "maximum_amount": "1000000.00",
             *                 "bps": 125,
             *                 "per_unit_maximum": "19.00"
             *            },
             *           {
             *                 "maximum_amount": null,
             *                 "bps": 115,
             *                 "per_unit_maximum": "4.00"
             *             }
             *         ]
             *     }
             *     ...
             * }
             * ```
             *
             * ## Tiered BPS pricing
             *
             * Tiered BPS pricing specifies BPS parameters in a graduated manner, where an
             * event's applicable parameter is a function of its marginal addition to the
             * period total. Similar to tiered pricing, the BPS parameters of a given event
             * depends on the tier range that it falls into, where each tier range is defined
             * by an upper and lower bound. For example, the first few payments may have a 0.8
             * BPS take-rate and all payments after a specific volume may incur a take-rate of
             * 0.5 BPS each.
             *
             * ```json
             *     ...
             *     "model_type": "tiered_bps",
             *     "tiered_bps_config": {
             *         "tiers": [
             *            {
             *                 "minimum_amount": "0",
             *                 "maximum_amount": "1000000.00",
             *                 "bps": 125,
             *                 "per_unit_maximum": "19.00"
             *            },
             *           {
             *                 "minimum_amount": "1000000.00",
             *                 "maximum_amount": null,
             *                 "bps": 115,
             *                 "per_unit_maximum": "4.00"
             *             }
             *         ]
             *     }
             *     ...
             * }
             * ```
             *
             * ## Matrix pricing
             *
             * Matrix pricing defines a set of unit prices in a one or two-dimensional matrix.
             * `dimensions` defines the two event property values evaluated in this pricing
             * model. In a one-dimensional matrix, the second value is `null`. Every
             * configuration has a list of `matrix_values` which give the unit prices for
             * specified property values. In a one-dimensional matrix, the matrix values will
             * have `dimension_values` where the second value of the pair is null. If an event
             * does not match any of the dimension values in the matrix, it will resort to the
             * `default_unit_amount`.
             *
             * ```json
             * {
             *     "model_type": "matrix"
             *     "matrix_config": {
             *         "default_unit_amount": "3.00",
             *         "dimensions": [
             *             "cluster_name",
             *             "region"
             *         ],
             *         "matrix_values": [
             *             {
             *                 "dimension_values": [
             *                     "alpha",
             *                     "west"
             *                 ],
             *                 "unit_amount": "2.00"
             *             },
             *             ...
             *         ]
             *     }
             * }
             * ```
             *
             * ## Fixed fees
             *
             * Fixed fees are prices that are applied independent of usage quantities, and
             * follow unit pricing. They also have an additional parameter
             * `fixed_price_quantity`. If the Price represents a fixed cost, this represents
             * the quantity of units applied.
             *
             * ```json
             * {
             *     ...
             *     "id": "price_id",
             *     "model_type": "unit",
             *     "unit_config": {
             *        "unit_amount": "2.00"
             *     },
             *     "fixed_price_quantity": 3.0
             *     ...
             * }
             * ```
             */
            fun price(): Price = price.getRequired("price")

            /** The price's quantity for the timeframe */
            @JsonProperty("quantity")
            @ExcludeMissing
            fun _quantity() = quantity

            /** Price's contributions for the timeframe, excluding any minimums and discounts. */
            @JsonProperty("subtotal")
            @ExcludeMissing
            fun _subtotal() = subtotal

            /** Price's contributions for the timeframe, including minimums and discounts. */
            @JsonProperty("total")
            @ExcludeMissing
            fun _total() = total

            /**
             * The Price resource represents a price that can be billed on a subscription,
             * resulting in a charge on an invoice in the form of an invoice line item. Prices
             * take a quantity and determine an amount to bill.
             *
             * Orb supports a few different pricing models out of the box. Each of these models
             * is serialized differently in a given Price object. The model_type field
             * determines the key for the configuration object that is present.
             *
             * ## Unit pricing
             *
             * With unit pricing, each unit costs a fixed amount.
             *
             * ```json
             * {
             *     ...
             *     "model_type": "unit",
             *     "unit_config": {
             *         "unit_amount": "0.50"
             *     }
             *     ...
             * }
             * ```
             *
             * ## Tiered pricing
             *
             * In tiered pricing, the cost of a given unit depends on the tier range that it
             * falls into, where each tier range is defined by an upper and lower bound. For
             * example, the first ten units may cost $0.50 each and all units thereafter may
             * cost $0.10 each.
             *
             * ```json
             * {
             *     ...
             *     "model_type": "tiered",
             *     "tiered_config": {
             *         "tiers": [
             *             {
             *                 "first_unit": 1,
             *                 "last_unit": 10,
             *                 "unit_amount": "0.50"
             *             },
             *             {
             *                 "first_unit": 11,
             *                 "last_unit": null,
             *                 "unit_amount": "0.10"
             *             }
             *         ]
             *     }
             *     ...
             * ```
             *
             * ## Bulk pricing
             *
             * Bulk pricing applies when the number of units determine the cost of all units.
             * For example, if you've bought less than 10 units, they may each be $0.50 for a
             * total of $5.00. Once you've bought more than 10 units, all units may now be
             * priced at $0.40 (i.e. 101 units total would be $40.40).
             *
             * ```json
             * {
             *     ...
             *     "model_type": "bulk",
             *     "bulk_config": {
             *         "tiers": [
             *             {
             *                 "maximum_units": 10,
             *                 "unit_amount": "0.50"
             *             },
             *             {
             *                 "maximum_units": 1000,
             *                 "unit_amount": "0.40"
             *             }
             *         ]
             *     }
             *     ...
             * }
             * ```
             *
             * ## Package pricing
             *
             * Package pricing defines the size or granularity of a unit for billing purposes.
             * For example, if the package size is set to 5, then 4 units will be billed as 5
             * and 6 units will be billed at 10.
             *
             * ```json
             * {
             *     ...
             *     "model_type": "package",
             *     "package_config": {
             *         "package_amount": "0.80",
             *         "package_size": 10
             *     }
             *     ...
             * }
             * ```
             *
             * ## BPS pricing
             *
             * BPS pricing specifies a per-event (e.g. per-payment) rate in one hundredth of a
             * percent (the number of basis points to charge), as well as a cap per event to
             * assess. For example, this would allow you to assess a fee of 0.25% on every
             * payment you process, with a maximum charge of $25 per payment.
             *
             * ```json
             * {
             *     ...
             *     "model_type": "bps",
             *     "bps_config": {
             *        "bps": 125,
             *        "per_unit_maximum": "11.00"
             *     }
             *     ...
             *  }
             * ```
             *
             * ## Bulk BPS pricing
             *
             * Bulk BPS pricing specifies BPS parameters in a tiered manner, dependent on the
             * total quantity across all events. Similar to bulk pricing, the BPS parameters of
             * a given event depends on the tier range that the billing period falls into. Each
             * tier range is defined by an upper bound. For example, after $1.5M of payment
             * volume is reached, each individual payment may have a lower cap or a smaller
             * take-rate.
             *
             * ```json
             *     ...
             *     "model_type": "bulk_bps",
             *     "bulk_bps_config": {
             *         "tiers": [
             *            {
             *                 "maximum_amount": "1000000.00",
             *                 "bps": 125,
             *                 "per_unit_maximum": "19.00"
             *            },
             *           {
             *                 "maximum_amount": null,
             *                 "bps": 115,
             *                 "per_unit_maximum": "4.00"
             *             }
             *         ]
             *     }
             *     ...
             * }
             * ```
             *
             * ## Tiered BPS pricing
             *
             * Tiered BPS pricing specifies BPS parameters in a graduated manner, where an
             * event's applicable parameter is a function of its marginal addition to the
             * period total. Similar to tiered pricing, the BPS parameters of a given event
             * depends on the tier range that it falls into, where each tier range is defined
             * by an upper and lower bound. For example, the first few payments may have a 0.8
             * BPS take-rate and all payments after a specific volume may incur a take-rate of
             * 0.5 BPS each.
             *
             * ```json
             *     ...
             *     "model_type": "tiered_bps",
             *     "tiered_bps_config": {
             *         "tiers": [
             *            {
             *                 "minimum_amount": "0",
             *                 "maximum_amount": "1000000.00",
             *                 "bps": 125,
             *                 "per_unit_maximum": "19.00"
             *            },
             *           {
             *                 "minimum_amount": "1000000.00",
             *                 "maximum_amount": null,
             *                 "bps": 115,
             *                 "per_unit_maximum": "4.00"
             *             }
             *         ]
             *     }
             *     ...
             * }
             * ```
             *
             * ## Matrix pricing
             *
             * Matrix pricing defines a set of unit prices in a one or two-dimensional matrix.
             * `dimensions` defines the two event property values evaluated in this pricing
             * model. In a one-dimensional matrix, the second value is `null`. Every
             * configuration has a list of `matrix_values` which give the unit prices for
             * specified property values. In a one-dimensional matrix, the matrix values will
             * have `dimension_values` where the second value of the pair is null. If an event
             * does not match any of the dimension values in the matrix, it will resort to the
             * `default_unit_amount`.
             *
             * ```json
             * {
             *     "model_type": "matrix"
             *     "matrix_config": {
             *         "default_unit_amount": "3.00",
             *         "dimensions": [
             *             "cluster_name",
             *             "region"
             *         ],
             *         "matrix_values": [
             *             {
             *                 "dimension_values": [
             *                     "alpha",
             *                     "west"
             *                 ],
             *                 "unit_amount": "2.00"
             *             },
             *             ...
             *         ]
             *     }
             * }
             * ```
             *
             * ## Fixed fees
             *
             * Fixed fees are prices that are applied independent of usage quantities, and
             * follow unit pricing. They also have an additional parameter
             * `fixed_price_quantity`. If the Price represents a fixed cost, this represents
             * the quantity of units applied.
             *
             * ```json
             * {
             *     ...
             *     "id": "price_id",
             *     "model_type": "unit",
             *     "unit_config": {
             *        "unit_amount": "2.00"
             *     },
             *     "fixed_price_quantity": 3.0
             *     ...
             * }
             * ```
             */
            @JsonProperty("price")
            @ExcludeMissing
            fun _price() = price

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): PerPriceCost = apply {
                if (!validated) {
                  quantity()
                  subtotal()
                  total()
                  price()
                  validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
              if (this === other) {
                  return true
              }

              return other is PerPriceCost &&
                  this.quantity == other.quantity &&
                  this.subtotal == other.subtotal &&
                  this.total == other.total &&
                  this.price == other.price &&
                  this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
              if (hashCode == 0) {
                hashCode = Objects.hash(
                    quantity,
                    subtotal,
                    total,
                    price,
                    additionalProperties,
                )
              }
              return hashCode
            }

            override fun toString() = "PerPriceCost{quantity=$quantity, subtotal=$subtotal, total=$total, price=$price, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var quantity: JsonField<Double> = JsonMissing.of()
                private var subtotal: JsonField<String> = JsonMissing.of()
                private var total: JsonField<String> = JsonMissing.of()
                private var price: JsonField<Price> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(perPriceCost: PerPriceCost) = apply {
                    this.quantity = perPriceCost.quantity
                    this.subtotal = perPriceCost.subtotal
                    this.total = perPriceCost.total
                    this.price = perPriceCost.price
                    additionalProperties(perPriceCost.additionalProperties)
                }

                /** The price's quantity for the timeframe */
                fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                /** The price's quantity for the timeframe */
                @JsonProperty("quantity")
                @ExcludeMissing
                fun quantity(quantity: JsonField<Double>) = apply {
                    this.quantity = quantity
                }

                /** Price's contributions for the timeframe, excluding any minimums and discounts. */
                fun subtotal(subtotal: String) = subtotal(JsonField.of(subtotal))

                /** Price's contributions for the timeframe, excluding any minimums and discounts. */
                @JsonProperty("subtotal")
                @ExcludeMissing
                fun subtotal(subtotal: JsonField<String>) = apply {
                    this.subtotal = subtotal
                }

                /** Price's contributions for the timeframe, including minimums and discounts. */
                fun total(total: String) = total(JsonField.of(total))

                /** Price's contributions for the timeframe, including minimums and discounts. */
                @JsonProperty("total")
                @ExcludeMissing
                fun total(total: JsonField<String>) = apply {
                    this.total = total
                }

                /**
                 * The Price resource represents a price that can be billed on a subscription,
                 * resulting in a charge on an invoice in the form of an invoice line item. Prices
                 * take a quantity and determine an amount to bill.
                 *
                 * Orb supports a few different pricing models out of the box. Each of these models
                 * is serialized differently in a given Price object. The model_type field
                 * determines the key for the configuration object that is present.
                 *
                 * ## Unit pricing
                 *
                 * With unit pricing, each unit costs a fixed amount.
                 *
                 * ```json
                 * {
                 *     ...
                 *     "model_type": "unit",
                 *     "unit_config": {
                 *         "unit_amount": "0.50"
                 *     }
                 *     ...
                 * }
                 * ```
                 *
                 * ## Tiered pricing
                 *
                 * In tiered pricing, the cost of a given unit depends on the tier range that it
                 * falls into, where each tier range is defined by an upper and lower bound. For
                 * example, the first ten units may cost $0.50 each and all units thereafter may
                 * cost $0.10 each.
                 *
                 * ```json
                 * {
                 *     ...
                 *     "model_type": "tiered",
                 *     "tiered_config": {
                 *         "tiers": [
                 *             {
                 *                 "first_unit": 1,
                 *                 "last_unit": 10,
                 *                 "unit_amount": "0.50"
                 *             },
                 *             {
                 *                 "first_unit": 11,
                 *                 "last_unit": null,
                 *                 "unit_amount": "0.10"
                 *             }
                 *         ]
                 *     }
                 *     ...
                 * ```
                 *
                 * ## Bulk pricing
                 *
                 * Bulk pricing applies when the number of units determine the cost of all units.
                 * For example, if you've bought less than 10 units, they may each be $0.50 for a
                 * total of $5.00. Once you've bought more than 10 units, all units may now be
                 * priced at $0.40 (i.e. 101 units total would be $40.40).
                 *
                 * ```json
                 * {
                 *     ...
                 *     "model_type": "bulk",
                 *     "bulk_config": {
                 *         "tiers": [
                 *             {
                 *                 "maximum_units": 10,
                 *                 "unit_amount": "0.50"
                 *             },
                 *             {
                 *                 "maximum_units": 1000,
                 *                 "unit_amount": "0.40"
                 *             }
                 *         ]
                 *     }
                 *     ...
                 * }
                 * ```
                 *
                 * ## Package pricing
                 *
                 * Package pricing defines the size or granularity of a unit for billing purposes.
                 * For example, if the package size is set to 5, then 4 units will be billed as 5
                 * and 6 units will be billed at 10.
                 *
                 * ```json
                 * {
                 *     ...
                 *     "model_type": "package",
                 *     "package_config": {
                 *         "package_amount": "0.80",
                 *         "package_size": 10
                 *     }
                 *     ...
                 * }
                 * ```
                 *
                 * ## BPS pricing
                 *
                 * BPS pricing specifies a per-event (e.g. per-payment) rate in one hundredth of a
                 * percent (the number of basis points to charge), as well as a cap per event to
                 * assess. For example, this would allow you to assess a fee of 0.25% on every
                 * payment you process, with a maximum charge of $25 per payment.
                 *
                 * ```json
                 * {
                 *     ...
                 *     "model_type": "bps",
                 *     "bps_config": {
                 *        "bps": 125,
                 *        "per_unit_maximum": "11.00"
                 *     }
                 *     ...
                 *  }
                 * ```
                 *
                 * ## Bulk BPS pricing
                 *
                 * Bulk BPS pricing specifies BPS parameters in a tiered manner, dependent on the
                 * total quantity across all events. Similar to bulk pricing, the BPS parameters of
                 * a given event depends on the tier range that the billing period falls into. Each
                 * tier range is defined by an upper bound. For example, after $1.5M of payment
                 * volume is reached, each individual payment may have a lower cap or a smaller
                 * take-rate.
                 *
                 * ```json
                 *     ...
                 *     "model_type": "bulk_bps",
                 *     "bulk_bps_config": {
                 *         "tiers": [
                 *            {
                 *                 "maximum_amount": "1000000.00",
                 *                 "bps": 125,
                 *                 "per_unit_maximum": "19.00"
                 *            },
                 *           {
                 *                 "maximum_amount": null,
                 *                 "bps": 115,
                 *                 "per_unit_maximum": "4.00"
                 *             }
                 *         ]
                 *     }
                 *     ...
                 * }
                 * ```
                 *
                 * ## Tiered BPS pricing
                 *
                 * Tiered BPS pricing specifies BPS parameters in a graduated manner, where an
                 * event's applicable parameter is a function of its marginal addition to the
                 * period total. Similar to tiered pricing, the BPS parameters of a given event
                 * depends on the tier range that it falls into, where each tier range is defined
                 * by an upper and lower bound. For example, the first few payments may have a 0.8
                 * BPS take-rate and all payments after a specific volume may incur a take-rate of
                 * 0.5 BPS each.
                 *
                 * ```json
                 *     ...
                 *     "model_type": "tiered_bps",
                 *     "tiered_bps_config": {
                 *         "tiers": [
                 *            {
                 *                 "minimum_amount": "0",
                 *                 "maximum_amount": "1000000.00",
                 *                 "bps": 125,
                 *                 "per_unit_maximum": "19.00"
                 *            },
                 *           {
                 *                 "minimum_amount": "1000000.00",
                 *                 "maximum_amount": null,
                 *                 "bps": 115,
                 *                 "per_unit_maximum": "4.00"
                 *             }
                 *         ]
                 *     }
                 *     ...
                 * }
                 * ```
                 *
                 * ## Matrix pricing
                 *
                 * Matrix pricing defines a set of unit prices in a one or two-dimensional matrix.
                 * `dimensions` defines the two event property values evaluated in this pricing
                 * model. In a one-dimensional matrix, the second value is `null`. Every
                 * configuration has a list of `matrix_values` which give the unit prices for
                 * specified property values. In a one-dimensional matrix, the matrix values will
                 * have `dimension_values` where the second value of the pair is null. If an event
                 * does not match any of the dimension values in the matrix, it will resort to the
                 * `default_unit_amount`.
                 *
                 * ```json
                 * {
                 *     "model_type": "matrix"
                 *     "matrix_config": {
                 *         "default_unit_amount": "3.00",
                 *         "dimensions": [
                 *             "cluster_name",
                 *             "region"
                 *         ],
                 *         "matrix_values": [
                 *             {
                 *                 "dimension_values": [
                 *                     "alpha",
                 *                     "west"
                 *                 ],
                 *                 "unit_amount": "2.00"
                 *             },
                 *             ...
                 *         ]
                 *     }
                 * }
                 * ```
                 *
                 * ## Fixed fees
                 *
                 * Fixed fees are prices that are applied independent of usage quantities, and
                 * follow unit pricing. They also have an additional parameter
                 * `fixed_price_quantity`. If the Price represents a fixed cost, this represents
                 * the quantity of units applied.
                 *
                 * ```json
                 * {
                 *     ...
                 *     "id": "price_id",
                 *     "model_type": "unit",
                 *     "unit_config": {
                 *        "unit_amount": "2.00"
                 *     },
                 *     "fixed_price_quantity": 3.0
                 *     ...
                 * }
                 * ```
                 */
                fun price(price: Price) = price(JsonField.of(price))

                /**
                 * The Price resource represents a price that can be billed on a subscription,
                 * resulting in a charge on an invoice in the form of an invoice line item. Prices
                 * take a quantity and determine an amount to bill.
                 *
                 * Orb supports a few different pricing models out of the box. Each of these models
                 * is serialized differently in a given Price object. The model_type field
                 * determines the key for the configuration object that is present.
                 *
                 * ## Unit pricing
                 *
                 * With unit pricing, each unit costs a fixed amount.
                 *
                 * ```json
                 * {
                 *     ...
                 *     "model_type": "unit",
                 *     "unit_config": {
                 *         "unit_amount": "0.50"
                 *     }
                 *     ...
                 * }
                 * ```
                 *
                 * ## Tiered pricing
                 *
                 * In tiered pricing, the cost of a given unit depends on the tier range that it
                 * falls into, where each tier range is defined by an upper and lower bound. For
                 * example, the first ten units may cost $0.50 each and all units thereafter may
                 * cost $0.10 each.
                 *
                 * ```json
                 * {
                 *     ...
                 *     "model_type": "tiered",
                 *     "tiered_config": {
                 *         "tiers": [
                 *             {
                 *                 "first_unit": 1,
                 *                 "last_unit": 10,
                 *                 "unit_amount": "0.50"
                 *             },
                 *             {
                 *                 "first_unit": 11,
                 *                 "last_unit": null,
                 *                 "unit_amount": "0.10"
                 *             }
                 *         ]
                 *     }
                 *     ...
                 * ```
                 *
                 * ## Bulk pricing
                 *
                 * Bulk pricing applies when the number of units determine the cost of all units.
                 * For example, if you've bought less than 10 units, they may each be $0.50 for a
                 * total of $5.00. Once you've bought more than 10 units, all units may now be
                 * priced at $0.40 (i.e. 101 units total would be $40.40).
                 *
                 * ```json
                 * {
                 *     ...
                 *     "model_type": "bulk",
                 *     "bulk_config": {
                 *         "tiers": [
                 *             {
                 *                 "maximum_units": 10,
                 *                 "unit_amount": "0.50"
                 *             },
                 *             {
                 *                 "maximum_units": 1000,
                 *                 "unit_amount": "0.40"
                 *             }
                 *         ]
                 *     }
                 *     ...
                 * }
                 * ```
                 *
                 * ## Package pricing
                 *
                 * Package pricing defines the size or granularity of a unit for billing purposes.
                 * For example, if the package size is set to 5, then 4 units will be billed as 5
                 * and 6 units will be billed at 10.
                 *
                 * ```json
                 * {
                 *     ...
                 *     "model_type": "package",
                 *     "package_config": {
                 *         "package_amount": "0.80",
                 *         "package_size": 10
                 *     }
                 *     ...
                 * }
                 * ```
                 *
                 * ## BPS pricing
                 *
                 * BPS pricing specifies a per-event (e.g. per-payment) rate in one hundredth of a
                 * percent (the number of basis points to charge), as well as a cap per event to
                 * assess. For example, this would allow you to assess a fee of 0.25% on every
                 * payment you process, with a maximum charge of $25 per payment.
                 *
                 * ```json
                 * {
                 *     ...
                 *     "model_type": "bps",
                 *     "bps_config": {
                 *        "bps": 125,
                 *        "per_unit_maximum": "11.00"
                 *     }
                 *     ...
                 *  }
                 * ```
                 *
                 * ## Bulk BPS pricing
                 *
                 * Bulk BPS pricing specifies BPS parameters in a tiered manner, dependent on the
                 * total quantity across all events. Similar to bulk pricing, the BPS parameters of
                 * a given event depends on the tier range that the billing period falls into. Each
                 * tier range is defined by an upper bound. For example, after $1.5M of payment
                 * volume is reached, each individual payment may have a lower cap or a smaller
                 * take-rate.
                 *
                 * ```json
                 *     ...
                 *     "model_type": "bulk_bps",
                 *     "bulk_bps_config": {
                 *         "tiers": [
                 *            {
                 *                 "maximum_amount": "1000000.00",
                 *                 "bps": 125,
                 *                 "per_unit_maximum": "19.00"
                 *            },
                 *           {
                 *                 "maximum_amount": null,
                 *                 "bps": 115,
                 *                 "per_unit_maximum": "4.00"
                 *             }
                 *         ]
                 *     }
                 *     ...
                 * }
                 * ```
                 *
                 * ## Tiered BPS pricing
                 *
                 * Tiered BPS pricing specifies BPS parameters in a graduated manner, where an
                 * event's applicable parameter is a function of its marginal addition to the
                 * period total. Similar to tiered pricing, the BPS parameters of a given event
                 * depends on the tier range that it falls into, where each tier range is defined
                 * by an upper and lower bound. For example, the first few payments may have a 0.8
                 * BPS take-rate and all payments after a specific volume may incur a take-rate of
                 * 0.5 BPS each.
                 *
                 * ```json
                 *     ...
                 *     "model_type": "tiered_bps",
                 *     "tiered_bps_config": {
                 *         "tiers": [
                 *            {
                 *                 "minimum_amount": "0",
                 *                 "maximum_amount": "1000000.00",
                 *                 "bps": 125,
                 *                 "per_unit_maximum": "19.00"
                 *            },
                 *           {
                 *                 "minimum_amount": "1000000.00",
                 *                 "maximum_amount": null,
                 *                 "bps": 115,
                 *                 "per_unit_maximum": "4.00"
                 *             }
                 *         ]
                 *     }
                 *     ...
                 * }
                 * ```
                 *
                 * ## Matrix pricing
                 *
                 * Matrix pricing defines a set of unit prices in a one or two-dimensional matrix.
                 * `dimensions` defines the two event property values evaluated in this pricing
                 * model. In a one-dimensional matrix, the second value is `null`. Every
                 * configuration has a list of `matrix_values` which give the unit prices for
                 * specified property values. In a one-dimensional matrix, the matrix values will
                 * have `dimension_values` where the second value of the pair is null. If an event
                 * does not match any of the dimension values in the matrix, it will resort to the
                 * `default_unit_amount`.
                 *
                 * ```json
                 * {
                 *     "model_type": "matrix"
                 *     "matrix_config": {
                 *         "default_unit_amount": "3.00",
                 *         "dimensions": [
                 *             "cluster_name",
                 *             "region"
                 *         ],
                 *         "matrix_values": [
                 *             {
                 *                 "dimension_values": [
                 *                     "alpha",
                 *                     "west"
                 *                 ],
                 *                 "unit_amount": "2.00"
                 *             },
                 *             ...
                 *         ]
                 *     }
                 * }
                 * ```
                 *
                 * ## Fixed fees
                 *
                 * Fixed fees are prices that are applied independent of usage quantities, and
                 * follow unit pricing. They also have an additional parameter
                 * `fixed_price_quantity`. If the Price represents a fixed cost, this represents
                 * the quantity of units applied.
                 *
                 * ```json
                 * {
                 *     ...
                 *     "id": "price_id",
                 *     "model_type": "unit",
                 *     "unit_config": {
                 *        "unit_amount": "2.00"
                 *     },
                 *     "fixed_price_quantity": 3.0
                 *     ...
                 * }
                 * ```
                 */
                @JsonProperty("price")
                @ExcludeMissing
                fun price(price: JsonField<Price>) = apply {
                    this.price = price
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

                fun build(): PerPriceCost = PerPriceCost(
                    quantity,
                    subtotal,
                    total,
                    price,
                    additionalProperties.toUnmodifiable(),
                )
            }
        }
    }
}
