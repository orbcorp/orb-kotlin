// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TrialDiscountTest {

    @Test
    fun create() {
        val trialDiscount =
            TrialDiscount.builder()
                .addAppliesToPriceId("h74gfhdjvn7ujokd")
                .addAppliesToPriceId("7hfgtgjnbvc3ujkl")
                .discountType(TrialDiscount.DiscountType.TRIAL)
                .reason("reason")
                .trialAmountDiscount("trial_amount_discount")
                .trialPercentageDiscount(0.0)
                .build()

        assertThat(trialDiscount.appliesToPriceIds())
            .containsExactly("h74gfhdjvn7ujokd", "7hfgtgjnbvc3ujkl")
        assertThat(trialDiscount.discountType()).isEqualTo(TrialDiscount.DiscountType.TRIAL)
        assertThat(trialDiscount.reason()).isEqualTo("reason")
        assertThat(trialDiscount.trialAmountDiscount()).isEqualTo("trial_amount_discount")
        assertThat(trialDiscount.trialPercentageDiscount()).isEqualTo(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val trialDiscount =
            TrialDiscount.builder()
                .addAppliesToPriceId("h74gfhdjvn7ujokd")
                .addAppliesToPriceId("7hfgtgjnbvc3ujkl")
                .discountType(TrialDiscount.DiscountType.TRIAL)
                .reason("reason")
                .trialAmountDiscount("trial_amount_discount")
                .trialPercentageDiscount(0.0)
                .build()

        val roundtrippedTrialDiscount =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(trialDiscount),
                jacksonTypeRef<TrialDiscount>(),
            )

        assertThat(roundtrippedTrialDiscount).isEqualTo(trialDiscount)
    }
}
