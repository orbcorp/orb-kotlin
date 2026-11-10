// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlanMigrationCancelResponseTest {

    @Test
    fun create() {
        val planMigrationCancelResponse =
            PlanMigrationCancelResponse.builder()
                .id("id")
                .effectiveTime(PlanMigrationCancelResponse.EffectiveTime.UnionMember2.START_OF_TERM)
                .endedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .planId("plan_id")
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(PlanMigrationCancelResponse.Status.NOT_STARTED)
                .targetPlanVersionNumber(0L)
                .build()

        assertThat(planMigrationCancelResponse.id()).isEqualTo("id")
        assertThat(planMigrationCancelResponse.effectiveTime())
            .isEqualTo(
                PlanMigrationCancelResponse.EffectiveTime.ofUnionMember2(
                    PlanMigrationCancelResponse.EffectiveTime.UnionMember2.START_OF_TERM
                )
            )
        assertThat(planMigrationCancelResponse.endedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(planMigrationCancelResponse.planId()).isEqualTo("plan_id")
        assertThat(planMigrationCancelResponse.startedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(planMigrationCancelResponse.status())
            .isEqualTo(PlanMigrationCancelResponse.Status.NOT_STARTED)
        assertThat(planMigrationCancelResponse.targetPlanVersionNumber()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val planMigrationCancelResponse =
            PlanMigrationCancelResponse.builder()
                .id("id")
                .effectiveTime(PlanMigrationCancelResponse.EffectiveTime.UnionMember2.START_OF_TERM)
                .endedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .planId("plan_id")
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(PlanMigrationCancelResponse.Status.NOT_STARTED)
                .targetPlanVersionNumber(0L)
                .build()

        val roundtrippedPlanMigrationCancelResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(planMigrationCancelResponse),
                jacksonTypeRef<PlanMigrationCancelResponse>(),
            )

        assertThat(roundtrippedPlanMigrationCancelResponse).isEqualTo(planMigrationCancelResponse)
    }
}
