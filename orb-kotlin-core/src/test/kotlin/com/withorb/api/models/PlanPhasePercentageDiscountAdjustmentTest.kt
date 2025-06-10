// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlanPhasePercentageDiscountAdjustmentTest {

    @Test
    fun create() {
        val planPhasePercentageDiscountAdjustment =
            PlanPhasePercentageDiscountAdjustment.builder()
                .id("id")
                .adjustmentType(
                    PlanPhasePercentageDiscountAdjustment.AdjustmentType.PERCENTAGE_DISCOUNT
                )
                .addAppliesToPriceId("string")
                .addFilter(
                    TransformPriceFilter.builder()
                        .field(TransformPriceFilter.Field.PRICE_ID)
                        .operator(TransformPriceFilter.Operator.INCLUDES)
                        .addValue("string")
                        .build()
                )
                .isInvoiceLevel(true)
                .percentageDiscount(0.0)
                .planPhaseOrder(0L)
                .reason("reason")
                .build()

        assertThat(planPhasePercentageDiscountAdjustment.id()).isEqualTo("id")
        assertThat(planPhasePercentageDiscountAdjustment.adjustmentType())
            .isEqualTo(PlanPhasePercentageDiscountAdjustment.AdjustmentType.PERCENTAGE_DISCOUNT)
        assertThat(planPhasePercentageDiscountAdjustment.appliesToPriceIds())
            .containsExactly("string")
        assertThat(planPhasePercentageDiscountAdjustment.filters())
            .containsExactly(
                TransformPriceFilter.builder()
                    .field(TransformPriceFilter.Field.PRICE_ID)
                    .operator(TransformPriceFilter.Operator.INCLUDES)
                    .addValue("string")
                    .build()
            )
        assertThat(planPhasePercentageDiscountAdjustment.isInvoiceLevel()).isEqualTo(true)
        assertThat(planPhasePercentageDiscountAdjustment.percentageDiscount()).isEqualTo(0.0)
        assertThat(planPhasePercentageDiscountAdjustment.planPhaseOrder()).isEqualTo(0L)
        assertThat(planPhasePercentageDiscountAdjustment.reason()).isEqualTo("reason")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val planPhasePercentageDiscountAdjustment =
            PlanPhasePercentageDiscountAdjustment.builder()
                .id("id")
                .adjustmentType(
                    PlanPhasePercentageDiscountAdjustment.AdjustmentType.PERCENTAGE_DISCOUNT
                )
                .addAppliesToPriceId("string")
                .addFilter(
                    TransformPriceFilter.builder()
                        .field(TransformPriceFilter.Field.PRICE_ID)
                        .operator(TransformPriceFilter.Operator.INCLUDES)
                        .addValue("string")
                        .build()
                )
                .isInvoiceLevel(true)
                .percentageDiscount(0.0)
                .planPhaseOrder(0L)
                .reason("reason")
                .build()

        val roundtrippedPlanPhasePercentageDiscountAdjustment =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(planPhasePercentageDiscountAdjustment),
                jacksonTypeRef<PlanPhasePercentageDiscountAdjustment>(),
            )

        assertThat(roundtrippedPlanPhasePercentageDiscountAdjustment)
            .isEqualTo(planPhasePercentageDiscountAdjustment)
    }
}
