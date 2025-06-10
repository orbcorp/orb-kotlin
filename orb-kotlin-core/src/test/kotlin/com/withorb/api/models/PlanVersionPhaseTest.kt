// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlanVersionPhaseTest {

    @Test
    fun create() {
        val planVersionPhase =
            PlanVersionPhase.builder()
                .id("id")
                .description("description")
                .duration(0L)
                .durationUnit(PlanVersionPhase.DurationUnit.DAILY)
                .name("name")
                .order(0L)
                .build()

        assertThat(planVersionPhase.id()).isEqualTo("id")
        assertThat(planVersionPhase.description()).isEqualTo("description")
        assertThat(planVersionPhase.duration()).isEqualTo(0L)
        assertThat(planVersionPhase.durationUnit()).isEqualTo(PlanVersionPhase.DurationUnit.DAILY)
        assertThat(planVersionPhase.name()).isEqualTo("name")
        assertThat(planVersionPhase.order()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val planVersionPhase =
            PlanVersionPhase.builder()
                .id("id")
                .description("description")
                .duration(0L)
                .durationUnit(PlanVersionPhase.DurationUnit.DAILY)
                .name("name")
                .order(0L)
                .build()

        val roundtrippedPlanVersionPhase =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(planVersionPhase),
                jacksonTypeRef<PlanVersionPhase>(),
            )

        assertThat(roundtrippedPlanVersionPhase).isEqualTo(planVersionPhase)
    }
}
