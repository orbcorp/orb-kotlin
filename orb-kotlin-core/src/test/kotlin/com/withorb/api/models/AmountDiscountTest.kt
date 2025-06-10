// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AmountDiscountTest {

    @Test
    fun create() {
        val amountDiscount =
            AmountDiscount.builder()
                .amountDiscount("amount_discount")
                .discountType(AmountDiscount.DiscountType.AMOUNT)
                .addAppliesToPriceId("h74gfhdjvn7ujokd")
                .addAppliesToPriceId("7hfgtgjnbvc3ujkl")
                .addFilter(
                    TransformPriceFilter.builder()
                        .field(TransformPriceFilter.Field.PRICE_ID)
                        .operator(TransformPriceFilter.Operator.INCLUDES)
                        .addValue("string")
                        .build()
                )
                .reason("reason")
                .build()

        assertThat(amountDiscount.amountDiscount()).isEqualTo("amount_discount")
        assertThat(amountDiscount.discountType()).isEqualTo(AmountDiscount.DiscountType.AMOUNT)
        assertThat(amountDiscount.appliesToPriceIds())
            .containsExactly("h74gfhdjvn7ujokd", "7hfgtgjnbvc3ujkl")
        assertThat(amountDiscount.filters())
            .containsExactly(
                TransformPriceFilter.builder()
                    .field(TransformPriceFilter.Field.PRICE_ID)
                    .operator(TransformPriceFilter.Operator.INCLUDES)
                    .addValue("string")
                    .build()
            )
        assertThat(amountDiscount.reason()).isEqualTo("reason")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val amountDiscount =
            AmountDiscount.builder()
                .amountDiscount("amount_discount")
                .discountType(AmountDiscount.DiscountType.AMOUNT)
                .addAppliesToPriceId("h74gfhdjvn7ujokd")
                .addAppliesToPriceId("7hfgtgjnbvc3ujkl")
                .addFilter(
                    TransformPriceFilter.builder()
                        .field(TransformPriceFilter.Field.PRICE_ID)
                        .operator(TransformPriceFilter.Operator.INCLUDES)
                        .addValue("string")
                        .build()
                )
                .reason("reason")
                .build()

        val roundtrippedAmountDiscount =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(amountDiscount),
                jacksonTypeRef<AmountDiscount>(),
            )

        assertThat(roundtrippedAmountDiscount).isEqualTo(amountDiscount)
    }
}
