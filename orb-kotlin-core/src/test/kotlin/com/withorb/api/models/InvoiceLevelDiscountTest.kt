// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvoiceLevelDiscountTest {

    @Test
    fun ofPercentage() {
        val percentage =
            PercentageDiscount.builder()
                .addAppliesToPriceId("h74gfhdjvn7ujokd")
                .addAppliesToPriceId("7hfgtgjnbvc3ujkl")
                .discountType(PercentageDiscount.DiscountType.PERCENTAGE)
                .percentageDiscount(0.15)
                .build()

        val invoiceLevelDiscount = InvoiceLevelDiscount.ofPercentage(percentage)

        assertThat(invoiceLevelDiscount.percentage()).isEqualTo(percentage)
        assertThat(invoiceLevelDiscount.amount()).isNull()
        assertThat(invoiceLevelDiscount.trial()).isNull()
    }

    @Test
    fun ofAmount() {
        val amount =
            AmountDiscount.builder()
                .amountDiscount("amount_discount")
                .addAppliesToPriceId("h74gfhdjvn7ujokd")
                .addAppliesToPriceId("7hfgtgjnbvc3ujkl")
                .discountType(AmountDiscount.DiscountType.AMOUNT)
                .build()

        val invoiceLevelDiscount = InvoiceLevelDiscount.ofAmount(amount)

        assertThat(invoiceLevelDiscount.percentage()).isNull()
        assertThat(invoiceLevelDiscount.amount()).isEqualTo(amount)
        assertThat(invoiceLevelDiscount.trial()).isNull()
    }

    @Test
    fun ofTrial() {
        val trial =
            TrialDiscount.builder()
                .addAppliesToPriceId("h74gfhdjvn7ujokd")
                .addAppliesToPriceId("7hfgtgjnbvc3ujkl")
                .discountType(TrialDiscount.DiscountType.TRIAL)
                .build()

        val invoiceLevelDiscount = InvoiceLevelDiscount.ofTrial(trial)

        assertThat(invoiceLevelDiscount.percentage()).isNull()
        assertThat(invoiceLevelDiscount.amount()).isNull()
        assertThat(invoiceLevelDiscount.trial()).isEqualTo(trial)
    }
}
