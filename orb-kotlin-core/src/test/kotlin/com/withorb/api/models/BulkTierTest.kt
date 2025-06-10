// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BulkTierTest {

    @Test
    fun create() {
        val bulkTier = BulkTier.builder().unitAmount("unit_amount").maximumUnits(0.0).build()

        assertThat(bulkTier.unitAmount()).isEqualTo("unit_amount")
        assertThat(bulkTier.maximumUnits()).isEqualTo(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val bulkTier = BulkTier.builder().unitAmount("unit_amount").maximumUnits(0.0).build()

        val roundtrippedBulkTier =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(bulkTier),
                jacksonTypeRef<BulkTier>(),
            )

        assertThat(roundtrippedBulkTier).isEqualTo(bulkTier)
    }
}
