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
import com.withorb.api.core.checkKnown
import com.withorb.api.core.checkRequired
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class SubscriptionFetchCostsResponse
private constructor(
    private val data: JsonField<List<Data>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<List<Data>> = JsonMissing.of()
    ) : this(data, mutableMapOf())

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): List<Data> = data.getRequired("data")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<Data>> = data

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [SubscriptionFetchCostsResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .data()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [SubscriptionFetchCostsResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<Data>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(subscriptionFetchCostsResponse: SubscriptionFetchCostsResponse) = apply {
            data = subscriptionFetchCostsResponse.data.map { it.toMutableList() }
            additionalProperties =
                subscriptionFetchCostsResponse.additionalProperties.toMutableMap()
        }

        fun data(data: List<Data>) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed `List<Data>` value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<List<Data>>) = apply {
            this.data = data.map { it.toMutableList() }
        }

        /**
         * Adds a single [Data] to [Builder.data].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addData(data: Data) = apply {
            this.data =
                (this.data ?: JsonField.of(mutableListOf())).also {
                    checkKnown("data", it).add(data)
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

        /**
         * Returns an immutable instance of [SubscriptionFetchCostsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .data()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SubscriptionFetchCostsResponse =
            SubscriptionFetchCostsResponse(
                checkRequired("data", data).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SubscriptionFetchCostsResponse = apply {
        if (validated) {
            return@apply
        }

        data().forEach { it.validate() }
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: OrbInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int = (data.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

    class Data
    private constructor(
        private val perPriceCosts: JsonField<List<PerPriceCost>>,
        private val subtotal: JsonField<String>,
        private val timeframeEnd: JsonField<OffsetDateTime>,
        private val timeframeStart: JsonField<OffsetDateTime>,
        private val total: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("per_price_costs")
            @ExcludeMissing
            perPriceCosts: JsonField<List<PerPriceCost>> = JsonMissing.of(),
            @JsonProperty("subtotal")
            @ExcludeMissing
            subtotal: JsonField<String> = JsonMissing.of(),
            @JsonProperty("timeframe_end")
            @ExcludeMissing
            timeframeEnd: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("timeframe_start")
            @ExcludeMissing
            timeframeStart: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("total") @ExcludeMissing total: JsonField<String> = JsonMissing.of(),
        ) : this(perPriceCosts, subtotal, timeframeEnd, timeframeStart, total, mutableMapOf())

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun perPriceCosts(): List<PerPriceCost> = perPriceCosts.getRequired("per_price_costs")

        /**
         * Total costs for the timeframe, excluding any minimums and discounts.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun subtotal(): String = subtotal.getRequired("subtotal")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun timeframeEnd(): OffsetDateTime = timeframeEnd.getRequired("timeframe_end")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun timeframeStart(): OffsetDateTime = timeframeStart.getRequired("timeframe_start")

        /**
         * Total costs for the timeframe, including any minimums and discounts.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun total(): String = total.getRequired("total")

        /**
         * Returns the raw JSON value of [perPriceCosts].
         *
         * Unlike [perPriceCosts], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("per_price_costs")
        @ExcludeMissing
        fun _perPriceCosts(): JsonField<List<PerPriceCost>> = perPriceCosts

        /**
         * Returns the raw JSON value of [subtotal].
         *
         * Unlike [subtotal], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("subtotal") @ExcludeMissing fun _subtotal(): JsonField<String> = subtotal

        /**
         * Returns the raw JSON value of [timeframeEnd].
         *
         * Unlike [timeframeEnd], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("timeframe_end")
        @ExcludeMissing
        fun _timeframeEnd(): JsonField<OffsetDateTime> = timeframeEnd

        /**
         * Returns the raw JSON value of [timeframeStart].
         *
         * Unlike [timeframeStart], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("timeframe_start")
        @ExcludeMissing
        fun _timeframeStart(): JsonField<OffsetDateTime> = timeframeStart

        /**
         * Returns the raw JSON value of [total].
         *
         * Unlike [total], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("total") @ExcludeMissing fun _total(): JsonField<String> = total

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Data].
             *
             * The following fields are required:
             * ```kotlin
             * .perPriceCosts()
             * .subtotal()
             * .timeframeEnd()
             * .timeframeStart()
             * .total()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

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

            /**
             * Sets [Builder.perPriceCosts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.perPriceCosts] with a well-typed
             * `List<PerPriceCost>` value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun perPriceCosts(perPriceCosts: JsonField<List<PerPriceCost>>) = apply {
                this.perPriceCosts = perPriceCosts.map { it.toMutableList() }
            }

            /**
             * Adds a single [PerPriceCost] to [perPriceCosts].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPerPriceCost(perPriceCost: PerPriceCost) = apply {
                perPriceCosts =
                    (perPriceCosts ?: JsonField.of(mutableListOf())).also {
                        checkKnown("perPriceCosts", it).add(perPriceCost)
                    }
            }

            /** Total costs for the timeframe, excluding any minimums and discounts. */
            fun subtotal(subtotal: String) = subtotal(JsonField.of(subtotal))

            /**
             * Sets [Builder.subtotal] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subtotal] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun subtotal(subtotal: JsonField<String>) = apply { this.subtotal = subtotal }

            fun timeframeEnd(timeframeEnd: OffsetDateTime) =
                timeframeEnd(JsonField.of(timeframeEnd))

            /**
             * Sets [Builder.timeframeEnd] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timeframeEnd] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun timeframeEnd(timeframeEnd: JsonField<OffsetDateTime>) = apply {
                this.timeframeEnd = timeframeEnd
            }

            fun timeframeStart(timeframeStart: OffsetDateTime) =
                timeframeStart(JsonField.of(timeframeStart))

            /**
             * Sets [Builder.timeframeStart] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timeframeStart] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun timeframeStart(timeframeStart: JsonField<OffsetDateTime>) = apply {
                this.timeframeStart = timeframeStart
            }

            /** Total costs for the timeframe, including any minimums and discounts. */
            fun total(total: String) = total(JsonField.of(total))

            /**
             * Sets [Builder.total] to an arbitrary JSON value.
             *
             * You should usually call [Builder.total] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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

            /**
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .perPriceCosts()
             * .subtotal()
             * .timeframeEnd()
             * .timeframeStart()
             * .total()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("perPriceCosts", perPriceCosts).map { it.toImmutable() },
                    checkRequired("subtotal", subtotal),
                    checkRequired("timeframeEnd", timeframeEnd),
                    checkRequired("timeframeStart", timeframeStart),
                    checkRequired("total", total),
                    additionalProperties.toMutableMap(),
                )
        }

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

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: OrbInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (perPriceCosts.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (subtotal.asKnown() == null) 0 else 1) +
                (if (timeframeEnd.asKnown() == null) 0 else 1) +
                (if (timeframeStart.asKnown() == null) 0 else 1) +
                (if (total.asKnown() == null) 0 else 1)

        class PerPriceCost
        private constructor(
            private val price: JsonField<Price>,
            private val priceId: JsonField<String>,
            private val subtotal: JsonField<String>,
            private val total: JsonField<String>,
            private val quantity: JsonField<Double>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("price") @ExcludeMissing price: JsonField<Price> = JsonMissing.of(),
                @JsonProperty("price_id")
                @ExcludeMissing
                priceId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("subtotal")
                @ExcludeMissing
                subtotal: JsonField<String> = JsonMissing.of(),
                @JsonProperty("total") @ExcludeMissing total: JsonField<String> = JsonMissing.of(),
                @JsonProperty("quantity")
                @ExcludeMissing
                quantity: JsonField<Double> = JsonMissing.of(),
            ) : this(price, priceId, subtotal, total, quantity, mutableMapOf())

            /**
             * The price object
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun price(): Price = price.getRequired("price")

            /**
             * The price the cost is associated with
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun priceId(): String = priceId.getRequired("price_id")

            /**
             * Price's contributions for the timeframe, excluding any minimums and discounts.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun subtotal(): String = subtotal.getRequired("subtotal")

            /**
             * Price's contributions for the timeframe, including minimums and discounts.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun total(): String = total.getRequired("total")

            /**
             * The price's quantity for the timeframe
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun quantity(): Double? = quantity.getNullable("quantity")

            /**
             * Returns the raw JSON value of [price].
             *
             * Unlike [price], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("price") @ExcludeMissing fun _price(): JsonField<Price> = price

            /**
             * Returns the raw JSON value of [priceId].
             *
             * Unlike [priceId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("price_id") @ExcludeMissing fun _priceId(): JsonField<String> = priceId

            /**
             * Returns the raw JSON value of [subtotal].
             *
             * Unlike [subtotal], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("subtotal") @ExcludeMissing fun _subtotal(): JsonField<String> = subtotal

            /**
             * Returns the raw JSON value of [total].
             *
             * Unlike [total], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("total") @ExcludeMissing fun _total(): JsonField<String> = total

            /**
             * Returns the raw JSON value of [quantity].
             *
             * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Double> = quantity

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [PerPriceCost].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .price()
                 * .priceId()
                 * .subtotal()
                 * .total()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [PerPriceCost]. */
            class Builder internal constructor() {

                private var price: JsonField<Price>? = null
                private var priceId: JsonField<String>? = null
                private var subtotal: JsonField<String>? = null
                private var total: JsonField<String>? = null
                private var quantity: JsonField<Double> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(perPriceCost: PerPriceCost) = apply {
                    price = perPriceCost.price
                    priceId = perPriceCost.priceId
                    subtotal = perPriceCost.subtotal
                    total = perPriceCost.total
                    quantity = perPriceCost.quantity
                    additionalProperties = perPriceCost.additionalProperties.toMutableMap()
                }

                /** The price object */
                fun price(price: Price) = price(JsonField.of(price))

                /**
                 * Sets [Builder.price] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.price] with a well-typed [Price] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun price(price: JsonField<Price>) = apply { this.price = price }

                /** Alias for calling [price] with `Price.ofUnit(unit)`. */
                fun price(unit: Price.Unit) = price(Price.ofUnit(unit))

                /** Alias for calling [price] with `Price.ofPackage(package_)`. */
                fun price(package_: Price.Package) = price(Price.ofPackage(package_))

                /** Alias for calling [price] with `Price.ofMatrix(matrix)`. */
                fun price(matrix: Price.Matrix) = price(Price.ofMatrix(matrix))

                /** Alias for calling [price] with `Price.ofTiered(tiered)`. */
                fun price(tiered: Price.Tiered) = price(Price.ofTiered(tiered))

                /** Alias for calling [price] with `Price.ofTieredBps(tieredBps)`. */
                fun price(tieredBps: Price.TieredBps) = price(Price.ofTieredBps(tieredBps))

                /** Alias for calling [price] with `Price.ofBps(bps)`. */
                fun price(bps: Price.Bps) = price(Price.ofBps(bps))

                /** Alias for calling [price] with `Price.ofBulkBps(bulkBps)`. */
                fun price(bulkBps: Price.BulkBps) = price(Price.ofBulkBps(bulkBps))

                /** Alias for calling [price] with `Price.ofBulk(bulk)`. */
                fun price(bulk: Price.Bulk) = price(Price.ofBulk(bulk))

                /**
                 * Alias for calling [price] with
                 * `Price.ofThresholdTotalAmount(thresholdTotalAmount)`.
                 */
                fun price(thresholdTotalAmount: Price.ThresholdTotalAmount) =
                    price(Price.ofThresholdTotalAmount(thresholdTotalAmount))

                /** Alias for calling [price] with `Price.ofTieredPackage(tieredPackage)`. */
                fun price(tieredPackage: Price.TieredPackage) =
                    price(Price.ofTieredPackage(tieredPackage))

                /** Alias for calling [price] with `Price.ofGroupedTiered(groupedTiered)`. */
                fun price(groupedTiered: Price.GroupedTiered) =
                    price(Price.ofGroupedTiered(groupedTiered))

                /**
                 * Alias for calling [price] with `Price.ofTieredWithMinimum(tieredWithMinimum)`.
                 */
                fun price(tieredWithMinimum: Price.TieredWithMinimum) =
                    price(Price.ofTieredWithMinimum(tieredWithMinimum))

                /**
                 * Alias for calling [price] with
                 * `Price.ofTieredPackageWithMinimum(tieredPackageWithMinimum)`.
                 */
                fun price(tieredPackageWithMinimum: Price.TieredPackageWithMinimum) =
                    price(Price.ofTieredPackageWithMinimum(tieredPackageWithMinimum))

                /**
                 * Alias for calling [price] with
                 * `Price.ofPackageWithAllocation(packageWithAllocation)`.
                 */
                fun price(packageWithAllocation: Price.PackageWithAllocation) =
                    price(Price.ofPackageWithAllocation(packageWithAllocation))

                /** Alias for calling [price] with `Price.ofUnitWithPercent(unitWithPercent)`. */
                fun price(unitWithPercent: Price.UnitWithPercent) =
                    price(Price.ofUnitWithPercent(unitWithPercent))

                /**
                 * Alias for calling [price] with
                 * `Price.ofMatrixWithAllocation(matrixWithAllocation)`.
                 */
                fun price(matrixWithAllocation: Price.MatrixWithAllocation) =
                    price(Price.ofMatrixWithAllocation(matrixWithAllocation))

                /**
                 * Alias for calling [price] with
                 * `Price.ofTieredWithProration(tieredWithProration)`.
                 */
                fun price(tieredWithProration: Price.TieredWithProration) =
                    price(Price.ofTieredWithProration(tieredWithProration))

                /**
                 * Alias for calling [price] with `Price.ofUnitWithProration(unitWithProration)`.
                 */
                fun price(unitWithProration: Price.UnitWithProration) =
                    price(Price.ofUnitWithProration(unitWithProration))

                /**
                 * Alias for calling [price] with `Price.ofGroupedAllocation(groupedAllocation)`.
                 */
                fun price(groupedAllocation: Price.GroupedAllocation) =
                    price(Price.ofGroupedAllocation(groupedAllocation))

                /**
                 * Alias for calling [price] with
                 * `Price.ofGroupedWithProratedMinimum(groupedWithProratedMinimum)`.
                 */
                fun price(groupedWithProratedMinimum: Price.GroupedWithProratedMinimum) =
                    price(Price.ofGroupedWithProratedMinimum(groupedWithProratedMinimum))

                /**
                 * Alias for calling [price] with
                 * `Price.ofGroupedWithMeteredMinimum(groupedWithMeteredMinimum)`.
                 */
                fun price(groupedWithMeteredMinimum: Price.GroupedWithMeteredMinimum) =
                    price(Price.ofGroupedWithMeteredMinimum(groupedWithMeteredMinimum))

                /**
                 * Alias for calling [price] with
                 * `Price.ofMatrixWithDisplayName(matrixWithDisplayName)`.
                 */
                fun price(matrixWithDisplayName: Price.MatrixWithDisplayName) =
                    price(Price.ofMatrixWithDisplayName(matrixWithDisplayName))

                /**
                 * Alias for calling [price] with `Price.ofBulkWithProration(bulkWithProration)`.
                 */
                fun price(bulkWithProration: Price.BulkWithProration) =
                    price(Price.ofBulkWithProration(bulkWithProration))

                /**
                 * Alias for calling [price] with
                 * `Price.ofGroupedTieredPackage(groupedTieredPackage)`.
                 */
                fun price(groupedTieredPackage: Price.GroupedTieredPackage) =
                    price(Price.ofGroupedTieredPackage(groupedTieredPackage))

                /**
                 * Alias for calling [price] with
                 * `Price.ofMaxGroupTieredPackage(maxGroupTieredPackage)`.
                 */
                fun price(maxGroupTieredPackage: Price.MaxGroupTieredPackage) =
                    price(Price.ofMaxGroupTieredPackage(maxGroupTieredPackage))

                /**
                 * Alias for calling [price] with
                 * `Price.ofScalableMatrixWithUnitPricing(scalableMatrixWithUnitPricing)`.
                 */
                fun price(scalableMatrixWithUnitPricing: Price.ScalableMatrixWithUnitPricing) =
                    price(Price.ofScalableMatrixWithUnitPricing(scalableMatrixWithUnitPricing))

                /**
                 * Alias for calling [price] with
                 * `Price.ofScalableMatrixWithTieredPricing(scalableMatrixWithTieredPricing)`.
                 */
                fun price(scalableMatrixWithTieredPricing: Price.ScalableMatrixWithTieredPricing) =
                    price(Price.ofScalableMatrixWithTieredPricing(scalableMatrixWithTieredPricing))

                /**
                 * Alias for calling [price] with
                 * `Price.ofCumulativeGroupedBulk(cumulativeGroupedBulk)`.
                 */
                fun price(cumulativeGroupedBulk: Price.CumulativeGroupedBulk) =
                    price(Price.ofCumulativeGroupedBulk(cumulativeGroupedBulk))

                /** The price the cost is associated with */
                fun priceId(priceId: String) = priceId(JsonField.of(priceId))

                /**
                 * Sets [Builder.priceId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.priceId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun priceId(priceId: JsonField<String>) = apply { this.priceId = priceId }

                /**
                 * Price's contributions for the timeframe, excluding any minimums and discounts.
                 */
                fun subtotal(subtotal: String) = subtotal(JsonField.of(subtotal))

                /**
                 * Sets [Builder.subtotal] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.subtotal] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun subtotal(subtotal: JsonField<String>) = apply { this.subtotal = subtotal }

                /** Price's contributions for the timeframe, including minimums and discounts. */
                fun total(total: String) = total(JsonField.of(total))

                /**
                 * Sets [Builder.total] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.total] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun total(total: JsonField<String>) = apply { this.total = total }

                /** The price's quantity for the timeframe */
                fun quantity(quantity: Double?) = quantity(JsonField.ofNullable(quantity))

                /**
                 * Alias for [Builder.quantity].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun quantity(quantity: Double) = quantity(quantity as Double?)

                /**
                 * Sets [Builder.quantity] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.quantity] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
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

                /**
                 * Returns an immutable instance of [PerPriceCost].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .price()
                 * .priceId()
                 * .subtotal()
                 * .total()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): PerPriceCost =
                    PerPriceCost(
                        checkRequired("price", price),
                        checkRequired("priceId", priceId),
                        checkRequired("subtotal", subtotal),
                        checkRequired("total", total),
                        quantity,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): PerPriceCost = apply {
                if (validated) {
                    return@apply
                }

                price().validate()
                priceId()
                subtotal()
                total()
                quantity()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: OrbInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                (price.asKnown()?.validity() ?: 0) +
                    (if (priceId.asKnown() == null) 0 else 1) +
                    (if (subtotal.asKnown() == null) 0 else 1) +
                    (if (total.asKnown() == null) 0 else 1) +
                    (if (quantity.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is PerPriceCost && price == other.price && priceId == other.priceId && subtotal == other.subtotal && total == other.total && quantity == other.quantity && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(price, priceId, subtotal, total, quantity, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PerPriceCost{price=$price, priceId=$priceId, subtotal=$subtotal, total=$total, quantity=$quantity, additionalProperties=$additionalProperties}"
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

        return /* spotless:off */ other is SubscriptionFetchCostsResponse && data == other.data && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SubscriptionFetchCostsResponse{data=$data, additionalProperties=$additionalProperties}"
}
