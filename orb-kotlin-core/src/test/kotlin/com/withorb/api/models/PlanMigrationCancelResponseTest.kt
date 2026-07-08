// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlanMigrationCancelResponseTest {

    @Test
    fun create() {
        val planMigrationCancelResponse =
            PlanMigrationCancelResponse.builder()
                .id("id")
                .effectiveTime(PlanMigrationCancelResponse.EffectiveTime.UnionMember2.END_OF_TERM)
                .planId("plan_id")
                .status(PlanMigrationCancelResponse.Status.NOT_STARTED)
                .build()

        assertThat(planMigrationCancelResponse.id()).isEqualTo("id")
        assertThat(planMigrationCancelResponse.effectiveTime())
            .isEqualTo(
                PlanMigrationCancelResponse.EffectiveTime.ofUnionMember2(
                    PlanMigrationCancelResponse.EffectiveTime.UnionMember2.END_OF_TERM
                )
            )
        assertThat(planMigrationCancelResponse.planId()).isEqualTo("plan_id")
        assertThat(planMigrationCancelResponse.status())
            .isEqualTo(PlanMigrationCancelResponse.Status.NOT_STARTED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val planMigrationCancelResponse =
            PlanMigrationCancelResponse.builder()
                .id("id")
                .effectiveTime(PlanMigrationCancelResponse.EffectiveTime.UnionMember2.END_OF_TERM)
                .planId("plan_id")
                .status(PlanMigrationCancelResponse.Status.NOT_STARTED)
                .build()

        val roundtrippedPlanMigrationCancelResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(planMigrationCancelResponse),
                jacksonTypeRef<PlanMigrationCancelResponse>(),
            )

        assertThat(roundtrippedPlanMigrationCancelResponse).isEqualTo(planMigrationCancelResponse)
    }
}
