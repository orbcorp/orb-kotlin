// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class NewBillingCycleConfigurationModelTest {

    @Test
    fun createNewBillingCycleConfigurationModel() {
        val newBillingCycleConfigurationModel =
            NewBillingCycleConfigurationModel.builder()
                .duration(0L)
                .durationUnit(NewBillingCycleConfigurationModel.DurationUnit.DAY)
                .build()
        assertThat(newBillingCycleConfigurationModel).isNotNull
        assertThat(newBillingCycleConfigurationModel.duration()).isEqualTo(0L)
        assertThat(newBillingCycleConfigurationModel.durationUnit())
            .isEqualTo(NewBillingCycleConfigurationModel.DurationUnit.DAY)
    }
}
