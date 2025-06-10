// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TierTest {

    @Test
    fun create() {
        val tier = Tier.builder().firstUnit(0.0).unitAmount("unit_amount").lastUnit(0.0).build()

        assertThat(tier.firstUnit()).isEqualTo(0.0)
        assertThat(tier.unitAmount()).isEqualTo("unit_amount")
        assertThat(tier.lastUnit()).isEqualTo(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tier = Tier.builder().firstUnit(0.0).unitAmount("unit_amount").lastUnit(0.0).build()

        val roundtrippedTier =
            jsonMapper.readValue(jsonMapper.writeValueAsString(tier), jacksonTypeRef<Tier>())

        assertThat(roundtrippedTier).isEqualTo(tier)
    }
}
