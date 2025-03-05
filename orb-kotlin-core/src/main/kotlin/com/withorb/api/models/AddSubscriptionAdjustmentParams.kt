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
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.checkKnown
import com.withorb.api.core.checkRequired
import com.withorb.api.core.getOrThrow
import com.withorb.api.core.immutableEmptyMap
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

@NoAutoDetect
class AddSubscriptionAdjustmentParams
@JsonCreator
private constructor(
    @JsonProperty("adjustment")
    @ExcludeMissing
    private val adjustment: JsonField<Adjustment> = JsonMissing.of(),
    @JsonProperty("end_date")
    @ExcludeMissing
    private val endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("plan_phase_order")
    @ExcludeMissing
    private val planPhaseOrder: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("start_date")
    @ExcludeMissing
    private val startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The definition of a new adjustment to create and add to the subscription. */
    fun adjustment(): Adjustment = adjustment.getRequired("adjustment")

    /**
     * The end date of the adjustment interval. This is the date that the adjustment will stop
     * affecting prices on the subscription.
     */
    fun endDate(): OffsetDateTime? = endDate.getNullable("end_date")

    /** The phase to add this adjustment to. */
    fun planPhaseOrder(): Long? = planPhaseOrder.getNullable("plan_phase_order")

    /**
     * The start date of the adjustment interval. This is the date that the adjustment will start
     * affecting prices on the subscription. If null, the adjustment will start when the phase or
     * subscription starts.
     */
    fun startDate(): OffsetDateTime? = startDate.getNullable("start_date")

    /** The definition of a new adjustment to create and add to the subscription. */
    @JsonProperty("adjustment")
    @ExcludeMissing
    fun _adjustment(): JsonField<Adjustment> = adjustment

    /**
     * The end date of the adjustment interval. This is the date that the adjustment will stop
     * affecting prices on the subscription.
     */
    @JsonProperty("end_date") @ExcludeMissing fun _endDate(): JsonField<OffsetDateTime> = endDate

    /** The phase to add this adjustment to. */
    @JsonProperty("plan_phase_order")
    @ExcludeMissing
    fun _planPhaseOrder(): JsonField<Long> = planPhaseOrder

    /**
     * The start date of the adjustment interval. This is the date that the adjustment will start
     * affecting prices on the subscription. If null, the adjustment will start when the phase or
     * subscription starts.
     */
    @JsonProperty("start_date")
    @ExcludeMissing
    fun _startDate(): JsonField<OffsetDateTime> = startDate

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): AddSubscriptionAdjustmentParams = apply {
        if (validated) {
            return@apply
        }

        adjustment().validate()
        endDate()
        planPhaseOrder()
        startDate()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [AddSubscriptionAdjustmentParams].
         *
         * The following fields are required:
         * ```kotlin
         * .adjustment()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [AddSubscriptionAdjustmentParams]. */
    class Builder internal constructor() {

        private var adjustment: JsonField<Adjustment>? = null
        private var endDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var planPhaseOrder: JsonField<Long> = JsonMissing.of()
        private var startDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(addSubscriptionAdjustmentParams: AddSubscriptionAdjustmentParams) =
            apply {
                adjustment = addSubscriptionAdjustmentParams.adjustment
                endDate = addSubscriptionAdjustmentParams.endDate
                planPhaseOrder = addSubscriptionAdjustmentParams.planPhaseOrder
                startDate = addSubscriptionAdjustmentParams.startDate
                additionalProperties =
                    addSubscriptionAdjustmentParams.additionalProperties.toMutableMap()
            }

        /** The definition of a new adjustment to create and add to the subscription. */
        fun adjustment(adjustment: Adjustment) = adjustment(JsonField.of(adjustment))

        /** The definition of a new adjustment to create and add to the subscription. */
        fun adjustment(adjustment: JsonField<Adjustment>) = apply { this.adjustment = adjustment }

        /** The definition of a new adjustment to create and add to the subscription. */
        fun adjustment(newPercentageDiscount: Adjustment.NewPercentageDiscount) =
            adjustment(Adjustment.ofNewPercentageDiscount(newPercentageDiscount))

        /** The definition of a new adjustment to create and add to the subscription. */
        fun adjustment(newUsageDiscount: Adjustment.NewUsageDiscount) =
            adjustment(Adjustment.ofNewUsageDiscount(newUsageDiscount))

        /** The definition of a new adjustment to create and add to the subscription. */
        fun adjustment(newAmountDiscount: Adjustment.NewAmountDiscount) =
            adjustment(Adjustment.ofNewAmountDiscount(newAmountDiscount))

        /** The definition of a new adjustment to create and add to the subscription. */
        fun adjustment(newMinimum: Adjustment.NewMinimum) =
            adjustment(Adjustment.ofNewMinimum(newMinimum))

        /** The definition of a new adjustment to create and add to the subscription. */
        fun adjustment(newMaximum: Adjustment.NewMaximum) =
            adjustment(Adjustment.ofNewMaximum(newMaximum))

        /**
         * The end date of the adjustment interval. This is the date that the adjustment will stop
         * affecting prices on the subscription.
         */
        fun endDate(endDate: OffsetDateTime?) = endDate(JsonField.ofNullable(endDate))

        /**
         * The end date of the adjustment interval. This is the date that the adjustment will stop
         * affecting prices on the subscription.
         */
        fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

        /** The phase to add this adjustment to. */
        fun planPhaseOrder(planPhaseOrder: Long?) =
            planPhaseOrder(JsonField.ofNullable(planPhaseOrder))

        /** The phase to add this adjustment to. */
        fun planPhaseOrder(planPhaseOrder: Long) = planPhaseOrder(planPhaseOrder as Long?)

        /** The phase to add this adjustment to. */
        fun planPhaseOrder(planPhaseOrder: JsonField<Long>) = apply {
            this.planPhaseOrder = planPhaseOrder
        }

        /**
         * The start date of the adjustment interval. This is the date that the adjustment will
         * start affecting prices on the subscription. If null, the adjustment will start when the
         * phase or subscription starts.
         */
        fun startDate(startDate: OffsetDateTime?) = startDate(JsonField.ofNullable(startDate))

        /**
         * The start date of the adjustment interval. This is the date that the adjustment will
         * start affecting prices on the subscription. If null, the adjustment will start when the
         * phase or subscription starts.
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

        fun build(): AddSubscriptionAdjustmentParams =
            AddSubscriptionAdjustmentParams(
                checkRequired("adjustment", adjustment),
                endDate,
                planPhaseOrder,
                startDate,
                additionalProperties.toImmutable(),
            )
    }

    /** The definition of a new adjustment to create and add to the subscription. */
    @JsonDeserialize(using = Adjustment.Deserializer::class)
    @JsonSerialize(using = Adjustment.Serializer::class)
    class Adjustment
    private constructor(
        private val newPercentageDiscount: NewPercentageDiscount? = null,
        private val newUsageDiscount: NewUsageDiscount? = null,
        private val newAmountDiscount: NewAmountDiscount? = null,
        private val newMinimum: NewMinimum? = null,
        private val newMaximum: NewMaximum? = null,
        private val _json: JsonValue? = null,
    ) {

        fun newPercentageDiscount(): NewPercentageDiscount? = newPercentageDiscount

        fun newUsageDiscount(): NewUsageDiscount? = newUsageDiscount

        fun newAmountDiscount(): NewAmountDiscount? = newAmountDiscount

        fun newMinimum(): NewMinimum? = newMinimum

        fun newMaximum(): NewMaximum? = newMaximum

        fun isNewPercentageDiscount(): Boolean = newPercentageDiscount != null

        fun isNewUsageDiscount(): Boolean = newUsageDiscount != null

        fun isNewAmountDiscount(): Boolean = newAmountDiscount != null

        fun isNewMinimum(): Boolean = newMinimum != null

        fun isNewMaximum(): Boolean = newMaximum != null

        fun asNewPercentageDiscount(): NewPercentageDiscount =
            newPercentageDiscount.getOrThrow("newPercentageDiscount")

        fun asNewUsageDiscount(): NewUsageDiscount = newUsageDiscount.getOrThrow("newUsageDiscount")

        fun asNewAmountDiscount(): NewAmountDiscount =
            newAmountDiscount.getOrThrow("newAmountDiscount")

        fun asNewMinimum(): NewMinimum = newMinimum.getOrThrow("newMinimum")

        fun asNewMaximum(): NewMaximum = newMaximum.getOrThrow("newMaximum")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                newPercentageDiscount != null ->
                    visitor.visitNewPercentageDiscount(newPercentageDiscount)
                newUsageDiscount != null -> visitor.visitNewUsageDiscount(newUsageDiscount)
                newAmountDiscount != null -> visitor.visitNewAmountDiscount(newAmountDiscount)
                newMinimum != null -> visitor.visitNewMinimum(newMinimum)
                newMaximum != null -> visitor.visitNewMaximum(newMaximum)
                else -> visitor.unknown(_json)
            }
        }

        private var validated: Boolean = false

        fun validate(): Adjustment = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitNewPercentageDiscount(
                        newPercentageDiscount: NewPercentageDiscount
                    ) {
                        newPercentageDiscount.validate()
                    }

                    override fun visitNewUsageDiscount(newUsageDiscount: NewUsageDiscount) {
                        newUsageDiscount.validate()
                    }

                    override fun visitNewAmountDiscount(newAmountDiscount: NewAmountDiscount) {
                        newAmountDiscount.validate()
                    }

                    override fun visitNewMinimum(newMinimum: NewMinimum) {
                        newMinimum.validate()
                    }

                    override fun visitNewMaximum(newMaximum: NewMaximum) {
                        newMaximum.validate()
                    }
                }
            )
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Adjustment && newPercentageDiscount == other.newPercentageDiscount && newUsageDiscount == other.newUsageDiscount && newAmountDiscount == other.newAmountDiscount && newMinimum == other.newMinimum && newMaximum == other.newMaximum /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(newPercentageDiscount, newUsageDiscount, newAmountDiscount, newMinimum, newMaximum) /* spotless:on */

        override fun toString(): String =
            when {
                newPercentageDiscount != null ->
                    "Adjustment{newPercentageDiscount=$newPercentageDiscount}"
                newUsageDiscount != null -> "Adjustment{newUsageDiscount=$newUsageDiscount}"
                newAmountDiscount != null -> "Adjustment{newAmountDiscount=$newAmountDiscount}"
                newMinimum != null -> "Adjustment{newMinimum=$newMinimum}"
                newMaximum != null -> "Adjustment{newMaximum=$newMaximum}"
                _json != null -> "Adjustment{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Adjustment")
            }

        companion object {

            fun ofNewPercentageDiscount(newPercentageDiscount: NewPercentageDiscount) =
                Adjustment(newPercentageDiscount = newPercentageDiscount)

            fun ofNewUsageDiscount(newUsageDiscount: NewUsageDiscount) =
                Adjustment(newUsageDiscount = newUsageDiscount)

            fun ofNewAmountDiscount(newAmountDiscount: NewAmountDiscount) =
                Adjustment(newAmountDiscount = newAmountDiscount)

            fun ofNewMinimum(newMinimum: NewMinimum) = Adjustment(newMinimum = newMinimum)

            fun ofNewMaximum(newMaximum: NewMaximum) = Adjustment(newMaximum = newMaximum)
        }

        /**
         * An interface that defines how to map each variant of [Adjustment] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitNewPercentageDiscount(newPercentageDiscount: NewPercentageDiscount): T

            fun visitNewUsageDiscount(newUsageDiscount: NewUsageDiscount): T

            fun visitNewAmountDiscount(newAmountDiscount: NewAmountDiscount): T

            fun visitNewMinimum(newMinimum: NewMinimum): T

            fun visitNewMaximum(newMaximum: NewMaximum): T

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
                    "percentage_discount" -> {
                        tryDeserialize(node, jacksonTypeRef<NewPercentageDiscount>()) {
                                it.validate()
                            }
                            ?.let {
                                return Adjustment(newPercentageDiscount = it, _json = json)
                            }
                    }
                    "usage_discount" -> {
                        tryDeserialize(node, jacksonTypeRef<NewUsageDiscount>()) { it.validate() }
                            ?.let {
                                return Adjustment(newUsageDiscount = it, _json = json)
                            }
                    }
                    "amount_discount" -> {
                        tryDeserialize(node, jacksonTypeRef<NewAmountDiscount>()) { it.validate() }
                            ?.let {
                                return Adjustment(newAmountDiscount = it, _json = json)
                            }
                    }
                    "minimum" -> {
                        tryDeserialize(node, jacksonTypeRef<NewMinimum>()) { it.validate() }
                            ?.let {
                                return Adjustment(newMinimum = it, _json = json)
                            }
                    }
                    "maximum" -> {
                        tryDeserialize(node, jacksonTypeRef<NewMaximum>()) { it.validate() }
                            ?.let {
                                return Adjustment(newMaximum = it, _json = json)
                            }
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
                    value.newPercentageDiscount != null ->
                        generator.writeObject(value.newPercentageDiscount)
                    value.newUsageDiscount != null -> generator.writeObject(value.newUsageDiscount)
                    value.newAmountDiscount != null ->
                        generator.writeObject(value.newAmountDiscount)
                    value.newMinimum != null -> generator.writeObject(value.newMinimum)
                    value.newMaximum != null -> generator.writeObject(value.newMaximum)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Adjustment")
                }
            }
        }

        @NoAutoDetect
        class NewPercentageDiscount
        @JsonCreator
        private constructor(
            @JsonProperty("adjustment_type")
            @ExcludeMissing
            private val adjustmentType: JsonField<AdjustmentType> = JsonMissing.of(),
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            private val appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("percentage_discount")
            @ExcludeMissing
            private val percentageDiscount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("is_invoice_level")
            @ExcludeMissing
            private val isInvoiceLevel: JsonField<Boolean> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun adjustmentType(): AdjustmentType = adjustmentType.getRequired("adjustment_type")

            /** The set of price IDs to which this adjustment applies. */
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            fun percentageDiscount(): Double = percentageDiscount.getRequired("percentage_discount")

            /**
             * When false, this adjustment will be applied to a single price. Otherwise, it will be
             * applied at the invoice level, possibly to multiple prices.
             */
            fun isInvoiceLevel(): Boolean? = isInvoiceLevel.getNullable("is_invoice_level")

            @JsonProperty("adjustment_type")
            @ExcludeMissing
            fun _adjustmentType(): JsonField<AdjustmentType> = adjustmentType

            /** The set of price IDs to which this adjustment applies. */
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

            @JsonProperty("percentage_discount")
            @ExcludeMissing
            fun _percentageDiscount(): JsonField<Double> = percentageDiscount

            /**
             * When false, this adjustment will be applied to a single price. Otherwise, it will be
             * applied at the invoice level, possibly to multiple prices.
             */
            @JsonProperty("is_invoice_level")
            @ExcludeMissing
            fun _isInvoiceLevel(): JsonField<Boolean> = isInvoiceLevel

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): NewPercentageDiscount = apply {
                if (validated) {
                    return@apply
                }

                adjustmentType()
                appliesToPriceIds()
                percentageDiscount()
                isInvoiceLevel()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [NewPercentageDiscount].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .adjustmentType()
                 * .appliesToPriceIds()
                 * .percentageDiscount()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [NewPercentageDiscount]. */
            class Builder internal constructor() {

                private var adjustmentType: JsonField<AdjustmentType>? = null
                private var appliesToPriceIds: JsonField<MutableList<String>>? = null
                private var percentageDiscount: JsonField<Double>? = null
                private var isInvoiceLevel: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(newPercentageDiscount: NewPercentageDiscount) = apply {
                    adjustmentType = newPercentageDiscount.adjustmentType
                    appliesToPriceIds =
                        newPercentageDiscount.appliesToPriceIds.map { it.toMutableList() }
                    percentageDiscount = newPercentageDiscount.percentageDiscount
                    isInvoiceLevel = newPercentageDiscount.isInvoiceLevel
                    additionalProperties = newPercentageDiscount.additionalProperties.toMutableMap()
                }

                fun adjustmentType(adjustmentType: AdjustmentType) =
                    adjustmentType(JsonField.of(adjustmentType))

                fun adjustmentType(adjustmentType: JsonField<AdjustmentType>) = apply {
                    this.adjustmentType = adjustmentType
                }

                /** The set of price IDs to which this adjustment applies. */
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /** The set of price IDs to which this adjustment applies. */
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
                }

                /** The set of price IDs to which this adjustment applies. */
                fun addAppliesToPriceId(appliesToPriceId: String) = apply {
                    appliesToPriceIds =
                        (appliesToPriceIds ?: JsonField.of(mutableListOf())).also {
                            checkKnown("appliesToPriceIds", it).add(appliesToPriceId)
                        }
                }

                fun percentageDiscount(percentageDiscount: Double) =
                    percentageDiscount(JsonField.of(percentageDiscount))

                fun percentageDiscount(percentageDiscount: JsonField<Double>) = apply {
                    this.percentageDiscount = percentageDiscount
                }

                /**
                 * When false, this adjustment will be applied to a single price. Otherwise, it will
                 * be applied at the invoice level, possibly to multiple prices.
                 */
                fun isInvoiceLevel(isInvoiceLevel: Boolean) =
                    isInvoiceLevel(JsonField.of(isInvoiceLevel))

                /**
                 * When false, this adjustment will be applied to a single price. Otherwise, it will
                 * be applied at the invoice level, possibly to multiple prices.
                 */
                fun isInvoiceLevel(isInvoiceLevel: JsonField<Boolean>) = apply {
                    this.isInvoiceLevel = isInvoiceLevel
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

                fun build(): NewPercentageDiscount =
                    NewPercentageDiscount(
                        checkRequired("adjustmentType", adjustmentType),
                        checkRequired("appliesToPriceIds", appliesToPriceIds).map {
                            it.toImmutable()
                        },
                        checkRequired("percentageDiscount", percentageDiscount),
                        isInvoiceLevel,
                        additionalProperties.toImmutable(),
                    )
            }

            class AdjustmentType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val PERCENTAGE_DISCOUNT = of("percentage_discount")

                    fun of(value: String) = AdjustmentType(JsonField.of(value))
                }

                /** An enum containing [AdjustmentType]'s known values. */
                enum class Known {
                    PERCENTAGE_DISCOUNT
                }

                /**
                 * An enum containing [AdjustmentType]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [AdjustmentType] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    PERCENTAGE_DISCOUNT,
                    /**
                     * An enum member indicating that [AdjustmentType] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        PERCENTAGE_DISCOUNT -> Value.PERCENTAGE_DISCOUNT
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws OrbInvalidDataException if this class instance's value is a not a known
                 *   member.
                 */
                fun known(): Known =
                    when (this) {
                        PERCENTAGE_DISCOUNT -> Known.PERCENTAGE_DISCOUNT
                        else -> throw OrbInvalidDataException("Unknown AdjustmentType: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws OrbInvalidDataException if this class instance's value does not have the
                 *   expected primitive type.
                 */
                fun asString(): String =
                    _value().asString() ?: throw OrbInvalidDataException("Value is not a String")

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is AdjustmentType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is NewPercentageDiscount && adjustmentType == other.adjustmentType && appliesToPriceIds == other.appliesToPriceIds && percentageDiscount == other.percentageDiscount && isInvoiceLevel == other.isInvoiceLevel && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(adjustmentType, appliesToPriceIds, percentageDiscount, isInvoiceLevel, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "NewPercentageDiscount{adjustmentType=$adjustmentType, appliesToPriceIds=$appliesToPriceIds, percentageDiscount=$percentageDiscount, isInvoiceLevel=$isInvoiceLevel, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class NewUsageDiscount
        @JsonCreator
        private constructor(
            @JsonProperty("adjustment_type")
            @ExcludeMissing
            private val adjustmentType: JsonField<AdjustmentType> = JsonMissing.of(),
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            private val appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("usage_discount")
            @ExcludeMissing
            private val usageDiscount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("is_invoice_level")
            @ExcludeMissing
            private val isInvoiceLevel: JsonField<Boolean> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun adjustmentType(): AdjustmentType = adjustmentType.getRequired("adjustment_type")

            /** The set of price IDs to which this adjustment applies. */
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            fun usageDiscount(): Double = usageDiscount.getRequired("usage_discount")

            /**
             * When false, this adjustment will be applied to a single price. Otherwise, it will be
             * applied at the invoice level, possibly to multiple prices.
             */
            fun isInvoiceLevel(): Boolean? = isInvoiceLevel.getNullable("is_invoice_level")

            @JsonProperty("adjustment_type")
            @ExcludeMissing
            fun _adjustmentType(): JsonField<AdjustmentType> = adjustmentType

            /** The set of price IDs to which this adjustment applies. */
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

            @JsonProperty("usage_discount")
            @ExcludeMissing
            fun _usageDiscount(): JsonField<Double> = usageDiscount

            /**
             * When false, this adjustment will be applied to a single price. Otherwise, it will be
             * applied at the invoice level, possibly to multiple prices.
             */
            @JsonProperty("is_invoice_level")
            @ExcludeMissing
            fun _isInvoiceLevel(): JsonField<Boolean> = isInvoiceLevel

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): NewUsageDiscount = apply {
                if (validated) {
                    return@apply
                }

                adjustmentType()
                appliesToPriceIds()
                usageDiscount()
                isInvoiceLevel()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [NewUsageDiscount].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .adjustmentType()
                 * .appliesToPriceIds()
                 * .usageDiscount()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [NewUsageDiscount]. */
            class Builder internal constructor() {

                private var adjustmentType: JsonField<AdjustmentType>? = null
                private var appliesToPriceIds: JsonField<MutableList<String>>? = null
                private var usageDiscount: JsonField<Double>? = null
                private var isInvoiceLevel: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(newUsageDiscount: NewUsageDiscount) = apply {
                    adjustmentType = newUsageDiscount.adjustmentType
                    appliesToPriceIds =
                        newUsageDiscount.appliesToPriceIds.map { it.toMutableList() }
                    usageDiscount = newUsageDiscount.usageDiscount
                    isInvoiceLevel = newUsageDiscount.isInvoiceLevel
                    additionalProperties = newUsageDiscount.additionalProperties.toMutableMap()
                }

                fun adjustmentType(adjustmentType: AdjustmentType) =
                    adjustmentType(JsonField.of(adjustmentType))

                fun adjustmentType(adjustmentType: JsonField<AdjustmentType>) = apply {
                    this.adjustmentType = adjustmentType
                }

                /** The set of price IDs to which this adjustment applies. */
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /** The set of price IDs to which this adjustment applies. */
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
                }

                /** The set of price IDs to which this adjustment applies. */
                fun addAppliesToPriceId(appliesToPriceId: String) = apply {
                    appliesToPriceIds =
                        (appliesToPriceIds ?: JsonField.of(mutableListOf())).also {
                            checkKnown("appliesToPriceIds", it).add(appliesToPriceId)
                        }
                }

                fun usageDiscount(usageDiscount: Double) =
                    usageDiscount(JsonField.of(usageDiscount))

                fun usageDiscount(usageDiscount: JsonField<Double>) = apply {
                    this.usageDiscount = usageDiscount
                }

                /**
                 * When false, this adjustment will be applied to a single price. Otherwise, it will
                 * be applied at the invoice level, possibly to multiple prices.
                 */
                fun isInvoiceLevel(isInvoiceLevel: Boolean) =
                    isInvoiceLevel(JsonField.of(isInvoiceLevel))

                /**
                 * When false, this adjustment will be applied to a single price. Otherwise, it will
                 * be applied at the invoice level, possibly to multiple prices.
                 */
                fun isInvoiceLevel(isInvoiceLevel: JsonField<Boolean>) = apply {
                    this.isInvoiceLevel = isInvoiceLevel
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

                fun build(): NewUsageDiscount =
                    NewUsageDiscount(
                        checkRequired("adjustmentType", adjustmentType),
                        checkRequired("appliesToPriceIds", appliesToPriceIds).map {
                            it.toImmutable()
                        },
                        checkRequired("usageDiscount", usageDiscount),
                        isInvoiceLevel,
                        additionalProperties.toImmutable(),
                    )
            }

            class AdjustmentType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val USAGE_DISCOUNT = of("usage_discount")

                    fun of(value: String) = AdjustmentType(JsonField.of(value))
                }

                /** An enum containing [AdjustmentType]'s known values. */
                enum class Known {
                    USAGE_DISCOUNT
                }

                /**
                 * An enum containing [AdjustmentType]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [AdjustmentType] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    USAGE_DISCOUNT,
                    /**
                     * An enum member indicating that [AdjustmentType] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        USAGE_DISCOUNT -> Value.USAGE_DISCOUNT
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws OrbInvalidDataException if this class instance's value is a not a known
                 *   member.
                 */
                fun known(): Known =
                    when (this) {
                        USAGE_DISCOUNT -> Known.USAGE_DISCOUNT
                        else -> throw OrbInvalidDataException("Unknown AdjustmentType: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws OrbInvalidDataException if this class instance's value does not have the
                 *   expected primitive type.
                 */
                fun asString(): String =
                    _value().asString() ?: throw OrbInvalidDataException("Value is not a String")

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is AdjustmentType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is NewUsageDiscount && adjustmentType == other.adjustmentType && appliesToPriceIds == other.appliesToPriceIds && usageDiscount == other.usageDiscount && isInvoiceLevel == other.isInvoiceLevel && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(adjustmentType, appliesToPriceIds, usageDiscount, isInvoiceLevel, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "NewUsageDiscount{adjustmentType=$adjustmentType, appliesToPriceIds=$appliesToPriceIds, usageDiscount=$usageDiscount, isInvoiceLevel=$isInvoiceLevel, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class NewAmountDiscount
        @JsonCreator
        private constructor(
            @JsonProperty("adjustment_type")
            @ExcludeMissing
            private val adjustmentType: JsonField<AdjustmentType> = JsonMissing.of(),
            @JsonProperty("amount_discount")
            @ExcludeMissing
            private val amountDiscount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            private val appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("is_invoice_level")
            @ExcludeMissing
            private val isInvoiceLevel: JsonField<Boolean> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun adjustmentType(): AdjustmentType = adjustmentType.getRequired("adjustment_type")

            fun amountDiscount(): String = amountDiscount.getRequired("amount_discount")

            /** The set of price IDs to which this adjustment applies. */
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /**
             * When false, this adjustment will be applied to a single price. Otherwise, it will be
             * applied at the invoice level, possibly to multiple prices.
             */
            fun isInvoiceLevel(): Boolean? = isInvoiceLevel.getNullable("is_invoice_level")

            @JsonProperty("adjustment_type")
            @ExcludeMissing
            fun _adjustmentType(): JsonField<AdjustmentType> = adjustmentType

            @JsonProperty("amount_discount")
            @ExcludeMissing
            fun _amountDiscount(): JsonField<String> = amountDiscount

            /** The set of price IDs to which this adjustment applies. */
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

            /**
             * When false, this adjustment will be applied to a single price. Otherwise, it will be
             * applied at the invoice level, possibly to multiple prices.
             */
            @JsonProperty("is_invoice_level")
            @ExcludeMissing
            fun _isInvoiceLevel(): JsonField<Boolean> = isInvoiceLevel

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): NewAmountDiscount = apply {
                if (validated) {
                    return@apply
                }

                adjustmentType()
                amountDiscount()
                appliesToPriceIds()
                isInvoiceLevel()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [NewAmountDiscount].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .adjustmentType()
                 * .amountDiscount()
                 * .appliesToPriceIds()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [NewAmountDiscount]. */
            class Builder internal constructor() {

                private var adjustmentType: JsonField<AdjustmentType>? = null
                private var amountDiscount: JsonField<String>? = null
                private var appliesToPriceIds: JsonField<MutableList<String>>? = null
                private var isInvoiceLevel: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(newAmountDiscount: NewAmountDiscount) = apply {
                    adjustmentType = newAmountDiscount.adjustmentType
                    amountDiscount = newAmountDiscount.amountDiscount
                    appliesToPriceIds =
                        newAmountDiscount.appliesToPriceIds.map { it.toMutableList() }
                    isInvoiceLevel = newAmountDiscount.isInvoiceLevel
                    additionalProperties = newAmountDiscount.additionalProperties.toMutableMap()
                }

                fun adjustmentType(adjustmentType: AdjustmentType) =
                    adjustmentType(JsonField.of(adjustmentType))

                fun adjustmentType(adjustmentType: JsonField<AdjustmentType>) = apply {
                    this.adjustmentType = adjustmentType
                }

                fun amountDiscount(amountDiscount: String) =
                    amountDiscount(JsonField.of(amountDiscount))

                fun amountDiscount(amountDiscount: JsonField<String>) = apply {
                    this.amountDiscount = amountDiscount
                }

                /** The set of price IDs to which this adjustment applies. */
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /** The set of price IDs to which this adjustment applies. */
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
                }

                /** The set of price IDs to which this adjustment applies. */
                fun addAppliesToPriceId(appliesToPriceId: String) = apply {
                    appliesToPriceIds =
                        (appliesToPriceIds ?: JsonField.of(mutableListOf())).also {
                            checkKnown("appliesToPriceIds", it).add(appliesToPriceId)
                        }
                }

                /**
                 * When false, this adjustment will be applied to a single price. Otherwise, it will
                 * be applied at the invoice level, possibly to multiple prices.
                 */
                fun isInvoiceLevel(isInvoiceLevel: Boolean) =
                    isInvoiceLevel(JsonField.of(isInvoiceLevel))

                /**
                 * When false, this adjustment will be applied to a single price. Otherwise, it will
                 * be applied at the invoice level, possibly to multiple prices.
                 */
                fun isInvoiceLevel(isInvoiceLevel: JsonField<Boolean>) = apply {
                    this.isInvoiceLevel = isInvoiceLevel
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

                fun build(): NewAmountDiscount =
                    NewAmountDiscount(
                        checkRequired("adjustmentType", adjustmentType),
                        checkRequired("amountDiscount", amountDiscount),
                        checkRequired("appliesToPriceIds", appliesToPriceIds).map {
                            it.toImmutable()
                        },
                        isInvoiceLevel,
                        additionalProperties.toImmutable(),
                    )
            }

            class AdjustmentType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val AMOUNT_DISCOUNT = of("amount_discount")

                    fun of(value: String) = AdjustmentType(JsonField.of(value))
                }

                /** An enum containing [AdjustmentType]'s known values. */
                enum class Known {
                    AMOUNT_DISCOUNT
                }

                /**
                 * An enum containing [AdjustmentType]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [AdjustmentType] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    AMOUNT_DISCOUNT,
                    /**
                     * An enum member indicating that [AdjustmentType] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        AMOUNT_DISCOUNT -> Value.AMOUNT_DISCOUNT
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws OrbInvalidDataException if this class instance's value is a not a known
                 *   member.
                 */
                fun known(): Known =
                    when (this) {
                        AMOUNT_DISCOUNT -> Known.AMOUNT_DISCOUNT
                        else -> throw OrbInvalidDataException("Unknown AdjustmentType: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws OrbInvalidDataException if this class instance's value does not have the
                 *   expected primitive type.
                 */
                fun asString(): String =
                    _value().asString() ?: throw OrbInvalidDataException("Value is not a String")

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is AdjustmentType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is NewAmountDiscount && adjustmentType == other.adjustmentType && amountDiscount == other.amountDiscount && appliesToPriceIds == other.appliesToPriceIds && isInvoiceLevel == other.isInvoiceLevel && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(adjustmentType, amountDiscount, appliesToPriceIds, isInvoiceLevel, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "NewAmountDiscount{adjustmentType=$adjustmentType, amountDiscount=$amountDiscount, appliesToPriceIds=$appliesToPriceIds, isInvoiceLevel=$isInvoiceLevel, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class NewMinimum
        @JsonCreator
        private constructor(
            @JsonProperty("adjustment_type")
            @ExcludeMissing
            private val adjustmentType: JsonField<AdjustmentType> = JsonMissing.of(),
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            private val appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("item_id")
            @ExcludeMissing
            private val itemId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("minimum_amount")
            @ExcludeMissing
            private val minimumAmount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("is_invoice_level")
            @ExcludeMissing
            private val isInvoiceLevel: JsonField<Boolean> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun adjustmentType(): AdjustmentType = adjustmentType.getRequired("adjustment_type")

            /** The set of price IDs to which this adjustment applies. */
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /** The item ID that revenue from this minimum will be attributed to. */
            fun itemId(): String = itemId.getRequired("item_id")

            fun minimumAmount(): String = minimumAmount.getRequired("minimum_amount")

            /**
             * When false, this adjustment will be applied to a single price. Otherwise, it will be
             * applied at the invoice level, possibly to multiple prices.
             */
            fun isInvoiceLevel(): Boolean? = isInvoiceLevel.getNullable("is_invoice_level")

            @JsonProperty("adjustment_type")
            @ExcludeMissing
            fun _adjustmentType(): JsonField<AdjustmentType> = adjustmentType

            /** The set of price IDs to which this adjustment applies. */
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

            /** The item ID that revenue from this minimum will be attributed to. */
            @JsonProperty("item_id") @ExcludeMissing fun _itemId(): JsonField<String> = itemId

            @JsonProperty("minimum_amount")
            @ExcludeMissing
            fun _minimumAmount(): JsonField<String> = minimumAmount

            /**
             * When false, this adjustment will be applied to a single price. Otherwise, it will be
             * applied at the invoice level, possibly to multiple prices.
             */
            @JsonProperty("is_invoice_level")
            @ExcludeMissing
            fun _isInvoiceLevel(): JsonField<Boolean> = isInvoiceLevel

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): NewMinimum = apply {
                if (validated) {
                    return@apply
                }

                adjustmentType()
                appliesToPriceIds()
                itemId()
                minimumAmount()
                isInvoiceLevel()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [NewMinimum].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .adjustmentType()
                 * .appliesToPriceIds()
                 * .itemId()
                 * .minimumAmount()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [NewMinimum]. */
            class Builder internal constructor() {

                private var adjustmentType: JsonField<AdjustmentType>? = null
                private var appliesToPriceIds: JsonField<MutableList<String>>? = null
                private var itemId: JsonField<String>? = null
                private var minimumAmount: JsonField<String>? = null
                private var isInvoiceLevel: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(newMinimum: NewMinimum) = apply {
                    adjustmentType = newMinimum.adjustmentType
                    appliesToPriceIds = newMinimum.appliesToPriceIds.map { it.toMutableList() }
                    itemId = newMinimum.itemId
                    minimumAmount = newMinimum.minimumAmount
                    isInvoiceLevel = newMinimum.isInvoiceLevel
                    additionalProperties = newMinimum.additionalProperties.toMutableMap()
                }

                fun adjustmentType(adjustmentType: AdjustmentType) =
                    adjustmentType(JsonField.of(adjustmentType))

                fun adjustmentType(adjustmentType: JsonField<AdjustmentType>) = apply {
                    this.adjustmentType = adjustmentType
                }

                /** The set of price IDs to which this adjustment applies. */
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /** The set of price IDs to which this adjustment applies. */
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
                }

                /** The set of price IDs to which this adjustment applies. */
                fun addAppliesToPriceId(appliesToPriceId: String) = apply {
                    appliesToPriceIds =
                        (appliesToPriceIds ?: JsonField.of(mutableListOf())).also {
                            checkKnown("appliesToPriceIds", it).add(appliesToPriceId)
                        }
                }

                /** The item ID that revenue from this minimum will be attributed to. */
                fun itemId(itemId: String) = itemId(JsonField.of(itemId))

                /** The item ID that revenue from this minimum will be attributed to. */
                fun itemId(itemId: JsonField<String>) = apply { this.itemId = itemId }

                fun minimumAmount(minimumAmount: String) =
                    minimumAmount(JsonField.of(minimumAmount))

                fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                    this.minimumAmount = minimumAmount
                }

                /**
                 * When false, this adjustment will be applied to a single price. Otherwise, it will
                 * be applied at the invoice level, possibly to multiple prices.
                 */
                fun isInvoiceLevel(isInvoiceLevel: Boolean) =
                    isInvoiceLevel(JsonField.of(isInvoiceLevel))

                /**
                 * When false, this adjustment will be applied to a single price. Otherwise, it will
                 * be applied at the invoice level, possibly to multiple prices.
                 */
                fun isInvoiceLevel(isInvoiceLevel: JsonField<Boolean>) = apply {
                    this.isInvoiceLevel = isInvoiceLevel
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

                fun build(): NewMinimum =
                    NewMinimum(
                        checkRequired("adjustmentType", adjustmentType),
                        checkRequired("appliesToPriceIds", appliesToPriceIds).map {
                            it.toImmutable()
                        },
                        checkRequired("itemId", itemId),
                        checkRequired("minimumAmount", minimumAmount),
                        isInvoiceLevel,
                        additionalProperties.toImmutable(),
                    )
            }

            class AdjustmentType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val MINIMUM = of("minimum")

                    fun of(value: String) = AdjustmentType(JsonField.of(value))
                }

                /** An enum containing [AdjustmentType]'s known values. */
                enum class Known {
                    MINIMUM
                }

                /**
                 * An enum containing [AdjustmentType]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [AdjustmentType] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    MINIMUM,
                    /**
                     * An enum member indicating that [AdjustmentType] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        MINIMUM -> Value.MINIMUM
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws OrbInvalidDataException if this class instance's value is a not a known
                 *   member.
                 */
                fun known(): Known =
                    when (this) {
                        MINIMUM -> Known.MINIMUM
                        else -> throw OrbInvalidDataException("Unknown AdjustmentType: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws OrbInvalidDataException if this class instance's value does not have the
                 *   expected primitive type.
                 */
                fun asString(): String =
                    _value().asString() ?: throw OrbInvalidDataException("Value is not a String")

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is AdjustmentType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is NewMinimum && adjustmentType == other.adjustmentType && appliesToPriceIds == other.appliesToPriceIds && itemId == other.itemId && minimumAmount == other.minimumAmount && isInvoiceLevel == other.isInvoiceLevel && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(adjustmentType, appliesToPriceIds, itemId, minimumAmount, isInvoiceLevel, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "NewMinimum{adjustmentType=$adjustmentType, appliesToPriceIds=$appliesToPriceIds, itemId=$itemId, minimumAmount=$minimumAmount, isInvoiceLevel=$isInvoiceLevel, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class NewMaximum
        @JsonCreator
        private constructor(
            @JsonProperty("adjustment_type")
            @ExcludeMissing
            private val adjustmentType: JsonField<AdjustmentType> = JsonMissing.of(),
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            private val appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("maximum_amount")
            @ExcludeMissing
            private val maximumAmount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("is_invoice_level")
            @ExcludeMissing
            private val isInvoiceLevel: JsonField<Boolean> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun adjustmentType(): AdjustmentType = adjustmentType.getRequired("adjustment_type")

            /** The set of price IDs to which this adjustment applies. */
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            fun maximumAmount(): String = maximumAmount.getRequired("maximum_amount")

            /**
             * When false, this adjustment will be applied to a single price. Otherwise, it will be
             * applied at the invoice level, possibly to multiple prices.
             */
            fun isInvoiceLevel(): Boolean? = isInvoiceLevel.getNullable("is_invoice_level")

            @JsonProperty("adjustment_type")
            @ExcludeMissing
            fun _adjustmentType(): JsonField<AdjustmentType> = adjustmentType

            /** The set of price IDs to which this adjustment applies. */
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

            @JsonProperty("maximum_amount")
            @ExcludeMissing
            fun _maximumAmount(): JsonField<String> = maximumAmount

            /**
             * When false, this adjustment will be applied to a single price. Otherwise, it will be
             * applied at the invoice level, possibly to multiple prices.
             */
            @JsonProperty("is_invoice_level")
            @ExcludeMissing
            fun _isInvoiceLevel(): JsonField<Boolean> = isInvoiceLevel

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): NewMaximum = apply {
                if (validated) {
                    return@apply
                }

                adjustmentType()
                appliesToPriceIds()
                maximumAmount()
                isInvoiceLevel()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [NewMaximum].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .adjustmentType()
                 * .appliesToPriceIds()
                 * .maximumAmount()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [NewMaximum]. */
            class Builder internal constructor() {

                private var adjustmentType: JsonField<AdjustmentType>? = null
                private var appliesToPriceIds: JsonField<MutableList<String>>? = null
                private var maximumAmount: JsonField<String>? = null
                private var isInvoiceLevel: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(newMaximum: NewMaximum) = apply {
                    adjustmentType = newMaximum.adjustmentType
                    appliesToPriceIds = newMaximum.appliesToPriceIds.map { it.toMutableList() }
                    maximumAmount = newMaximum.maximumAmount
                    isInvoiceLevel = newMaximum.isInvoiceLevel
                    additionalProperties = newMaximum.additionalProperties.toMutableMap()
                }

                fun adjustmentType(adjustmentType: AdjustmentType) =
                    adjustmentType(JsonField.of(adjustmentType))

                fun adjustmentType(adjustmentType: JsonField<AdjustmentType>) = apply {
                    this.adjustmentType = adjustmentType
                }

                /** The set of price IDs to which this adjustment applies. */
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /** The set of price IDs to which this adjustment applies. */
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
                }

                /** The set of price IDs to which this adjustment applies. */
                fun addAppliesToPriceId(appliesToPriceId: String) = apply {
                    appliesToPriceIds =
                        (appliesToPriceIds ?: JsonField.of(mutableListOf())).also {
                            checkKnown("appliesToPriceIds", it).add(appliesToPriceId)
                        }
                }

                fun maximumAmount(maximumAmount: String) =
                    maximumAmount(JsonField.of(maximumAmount))

                fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                    this.maximumAmount = maximumAmount
                }

                /**
                 * When false, this adjustment will be applied to a single price. Otherwise, it will
                 * be applied at the invoice level, possibly to multiple prices.
                 */
                fun isInvoiceLevel(isInvoiceLevel: Boolean) =
                    isInvoiceLevel(JsonField.of(isInvoiceLevel))

                /**
                 * When false, this adjustment will be applied to a single price. Otherwise, it will
                 * be applied at the invoice level, possibly to multiple prices.
                 */
                fun isInvoiceLevel(isInvoiceLevel: JsonField<Boolean>) = apply {
                    this.isInvoiceLevel = isInvoiceLevel
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

                fun build(): NewMaximum =
                    NewMaximum(
                        checkRequired("adjustmentType", adjustmentType),
                        checkRequired("appliesToPriceIds", appliesToPriceIds).map {
                            it.toImmutable()
                        },
                        checkRequired("maximumAmount", maximumAmount),
                        isInvoiceLevel,
                        additionalProperties.toImmutable(),
                    )
            }

            class AdjustmentType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val MAXIMUM = of("maximum")

                    fun of(value: String) = AdjustmentType(JsonField.of(value))
                }

                /** An enum containing [AdjustmentType]'s known values. */
                enum class Known {
                    MAXIMUM
                }

                /**
                 * An enum containing [AdjustmentType]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [AdjustmentType] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    MAXIMUM,
                    /**
                     * An enum member indicating that [AdjustmentType] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        MAXIMUM -> Value.MAXIMUM
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws OrbInvalidDataException if this class instance's value is a not a known
                 *   member.
                 */
                fun known(): Known =
                    when (this) {
                        MAXIMUM -> Known.MAXIMUM
                        else -> throw OrbInvalidDataException("Unknown AdjustmentType: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws OrbInvalidDataException if this class instance's value does not have the
                 *   expected primitive type.
                 */
                fun asString(): String =
                    _value().asString() ?: throw OrbInvalidDataException("Value is not a String")

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is AdjustmentType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is NewMaximum && adjustmentType == other.adjustmentType && appliesToPriceIds == other.appliesToPriceIds && maximumAmount == other.maximumAmount && isInvoiceLevel == other.isInvoiceLevel && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(adjustmentType, appliesToPriceIds, maximumAmount, isInvoiceLevel, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "NewMaximum{adjustmentType=$adjustmentType, appliesToPriceIds=$appliesToPriceIds, maximumAmount=$maximumAmount, isInvoiceLevel=$isInvoiceLevel, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AddSubscriptionAdjustmentParams && adjustment == other.adjustment && endDate == other.endDate && planPhaseOrder == other.planPhaseOrder && startDate == other.startDate && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(adjustment, endDate, planPhaseOrder, startDate, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AddSubscriptionAdjustmentParams{adjustment=$adjustment, endDate=$endDate, planPhaseOrder=$planPhaseOrder, startDate=$startDate, additionalProperties=$additionalProperties}"
}
