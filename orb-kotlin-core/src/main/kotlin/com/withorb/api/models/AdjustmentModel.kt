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
import java.util.Objects

@JsonDeserialize(using = AdjustmentModel.Deserializer::class)
@JsonSerialize(using = AdjustmentModel.Serializer::class)
class AdjustmentModel
private constructor(
    private val planPhaseUsageDiscountAdjustment: PlanPhaseUsageDiscountAdjustment? = null,
    private val planPhaseAmountDiscountAdjustment: PlanPhaseAmountDiscountAdjustment? = null,
    private val planPhasePercentageDiscountAdjustment: PlanPhasePercentageDiscountAdjustment? =
        null,
    private val planPhaseMinimumAdjustment: PlanPhaseMinimumAdjustment? = null,
    private val planPhaseMaximumAdjustment: PlanPhaseMaximumAdjustment? = null,
    private val _json: JsonValue? = null,
) {

    fun planPhaseUsageDiscountAdjustment(): PlanPhaseUsageDiscountAdjustment? =
        planPhaseUsageDiscountAdjustment

    fun planPhaseAmountDiscountAdjustment(): PlanPhaseAmountDiscountAdjustment? =
        planPhaseAmountDiscountAdjustment

    fun planPhasePercentageDiscountAdjustment(): PlanPhasePercentageDiscountAdjustment? =
        planPhasePercentageDiscountAdjustment

    fun planPhaseMinimumAdjustment(): PlanPhaseMinimumAdjustment? = planPhaseMinimumAdjustment

    fun planPhaseMaximumAdjustment(): PlanPhaseMaximumAdjustment? = planPhaseMaximumAdjustment

    fun isPlanPhaseUsageDiscountAdjustment(): Boolean = planPhaseUsageDiscountAdjustment != null

    fun isPlanPhaseAmountDiscountAdjustment(): Boolean = planPhaseAmountDiscountAdjustment != null

    fun isPlanPhasePercentageDiscountAdjustment(): Boolean =
        planPhasePercentageDiscountAdjustment != null

    fun isPlanPhaseMinimumAdjustment(): Boolean = planPhaseMinimumAdjustment != null

    fun isPlanPhaseMaximumAdjustment(): Boolean = planPhaseMaximumAdjustment != null

    fun asPlanPhaseUsageDiscountAdjustment(): PlanPhaseUsageDiscountAdjustment =
        planPhaseUsageDiscountAdjustment.getOrThrow("planPhaseUsageDiscountAdjustment")

    fun asPlanPhaseAmountDiscountAdjustment(): PlanPhaseAmountDiscountAdjustment =
        planPhaseAmountDiscountAdjustment.getOrThrow("planPhaseAmountDiscountAdjustment")

    fun asPlanPhasePercentageDiscountAdjustment(): PlanPhasePercentageDiscountAdjustment =
        planPhasePercentageDiscountAdjustment.getOrThrow("planPhasePercentageDiscountAdjustment")

    fun asPlanPhaseMinimumAdjustment(): PlanPhaseMinimumAdjustment =
        planPhaseMinimumAdjustment.getOrThrow("planPhaseMinimumAdjustment")

    fun asPlanPhaseMaximumAdjustment(): PlanPhaseMaximumAdjustment =
        planPhaseMaximumAdjustment.getOrThrow("planPhaseMaximumAdjustment")

    fun _json(): JsonValue? = _json

    fun <T> accept(visitor: Visitor<T>): T {
        return when {
            planPhaseUsageDiscountAdjustment != null ->
                visitor.visitPlanPhaseUsageDiscountAdjustment(planPhaseUsageDiscountAdjustment)
            planPhaseAmountDiscountAdjustment != null ->
                visitor.visitPlanPhaseAmountDiscountAdjustment(planPhaseAmountDiscountAdjustment)
            planPhasePercentageDiscountAdjustment != null ->
                visitor.visitPlanPhasePercentageDiscountAdjustment(
                    planPhasePercentageDiscountAdjustment
                )
            planPhaseMinimumAdjustment != null ->
                visitor.visitPlanPhaseMinimumAdjustment(planPhaseMinimumAdjustment)
            planPhaseMaximumAdjustment != null ->
                visitor.visitPlanPhaseMaximumAdjustment(planPhaseMaximumAdjustment)
            else -> visitor.unknown(_json)
        }
    }

    private var validated: Boolean = false

    fun validate(): AdjustmentModel = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitPlanPhaseUsageDiscountAdjustment(
                    planPhaseUsageDiscountAdjustment: PlanPhaseUsageDiscountAdjustment
                ) {
                    planPhaseUsageDiscountAdjustment.validate()
                }

                override fun visitPlanPhaseAmountDiscountAdjustment(
                    planPhaseAmountDiscountAdjustment: PlanPhaseAmountDiscountAdjustment
                ) {
                    planPhaseAmountDiscountAdjustment.validate()
                }

                override fun visitPlanPhasePercentageDiscountAdjustment(
                    planPhasePercentageDiscountAdjustment: PlanPhasePercentageDiscountAdjustment
                ) {
                    planPhasePercentageDiscountAdjustment.validate()
                }

                override fun visitPlanPhaseMinimumAdjustment(
                    planPhaseMinimumAdjustment: PlanPhaseMinimumAdjustment
                ) {
                    planPhaseMinimumAdjustment.validate()
                }

                override fun visitPlanPhaseMaximumAdjustment(
                    planPhaseMaximumAdjustment: PlanPhaseMaximumAdjustment
                ) {
                    planPhaseMaximumAdjustment.validate()
                }
            }
        )
        validated = true
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AdjustmentModel && planPhaseUsageDiscountAdjustment == other.planPhaseUsageDiscountAdjustment && planPhaseAmountDiscountAdjustment == other.planPhaseAmountDiscountAdjustment && planPhasePercentageDiscountAdjustment == other.planPhasePercentageDiscountAdjustment && planPhaseMinimumAdjustment == other.planPhaseMinimumAdjustment && planPhaseMaximumAdjustment == other.planPhaseMaximumAdjustment /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(planPhaseUsageDiscountAdjustment, planPhaseAmountDiscountAdjustment, planPhasePercentageDiscountAdjustment, planPhaseMinimumAdjustment, planPhaseMaximumAdjustment) /* spotless:on */

    override fun toString(): String =
        when {
            planPhaseUsageDiscountAdjustment != null ->
                "AdjustmentModel{planPhaseUsageDiscountAdjustment=$planPhaseUsageDiscountAdjustment}"
            planPhaseAmountDiscountAdjustment != null ->
                "AdjustmentModel{planPhaseAmountDiscountAdjustment=$planPhaseAmountDiscountAdjustment}"
            planPhasePercentageDiscountAdjustment != null ->
                "AdjustmentModel{planPhasePercentageDiscountAdjustment=$planPhasePercentageDiscountAdjustment}"
            planPhaseMinimumAdjustment != null ->
                "AdjustmentModel{planPhaseMinimumAdjustment=$planPhaseMinimumAdjustment}"
            planPhaseMaximumAdjustment != null ->
                "AdjustmentModel{planPhaseMaximumAdjustment=$planPhaseMaximumAdjustment}"
            _json != null -> "AdjustmentModel{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid AdjustmentModel")
        }

    companion object {

        fun ofPlanPhaseUsageDiscountAdjustment(
            planPhaseUsageDiscountAdjustment: PlanPhaseUsageDiscountAdjustment
        ) = AdjustmentModel(planPhaseUsageDiscountAdjustment = planPhaseUsageDiscountAdjustment)

        fun ofPlanPhaseAmountDiscountAdjustment(
            planPhaseAmountDiscountAdjustment: PlanPhaseAmountDiscountAdjustment
        ) = AdjustmentModel(planPhaseAmountDiscountAdjustment = planPhaseAmountDiscountAdjustment)

        fun ofPlanPhasePercentageDiscountAdjustment(
            planPhasePercentageDiscountAdjustment: PlanPhasePercentageDiscountAdjustment
        ) =
            AdjustmentModel(
                planPhasePercentageDiscountAdjustment = planPhasePercentageDiscountAdjustment
            )

        fun ofPlanPhaseMinimumAdjustment(planPhaseMinimumAdjustment: PlanPhaseMinimumAdjustment) =
            AdjustmentModel(planPhaseMinimumAdjustment = planPhaseMinimumAdjustment)

        fun ofPlanPhaseMaximumAdjustment(planPhaseMaximumAdjustment: PlanPhaseMaximumAdjustment) =
            AdjustmentModel(planPhaseMaximumAdjustment = planPhaseMaximumAdjustment)
    }

    /**
     * An interface that defines how to map each variant of [AdjustmentModel] to a value of type
     * [T].
     */
    interface Visitor<out T> {

        fun visitPlanPhaseUsageDiscountAdjustment(
            planPhaseUsageDiscountAdjustment: PlanPhaseUsageDiscountAdjustment
        ): T

        fun visitPlanPhaseAmountDiscountAdjustment(
            planPhaseAmountDiscountAdjustment: PlanPhaseAmountDiscountAdjustment
        ): T

        fun visitPlanPhasePercentageDiscountAdjustment(
            planPhasePercentageDiscountAdjustment: PlanPhasePercentageDiscountAdjustment
        ): T

        fun visitPlanPhaseMinimumAdjustment(
            planPhaseMinimumAdjustment: PlanPhaseMinimumAdjustment
        ): T

        fun visitPlanPhaseMaximumAdjustment(
            planPhaseMaximumAdjustment: PlanPhaseMaximumAdjustment
        ): T

        /**
         * Maps an unknown variant of [AdjustmentModel] to a value of type [T].
         *
         * An instance of [AdjustmentModel] can contain an unknown variant if it was deserialized
         * from data that doesn't match any known variant. For example, if the SDK is on an older
         * version than the API, then the API may respond with new variants that the SDK is unaware
         * of.
         *
         * @throws OrbInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw OrbInvalidDataException("Unknown AdjustmentModel: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<AdjustmentModel>(AdjustmentModel::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): AdjustmentModel {
            val json = JsonValue.fromJsonNode(node)
            val adjustmentType = json.asObject()?.get("adjustment_type")?.asString()

            when (adjustmentType) {
                "usage_discount" -> {
                    tryDeserialize(node, jacksonTypeRef<PlanPhaseUsageDiscountAdjustment>()) {
                            it.validate()
                        }
                        ?.let {
                            return AdjustmentModel(
                                planPhaseUsageDiscountAdjustment = it,
                                _json = json,
                            )
                        }
                }
                "amount_discount" -> {
                    tryDeserialize(node, jacksonTypeRef<PlanPhaseAmountDiscountAdjustment>()) {
                            it.validate()
                        }
                        ?.let {
                            return AdjustmentModel(
                                planPhaseAmountDiscountAdjustment = it,
                                _json = json,
                            )
                        }
                }
                "percentage_discount" -> {
                    tryDeserialize(node, jacksonTypeRef<PlanPhasePercentageDiscountAdjustment>()) {
                            it.validate()
                        }
                        ?.let {
                            return AdjustmentModel(
                                planPhasePercentageDiscountAdjustment = it,
                                _json = json,
                            )
                        }
                }
                "minimum" -> {
                    tryDeserialize(node, jacksonTypeRef<PlanPhaseMinimumAdjustment>()) {
                            it.validate()
                        }
                        ?.let {
                            return AdjustmentModel(planPhaseMinimumAdjustment = it, _json = json)
                        }
                }
                "maximum" -> {
                    tryDeserialize(node, jacksonTypeRef<PlanPhaseMaximumAdjustment>()) {
                            it.validate()
                        }
                        ?.let {
                            return AdjustmentModel(planPhaseMaximumAdjustment = it, _json = json)
                        }
                }
            }

            return AdjustmentModel(_json = json)
        }
    }

    internal class Serializer : BaseSerializer<AdjustmentModel>(AdjustmentModel::class) {

        override fun serialize(
            value: AdjustmentModel,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.planPhaseUsageDiscountAdjustment != null ->
                    generator.writeObject(value.planPhaseUsageDiscountAdjustment)
                value.planPhaseAmountDiscountAdjustment != null ->
                    generator.writeObject(value.planPhaseAmountDiscountAdjustment)
                value.planPhasePercentageDiscountAdjustment != null ->
                    generator.writeObject(value.planPhasePercentageDiscountAdjustment)
                value.planPhaseMinimumAdjustment != null ->
                    generator.writeObject(value.planPhaseMinimumAdjustment)
                value.planPhaseMaximumAdjustment != null ->
                    generator.writeObject(value.planPhaseMaximumAdjustment)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid AdjustmentModel")
            }
        }
    }

    @NoAutoDetect
    class PlanPhaseUsageDiscountAdjustment
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("adjustment_type")
        @ExcludeMissing
        private val adjustmentType: JsonField<AdjustmentType> = JsonMissing.of(),
        @JsonProperty("applies_to_price_ids")
        @ExcludeMissing
        private val appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("is_invoice_level")
        @ExcludeMissing
        private val isInvoiceLevel: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("plan_phase_order")
        @ExcludeMissing
        private val planPhaseOrder: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("reason")
        @ExcludeMissing
        private val reason: JsonField<String> = JsonMissing.of(),
        @JsonProperty("usage_discount")
        @ExcludeMissing
        private val usageDiscount: JsonField<Double> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun id(): String = id.getRequired("id")

        fun adjustmentType(): AdjustmentType = adjustmentType.getRequired("adjustment_type")

        /** The price IDs that this adjustment applies to. */
        fun appliesToPriceIds(): List<String> =
            appliesToPriceIds.getRequired("applies_to_price_ids")

        /**
         * True for adjustments that apply to an entire invocice, false for adjustments that apply
         * to only one price.
         */
        fun isInvoiceLevel(): Boolean = isInvoiceLevel.getRequired("is_invoice_level")

        /** The plan phase in which this adjustment is active. */
        fun planPhaseOrder(): Long? = planPhaseOrder.getNullable("plan_phase_order")

        /** The reason for the adjustment. */
        fun reason(): String? = reason.getNullable("reason")

        /**
         * The number of usage units by which to discount the price this adjustment applies to in a
         * given billing period.
         */
        fun usageDiscount(): Double = usageDiscount.getRequired("usage_discount")

        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        @JsonProperty("adjustment_type")
        @ExcludeMissing
        fun _adjustmentType(): JsonField<AdjustmentType> = adjustmentType

        /** The price IDs that this adjustment applies to. */
        @JsonProperty("applies_to_price_ids")
        @ExcludeMissing
        fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

        /**
         * True for adjustments that apply to an entire invocice, false for adjustments that apply
         * to only one price.
         */
        @JsonProperty("is_invoice_level")
        @ExcludeMissing
        fun _isInvoiceLevel(): JsonField<Boolean> = isInvoiceLevel

        /** The plan phase in which this adjustment is active. */
        @JsonProperty("plan_phase_order")
        @ExcludeMissing
        fun _planPhaseOrder(): JsonField<Long> = planPhaseOrder

        /** The reason for the adjustment. */
        @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

        /**
         * The number of usage units by which to discount the price this adjustment applies to in a
         * given billing period.
         */
        @JsonProperty("usage_discount")
        @ExcludeMissing
        fun _usageDiscount(): JsonField<Double> = usageDiscount

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): PlanPhaseUsageDiscountAdjustment = apply {
            if (validated) {
                return@apply
            }

            id()
            adjustmentType()
            appliesToPriceIds()
            isInvoiceLevel()
            planPhaseOrder()
            reason()
            usageDiscount()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of
             * [PlanPhaseUsageDiscountAdjustment].
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .adjustmentType()
             * .appliesToPriceIds()
             * .isInvoiceLevel()
             * .planPhaseOrder()
             * .reason()
             * .usageDiscount()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [PlanPhaseUsageDiscountAdjustment]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var adjustmentType: JsonField<AdjustmentType>? = null
            private var appliesToPriceIds: JsonField<MutableList<String>>? = null
            private var isInvoiceLevel: JsonField<Boolean>? = null
            private var planPhaseOrder: JsonField<Long>? = null
            private var reason: JsonField<String>? = null
            private var usageDiscount: JsonField<Double>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(planPhaseUsageDiscountAdjustment: PlanPhaseUsageDiscountAdjustment) =
                apply {
                    id = planPhaseUsageDiscountAdjustment.id
                    adjustmentType = planPhaseUsageDiscountAdjustment.adjustmentType
                    appliesToPriceIds =
                        planPhaseUsageDiscountAdjustment.appliesToPriceIds.map {
                            it.toMutableList()
                        }
                    isInvoiceLevel = planPhaseUsageDiscountAdjustment.isInvoiceLevel
                    planPhaseOrder = planPhaseUsageDiscountAdjustment.planPhaseOrder
                    reason = planPhaseUsageDiscountAdjustment.reason
                    usageDiscount = planPhaseUsageDiscountAdjustment.usageDiscount
                    additionalProperties =
                        planPhaseUsageDiscountAdjustment.additionalProperties.toMutableMap()
                }

            fun id(id: String) = id(JsonField.of(id))

            fun id(id: JsonField<String>) = apply { this.id = id }

            fun adjustmentType(adjustmentType: AdjustmentType) =
                adjustmentType(JsonField.of(adjustmentType))

            fun adjustmentType(adjustmentType: JsonField<AdjustmentType>) = apply {
                this.adjustmentType = adjustmentType
            }

            /** The price IDs that this adjustment applies to. */
            fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                appliesToPriceIds(JsonField.of(appliesToPriceIds))

            /** The price IDs that this adjustment applies to. */
            fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
            }

            /** The price IDs that this adjustment applies to. */
            fun addAppliesToPriceId(appliesToPriceId: String) = apply {
                appliesToPriceIds =
                    (appliesToPriceIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("appliesToPriceIds", it).add(appliesToPriceId)
                    }
            }

            /**
             * True for adjustments that apply to an entire invocice, false for adjustments that
             * apply to only one price.
             */
            fun isInvoiceLevel(isInvoiceLevel: Boolean) =
                isInvoiceLevel(JsonField.of(isInvoiceLevel))

            /**
             * True for adjustments that apply to an entire invocice, false for adjustments that
             * apply to only one price.
             */
            fun isInvoiceLevel(isInvoiceLevel: JsonField<Boolean>) = apply {
                this.isInvoiceLevel = isInvoiceLevel
            }

            /** The plan phase in which this adjustment is active. */
            fun planPhaseOrder(planPhaseOrder: Long?) =
                planPhaseOrder(JsonField.ofNullable(planPhaseOrder))

            /** The plan phase in which this adjustment is active. */
            fun planPhaseOrder(planPhaseOrder: Long) = planPhaseOrder(planPhaseOrder as Long?)

            /** The plan phase in which this adjustment is active. */
            fun planPhaseOrder(planPhaseOrder: JsonField<Long>) = apply {
                this.planPhaseOrder = planPhaseOrder
            }

            /** The reason for the adjustment. */
            fun reason(reason: String?) = reason(JsonField.ofNullable(reason))

            /** The reason for the adjustment. */
            fun reason(reason: JsonField<String>) = apply { this.reason = reason }

            /**
             * The number of usage units by which to discount the price this adjustment applies to
             * in a given billing period.
             */
            fun usageDiscount(usageDiscount: Double) = usageDiscount(JsonField.of(usageDiscount))

            /**
             * The number of usage units by which to discount the price this adjustment applies to
             * in a given billing period.
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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): PlanPhaseUsageDiscountAdjustment =
                PlanPhaseUsageDiscountAdjustment(
                    checkRequired("id", id),
                    checkRequired("adjustmentType", adjustmentType),
                    checkRequired("appliesToPriceIds", appliesToPriceIds).map { it.toImmutable() },
                    checkRequired("isInvoiceLevel", isInvoiceLevel),
                    checkRequired("planPhaseOrder", planPhaseOrder),
                    checkRequired("reason", reason),
                    checkRequired("usageDiscount", usageDiscount),
                    additionalProperties.toImmutable(),
                )
        }

        class AdjustmentType
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
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
             * An enum containing [AdjustmentType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [AdjustmentType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                USAGE_DISCOUNT,
                /**
                 * An enum member indicating that [AdjustmentType] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
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

            return /* spotless:off */ other is PlanPhaseUsageDiscountAdjustment && id == other.id && adjustmentType == other.adjustmentType && appliesToPriceIds == other.appliesToPriceIds && isInvoiceLevel == other.isInvoiceLevel && planPhaseOrder == other.planPhaseOrder && reason == other.reason && usageDiscount == other.usageDiscount && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, adjustmentType, appliesToPriceIds, isInvoiceLevel, planPhaseOrder, reason, usageDiscount, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PlanPhaseUsageDiscountAdjustment{id=$id, adjustmentType=$adjustmentType, appliesToPriceIds=$appliesToPriceIds, isInvoiceLevel=$isInvoiceLevel, planPhaseOrder=$planPhaseOrder, reason=$reason, usageDiscount=$usageDiscount, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class PlanPhaseAmountDiscountAdjustment
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
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
        @JsonProperty("plan_phase_order")
        @ExcludeMissing
        private val planPhaseOrder: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("reason")
        @ExcludeMissing
        private val reason: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun id(): String = id.getRequired("id")

        fun adjustmentType(): AdjustmentType = adjustmentType.getRequired("adjustment_type")

        /**
         * The amount by which to discount the prices this adjustment applies to in a given billing
         * period.
         */
        fun amountDiscount(): String = amountDiscount.getRequired("amount_discount")

        /** The price IDs that this adjustment applies to. */
        fun appliesToPriceIds(): List<String> =
            appliesToPriceIds.getRequired("applies_to_price_ids")

        /**
         * True for adjustments that apply to an entire invocice, false for adjustments that apply
         * to only one price.
         */
        fun isInvoiceLevel(): Boolean = isInvoiceLevel.getRequired("is_invoice_level")

        /** The plan phase in which this adjustment is active. */
        fun planPhaseOrder(): Long? = planPhaseOrder.getNullable("plan_phase_order")

        /** The reason for the adjustment. */
        fun reason(): String? = reason.getNullable("reason")

        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        @JsonProperty("adjustment_type")
        @ExcludeMissing
        fun _adjustmentType(): JsonField<AdjustmentType> = adjustmentType

        /**
         * The amount by which to discount the prices this adjustment applies to in a given billing
         * period.
         */
        @JsonProperty("amount_discount")
        @ExcludeMissing
        fun _amountDiscount(): JsonField<String> = amountDiscount

        /** The price IDs that this adjustment applies to. */
        @JsonProperty("applies_to_price_ids")
        @ExcludeMissing
        fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

        /**
         * True for adjustments that apply to an entire invocice, false for adjustments that apply
         * to only one price.
         */
        @JsonProperty("is_invoice_level")
        @ExcludeMissing
        fun _isInvoiceLevel(): JsonField<Boolean> = isInvoiceLevel

        /** The plan phase in which this adjustment is active. */
        @JsonProperty("plan_phase_order")
        @ExcludeMissing
        fun _planPhaseOrder(): JsonField<Long> = planPhaseOrder

        /** The reason for the adjustment. */
        @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): PlanPhaseAmountDiscountAdjustment = apply {
            if (validated) {
                return@apply
            }

            id()
            adjustmentType()
            amountDiscount()
            appliesToPriceIds()
            isInvoiceLevel()
            planPhaseOrder()
            reason()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of
             * [PlanPhaseAmountDiscountAdjustment].
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .adjustmentType()
             * .amountDiscount()
             * .appliesToPriceIds()
             * .isInvoiceLevel()
             * .planPhaseOrder()
             * .reason()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [PlanPhaseAmountDiscountAdjustment]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var adjustmentType: JsonField<AdjustmentType>? = null
            private var amountDiscount: JsonField<String>? = null
            private var appliesToPriceIds: JsonField<MutableList<String>>? = null
            private var isInvoiceLevel: JsonField<Boolean>? = null
            private var planPhaseOrder: JsonField<Long>? = null
            private var reason: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                planPhaseAmountDiscountAdjustment: PlanPhaseAmountDiscountAdjustment
            ) = apply {
                id = planPhaseAmountDiscountAdjustment.id
                adjustmentType = planPhaseAmountDiscountAdjustment.adjustmentType
                amountDiscount = planPhaseAmountDiscountAdjustment.amountDiscount
                appliesToPriceIds =
                    planPhaseAmountDiscountAdjustment.appliesToPriceIds.map { it.toMutableList() }
                isInvoiceLevel = planPhaseAmountDiscountAdjustment.isInvoiceLevel
                planPhaseOrder = planPhaseAmountDiscountAdjustment.planPhaseOrder
                reason = planPhaseAmountDiscountAdjustment.reason
                additionalProperties =
                    planPhaseAmountDiscountAdjustment.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            fun id(id: JsonField<String>) = apply { this.id = id }

            fun adjustmentType(adjustmentType: AdjustmentType) =
                adjustmentType(JsonField.of(adjustmentType))

            fun adjustmentType(adjustmentType: JsonField<AdjustmentType>) = apply {
                this.adjustmentType = adjustmentType
            }

            /**
             * The amount by which to discount the prices this adjustment applies to in a given
             * billing period.
             */
            fun amountDiscount(amountDiscount: String) =
                amountDiscount(JsonField.of(amountDiscount))

            /**
             * The amount by which to discount the prices this adjustment applies to in a given
             * billing period.
             */
            fun amountDiscount(amountDiscount: JsonField<String>) = apply {
                this.amountDiscount = amountDiscount
            }

            /** The price IDs that this adjustment applies to. */
            fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                appliesToPriceIds(JsonField.of(appliesToPriceIds))

            /** The price IDs that this adjustment applies to. */
            fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
            }

            /** The price IDs that this adjustment applies to. */
            fun addAppliesToPriceId(appliesToPriceId: String) = apply {
                appliesToPriceIds =
                    (appliesToPriceIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("appliesToPriceIds", it).add(appliesToPriceId)
                    }
            }

            /**
             * True for adjustments that apply to an entire invocice, false for adjustments that
             * apply to only one price.
             */
            fun isInvoiceLevel(isInvoiceLevel: Boolean) =
                isInvoiceLevel(JsonField.of(isInvoiceLevel))

            /**
             * True for adjustments that apply to an entire invocice, false for adjustments that
             * apply to only one price.
             */
            fun isInvoiceLevel(isInvoiceLevel: JsonField<Boolean>) = apply {
                this.isInvoiceLevel = isInvoiceLevel
            }

            /** The plan phase in which this adjustment is active. */
            fun planPhaseOrder(planPhaseOrder: Long?) =
                planPhaseOrder(JsonField.ofNullable(planPhaseOrder))

            /** The plan phase in which this adjustment is active. */
            fun planPhaseOrder(planPhaseOrder: Long) = planPhaseOrder(planPhaseOrder as Long?)

            /** The plan phase in which this adjustment is active. */
            fun planPhaseOrder(planPhaseOrder: JsonField<Long>) = apply {
                this.planPhaseOrder = planPhaseOrder
            }

            /** The reason for the adjustment. */
            fun reason(reason: String?) = reason(JsonField.ofNullable(reason))

            /** The reason for the adjustment. */
            fun reason(reason: JsonField<String>) = apply { this.reason = reason }

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

            fun build(): PlanPhaseAmountDiscountAdjustment =
                PlanPhaseAmountDiscountAdjustment(
                    checkRequired("id", id),
                    checkRequired("adjustmentType", adjustmentType),
                    checkRequired("amountDiscount", amountDiscount),
                    checkRequired("appliesToPriceIds", appliesToPriceIds).map { it.toImmutable() },
                    checkRequired("isInvoiceLevel", isInvoiceLevel),
                    checkRequired("planPhaseOrder", planPhaseOrder),
                    checkRequired("reason", reason),
                    additionalProperties.toImmutable(),
                )
        }

        class AdjustmentType
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
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
             * An enum containing [AdjustmentType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [AdjustmentType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                AMOUNT_DISCOUNT,
                /**
                 * An enum member indicating that [AdjustmentType] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
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

            return /* spotless:off */ other is PlanPhaseAmountDiscountAdjustment && id == other.id && adjustmentType == other.adjustmentType && amountDiscount == other.amountDiscount && appliesToPriceIds == other.appliesToPriceIds && isInvoiceLevel == other.isInvoiceLevel && planPhaseOrder == other.planPhaseOrder && reason == other.reason && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, adjustmentType, amountDiscount, appliesToPriceIds, isInvoiceLevel, planPhaseOrder, reason, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PlanPhaseAmountDiscountAdjustment{id=$id, adjustmentType=$adjustmentType, amountDiscount=$amountDiscount, appliesToPriceIds=$appliesToPriceIds, isInvoiceLevel=$isInvoiceLevel, planPhaseOrder=$planPhaseOrder, reason=$reason, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class PlanPhasePercentageDiscountAdjustment
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("adjustment_type")
        @ExcludeMissing
        private val adjustmentType: JsonField<AdjustmentType> = JsonMissing.of(),
        @JsonProperty("applies_to_price_ids")
        @ExcludeMissing
        private val appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("is_invoice_level")
        @ExcludeMissing
        private val isInvoiceLevel: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("percentage_discount")
        @ExcludeMissing
        private val percentageDiscount: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("plan_phase_order")
        @ExcludeMissing
        private val planPhaseOrder: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("reason")
        @ExcludeMissing
        private val reason: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun id(): String = id.getRequired("id")

        fun adjustmentType(): AdjustmentType = adjustmentType.getRequired("adjustment_type")

        /** The price IDs that this adjustment applies to. */
        fun appliesToPriceIds(): List<String> =
            appliesToPriceIds.getRequired("applies_to_price_ids")

        /**
         * True for adjustments that apply to an entire invocice, false for adjustments that apply
         * to only one price.
         */
        fun isInvoiceLevel(): Boolean = isInvoiceLevel.getRequired("is_invoice_level")

        /**
         * The percentage (as a value between 0 and 1) by which to discount the price intervals this
         * adjustment applies to in a given billing period.
         */
        fun percentageDiscount(): Double = percentageDiscount.getRequired("percentage_discount")

        /** The plan phase in which this adjustment is active. */
        fun planPhaseOrder(): Long? = planPhaseOrder.getNullable("plan_phase_order")

        /** The reason for the adjustment. */
        fun reason(): String? = reason.getNullable("reason")

        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        @JsonProperty("adjustment_type")
        @ExcludeMissing
        fun _adjustmentType(): JsonField<AdjustmentType> = adjustmentType

        /** The price IDs that this adjustment applies to. */
        @JsonProperty("applies_to_price_ids")
        @ExcludeMissing
        fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

        /**
         * True for adjustments that apply to an entire invocice, false for adjustments that apply
         * to only one price.
         */
        @JsonProperty("is_invoice_level")
        @ExcludeMissing
        fun _isInvoiceLevel(): JsonField<Boolean> = isInvoiceLevel

        /**
         * The percentage (as a value between 0 and 1) by which to discount the price intervals this
         * adjustment applies to in a given billing period.
         */
        @JsonProperty("percentage_discount")
        @ExcludeMissing
        fun _percentageDiscount(): JsonField<Double> = percentageDiscount

        /** The plan phase in which this adjustment is active. */
        @JsonProperty("plan_phase_order")
        @ExcludeMissing
        fun _planPhaseOrder(): JsonField<Long> = planPhaseOrder

        /** The reason for the adjustment. */
        @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): PlanPhasePercentageDiscountAdjustment = apply {
            if (validated) {
                return@apply
            }

            id()
            adjustmentType()
            appliesToPriceIds()
            isInvoiceLevel()
            percentageDiscount()
            planPhaseOrder()
            reason()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of
             * [PlanPhasePercentageDiscountAdjustment].
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .adjustmentType()
             * .appliesToPriceIds()
             * .isInvoiceLevel()
             * .percentageDiscount()
             * .planPhaseOrder()
             * .reason()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [PlanPhasePercentageDiscountAdjustment]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var adjustmentType: JsonField<AdjustmentType>? = null
            private var appliesToPriceIds: JsonField<MutableList<String>>? = null
            private var isInvoiceLevel: JsonField<Boolean>? = null
            private var percentageDiscount: JsonField<Double>? = null
            private var planPhaseOrder: JsonField<Long>? = null
            private var reason: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                planPhasePercentageDiscountAdjustment: PlanPhasePercentageDiscountAdjustment
            ) = apply {
                id = planPhasePercentageDiscountAdjustment.id
                adjustmentType = planPhasePercentageDiscountAdjustment.adjustmentType
                appliesToPriceIds =
                    planPhasePercentageDiscountAdjustment.appliesToPriceIds.map {
                        it.toMutableList()
                    }
                isInvoiceLevel = planPhasePercentageDiscountAdjustment.isInvoiceLevel
                percentageDiscount = planPhasePercentageDiscountAdjustment.percentageDiscount
                planPhaseOrder = planPhasePercentageDiscountAdjustment.planPhaseOrder
                reason = planPhasePercentageDiscountAdjustment.reason
                additionalProperties =
                    planPhasePercentageDiscountAdjustment.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            fun id(id: JsonField<String>) = apply { this.id = id }

            fun adjustmentType(adjustmentType: AdjustmentType) =
                adjustmentType(JsonField.of(adjustmentType))

            fun adjustmentType(adjustmentType: JsonField<AdjustmentType>) = apply {
                this.adjustmentType = adjustmentType
            }

            /** The price IDs that this adjustment applies to. */
            fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                appliesToPriceIds(JsonField.of(appliesToPriceIds))

            /** The price IDs that this adjustment applies to. */
            fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
            }

            /** The price IDs that this adjustment applies to. */
            fun addAppliesToPriceId(appliesToPriceId: String) = apply {
                appliesToPriceIds =
                    (appliesToPriceIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("appliesToPriceIds", it).add(appliesToPriceId)
                    }
            }

            /**
             * True for adjustments that apply to an entire invocice, false for adjustments that
             * apply to only one price.
             */
            fun isInvoiceLevel(isInvoiceLevel: Boolean) =
                isInvoiceLevel(JsonField.of(isInvoiceLevel))

            /**
             * True for adjustments that apply to an entire invocice, false for adjustments that
             * apply to only one price.
             */
            fun isInvoiceLevel(isInvoiceLevel: JsonField<Boolean>) = apply {
                this.isInvoiceLevel = isInvoiceLevel
            }

            /**
             * The percentage (as a value between 0 and 1) by which to discount the price intervals
             * this adjustment applies to in a given billing period.
             */
            fun percentageDiscount(percentageDiscount: Double) =
                percentageDiscount(JsonField.of(percentageDiscount))

            /**
             * The percentage (as a value between 0 and 1) by which to discount the price intervals
             * this adjustment applies to in a given billing period.
             */
            fun percentageDiscount(percentageDiscount: JsonField<Double>) = apply {
                this.percentageDiscount = percentageDiscount
            }

            /** The plan phase in which this adjustment is active. */
            fun planPhaseOrder(planPhaseOrder: Long?) =
                planPhaseOrder(JsonField.ofNullable(planPhaseOrder))

            /** The plan phase in which this adjustment is active. */
            fun planPhaseOrder(planPhaseOrder: Long) = planPhaseOrder(planPhaseOrder as Long?)

            /** The plan phase in which this adjustment is active. */
            fun planPhaseOrder(planPhaseOrder: JsonField<Long>) = apply {
                this.planPhaseOrder = planPhaseOrder
            }

            /** The reason for the adjustment. */
            fun reason(reason: String?) = reason(JsonField.ofNullable(reason))

            /** The reason for the adjustment. */
            fun reason(reason: JsonField<String>) = apply { this.reason = reason }

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

            fun build(): PlanPhasePercentageDiscountAdjustment =
                PlanPhasePercentageDiscountAdjustment(
                    checkRequired("id", id),
                    checkRequired("adjustmentType", adjustmentType),
                    checkRequired("appliesToPriceIds", appliesToPriceIds).map { it.toImmutable() },
                    checkRequired("isInvoiceLevel", isInvoiceLevel),
                    checkRequired("percentageDiscount", percentageDiscount),
                    checkRequired("planPhaseOrder", planPhaseOrder),
                    checkRequired("reason", reason),
                    additionalProperties.toImmutable(),
                )
        }

        class AdjustmentType
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
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
             * An enum containing [AdjustmentType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [AdjustmentType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                PERCENTAGE_DISCOUNT,
                /**
                 * An enum member indicating that [AdjustmentType] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
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

            return /* spotless:off */ other is PlanPhasePercentageDiscountAdjustment && id == other.id && adjustmentType == other.adjustmentType && appliesToPriceIds == other.appliesToPriceIds && isInvoiceLevel == other.isInvoiceLevel && percentageDiscount == other.percentageDiscount && planPhaseOrder == other.planPhaseOrder && reason == other.reason && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, adjustmentType, appliesToPriceIds, isInvoiceLevel, percentageDiscount, planPhaseOrder, reason, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PlanPhasePercentageDiscountAdjustment{id=$id, adjustmentType=$adjustmentType, appliesToPriceIds=$appliesToPriceIds, isInvoiceLevel=$isInvoiceLevel, percentageDiscount=$percentageDiscount, planPhaseOrder=$planPhaseOrder, reason=$reason, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class PlanPhaseMinimumAdjustment
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("adjustment_type")
        @ExcludeMissing
        private val adjustmentType: JsonField<AdjustmentType> = JsonMissing.of(),
        @JsonProperty("applies_to_price_ids")
        @ExcludeMissing
        private val appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("is_invoice_level")
        @ExcludeMissing
        private val isInvoiceLevel: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("item_id")
        @ExcludeMissing
        private val itemId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("minimum_amount")
        @ExcludeMissing
        private val minimumAmount: JsonField<String> = JsonMissing.of(),
        @JsonProperty("plan_phase_order")
        @ExcludeMissing
        private val planPhaseOrder: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("reason")
        @ExcludeMissing
        private val reason: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun id(): String = id.getRequired("id")

        fun adjustmentType(): AdjustmentType = adjustmentType.getRequired("adjustment_type")

        /** The price IDs that this adjustment applies to. */
        fun appliesToPriceIds(): List<String> =
            appliesToPriceIds.getRequired("applies_to_price_ids")

        /**
         * True for adjustments that apply to an entire invocice, false for adjustments that apply
         * to only one price.
         */
        fun isInvoiceLevel(): Boolean = isInvoiceLevel.getRequired("is_invoice_level")

        /** The item ID that revenue from this minimum will be attributed to. */
        fun itemId(): String = itemId.getRequired("item_id")

        /**
         * The minimum amount to charge in a given billing period for the prices this adjustment
         * applies to.
         */
        fun minimumAmount(): String = minimumAmount.getRequired("minimum_amount")

        /** The plan phase in which this adjustment is active. */
        fun planPhaseOrder(): Long? = planPhaseOrder.getNullable("plan_phase_order")

        /** The reason for the adjustment. */
        fun reason(): String? = reason.getNullable("reason")

        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        @JsonProperty("adjustment_type")
        @ExcludeMissing
        fun _adjustmentType(): JsonField<AdjustmentType> = adjustmentType

        /** The price IDs that this adjustment applies to. */
        @JsonProperty("applies_to_price_ids")
        @ExcludeMissing
        fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

        /**
         * True for adjustments that apply to an entire invocice, false for adjustments that apply
         * to only one price.
         */
        @JsonProperty("is_invoice_level")
        @ExcludeMissing
        fun _isInvoiceLevel(): JsonField<Boolean> = isInvoiceLevel

        /** The item ID that revenue from this minimum will be attributed to. */
        @JsonProperty("item_id") @ExcludeMissing fun _itemId(): JsonField<String> = itemId

        /**
         * The minimum amount to charge in a given billing period for the prices this adjustment
         * applies to.
         */
        @JsonProperty("minimum_amount")
        @ExcludeMissing
        fun _minimumAmount(): JsonField<String> = minimumAmount

        /** The plan phase in which this adjustment is active. */
        @JsonProperty("plan_phase_order")
        @ExcludeMissing
        fun _planPhaseOrder(): JsonField<Long> = planPhaseOrder

        /** The reason for the adjustment. */
        @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): PlanPhaseMinimumAdjustment = apply {
            if (validated) {
                return@apply
            }

            id()
            adjustmentType()
            appliesToPriceIds()
            isInvoiceLevel()
            itemId()
            minimumAmount()
            planPhaseOrder()
            reason()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of
             * [PlanPhaseMinimumAdjustment].
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .adjustmentType()
             * .appliesToPriceIds()
             * .isInvoiceLevel()
             * .itemId()
             * .minimumAmount()
             * .planPhaseOrder()
             * .reason()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [PlanPhaseMinimumAdjustment]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var adjustmentType: JsonField<AdjustmentType>? = null
            private var appliesToPriceIds: JsonField<MutableList<String>>? = null
            private var isInvoiceLevel: JsonField<Boolean>? = null
            private var itemId: JsonField<String>? = null
            private var minimumAmount: JsonField<String>? = null
            private var planPhaseOrder: JsonField<Long>? = null
            private var reason: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(planPhaseMinimumAdjustment: PlanPhaseMinimumAdjustment) = apply {
                id = planPhaseMinimumAdjustment.id
                adjustmentType = planPhaseMinimumAdjustment.adjustmentType
                appliesToPriceIds =
                    planPhaseMinimumAdjustment.appliesToPriceIds.map { it.toMutableList() }
                isInvoiceLevel = planPhaseMinimumAdjustment.isInvoiceLevel
                itemId = planPhaseMinimumAdjustment.itemId
                minimumAmount = planPhaseMinimumAdjustment.minimumAmount
                planPhaseOrder = planPhaseMinimumAdjustment.planPhaseOrder
                reason = planPhaseMinimumAdjustment.reason
                additionalProperties =
                    planPhaseMinimumAdjustment.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            fun id(id: JsonField<String>) = apply { this.id = id }

            fun adjustmentType(adjustmentType: AdjustmentType) =
                adjustmentType(JsonField.of(adjustmentType))

            fun adjustmentType(adjustmentType: JsonField<AdjustmentType>) = apply {
                this.adjustmentType = adjustmentType
            }

            /** The price IDs that this adjustment applies to. */
            fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                appliesToPriceIds(JsonField.of(appliesToPriceIds))

            /** The price IDs that this adjustment applies to. */
            fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
            }

            /** The price IDs that this adjustment applies to. */
            fun addAppliesToPriceId(appliesToPriceId: String) = apply {
                appliesToPriceIds =
                    (appliesToPriceIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("appliesToPriceIds", it).add(appliesToPriceId)
                    }
            }

            /**
             * True for adjustments that apply to an entire invocice, false for adjustments that
             * apply to only one price.
             */
            fun isInvoiceLevel(isInvoiceLevel: Boolean) =
                isInvoiceLevel(JsonField.of(isInvoiceLevel))

            /**
             * True for adjustments that apply to an entire invocice, false for adjustments that
             * apply to only one price.
             */
            fun isInvoiceLevel(isInvoiceLevel: JsonField<Boolean>) = apply {
                this.isInvoiceLevel = isInvoiceLevel
            }

            /** The item ID that revenue from this minimum will be attributed to. */
            fun itemId(itemId: String) = itemId(JsonField.of(itemId))

            /** The item ID that revenue from this minimum will be attributed to. */
            fun itemId(itemId: JsonField<String>) = apply { this.itemId = itemId }

            /**
             * The minimum amount to charge in a given billing period for the prices this adjustment
             * applies to.
             */
            fun minimumAmount(minimumAmount: String) = minimumAmount(JsonField.of(minimumAmount))

            /**
             * The minimum amount to charge in a given billing period for the prices this adjustment
             * applies to.
             */
            fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                this.minimumAmount = minimumAmount
            }

            /** The plan phase in which this adjustment is active. */
            fun planPhaseOrder(planPhaseOrder: Long?) =
                planPhaseOrder(JsonField.ofNullable(planPhaseOrder))

            /** The plan phase in which this adjustment is active. */
            fun planPhaseOrder(planPhaseOrder: Long) = planPhaseOrder(planPhaseOrder as Long?)

            /** The plan phase in which this adjustment is active. */
            fun planPhaseOrder(planPhaseOrder: JsonField<Long>) = apply {
                this.planPhaseOrder = planPhaseOrder
            }

            /** The reason for the adjustment. */
            fun reason(reason: String?) = reason(JsonField.ofNullable(reason))

            /** The reason for the adjustment. */
            fun reason(reason: JsonField<String>) = apply { this.reason = reason }

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

            fun build(): PlanPhaseMinimumAdjustment =
                PlanPhaseMinimumAdjustment(
                    checkRequired("id", id),
                    checkRequired("adjustmentType", adjustmentType),
                    checkRequired("appliesToPriceIds", appliesToPriceIds).map { it.toImmutable() },
                    checkRequired("isInvoiceLevel", isInvoiceLevel),
                    checkRequired("itemId", itemId),
                    checkRequired("minimumAmount", minimumAmount),
                    checkRequired("planPhaseOrder", planPhaseOrder),
                    checkRequired("reason", reason),
                    additionalProperties.toImmutable(),
                )
        }

        class AdjustmentType
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
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
             * An enum containing [AdjustmentType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [AdjustmentType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                MINIMUM,
                /**
                 * An enum member indicating that [AdjustmentType] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
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

            return /* spotless:off */ other is PlanPhaseMinimumAdjustment && id == other.id && adjustmentType == other.adjustmentType && appliesToPriceIds == other.appliesToPriceIds && isInvoiceLevel == other.isInvoiceLevel && itemId == other.itemId && minimumAmount == other.minimumAmount && planPhaseOrder == other.planPhaseOrder && reason == other.reason && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, adjustmentType, appliesToPriceIds, isInvoiceLevel, itemId, minimumAmount, planPhaseOrder, reason, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PlanPhaseMinimumAdjustment{id=$id, adjustmentType=$adjustmentType, appliesToPriceIds=$appliesToPriceIds, isInvoiceLevel=$isInvoiceLevel, itemId=$itemId, minimumAmount=$minimumAmount, planPhaseOrder=$planPhaseOrder, reason=$reason, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class PlanPhaseMaximumAdjustment
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("adjustment_type")
        @ExcludeMissing
        private val adjustmentType: JsonField<AdjustmentType> = JsonMissing.of(),
        @JsonProperty("applies_to_price_ids")
        @ExcludeMissing
        private val appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("is_invoice_level")
        @ExcludeMissing
        private val isInvoiceLevel: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("maximum_amount")
        @ExcludeMissing
        private val maximumAmount: JsonField<String> = JsonMissing.of(),
        @JsonProperty("plan_phase_order")
        @ExcludeMissing
        private val planPhaseOrder: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("reason")
        @ExcludeMissing
        private val reason: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun id(): String = id.getRequired("id")

        fun adjustmentType(): AdjustmentType = adjustmentType.getRequired("adjustment_type")

        /** The price IDs that this adjustment applies to. */
        fun appliesToPriceIds(): List<String> =
            appliesToPriceIds.getRequired("applies_to_price_ids")

        /**
         * True for adjustments that apply to an entire invocice, false for adjustments that apply
         * to only one price.
         */
        fun isInvoiceLevel(): Boolean = isInvoiceLevel.getRequired("is_invoice_level")

        /**
         * The maximum amount to charge in a given billing period for the prices this adjustment
         * applies to.
         */
        fun maximumAmount(): String = maximumAmount.getRequired("maximum_amount")

        /** The plan phase in which this adjustment is active. */
        fun planPhaseOrder(): Long? = planPhaseOrder.getNullable("plan_phase_order")

        /** The reason for the adjustment. */
        fun reason(): String? = reason.getNullable("reason")

        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        @JsonProperty("adjustment_type")
        @ExcludeMissing
        fun _adjustmentType(): JsonField<AdjustmentType> = adjustmentType

        /** The price IDs that this adjustment applies to. */
        @JsonProperty("applies_to_price_ids")
        @ExcludeMissing
        fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

        /**
         * True for adjustments that apply to an entire invocice, false for adjustments that apply
         * to only one price.
         */
        @JsonProperty("is_invoice_level")
        @ExcludeMissing
        fun _isInvoiceLevel(): JsonField<Boolean> = isInvoiceLevel

        /**
         * The maximum amount to charge in a given billing period for the prices this adjustment
         * applies to.
         */
        @JsonProperty("maximum_amount")
        @ExcludeMissing
        fun _maximumAmount(): JsonField<String> = maximumAmount

        /** The plan phase in which this adjustment is active. */
        @JsonProperty("plan_phase_order")
        @ExcludeMissing
        fun _planPhaseOrder(): JsonField<Long> = planPhaseOrder

        /** The reason for the adjustment. */
        @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): PlanPhaseMaximumAdjustment = apply {
            if (validated) {
                return@apply
            }

            id()
            adjustmentType()
            appliesToPriceIds()
            isInvoiceLevel()
            maximumAmount()
            planPhaseOrder()
            reason()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of
             * [PlanPhaseMaximumAdjustment].
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .adjustmentType()
             * .appliesToPriceIds()
             * .isInvoiceLevel()
             * .maximumAmount()
             * .planPhaseOrder()
             * .reason()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [PlanPhaseMaximumAdjustment]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var adjustmentType: JsonField<AdjustmentType>? = null
            private var appliesToPriceIds: JsonField<MutableList<String>>? = null
            private var isInvoiceLevel: JsonField<Boolean>? = null
            private var maximumAmount: JsonField<String>? = null
            private var planPhaseOrder: JsonField<Long>? = null
            private var reason: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(planPhaseMaximumAdjustment: PlanPhaseMaximumAdjustment) = apply {
                id = planPhaseMaximumAdjustment.id
                adjustmentType = planPhaseMaximumAdjustment.adjustmentType
                appliesToPriceIds =
                    planPhaseMaximumAdjustment.appliesToPriceIds.map { it.toMutableList() }
                isInvoiceLevel = planPhaseMaximumAdjustment.isInvoiceLevel
                maximumAmount = planPhaseMaximumAdjustment.maximumAmount
                planPhaseOrder = planPhaseMaximumAdjustment.planPhaseOrder
                reason = planPhaseMaximumAdjustment.reason
                additionalProperties =
                    planPhaseMaximumAdjustment.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            fun id(id: JsonField<String>) = apply { this.id = id }

            fun adjustmentType(adjustmentType: AdjustmentType) =
                adjustmentType(JsonField.of(adjustmentType))

            fun adjustmentType(adjustmentType: JsonField<AdjustmentType>) = apply {
                this.adjustmentType = adjustmentType
            }

            /** The price IDs that this adjustment applies to. */
            fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                appliesToPriceIds(JsonField.of(appliesToPriceIds))

            /** The price IDs that this adjustment applies to. */
            fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
            }

            /** The price IDs that this adjustment applies to. */
            fun addAppliesToPriceId(appliesToPriceId: String) = apply {
                appliesToPriceIds =
                    (appliesToPriceIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("appliesToPriceIds", it).add(appliesToPriceId)
                    }
            }

            /**
             * True for adjustments that apply to an entire invocice, false for adjustments that
             * apply to only one price.
             */
            fun isInvoiceLevel(isInvoiceLevel: Boolean) =
                isInvoiceLevel(JsonField.of(isInvoiceLevel))

            /**
             * True for adjustments that apply to an entire invocice, false for adjustments that
             * apply to only one price.
             */
            fun isInvoiceLevel(isInvoiceLevel: JsonField<Boolean>) = apply {
                this.isInvoiceLevel = isInvoiceLevel
            }

            /**
             * The maximum amount to charge in a given billing period for the prices this adjustment
             * applies to.
             */
            fun maximumAmount(maximumAmount: String) = maximumAmount(JsonField.of(maximumAmount))

            /**
             * The maximum amount to charge in a given billing period for the prices this adjustment
             * applies to.
             */
            fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                this.maximumAmount = maximumAmount
            }

            /** The plan phase in which this adjustment is active. */
            fun planPhaseOrder(planPhaseOrder: Long?) =
                planPhaseOrder(JsonField.ofNullable(planPhaseOrder))

            /** The plan phase in which this adjustment is active. */
            fun planPhaseOrder(planPhaseOrder: Long) = planPhaseOrder(planPhaseOrder as Long?)

            /** The plan phase in which this adjustment is active. */
            fun planPhaseOrder(planPhaseOrder: JsonField<Long>) = apply {
                this.planPhaseOrder = planPhaseOrder
            }

            /** The reason for the adjustment. */
            fun reason(reason: String?) = reason(JsonField.ofNullable(reason))

            /** The reason for the adjustment. */
            fun reason(reason: JsonField<String>) = apply { this.reason = reason }

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

            fun build(): PlanPhaseMaximumAdjustment =
                PlanPhaseMaximumAdjustment(
                    checkRequired("id", id),
                    checkRequired("adjustmentType", adjustmentType),
                    checkRequired("appliesToPriceIds", appliesToPriceIds).map { it.toImmutable() },
                    checkRequired("isInvoiceLevel", isInvoiceLevel),
                    checkRequired("maximumAmount", maximumAmount),
                    checkRequired("planPhaseOrder", planPhaseOrder),
                    checkRequired("reason", reason),
                    additionalProperties.toImmutable(),
                )
        }

        class AdjustmentType
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
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
             * An enum containing [AdjustmentType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [AdjustmentType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                MAXIMUM,
                /**
                 * An enum member indicating that [AdjustmentType] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
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

            return /* spotless:off */ other is PlanPhaseMaximumAdjustment && id == other.id && adjustmentType == other.adjustmentType && appliesToPriceIds == other.appliesToPriceIds && isInvoiceLevel == other.isInvoiceLevel && maximumAmount == other.maximumAmount && planPhaseOrder == other.planPhaseOrder && reason == other.reason && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, adjustmentType, appliesToPriceIds, isInvoiceLevel, maximumAmount, planPhaseOrder, reason, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PlanPhaseMaximumAdjustment{id=$id, adjustmentType=$adjustmentType, appliesToPriceIds=$appliesToPriceIds, isInvoiceLevel=$isInvoiceLevel, maximumAmount=$maximumAmount, planPhaseOrder=$planPhaseOrder, reason=$reason, additionalProperties=$additionalProperties}"
    }
}
