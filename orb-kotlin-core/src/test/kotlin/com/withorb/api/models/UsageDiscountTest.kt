// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UsageDiscountTest {

    @Test
    fun create() {
        val usageDiscount =
            UsageDiscount.builder()
                .discountType(UsageDiscount.DiscountType.USAGE)
                .usageDiscount(0.0)
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

        assertThat(usageDiscount.discountType()).isEqualTo(UsageDiscount.DiscountType.USAGE)
        assertThat(usageDiscount.usageDiscount()).isEqualTo(0.0)
        assertThat(usageDiscount.appliesToPriceIds())
            .containsExactly("h74gfhdjvn7ujokd", "7hfgtgjnbvc3ujkl")
        assertThat(usageDiscount.filters())
            .containsExactly(
                TransformPriceFilter.builder()
                    .field(TransformPriceFilter.Field.PRICE_ID)
                    .operator(TransformPriceFilter.Operator.INCLUDES)
                    .addValue("string")
                    .build()
            )
        assertThat(usageDiscount.reason()).isEqualTo("reason")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val usageDiscount =
            UsageDiscount.builder()
                .discountType(UsageDiscount.DiscountType.USAGE)
                .usageDiscount(0.0)
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

        val roundtrippedUsageDiscount =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(usageDiscount),
                jacksonTypeRef<UsageDiscount>(),
            )

        assertThat(roundtrippedUsageDiscount).isEqualTo(usageDiscount)
    }
}
