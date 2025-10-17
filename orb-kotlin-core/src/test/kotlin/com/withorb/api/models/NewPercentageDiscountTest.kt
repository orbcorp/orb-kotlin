// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewPercentageDiscountTest {

    @Test
    fun create() {
        val newPercentageDiscount =
            NewPercentageDiscount.builder()
                .adjustmentType(NewPercentageDiscount.AdjustmentType.PERCENTAGE_DISCOUNT)
                .percentageDiscount(0.0)
                .appliesToAll(NewPercentageDiscount.AppliesToAll.TRUE)
                .addAppliesToItemId("item_1")
                .addAppliesToItemId("item_2")
                .addAppliesToPriceId("price_1")
                .addAppliesToPriceId("price_2")
                .currency("currency")
                .addFilter(
                    NewPercentageDiscount.Filter.builder()
                        .field(NewPercentageDiscount.Filter.Field.PRICE_ID)
                        .operator(NewPercentageDiscount.Filter.Operator.INCLUDES)
                        .addValue("string")
                        .build()
                )
                .isInvoiceLevel(true)
                .priceType(NewPercentageDiscount.PriceType.USAGE)
                .build()

        assertThat(newPercentageDiscount.adjustmentType())
            .isEqualTo(NewPercentageDiscount.AdjustmentType.PERCENTAGE_DISCOUNT)
        assertThat(newPercentageDiscount.percentageDiscount()).isEqualTo(0.0)
        assertThat(newPercentageDiscount.appliesToAll())
            .isEqualTo(NewPercentageDiscount.AppliesToAll.TRUE)
        assertThat(newPercentageDiscount.appliesToItemIds()).containsExactly("item_1", "item_2")
        assertThat(newPercentageDiscount.appliesToPriceIds()).containsExactly("price_1", "price_2")
        assertThat(newPercentageDiscount.currency()).isEqualTo("currency")
        assertThat(newPercentageDiscount.filters())
            .containsExactly(
                NewPercentageDiscount.Filter.builder()
                    .field(NewPercentageDiscount.Filter.Field.PRICE_ID)
                    .operator(NewPercentageDiscount.Filter.Operator.INCLUDES)
                    .addValue("string")
                    .build()
            )
        assertThat(newPercentageDiscount.isInvoiceLevel()).isEqualTo(true)
        assertThat(newPercentageDiscount.priceType())
            .isEqualTo(NewPercentageDiscount.PriceType.USAGE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newPercentageDiscount =
            NewPercentageDiscount.builder()
                .adjustmentType(NewPercentageDiscount.AdjustmentType.PERCENTAGE_DISCOUNT)
                .percentageDiscount(0.0)
                .appliesToAll(NewPercentageDiscount.AppliesToAll.TRUE)
                .addAppliesToItemId("item_1")
                .addAppliesToItemId("item_2")
                .addAppliesToPriceId("price_1")
                .addAppliesToPriceId("price_2")
                .currency("currency")
                .addFilter(
                    NewPercentageDiscount.Filter.builder()
                        .field(NewPercentageDiscount.Filter.Field.PRICE_ID)
                        .operator(NewPercentageDiscount.Filter.Operator.INCLUDES)
                        .addValue("string")
                        .build()
                )
                .isInvoiceLevel(true)
                .priceType(NewPercentageDiscount.PriceType.USAGE)
                .build()

        val roundtrippedNewPercentageDiscount =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newPercentageDiscount),
                jacksonTypeRef<NewPercentageDiscount>(),
            )

        assertThat(roundtrippedNewPercentageDiscount).isEqualTo(newPercentageDiscount)
    }
}
