// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TieredConfigModelTest {

    @Test
    fun createTieredConfigModel() {
        val tieredConfigModel =
            TieredConfigModel.builder()
                .addTier(
                    TieredConfigModel.Tier.builder()
                        .firstUnit(0.0)
                        .unitAmount("unit_amount")
                        .lastUnit(0.0)
                        .build()
                )
                .build()
        assertThat(tieredConfigModel).isNotNull
        assertThat(tieredConfigModel.tiers())
            .containsExactly(
                TieredConfigModel.Tier.builder()
                    .firstUnit(0.0)
                    .unitAmount("unit_amount")
                    .lastUnit(0.0)
                    .build()
            )
    }
}
