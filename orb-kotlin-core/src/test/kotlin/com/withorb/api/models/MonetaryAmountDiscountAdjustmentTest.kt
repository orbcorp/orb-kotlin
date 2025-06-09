// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MonetaryAmountDiscountAdjustmentTest {

    @Test
    fun create() {
        val monetaryAmountDiscountAdjustment =
            MonetaryAmountDiscountAdjustment.builder()
                .id("id")
                .adjustmentType(MonetaryAmountDiscountAdjustment.AdjustmentType.AMOUNT_DISCOUNT)
                .amount("amount")
                .amountDiscount("amount_discount")
                .addAppliesToPriceId("string")
                .addFilter(
                    TransformPriceFilter.builder()
                        .field(TransformPriceFilter.Field.PRICE_ID)
                        .operator(TransformPriceFilter.Operator.INCLUDES)
                        .addValue("string")
                        .build()
                )
                .isInvoiceLevel(true)
                .reason("reason")
                .build()

        assertThat(monetaryAmountDiscountAdjustment.id()).isEqualTo("id")
        assertThat(monetaryAmountDiscountAdjustment.adjustmentType())
            .isEqualTo(MonetaryAmountDiscountAdjustment.AdjustmentType.AMOUNT_DISCOUNT)
        assertThat(monetaryAmountDiscountAdjustment.amount()).isEqualTo("amount")
        assertThat(monetaryAmountDiscountAdjustment.amountDiscount()).isEqualTo("amount_discount")
        assertThat(monetaryAmountDiscountAdjustment.appliesToPriceIds()).containsExactly("string")
        assertThat(monetaryAmountDiscountAdjustment.filters())
            .containsExactly(
                TransformPriceFilter.builder()
                    .field(TransformPriceFilter.Field.PRICE_ID)
                    .operator(TransformPriceFilter.Operator.INCLUDES)
                    .addValue("string")
                    .build()
            )
        assertThat(monetaryAmountDiscountAdjustment.isInvoiceLevel()).isEqualTo(true)
        assertThat(monetaryAmountDiscountAdjustment.reason()).isEqualTo("reason")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val monetaryAmountDiscountAdjustment =
            MonetaryAmountDiscountAdjustment.builder()
                .id("id")
                .adjustmentType(MonetaryAmountDiscountAdjustment.AdjustmentType.AMOUNT_DISCOUNT)
                .amount("amount")
                .amountDiscount("amount_discount")
                .addAppliesToPriceId("string")
                .addFilter(
                    TransformPriceFilter.builder()
                        .field(TransformPriceFilter.Field.PRICE_ID)
                        .operator(TransformPriceFilter.Operator.INCLUDES)
                        .addValue("string")
                        .build()
                )
                .isInvoiceLevel(true)
                .reason("reason")
                .build()

        val roundtrippedMonetaryAmountDiscountAdjustment =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(monetaryAmountDiscountAdjustment),
                jacksonTypeRef<MonetaryAmountDiscountAdjustment>(),
            )

        assertThat(roundtrippedMonetaryAmountDiscountAdjustment)
            .isEqualTo(monetaryAmountDiscountAdjustment)
    }
}
