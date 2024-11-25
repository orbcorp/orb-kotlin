// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TrialDiscountTest {

    @Test
    fun createTrialDiscount() {
        val trialDiscount =
            TrialDiscount.builder()
                .appliesToPriceIds(listOf("string"))
                .discountType(TrialDiscount.DiscountType.TRIAL)
                .reason("reason")
                .trialAmountDiscount("trial_amount_discount")
                .trialPercentageDiscount(0.0)
                .build()
        assertThat(trialDiscount).isNotNull
        assertThat(trialDiscount.appliesToPriceIds()).containsExactly("string")
        assertThat(trialDiscount.discountType()).isEqualTo(TrialDiscount.DiscountType.TRIAL)
        assertThat(trialDiscount.reason()).isEqualTo("reason")
        assertThat(trialDiscount.trialAmountDiscount()).isEqualTo("trial_amount_discount")
        assertThat(trialDiscount.trialPercentageDiscount()).isEqualTo(0.0)
    }
}
