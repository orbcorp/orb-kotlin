// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MonetaryUsageDiscountAdjustmentTest {

    @Test
    fun create() {
        val monetaryUsageDiscountAdjustment =
            MonetaryUsageDiscountAdjustment.builder()
                .id("id")
                .adjustmentType(MonetaryUsageDiscountAdjustment.AdjustmentType.USAGE_DISCOUNT)
                .amount("amount")
                .addAppliesToPriceId("string")
                .addFilter(
                    MonetaryUsageDiscountAdjustment.Filter.builder()
                        .field(MonetaryUsageDiscountAdjustment.Filter.Field.PRICE_ID)
                        .operator(MonetaryUsageDiscountAdjustment.Filter.Operator.INCLUDES)
                        .addValue("string")
                        .build()
                )
                .isInvoiceLevel(true)
                .reason("reason")
                .replacesAdjustmentId("replaces_adjustment_id")
                .usageDiscount(0.0)
                .build()

        assertThat(monetaryUsageDiscountAdjustment.id()).isEqualTo("id")
        assertThat(monetaryUsageDiscountAdjustment.adjustmentType())
            .isEqualTo(MonetaryUsageDiscountAdjustment.AdjustmentType.USAGE_DISCOUNT)
        assertThat(monetaryUsageDiscountAdjustment.amount()).isEqualTo("amount")
        assertThat(monetaryUsageDiscountAdjustment.appliesToPriceIds()).containsExactly("string")
        assertThat(monetaryUsageDiscountAdjustment.filters())
            .containsExactly(
                MonetaryUsageDiscountAdjustment.Filter.builder()
                    .field(MonetaryUsageDiscountAdjustment.Filter.Field.PRICE_ID)
                    .operator(MonetaryUsageDiscountAdjustment.Filter.Operator.INCLUDES)
                    .addValue("string")
                    .build()
            )
        assertThat(monetaryUsageDiscountAdjustment.isInvoiceLevel()).isEqualTo(true)
        assertThat(monetaryUsageDiscountAdjustment.reason()).isEqualTo("reason")
        assertThat(monetaryUsageDiscountAdjustment.replacesAdjustmentId())
            .isEqualTo("replaces_adjustment_id")
        assertThat(monetaryUsageDiscountAdjustment.usageDiscount()).isEqualTo(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val monetaryUsageDiscountAdjustment =
            MonetaryUsageDiscountAdjustment.builder()
                .id("id")
                .adjustmentType(MonetaryUsageDiscountAdjustment.AdjustmentType.USAGE_DISCOUNT)
                .amount("amount")
                .addAppliesToPriceId("string")
                .addFilter(
                    MonetaryUsageDiscountAdjustment.Filter.builder()
                        .field(MonetaryUsageDiscountAdjustment.Filter.Field.PRICE_ID)
                        .operator(MonetaryUsageDiscountAdjustment.Filter.Operator.INCLUDES)
                        .addValue("string")
                        .build()
                )
                .isInvoiceLevel(true)
                .reason("reason")
                .replacesAdjustmentId("replaces_adjustment_id")
                .usageDiscount(0.0)
                .build()

        val roundtrippedMonetaryUsageDiscountAdjustment =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(monetaryUsageDiscountAdjustment),
                jacksonTypeRef<MonetaryUsageDiscountAdjustment>(),
            )

        assertThat(roundtrippedMonetaryUsageDiscountAdjustment)
            .isEqualTo(monetaryUsageDiscountAdjustment)
    }
}
