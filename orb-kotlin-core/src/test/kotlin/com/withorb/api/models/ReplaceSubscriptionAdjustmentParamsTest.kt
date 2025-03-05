// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ReplaceSubscriptionAdjustmentParamsTest {

    @Test
    fun createReplaceSubscriptionAdjustmentParams() {
        val replaceSubscriptionAdjustmentParams =
            ReplaceSubscriptionAdjustmentParams.builder()
                .adjustment(
                    ReplaceSubscriptionAdjustmentParams.Adjustment.NewPercentageDiscount.builder()
                        .adjustmentType(
                            ReplaceSubscriptionAdjustmentParams.Adjustment.NewPercentageDiscount
                                .AdjustmentType
                                .PERCENTAGE_DISCOUNT
                        )
                        .addAppliesToPriceId("price_1")
                        .addAppliesToPriceId("price_2")
                        .percentageDiscount(0.0)
                        .isInvoiceLevel(true)
                        .build()
                )
                .replacesAdjustmentId("replaces_adjustment_id")
                .build()
        assertThat(replaceSubscriptionAdjustmentParams).isNotNull
        assertThat(replaceSubscriptionAdjustmentParams.adjustment())
            .isEqualTo(
                ReplaceSubscriptionAdjustmentParams.Adjustment.ofNewPercentageDiscount(
                    ReplaceSubscriptionAdjustmentParams.Adjustment.NewPercentageDiscount.builder()
                        .adjustmentType(
                            ReplaceSubscriptionAdjustmentParams.Adjustment.NewPercentageDiscount
                                .AdjustmentType
                                .PERCENTAGE_DISCOUNT
                        )
                        .addAppliesToPriceId("price_1")
                        .addAppliesToPriceId("price_2")
                        .percentageDiscount(0.0)
                        .isInvoiceLevel(true)
                        .build()
                )
            )
        assertThat(replaceSubscriptionAdjustmentParams.replacesAdjustmentId())
            .isEqualTo("replaces_adjustment_id")
    }
}
