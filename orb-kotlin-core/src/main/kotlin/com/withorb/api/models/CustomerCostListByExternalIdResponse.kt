// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.checkRequired
import com.withorb.api.core.immutableEmptyMap
import com.withorb.api.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects

@NoAutoDetect
class CustomerCostListByExternalIdResponse
@JsonCreator
private constructor(
    @JsonProperty("data")
    @ExcludeMissing
    private val data: JsonField<List<Data>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun data(): List<Data> = data.getRequired("data")

    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<Data>> = data

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): CustomerCostListByExternalIdResponse = apply {
        if (validated) {
            return@apply
        }

        data().forEach { it.validate() }
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var data: JsonField<MutableList<Data>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(
            customerCostListByExternalIdResponse: CustomerCostListByExternalIdResponse
        ) = apply {
            data = customerCostListByExternalIdResponse.data.map { it.toMutableList() }
            additionalProperties =
                customerCostListByExternalIdResponse.additionalProperties.toMutableMap()
        }

        fun data(data: List<Data>) = data(JsonField.of(data))

        fun data(data: JsonField<List<Data>>) = apply {
            this.data = data.map { it.toMutableList() }
        }

        fun addData(data: Data) = apply {
            this.data =
                (this.data ?: JsonField.of(mutableListOf())).apply {
                    (asKnown()
                            ?: throw IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            ))
                        .add(data)
                }
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

        fun build(): CustomerCostListByExternalIdResponse =
            CustomerCostListByExternalIdResponse(
                checkRequired("data", data).map { it.toImmutable() },
                additionalProperties.toImmutable()
            )
    }

    @NoAutoDetect
    class Data
    @JsonCreator
    private constructor(
        @JsonProperty("per_price_costs")
        @ExcludeMissing
        private val perPriceCosts: JsonField<List<PerPriceCost>> = JsonMissing.of(),
        @JsonProperty("subtotal")
        @ExcludeMissing
        private val subtotal: JsonField<String> = JsonMissing.of(),
        @JsonProperty("timeframe_end")
        @ExcludeMissing
        private val timeframeEnd: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("timeframe_start")
        @ExcludeMissing
        private val timeframeStart: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("total")
        @ExcludeMissing
        private val total: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun perPriceCosts(): List<PerPriceCost> = perPriceCosts.getRequired("per_price_costs")

        /** Total costs for the timeframe, excluding any minimums and discounts. */
        fun subtotal(): String = subtotal.getRequired("subtotal")

        fun timeframeEnd(): OffsetDateTime = timeframeEnd.getRequired("timeframe_end")

        fun timeframeStart(): OffsetDateTime = timeframeStart.getRequired("timeframe_start")

        /** Total costs for the timeframe, including any minimums and discounts. */
        fun total(): String = total.getRequired("total")

        @JsonProperty("per_price_costs")
        @ExcludeMissing
        fun _perPriceCosts(): JsonField<List<PerPriceCost>> = perPriceCosts

        /** Total costs for the timeframe, excluding any minimums and discounts. */
        @JsonProperty("subtotal") @ExcludeMissing fun _subtotal(): JsonField<String> = subtotal

        @JsonProperty("timeframe_end")
        @ExcludeMissing
        fun _timeframeEnd(): JsonField<OffsetDateTime> = timeframeEnd

        @JsonProperty("timeframe_start")
        @ExcludeMissing
        fun _timeframeStart(): JsonField<OffsetDateTime> = timeframeStart

        /** Total costs for the timeframe, including any minimums and discounts. */
        @JsonProperty("total") @ExcludeMissing fun _total(): JsonField<String> = total

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            perPriceCosts().forEach { it.validate() }
            subtotal()
            timeframeEnd()
            timeframeStart()
            total()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var perPriceCosts: JsonField<MutableList<PerPriceCost>>? = null
            private var subtotal: JsonField<String>? = null
            private var timeframeEnd: JsonField<OffsetDateTime>? = null
            private var timeframeStart: JsonField<OffsetDateTime>? = null
            private var total: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(data: Data) = apply {
                perPriceCosts = data.perPriceCosts.map { it.toMutableList() }
                subtotal = data.subtotal
                timeframeEnd = data.timeframeEnd
                timeframeStart = data.timeframeStart
                total = data.total
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            fun perPriceCosts(perPriceCosts: List<PerPriceCost>) =
                perPriceCosts(JsonField.of(perPriceCosts))

            fun perPriceCosts(perPriceCosts: JsonField<List<PerPriceCost>>) = apply {
                this.perPriceCosts = perPriceCosts.map { it.toMutableList() }
            }

            fun addPerPriceCost(perPriceCost: PerPriceCost) = apply {
                perPriceCosts =
                    (perPriceCosts ?: JsonField.of(mutableListOf())).apply {
                        (asKnown()
                                ?: throw IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                ))
                            .add(perPriceCost)
                    }
            }

            /** Total costs for the timeframe, excluding any minimums and discounts. */
            fun subtotal(subtotal: String) = subtotal(JsonField.of(subtotal))

            /** Total costs for the timeframe, excluding any minimums and discounts. */
            fun subtotal(subtotal: JsonField<String>) = apply { this.subtotal = subtotal }

            fun timeframeEnd(timeframeEnd: OffsetDateTime) =
                timeframeEnd(JsonField.of(timeframeEnd))

            fun timeframeEnd(timeframeEnd: JsonField<OffsetDateTime>) = apply {
                this.timeframeEnd = timeframeEnd
            }

            fun timeframeStart(timeframeStart: OffsetDateTime) =
                timeframeStart(JsonField.of(timeframeStart))

            fun timeframeStart(timeframeStart: JsonField<OffsetDateTime>) = apply {
                this.timeframeStart = timeframeStart
            }

            /** Total costs for the timeframe, including any minimums and discounts. */
            fun total(total: String) = total(JsonField.of(total))

            /** Total costs for the timeframe, including any minimums and discounts. */
            fun total(total: JsonField<String>) = apply { this.total = total }

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

            fun build(): Data =
                Data(
                    checkRequired("perPriceCosts", perPriceCosts).map { it.toImmutable() },
                    checkRequired("subtotal", subtotal),
                    checkRequired("timeframeEnd", timeframeEnd),
                    checkRequired("timeframeStart", timeframeStart),
                    checkRequired("total", total),
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class PerPriceCost
        @JsonCreator
        private constructor(
            @JsonProperty("price")
            @ExcludeMissing
            private val price: JsonField<Price> = JsonMissing.of(),
            @JsonProperty("subtotal")
            @ExcludeMissing
            private val subtotal: JsonField<String> = JsonMissing.of(),
            @JsonProperty("total")
            @ExcludeMissing
            private val total: JsonField<String> = JsonMissing.of(),
            @JsonProperty("quantity")
            @ExcludeMissing
            private val quantity: JsonField<Double> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * The Price resource represents a price that can be billed on a subscription, resulting
             * in a charge on an invoice in the form of an invoice line item. Prices take a quantity
             * and determine an amount to bill.
             *
             * Orb supports a few different pricing models out of the box. Each of these models is
             * serialized differently in a given Price object. The model_type field determines the
             * key for the configuration object that is present.
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
             * In tiered pricing, the cost of a given unit depends on the tier range that it falls
             * into, where each tier range is defined by an upper and lower bound. For example, the
             * first ten units may cost $0.50 each and all units thereafter may cost $0.10 each.
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
             * Bulk pricing applies when the number of units determine the cost of all units. For
             * example, if you've bought less than 10 units, they may each be $0.50 for a total of
             * $5.00. Once you've bought more than 10 units, all units may now be priced at $0.40
             * (i.e. 101 units total would be $40.40).
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
             * Package pricing defines the size or granularity of a unit for billing purposes. For
             * example, if the package size is set to 5, then 4 units will be billed as 5 and 6
             * units will be billed at 10.
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
             * percent (the number of basis points to charge), as well as a cap per event to assess.
             * For example, this would allow you to assess a fee of 0.25% on every payment you
             * process, with a maximum charge of $25 per payment.
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
             * Bulk BPS pricing specifies BPS parameters in a tiered manner, dependent on the total
             * quantity across all events. Similar to bulk pricing, the BPS parameters of a given
             * event depends on the tier range that the billing period falls into. Each tier range
             * is defined by an upper bound. For example, after $1.5M of payment volume is reached,
             * each individual payment may have a lower cap or a smaller take-rate.
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
             * Tiered BPS pricing specifies BPS parameters in a graduated manner, where an event's
             * applicable parameter is a function of its marginal addition to the period total.
             * Similar to tiered pricing, the BPS parameters of a given event depends on the tier
             * range that it falls into, where each tier range is defined by an upper and lower
             * bound. For example, the first few payments may have a 0.8 BPS take-rate and all
             * payments after a specific volume may incur a take-rate of 0.5 BPS each.
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
             * `dimensions` defines the two event property values evaluated in this pricing model.
             * In a one-dimensional matrix, the second value is `null`. Every configuration has a
             * list of `matrix_values` which give the unit prices for specified property values. In
             * a one-dimensional matrix, the matrix values will have `dimension_values` where the
             * second value of the pair is null. If an event does not match any of the dimension
             * values in the matrix, it will resort to the `default_unit_amount`.
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
             * Fixed fees are prices that are applied independent of usage quantities, and follow
             * unit pricing. They also have an additional parameter `fixed_price_quantity`. If the
             * Price represents a fixed cost, this represents the quantity of units applied.
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

            /** Price's contributions for the timeframe, excluding any minimums and discounts. */
            fun subtotal(): String = subtotal.getRequired("subtotal")

            /** Price's contributions for the timeframe, including minimums and discounts. */
            fun total(): String = total.getRequired("total")

            /** The price's quantity for the timeframe */
            fun quantity(): Double? = quantity.getNullable("quantity")

            /**
             * The Price resource represents a price that can be billed on a subscription, resulting
             * in a charge on an invoice in the form of an invoice line item. Prices take a quantity
             * and determine an amount to bill.
             *
             * Orb supports a few different pricing models out of the box. Each of these models is
             * serialized differently in a given Price object. The model_type field determines the
             * key for the configuration object that is present.
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
             * In tiered pricing, the cost of a given unit depends on the tier range that it falls
             * into, where each tier range is defined by an upper and lower bound. For example, the
             * first ten units may cost $0.50 each and all units thereafter may cost $0.10 each.
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
             * Bulk pricing applies when the number of units determine the cost of all units. For
             * example, if you've bought less than 10 units, they may each be $0.50 for a total of
             * $5.00. Once you've bought more than 10 units, all units may now be priced at $0.40
             * (i.e. 101 units total would be $40.40).
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
             * Package pricing defines the size or granularity of a unit for billing purposes. For
             * example, if the package size is set to 5, then 4 units will be billed as 5 and 6
             * units will be billed at 10.
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
             * percent (the number of basis points to charge), as well as a cap per event to assess.
             * For example, this would allow you to assess a fee of 0.25% on every payment you
             * process, with a maximum charge of $25 per payment.
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
             * Bulk BPS pricing specifies BPS parameters in a tiered manner, dependent on the total
             * quantity across all events. Similar to bulk pricing, the BPS parameters of a given
             * event depends on the tier range that the billing period falls into. Each tier range
             * is defined by an upper bound. For example, after $1.5M of payment volume is reached,
             * each individual payment may have a lower cap or a smaller take-rate.
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
             * Tiered BPS pricing specifies BPS parameters in a graduated manner, where an event's
             * applicable parameter is a function of its marginal addition to the period total.
             * Similar to tiered pricing, the BPS parameters of a given event depends on the tier
             * range that it falls into, where each tier range is defined by an upper and lower
             * bound. For example, the first few payments may have a 0.8 BPS take-rate and all
             * payments after a specific volume may incur a take-rate of 0.5 BPS each.
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
             * `dimensions` defines the two event property values evaluated in this pricing model.
             * In a one-dimensional matrix, the second value is `null`. Every configuration has a
             * list of `matrix_values` which give the unit prices for specified property values. In
             * a one-dimensional matrix, the matrix values will have `dimension_values` where the
             * second value of the pair is null. If an event does not match any of the dimension
             * values in the matrix, it will resort to the `default_unit_amount`.
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
             * Fixed fees are prices that are applied independent of usage quantities, and follow
             * unit pricing. They also have an additional parameter `fixed_price_quantity`. If the
             * Price represents a fixed cost, this represents the quantity of units applied.
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
            @JsonProperty("price") @ExcludeMissing fun _price(): JsonField<Price> = price

            /** Price's contributions for the timeframe, excluding any minimums and discounts. */
            @JsonProperty("subtotal") @ExcludeMissing fun _subtotal(): JsonField<String> = subtotal

            /** Price's contributions for the timeframe, including minimums and discounts. */
            @JsonProperty("total") @ExcludeMissing fun _total(): JsonField<String> = total

            /** The price's quantity for the timeframe */
            @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Double> = quantity

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): PerPriceCost = apply {
                if (validated) {
                    return@apply
                }

                price().validate()
                subtotal()
                total()
                quantity()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var price: JsonField<Price>? = null
                private var subtotal: JsonField<String>? = null
                private var total: JsonField<String>? = null
                private var quantity: JsonField<Double> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(perPriceCost: PerPriceCost) = apply {
                    price = perPriceCost.price
                    subtotal = perPriceCost.subtotal
                    total = perPriceCost.total
                    quantity = perPriceCost.quantity
                    additionalProperties = perPriceCost.additionalProperties.toMutableMap()
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
                 * event's applicable parameter is a function of its marginal addition to the period
                 * total. Similar to tiered pricing, the BPS parameters of a given event depends on
                 * the tier range that it falls into, where each tier range is defined by an upper
                 * and lower bound. For example, the first few payments may have a 0.8 BPS take-rate
                 * and all payments after a specific volume may incur a take-rate of 0.5 BPS each.
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
                 * `fixed_price_quantity`. If the Price represents a fixed cost, this represents the
                 * quantity of units applied.
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
                 * event's applicable parameter is a function of its marginal addition to the period
                 * total. Similar to tiered pricing, the BPS parameters of a given event depends on
                 * the tier range that it falls into, where each tier range is defined by an upper
                 * and lower bound. For example, the first few payments may have a 0.8 BPS take-rate
                 * and all payments after a specific volume may incur a take-rate of 0.5 BPS each.
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
                 * `fixed_price_quantity`. If the Price represents a fixed cost, this represents the
                 * quantity of units applied.
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
                fun price(price: JsonField<Price>) = apply { this.price = price }

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
                 * event's applicable parameter is a function of its marginal addition to the period
                 * total. Similar to tiered pricing, the BPS parameters of a given event depends on
                 * the tier range that it falls into, where each tier range is defined by an upper
                 * and lower bound. For example, the first few payments may have a 0.8 BPS take-rate
                 * and all payments after a specific volume may incur a take-rate of 0.5 BPS each.
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
                 * `fixed_price_quantity`. If the Price represents a fixed cost, this represents the
                 * quantity of units applied.
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
                fun price(unitPrice: Price.UnitPrice) = price(Price.ofUnitPrice(unitPrice))

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
                 * event's applicable parameter is a function of its marginal addition to the period
                 * total. Similar to tiered pricing, the BPS parameters of a given event depends on
                 * the tier range that it falls into, where each tier range is defined by an upper
                 * and lower bound. For example, the first few payments may have a 0.8 BPS take-rate
                 * and all payments after a specific volume may incur a take-rate of 0.5 BPS each.
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
                 * `fixed_price_quantity`. If the Price represents a fixed cost, this represents the
                 * quantity of units applied.
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
                fun price(packagePrice: Price.PackagePrice) =
                    price(Price.ofPackagePrice(packagePrice))

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
                 * event's applicable parameter is a function of its marginal addition to the period
                 * total. Similar to tiered pricing, the BPS parameters of a given event depends on
                 * the tier range that it falls into, where each tier range is defined by an upper
                 * and lower bound. For example, the first few payments may have a 0.8 BPS take-rate
                 * and all payments after a specific volume may incur a take-rate of 0.5 BPS each.
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
                 * `fixed_price_quantity`. If the Price represents a fixed cost, this represents the
                 * quantity of units applied.
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
                fun price(matrixPrice: Price.MatrixPrice) = price(Price.ofMatrixPrice(matrixPrice))

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
                 * event's applicable parameter is a function of its marginal addition to the period
                 * total. Similar to tiered pricing, the BPS parameters of a given event depends on
                 * the tier range that it falls into, where each tier range is defined by an upper
                 * and lower bound. For example, the first few payments may have a 0.8 BPS take-rate
                 * and all payments after a specific volume may incur a take-rate of 0.5 BPS each.
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
                 * `fixed_price_quantity`. If the Price represents a fixed cost, this represents the
                 * quantity of units applied.
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
                fun price(tieredPrice: Price.TieredPrice) = price(Price.ofTieredPrice(tieredPrice))

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
                 * event's applicable parameter is a function of its marginal addition to the period
                 * total. Similar to tiered pricing, the BPS parameters of a given event depends on
                 * the tier range that it falls into, where each tier range is defined by an upper
                 * and lower bound. For example, the first few payments may have a 0.8 BPS take-rate
                 * and all payments after a specific volume may incur a take-rate of 0.5 BPS each.
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
                 * `fixed_price_quantity`. If the Price represents a fixed cost, this represents the
                 * quantity of units applied.
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
                fun price(tieredBpsPrice: Price.TieredBpsPrice) =
                    price(Price.ofTieredBpsPrice(tieredBpsPrice))

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
                 * event's applicable parameter is a function of its marginal addition to the period
                 * total. Similar to tiered pricing, the BPS parameters of a given event depends on
                 * the tier range that it falls into, where each tier range is defined by an upper
                 * and lower bound. For example, the first few payments may have a 0.8 BPS take-rate
                 * and all payments after a specific volume may incur a take-rate of 0.5 BPS each.
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
                 * `fixed_price_quantity`. If the Price represents a fixed cost, this represents the
                 * quantity of units applied.
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
                fun price(bpsPrice: Price.BpsPrice) = price(Price.ofBpsPrice(bpsPrice))

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
                 * event's applicable parameter is a function of its marginal addition to the period
                 * total. Similar to tiered pricing, the BPS parameters of a given event depends on
                 * the tier range that it falls into, where each tier range is defined by an upper
                 * and lower bound. For example, the first few payments may have a 0.8 BPS take-rate
                 * and all payments after a specific volume may incur a take-rate of 0.5 BPS each.
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
                 * `fixed_price_quantity`. If the Price represents a fixed cost, this represents the
                 * quantity of units applied.
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
                fun price(bulkBpsPrice: Price.BulkBpsPrice) =
                    price(Price.ofBulkBpsPrice(bulkBpsPrice))

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
                 * event's applicable parameter is a function of its marginal addition to the period
                 * total. Similar to tiered pricing, the BPS parameters of a given event depends on
                 * the tier range that it falls into, where each tier range is defined by an upper
                 * and lower bound. For example, the first few payments may have a 0.8 BPS take-rate
                 * and all payments after a specific volume may incur a take-rate of 0.5 BPS each.
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
                 * `fixed_price_quantity`. If the Price represents a fixed cost, this represents the
                 * quantity of units applied.
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
                fun price(bulkPrice: Price.BulkPrice) = price(Price.ofBulkPrice(bulkPrice))

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
                 * event's applicable parameter is a function of its marginal addition to the period
                 * total. Similar to tiered pricing, the BPS parameters of a given event depends on
                 * the tier range that it falls into, where each tier range is defined by an upper
                 * and lower bound. For example, the first few payments may have a 0.8 BPS take-rate
                 * and all payments after a specific volume may incur a take-rate of 0.5 BPS each.
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
                 * `fixed_price_quantity`. If the Price represents a fixed cost, this represents the
                 * quantity of units applied.
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
                fun price(thresholdTotalAmountPrice: Price.ThresholdTotalAmountPrice) =
                    price(Price.ofThresholdTotalAmountPrice(thresholdTotalAmountPrice))

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
                 * event's applicable parameter is a function of its marginal addition to the period
                 * total. Similar to tiered pricing, the BPS parameters of a given event depends on
                 * the tier range that it falls into, where each tier range is defined by an upper
                 * and lower bound. For example, the first few payments may have a 0.8 BPS take-rate
                 * and all payments after a specific volume may incur a take-rate of 0.5 BPS each.
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
                 * `fixed_price_quantity`. If the Price represents a fixed cost, this represents the
                 * quantity of units applied.
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
                fun price(tieredPackagePrice: Price.TieredPackagePrice) =
                    price(Price.ofTieredPackagePrice(tieredPackagePrice))

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
                 * event's applicable parameter is a function of its marginal addition to the period
                 * total. Similar to tiered pricing, the BPS parameters of a given event depends on
                 * the tier range that it falls into, where each tier range is defined by an upper
                 * and lower bound. For example, the first few payments may have a 0.8 BPS take-rate
                 * and all payments after a specific volume may incur a take-rate of 0.5 BPS each.
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
                 * `fixed_price_quantity`. If the Price represents a fixed cost, this represents the
                 * quantity of units applied.
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
                fun price(groupedTieredPrice: Price.GroupedTieredPrice) =
                    price(Price.ofGroupedTieredPrice(groupedTieredPrice))

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
                 * event's applicable parameter is a function of its marginal addition to the period
                 * total. Similar to tiered pricing, the BPS parameters of a given event depends on
                 * the tier range that it falls into, where each tier range is defined by an upper
                 * and lower bound. For example, the first few payments may have a 0.8 BPS take-rate
                 * and all payments after a specific volume may incur a take-rate of 0.5 BPS each.
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
                 * `fixed_price_quantity`. If the Price represents a fixed cost, this represents the
                 * quantity of units applied.
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
                fun price(tieredWithMinimumPrice: Price.TieredWithMinimumPrice) =
                    price(Price.ofTieredWithMinimumPrice(tieredWithMinimumPrice))

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
                 * event's applicable parameter is a function of its marginal addition to the period
                 * total. Similar to tiered pricing, the BPS parameters of a given event depends on
                 * the tier range that it falls into, where each tier range is defined by an upper
                 * and lower bound. For example, the first few payments may have a 0.8 BPS take-rate
                 * and all payments after a specific volume may incur a take-rate of 0.5 BPS each.
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
                 * `fixed_price_quantity`. If the Price represents a fixed cost, this represents the
                 * quantity of units applied.
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
                fun price(tieredPackageWithMinimumPrice: Price.TieredPackageWithMinimumPrice) =
                    price(Price.ofTieredPackageWithMinimumPrice(tieredPackageWithMinimumPrice))

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
                 * event's applicable parameter is a function of its marginal addition to the period
                 * total. Similar to tiered pricing, the BPS parameters of a given event depends on
                 * the tier range that it falls into, where each tier range is defined by an upper
                 * and lower bound. For example, the first few payments may have a 0.8 BPS take-rate
                 * and all payments after a specific volume may incur a take-rate of 0.5 BPS each.
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
                 * `fixed_price_quantity`. If the Price represents a fixed cost, this represents the
                 * quantity of units applied.
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
                fun price(packageWithAllocationPrice: Price.PackageWithAllocationPrice) =
                    price(Price.ofPackageWithAllocationPrice(packageWithAllocationPrice))

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
                 * event's applicable parameter is a function of its marginal addition to the period
                 * total. Similar to tiered pricing, the BPS parameters of a given event depends on
                 * the tier range that it falls into, where each tier range is defined by an upper
                 * and lower bound. For example, the first few payments may have a 0.8 BPS take-rate
                 * and all payments after a specific volume may incur a take-rate of 0.5 BPS each.
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
                 * `fixed_price_quantity`. If the Price represents a fixed cost, this represents the
                 * quantity of units applied.
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
                fun price(unitWithPercentPrice: Price.UnitWithPercentPrice) =
                    price(Price.ofUnitWithPercentPrice(unitWithPercentPrice))

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
                 * event's applicable parameter is a function of its marginal addition to the period
                 * total. Similar to tiered pricing, the BPS parameters of a given event depends on
                 * the tier range that it falls into, where each tier range is defined by an upper
                 * and lower bound. For example, the first few payments may have a 0.8 BPS take-rate
                 * and all payments after a specific volume may incur a take-rate of 0.5 BPS each.
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
                 * `fixed_price_quantity`. If the Price represents a fixed cost, this represents the
                 * quantity of units applied.
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
                fun price(matrixWithAllocationPrice: Price.MatrixWithAllocationPrice) =
                    price(Price.ofMatrixWithAllocationPrice(matrixWithAllocationPrice))

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
                 * event's applicable parameter is a function of its marginal addition to the period
                 * total. Similar to tiered pricing, the BPS parameters of a given event depends on
                 * the tier range that it falls into, where each tier range is defined by an upper
                 * and lower bound. For example, the first few payments may have a 0.8 BPS take-rate
                 * and all payments after a specific volume may incur a take-rate of 0.5 BPS each.
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
                 * `fixed_price_quantity`. If the Price represents a fixed cost, this represents the
                 * quantity of units applied.
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
                fun price(tieredWithProrationPrice: Price.TieredWithProrationPrice) =
                    price(Price.ofTieredWithProrationPrice(tieredWithProrationPrice))

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
                 * event's applicable parameter is a function of its marginal addition to the period
                 * total. Similar to tiered pricing, the BPS parameters of a given event depends on
                 * the tier range that it falls into, where each tier range is defined by an upper
                 * and lower bound. For example, the first few payments may have a 0.8 BPS take-rate
                 * and all payments after a specific volume may incur a take-rate of 0.5 BPS each.
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
                 * `fixed_price_quantity`. If the Price represents a fixed cost, this represents the
                 * quantity of units applied.
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
                fun price(unitWithProrationPrice: Price.UnitWithProrationPrice) =
                    price(Price.ofUnitWithProrationPrice(unitWithProrationPrice))

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
                 * event's applicable parameter is a function of its marginal addition to the period
                 * total. Similar to tiered pricing, the BPS parameters of a given event depends on
                 * the tier range that it falls into, where each tier range is defined by an upper
                 * and lower bound. For example, the first few payments may have a 0.8 BPS take-rate
                 * and all payments after a specific volume may incur a take-rate of 0.5 BPS each.
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
                 * `fixed_price_quantity`. If the Price represents a fixed cost, this represents the
                 * quantity of units applied.
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
                fun price(groupedAllocationPrice: Price.GroupedAllocationPrice) =
                    price(Price.ofGroupedAllocationPrice(groupedAllocationPrice))

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
                 * event's applicable parameter is a function of its marginal addition to the period
                 * total. Similar to tiered pricing, the BPS parameters of a given event depends on
                 * the tier range that it falls into, where each tier range is defined by an upper
                 * and lower bound. For example, the first few payments may have a 0.8 BPS take-rate
                 * and all payments after a specific volume may incur a take-rate of 0.5 BPS each.
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
                 * `fixed_price_quantity`. If the Price represents a fixed cost, this represents the
                 * quantity of units applied.
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
                fun price(groupedWithProratedMinimumPrice: Price.GroupedWithProratedMinimumPrice) =
                    price(Price.ofGroupedWithProratedMinimumPrice(groupedWithProratedMinimumPrice))

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
                 * event's applicable parameter is a function of its marginal addition to the period
                 * total. Similar to tiered pricing, the BPS parameters of a given event depends on
                 * the tier range that it falls into, where each tier range is defined by an upper
                 * and lower bound. For example, the first few payments may have a 0.8 BPS take-rate
                 * and all payments after a specific volume may incur a take-rate of 0.5 BPS each.
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
                 * `fixed_price_quantity`. If the Price represents a fixed cost, this represents the
                 * quantity of units applied.
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
                fun price(groupedWithMeteredMinimumPrice: Price.GroupedWithMeteredMinimumPrice) =
                    price(Price.ofGroupedWithMeteredMinimumPrice(groupedWithMeteredMinimumPrice))

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
                 * event's applicable parameter is a function of its marginal addition to the period
                 * total. Similar to tiered pricing, the BPS parameters of a given event depends on
                 * the tier range that it falls into, where each tier range is defined by an upper
                 * and lower bound. For example, the first few payments may have a 0.8 BPS take-rate
                 * and all payments after a specific volume may incur a take-rate of 0.5 BPS each.
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
                 * `fixed_price_quantity`. If the Price represents a fixed cost, this represents the
                 * quantity of units applied.
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
                fun price(matrixWithDisplayNamePrice: Price.MatrixWithDisplayNamePrice) =
                    price(Price.ofMatrixWithDisplayNamePrice(matrixWithDisplayNamePrice))

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
                 * event's applicable parameter is a function of its marginal addition to the period
                 * total. Similar to tiered pricing, the BPS parameters of a given event depends on
                 * the tier range that it falls into, where each tier range is defined by an upper
                 * and lower bound. For example, the first few payments may have a 0.8 BPS take-rate
                 * and all payments after a specific volume may incur a take-rate of 0.5 BPS each.
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
                 * `fixed_price_quantity`. If the Price represents a fixed cost, this represents the
                 * quantity of units applied.
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
                fun price(bulkWithProrationPrice: Price.BulkWithProrationPrice) =
                    price(Price.ofBulkWithProrationPrice(bulkWithProrationPrice))

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
                 * event's applicable parameter is a function of its marginal addition to the period
                 * total. Similar to tiered pricing, the BPS parameters of a given event depends on
                 * the tier range that it falls into, where each tier range is defined by an upper
                 * and lower bound. For example, the first few payments may have a 0.8 BPS take-rate
                 * and all payments after a specific volume may incur a take-rate of 0.5 BPS each.
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
                 * `fixed_price_quantity`. If the Price represents a fixed cost, this represents the
                 * quantity of units applied.
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
                fun price(groupedTieredPackagePrice: Price.GroupedTieredPackagePrice) =
                    price(Price.ofGroupedTieredPackagePrice(groupedTieredPackagePrice))

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
                 * event's applicable parameter is a function of its marginal addition to the period
                 * total. Similar to tiered pricing, the BPS parameters of a given event depends on
                 * the tier range that it falls into, where each tier range is defined by an upper
                 * and lower bound. For example, the first few payments may have a 0.8 BPS take-rate
                 * and all payments after a specific volume may incur a take-rate of 0.5 BPS each.
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
                 * `fixed_price_quantity`. If the Price represents a fixed cost, this represents the
                 * quantity of units applied.
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
                fun price(maxGroupTieredPrice: Price.MaxGroupTieredPrice) =
                    price(Price.ofMaxGroupTieredPrice(maxGroupTieredPrice))

                /**
                 * Price's contributions for the timeframe, excluding any minimums and discounts.
                 */
                fun subtotal(subtotal: String) = subtotal(JsonField.of(subtotal))

                /**
                 * Price's contributions for the timeframe, excluding any minimums and discounts.
                 */
                fun subtotal(subtotal: JsonField<String>) = apply { this.subtotal = subtotal }

                /** Price's contributions for the timeframe, including minimums and discounts. */
                fun total(total: String) = total(JsonField.of(total))

                /** Price's contributions for the timeframe, including minimums and discounts. */
                fun total(total: JsonField<String>) = apply { this.total = total }

                /** The price's quantity for the timeframe */
                fun quantity(quantity: Double?) = quantity(JsonField.ofNullable(quantity))

                /** The price's quantity for the timeframe */
                fun quantity(quantity: Double) = quantity(quantity as Double?)

                /** The price's quantity for the timeframe */
                fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): PerPriceCost =
                    PerPriceCost(
                        checkRequired("price", price),
                        checkRequired("subtotal", subtotal),
                        checkRequired("total", total),
                        quantity,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is PerPriceCost && price == other.price && subtotal == other.subtotal && total == other.total && quantity == other.quantity && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(price, subtotal, total, quantity, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PerPriceCost{price=$price, subtotal=$subtotal, total=$total, quantity=$quantity, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Data && perPriceCosts == other.perPriceCosts && subtotal == other.subtotal && timeframeEnd == other.timeframeEnd && timeframeStart == other.timeframeStart && total == other.total && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(perPriceCosts, subtotal, timeframeEnd, timeframeStart, total, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{perPriceCosts=$perPriceCosts, subtotal=$subtotal, timeframeEnd=$timeframeEnd, timeframeStart=$timeframeStart, total=$total, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerCostListByExternalIdResponse && data == other.data && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CustomerCostListByExternalIdResponse{data=$data, additionalProperties=$additionalProperties}"
}
