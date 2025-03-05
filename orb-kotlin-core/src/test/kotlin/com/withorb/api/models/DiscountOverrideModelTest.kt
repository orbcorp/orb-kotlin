// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DiscountOverrideModelTest {

    @Test
    fun createDiscountOverrideModel() {
        val discountOverrideModel =
            DiscountOverrideModel.builder()
                .discountType(DiscountOverrideModel.DiscountType.PERCENTAGE)
                .amountDiscount("amount_discount")
                .percentageDiscount(0.15)
                .usageDiscount(0.0)
                .build()
        assertThat(discountOverrideModel).isNotNull
        assertThat(discountOverrideModel.discountType())
            .isEqualTo(DiscountOverrideModel.DiscountType.PERCENTAGE)
        assertThat(discountOverrideModel.amountDiscount()).isEqualTo("amount_discount")
        assertThat(discountOverrideModel.percentageDiscount()).isEqualTo(0.15)
        assertThat(discountOverrideModel.usageDiscount()).isEqualTo(0.0)
    }
}
