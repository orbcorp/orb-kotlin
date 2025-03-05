// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BulkBpsConfigModelTest {

    @Test
    fun createBulkBpsConfigModel() {
        val bulkBpsConfigModel =
            BulkBpsConfigModel.builder()
                .addTier(
                    BulkBpsConfigModel.Tier.builder()
                        .bps(0.0)
                        .maximumAmount("maximum_amount")
                        .perUnitMaximum("per_unit_maximum")
                        .build()
                )
                .build()
        assertThat(bulkBpsConfigModel).isNotNull
        assertThat(bulkBpsConfigModel.tiers())
            .containsExactly(
                BulkBpsConfigModel.Tier.builder()
                    .bps(0.0)
                    .maximumAmount("maximum_amount")
                    .perUnitMaximum("per_unit_maximum")
                    .build()
            )
    }
}
