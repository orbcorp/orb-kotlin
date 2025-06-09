// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BpsConfigTest {

    @Test
    fun create() {
        val bpsConfig = BpsConfig.builder().bps(0.0).perUnitMaximum("per_unit_maximum").build()

        assertThat(bpsConfig.bps()).isEqualTo(0.0)
        assertThat(bpsConfig.perUnitMaximum()).isEqualTo("per_unit_maximum")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val bpsConfig = BpsConfig.builder().bps(0.0).perUnitMaximum("per_unit_maximum").build()

        val roundtrippedBpsConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(bpsConfig),
                jacksonTypeRef<BpsConfig>(),
            )

        assertThat(roundtrippedBpsConfig).isEqualTo(bpsConfig)
    }
}
