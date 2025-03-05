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
import com.withorb.api.core.checkKnown
import com.withorb.api.core.checkRequired
import com.withorb.api.core.immutableEmptyMap
import com.withorb.api.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects

@NoAutoDetect
class AdjustmentIntervalModel
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("adjustment")
    @ExcludeMissing
    private val adjustment: JsonField<AdjustmentModel> = JsonMissing.of(),
    @JsonProperty("applies_to_price_interval_ids")
    @ExcludeMissing
    private val appliesToPriceIntervalIds: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("end_date")
    @ExcludeMissing
    private val endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("start_date")
    @ExcludeMissing
    private val startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun id(): String = id.getRequired("id")

    fun adjustment(): AdjustmentModel = adjustment.getRequired("adjustment")

    /** The price interval IDs that this adjustment applies to. */
    fun appliesToPriceIntervalIds(): List<String> =
        appliesToPriceIntervalIds.getRequired("applies_to_price_interval_ids")

    /** The end date of the adjustment interval. */
    fun endDate(): OffsetDateTime? = endDate.getNullable("end_date")

    /** The start date of the adjustment interval. */
    fun startDate(): OffsetDateTime = startDate.getRequired("start_date")

    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    @JsonProperty("adjustment")
    @ExcludeMissing
    fun _adjustment(): JsonField<AdjustmentModel> = adjustment

    /** The price interval IDs that this adjustment applies to. */
    @JsonProperty("applies_to_price_interval_ids")
    @ExcludeMissing
    fun _appliesToPriceIntervalIds(): JsonField<List<String>> = appliesToPriceIntervalIds

    /** The end date of the adjustment interval. */
    @JsonProperty("end_date") @ExcludeMissing fun _endDate(): JsonField<OffsetDateTime> = endDate

    /** The start date of the adjustment interval. */
    @JsonProperty("start_date")
    @ExcludeMissing
    fun _startDate(): JsonField<OffsetDateTime> = startDate

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): AdjustmentIntervalModel = apply {
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

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AdjustmentIntervalModel].
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

    /** A builder for [AdjustmentIntervalModel]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var adjustment: JsonField<AdjustmentModel>? = null
        private var appliesToPriceIntervalIds: JsonField<MutableList<String>>? = null
        private var endDate: JsonField<OffsetDateTime>? = null
        private var startDate: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(adjustmentIntervalModel: AdjustmentIntervalModel) = apply {
            id = adjustmentIntervalModel.id
            adjustment = adjustmentIntervalModel.adjustment
            appliesToPriceIntervalIds =
                adjustmentIntervalModel.appliesToPriceIntervalIds.map { it.toMutableList() }
            endDate = adjustmentIntervalModel.endDate
            startDate = adjustmentIntervalModel.startDate
            additionalProperties = adjustmentIntervalModel.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        fun adjustment(adjustment: AdjustmentModel) = adjustment(JsonField.of(adjustment))

        fun adjustment(adjustment: JsonField<AdjustmentModel>) = apply {
            this.adjustment = adjustment
        }

        fun adjustment(
            planPhaseUsageDiscountAdjustment: AdjustmentModel.PlanPhaseUsageDiscountAdjustment
        ) =
            adjustment(
                AdjustmentModel.ofPlanPhaseUsageDiscountAdjustment(planPhaseUsageDiscountAdjustment)
            )

        fun adjustment(
            planPhaseAmountDiscountAdjustment: AdjustmentModel.PlanPhaseAmountDiscountAdjustment
        ) =
            adjustment(
                AdjustmentModel.ofPlanPhaseAmountDiscountAdjustment(
                    planPhaseAmountDiscountAdjustment
                )
            )

        fun adjustment(
            planPhasePercentageDiscountAdjustment:
                AdjustmentModel.PlanPhasePercentageDiscountAdjustment
        ) =
            adjustment(
                AdjustmentModel.ofPlanPhasePercentageDiscountAdjustment(
                    planPhasePercentageDiscountAdjustment
                )
            )

        fun adjustment(planPhaseMinimumAdjustment: AdjustmentModel.PlanPhaseMinimumAdjustment) =
            adjustment(AdjustmentModel.ofPlanPhaseMinimumAdjustment(planPhaseMinimumAdjustment))

        fun adjustment(planPhaseMaximumAdjustment: AdjustmentModel.PlanPhaseMaximumAdjustment) =
            adjustment(AdjustmentModel.ofPlanPhaseMaximumAdjustment(planPhaseMaximumAdjustment))

        /** The price interval IDs that this adjustment applies to. */
        fun appliesToPriceIntervalIds(appliesToPriceIntervalIds: List<String>) =
            appliesToPriceIntervalIds(JsonField.of(appliesToPriceIntervalIds))

        /** The price interval IDs that this adjustment applies to. */
        fun appliesToPriceIntervalIds(appliesToPriceIntervalIds: JsonField<List<String>>) = apply {
            this.appliesToPriceIntervalIds = appliesToPriceIntervalIds.map { it.toMutableList() }
        }

        /** The price interval IDs that this adjustment applies to. */
        fun addAppliesToPriceIntervalId(appliesToPriceIntervalId: String) = apply {
            appliesToPriceIntervalIds =
                (appliesToPriceIntervalIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("appliesToPriceIntervalIds", it).add(appliesToPriceIntervalId)
                }
        }

        /** The end date of the adjustment interval. */
        fun endDate(endDate: OffsetDateTime?) = endDate(JsonField.ofNullable(endDate))

        /** The end date of the adjustment interval. */
        fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

        /** The start date of the adjustment interval. */
        fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

        /** The start date of the adjustment interval. */
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

        fun build(): AdjustmentIntervalModel =
            AdjustmentIntervalModel(
                checkRequired("id", id),
                checkRequired("adjustment", adjustment),
                checkRequired("appliesToPriceIntervalIds", appliesToPriceIntervalIds).map {
                    it.toImmutable()
                },
                checkRequired("endDate", endDate),
                checkRequired("startDate", startDate),
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AdjustmentIntervalModel && id == other.id && adjustment == other.adjustment && appliesToPriceIntervalIds == other.appliesToPriceIntervalIds && endDate == other.endDate && startDate == other.startDate && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, adjustment, appliesToPriceIntervalIds, endDate, startDate, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AdjustmentIntervalModel{id=$id, adjustment=$adjustment, appliesToPriceIntervalIds=$appliesToPriceIntervalIds, endDate=$endDate, startDate=$startDate, additionalProperties=$additionalProperties}"
}
