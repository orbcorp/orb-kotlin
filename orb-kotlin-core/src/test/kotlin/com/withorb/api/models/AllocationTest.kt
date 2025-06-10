// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AllocationTest {

    @Test
    fun create() {
        val allocation =
            Allocation.builder()
                .allowsRollover(true)
                .currency("currency")
                .customExpiration(
                    CustomExpiration.builder()
                        .duration(0L)
                        .durationUnit(CustomExpiration.DurationUnit.DAY)
                        .build()
                )
                .build()

        assertThat(allocation.allowsRollover()).isEqualTo(true)
        assertThat(allocation.currency()).isEqualTo("currency")
        assertThat(allocation.customExpiration())
            .isEqualTo(
                CustomExpiration.builder()
                    .duration(0L)
                    .durationUnit(CustomExpiration.DurationUnit.DAY)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val allocation =
            Allocation.builder()
                .allowsRollover(true)
                .currency("currency")
                .customExpiration(
                    CustomExpiration.builder()
                        .duration(0L)
                        .durationUnit(CustomExpiration.DurationUnit.DAY)
                        .build()
                )
                .build()

        val roundtrippedAllocation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(allocation),
                jacksonTypeRef<Allocation>(),
            )

        assertThat(roundtrippedAllocation).isEqualTo(allocation)
    }
}
