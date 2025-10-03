// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UnitConfigTest {

    @Test
    fun create() {
        val unitConfig = UnitConfig.builder().unitAmount("unit_amount").build()

        assertThat(unitConfig.unitAmount()).isEqualTo("unit_amount")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val unitConfig = UnitConfig.builder().unitAmount("unit_amount").build()

        val roundtrippedUnitConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unitConfig),
                jacksonTypeRef<UnitConfig>(),
            )

        assertThat(roundtrippedUnitConfig).isEqualTo(unitConfig)
    }
}
