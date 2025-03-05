// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PercentageDiscountModelTest {

    @Test
    fun createPercentageDiscountModel() {
        val percentageDiscountModel =
            PercentageDiscountModel.builder()
                .addAppliesToPriceId("h74gfhdjvn7ujokd")
                .addAppliesToPriceId("7hfgtgjnbvc3ujkl")
                .discountType(PercentageDiscountModel.DiscountType.PERCENTAGE)
                .percentageDiscount(0.15)
                .reason("reason")
                .build()
        assertThat(percentageDiscountModel).isNotNull
        assertThat(percentageDiscountModel.appliesToPriceIds())
            .containsExactly("h74gfhdjvn7ujokd", "7hfgtgjnbvc3ujkl")
        assertThat(percentageDiscountModel.discountType())
            .isEqualTo(PercentageDiscountModel.DiscountType.PERCENTAGE)
        assertThat(percentageDiscountModel.percentageDiscount()).isEqualTo(0.15)
        assertThat(percentageDiscountModel.reason()).isEqualTo("reason")
    }
}
