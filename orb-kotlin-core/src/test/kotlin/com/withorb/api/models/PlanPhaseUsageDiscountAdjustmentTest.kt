// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlanPhaseUsageDiscountAdjustmentTest {

    @Test
    fun create() {
        val planPhaseUsageDiscountAdjustment =
            PlanPhaseUsageDiscountAdjustment.builder()
                .id("id")
                .adjustmentType(PlanPhaseUsageDiscountAdjustment.AdjustmentType.USAGE_DISCOUNT)
                .addAppliesToPriceId("string")
                .addFilter(
                    PlanPhaseUsageDiscountAdjustment.Filter.builder()
                        .field(PlanPhaseUsageDiscountAdjustment.Filter.Field.PRICE_ID)
                        .operator(PlanPhaseUsageDiscountAdjustment.Filter.Operator.INCLUDES)
                        .addValue("string")
                        .build()
                )
                .isInvoiceLevel(true)
                .planPhaseOrder(0L)
                .reason("reason")
                .replacesAdjustmentId("replaces_adjustment_id")
                .usageDiscount(0.0)
                .build()

        assertThat(planPhaseUsageDiscountAdjustment.id()).isEqualTo("id")
        assertThat(planPhaseUsageDiscountAdjustment.adjustmentType())
            .isEqualTo(PlanPhaseUsageDiscountAdjustment.AdjustmentType.USAGE_DISCOUNT)
        assertThat(planPhaseUsageDiscountAdjustment.appliesToPriceIds()).containsExactly("string")
        assertThat(planPhaseUsageDiscountAdjustment.filters())
            .containsExactly(
                PlanPhaseUsageDiscountAdjustment.Filter.builder()
                    .field(PlanPhaseUsageDiscountAdjustment.Filter.Field.PRICE_ID)
                    .operator(PlanPhaseUsageDiscountAdjustment.Filter.Operator.INCLUDES)
                    .addValue("string")
                    .build()
            )
        assertThat(planPhaseUsageDiscountAdjustment.isInvoiceLevel()).isEqualTo(true)
        assertThat(planPhaseUsageDiscountAdjustment.planPhaseOrder()).isEqualTo(0L)
        assertThat(planPhaseUsageDiscountAdjustment.reason()).isEqualTo("reason")
        assertThat(planPhaseUsageDiscountAdjustment.replacesAdjustmentId())
            .isEqualTo("replaces_adjustment_id")
        assertThat(planPhaseUsageDiscountAdjustment.usageDiscount()).isEqualTo(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val planPhaseUsageDiscountAdjustment =
            PlanPhaseUsageDiscountAdjustment.builder()
                .id("id")
                .adjustmentType(PlanPhaseUsageDiscountAdjustment.AdjustmentType.USAGE_DISCOUNT)
                .addAppliesToPriceId("string")
                .addFilter(
                    PlanPhaseUsageDiscountAdjustment.Filter.builder()
                        .field(PlanPhaseUsageDiscountAdjustment.Filter.Field.PRICE_ID)
                        .operator(PlanPhaseUsageDiscountAdjustment.Filter.Operator.INCLUDES)
                        .addValue("string")
                        .build()
                )
                .isInvoiceLevel(true)
                .planPhaseOrder(0L)
                .reason("reason")
                .replacesAdjustmentId("replaces_adjustment_id")
                .usageDiscount(0.0)
                .build()

        val roundtrippedPlanPhaseUsageDiscountAdjustment =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(planPhaseUsageDiscountAdjustment),
                jacksonTypeRef<PlanPhaseUsageDiscountAdjustment>(),
            )

        assertThat(roundtrippedPlanPhaseUsageDiscountAdjustment)
            .isEqualTo(planPhaseUsageDiscountAdjustment)
    }
}
