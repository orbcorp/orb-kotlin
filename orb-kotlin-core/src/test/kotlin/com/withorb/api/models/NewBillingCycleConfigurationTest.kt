// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewBillingCycleConfigurationTest {

    @Test
    fun create() {
        val newBillingCycleConfiguration =
            NewBillingCycleConfiguration.builder()
                .duration(0L)
                .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                .build()

        assertThat(newBillingCycleConfiguration.duration()).isEqualTo(0L)
        assertThat(newBillingCycleConfiguration.durationUnit())
            .isEqualTo(NewBillingCycleConfiguration.DurationUnit.DAY)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newBillingCycleConfiguration =
            NewBillingCycleConfiguration.builder()
                .duration(0L)
                .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                .build()

        val roundtrippedNewBillingCycleConfiguration =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newBillingCycleConfiguration),
                jacksonTypeRef<NewBillingCycleConfiguration>(),
            )

        assertThat(roundtrippedNewBillingCycleConfiguration).isEqualTo(newBillingCycleConfiguration)
    }
}
