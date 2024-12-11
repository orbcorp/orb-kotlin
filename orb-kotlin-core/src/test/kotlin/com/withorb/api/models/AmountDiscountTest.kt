// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AmountDiscountTest {

    @Test
    fun createAmountDiscount() {
        val amountDiscount =
            AmountDiscount.builder()
                .amountDiscount("amount_discount")
                .appliesToPriceIds(listOf("h74gfhdjvn7ujokd", "7hfgtgjnbvc3ujkl"))
                .discountType(AmountDiscount.DiscountType.AMOUNT)
                .reason("reason")
                .build()
        assertThat(amountDiscount).isNotNull
        assertThat(amountDiscount.amountDiscount()).isEqualTo("amount_discount")
        assertThat(amountDiscount.appliesToPriceIds())
            .containsExactly("h74gfhdjvn7ujokd", "7hfgtgjnbvc3ujkl")
        assertThat(amountDiscount.discountType()).isEqualTo(AmountDiscount.DiscountType.AMOUNT)
        assertThat(amountDiscount.reason()).isEqualTo("reason")
    }
}
