// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TieredConfigTest {

    @Test
    fun create() {
        val tieredConfig =
            TieredConfig.builder()
                .addTier(
                    Tier.builder().firstUnit(0.0).unitAmount("unit_amount").lastUnit(0.0).build()
                )
                .prorated(true)
                .build()

        assertThat(tieredConfig.tiers())
            .containsExactly(
                Tier.builder().firstUnit(0.0).unitAmount("unit_amount").lastUnit(0.0).build()
            )
        assertThat(tieredConfig.prorated()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tieredConfig =
            TieredConfig.builder()
                .addTier(
                    Tier.builder().firstUnit(0.0).unitAmount("unit_amount").lastUnit(0.0).build()
                )
                .prorated(true)
                .build()

        val roundtrippedTieredConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tieredConfig),
                jacksonTypeRef<TieredConfig>(),
            )

        assertThat(roundtrippedTieredConfig).isEqualTo(tieredConfig)
    }
}
