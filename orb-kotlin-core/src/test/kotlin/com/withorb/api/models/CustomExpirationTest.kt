// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomExpirationTest {

    @Test
    fun create() {
        val customExpiration =
            CustomExpiration.builder()
                .duration(0L)
                .durationUnit(CustomExpiration.DurationUnit.DAY)
                .build()

        assertThat(customExpiration.duration()).isEqualTo(0L)
        assertThat(customExpiration.durationUnit()).isEqualTo(CustomExpiration.DurationUnit.DAY)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customExpiration =
            CustomExpiration.builder()
                .duration(0L)
                .durationUnit(CustomExpiration.DurationUnit.DAY)
                .build()

        val roundtrippedCustomExpiration =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customExpiration),
                jacksonTypeRef<CustomExpiration>(),
            )

        assertThat(roundtrippedCustomExpiration).isEqualTo(customExpiration)
    }
}
