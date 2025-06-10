// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BillingCycleConfigurationTest {

    @Test
    fun create() {
        val billingCycleConfiguration =
            BillingCycleConfiguration.builder()
                .duration(0L)
                .durationUnit(BillingCycleConfiguration.DurationUnit.DAY)
                .build()

        assertThat(billingCycleConfiguration.duration()).isEqualTo(0L)
        assertThat(billingCycleConfiguration.durationUnit())
            .isEqualTo(BillingCycleConfiguration.DurationUnit.DAY)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val billingCycleConfiguration =
            BillingCycleConfiguration.builder()
                .duration(0L)
                .durationUnit(BillingCycleConfiguration.DurationUnit.DAY)
                .build()

        val roundtrippedBillingCycleConfiguration =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(billingCycleConfiguration),
                jacksonTypeRef<BillingCycleConfiguration>(),
            )

        assertThat(roundtrippedBillingCycleConfiguration).isEqualTo(billingCycleConfiguration)
    }
}
