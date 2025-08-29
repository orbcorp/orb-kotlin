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

class AggregatedCost
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
        @JsonProperty("subtotal") @ExcludeMissing subtotal: JsonField<String> = JsonMissing.of(),
        @JsonProperty("timeframe_end")
        @ExcludeMissing
        timeframeEnd: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("timeframe_start")
        @ExcludeMissing
        timeframeStart: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("total") @ExcludeMissing total: JsonField<String> = JsonMissing.of(),
    ) : this(perPriceCosts, subtotal, timeframeEnd, timeframeStart, total, mutableMapOf())

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun perPriceCosts(): List<PerPriceCost> = perPriceCosts.getRequired("per_price_costs")

    /**
     * Total costs for the timeframe, excluding any minimums and discounts.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun subtotal(): String = subtotal.getRequired("subtotal")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun timeframeEnd(): OffsetDateTime = timeframeEnd.getRequired("timeframe_end")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun timeframeStart(): OffsetDateTime = timeframeStart.getRequired("timeframe_start")

    /**
     * Total costs for the timeframe, including any minimums and discounts.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun total(): String = total.getRequired("total")

    /**
     * Returns the raw JSON value of [perPriceCosts].
     *
     * Unlike [perPriceCosts], this method doesn't throw if the JSON field has an unexpected type.
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
     * Unlike [timeframeEnd], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timeframe_end")
    @ExcludeMissing
    fun _timeframeEnd(): JsonField<OffsetDateTime> = timeframeEnd

    /**
     * Returns the raw JSON value of [timeframeStart].
     *
     * Unlike [timeframeStart], this method doesn't throw if the JSON field has an unexpected type.
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
         * Returns a mutable builder for constructing an instance of [AggregatedCost].
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

    /** A builder for [AggregatedCost]. */
    class Builder internal constructor() {

        private var perPriceCosts: JsonField<MutableList<PerPriceCost>>? = null
        private var subtotal: JsonField<String>? = null
        private var timeframeEnd: JsonField<OffsetDateTime>? = null
        private var timeframeStart: JsonField<OffsetDateTime>? = null
        private var total: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(aggregatedCost: AggregatedCost) = apply {
            perPriceCosts = aggregatedCost.perPriceCosts.map { it.toMutableList() }
            subtotal = aggregatedCost.subtotal
            timeframeEnd = aggregatedCost.timeframeEnd
            timeframeStart = aggregatedCost.timeframeStart
            total = aggregatedCost.total
            additionalProperties = aggregatedCost.additionalProperties.toMutableMap()
        }

        fun perPriceCosts(perPriceCosts: List<PerPriceCost>) =
            perPriceCosts(JsonField.of(perPriceCosts))

        /**
         * Sets [Builder.perPriceCosts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.perPriceCosts] with a well-typed `List<PerPriceCost>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
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
         * You should usually call [Builder.subtotal] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun subtotal(subtotal: JsonField<String>) = apply { this.subtotal = subtotal }

        fun timeframeEnd(timeframeEnd: OffsetDateTime) = timeframeEnd(JsonField.of(timeframeEnd))

        /**
         * Sets [Builder.timeframeEnd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timeframeEnd] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun timeframeEnd(timeframeEnd: JsonField<OffsetDateTime>) = apply {
            this.timeframeEnd = timeframeEnd
        }

        fun timeframeStart(timeframeStart: OffsetDateTime) =
            timeframeStart(JsonField.of(timeframeStart))

        /**
         * Sets [Builder.timeframeStart] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timeframeStart] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun timeframeStart(timeframeStart: JsonField<OffsetDateTime>) = apply {
            this.timeframeStart = timeframeStart
        }

        /** Total costs for the timeframe, including any minimums and discounts. */
        fun total(total: String) = total(JsonField.of(total))

        /**
         * Sets [Builder.total] to an arbitrary JSON value.
         *
         * You should usually call [Builder.total] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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
         * Returns an immutable instance of [AggregatedCost].
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
        fun build(): AggregatedCost =
            AggregatedCost(
                checkRequired("perPriceCosts", perPriceCosts).map { it.toImmutable() },
                checkRequired("subtotal", subtotal),
                checkRequired("timeframeEnd", timeframeEnd),
                checkRequired("timeframeStart", timeframeStart),
                checkRequired("total", total),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AggregatedCost = apply {
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        (perPriceCosts.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (subtotal.asKnown() == null) 0 else 1) +
            (if (timeframeEnd.asKnown() == null) 0 else 1) +
            (if (timeframeStart.asKnown() == null) 0 else 1) +
            (if (total.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AggregatedCost &&
            perPriceCosts == other.perPriceCosts &&
            subtotal == other.subtotal &&
            timeframeEnd == other.timeframeEnd &&
            timeframeStart == other.timeframeStart &&
            total == other.total &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            perPriceCosts,
            subtotal,
            timeframeEnd,
            timeframeStart,
            total,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AggregatedCost{perPriceCosts=$perPriceCosts, subtotal=$subtotal, timeframeEnd=$timeframeEnd, timeframeStart=$timeframeStart, total=$total, additionalProperties=$additionalProperties}"
}
