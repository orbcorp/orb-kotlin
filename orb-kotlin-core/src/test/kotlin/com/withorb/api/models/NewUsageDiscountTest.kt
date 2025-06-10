// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewUsageDiscountTest {

    @Test
    fun create() {
        val newUsageDiscount =
            NewUsageDiscount.builder()
                .adjustmentType(NewUsageDiscount.AdjustmentType.USAGE_DISCOUNT)
                .usageDiscount(0.0)
                .appliesToAll(NewUsageDiscount.AppliesToAll.TRUE)
                .addAppliesToItemId("item_1")
                .addAppliesToItemId("item_2")
                .addAppliesToPriceId("price_1")
                .addAppliesToPriceId("price_2")
                .currency("currency")
                .addFilter(
                    TransformPriceFilter.builder()
                        .field(TransformPriceFilter.Field.PRICE_ID)
                        .operator(TransformPriceFilter.Operator.INCLUDES)
                        .addValue("string")
                        .build()
                )
                .isInvoiceLevel(true)
                .priceType(NewUsageDiscount.PriceType.USAGE)
                .build()

        assertThat(newUsageDiscount.adjustmentType())
            .isEqualTo(NewUsageDiscount.AdjustmentType.USAGE_DISCOUNT)
        assertThat(newUsageDiscount.usageDiscount()).isEqualTo(0.0)
        assertThat(newUsageDiscount.appliesToAll()).isEqualTo(NewUsageDiscount.AppliesToAll.TRUE)
        assertThat(newUsageDiscount.appliesToItemIds()).containsExactly("item_1", "item_2")
        assertThat(newUsageDiscount.appliesToPriceIds()).containsExactly("price_1", "price_2")
        assertThat(newUsageDiscount.currency()).isEqualTo("currency")
        assertThat(newUsageDiscount.filters())
            .containsExactly(
                TransformPriceFilter.builder()
                    .field(TransformPriceFilter.Field.PRICE_ID)
                    .operator(TransformPriceFilter.Operator.INCLUDES)
                    .addValue("string")
                    .build()
            )
        assertThat(newUsageDiscount.isInvoiceLevel()).isEqualTo(true)
        assertThat(newUsageDiscount.priceType()).isEqualTo(NewUsageDiscount.PriceType.USAGE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newUsageDiscount =
            NewUsageDiscount.builder()
                .adjustmentType(NewUsageDiscount.AdjustmentType.USAGE_DISCOUNT)
                .usageDiscount(0.0)
                .appliesToAll(NewUsageDiscount.AppliesToAll.TRUE)
                .addAppliesToItemId("item_1")
                .addAppliesToItemId("item_2")
                .addAppliesToPriceId("price_1")
                .addAppliesToPriceId("price_2")
                .currency("currency")
                .addFilter(
                    TransformPriceFilter.builder()
                        .field(TransformPriceFilter.Field.PRICE_ID)
                        .operator(TransformPriceFilter.Operator.INCLUDES)
                        .addValue("string")
                        .build()
                )
                .isInvoiceLevel(true)
                .priceType(NewUsageDiscount.PriceType.USAGE)
                .build()

        val roundtrippedNewUsageDiscount =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newUsageDiscount),
                jacksonTypeRef<NewUsageDiscount>(),
            )

        assertThat(roundtrippedNewUsageDiscount).isEqualTo(newUsageDiscount)
    }
}
