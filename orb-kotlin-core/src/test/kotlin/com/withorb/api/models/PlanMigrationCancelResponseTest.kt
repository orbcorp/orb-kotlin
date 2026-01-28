// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlanMigrationCancelResponseTest {

    @Test
    fun create() {
        val planMigrationCancelResponse =
            PlanMigrationCancelResponse.builder()
                .id("id")
                .effectiveTime(LocalDate.parse("2019-12-27"))
                .planId("plan_id")
                .status(PlanMigrationCancelResponse.Status.NOT_STARTED)
                .build()

        assertThat(planMigrationCancelResponse.id()).isEqualTo("id")
        assertThat(planMigrationCancelResponse.effectiveTime())
            .isEqualTo(
                PlanMigrationCancelResponse.EffectiveTime.ofLocalDate(LocalDate.parse("2019-12-27"))
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
                .effectiveTime(LocalDate.parse("2019-12-27"))
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
