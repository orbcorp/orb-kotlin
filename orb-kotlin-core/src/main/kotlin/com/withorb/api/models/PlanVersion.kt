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
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.core.checkKnown
import com.withorb.api.core.checkRequired
import com.withorb.api.core.getOrThrow
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/**
 * The PlanVersion resource represents the prices and adjustments present on a specific version of a
 * plan.
 */
class PlanVersion
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val adjustments: JsonField<List<Adjustment>>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val planPhases: JsonField<List<PlanVersionPhase>>,
    private val prices: JsonField<List<Price>>,
    private val version: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("adjustments")
        @ExcludeMissing
        adjustments: JsonField<List<Adjustment>> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("plan_phases")
        @ExcludeMissing
        planPhases: JsonField<List<PlanVersionPhase>> = JsonMissing.of(),
        @JsonProperty("prices") @ExcludeMissing prices: JsonField<List<Price>> = JsonMissing.of(),
        @JsonProperty("version") @ExcludeMissing version: JsonField<Long> = JsonMissing.of(),
    ) : this(adjustments, createdAt, planPhases, prices, version, mutableMapOf())

    /**
     * Adjustments for this plan. If the plan has phases, this includes adjustments across all
     * phases of the plan.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun adjustments(): List<Adjustment> = adjustments.getRequired("adjustments")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun planPhases(): List<PlanVersionPhase>? = planPhases.getNullable("plan_phases")

    /**
     * Prices for this plan. If the plan has phases, this includes prices across all phases of the
     * plan.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun prices(): List<Price> = prices.getRequired("prices")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun version(): Long = version.getRequired("version")

    /**
     * Returns the raw JSON value of [adjustments].
     *
     * Unlike [adjustments], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("adjustments")
    @ExcludeMissing
    fun _adjustments(): JsonField<List<Adjustment>> = adjustments

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [planPhases].
     *
     * Unlike [planPhases], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("plan_phases")
    @ExcludeMissing
    fun _planPhases(): JsonField<List<PlanVersionPhase>> = planPhases

    /**
     * Returns the raw JSON value of [prices].
     *
     * Unlike [prices], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("prices") @ExcludeMissing fun _prices(): JsonField<List<Price>> = prices

    /**
     * Returns the raw JSON value of [version].
     *
     * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<Long> = version

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
         * Returns a mutable builder for constructing an instance of [PlanVersion].
         *
         * The following fields are required:
         * ```kotlin
         * .adjustments()
         * .createdAt()
         * .planPhases()
         * .prices()
         * .version()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [PlanVersion]. */
    class Builder internal constructor() {

        private var adjustments: JsonField<MutableList<Adjustment>>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var planPhases: JsonField<MutableList<PlanVersionPhase>>? = null
        private var prices: JsonField<MutableList<Price>>? = null
        private var version: JsonField<Long>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(planVersion: PlanVersion) = apply {
            adjustments = planVersion.adjustments.map { it.toMutableList() }
            createdAt = planVersion.createdAt
            planPhases = planVersion.planPhases.map { it.toMutableList() }
            prices = planVersion.prices.map { it.toMutableList() }
            version = planVersion.version
            additionalProperties = planVersion.additionalProperties.toMutableMap()
        }

        /**
         * Adjustments for this plan. If the plan has phases, this includes adjustments across all
         * phases of the plan.
         */
        fun adjustments(adjustments: List<Adjustment>) = adjustments(JsonField.of(adjustments))

        /**
         * Sets [Builder.adjustments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.adjustments] with a well-typed `List<Adjustment>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun adjustments(adjustments: JsonField<List<Adjustment>>) = apply {
            this.adjustments = adjustments.map { it.toMutableList() }
        }

        /**
         * Adds a single [Adjustment] to [adjustments].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAdjustment(adjustment: Adjustment) = apply {
            adjustments =
                (adjustments ?: JsonField.of(mutableListOf())).also {
                    checkKnown("adjustments", it).add(adjustment)
                }
        }

        /** Alias for calling [addAdjustment] with `Adjustment.ofUsageDiscount(usageDiscount)`. */
        fun addAdjustment(usageDiscount: PlanPhaseUsageDiscountAdjustment) =
            addAdjustment(Adjustment.ofUsageDiscount(usageDiscount))

        /** Alias for calling [addAdjustment] with `Adjustment.ofAmountDiscount(amountDiscount)`. */
        fun addAdjustment(amountDiscount: PlanPhaseAmountDiscountAdjustment) =
            addAdjustment(Adjustment.ofAmountDiscount(amountDiscount))

        /**
         * Alias for calling [addAdjustment] with
         * `Adjustment.ofPercentageDiscount(percentageDiscount)`.
         */
        fun addAdjustment(percentageDiscount: PlanPhasePercentageDiscountAdjustment) =
            addAdjustment(Adjustment.ofPercentageDiscount(percentageDiscount))

        /** Alias for calling [addAdjustment] with `Adjustment.ofMinimum(minimum)`. */
        fun addAdjustment(minimum: PlanPhaseMinimumAdjustment) =
            addAdjustment(Adjustment.ofMinimum(minimum))

        /** Alias for calling [addAdjustment] with `Adjustment.ofMaximum(maximum)`. */
        fun addAdjustment(maximum: PlanPhaseMaximumAdjustment) =
            addAdjustment(Adjustment.ofMaximum(maximum))

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun planPhases(planPhases: List<PlanVersionPhase>?) =
            planPhases(JsonField.ofNullable(planPhases))

        /**
         * Sets [Builder.planPhases] to an arbitrary JSON value.
         *
         * You should usually call [Builder.planPhases] with a well-typed `List<PlanVersionPhase>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun planPhases(planPhases: JsonField<List<PlanVersionPhase>>) = apply {
            this.planPhases = planPhases.map { it.toMutableList() }
        }

        /**
         * Adds a single [PlanVersionPhase] to [planPhases].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPlanPhase(planPhase: PlanVersionPhase) = apply {
            planPhases =
                (planPhases ?: JsonField.of(mutableListOf())).also {
                    checkKnown("planPhases", it).add(planPhase)
                }
        }

        /**
         * Prices for this plan. If the plan has phases, this includes prices across all phases of
         * the plan.
         */
        fun prices(prices: List<Price>) = prices(JsonField.of(prices))

        /**
         * Sets [Builder.prices] to an arbitrary JSON value.
         *
         * You should usually call [Builder.prices] with a well-typed `List<Price>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun prices(prices: JsonField<List<Price>>) = apply {
            this.prices = prices.map { it.toMutableList() }
        }

        /**
         * Adds a single [Price] to [prices].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPrice(price: Price) = apply {
            prices =
                (prices ?: JsonField.of(mutableListOf())).also {
                    checkKnown("prices", it).add(price)
                }
        }

        /** Alias for calling [addPrice] with `Price.ofUnit(unit)`. */
        fun addPrice(unit: Price.Unit) = addPrice(Price.ofUnit(unit))

        /** Alias for calling [addPrice] with `Price.ofTiered(tiered)`. */
        fun addPrice(tiered: Price.Tiered) = addPrice(Price.ofTiered(tiered))

        /** Alias for calling [addPrice] with `Price.ofBulk(bulk)`. */
        fun addPrice(bulk: Price.Bulk) = addPrice(Price.ofBulk(bulk))

        /** Alias for calling [addPrice] with `Price.ofPackage(package_)`. */
        fun addPrice(package_: Price.Package) = addPrice(Price.ofPackage(package_))

        /** Alias for calling [addPrice] with `Price.ofMatrix(matrix)`. */
        fun addPrice(matrix: Price.Matrix) = addPrice(Price.ofMatrix(matrix))

        /**
         * Alias for calling [addPrice] with `Price.ofThresholdTotalAmount(thresholdTotalAmount)`.
         */
        fun addPrice(thresholdTotalAmount: Price.ThresholdTotalAmount) =
            addPrice(Price.ofThresholdTotalAmount(thresholdTotalAmount))

        /** Alias for calling [addPrice] with `Price.ofTieredPackage(tieredPackage)`. */
        fun addPrice(tieredPackage: Price.TieredPackage) =
            addPrice(Price.ofTieredPackage(tieredPackage))

        /** Alias for calling [addPrice] with `Price.ofTieredWithMinimum(tieredWithMinimum)`. */
        fun addPrice(tieredWithMinimum: Price.TieredWithMinimum) =
            addPrice(Price.ofTieredWithMinimum(tieredWithMinimum))

        /** Alias for calling [addPrice] with `Price.ofGroupedTiered(groupedTiered)`. */
        fun addPrice(groupedTiered: Price.GroupedTiered) =
            addPrice(Price.ofGroupedTiered(groupedTiered))

        /**
         * Alias for calling [addPrice] with
         * `Price.ofTieredPackageWithMinimum(tieredPackageWithMinimum)`.
         */
        fun addPrice(tieredPackageWithMinimum: Price.TieredPackageWithMinimum) =
            addPrice(Price.ofTieredPackageWithMinimum(tieredPackageWithMinimum))

        /**
         * Alias for calling [addPrice] with `Price.ofPackageWithAllocation(packageWithAllocation)`.
         */
        fun addPrice(packageWithAllocation: Price.PackageWithAllocation) =
            addPrice(Price.ofPackageWithAllocation(packageWithAllocation))

        /** Alias for calling [addPrice] with `Price.ofUnitWithPercent(unitWithPercent)`. */
        fun addPrice(unitWithPercent: Price.UnitWithPercent) =
            addPrice(Price.ofUnitWithPercent(unitWithPercent))

        /**
         * Alias for calling [addPrice] with `Price.ofMatrixWithAllocation(matrixWithAllocation)`.
         */
        fun addPrice(matrixWithAllocation: Price.MatrixWithAllocation) =
            addPrice(Price.ofMatrixWithAllocation(matrixWithAllocation))

        /** Alias for calling [addPrice] with `Price.ofTieredWithProration(tieredWithProration)`. */
        fun addPrice(tieredWithProration: Price.TieredWithProration) =
            addPrice(Price.ofTieredWithProration(tieredWithProration))

        /** Alias for calling [addPrice] with `Price.ofUnitWithProration(unitWithProration)`. */
        fun addPrice(unitWithProration: Price.UnitWithProration) =
            addPrice(Price.ofUnitWithProration(unitWithProration))

        /** Alias for calling [addPrice] with `Price.ofGroupedAllocation(groupedAllocation)`. */
        fun addPrice(groupedAllocation: Price.GroupedAllocation) =
            addPrice(Price.ofGroupedAllocation(groupedAllocation))

        /** Alias for calling [addPrice] with `Price.ofBulkWithProration(bulkWithProration)`. */
        fun addPrice(bulkWithProration: Price.BulkWithProration) =
            addPrice(Price.ofBulkWithProration(bulkWithProration))

        /**
         * Alias for calling [addPrice] with
         * `Price.ofGroupedWithProratedMinimum(groupedWithProratedMinimum)`.
         */
        fun addPrice(groupedWithProratedMinimum: Price.GroupedWithProratedMinimum) =
            addPrice(Price.ofGroupedWithProratedMinimum(groupedWithProratedMinimum))

        /**
         * Alias for calling [addPrice] with
         * `Price.ofGroupedWithMeteredMinimum(groupedWithMeteredMinimum)`.
         */
        fun addPrice(groupedWithMeteredMinimum: Price.GroupedWithMeteredMinimum) =
            addPrice(Price.ofGroupedWithMeteredMinimum(groupedWithMeteredMinimum))

        /**
         * Alias for calling [addPrice] with
         * `Price.ofGroupedWithMinMaxThresholds(groupedWithMinMaxThresholds)`.
         */
        fun addPrice(groupedWithMinMaxThresholds: Price.GroupedWithMinMaxThresholds) =
            addPrice(Price.ofGroupedWithMinMaxThresholds(groupedWithMinMaxThresholds))

        /**
         * Alias for calling [addPrice] with `Price.ofMatrixWithDisplayName(matrixWithDisplayName)`.
         */
        fun addPrice(matrixWithDisplayName: Price.MatrixWithDisplayName) =
            addPrice(Price.ofMatrixWithDisplayName(matrixWithDisplayName))

        /**
         * Alias for calling [addPrice] with `Price.ofGroupedTieredPackage(groupedTieredPackage)`.
         */
        fun addPrice(groupedTieredPackage: Price.GroupedTieredPackage) =
            addPrice(Price.ofGroupedTieredPackage(groupedTieredPackage))

        /**
         * Alias for calling [addPrice] with `Price.ofMaxGroupTieredPackage(maxGroupTieredPackage)`.
         */
        fun addPrice(maxGroupTieredPackage: Price.MaxGroupTieredPackage) =
            addPrice(Price.ofMaxGroupTieredPackage(maxGroupTieredPackage))

        /**
         * Alias for calling [addPrice] with
         * `Price.ofScalableMatrixWithUnitPricing(scalableMatrixWithUnitPricing)`.
         */
        fun addPrice(scalableMatrixWithUnitPricing: Price.ScalableMatrixWithUnitPricing) =
            addPrice(Price.ofScalableMatrixWithUnitPricing(scalableMatrixWithUnitPricing))

        /**
         * Alias for calling [addPrice] with
         * `Price.ofScalableMatrixWithTieredPricing(scalableMatrixWithTieredPricing)`.
         */
        fun addPrice(scalableMatrixWithTieredPricing: Price.ScalableMatrixWithTieredPricing) =
            addPrice(Price.ofScalableMatrixWithTieredPricing(scalableMatrixWithTieredPricing))

        /**
         * Alias for calling [addPrice] with `Price.ofCumulativeGroupedBulk(cumulativeGroupedBulk)`.
         */
        fun addPrice(cumulativeGroupedBulk: Price.CumulativeGroupedBulk) =
            addPrice(Price.ofCumulativeGroupedBulk(cumulativeGroupedBulk))

        /** Alias for calling [addPrice] with `Price.ofMinimum(minimum)`. */
        fun addPrice(minimum: Price.Minimum) = addPrice(Price.ofMinimum(minimum))

        /** Alias for calling [addPrice] with `Price.ofPercent(percent)`. */
        fun addPrice(percent: Price.Percent) = addPrice(Price.ofPercent(percent))

        /** Alias for calling [addPrice] with `Price.ofEventOutput(eventOutput)`. */
        fun addPrice(eventOutput: Price.EventOutput) = addPrice(Price.ofEventOutput(eventOutput))

        fun version(version: Long) = version(JsonField.of(version))

        /**
         * Sets [Builder.version] to an arbitrary JSON value.
         *
         * You should usually call [Builder.version] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun version(version: JsonField<Long>) = apply { this.version = version }

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
         * Returns an immutable instance of [PlanVersion].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .adjustments()
         * .createdAt()
         * .planPhases()
         * .prices()
         * .version()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PlanVersion =
            PlanVersion(
                checkRequired("adjustments", adjustments).map { it.toImmutable() },
                checkRequired("createdAt", createdAt),
                checkRequired("planPhases", planPhases).map { it.toImmutable() },
                checkRequired("prices", prices).map { it.toImmutable() },
                checkRequired("version", version),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PlanVersion = apply {
        if (validated) {
            return@apply
        }

        adjustments().forEach { it.validate() }
        createdAt()
        planPhases()?.forEach { it.validate() }
        prices().forEach { it.validate() }
        version()
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
        (adjustments.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (createdAt.asKnown() == null) 0 else 1) +
            (planPhases.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (prices.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (version.asKnown() == null) 0 else 1)

    @JsonDeserialize(using = Adjustment.Deserializer::class)
    @JsonSerialize(using = Adjustment.Serializer::class)
    class Adjustment
    private constructor(
        private val usageDiscount: PlanPhaseUsageDiscountAdjustment? = null,
        private val amountDiscount: PlanPhaseAmountDiscountAdjustment? = null,
        private val percentageDiscount: PlanPhasePercentageDiscountAdjustment? = null,
        private val minimum: PlanPhaseMinimumAdjustment? = null,
        private val maximum: PlanPhaseMaximumAdjustment? = null,
        private val _json: JsonValue? = null,
    ) {

        fun usageDiscount(): PlanPhaseUsageDiscountAdjustment? = usageDiscount

        fun amountDiscount(): PlanPhaseAmountDiscountAdjustment? = amountDiscount

        fun percentageDiscount(): PlanPhasePercentageDiscountAdjustment? = percentageDiscount

        fun minimum(): PlanPhaseMinimumAdjustment? = minimum

        fun maximum(): PlanPhaseMaximumAdjustment? = maximum

        fun isUsageDiscount(): Boolean = usageDiscount != null

        fun isAmountDiscount(): Boolean = amountDiscount != null

        fun isPercentageDiscount(): Boolean = percentageDiscount != null

        fun isMinimum(): Boolean = minimum != null

        fun isMaximum(): Boolean = maximum != null

        fun asUsageDiscount(): PlanPhaseUsageDiscountAdjustment =
            usageDiscount.getOrThrow("usageDiscount")

        fun asAmountDiscount(): PlanPhaseAmountDiscountAdjustment =
            amountDiscount.getOrThrow("amountDiscount")

        fun asPercentageDiscount(): PlanPhasePercentageDiscountAdjustment =
            percentageDiscount.getOrThrow("percentageDiscount")

        fun asMinimum(): PlanPhaseMinimumAdjustment = minimum.getOrThrow("minimum")

        fun asMaximum(): PlanPhaseMaximumAdjustment = maximum.getOrThrow("maximum")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                usageDiscount != null -> visitor.visitUsageDiscount(usageDiscount)
                amountDiscount != null -> visitor.visitAmountDiscount(amountDiscount)
                percentageDiscount != null -> visitor.visitPercentageDiscount(percentageDiscount)
                minimum != null -> visitor.visitMinimum(minimum)
                maximum != null -> visitor.visitMaximum(maximum)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Adjustment = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitUsageDiscount(
                        usageDiscount: PlanPhaseUsageDiscountAdjustment
                    ) {
                        usageDiscount.validate()
                    }

                    override fun visitAmountDiscount(
                        amountDiscount: PlanPhaseAmountDiscountAdjustment
                    ) {
                        amountDiscount.validate()
                    }

                    override fun visitPercentageDiscount(
                        percentageDiscount: PlanPhasePercentageDiscountAdjustment
                    ) {
                        percentageDiscount.validate()
                    }

                    override fun visitMinimum(minimum: PlanPhaseMinimumAdjustment) {
                        minimum.validate()
                    }

                    override fun visitMaximum(maximum: PlanPhaseMaximumAdjustment) {
                        maximum.validate()
                    }
                }
            )
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
            accept(
                object : Visitor<Int> {
                    override fun visitUsageDiscount(
                        usageDiscount: PlanPhaseUsageDiscountAdjustment
                    ) = usageDiscount.validity()

                    override fun visitAmountDiscount(
                        amountDiscount: PlanPhaseAmountDiscountAdjustment
                    ) = amountDiscount.validity()

                    override fun visitPercentageDiscount(
                        percentageDiscount: PlanPhasePercentageDiscountAdjustment
                    ) = percentageDiscount.validity()

                    override fun visitMinimum(minimum: PlanPhaseMinimumAdjustment) =
                        minimum.validity()

                    override fun visitMaximum(maximum: PlanPhaseMaximumAdjustment) =
                        maximum.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Adjustment &&
                usageDiscount == other.usageDiscount &&
                amountDiscount == other.amountDiscount &&
                percentageDiscount == other.percentageDiscount &&
                minimum == other.minimum &&
                maximum == other.maximum
        }

        override fun hashCode(): Int =
            Objects.hash(usageDiscount, amountDiscount, percentageDiscount, minimum, maximum)

        override fun toString(): String =
            when {
                usageDiscount != null -> "Adjustment{usageDiscount=$usageDiscount}"
                amountDiscount != null -> "Adjustment{amountDiscount=$amountDiscount}"
                percentageDiscount != null -> "Adjustment{percentageDiscount=$percentageDiscount}"
                minimum != null -> "Adjustment{minimum=$minimum}"
                maximum != null -> "Adjustment{maximum=$maximum}"
                _json != null -> "Adjustment{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Adjustment")
            }

        companion object {

            fun ofUsageDiscount(usageDiscount: PlanPhaseUsageDiscountAdjustment) =
                Adjustment(usageDiscount = usageDiscount)

            fun ofAmountDiscount(amountDiscount: PlanPhaseAmountDiscountAdjustment) =
                Adjustment(amountDiscount = amountDiscount)

            fun ofPercentageDiscount(percentageDiscount: PlanPhasePercentageDiscountAdjustment) =
                Adjustment(percentageDiscount = percentageDiscount)

            fun ofMinimum(minimum: PlanPhaseMinimumAdjustment) = Adjustment(minimum = minimum)

            fun ofMaximum(maximum: PlanPhaseMaximumAdjustment) = Adjustment(maximum = maximum)
        }

        /**
         * An interface that defines how to map each variant of [Adjustment] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitUsageDiscount(usageDiscount: PlanPhaseUsageDiscountAdjustment): T

            fun visitAmountDiscount(amountDiscount: PlanPhaseAmountDiscountAdjustment): T

            fun visitPercentageDiscount(
                percentageDiscount: PlanPhasePercentageDiscountAdjustment
            ): T

            fun visitMinimum(minimum: PlanPhaseMinimumAdjustment): T

            fun visitMaximum(maximum: PlanPhaseMaximumAdjustment): T

            /**
             * Maps an unknown variant of [Adjustment] to a value of type [T].
             *
             * An instance of [Adjustment] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws OrbInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw OrbInvalidDataException("Unknown Adjustment: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Adjustment>(Adjustment::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Adjustment {
                val json = JsonValue.fromJsonNode(node)
                val adjustmentType = json.asObject()?.get("adjustment_type")?.asString()

                when (adjustmentType) {
                    "usage_discount" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<PlanPhaseUsageDiscountAdjustment>(),
                            )
                            ?.let { Adjustment(usageDiscount = it, _json = json) }
                            ?: Adjustment(_json = json)
                    }
                    "amount_discount" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<PlanPhaseAmountDiscountAdjustment>(),
                            )
                            ?.let { Adjustment(amountDiscount = it, _json = json) }
                            ?: Adjustment(_json = json)
                    }
                    "percentage_discount" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<PlanPhasePercentageDiscountAdjustment>(),
                            )
                            ?.let { Adjustment(percentageDiscount = it, _json = json) }
                            ?: Adjustment(_json = json)
                    }
                    "minimum" -> {
                        return tryDeserialize(node, jacksonTypeRef<PlanPhaseMinimumAdjustment>())
                            ?.let { Adjustment(minimum = it, _json = json) }
                            ?: Adjustment(_json = json)
                    }
                    "maximum" -> {
                        return tryDeserialize(node, jacksonTypeRef<PlanPhaseMaximumAdjustment>())
                            ?.let { Adjustment(maximum = it, _json = json) }
                            ?: Adjustment(_json = json)
                    }
                }

                return Adjustment(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<Adjustment>(Adjustment::class) {

            override fun serialize(
                value: Adjustment,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.usageDiscount != null -> generator.writeObject(value.usageDiscount)
                    value.amountDiscount != null -> generator.writeObject(value.amountDiscount)
                    value.percentageDiscount != null ->
                        generator.writeObject(value.percentageDiscount)
                    value.minimum != null -> generator.writeObject(value.minimum)
                    value.maximum != null -> generator.writeObject(value.maximum)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Adjustment")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PlanVersion &&
            adjustments == other.adjustments &&
            createdAt == other.createdAt &&
            planPhases == other.planPhases &&
            prices == other.prices &&
            version == other.version &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(adjustments, createdAt, planPhases, prices, version, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PlanVersion{adjustments=$adjustments, createdAt=$createdAt, planPhases=$planPhases, prices=$prices, version=$version, additionalProperties=$additionalProperties}"
}
