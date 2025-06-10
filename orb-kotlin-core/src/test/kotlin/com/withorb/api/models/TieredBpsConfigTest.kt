// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TieredBpsConfigTest {

    @Test
    fun create() {
        val tieredBpsConfig =
            TieredBpsConfig.builder()
                .addTier(
                    BpsTier.builder()
                        .bps(0.0)
                        .minimumAmount("minimum_amount")
                        .maximumAmount("maximum_amount")
                        .perUnitMaximum("per_unit_maximum")
                        .build()
                )
                .build()

        assertThat(tieredBpsConfig.tiers())
            .containsExactly(
                BpsTier.builder()
                    .bps(0.0)
                    .minimumAmount("minimum_amount")
                    .maximumAmount("maximum_amount")
                    .perUnitMaximum("per_unit_maximum")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tieredBpsConfig =
            TieredBpsConfig.builder()
                .addTier(
                    BpsTier.builder()
                        .bps(0.0)
                        .minimumAmount("minimum_amount")
                        .maximumAmount("maximum_amount")
                        .perUnitMaximum("per_unit_maximum")
                        .build()
                )
                .build()

        val roundtrippedTieredBpsConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tieredBpsConfig),
                jacksonTypeRef<TieredBpsConfig>(),
            )

        assertThat(roundtrippedTieredBpsConfig).isEqualTo(tieredBpsConfig)
    }
}
