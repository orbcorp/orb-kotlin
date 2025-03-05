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
class AddSubscriptionAdjustmentParams
@JsonCreator
private constructor(
    @JsonProperty("adjustment")
    @ExcludeMissing
    private val adjustment: JsonField<NewAdjustmentModel> = JsonMissing.of(),
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
    fun adjustment(): NewAdjustmentModel = adjustment.getRequired("adjustment")

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
    fun _adjustment(): JsonField<NewAdjustmentModel> = adjustment

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

        private var adjustment: JsonField<NewAdjustmentModel>? = null
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
        fun adjustment(adjustment: NewAdjustmentModel) = adjustment(JsonField.of(adjustment))

        /** The definition of a new adjustment to create and add to the subscription. */
        fun adjustment(adjustment: JsonField<NewAdjustmentModel>) = apply {
            this.adjustment = adjustment
        }

        /** The definition of a new adjustment to create and add to the subscription. */
        fun adjustment(percentageDiscount: NewAdjustmentModel.NewPercentageDiscount) =
            adjustment(NewAdjustmentModel.ofPercentageDiscount(percentageDiscount))

        /** The definition of a new adjustment to create and add to the subscription. */
        fun adjustment(usageDiscount: NewAdjustmentModel.NewUsageDiscount) =
            adjustment(NewAdjustmentModel.ofUsageDiscount(usageDiscount))

        /** The definition of a new adjustment to create and add to the subscription. */
        fun adjustment(amountDiscount: NewAdjustmentModel.NewAmountDiscount) =
            adjustment(NewAdjustmentModel.ofAmountDiscount(amountDiscount))

        /** The definition of a new adjustment to create and add to the subscription. */
        fun adjustment(minimum: NewAdjustmentModel.NewMinimum) =
            adjustment(NewAdjustmentModel.ofMinimum(minimum))

        /** The definition of a new adjustment to create and add to the subscription. */
        fun adjustment(maximum: NewAdjustmentModel.NewMaximum) =
            adjustment(NewAdjustmentModel.ofMaximum(maximum))

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
