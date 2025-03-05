// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TieredBpsConfigModelTest {

    @Test
    fun createTieredBpsConfigModel() {
        val tieredBpsConfigModel =
            TieredBpsConfigModel.builder()
                .addTier(
                    TieredBpsConfigModel.Tier.builder()
                        .bps(0.0)
                        .minimumAmount("minimum_amount")
                        .maximumAmount("maximum_amount")
                        .perUnitMaximum("per_unit_maximum")
                        .build()
                )
                .build()
        assertThat(tieredBpsConfigModel).isNotNull
        assertThat(tieredBpsConfigModel.tiers())
            .containsExactly(
                TieredBpsConfigModel.Tier.builder()
                    .bps(0.0)
                    .minimumAmount("minimum_amount")
                    .maximumAmount("maximum_amount")
                    .perUnitMaximum("per_unit_maximum")
                    .build()
            )
    }
}
