// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AdjustmentIntervalTest {

    @Test
    fun create() {
        val adjustmentInterval =
            AdjustmentInterval.builder()
                .id("id")
                .adjustment(
                    PlanPhaseUsageDiscountAdjustment.builder()
                        .id("id")
                        .adjustmentType(
                            PlanPhaseUsageDiscountAdjustment.AdjustmentType.USAGE_DISCOUNT
                        )
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
                )
                .addAppliesToPriceIntervalId("string")
                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(adjustmentInterval.id()).isEqualTo("id")
        assertThat(adjustmentInterval.adjustment())
            .isEqualTo(
                AdjustmentInterval.Adjustment.ofUsageDiscount(
                    PlanPhaseUsageDiscountAdjustment.builder()
                        .id("id")
                        .adjustmentType(
                            PlanPhaseUsageDiscountAdjustment.AdjustmentType.USAGE_DISCOUNT
                        )
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
                )
            )
        assertThat(adjustmentInterval.appliesToPriceIntervalIds()).containsExactly("string")
        assertThat(adjustmentInterval.endDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(adjustmentInterval.startDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val adjustmentInterval =
            AdjustmentInterval.builder()
                .id("id")
                .adjustment(
                    PlanPhaseUsageDiscountAdjustment.builder()
                        .id("id")
                        .adjustmentType(
                            PlanPhaseUsageDiscountAdjustment.AdjustmentType.USAGE_DISCOUNT
                        )
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
                )
                .addAppliesToPriceIntervalId("string")
                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedAdjustmentInterval =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(adjustmentInterval),
                jacksonTypeRef<AdjustmentInterval>(),
            )

        assertThat(roundtrippedAdjustmentInterval).isEqualTo(adjustmentInterval)
    }
}
