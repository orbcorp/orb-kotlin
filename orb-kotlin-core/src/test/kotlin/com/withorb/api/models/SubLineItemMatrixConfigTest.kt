// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubLineItemMatrixConfigTest {

    @Test
    fun create() {
        val subLineItemMatrixConfig =
            SubLineItemMatrixConfig.builder().addDimensionValue("string").build()

        assertThat(subLineItemMatrixConfig.dimensionValues()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subLineItemMatrixConfig =
            SubLineItemMatrixConfig.builder().addDimensionValue("string").build()

        val roundtrippedSubLineItemMatrixConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subLineItemMatrixConfig),
                jacksonTypeRef<SubLineItemMatrixConfig>(),
            )

        assertThat(roundtrippedSubLineItemMatrixConfig).isEqualTo(subLineItemMatrixConfig)
    }
}
