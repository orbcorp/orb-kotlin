// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlanMigrationRetrieveResponseTest {

    @Test
    fun create() {
        val planMigrationRetrieveResponse =
            PlanMigrationRetrieveResponse.builder()
                .id("id")
                .effectiveTime(LocalDate.parse("2019-12-27"))
                .planId("plan_id")
                .status(PlanMigrationRetrieveResponse.Status.NOT_STARTED)
                .build()

        assertThat(planMigrationRetrieveResponse.id()).isEqualTo("id")
        assertThat(planMigrationRetrieveResponse.effectiveTime())
            .isEqualTo(
                PlanMigrationRetrieveResponse.EffectiveTime.ofLocalDate(
                    LocalDate.parse("2019-12-27")
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
                .effectiveTime(LocalDate.parse("2019-12-27"))
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
