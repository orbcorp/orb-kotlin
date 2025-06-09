// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DiscountOverrideTest {

    @Test
    fun create() {
        val discountOverride =
            DiscountOverride.builder()
                .discountType(DiscountOverride.DiscountType.PERCENTAGE)
                .amountDiscount("amount_discount")
                .percentageDiscount(0.15)
                .usageDiscount(0.0)
                .build()

        assertThat(discountOverride.discountType())
            .isEqualTo(DiscountOverride.DiscountType.PERCENTAGE)
        assertThat(discountOverride.amountDiscount()).isEqualTo("amount_discount")
        assertThat(discountOverride.percentageDiscount()).isEqualTo(0.15)
        assertThat(discountOverride.usageDiscount()).isEqualTo(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val discountOverride =
            DiscountOverride.builder()
                .discountType(DiscountOverride.DiscountType.PERCENTAGE)
                .amountDiscount("amount_discount")
                .percentageDiscount(0.15)
                .usageDiscount(0.0)
                .build()

        val roundtrippedDiscountOverride =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(discountOverride),
                jacksonTypeRef<DiscountOverride>(),
            )

        assertThat(roundtrippedDiscountOverride).isEqualTo(discountOverride)
    }
}
