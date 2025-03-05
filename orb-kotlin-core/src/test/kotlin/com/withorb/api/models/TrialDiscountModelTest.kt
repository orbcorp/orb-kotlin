// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TrialDiscountModelTest {

    @Test
    fun createTrialDiscountModel() {
        val trialDiscountModel =
            TrialDiscountModel.builder()
                .addAppliesToPriceId("h74gfhdjvn7ujokd")
                .addAppliesToPriceId("7hfgtgjnbvc3ujkl")
                .discountType(TrialDiscountModel.DiscountType.TRIAL)
                .reason("reason")
                .trialAmountDiscount("trial_amount_discount")
                .trialPercentageDiscount(0.0)
                .build()
        assertThat(trialDiscountModel).isNotNull
        assertThat(trialDiscountModel.appliesToPriceIds())
            .containsExactly("h74gfhdjvn7ujokd", "7hfgtgjnbvc3ujkl")
        assertThat(trialDiscountModel.discountType())
            .isEqualTo(TrialDiscountModel.DiscountType.TRIAL)
        assertThat(trialDiscountModel.reason()).isEqualTo("reason")
        assertThat(trialDiscountModel.trialAmountDiscount()).isEqualTo("trial_amount_discount")
        assertThat(trialDiscountModel.trialPercentageDiscount()).isEqualTo(0.0)
    }
}
