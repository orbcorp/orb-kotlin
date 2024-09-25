// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PercentageDiscountTest {

    @Test
    fun createPercentageDiscount() {
        val percentageDiscount =
            PercentageDiscount.builder()
                .appliesToPriceIds(listOf("string"))
                .discountType(PercentageDiscount.DiscountType.PERCENTAGE)
                .percentageDiscount(1.0)
                .reason("reason")
                .build()
        assertThat(percentageDiscount).isNotNull
        assertThat(percentageDiscount.appliesToPriceIds()).containsExactly("string")
        assertThat(percentageDiscount.discountType())
            .isEqualTo(PercentageDiscount.DiscountType.PERCENTAGE)
        assertThat(percentageDiscount.percentageDiscount()).isEqualTo(1.0)
        assertThat(percentageDiscount.reason()).isEqualTo("reason")
    }
}
