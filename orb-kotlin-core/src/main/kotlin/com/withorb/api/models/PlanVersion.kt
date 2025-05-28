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
        fun addAdjustment(usageDiscount: Adjustment.UsageDiscount) =
            addAdjustment(Adjustment.ofUsageDiscount(usageDiscount))

        /** Alias for calling [addAdjustment] with `Adjustment.ofAmountDiscount(amountDiscount)`. */
        fun addAdjustment(amountDiscount: Adjustment.AmountDiscount) =
            addAdjustment(Adjustment.ofAmountDiscount(amountDiscount))

        /**
         * Alias for calling [addAdjustment] with
         * `Adjustment.ofPercentageDiscount(percentageDiscount)`.
         */
        fun addAdjustment(percentageDiscount: Adjustment.PercentageDiscount) =
            addAdjustment(Adjustment.ofPercentageDiscount(percentageDiscount))

        /** Alias for calling [addAdjustment] with `Adjustment.ofMinimum(minimum)`. */
        fun addAdjustment(minimum: Adjustment.Minimum) =
            addAdjustment(Adjustment.ofMinimum(minimum))

        /** Alias for calling [addAdjustment] with `Adjustment.ofMaximum(maximum)`. */
        fun addAdjustment(maximum: Adjustment.Maximum) =
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

        /** Alias for calling [addPrice] with `Price.ofPackage(package_)`. */
        fun addPrice(package_: Price.Package) = addPrice(Price.ofPackage(package_))

        /** Alias for calling [addPrice] with `Price.ofMatrix(matrix)`. */
        fun addPrice(matrix: Price.Matrix) = addPrice(Price.ofMatrix(matrix))

        /** Alias for calling [addPrice] with `Price.ofTiered(tiered)`. */
        fun addPrice(tiered: Price.Tiered) = addPrice(Price.ofTiered(tiered))

        /** Alias for calling [addPrice] with `Price.ofTieredBps(tieredBps)`. */
        fun addPrice(tieredBps: Price.TieredBps) = addPrice(Price.ofTieredBps(tieredBps))

        /** Alias for calling [addPrice] with `Price.ofBps(bps)`. */
        fun addPrice(bps: Price.Bps) = addPrice(Price.ofBps(bps))

        /** Alias for calling [addPrice] with `Price.ofBulkBps(bulkBps)`. */
        fun addPrice(bulkBps: Price.BulkBps) = addPrice(Price.ofBulkBps(bulkBps))

        /** Alias for calling [addPrice] with `Price.ofBulk(bulk)`. */
        fun addPrice(bulk: Price.Bulk) = addPrice(Price.ofBulk(bulk))

        /**
         * Alias for calling [addPrice] with `Price.ofThresholdTotalAmount(thresholdTotalAmount)`.
         */
        fun addPrice(thresholdTotalAmount: Price.ThresholdTotalAmount) =
            addPrice(Price.ofThresholdTotalAmount(thresholdTotalAmount))

        /** Alias for calling [addPrice] with `Price.ofTieredPackage(tieredPackage)`. */
        fun addPrice(tieredPackage: Price.TieredPackage) =
            addPrice(Price.ofTieredPackage(tieredPackage))

        /** Alias for calling [addPrice] with `Price.ofGroupedTiered(groupedTiered)`. */
        fun addPrice(groupedTiered: Price.GroupedTiered) =
            addPrice(Price.ofGroupedTiered(groupedTiered))

        /** Alias for calling [addPrice] with `Price.ofTieredWithMinimum(tieredWithMinimum)`. */
        fun addPrice(tieredWithMinimum: Price.TieredWithMinimum) =
            addPrice(Price.ofTieredWithMinimum(tieredWithMinimum))

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
         * Alias for calling [addPrice] with `Price.ofMatrixWithDisplayName(matrixWithDisplayName)`.
         */
        fun addPrice(matrixWithDisplayName: Price.MatrixWithDisplayName) =
            addPrice(Price.ofMatrixWithDisplayName(matrixWithDisplayName))

        /** Alias for calling [addPrice] with `Price.ofBulkWithProration(bulkWithProration)`. */
        fun addPrice(bulkWithProration: Price.BulkWithProration) =
            addPrice(Price.ofBulkWithProration(bulkWithProration))

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
        private val usageDiscount: UsageDiscount? = null,
        private val amountDiscount: AmountDiscount? = null,
        private val percentageDiscount: PercentageDiscount? = null,
        private val minimum: Minimum? = null,
        private val maximum: Maximum? = null,
        private val _json: JsonValue? = null,
    ) {

        fun usageDiscount(): UsageDiscount? = usageDiscount

        fun amountDiscount(): AmountDiscount? = amountDiscount

        fun percentageDiscount(): PercentageDiscount? = percentageDiscount

        fun minimum(): Minimum? = minimum

        fun maximum(): Maximum? = maximum

        fun isUsageDiscount(): Boolean = usageDiscount != null

        fun isAmountDiscount(): Boolean = amountDiscount != null

        fun isPercentageDiscount(): Boolean = percentageDiscount != null

        fun isMinimum(): Boolean = minimum != null

        fun isMaximum(): Boolean = maximum != null

        fun asUsageDiscount(): UsageDiscount = usageDiscount.getOrThrow("usageDiscount")

        fun asAmountDiscount(): AmountDiscount = amountDiscount.getOrThrow("amountDiscount")

        fun asPercentageDiscount(): PercentageDiscount =
            percentageDiscount.getOrThrow("percentageDiscount")

        fun asMinimum(): Minimum = minimum.getOrThrow("minimum")

        fun asMaximum(): Maximum = maximum.getOrThrow("maximum")

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
                    override fun visitUsageDiscount(usageDiscount: UsageDiscount) {
                        usageDiscount.validate()
                    }

                    override fun visitAmountDiscount(amountDiscount: AmountDiscount) {
                        amountDiscount.validate()
                    }

                    override fun visitPercentageDiscount(percentageDiscount: PercentageDiscount) {
                        percentageDiscount.validate()
                    }

                    override fun visitMinimum(minimum: Minimum) {
                        minimum.validate()
                    }

                    override fun visitMaximum(maximum: Maximum) {
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
                    override fun visitUsageDiscount(usageDiscount: UsageDiscount) =
                        usageDiscount.validity()

                    override fun visitAmountDiscount(amountDiscount: AmountDiscount) =
                        amountDiscount.validity()

                    override fun visitPercentageDiscount(percentageDiscount: PercentageDiscount) =
                        percentageDiscount.validity()

                    override fun visitMinimum(minimum: Minimum) = minimum.validity()

                    override fun visitMaximum(maximum: Maximum) = maximum.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Adjustment && usageDiscount == other.usageDiscount && amountDiscount == other.amountDiscount && percentageDiscount == other.percentageDiscount && minimum == other.minimum && maximum == other.maximum /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(usageDiscount, amountDiscount, percentageDiscount, minimum, maximum) /* spotless:on */

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

            fun ofUsageDiscount(usageDiscount: UsageDiscount) =
                Adjustment(usageDiscount = usageDiscount)

            fun ofAmountDiscount(amountDiscount: AmountDiscount) =
                Adjustment(amountDiscount = amountDiscount)

            fun ofPercentageDiscount(percentageDiscount: PercentageDiscount) =
                Adjustment(percentageDiscount = percentageDiscount)

            fun ofMinimum(minimum: Minimum) = Adjustment(minimum = minimum)

            fun ofMaximum(maximum: Maximum) = Adjustment(maximum = maximum)
        }

        /**
         * An interface that defines how to map each variant of [Adjustment] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitUsageDiscount(usageDiscount: UsageDiscount): T

            fun visitAmountDiscount(amountDiscount: AmountDiscount): T

            fun visitPercentageDiscount(percentageDiscount: PercentageDiscount): T

            fun visitMinimum(minimum: Minimum): T

            fun visitMaximum(maximum: Maximum): T

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
                        return tryDeserialize(node, jacksonTypeRef<UsageDiscount>())?.let {
                            Adjustment(usageDiscount = it, _json = json)
                        } ?: Adjustment(_json = json)
                    }
                    "amount_discount" -> {
                        return tryDeserialize(node, jacksonTypeRef<AmountDiscount>())?.let {
                            Adjustment(amountDiscount = it, _json = json)
                        } ?: Adjustment(_json = json)
                    }
                    "percentage_discount" -> {
                        return tryDeserialize(node, jacksonTypeRef<PercentageDiscount>())?.let {
                            Adjustment(percentageDiscount = it, _json = json)
                        } ?: Adjustment(_json = json)
                    }
                    "minimum" -> {
                        return tryDeserialize(node, jacksonTypeRef<Minimum>())?.let {
                            Adjustment(minimum = it, _json = json)
                        } ?: Adjustment(_json = json)
                    }
                    "maximum" -> {
                        return tryDeserialize(node, jacksonTypeRef<Maximum>())?.let {
                            Adjustment(maximum = it, _json = json)
                        } ?: Adjustment(_json = json)
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

        class UsageDiscount
        private constructor(
            private val id: JsonField<String>,
            private val adjustmentType: JsonValue,
            private val appliesToPriceIds: JsonField<List<String>>,
            private val filters: JsonField<List<Filter>>,
            private val isInvoiceLevel: JsonField<Boolean>,
            private val planPhaseOrder: JsonField<Long>,
            private val reason: JsonField<String>,
            private val usageDiscount: JsonField<Double>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("adjustment_type")
                @ExcludeMissing
                adjustmentType: JsonValue = JsonMissing.of(),
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("filters")
                @ExcludeMissing
                filters: JsonField<List<Filter>> = JsonMissing.of(),
                @JsonProperty("is_invoice_level")
                @ExcludeMissing
                isInvoiceLevel: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("plan_phase_order")
                @ExcludeMissing
                planPhaseOrder: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("reason")
                @ExcludeMissing
                reason: JsonField<String> = JsonMissing.of(),
                @JsonProperty("usage_discount")
                @ExcludeMissing
                usageDiscount: JsonField<Double> = JsonMissing.of(),
            ) : this(
                id,
                adjustmentType,
                appliesToPriceIds,
                filters,
                isInvoiceLevel,
                planPhaseOrder,
                reason,
                usageDiscount,
                mutableMapOf(),
            )

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("usage_discount")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("adjustment_type")
            @ExcludeMissing
            fun _adjustmentType(): JsonValue = adjustmentType

            /**
             * The price IDs that this adjustment applies to.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            @Deprecated("deprecated")
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /**
             * The filters that determine which prices to apply this adjustment to.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun filters(): List<Filter> = filters.getRequired("filters")

            /**
             * True for adjustments that apply to an entire invocice, false for adjustments that
             * apply to only one price.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun isInvoiceLevel(): Boolean = isInvoiceLevel.getRequired("is_invoice_level")

            /**
             * The plan phase in which this adjustment is active.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun planPhaseOrder(): Long? = planPhaseOrder.getNullable("plan_phase_order")

            /**
             * The reason for the adjustment.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun reason(): String? = reason.getNullable("reason")

            /**
             * The number of usage units by which to discount the price this adjustment applies to
             * in a given billing period.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun usageDiscount(): Double = usageDiscount.getRequired("usage_discount")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [appliesToPriceIds].
             *
             * Unlike [appliesToPriceIds], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @Deprecated("deprecated")
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

            /**
             * Returns the raw JSON value of [filters].
             *
             * Unlike [filters], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("filters")
            @ExcludeMissing
            fun _filters(): JsonField<List<Filter>> = filters

            /**
             * Returns the raw JSON value of [isInvoiceLevel].
             *
             * Unlike [isInvoiceLevel], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("is_invoice_level")
            @ExcludeMissing
            fun _isInvoiceLevel(): JsonField<Boolean> = isInvoiceLevel

            /**
             * Returns the raw JSON value of [planPhaseOrder].
             *
             * Unlike [planPhaseOrder], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("plan_phase_order")
            @ExcludeMissing
            fun _planPhaseOrder(): JsonField<Long> = planPhaseOrder

            /**
             * Returns the raw JSON value of [reason].
             *
             * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

            /**
             * Returns the raw JSON value of [usageDiscount].
             *
             * Unlike [usageDiscount], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("usage_discount")
            @ExcludeMissing
            fun _usageDiscount(): JsonField<Double> = usageDiscount

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
                 * Returns a mutable builder for constructing an instance of [UsageDiscount].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .id()
                 * .appliesToPriceIds()
                 * .filters()
                 * .isInvoiceLevel()
                 * .planPhaseOrder()
                 * .reason()
                 * .usageDiscount()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [UsageDiscount]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var adjustmentType: JsonValue = JsonValue.from("usage_discount")
                private var appliesToPriceIds: JsonField<MutableList<String>>? = null
                private var filters: JsonField<MutableList<Filter>>? = null
                private var isInvoiceLevel: JsonField<Boolean>? = null
                private var planPhaseOrder: JsonField<Long>? = null
                private var reason: JsonField<String>? = null
                private var usageDiscount: JsonField<Double>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(usageDiscount: UsageDiscount) = apply {
                    id = usageDiscount.id
                    adjustmentType = usageDiscount.adjustmentType
                    appliesToPriceIds = usageDiscount.appliesToPriceIds.map { it.toMutableList() }
                    filters = usageDiscount.filters.map { it.toMutableList() }
                    isInvoiceLevel = usageDiscount.isInvoiceLevel
                    planPhaseOrder = usageDiscount.planPhaseOrder
                    reason = usageDiscount.reason
                    this.usageDiscount = usageDiscount.usageDiscount
                    additionalProperties = usageDiscount.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("usage_discount")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun adjustmentType(adjustmentType: JsonValue) = apply {
                    this.adjustmentType = adjustmentType
                }

                /** The price IDs that this adjustment applies to. */
                @Deprecated("deprecated")
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /**
                 * Sets [Builder.appliesToPriceIds] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.appliesToPriceIds] with a well-typed
                 * `List<String>` value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                @Deprecated("deprecated")
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [appliesToPriceIds].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                @Deprecated("deprecated")
                fun addAppliesToPriceId(appliesToPriceId: String) = apply {
                    appliesToPriceIds =
                        (appliesToPriceIds ?: JsonField.of(mutableListOf())).also {
                            checkKnown("appliesToPriceIds", it).add(appliesToPriceId)
                        }
                }

                /** The filters that determine which prices to apply this adjustment to. */
                fun filters(filters: List<Filter>) = filters(JsonField.of(filters))

                /**
                 * Sets [Builder.filters] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.filters] with a well-typed `List<Filter>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun filters(filters: JsonField<List<Filter>>) = apply {
                    this.filters = filters.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Filter] to [filters].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addFilter(filter: Filter) = apply {
                    filters =
                        (filters ?: JsonField.of(mutableListOf())).also {
                            checkKnown("filters", it).add(filter)
                        }
                }

                /**
                 * True for adjustments that apply to an entire invocice, false for adjustments that
                 * apply to only one price.
                 */
                fun isInvoiceLevel(isInvoiceLevel: Boolean) =
                    isInvoiceLevel(JsonField.of(isInvoiceLevel))

                /**
                 * Sets [Builder.isInvoiceLevel] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.isInvoiceLevel] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun isInvoiceLevel(isInvoiceLevel: JsonField<Boolean>) = apply {
                    this.isInvoiceLevel = isInvoiceLevel
                }

                /** The plan phase in which this adjustment is active. */
                fun planPhaseOrder(planPhaseOrder: Long?) =
                    planPhaseOrder(JsonField.ofNullable(planPhaseOrder))

                /**
                 * Alias for [Builder.planPhaseOrder].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun planPhaseOrder(planPhaseOrder: Long) = planPhaseOrder(planPhaseOrder as Long?)

                /**
                 * Sets [Builder.planPhaseOrder] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.planPhaseOrder] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun planPhaseOrder(planPhaseOrder: JsonField<Long>) = apply {
                    this.planPhaseOrder = planPhaseOrder
                }

                /** The reason for the adjustment. */
                fun reason(reason: String?) = reason(JsonField.ofNullable(reason))

                /**
                 * Sets [Builder.reason] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reason] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun reason(reason: JsonField<String>) = apply { this.reason = reason }

                /**
                 * The number of usage units by which to discount the price this adjustment applies
                 * to in a given billing period.
                 */
                fun usageDiscount(usageDiscount: Double) =
                    usageDiscount(JsonField.of(usageDiscount))

                /**
                 * Sets [Builder.usageDiscount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.usageDiscount] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun usageDiscount(usageDiscount: JsonField<Double>) = apply {
                    this.usageDiscount = usageDiscount
                }

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
                 * Returns an immutable instance of [UsageDiscount].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .id()
                 * .appliesToPriceIds()
                 * .filters()
                 * .isInvoiceLevel()
                 * .planPhaseOrder()
                 * .reason()
                 * .usageDiscount()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): UsageDiscount =
                    UsageDiscount(
                        checkRequired("id", id),
                        adjustmentType,
                        checkRequired("appliesToPriceIds", appliesToPriceIds).map {
                            it.toImmutable()
                        },
                        checkRequired("filters", filters).map { it.toImmutable() },
                        checkRequired("isInvoiceLevel", isInvoiceLevel),
                        checkRequired("planPhaseOrder", planPhaseOrder),
                        checkRequired("reason", reason),
                        checkRequired("usageDiscount", usageDiscount),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): UsageDiscount = apply {
                if (validated) {
                    return@apply
                }

                id()
                _adjustmentType().let {
                    if (it != JsonValue.from("usage_discount")) {
                        throw OrbInvalidDataException("'adjustmentType' is invalid, received $it")
                    }
                }
                appliesToPriceIds()
                filters().forEach { it.validate() }
                isInvoiceLevel()
                planPhaseOrder()
                reason()
                usageDiscount()
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
                (if (id.asKnown() == null) 0 else 1) +
                    adjustmentType.let { if (it == JsonValue.from("usage_discount")) 1 else 0 } +
                    (appliesToPriceIds.asKnown()?.size ?: 0) +
                    (filters.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (isInvoiceLevel.asKnown() == null) 0 else 1) +
                    (if (planPhaseOrder.asKnown() == null) 0 else 1) +
                    (if (reason.asKnown() == null) 0 else 1) +
                    (if (usageDiscount.asKnown() == null) 0 else 1)

            class Filter
            private constructor(
                private val field: JsonField<Field>,
                private val operator: JsonField<Operator>,
                private val values: JsonField<List<String>>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("field")
                    @ExcludeMissing
                    field: JsonField<Field> = JsonMissing.of(),
                    @JsonProperty("operator")
                    @ExcludeMissing
                    operator: JsonField<Operator> = JsonMissing.of(),
                    @JsonProperty("values")
                    @ExcludeMissing
                    values: JsonField<List<String>> = JsonMissing.of(),
                ) : this(field, operator, values, mutableMapOf())

                /**
                 * The property of the price to filter on.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun field(): Field = field.getRequired("field")

                /**
                 * Should prices that match the filter be included or excluded.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun operator(): Operator = operator.getRequired("operator")

                /**
                 * The IDs or values that match this filter.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun values(): List<String> = values.getRequired("values")

                /**
                 * Returns the raw JSON value of [field].
                 *
                 * Unlike [field], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("field") @ExcludeMissing fun _field(): JsonField<Field> = field

                /**
                 * Returns the raw JSON value of [operator].
                 *
                 * Unlike [operator], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("operator")
                @ExcludeMissing
                fun _operator(): JsonField<Operator> = operator

                /**
                 * Returns the raw JSON value of [values].
                 *
                 * Unlike [values], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("values")
                @ExcludeMissing
                fun _values(): JsonField<List<String>> = values

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
                     * Returns a mutable builder for constructing an instance of [Filter].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .field()
                     * .operator()
                     * .values()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [Filter]. */
                class Builder internal constructor() {

                    private var field: JsonField<Field>? = null
                    private var operator: JsonField<Operator>? = null
                    private var values: JsonField<MutableList<String>>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(filter: Filter) = apply {
                        field = filter.field
                        operator = filter.operator
                        values = filter.values.map { it.toMutableList() }
                        additionalProperties = filter.additionalProperties.toMutableMap()
                    }

                    /** The property of the price to filter on. */
                    fun field(field: Field) = field(JsonField.of(field))

                    /**
                     * Sets [Builder.field] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.field] with a well-typed [Field] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun field(field: JsonField<Field>) = apply { this.field = field }

                    /** Should prices that match the filter be included or excluded. */
                    fun operator(operator: Operator) = operator(JsonField.of(operator))

                    /**
                     * Sets [Builder.operator] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.operator] with a well-typed [Operator] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun operator(operator: JsonField<Operator>) = apply { this.operator = operator }

                    /** The IDs or values that match this filter. */
                    fun values(values: List<String>) = values(JsonField.of(values))

                    /**
                     * Sets [Builder.values] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.values] with a well-typed `List<String>`
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun values(values: JsonField<List<String>>) = apply {
                        this.values = values.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [String] to [values].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addValue(value: String) = apply {
                        values =
                            (values ?: JsonField.of(mutableListOf())).also {
                                checkKnown("values", it).add(value)
                            }
                    }

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
                     * Returns an immutable instance of [Filter].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .field()
                     * .operator()
                     * .values()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Filter =
                        Filter(
                            checkRequired("field", field),
                            checkRequired("operator", operator),
                            checkRequired("values", values).map { it.toImmutable() },
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Filter = apply {
                    if (validated) {
                        return@apply
                    }

                    field().validate()
                    operator().validate()
                    values()
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
                    (field.asKnown()?.validity() ?: 0) +
                        (operator.asKnown()?.validity() ?: 0) +
                        (values.asKnown()?.size ?: 0)

                /** The property of the price to filter on. */
                class Field @JsonCreator private constructor(private val value: JsonField<String>) :
                    Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        val PRICE_ID = of("price_id")

                        val ITEM_ID = of("item_id")

                        val PRICE_TYPE = of("price_type")

                        val CURRENCY = of("currency")

                        val PRICING_UNIT_ID = of("pricing_unit_id")

                        fun of(value: String) = Field(JsonField.of(value))
                    }

                    /** An enum containing [Field]'s known values. */
                    enum class Known {
                        PRICE_ID,
                        ITEM_ID,
                        PRICE_TYPE,
                        CURRENCY,
                        PRICING_UNIT_ID,
                    }

                    /**
                     * An enum containing [Field]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Field] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        PRICE_ID,
                        ITEM_ID,
                        PRICE_TYPE,
                        CURRENCY,
                        PRICING_UNIT_ID,
                        /**
                         * An enum member indicating that [Field] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            PRICE_ID -> Value.PRICE_ID
                            ITEM_ID -> Value.ITEM_ID
                            PRICE_TYPE -> Value.PRICE_TYPE
                            CURRENCY -> Value.CURRENCY
                            PRICING_UNIT_ID -> Value.PRICING_UNIT_ID
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws OrbInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            PRICE_ID -> Known.PRICE_ID
                            ITEM_ID -> Known.ITEM_ID
                            PRICE_TYPE -> Known.PRICE_TYPE
                            CURRENCY -> Known.CURRENCY
                            PRICING_UNIT_ID -> Known.PRICING_UNIT_ID
                            else -> throw OrbInvalidDataException("Unknown Field: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws OrbInvalidDataException if this class instance's value does not have
                     *   the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString()
                            ?: throw OrbInvalidDataException("Value is not a String")

                    private var validated: Boolean = false

                    fun validate(): Field = apply {
                        if (validated) {
                            return@apply
                        }

                        known()
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
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Field && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                /** Should prices that match the filter be included or excluded. */
                class Operator
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        val INCLUDES = of("includes")

                        val EXCLUDES = of("excludes")

                        fun of(value: String) = Operator(JsonField.of(value))
                    }

                    /** An enum containing [Operator]'s known values. */
                    enum class Known {
                        INCLUDES,
                        EXCLUDES,
                    }

                    /**
                     * An enum containing [Operator]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [Operator] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        INCLUDES,
                        EXCLUDES,
                        /**
                         * An enum member indicating that [Operator] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            INCLUDES -> Value.INCLUDES
                            EXCLUDES -> Value.EXCLUDES
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws OrbInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            INCLUDES -> Known.INCLUDES
                            EXCLUDES -> Known.EXCLUDES
                            else -> throw OrbInvalidDataException("Unknown Operator: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws OrbInvalidDataException if this class instance's value does not have
                     *   the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString()
                            ?: throw OrbInvalidDataException("Value is not a String")

                    private var validated: Boolean = false

                    fun validate(): Operator = apply {
                        if (validated) {
                            return@apply
                        }

                        known()
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
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Operator && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Filter && field == other.field && operator == other.operator && values == other.values && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(field, operator, values, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Filter{field=$field, operator=$operator, values=$values, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is UsageDiscount && id == other.id && adjustmentType == other.adjustmentType && appliesToPriceIds == other.appliesToPriceIds && filters == other.filters && isInvoiceLevel == other.isInvoiceLevel && planPhaseOrder == other.planPhaseOrder && reason == other.reason && usageDiscount == other.usageDiscount && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, adjustmentType, appliesToPriceIds, filters, isInvoiceLevel, planPhaseOrder, reason, usageDiscount, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UsageDiscount{id=$id, adjustmentType=$adjustmentType, appliesToPriceIds=$appliesToPriceIds, filters=$filters, isInvoiceLevel=$isInvoiceLevel, planPhaseOrder=$planPhaseOrder, reason=$reason, usageDiscount=$usageDiscount, additionalProperties=$additionalProperties}"
        }

        class AmountDiscount
        private constructor(
            private val id: JsonField<String>,
            private val adjustmentType: JsonValue,
            private val amountDiscount: JsonField<String>,
            private val appliesToPriceIds: JsonField<List<String>>,
            private val filters: JsonField<List<Filter>>,
            private val isInvoiceLevel: JsonField<Boolean>,
            private val planPhaseOrder: JsonField<Long>,
            private val reason: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("adjustment_type")
                @ExcludeMissing
                adjustmentType: JsonValue = JsonMissing.of(),
                @JsonProperty("amount_discount")
                @ExcludeMissing
                amountDiscount: JsonField<String> = JsonMissing.of(),
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("filters")
                @ExcludeMissing
                filters: JsonField<List<Filter>> = JsonMissing.of(),
                @JsonProperty("is_invoice_level")
                @ExcludeMissing
                isInvoiceLevel: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("plan_phase_order")
                @ExcludeMissing
                planPhaseOrder: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("reason") @ExcludeMissing reason: JsonField<String> = JsonMissing.of(),
            ) : this(
                id,
                adjustmentType,
                amountDiscount,
                appliesToPriceIds,
                filters,
                isInvoiceLevel,
                planPhaseOrder,
                reason,
                mutableMapOf(),
            )

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("amount_discount")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("adjustment_type")
            @ExcludeMissing
            fun _adjustmentType(): JsonValue = adjustmentType

            /**
             * The amount by which to discount the prices this adjustment applies to in a given
             * billing period.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amountDiscount(): String = amountDiscount.getRequired("amount_discount")

            /**
             * The price IDs that this adjustment applies to.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            @Deprecated("deprecated")
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /**
             * The filters that determine which prices to apply this adjustment to.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun filters(): List<Filter> = filters.getRequired("filters")

            /**
             * True for adjustments that apply to an entire invocice, false for adjustments that
             * apply to only one price.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun isInvoiceLevel(): Boolean = isInvoiceLevel.getRequired("is_invoice_level")

            /**
             * The plan phase in which this adjustment is active.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun planPhaseOrder(): Long? = planPhaseOrder.getNullable("plan_phase_order")

            /**
             * The reason for the adjustment.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun reason(): String? = reason.getNullable("reason")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [amountDiscount].
             *
             * Unlike [amountDiscount], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("amount_discount")
            @ExcludeMissing
            fun _amountDiscount(): JsonField<String> = amountDiscount

            /**
             * Returns the raw JSON value of [appliesToPriceIds].
             *
             * Unlike [appliesToPriceIds], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @Deprecated("deprecated")
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

            /**
             * Returns the raw JSON value of [filters].
             *
             * Unlike [filters], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("filters")
            @ExcludeMissing
            fun _filters(): JsonField<List<Filter>> = filters

            /**
             * Returns the raw JSON value of [isInvoiceLevel].
             *
             * Unlike [isInvoiceLevel], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("is_invoice_level")
            @ExcludeMissing
            fun _isInvoiceLevel(): JsonField<Boolean> = isInvoiceLevel

            /**
             * Returns the raw JSON value of [planPhaseOrder].
             *
             * Unlike [planPhaseOrder], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("plan_phase_order")
            @ExcludeMissing
            fun _planPhaseOrder(): JsonField<Long> = planPhaseOrder

            /**
             * Returns the raw JSON value of [reason].
             *
             * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

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
                 * Returns a mutable builder for constructing an instance of [AmountDiscount].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .id()
                 * .amountDiscount()
                 * .appliesToPriceIds()
                 * .filters()
                 * .isInvoiceLevel()
                 * .planPhaseOrder()
                 * .reason()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [AmountDiscount]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var adjustmentType: JsonValue = JsonValue.from("amount_discount")
                private var amountDiscount: JsonField<String>? = null
                private var appliesToPriceIds: JsonField<MutableList<String>>? = null
                private var filters: JsonField<MutableList<Filter>>? = null
                private var isInvoiceLevel: JsonField<Boolean>? = null
                private var planPhaseOrder: JsonField<Long>? = null
                private var reason: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(amountDiscount: AmountDiscount) = apply {
                    id = amountDiscount.id
                    adjustmentType = amountDiscount.adjustmentType
                    this.amountDiscount = amountDiscount.amountDiscount
                    appliesToPriceIds = amountDiscount.appliesToPriceIds.map { it.toMutableList() }
                    filters = amountDiscount.filters.map { it.toMutableList() }
                    isInvoiceLevel = amountDiscount.isInvoiceLevel
                    planPhaseOrder = amountDiscount.planPhaseOrder
                    reason = amountDiscount.reason
                    additionalProperties = amountDiscount.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("amount_discount")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun adjustmentType(adjustmentType: JsonValue) = apply {
                    this.adjustmentType = adjustmentType
                }

                /**
                 * The amount by which to discount the prices this adjustment applies to in a given
                 * billing period.
                 */
                fun amountDiscount(amountDiscount: String) =
                    amountDiscount(JsonField.of(amountDiscount))

                /**
                 * Sets [Builder.amountDiscount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amountDiscount] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun amountDiscount(amountDiscount: JsonField<String>) = apply {
                    this.amountDiscount = amountDiscount
                }

                /** The price IDs that this adjustment applies to. */
                @Deprecated("deprecated")
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /**
                 * Sets [Builder.appliesToPriceIds] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.appliesToPriceIds] with a well-typed
                 * `List<String>` value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                @Deprecated("deprecated")
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [appliesToPriceIds].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                @Deprecated("deprecated")
                fun addAppliesToPriceId(appliesToPriceId: String) = apply {
                    appliesToPriceIds =
                        (appliesToPriceIds ?: JsonField.of(mutableListOf())).also {
                            checkKnown("appliesToPriceIds", it).add(appliesToPriceId)
                        }
                }

                /** The filters that determine which prices to apply this adjustment to. */
                fun filters(filters: List<Filter>) = filters(JsonField.of(filters))

                /**
                 * Sets [Builder.filters] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.filters] with a well-typed `List<Filter>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun filters(filters: JsonField<List<Filter>>) = apply {
                    this.filters = filters.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Filter] to [filters].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addFilter(filter: Filter) = apply {
                    filters =
                        (filters ?: JsonField.of(mutableListOf())).also {
                            checkKnown("filters", it).add(filter)
                        }
                }

                /**
                 * True for adjustments that apply to an entire invocice, false for adjustments that
                 * apply to only one price.
                 */
                fun isInvoiceLevel(isInvoiceLevel: Boolean) =
                    isInvoiceLevel(JsonField.of(isInvoiceLevel))

                /**
                 * Sets [Builder.isInvoiceLevel] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.isInvoiceLevel] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun isInvoiceLevel(isInvoiceLevel: JsonField<Boolean>) = apply {
                    this.isInvoiceLevel = isInvoiceLevel
                }

                /** The plan phase in which this adjustment is active. */
                fun planPhaseOrder(planPhaseOrder: Long?) =
                    planPhaseOrder(JsonField.ofNullable(planPhaseOrder))

                /**
                 * Alias for [Builder.planPhaseOrder].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun planPhaseOrder(planPhaseOrder: Long) = planPhaseOrder(planPhaseOrder as Long?)

                /**
                 * Sets [Builder.planPhaseOrder] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.planPhaseOrder] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun planPhaseOrder(planPhaseOrder: JsonField<Long>) = apply {
                    this.planPhaseOrder = planPhaseOrder
                }

                /** The reason for the adjustment. */
                fun reason(reason: String?) = reason(JsonField.ofNullable(reason))

                /**
                 * Sets [Builder.reason] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reason] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun reason(reason: JsonField<String>) = apply { this.reason = reason }

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
                 * Returns an immutable instance of [AmountDiscount].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .id()
                 * .amountDiscount()
                 * .appliesToPriceIds()
                 * .filters()
                 * .isInvoiceLevel()
                 * .planPhaseOrder()
                 * .reason()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): AmountDiscount =
                    AmountDiscount(
                        checkRequired("id", id),
                        adjustmentType,
                        checkRequired("amountDiscount", amountDiscount),
                        checkRequired("appliesToPriceIds", appliesToPriceIds).map {
                            it.toImmutable()
                        },
                        checkRequired("filters", filters).map { it.toImmutable() },
                        checkRequired("isInvoiceLevel", isInvoiceLevel),
                        checkRequired("planPhaseOrder", planPhaseOrder),
                        checkRequired("reason", reason),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): AmountDiscount = apply {
                if (validated) {
                    return@apply
                }

                id()
                _adjustmentType().let {
                    if (it != JsonValue.from("amount_discount")) {
                        throw OrbInvalidDataException("'adjustmentType' is invalid, received $it")
                    }
                }
                amountDiscount()
                appliesToPriceIds()
                filters().forEach { it.validate() }
                isInvoiceLevel()
                planPhaseOrder()
                reason()
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
                (if (id.asKnown() == null) 0 else 1) +
                    adjustmentType.let { if (it == JsonValue.from("amount_discount")) 1 else 0 } +
                    (if (amountDiscount.asKnown() == null) 0 else 1) +
                    (appliesToPriceIds.asKnown()?.size ?: 0) +
                    (filters.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (isInvoiceLevel.asKnown() == null) 0 else 1) +
                    (if (planPhaseOrder.asKnown() == null) 0 else 1) +
                    (if (reason.asKnown() == null) 0 else 1)

            class Filter
            private constructor(
                private val field: JsonField<Field>,
                private val operator: JsonField<Operator>,
                private val values: JsonField<List<String>>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("field")
                    @ExcludeMissing
                    field: JsonField<Field> = JsonMissing.of(),
                    @JsonProperty("operator")
                    @ExcludeMissing
                    operator: JsonField<Operator> = JsonMissing.of(),
                    @JsonProperty("values")
                    @ExcludeMissing
                    values: JsonField<List<String>> = JsonMissing.of(),
                ) : this(field, operator, values, mutableMapOf())

                /**
                 * The property of the price to filter on.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun field(): Field = field.getRequired("field")

                /**
                 * Should prices that match the filter be included or excluded.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun operator(): Operator = operator.getRequired("operator")

                /**
                 * The IDs or values that match this filter.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun values(): List<String> = values.getRequired("values")

                /**
                 * Returns the raw JSON value of [field].
                 *
                 * Unlike [field], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("field") @ExcludeMissing fun _field(): JsonField<Field> = field

                /**
                 * Returns the raw JSON value of [operator].
                 *
                 * Unlike [operator], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("operator")
                @ExcludeMissing
                fun _operator(): JsonField<Operator> = operator

                /**
                 * Returns the raw JSON value of [values].
                 *
                 * Unlike [values], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("values")
                @ExcludeMissing
                fun _values(): JsonField<List<String>> = values

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
                     * Returns a mutable builder for constructing an instance of [Filter].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .field()
                     * .operator()
                     * .values()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [Filter]. */
                class Builder internal constructor() {

                    private var field: JsonField<Field>? = null
                    private var operator: JsonField<Operator>? = null
                    private var values: JsonField<MutableList<String>>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(filter: Filter) = apply {
                        field = filter.field
                        operator = filter.operator
                        values = filter.values.map { it.toMutableList() }
                        additionalProperties = filter.additionalProperties.toMutableMap()
                    }

                    /** The property of the price to filter on. */
                    fun field(field: Field) = field(JsonField.of(field))

                    /**
                     * Sets [Builder.field] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.field] with a well-typed [Field] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun field(field: JsonField<Field>) = apply { this.field = field }

                    /** Should prices that match the filter be included or excluded. */
                    fun operator(operator: Operator) = operator(JsonField.of(operator))

                    /**
                     * Sets [Builder.operator] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.operator] with a well-typed [Operator] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun operator(operator: JsonField<Operator>) = apply { this.operator = operator }

                    /** The IDs or values that match this filter. */
                    fun values(values: List<String>) = values(JsonField.of(values))

                    /**
                     * Sets [Builder.values] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.values] with a well-typed `List<String>`
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun values(values: JsonField<List<String>>) = apply {
                        this.values = values.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [String] to [values].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addValue(value: String) = apply {
                        values =
                            (values ?: JsonField.of(mutableListOf())).also {
                                checkKnown("values", it).add(value)
                            }
                    }

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
                     * Returns an immutable instance of [Filter].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .field()
                     * .operator()
                     * .values()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Filter =
                        Filter(
                            checkRequired("field", field),
                            checkRequired("operator", operator),
                            checkRequired("values", values).map { it.toImmutable() },
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Filter = apply {
                    if (validated) {
                        return@apply
                    }

                    field().validate()
                    operator().validate()
                    values()
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
                    (field.asKnown()?.validity() ?: 0) +
                        (operator.asKnown()?.validity() ?: 0) +
                        (values.asKnown()?.size ?: 0)

                /** The property of the price to filter on. */
                class Field @JsonCreator private constructor(private val value: JsonField<String>) :
                    Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        val PRICE_ID = of("price_id")

                        val ITEM_ID = of("item_id")

                        val PRICE_TYPE = of("price_type")

                        val CURRENCY = of("currency")

                        val PRICING_UNIT_ID = of("pricing_unit_id")

                        fun of(value: String) = Field(JsonField.of(value))
                    }

                    /** An enum containing [Field]'s known values. */
                    enum class Known {
                        PRICE_ID,
                        ITEM_ID,
                        PRICE_TYPE,
                        CURRENCY,
                        PRICING_UNIT_ID,
                    }

                    /**
                     * An enum containing [Field]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Field] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        PRICE_ID,
                        ITEM_ID,
                        PRICE_TYPE,
                        CURRENCY,
                        PRICING_UNIT_ID,
                        /**
                         * An enum member indicating that [Field] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            PRICE_ID -> Value.PRICE_ID
                            ITEM_ID -> Value.ITEM_ID
                            PRICE_TYPE -> Value.PRICE_TYPE
                            CURRENCY -> Value.CURRENCY
                            PRICING_UNIT_ID -> Value.PRICING_UNIT_ID
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws OrbInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            PRICE_ID -> Known.PRICE_ID
                            ITEM_ID -> Known.ITEM_ID
                            PRICE_TYPE -> Known.PRICE_TYPE
                            CURRENCY -> Known.CURRENCY
                            PRICING_UNIT_ID -> Known.PRICING_UNIT_ID
                            else -> throw OrbInvalidDataException("Unknown Field: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws OrbInvalidDataException if this class instance's value does not have
                     *   the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString()
                            ?: throw OrbInvalidDataException("Value is not a String")

                    private var validated: Boolean = false

                    fun validate(): Field = apply {
                        if (validated) {
                            return@apply
                        }

                        known()
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
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Field && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                /** Should prices that match the filter be included or excluded. */
                class Operator
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        val INCLUDES = of("includes")

                        val EXCLUDES = of("excludes")

                        fun of(value: String) = Operator(JsonField.of(value))
                    }

                    /** An enum containing [Operator]'s known values. */
                    enum class Known {
                        INCLUDES,
                        EXCLUDES,
                    }

                    /**
                     * An enum containing [Operator]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [Operator] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        INCLUDES,
                        EXCLUDES,
                        /**
                         * An enum member indicating that [Operator] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            INCLUDES -> Value.INCLUDES
                            EXCLUDES -> Value.EXCLUDES
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws OrbInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            INCLUDES -> Known.INCLUDES
                            EXCLUDES -> Known.EXCLUDES
                            else -> throw OrbInvalidDataException("Unknown Operator: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws OrbInvalidDataException if this class instance's value does not have
                     *   the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString()
                            ?: throw OrbInvalidDataException("Value is not a String")

                    private var validated: Boolean = false

                    fun validate(): Operator = apply {
                        if (validated) {
                            return@apply
                        }

                        known()
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
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Operator && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Filter && field == other.field && operator == other.operator && values == other.values && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(field, operator, values, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Filter{field=$field, operator=$operator, values=$values, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AmountDiscount && id == other.id && adjustmentType == other.adjustmentType && amountDiscount == other.amountDiscount && appliesToPriceIds == other.appliesToPriceIds && filters == other.filters && isInvoiceLevel == other.isInvoiceLevel && planPhaseOrder == other.planPhaseOrder && reason == other.reason && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, adjustmentType, amountDiscount, appliesToPriceIds, filters, isInvoiceLevel, planPhaseOrder, reason, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AmountDiscount{id=$id, adjustmentType=$adjustmentType, amountDiscount=$amountDiscount, appliesToPriceIds=$appliesToPriceIds, filters=$filters, isInvoiceLevel=$isInvoiceLevel, planPhaseOrder=$planPhaseOrder, reason=$reason, additionalProperties=$additionalProperties}"
        }

        class PercentageDiscount
        private constructor(
            private val id: JsonField<String>,
            private val adjustmentType: JsonValue,
            private val appliesToPriceIds: JsonField<List<String>>,
            private val filters: JsonField<List<Filter>>,
            private val isInvoiceLevel: JsonField<Boolean>,
            private val percentageDiscount: JsonField<Double>,
            private val planPhaseOrder: JsonField<Long>,
            private val reason: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("adjustment_type")
                @ExcludeMissing
                adjustmentType: JsonValue = JsonMissing.of(),
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("filters")
                @ExcludeMissing
                filters: JsonField<List<Filter>> = JsonMissing.of(),
                @JsonProperty("is_invoice_level")
                @ExcludeMissing
                isInvoiceLevel: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("percentage_discount")
                @ExcludeMissing
                percentageDiscount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("plan_phase_order")
                @ExcludeMissing
                planPhaseOrder: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("reason") @ExcludeMissing reason: JsonField<String> = JsonMissing.of(),
            ) : this(
                id,
                adjustmentType,
                appliesToPriceIds,
                filters,
                isInvoiceLevel,
                percentageDiscount,
                planPhaseOrder,
                reason,
                mutableMapOf(),
            )

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("percentage_discount")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("adjustment_type")
            @ExcludeMissing
            fun _adjustmentType(): JsonValue = adjustmentType

            /**
             * The price IDs that this adjustment applies to.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            @Deprecated("deprecated")
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /**
             * The filters that determine which prices to apply this adjustment to.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun filters(): List<Filter> = filters.getRequired("filters")

            /**
             * True for adjustments that apply to an entire invocice, false for adjustments that
             * apply to only one price.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun isInvoiceLevel(): Boolean = isInvoiceLevel.getRequired("is_invoice_level")

            /**
             * The percentage (as a value between 0 and 1) by which to discount the price intervals
             * this adjustment applies to in a given billing period.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun percentageDiscount(): Double = percentageDiscount.getRequired("percentage_discount")

            /**
             * The plan phase in which this adjustment is active.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun planPhaseOrder(): Long? = planPhaseOrder.getNullable("plan_phase_order")

            /**
             * The reason for the adjustment.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun reason(): String? = reason.getNullable("reason")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [appliesToPriceIds].
             *
             * Unlike [appliesToPriceIds], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @Deprecated("deprecated")
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

            /**
             * Returns the raw JSON value of [filters].
             *
             * Unlike [filters], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("filters")
            @ExcludeMissing
            fun _filters(): JsonField<List<Filter>> = filters

            /**
             * Returns the raw JSON value of [isInvoiceLevel].
             *
             * Unlike [isInvoiceLevel], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("is_invoice_level")
            @ExcludeMissing
            fun _isInvoiceLevel(): JsonField<Boolean> = isInvoiceLevel

            /**
             * Returns the raw JSON value of [percentageDiscount].
             *
             * Unlike [percentageDiscount], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("percentage_discount")
            @ExcludeMissing
            fun _percentageDiscount(): JsonField<Double> = percentageDiscount

            /**
             * Returns the raw JSON value of [planPhaseOrder].
             *
             * Unlike [planPhaseOrder], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("plan_phase_order")
            @ExcludeMissing
            fun _planPhaseOrder(): JsonField<Long> = planPhaseOrder

            /**
             * Returns the raw JSON value of [reason].
             *
             * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

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
                 * Returns a mutable builder for constructing an instance of [PercentageDiscount].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .id()
                 * .appliesToPriceIds()
                 * .filters()
                 * .isInvoiceLevel()
                 * .percentageDiscount()
                 * .planPhaseOrder()
                 * .reason()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [PercentageDiscount]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var adjustmentType: JsonValue = JsonValue.from("percentage_discount")
                private var appliesToPriceIds: JsonField<MutableList<String>>? = null
                private var filters: JsonField<MutableList<Filter>>? = null
                private var isInvoiceLevel: JsonField<Boolean>? = null
                private var percentageDiscount: JsonField<Double>? = null
                private var planPhaseOrder: JsonField<Long>? = null
                private var reason: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(percentageDiscount: PercentageDiscount) = apply {
                    id = percentageDiscount.id
                    adjustmentType = percentageDiscount.adjustmentType
                    appliesToPriceIds =
                        percentageDiscount.appliesToPriceIds.map { it.toMutableList() }
                    filters = percentageDiscount.filters.map { it.toMutableList() }
                    isInvoiceLevel = percentageDiscount.isInvoiceLevel
                    this.percentageDiscount = percentageDiscount.percentageDiscount
                    planPhaseOrder = percentageDiscount.planPhaseOrder
                    reason = percentageDiscount.reason
                    additionalProperties = percentageDiscount.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("percentage_discount")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun adjustmentType(adjustmentType: JsonValue) = apply {
                    this.adjustmentType = adjustmentType
                }

                /** The price IDs that this adjustment applies to. */
                @Deprecated("deprecated")
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /**
                 * Sets [Builder.appliesToPriceIds] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.appliesToPriceIds] with a well-typed
                 * `List<String>` value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                @Deprecated("deprecated")
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [appliesToPriceIds].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                @Deprecated("deprecated")
                fun addAppliesToPriceId(appliesToPriceId: String) = apply {
                    appliesToPriceIds =
                        (appliesToPriceIds ?: JsonField.of(mutableListOf())).also {
                            checkKnown("appliesToPriceIds", it).add(appliesToPriceId)
                        }
                }

                /** The filters that determine which prices to apply this adjustment to. */
                fun filters(filters: List<Filter>) = filters(JsonField.of(filters))

                /**
                 * Sets [Builder.filters] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.filters] with a well-typed `List<Filter>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun filters(filters: JsonField<List<Filter>>) = apply {
                    this.filters = filters.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Filter] to [filters].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addFilter(filter: Filter) = apply {
                    filters =
                        (filters ?: JsonField.of(mutableListOf())).also {
                            checkKnown("filters", it).add(filter)
                        }
                }

                /**
                 * True for adjustments that apply to an entire invocice, false for adjustments that
                 * apply to only one price.
                 */
                fun isInvoiceLevel(isInvoiceLevel: Boolean) =
                    isInvoiceLevel(JsonField.of(isInvoiceLevel))

                /**
                 * Sets [Builder.isInvoiceLevel] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.isInvoiceLevel] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun isInvoiceLevel(isInvoiceLevel: JsonField<Boolean>) = apply {
                    this.isInvoiceLevel = isInvoiceLevel
                }

                /**
                 * The percentage (as a value between 0 and 1) by which to discount the price
                 * intervals this adjustment applies to in a given billing period.
                 */
                fun percentageDiscount(percentageDiscount: Double) =
                    percentageDiscount(JsonField.of(percentageDiscount))

                /**
                 * Sets [Builder.percentageDiscount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.percentageDiscount] with a well-typed [Double]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun percentageDiscount(percentageDiscount: JsonField<Double>) = apply {
                    this.percentageDiscount = percentageDiscount
                }

                /** The plan phase in which this adjustment is active. */
                fun planPhaseOrder(planPhaseOrder: Long?) =
                    planPhaseOrder(JsonField.ofNullable(planPhaseOrder))

                /**
                 * Alias for [Builder.planPhaseOrder].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun planPhaseOrder(planPhaseOrder: Long) = planPhaseOrder(planPhaseOrder as Long?)

                /**
                 * Sets [Builder.planPhaseOrder] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.planPhaseOrder] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun planPhaseOrder(planPhaseOrder: JsonField<Long>) = apply {
                    this.planPhaseOrder = planPhaseOrder
                }

                /** The reason for the adjustment. */
                fun reason(reason: String?) = reason(JsonField.ofNullable(reason))

                /**
                 * Sets [Builder.reason] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reason] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun reason(reason: JsonField<String>) = apply { this.reason = reason }

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
                 * Returns an immutable instance of [PercentageDiscount].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .id()
                 * .appliesToPriceIds()
                 * .filters()
                 * .isInvoiceLevel()
                 * .percentageDiscount()
                 * .planPhaseOrder()
                 * .reason()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): PercentageDiscount =
                    PercentageDiscount(
                        checkRequired("id", id),
                        adjustmentType,
                        checkRequired("appliesToPriceIds", appliesToPriceIds).map {
                            it.toImmutable()
                        },
                        checkRequired("filters", filters).map { it.toImmutable() },
                        checkRequired("isInvoiceLevel", isInvoiceLevel),
                        checkRequired("percentageDiscount", percentageDiscount),
                        checkRequired("planPhaseOrder", planPhaseOrder),
                        checkRequired("reason", reason),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): PercentageDiscount = apply {
                if (validated) {
                    return@apply
                }

                id()
                _adjustmentType().let {
                    if (it != JsonValue.from("percentage_discount")) {
                        throw OrbInvalidDataException("'adjustmentType' is invalid, received $it")
                    }
                }
                appliesToPriceIds()
                filters().forEach { it.validate() }
                isInvoiceLevel()
                percentageDiscount()
                planPhaseOrder()
                reason()
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
                (if (id.asKnown() == null) 0 else 1) +
                    adjustmentType.let {
                        if (it == JsonValue.from("percentage_discount")) 1 else 0
                    } +
                    (appliesToPriceIds.asKnown()?.size ?: 0) +
                    (filters.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (isInvoiceLevel.asKnown() == null) 0 else 1) +
                    (if (percentageDiscount.asKnown() == null) 0 else 1) +
                    (if (planPhaseOrder.asKnown() == null) 0 else 1) +
                    (if (reason.asKnown() == null) 0 else 1)

            class Filter
            private constructor(
                private val field: JsonField<Field>,
                private val operator: JsonField<Operator>,
                private val values: JsonField<List<String>>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("field")
                    @ExcludeMissing
                    field: JsonField<Field> = JsonMissing.of(),
                    @JsonProperty("operator")
                    @ExcludeMissing
                    operator: JsonField<Operator> = JsonMissing.of(),
                    @JsonProperty("values")
                    @ExcludeMissing
                    values: JsonField<List<String>> = JsonMissing.of(),
                ) : this(field, operator, values, mutableMapOf())

                /**
                 * The property of the price to filter on.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun field(): Field = field.getRequired("field")

                /**
                 * Should prices that match the filter be included or excluded.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun operator(): Operator = operator.getRequired("operator")

                /**
                 * The IDs or values that match this filter.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun values(): List<String> = values.getRequired("values")

                /**
                 * Returns the raw JSON value of [field].
                 *
                 * Unlike [field], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("field") @ExcludeMissing fun _field(): JsonField<Field> = field

                /**
                 * Returns the raw JSON value of [operator].
                 *
                 * Unlike [operator], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("operator")
                @ExcludeMissing
                fun _operator(): JsonField<Operator> = operator

                /**
                 * Returns the raw JSON value of [values].
                 *
                 * Unlike [values], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("values")
                @ExcludeMissing
                fun _values(): JsonField<List<String>> = values

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
                     * Returns a mutable builder for constructing an instance of [Filter].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .field()
                     * .operator()
                     * .values()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [Filter]. */
                class Builder internal constructor() {

                    private var field: JsonField<Field>? = null
                    private var operator: JsonField<Operator>? = null
                    private var values: JsonField<MutableList<String>>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(filter: Filter) = apply {
                        field = filter.field
                        operator = filter.operator
                        values = filter.values.map { it.toMutableList() }
                        additionalProperties = filter.additionalProperties.toMutableMap()
                    }

                    /** The property of the price to filter on. */
                    fun field(field: Field) = field(JsonField.of(field))

                    /**
                     * Sets [Builder.field] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.field] with a well-typed [Field] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun field(field: JsonField<Field>) = apply { this.field = field }

                    /** Should prices that match the filter be included or excluded. */
                    fun operator(operator: Operator) = operator(JsonField.of(operator))

                    /**
                     * Sets [Builder.operator] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.operator] with a well-typed [Operator] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun operator(operator: JsonField<Operator>) = apply { this.operator = operator }

                    /** The IDs or values that match this filter. */
                    fun values(values: List<String>) = values(JsonField.of(values))

                    /**
                     * Sets [Builder.values] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.values] with a well-typed `List<String>`
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun values(values: JsonField<List<String>>) = apply {
                        this.values = values.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [String] to [values].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addValue(value: String) = apply {
                        values =
                            (values ?: JsonField.of(mutableListOf())).also {
                                checkKnown("values", it).add(value)
                            }
                    }

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
                     * Returns an immutable instance of [Filter].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .field()
                     * .operator()
                     * .values()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Filter =
                        Filter(
                            checkRequired("field", field),
                            checkRequired("operator", operator),
                            checkRequired("values", values).map { it.toImmutable() },
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Filter = apply {
                    if (validated) {
                        return@apply
                    }

                    field().validate()
                    operator().validate()
                    values()
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
                    (field.asKnown()?.validity() ?: 0) +
                        (operator.asKnown()?.validity() ?: 0) +
                        (values.asKnown()?.size ?: 0)

                /** The property of the price to filter on. */
                class Field @JsonCreator private constructor(private val value: JsonField<String>) :
                    Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        val PRICE_ID = of("price_id")

                        val ITEM_ID = of("item_id")

                        val PRICE_TYPE = of("price_type")

                        val CURRENCY = of("currency")

                        val PRICING_UNIT_ID = of("pricing_unit_id")

                        fun of(value: String) = Field(JsonField.of(value))
                    }

                    /** An enum containing [Field]'s known values. */
                    enum class Known {
                        PRICE_ID,
                        ITEM_ID,
                        PRICE_TYPE,
                        CURRENCY,
                        PRICING_UNIT_ID,
                    }

                    /**
                     * An enum containing [Field]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Field] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        PRICE_ID,
                        ITEM_ID,
                        PRICE_TYPE,
                        CURRENCY,
                        PRICING_UNIT_ID,
                        /**
                         * An enum member indicating that [Field] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            PRICE_ID -> Value.PRICE_ID
                            ITEM_ID -> Value.ITEM_ID
                            PRICE_TYPE -> Value.PRICE_TYPE
                            CURRENCY -> Value.CURRENCY
                            PRICING_UNIT_ID -> Value.PRICING_UNIT_ID
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws OrbInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            PRICE_ID -> Known.PRICE_ID
                            ITEM_ID -> Known.ITEM_ID
                            PRICE_TYPE -> Known.PRICE_TYPE
                            CURRENCY -> Known.CURRENCY
                            PRICING_UNIT_ID -> Known.PRICING_UNIT_ID
                            else -> throw OrbInvalidDataException("Unknown Field: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws OrbInvalidDataException if this class instance's value does not have
                     *   the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString()
                            ?: throw OrbInvalidDataException("Value is not a String")

                    private var validated: Boolean = false

                    fun validate(): Field = apply {
                        if (validated) {
                            return@apply
                        }

                        known()
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
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Field && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                /** Should prices that match the filter be included or excluded. */
                class Operator
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        val INCLUDES = of("includes")

                        val EXCLUDES = of("excludes")

                        fun of(value: String) = Operator(JsonField.of(value))
                    }

                    /** An enum containing [Operator]'s known values. */
                    enum class Known {
                        INCLUDES,
                        EXCLUDES,
                    }

                    /**
                     * An enum containing [Operator]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [Operator] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        INCLUDES,
                        EXCLUDES,
                        /**
                         * An enum member indicating that [Operator] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            INCLUDES -> Value.INCLUDES
                            EXCLUDES -> Value.EXCLUDES
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws OrbInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            INCLUDES -> Known.INCLUDES
                            EXCLUDES -> Known.EXCLUDES
                            else -> throw OrbInvalidDataException("Unknown Operator: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws OrbInvalidDataException if this class instance's value does not have
                     *   the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString()
                            ?: throw OrbInvalidDataException("Value is not a String")

                    private var validated: Boolean = false

                    fun validate(): Operator = apply {
                        if (validated) {
                            return@apply
                        }

                        known()
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
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Operator && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Filter && field == other.field && operator == other.operator && values == other.values && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(field, operator, values, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Filter{field=$field, operator=$operator, values=$values, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is PercentageDiscount && id == other.id && adjustmentType == other.adjustmentType && appliesToPriceIds == other.appliesToPriceIds && filters == other.filters && isInvoiceLevel == other.isInvoiceLevel && percentageDiscount == other.percentageDiscount && planPhaseOrder == other.planPhaseOrder && reason == other.reason && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, adjustmentType, appliesToPriceIds, filters, isInvoiceLevel, percentageDiscount, planPhaseOrder, reason, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PercentageDiscount{id=$id, adjustmentType=$adjustmentType, appliesToPriceIds=$appliesToPriceIds, filters=$filters, isInvoiceLevel=$isInvoiceLevel, percentageDiscount=$percentageDiscount, planPhaseOrder=$planPhaseOrder, reason=$reason, additionalProperties=$additionalProperties}"
        }

        class Minimum
        private constructor(
            private val id: JsonField<String>,
            private val adjustmentType: JsonValue,
            private val appliesToPriceIds: JsonField<List<String>>,
            private val filters: JsonField<List<Filter>>,
            private val isInvoiceLevel: JsonField<Boolean>,
            private val itemId: JsonField<String>,
            private val minimumAmount: JsonField<String>,
            private val planPhaseOrder: JsonField<Long>,
            private val reason: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("adjustment_type")
                @ExcludeMissing
                adjustmentType: JsonValue = JsonMissing.of(),
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("filters")
                @ExcludeMissing
                filters: JsonField<List<Filter>> = JsonMissing.of(),
                @JsonProperty("is_invoice_level")
                @ExcludeMissing
                isInvoiceLevel: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("item_id")
                @ExcludeMissing
                itemId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("minimum_amount")
                @ExcludeMissing
                minimumAmount: JsonField<String> = JsonMissing.of(),
                @JsonProperty("plan_phase_order")
                @ExcludeMissing
                planPhaseOrder: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("reason") @ExcludeMissing reason: JsonField<String> = JsonMissing.of(),
            ) : this(
                id,
                adjustmentType,
                appliesToPriceIds,
                filters,
                isInvoiceLevel,
                itemId,
                minimumAmount,
                planPhaseOrder,
                reason,
                mutableMapOf(),
            )

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("minimum")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("adjustment_type")
            @ExcludeMissing
            fun _adjustmentType(): JsonValue = adjustmentType

            /**
             * The price IDs that this adjustment applies to.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            @Deprecated("deprecated")
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /**
             * The filters that determine which prices to apply this adjustment to.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun filters(): List<Filter> = filters.getRequired("filters")

            /**
             * True for adjustments that apply to an entire invocice, false for adjustments that
             * apply to only one price.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun isInvoiceLevel(): Boolean = isInvoiceLevel.getRequired("is_invoice_level")

            /**
             * The item ID that revenue from this minimum will be attributed to.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun itemId(): String = itemId.getRequired("item_id")

            /**
             * The minimum amount to charge in a given billing period for the prices this adjustment
             * applies to.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun minimumAmount(): String = minimumAmount.getRequired("minimum_amount")

            /**
             * The plan phase in which this adjustment is active.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun planPhaseOrder(): Long? = planPhaseOrder.getNullable("plan_phase_order")

            /**
             * The reason for the adjustment.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun reason(): String? = reason.getNullable("reason")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [appliesToPriceIds].
             *
             * Unlike [appliesToPriceIds], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @Deprecated("deprecated")
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

            /**
             * Returns the raw JSON value of [filters].
             *
             * Unlike [filters], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("filters")
            @ExcludeMissing
            fun _filters(): JsonField<List<Filter>> = filters

            /**
             * Returns the raw JSON value of [isInvoiceLevel].
             *
             * Unlike [isInvoiceLevel], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("is_invoice_level")
            @ExcludeMissing
            fun _isInvoiceLevel(): JsonField<Boolean> = isInvoiceLevel

            /**
             * Returns the raw JSON value of [itemId].
             *
             * Unlike [itemId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("item_id") @ExcludeMissing fun _itemId(): JsonField<String> = itemId

            /**
             * Returns the raw JSON value of [minimumAmount].
             *
             * Unlike [minimumAmount], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("minimum_amount")
            @ExcludeMissing
            fun _minimumAmount(): JsonField<String> = minimumAmount

            /**
             * Returns the raw JSON value of [planPhaseOrder].
             *
             * Unlike [planPhaseOrder], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("plan_phase_order")
            @ExcludeMissing
            fun _planPhaseOrder(): JsonField<Long> = planPhaseOrder

            /**
             * Returns the raw JSON value of [reason].
             *
             * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

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
                 * Returns a mutable builder for constructing an instance of [Minimum].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .id()
                 * .appliesToPriceIds()
                 * .filters()
                 * .isInvoiceLevel()
                 * .itemId()
                 * .minimumAmount()
                 * .planPhaseOrder()
                 * .reason()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Minimum]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var adjustmentType: JsonValue = JsonValue.from("minimum")
                private var appliesToPriceIds: JsonField<MutableList<String>>? = null
                private var filters: JsonField<MutableList<Filter>>? = null
                private var isInvoiceLevel: JsonField<Boolean>? = null
                private var itemId: JsonField<String>? = null
                private var minimumAmount: JsonField<String>? = null
                private var planPhaseOrder: JsonField<Long>? = null
                private var reason: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(minimum: Minimum) = apply {
                    id = minimum.id
                    adjustmentType = minimum.adjustmentType
                    appliesToPriceIds = minimum.appliesToPriceIds.map { it.toMutableList() }
                    filters = minimum.filters.map { it.toMutableList() }
                    isInvoiceLevel = minimum.isInvoiceLevel
                    itemId = minimum.itemId
                    minimumAmount = minimum.minimumAmount
                    planPhaseOrder = minimum.planPhaseOrder
                    reason = minimum.reason
                    additionalProperties = minimum.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("minimum")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun adjustmentType(adjustmentType: JsonValue) = apply {
                    this.adjustmentType = adjustmentType
                }

                /** The price IDs that this adjustment applies to. */
                @Deprecated("deprecated")
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /**
                 * Sets [Builder.appliesToPriceIds] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.appliesToPriceIds] with a well-typed
                 * `List<String>` value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                @Deprecated("deprecated")
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [appliesToPriceIds].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                @Deprecated("deprecated")
                fun addAppliesToPriceId(appliesToPriceId: String) = apply {
                    appliesToPriceIds =
                        (appliesToPriceIds ?: JsonField.of(mutableListOf())).also {
                            checkKnown("appliesToPriceIds", it).add(appliesToPriceId)
                        }
                }

                /** The filters that determine which prices to apply this adjustment to. */
                fun filters(filters: List<Filter>) = filters(JsonField.of(filters))

                /**
                 * Sets [Builder.filters] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.filters] with a well-typed `List<Filter>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun filters(filters: JsonField<List<Filter>>) = apply {
                    this.filters = filters.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Filter] to [filters].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addFilter(filter: Filter) = apply {
                    filters =
                        (filters ?: JsonField.of(mutableListOf())).also {
                            checkKnown("filters", it).add(filter)
                        }
                }

                /**
                 * True for adjustments that apply to an entire invocice, false for adjustments that
                 * apply to only one price.
                 */
                fun isInvoiceLevel(isInvoiceLevel: Boolean) =
                    isInvoiceLevel(JsonField.of(isInvoiceLevel))

                /**
                 * Sets [Builder.isInvoiceLevel] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.isInvoiceLevel] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun isInvoiceLevel(isInvoiceLevel: JsonField<Boolean>) = apply {
                    this.isInvoiceLevel = isInvoiceLevel
                }

                /** The item ID that revenue from this minimum will be attributed to. */
                fun itemId(itemId: String) = itemId(JsonField.of(itemId))

                /**
                 * Sets [Builder.itemId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.itemId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun itemId(itemId: JsonField<String>) = apply { this.itemId = itemId }

                /**
                 * The minimum amount to charge in a given billing period for the prices this
                 * adjustment applies to.
                 */
                fun minimumAmount(minimumAmount: String) =
                    minimumAmount(JsonField.of(minimumAmount))

                /**
                 * Sets [Builder.minimumAmount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.minimumAmount] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                    this.minimumAmount = minimumAmount
                }

                /** The plan phase in which this adjustment is active. */
                fun planPhaseOrder(planPhaseOrder: Long?) =
                    planPhaseOrder(JsonField.ofNullable(planPhaseOrder))

                /**
                 * Alias for [Builder.planPhaseOrder].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun planPhaseOrder(planPhaseOrder: Long) = planPhaseOrder(planPhaseOrder as Long?)

                /**
                 * Sets [Builder.planPhaseOrder] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.planPhaseOrder] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun planPhaseOrder(planPhaseOrder: JsonField<Long>) = apply {
                    this.planPhaseOrder = planPhaseOrder
                }

                /** The reason for the adjustment. */
                fun reason(reason: String?) = reason(JsonField.ofNullable(reason))

                /**
                 * Sets [Builder.reason] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reason] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun reason(reason: JsonField<String>) = apply { this.reason = reason }

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
                 * Returns an immutable instance of [Minimum].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .id()
                 * .appliesToPriceIds()
                 * .filters()
                 * .isInvoiceLevel()
                 * .itemId()
                 * .minimumAmount()
                 * .planPhaseOrder()
                 * .reason()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Minimum =
                    Minimum(
                        checkRequired("id", id),
                        adjustmentType,
                        checkRequired("appliesToPriceIds", appliesToPriceIds).map {
                            it.toImmutable()
                        },
                        checkRequired("filters", filters).map { it.toImmutable() },
                        checkRequired("isInvoiceLevel", isInvoiceLevel),
                        checkRequired("itemId", itemId),
                        checkRequired("minimumAmount", minimumAmount),
                        checkRequired("planPhaseOrder", planPhaseOrder),
                        checkRequired("reason", reason),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Minimum = apply {
                if (validated) {
                    return@apply
                }

                id()
                _adjustmentType().let {
                    if (it != JsonValue.from("minimum")) {
                        throw OrbInvalidDataException("'adjustmentType' is invalid, received $it")
                    }
                }
                appliesToPriceIds()
                filters().forEach { it.validate() }
                isInvoiceLevel()
                itemId()
                minimumAmount()
                planPhaseOrder()
                reason()
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
                (if (id.asKnown() == null) 0 else 1) +
                    adjustmentType.let { if (it == JsonValue.from("minimum")) 1 else 0 } +
                    (appliesToPriceIds.asKnown()?.size ?: 0) +
                    (filters.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (isInvoiceLevel.asKnown() == null) 0 else 1) +
                    (if (itemId.asKnown() == null) 0 else 1) +
                    (if (minimumAmount.asKnown() == null) 0 else 1) +
                    (if (planPhaseOrder.asKnown() == null) 0 else 1) +
                    (if (reason.asKnown() == null) 0 else 1)

            class Filter
            private constructor(
                private val field: JsonField<Field>,
                private val operator: JsonField<Operator>,
                private val values: JsonField<List<String>>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("field")
                    @ExcludeMissing
                    field: JsonField<Field> = JsonMissing.of(),
                    @JsonProperty("operator")
                    @ExcludeMissing
                    operator: JsonField<Operator> = JsonMissing.of(),
                    @JsonProperty("values")
                    @ExcludeMissing
                    values: JsonField<List<String>> = JsonMissing.of(),
                ) : this(field, operator, values, mutableMapOf())

                /**
                 * The property of the price to filter on.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun field(): Field = field.getRequired("field")

                /**
                 * Should prices that match the filter be included or excluded.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun operator(): Operator = operator.getRequired("operator")

                /**
                 * The IDs or values that match this filter.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun values(): List<String> = values.getRequired("values")

                /**
                 * Returns the raw JSON value of [field].
                 *
                 * Unlike [field], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("field") @ExcludeMissing fun _field(): JsonField<Field> = field

                /**
                 * Returns the raw JSON value of [operator].
                 *
                 * Unlike [operator], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("operator")
                @ExcludeMissing
                fun _operator(): JsonField<Operator> = operator

                /**
                 * Returns the raw JSON value of [values].
                 *
                 * Unlike [values], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("values")
                @ExcludeMissing
                fun _values(): JsonField<List<String>> = values

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
                     * Returns a mutable builder for constructing an instance of [Filter].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .field()
                     * .operator()
                     * .values()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [Filter]. */
                class Builder internal constructor() {

                    private var field: JsonField<Field>? = null
                    private var operator: JsonField<Operator>? = null
                    private var values: JsonField<MutableList<String>>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(filter: Filter) = apply {
                        field = filter.field
                        operator = filter.operator
                        values = filter.values.map { it.toMutableList() }
                        additionalProperties = filter.additionalProperties.toMutableMap()
                    }

                    /** The property of the price to filter on. */
                    fun field(field: Field) = field(JsonField.of(field))

                    /**
                     * Sets [Builder.field] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.field] with a well-typed [Field] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun field(field: JsonField<Field>) = apply { this.field = field }

                    /** Should prices that match the filter be included or excluded. */
                    fun operator(operator: Operator) = operator(JsonField.of(operator))

                    /**
                     * Sets [Builder.operator] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.operator] with a well-typed [Operator] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun operator(operator: JsonField<Operator>) = apply { this.operator = operator }

                    /** The IDs or values that match this filter. */
                    fun values(values: List<String>) = values(JsonField.of(values))

                    /**
                     * Sets [Builder.values] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.values] with a well-typed `List<String>`
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun values(values: JsonField<List<String>>) = apply {
                        this.values = values.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [String] to [values].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addValue(value: String) = apply {
                        values =
                            (values ?: JsonField.of(mutableListOf())).also {
                                checkKnown("values", it).add(value)
                            }
                    }

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
                     * Returns an immutable instance of [Filter].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .field()
                     * .operator()
                     * .values()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Filter =
                        Filter(
                            checkRequired("field", field),
                            checkRequired("operator", operator),
                            checkRequired("values", values).map { it.toImmutable() },
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Filter = apply {
                    if (validated) {
                        return@apply
                    }

                    field().validate()
                    operator().validate()
                    values()
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
                    (field.asKnown()?.validity() ?: 0) +
                        (operator.asKnown()?.validity() ?: 0) +
                        (values.asKnown()?.size ?: 0)

                /** The property of the price to filter on. */
                class Field @JsonCreator private constructor(private val value: JsonField<String>) :
                    Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        val PRICE_ID = of("price_id")

                        val ITEM_ID = of("item_id")

                        val PRICE_TYPE = of("price_type")

                        val CURRENCY = of("currency")

                        val PRICING_UNIT_ID = of("pricing_unit_id")

                        fun of(value: String) = Field(JsonField.of(value))
                    }

                    /** An enum containing [Field]'s known values. */
                    enum class Known {
                        PRICE_ID,
                        ITEM_ID,
                        PRICE_TYPE,
                        CURRENCY,
                        PRICING_UNIT_ID,
                    }

                    /**
                     * An enum containing [Field]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Field] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        PRICE_ID,
                        ITEM_ID,
                        PRICE_TYPE,
                        CURRENCY,
                        PRICING_UNIT_ID,
                        /**
                         * An enum member indicating that [Field] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            PRICE_ID -> Value.PRICE_ID
                            ITEM_ID -> Value.ITEM_ID
                            PRICE_TYPE -> Value.PRICE_TYPE
                            CURRENCY -> Value.CURRENCY
                            PRICING_UNIT_ID -> Value.PRICING_UNIT_ID
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws OrbInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            PRICE_ID -> Known.PRICE_ID
                            ITEM_ID -> Known.ITEM_ID
                            PRICE_TYPE -> Known.PRICE_TYPE
                            CURRENCY -> Known.CURRENCY
                            PRICING_UNIT_ID -> Known.PRICING_UNIT_ID
                            else -> throw OrbInvalidDataException("Unknown Field: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws OrbInvalidDataException if this class instance's value does not have
                     *   the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString()
                            ?: throw OrbInvalidDataException("Value is not a String")

                    private var validated: Boolean = false

                    fun validate(): Field = apply {
                        if (validated) {
                            return@apply
                        }

                        known()
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
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Field && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                /** Should prices that match the filter be included or excluded. */
                class Operator
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        val INCLUDES = of("includes")

                        val EXCLUDES = of("excludes")

                        fun of(value: String) = Operator(JsonField.of(value))
                    }

                    /** An enum containing [Operator]'s known values. */
                    enum class Known {
                        INCLUDES,
                        EXCLUDES,
                    }

                    /**
                     * An enum containing [Operator]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [Operator] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        INCLUDES,
                        EXCLUDES,
                        /**
                         * An enum member indicating that [Operator] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            INCLUDES -> Value.INCLUDES
                            EXCLUDES -> Value.EXCLUDES
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws OrbInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            INCLUDES -> Known.INCLUDES
                            EXCLUDES -> Known.EXCLUDES
                            else -> throw OrbInvalidDataException("Unknown Operator: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws OrbInvalidDataException if this class instance's value does not have
                     *   the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString()
                            ?: throw OrbInvalidDataException("Value is not a String")

                    private var validated: Boolean = false

                    fun validate(): Operator = apply {
                        if (validated) {
                            return@apply
                        }

                        known()
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
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Operator && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Filter && field == other.field && operator == other.operator && values == other.values && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(field, operator, values, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Filter{field=$field, operator=$operator, values=$values, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Minimum && id == other.id && adjustmentType == other.adjustmentType && appliesToPriceIds == other.appliesToPriceIds && filters == other.filters && isInvoiceLevel == other.isInvoiceLevel && itemId == other.itemId && minimumAmount == other.minimumAmount && planPhaseOrder == other.planPhaseOrder && reason == other.reason && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, adjustmentType, appliesToPriceIds, filters, isInvoiceLevel, itemId, minimumAmount, planPhaseOrder, reason, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Minimum{id=$id, adjustmentType=$adjustmentType, appliesToPriceIds=$appliesToPriceIds, filters=$filters, isInvoiceLevel=$isInvoiceLevel, itemId=$itemId, minimumAmount=$minimumAmount, planPhaseOrder=$planPhaseOrder, reason=$reason, additionalProperties=$additionalProperties}"
        }

        class Maximum
        private constructor(
            private val id: JsonField<String>,
            private val adjustmentType: JsonValue,
            private val appliesToPriceIds: JsonField<List<String>>,
            private val filters: JsonField<List<Filter>>,
            private val isInvoiceLevel: JsonField<Boolean>,
            private val maximumAmount: JsonField<String>,
            private val planPhaseOrder: JsonField<Long>,
            private val reason: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("adjustment_type")
                @ExcludeMissing
                adjustmentType: JsonValue = JsonMissing.of(),
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("filters")
                @ExcludeMissing
                filters: JsonField<List<Filter>> = JsonMissing.of(),
                @JsonProperty("is_invoice_level")
                @ExcludeMissing
                isInvoiceLevel: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("maximum_amount")
                @ExcludeMissing
                maximumAmount: JsonField<String> = JsonMissing.of(),
                @JsonProperty("plan_phase_order")
                @ExcludeMissing
                planPhaseOrder: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("reason") @ExcludeMissing reason: JsonField<String> = JsonMissing.of(),
            ) : this(
                id,
                adjustmentType,
                appliesToPriceIds,
                filters,
                isInvoiceLevel,
                maximumAmount,
                planPhaseOrder,
                reason,
                mutableMapOf(),
            )

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("maximum")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("adjustment_type")
            @ExcludeMissing
            fun _adjustmentType(): JsonValue = adjustmentType

            /**
             * The price IDs that this adjustment applies to.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            @Deprecated("deprecated")
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /**
             * The filters that determine which prices to apply this adjustment to.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun filters(): List<Filter> = filters.getRequired("filters")

            /**
             * True for adjustments that apply to an entire invocice, false for adjustments that
             * apply to only one price.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun isInvoiceLevel(): Boolean = isInvoiceLevel.getRequired("is_invoice_level")

            /**
             * The maximum amount to charge in a given billing period for the prices this adjustment
             * applies to.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun maximumAmount(): String = maximumAmount.getRequired("maximum_amount")

            /**
             * The plan phase in which this adjustment is active.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun planPhaseOrder(): Long? = planPhaseOrder.getNullable("plan_phase_order")

            /**
             * The reason for the adjustment.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun reason(): String? = reason.getNullable("reason")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [appliesToPriceIds].
             *
             * Unlike [appliesToPriceIds], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @Deprecated("deprecated")
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

            /**
             * Returns the raw JSON value of [filters].
             *
             * Unlike [filters], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("filters")
            @ExcludeMissing
            fun _filters(): JsonField<List<Filter>> = filters

            /**
             * Returns the raw JSON value of [isInvoiceLevel].
             *
             * Unlike [isInvoiceLevel], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("is_invoice_level")
            @ExcludeMissing
            fun _isInvoiceLevel(): JsonField<Boolean> = isInvoiceLevel

            /**
             * Returns the raw JSON value of [maximumAmount].
             *
             * Unlike [maximumAmount], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("maximum_amount")
            @ExcludeMissing
            fun _maximumAmount(): JsonField<String> = maximumAmount

            /**
             * Returns the raw JSON value of [planPhaseOrder].
             *
             * Unlike [planPhaseOrder], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("plan_phase_order")
            @ExcludeMissing
            fun _planPhaseOrder(): JsonField<Long> = planPhaseOrder

            /**
             * Returns the raw JSON value of [reason].
             *
             * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

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
                 * Returns a mutable builder for constructing an instance of [Maximum].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .id()
                 * .appliesToPriceIds()
                 * .filters()
                 * .isInvoiceLevel()
                 * .maximumAmount()
                 * .planPhaseOrder()
                 * .reason()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Maximum]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var adjustmentType: JsonValue = JsonValue.from("maximum")
                private var appliesToPriceIds: JsonField<MutableList<String>>? = null
                private var filters: JsonField<MutableList<Filter>>? = null
                private var isInvoiceLevel: JsonField<Boolean>? = null
                private var maximumAmount: JsonField<String>? = null
                private var planPhaseOrder: JsonField<Long>? = null
                private var reason: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(maximum: Maximum) = apply {
                    id = maximum.id
                    adjustmentType = maximum.adjustmentType
                    appliesToPriceIds = maximum.appliesToPriceIds.map { it.toMutableList() }
                    filters = maximum.filters.map { it.toMutableList() }
                    isInvoiceLevel = maximum.isInvoiceLevel
                    maximumAmount = maximum.maximumAmount
                    planPhaseOrder = maximum.planPhaseOrder
                    reason = maximum.reason
                    additionalProperties = maximum.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("maximum")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun adjustmentType(adjustmentType: JsonValue) = apply {
                    this.adjustmentType = adjustmentType
                }

                /** The price IDs that this adjustment applies to. */
                @Deprecated("deprecated")
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /**
                 * Sets [Builder.appliesToPriceIds] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.appliesToPriceIds] with a well-typed
                 * `List<String>` value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                @Deprecated("deprecated")
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [appliesToPriceIds].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                @Deprecated("deprecated")
                fun addAppliesToPriceId(appliesToPriceId: String) = apply {
                    appliesToPriceIds =
                        (appliesToPriceIds ?: JsonField.of(mutableListOf())).also {
                            checkKnown("appliesToPriceIds", it).add(appliesToPriceId)
                        }
                }

                /** The filters that determine which prices to apply this adjustment to. */
                fun filters(filters: List<Filter>) = filters(JsonField.of(filters))

                /**
                 * Sets [Builder.filters] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.filters] with a well-typed `List<Filter>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun filters(filters: JsonField<List<Filter>>) = apply {
                    this.filters = filters.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Filter] to [filters].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addFilter(filter: Filter) = apply {
                    filters =
                        (filters ?: JsonField.of(mutableListOf())).also {
                            checkKnown("filters", it).add(filter)
                        }
                }

                /**
                 * True for adjustments that apply to an entire invocice, false for adjustments that
                 * apply to only one price.
                 */
                fun isInvoiceLevel(isInvoiceLevel: Boolean) =
                    isInvoiceLevel(JsonField.of(isInvoiceLevel))

                /**
                 * Sets [Builder.isInvoiceLevel] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.isInvoiceLevel] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun isInvoiceLevel(isInvoiceLevel: JsonField<Boolean>) = apply {
                    this.isInvoiceLevel = isInvoiceLevel
                }

                /**
                 * The maximum amount to charge in a given billing period for the prices this
                 * adjustment applies to.
                 */
                fun maximumAmount(maximumAmount: String) =
                    maximumAmount(JsonField.of(maximumAmount))

                /**
                 * Sets [Builder.maximumAmount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.maximumAmount] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                    this.maximumAmount = maximumAmount
                }

                /** The plan phase in which this adjustment is active. */
                fun planPhaseOrder(planPhaseOrder: Long?) =
                    planPhaseOrder(JsonField.ofNullable(planPhaseOrder))

                /**
                 * Alias for [Builder.planPhaseOrder].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun planPhaseOrder(planPhaseOrder: Long) = planPhaseOrder(planPhaseOrder as Long?)

                /**
                 * Sets [Builder.planPhaseOrder] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.planPhaseOrder] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun planPhaseOrder(planPhaseOrder: JsonField<Long>) = apply {
                    this.planPhaseOrder = planPhaseOrder
                }

                /** The reason for the adjustment. */
                fun reason(reason: String?) = reason(JsonField.ofNullable(reason))

                /**
                 * Sets [Builder.reason] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reason] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun reason(reason: JsonField<String>) = apply { this.reason = reason }

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
                 * Returns an immutable instance of [Maximum].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .id()
                 * .appliesToPriceIds()
                 * .filters()
                 * .isInvoiceLevel()
                 * .maximumAmount()
                 * .planPhaseOrder()
                 * .reason()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Maximum =
                    Maximum(
                        checkRequired("id", id),
                        adjustmentType,
                        checkRequired("appliesToPriceIds", appliesToPriceIds).map {
                            it.toImmutable()
                        },
                        checkRequired("filters", filters).map { it.toImmutable() },
                        checkRequired("isInvoiceLevel", isInvoiceLevel),
                        checkRequired("maximumAmount", maximumAmount),
                        checkRequired("planPhaseOrder", planPhaseOrder),
                        checkRequired("reason", reason),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Maximum = apply {
                if (validated) {
                    return@apply
                }

                id()
                _adjustmentType().let {
                    if (it != JsonValue.from("maximum")) {
                        throw OrbInvalidDataException("'adjustmentType' is invalid, received $it")
                    }
                }
                appliesToPriceIds()
                filters().forEach { it.validate() }
                isInvoiceLevel()
                maximumAmount()
                planPhaseOrder()
                reason()
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
                (if (id.asKnown() == null) 0 else 1) +
                    adjustmentType.let { if (it == JsonValue.from("maximum")) 1 else 0 } +
                    (appliesToPriceIds.asKnown()?.size ?: 0) +
                    (filters.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (isInvoiceLevel.asKnown() == null) 0 else 1) +
                    (if (maximumAmount.asKnown() == null) 0 else 1) +
                    (if (planPhaseOrder.asKnown() == null) 0 else 1) +
                    (if (reason.asKnown() == null) 0 else 1)

            class Filter
            private constructor(
                private val field: JsonField<Field>,
                private val operator: JsonField<Operator>,
                private val values: JsonField<List<String>>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("field")
                    @ExcludeMissing
                    field: JsonField<Field> = JsonMissing.of(),
                    @JsonProperty("operator")
                    @ExcludeMissing
                    operator: JsonField<Operator> = JsonMissing.of(),
                    @JsonProperty("values")
                    @ExcludeMissing
                    values: JsonField<List<String>> = JsonMissing.of(),
                ) : this(field, operator, values, mutableMapOf())

                /**
                 * The property of the price to filter on.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun field(): Field = field.getRequired("field")

                /**
                 * Should prices that match the filter be included or excluded.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun operator(): Operator = operator.getRequired("operator")

                /**
                 * The IDs or values that match this filter.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun values(): List<String> = values.getRequired("values")

                /**
                 * Returns the raw JSON value of [field].
                 *
                 * Unlike [field], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("field") @ExcludeMissing fun _field(): JsonField<Field> = field

                /**
                 * Returns the raw JSON value of [operator].
                 *
                 * Unlike [operator], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("operator")
                @ExcludeMissing
                fun _operator(): JsonField<Operator> = operator

                /**
                 * Returns the raw JSON value of [values].
                 *
                 * Unlike [values], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("values")
                @ExcludeMissing
                fun _values(): JsonField<List<String>> = values

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
                     * Returns a mutable builder for constructing an instance of [Filter].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .field()
                     * .operator()
                     * .values()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [Filter]. */
                class Builder internal constructor() {

                    private var field: JsonField<Field>? = null
                    private var operator: JsonField<Operator>? = null
                    private var values: JsonField<MutableList<String>>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(filter: Filter) = apply {
                        field = filter.field
                        operator = filter.operator
                        values = filter.values.map { it.toMutableList() }
                        additionalProperties = filter.additionalProperties.toMutableMap()
                    }

                    /** The property of the price to filter on. */
                    fun field(field: Field) = field(JsonField.of(field))

                    /**
                     * Sets [Builder.field] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.field] with a well-typed [Field] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun field(field: JsonField<Field>) = apply { this.field = field }

                    /** Should prices that match the filter be included or excluded. */
                    fun operator(operator: Operator) = operator(JsonField.of(operator))

                    /**
                     * Sets [Builder.operator] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.operator] with a well-typed [Operator] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun operator(operator: JsonField<Operator>) = apply { this.operator = operator }

                    /** The IDs or values that match this filter. */
                    fun values(values: List<String>) = values(JsonField.of(values))

                    /**
                     * Sets [Builder.values] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.values] with a well-typed `List<String>`
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun values(values: JsonField<List<String>>) = apply {
                        this.values = values.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [String] to [values].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addValue(value: String) = apply {
                        values =
                            (values ?: JsonField.of(mutableListOf())).also {
                                checkKnown("values", it).add(value)
                            }
                    }

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
                     * Returns an immutable instance of [Filter].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .field()
                     * .operator()
                     * .values()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Filter =
                        Filter(
                            checkRequired("field", field),
                            checkRequired("operator", operator),
                            checkRequired("values", values).map { it.toImmutable() },
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Filter = apply {
                    if (validated) {
                        return@apply
                    }

                    field().validate()
                    operator().validate()
                    values()
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
                    (field.asKnown()?.validity() ?: 0) +
                        (operator.asKnown()?.validity() ?: 0) +
                        (values.asKnown()?.size ?: 0)

                /** The property of the price to filter on. */
                class Field @JsonCreator private constructor(private val value: JsonField<String>) :
                    Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        val PRICE_ID = of("price_id")

                        val ITEM_ID = of("item_id")

                        val PRICE_TYPE = of("price_type")

                        val CURRENCY = of("currency")

                        val PRICING_UNIT_ID = of("pricing_unit_id")

                        fun of(value: String) = Field(JsonField.of(value))
                    }

                    /** An enum containing [Field]'s known values. */
                    enum class Known {
                        PRICE_ID,
                        ITEM_ID,
                        PRICE_TYPE,
                        CURRENCY,
                        PRICING_UNIT_ID,
                    }

                    /**
                     * An enum containing [Field]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Field] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        PRICE_ID,
                        ITEM_ID,
                        PRICE_TYPE,
                        CURRENCY,
                        PRICING_UNIT_ID,
                        /**
                         * An enum member indicating that [Field] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            PRICE_ID -> Value.PRICE_ID
                            ITEM_ID -> Value.ITEM_ID
                            PRICE_TYPE -> Value.PRICE_TYPE
                            CURRENCY -> Value.CURRENCY
                            PRICING_UNIT_ID -> Value.PRICING_UNIT_ID
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws OrbInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            PRICE_ID -> Known.PRICE_ID
                            ITEM_ID -> Known.ITEM_ID
                            PRICE_TYPE -> Known.PRICE_TYPE
                            CURRENCY -> Known.CURRENCY
                            PRICING_UNIT_ID -> Known.PRICING_UNIT_ID
                            else -> throw OrbInvalidDataException("Unknown Field: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws OrbInvalidDataException if this class instance's value does not have
                     *   the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString()
                            ?: throw OrbInvalidDataException("Value is not a String")

                    private var validated: Boolean = false

                    fun validate(): Field = apply {
                        if (validated) {
                            return@apply
                        }

                        known()
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
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Field && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                /** Should prices that match the filter be included or excluded. */
                class Operator
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        val INCLUDES = of("includes")

                        val EXCLUDES = of("excludes")

                        fun of(value: String) = Operator(JsonField.of(value))
                    }

                    /** An enum containing [Operator]'s known values. */
                    enum class Known {
                        INCLUDES,
                        EXCLUDES,
                    }

                    /**
                     * An enum containing [Operator]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [Operator] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        INCLUDES,
                        EXCLUDES,
                        /**
                         * An enum member indicating that [Operator] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            INCLUDES -> Value.INCLUDES
                            EXCLUDES -> Value.EXCLUDES
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws OrbInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            INCLUDES -> Known.INCLUDES
                            EXCLUDES -> Known.EXCLUDES
                            else -> throw OrbInvalidDataException("Unknown Operator: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws OrbInvalidDataException if this class instance's value does not have
                     *   the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString()
                            ?: throw OrbInvalidDataException("Value is not a String")

                    private var validated: Boolean = false

                    fun validate(): Operator = apply {
                        if (validated) {
                            return@apply
                        }

                        known()
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
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Operator && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Filter && field == other.field && operator == other.operator && values == other.values && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(field, operator, values, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Filter{field=$field, operator=$operator, values=$values, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Maximum && id == other.id && adjustmentType == other.adjustmentType && appliesToPriceIds == other.appliesToPriceIds && filters == other.filters && isInvoiceLevel == other.isInvoiceLevel && maximumAmount == other.maximumAmount && planPhaseOrder == other.planPhaseOrder && reason == other.reason && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, adjustmentType, appliesToPriceIds, filters, isInvoiceLevel, maximumAmount, planPhaseOrder, reason, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Maximum{id=$id, adjustmentType=$adjustmentType, appliesToPriceIds=$appliesToPriceIds, filters=$filters, isInvoiceLevel=$isInvoiceLevel, maximumAmount=$maximumAmount, planPhaseOrder=$planPhaseOrder, reason=$reason, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PlanVersion && adjustments == other.adjustments && createdAt == other.createdAt && planPhases == other.planPhases && prices == other.prices && version == other.version && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(adjustments, createdAt, planPhases, prices, version, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PlanVersion{adjustments=$adjustments, createdAt=$createdAt, planPhases=$planPhases, prices=$prices, version=$version, additionalProperties=$additionalProperties}"
}
