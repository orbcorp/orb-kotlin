// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlanMigrationRetrieveResponseTest {

    @Test
    fun create() {
        val planMigrationRetrieveResponse =
            PlanMigrationRetrieveResponse.builder()
                .id("id")
                .effectiveTime(PlanMigrationRetrieveResponse.EffectiveTime.UnionMember2.END_OF_TERM)
                .planId("plan_id")
                .status(PlanMigrationRetrieveResponse.Status.NOT_STARTED)
                .build()

        assertThat(planMigrationRetrieveResponse.id()).isEqualTo("id")
        assertThat(planMigrationRetrieveResponse.effectiveTime())
            .isEqualTo(
                PlanMigrationRetrieveResponse.EffectiveTime.ofUnionMember2(
                    PlanMigrationRetrieveResponse.EffectiveTime.UnionMember2.END_OF_TERM
                )
            )
        assertThat(planMigrationRetrieveResponse.planId()).isEqualTo("plan_id")
        assertThat(planMigrationRetrieveResponse.status())
            .isEqualTo(PlanMigrationRetrieveResponse.Status.NOT_STARTED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val planMigrationRetrieveResponse =
            PlanMigrationRetrieveResponse.builder()
                .id("id")
                .effectiveTime(PlanMigrationRetrieveResponse.EffectiveTime.UnionMember2.END_OF_TERM)
                .planId("plan_id")
                .status(PlanMigrationRetrieveResponse.Status.NOT_STARTED)
                .build()

        val roundtrippedPlanMigrationRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(planMigrationRetrieveResponse),
                jacksonTypeRef<PlanMigrationRetrieveResponse>(),
            )

        assertThat(roundtrippedPlanMigrationRetrieveResponse)
            .isEqualTo(planMigrationRetrieveResponse)
    }
}
