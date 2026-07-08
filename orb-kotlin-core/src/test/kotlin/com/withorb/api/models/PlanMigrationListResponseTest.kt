// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlanMigrationListResponseTest {

    @Test
    fun create() {
        val planMigrationListResponse =
            PlanMigrationListResponse.builder()
                .id("id")
                .effectiveTime(PlanMigrationListResponse.EffectiveTime.UnionMember2.END_OF_TERM)
                .planId("plan_id")
                .status(PlanMigrationListResponse.Status.NOT_STARTED)
                .build()

        assertThat(planMigrationListResponse.id()).isEqualTo("id")
        assertThat(planMigrationListResponse.effectiveTime())
            .isEqualTo(
                PlanMigrationListResponse.EffectiveTime.ofUnionMember2(
                    PlanMigrationListResponse.EffectiveTime.UnionMember2.END_OF_TERM
                )
            )
        assertThat(planMigrationListResponse.planId()).isEqualTo("plan_id")
        assertThat(planMigrationListResponse.status())
            .isEqualTo(PlanMigrationListResponse.Status.NOT_STARTED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val planMigrationListResponse =
            PlanMigrationListResponse.builder()
                .id("id")
                .effectiveTime(PlanMigrationListResponse.EffectiveTime.UnionMember2.END_OF_TERM)
                .planId("plan_id")
                .status(PlanMigrationListResponse.Status.NOT_STARTED)
                .build()

        val roundtrippedPlanMigrationListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(planMigrationListResponse),
                jacksonTypeRef<PlanMigrationListResponse>(),
            )

        assertThat(roundtrippedPlanMigrationListResponse).isEqualTo(planMigrationListResponse)
    }
}
