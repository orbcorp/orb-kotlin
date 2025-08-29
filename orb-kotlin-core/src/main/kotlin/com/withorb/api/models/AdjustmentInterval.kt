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

class AdjustmentInterval
private constructor(
    private val id: JsonField<String>,
    private val adjustment: JsonField<Adjustment>,
    private val appliesToPriceIntervalIds: JsonField<List<String>>,
    private val endDate: JsonField<OffsetDateTime>,
    private val startDate: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("adjustment")
        @ExcludeMissing
        adjustment: JsonField<Adjustment> = JsonMissing.of(),
        @JsonProperty("applies_to_price_interval_ids")
        @ExcludeMissing
        appliesToPriceIntervalIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("end_date")
        @ExcludeMissing
        endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("start_date")
        @ExcludeMissing
        startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(id, adjustment, appliesToPriceIntervalIds, endDate, startDate, mutableMapOf())

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun adjustment(): Adjustment = adjustment.getRequired("adjustment")

    /**
     * The price interval IDs that this adjustment applies to.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun appliesToPriceIntervalIds(): List<String> =
        appliesToPriceIntervalIds.getRequired("applies_to_price_interval_ids")

    /**
     * The end date of the adjustment interval.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun endDate(): OffsetDateTime? = endDate.getNullable("end_date")

    /**
     * The start date of the adjustment interval.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun startDate(): OffsetDateTime = startDate.getRequired("start_date")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [adjustment].
     *
     * Unlike [adjustment], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("adjustment")
    @ExcludeMissing
    fun _adjustment(): JsonField<Adjustment> = adjustment

    /**
     * Returns the raw JSON value of [appliesToPriceIntervalIds].
     *
     * Unlike [appliesToPriceIntervalIds], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("applies_to_price_interval_ids")
    @ExcludeMissing
    fun _appliesToPriceIntervalIds(): JsonField<List<String>> = appliesToPriceIntervalIds

    /**
     * Returns the raw JSON value of [endDate].
     *
     * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("end_date") @ExcludeMissing fun _endDate(): JsonField<OffsetDateTime> = endDate

    /**
     * Returns the raw JSON value of [startDate].
     *
     * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("start_date")
    @ExcludeMissing
    fun _startDate(): JsonField<OffsetDateTime> = startDate

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
         * Returns a mutable builder for constructing an instance of [AdjustmentInterval].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .adjustment()
         * .appliesToPriceIntervalIds()
         * .endDate()
         * .startDate()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [AdjustmentInterval]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var adjustment: JsonField<Adjustment>? = null
        private var appliesToPriceIntervalIds: JsonField<MutableList<String>>? = null
        private var endDate: JsonField<OffsetDateTime>? = null
        private var startDate: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(adjustmentInterval: AdjustmentInterval) = apply {
            id = adjustmentInterval.id
            adjustment = adjustmentInterval.adjustment
            appliesToPriceIntervalIds =
                adjustmentInterval.appliesToPriceIntervalIds.map { it.toMutableList() }
            endDate = adjustmentInterval.endDate
            startDate = adjustmentInterval.startDate
            additionalProperties = adjustmentInterval.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun adjustment(adjustment: Adjustment) = adjustment(JsonField.of(adjustment))

        /**
         * Sets [Builder.adjustment] to an arbitrary JSON value.
         *
         * You should usually call [Builder.adjustment] with a well-typed [Adjustment] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun adjustment(adjustment: JsonField<Adjustment>) = apply { this.adjustment = adjustment }

        /** Alias for calling [adjustment] with `Adjustment.ofUsageDiscount(usageDiscount)`. */
        fun adjustment(usageDiscount: PlanPhaseUsageDiscountAdjustment) =
            adjustment(Adjustment.ofUsageDiscount(usageDiscount))

        /** Alias for calling [adjustment] with `Adjustment.ofAmountDiscount(amountDiscount)`. */
        fun adjustment(amountDiscount: PlanPhaseAmountDiscountAdjustment) =
            adjustment(Adjustment.ofAmountDiscount(amountDiscount))

        /**
         * Alias for calling [adjustment] with
         * `Adjustment.ofPercentageDiscount(percentageDiscount)`.
         */
        fun adjustment(percentageDiscount: PlanPhasePercentageDiscountAdjustment) =
            adjustment(Adjustment.ofPercentageDiscount(percentageDiscount))

        /** Alias for calling [adjustment] with `Adjustment.ofMinimum(minimum)`. */
        fun adjustment(minimum: PlanPhaseMinimumAdjustment) =
            adjustment(Adjustment.ofMinimum(minimum))

        /** Alias for calling [adjustment] with `Adjustment.ofMaximum(maximum)`. */
        fun adjustment(maximum: PlanPhaseMaximumAdjustment) =
            adjustment(Adjustment.ofMaximum(maximum))

        /** The price interval IDs that this adjustment applies to. */
        fun appliesToPriceIntervalIds(appliesToPriceIntervalIds: List<String>) =
            appliesToPriceIntervalIds(JsonField.of(appliesToPriceIntervalIds))

        /**
         * Sets [Builder.appliesToPriceIntervalIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.appliesToPriceIntervalIds] with a well-typed
         * `List<String>` value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun appliesToPriceIntervalIds(appliesToPriceIntervalIds: JsonField<List<String>>) = apply {
            this.appliesToPriceIntervalIds = appliesToPriceIntervalIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [appliesToPriceIntervalIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAppliesToPriceIntervalId(appliesToPriceIntervalId: String) = apply {
            appliesToPriceIntervalIds =
                (appliesToPriceIntervalIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("appliesToPriceIntervalIds", it).add(appliesToPriceIntervalId)
                }
        }

        /** The end date of the adjustment interval. */
        fun endDate(endDate: OffsetDateTime?) = endDate(JsonField.ofNullable(endDate))

        /**
         * Sets [Builder.endDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

        /** The start date of the adjustment interval. */
        fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

        /**
         * Sets [Builder.startDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startDate(startDate: JsonField<OffsetDateTime>) = apply { this.startDate = startDate }

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
         * Returns an immutable instance of [AdjustmentInterval].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .adjustment()
         * .appliesToPriceIntervalIds()
         * .endDate()
         * .startDate()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AdjustmentInterval =
            AdjustmentInterval(
                checkRequired("id", id),
                checkRequired("adjustment", adjustment),
                checkRequired("appliesToPriceIntervalIds", appliesToPriceIntervalIds).map {
                    it.toImmutable()
                },
                checkRequired("endDate", endDate),
                checkRequired("startDate", startDate),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AdjustmentInterval = apply {
        if (validated) {
            return@apply
        }

        id()
        adjustment().validate()
        appliesToPriceIntervalIds()
        endDate()
        startDate()
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
        (if (id.asKnown() == null) 0 else 1) +
            (adjustment.asKnown()?.validity() ?: 0) +
            (appliesToPriceIntervalIds.asKnown()?.size ?: 0) +
            (if (endDate.asKnown() == null) 0 else 1) +
            (if (startDate.asKnown() == null) 0 else 1)

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

        return other is AdjustmentInterval &&
            id == other.id &&
            adjustment == other.adjustment &&
            appliesToPriceIntervalIds == other.appliesToPriceIntervalIds &&
            endDate == other.endDate &&
            startDate == other.startDate &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            adjustment,
            appliesToPriceIntervalIds,
            endDate,
            startDate,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AdjustmentInterval{id=$id, adjustment=$adjustment, appliesToPriceIntervalIds=$appliesToPriceIntervalIds, endDate=$endDate, startDate=$startDate, additionalProperties=$additionalProperties}"
}
