// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UsageDiscountTest {

    @Test
    fun create() {
        val usageDiscount =
            UsageDiscount.builder()
                .addAppliesToPriceId("h74gfhdjvn7ujokd")
                .addAppliesToPriceId("7hfgtgjnbvc3ujkl")
                .discountType(UsageDiscount.DiscountType.USAGE)
                .usageDiscount(0.0)
                .reason("reason")
                .build()

        assertThat(usageDiscount.appliesToPriceIds())
            .containsExactly("h74gfhdjvn7ujokd", "7hfgtgjnbvc3ujkl")
        assertThat(usageDiscount.discountType()).isEqualTo(UsageDiscount.DiscountType.USAGE)
        assertThat(usageDiscount.usageDiscount()).isEqualTo(0.0)
        assertThat(usageDiscount.reason()).isEqualTo("reason")
    }
}
