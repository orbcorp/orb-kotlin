// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BulkConfigTest {

    @Test
    fun create() {
        val bulkConfig =
            BulkConfig.builder()
                .addTier(BulkTier.builder().unitAmount("unit_amount").maximumUnits(0.0).build())
                .build()

        assertThat(bulkConfig.tiers())
            .containsExactly(BulkTier.builder().unitAmount("unit_amount").maximumUnits(0.0).build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val bulkConfig =
            BulkConfig.builder()
                .addTier(BulkTier.builder().unitAmount("unit_amount").maximumUnits(0.0).build())
                .build()

        val roundtrippedBulkConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(bulkConfig),
                jacksonTypeRef<BulkConfig>(),
            )

        assertThat(roundtrippedBulkConfig).isEqualTo(bulkConfig)
    }
}
