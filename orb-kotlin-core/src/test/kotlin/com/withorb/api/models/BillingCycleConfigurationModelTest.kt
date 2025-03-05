// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BillingCycleConfigurationModelTest {

    @Test
    fun createBillingCycleConfigurationModel() {
        val billingCycleConfigurationModel =
            BillingCycleConfigurationModel.builder()
                .duration(0L)
                .durationUnit(BillingCycleConfigurationModel.DurationUnit.DAY)
                .build()
        assertThat(billingCycleConfigurationModel).isNotNull
        assertThat(billingCycleConfigurationModel.duration()).isEqualTo(0L)
        assertThat(billingCycleConfigurationModel.durationUnit())
            .isEqualTo(BillingCycleConfigurationModel.DurationUnit.DAY)
    }
}
