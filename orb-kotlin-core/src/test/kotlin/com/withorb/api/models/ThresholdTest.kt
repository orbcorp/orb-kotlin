// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ThresholdTest {

    @Test
    fun create() {
        val threshold = Threshold.builder().value(0.0).build()

        assertThat(threshold.value()).isEqualTo(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val threshold = Threshold.builder().value(0.0).build()

        val roundtrippedThreshold =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(threshold),
                jacksonTypeRef<Threshold>(),
            )

        assertThat(roundtrippedThreshold).isEqualTo(threshold)
    }
}
