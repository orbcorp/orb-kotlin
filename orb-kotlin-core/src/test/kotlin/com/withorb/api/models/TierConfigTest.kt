// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TierConfigTest {

    @Test
    fun create() {
        val tierConfig =
            TierConfig.builder().firstUnit(1.0).lastUnit(1000.0).unitAmount("3.00").build()

        assertThat(tierConfig.firstUnit()).isEqualTo(1.0)
        assertThat(tierConfig.lastUnit()).isEqualTo(1000.0)
        assertThat(tierConfig.unitAmount()).isEqualTo("3.00")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tierConfig =
            TierConfig.builder().firstUnit(1.0).lastUnit(1000.0).unitAmount("3.00").build()

        val roundtrippedTierConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tierConfig),
                jacksonTypeRef<TierConfig>(),
            )

        assertThat(roundtrippedTierConfig).isEqualTo(tierConfig)
    }
}
