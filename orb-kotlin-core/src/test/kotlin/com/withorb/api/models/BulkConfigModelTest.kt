// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BulkConfigModelTest {

    @Test
    fun createBulkConfigModel() {
        val bulkConfigModel =
            BulkConfigModel.builder()
                .addTier(
                    BulkConfigModel.Tier.builder()
                        .unitAmount("unit_amount")
                        .maximumUnits(0.0)
                        .build()
                )
                .build()
        assertThat(bulkConfigModel).isNotNull
        assertThat(bulkConfigModel.tiers())
            .containsExactly(
                BulkConfigModel.Tier.builder().unitAmount("unit_amount").maximumUnits(0.0).build()
            )
    }
}
