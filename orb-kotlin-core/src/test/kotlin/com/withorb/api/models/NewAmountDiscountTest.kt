// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewAmountDiscountTest {

    @Test
    fun create() {
        val newAmountDiscount =
            NewAmountDiscount.builder()
                .adjustmentType(NewAmountDiscount.AdjustmentType.AMOUNT_DISCOUNT)
                .amountDiscount("amount_discount")
                .appliesToAll(NewAmountDiscount.AppliesToAll.TRUE)
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
                .priceType(NewAmountDiscount.PriceType.USAGE)
                .build()

        assertThat(newAmountDiscount.adjustmentType())
            .isEqualTo(NewAmountDiscount.AdjustmentType.AMOUNT_DISCOUNT)
        assertThat(newAmountDiscount.amountDiscount()).isEqualTo("amount_discount")
        assertThat(newAmountDiscount.appliesToAll()).isEqualTo(NewAmountDiscount.AppliesToAll.TRUE)
        assertThat(newAmountDiscount.appliesToItemIds()).containsExactly("item_1", "item_2")
        assertThat(newAmountDiscount.appliesToPriceIds()).containsExactly("price_1", "price_2")
        assertThat(newAmountDiscount.currency()).isEqualTo("currency")
        assertThat(newAmountDiscount.filters())
            .containsExactly(
                TransformPriceFilter.builder()
                    .field(TransformPriceFilter.Field.PRICE_ID)
                    .operator(TransformPriceFilter.Operator.INCLUDES)
                    .addValue("string")
                    .build()
            )
        assertThat(newAmountDiscount.isInvoiceLevel()).isEqualTo(true)
        assertThat(newAmountDiscount.priceType()).isEqualTo(NewAmountDiscount.PriceType.USAGE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newAmountDiscount =
            NewAmountDiscount.builder()
                .adjustmentType(NewAmountDiscount.AdjustmentType.AMOUNT_DISCOUNT)
                .amountDiscount("amount_discount")
                .appliesToAll(NewAmountDiscount.AppliesToAll.TRUE)
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
                .priceType(NewAmountDiscount.PriceType.USAGE)
                .build()

        val roundtrippedNewAmountDiscount =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newAmountDiscount),
                jacksonTypeRef<NewAmountDiscount>(),
            )

        assertThat(roundtrippedNewAmountDiscount).isEqualTo(newAmountDiscount)
    }
}
