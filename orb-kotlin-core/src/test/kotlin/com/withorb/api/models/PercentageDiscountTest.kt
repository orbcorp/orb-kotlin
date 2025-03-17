// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PercentageDiscountTest {

    @Test
    fun createPercentageDiscount() {
        val percentageDiscount =
            PercentageDiscount.builder()
                .addAppliesToPriceId("h74gfhdjvn7ujokd")
                .addAppliesToPriceId("7hfgtgjnbvc3ujkl")
                .discountType(PercentageDiscount.DiscountType.PERCENTAGE)
                .percentageDiscount(0.15)
                .reason("reason")
                .build()
        assertThat(percentageDiscount).isNotNull
        assertThat(percentageDiscount.appliesToPriceIds())
            .containsExactly("h74gfhdjvn7ujokd", "7hfgtgjnbvc3ujkl")
        assertThat(percentageDiscount.discountType())
            .isEqualTo(PercentageDiscount.DiscountType.PERCENTAGE)
        assertThat(percentageDiscount.percentageDiscount()).isEqualTo(0.15)
        assertThat(percentageDiscount.reason()).isEqualTo("reason")
    }
}
