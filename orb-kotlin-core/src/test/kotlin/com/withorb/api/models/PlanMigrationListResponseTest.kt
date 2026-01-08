// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlanMigrationListResponseTest {

    @Test
    fun create() {
        val planMigrationListResponse =
            PlanMigrationListResponse.builder()
                .id("id")
                .effectiveTime(LocalDate.parse("2019-12-27"))
                .planId("plan_id")
                .status(PlanMigrationListResponse.Status.NOT_STARTED)
                .build()

        assertThat(planMigrationListResponse.id()).isEqualTo("id")
        assertThat(planMigrationListResponse.effectiveTime())
            .isEqualTo(
                PlanMigrationListResponse.EffectiveTime.ofLocalDate(LocalDate.parse("2019-12-27"))
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
                .effectiveTime(LocalDate.parse("2019-12-27"))
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
