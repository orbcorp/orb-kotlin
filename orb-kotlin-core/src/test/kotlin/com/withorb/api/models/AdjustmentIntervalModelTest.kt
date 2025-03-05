// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AdjustmentIntervalModelTest {

    @Test
    fun createAdjustmentIntervalModel() {
        val adjustmentIntervalModel =
            AdjustmentIntervalModel.builder()
                .id("id")
                .adjustment(
                    AdjustmentModel.PlanPhaseUsageDiscountAdjustment.builder()
                        .id("id")
                        .adjustmentType(
                            AdjustmentModel.PlanPhaseUsageDiscountAdjustment.AdjustmentType
                                .USAGE_DISCOUNT
                        )
                        .addAppliesToPriceId("string")
                        .isInvoiceLevel(true)
                        .planPhaseOrder(0L)
                        .reason("reason")
                        .usageDiscount(0.0)
                        .build()
                )
                .addAppliesToPriceIntervalId("string")
                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(adjustmentIntervalModel).isNotNull
        assertThat(adjustmentIntervalModel.id()).isEqualTo("id")
        assertThat(adjustmentIntervalModel.adjustment())
            .isEqualTo(
                AdjustmentModel.ofPlanPhaseUsageDiscountAdjustment(
                    AdjustmentModel.PlanPhaseUsageDiscountAdjustment.builder()
                        .id("id")
                        .adjustmentType(
                            AdjustmentModel.PlanPhaseUsageDiscountAdjustment.AdjustmentType
                                .USAGE_DISCOUNT
                        )
                        .addAppliesToPriceId("string")
                        .isInvoiceLevel(true)
                        .planPhaseOrder(0L)
                        .reason("reason")
                        .usageDiscount(0.0)
                        .build()
                )
            )
        assertThat(adjustmentIntervalModel.appliesToPriceIntervalIds()).containsExactly("string")
        assertThat(adjustmentIntervalModel.endDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(adjustmentIntervalModel.startDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
