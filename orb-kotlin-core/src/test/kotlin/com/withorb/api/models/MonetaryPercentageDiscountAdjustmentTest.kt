// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MonetaryPercentageDiscountAdjustmentTest {

    @Test
    fun create() {
        val monetaryPercentageDiscountAdjustment =
            MonetaryPercentageDiscountAdjustment.builder()
                .id("id")
                .adjustmentType(
                    MonetaryPercentageDiscountAdjustment.AdjustmentType.PERCENTAGE_DISCOUNT
                )
                .amount("amount")
                .addAppliesToPriceId("string")
                .addFilter(
                    MonetaryPercentageDiscountAdjustment.Filter.builder()
                        .field(MonetaryPercentageDiscountAdjustment.Filter.Field.PRICE_ID)
                        .operator(MonetaryPercentageDiscountAdjustment.Filter.Operator.INCLUDES)
                        .addValue("string")
                        .build()
                )
                .isInvoiceLevel(true)
                .percentageDiscount(0.0)
                .reason("reason")
                .replacesAdjustmentId("replaces_adjustment_id")
                .build()

        assertThat(monetaryPercentageDiscountAdjustment.id()).isEqualTo("id")
        assertThat(monetaryPercentageDiscountAdjustment.adjustmentType())
            .isEqualTo(MonetaryPercentageDiscountAdjustment.AdjustmentType.PERCENTAGE_DISCOUNT)
        assertThat(monetaryPercentageDiscountAdjustment.amount()).isEqualTo("amount")
        assertThat(monetaryPercentageDiscountAdjustment.appliesToPriceIds())
            .containsExactly("string")
        assertThat(monetaryPercentageDiscountAdjustment.filters())
            .containsExactly(
                MonetaryPercentageDiscountAdjustment.Filter.builder()
                    .field(MonetaryPercentageDiscountAdjustment.Filter.Field.PRICE_ID)
                    .operator(MonetaryPercentageDiscountAdjustment.Filter.Operator.INCLUDES)
                    .addValue("string")
                    .build()
            )
        assertThat(monetaryPercentageDiscountAdjustment.isInvoiceLevel()).isEqualTo(true)
        assertThat(monetaryPercentageDiscountAdjustment.percentageDiscount()).isEqualTo(0.0)
        assertThat(monetaryPercentageDiscountAdjustment.reason()).isEqualTo("reason")
        assertThat(monetaryPercentageDiscountAdjustment.replacesAdjustmentId())
            .isEqualTo("replaces_adjustment_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val monetaryPercentageDiscountAdjustment =
            MonetaryPercentageDiscountAdjustment.builder()
                .id("id")
                .adjustmentType(
                    MonetaryPercentageDiscountAdjustment.AdjustmentType.PERCENTAGE_DISCOUNT
                )
                .amount("amount")
                .addAppliesToPriceId("string")
                .addFilter(
                    MonetaryPercentageDiscountAdjustment.Filter.builder()
                        .field(MonetaryPercentageDiscountAdjustment.Filter.Field.PRICE_ID)
                        .operator(MonetaryPercentageDiscountAdjustment.Filter.Operator.INCLUDES)
                        .addValue("string")
                        .build()
                )
                .isInvoiceLevel(true)
                .percentageDiscount(0.0)
                .reason("reason")
                .replacesAdjustmentId("replaces_adjustment_id")
                .build()

        val roundtrippedMonetaryPercentageDiscountAdjustment =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(monetaryPercentageDiscountAdjustment),
                jacksonTypeRef<MonetaryPercentageDiscountAdjustment>(),
            )

        assertThat(roundtrippedMonetaryPercentageDiscountAdjustment)
            .isEqualTo(monetaryPercentageDiscountAdjustment)
    }
}
