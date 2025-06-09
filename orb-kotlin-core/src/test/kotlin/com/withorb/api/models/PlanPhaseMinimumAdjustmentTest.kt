// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlanPhaseMinimumAdjustmentTest {

    @Test
    fun create() {
        val planPhaseMinimumAdjustment =
            PlanPhaseMinimumAdjustment.builder()
                .id("id")
                .adjustmentType(PlanPhaseMinimumAdjustment.AdjustmentType.MINIMUM)
                .addAppliesToPriceId("string")
                .addFilter(
                    TransformPriceFilter.builder()
                        .field(TransformPriceFilter.Field.PRICE_ID)
                        .operator(TransformPriceFilter.Operator.INCLUDES)
                        .addValue("string")
                        .build()
                )
                .isInvoiceLevel(true)
                .itemId("item_id")
                .minimumAmount("minimum_amount")
                .planPhaseOrder(0L)
                .reason("reason")
                .build()

        assertThat(planPhaseMinimumAdjustment.id()).isEqualTo("id")
        assertThat(planPhaseMinimumAdjustment.adjustmentType())
            .isEqualTo(PlanPhaseMinimumAdjustment.AdjustmentType.MINIMUM)
        assertThat(planPhaseMinimumAdjustment.appliesToPriceIds()).containsExactly("string")
        assertThat(planPhaseMinimumAdjustment.filters())
            .containsExactly(
                TransformPriceFilter.builder()
                    .field(TransformPriceFilter.Field.PRICE_ID)
                    .operator(TransformPriceFilter.Operator.INCLUDES)
                    .addValue("string")
                    .build()
            )
        assertThat(planPhaseMinimumAdjustment.isInvoiceLevel()).isEqualTo(true)
        assertThat(planPhaseMinimumAdjustment.itemId()).isEqualTo("item_id")
        assertThat(planPhaseMinimumAdjustment.minimumAmount()).isEqualTo("minimum_amount")
        assertThat(planPhaseMinimumAdjustment.planPhaseOrder()).isEqualTo(0L)
        assertThat(planPhaseMinimumAdjustment.reason()).isEqualTo("reason")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val planPhaseMinimumAdjustment =
            PlanPhaseMinimumAdjustment.builder()
                .id("id")
                .adjustmentType(PlanPhaseMinimumAdjustment.AdjustmentType.MINIMUM)
                .addAppliesToPriceId("string")
                .addFilter(
                    TransformPriceFilter.builder()
                        .field(TransformPriceFilter.Field.PRICE_ID)
                        .operator(TransformPriceFilter.Operator.INCLUDES)
                        .addValue("string")
                        .build()
                )
                .isInvoiceLevel(true)
                .itemId("item_id")
                .minimumAmount("minimum_amount")
                .planPhaseOrder(0L)
                .reason("reason")
                .build()

        val roundtrippedPlanPhaseMinimumAdjustment =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(planPhaseMinimumAdjustment),
                jacksonTypeRef<PlanPhaseMinimumAdjustment>(),
            )

        assertThat(roundtrippedPlanPhaseMinimumAdjustment).isEqualTo(planPhaseMinimumAdjustment)
    }
}
