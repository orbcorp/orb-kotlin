// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BulkBpsConfigTest {

    @Test
    fun create() {
        val bulkBpsConfig =
            BulkBpsConfig.builder()
                .addTier(
                    BulkBpsTier.builder()
                        .bps(0.0)
                        .maximumAmount("maximum_amount")
                        .perUnitMaximum("per_unit_maximum")
                        .build()
                )
                .build()

        assertThat(bulkBpsConfig.tiers())
            .containsExactly(
                BulkBpsTier.builder()
                    .bps(0.0)
                    .maximumAmount("maximum_amount")
                    .perUnitMaximum("per_unit_maximum")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val bulkBpsConfig =
            BulkBpsConfig.builder()
                .addTier(
                    BulkBpsTier.builder()
                        .bps(0.0)
                        .maximumAmount("maximum_amount")
                        .perUnitMaximum("per_unit_maximum")
                        .build()
                )
                .build()

        val roundtrippedBulkBpsConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(bulkBpsConfig),
                jacksonTypeRef<BulkBpsConfig>(),
            )

        assertThat(roundtrippedBulkBpsConfig).isEqualTo(bulkBpsConfig)
    }
}
