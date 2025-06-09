// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BillingCycleAnchorConfigurationTest {

    @Test
    fun create() {
        val billingCycleAnchorConfiguration =
            BillingCycleAnchorConfiguration.builder().day(1L).month(1L).year(0L).build()

        assertThat(billingCycleAnchorConfiguration.day()).isEqualTo(1L)
        assertThat(billingCycleAnchorConfiguration.month()).isEqualTo(1L)
        assertThat(billingCycleAnchorConfiguration.year()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val billingCycleAnchorConfiguration =
            BillingCycleAnchorConfiguration.builder().day(1L).month(1L).year(0L).build()

        val roundtrippedBillingCycleAnchorConfiguration =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(billingCycleAnchorConfiguration),
                jacksonTypeRef<BillingCycleAnchorConfiguration>(),
            )

        assertThat(roundtrippedBillingCycleAnchorConfiguration)
            .isEqualTo(billingCycleAnchorConfiguration)
    }
}
