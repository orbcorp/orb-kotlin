// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AmountDiscountModelTest {

    @Test
    fun createAmountDiscountModel() {
        val amountDiscountModel =
            AmountDiscountModel.builder()
                .amountDiscount("amount_discount")
                .addAppliesToPriceId("h74gfhdjvn7ujokd")
                .addAppliesToPriceId("7hfgtgjnbvc3ujkl")
                .discountType(AmountDiscountModel.DiscountType.AMOUNT)
                .reason("reason")
                .build()
        assertThat(amountDiscountModel).isNotNull
        assertThat(amountDiscountModel.amountDiscount()).isEqualTo("amount_discount")
        assertThat(amountDiscountModel.appliesToPriceIds())
            .containsExactly("h74gfhdjvn7ujokd", "7hfgtgjnbvc3ujkl")
        assertThat(amountDiscountModel.discountType())
            .isEqualTo(AmountDiscountModel.DiscountType.AMOUNT)
        assertThat(amountDiscountModel.reason()).isEqualTo("reason")
    }
}
