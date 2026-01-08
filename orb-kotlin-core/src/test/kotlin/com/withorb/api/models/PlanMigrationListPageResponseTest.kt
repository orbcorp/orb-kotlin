// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlanMigrationListPageResponseTest {

    @Test
    fun create() {
        val planMigrationListPageResponse =
            PlanMigrationListPageResponse.builder()
                .addData(
                    PlanMigrationListResponse.builder()
                        .id("id")
                        .effectiveTime(LocalDate.parse("2019-12-27"))
                        .planId("plan_id")
                        .status(PlanMigrationListResponse.Status.NOT_STARTED)
                        .build()
                )
                .paginationMetadata(
                    PaginationMetadata.builder().hasMore(true).nextCursor("next_cursor").build()
                )
                .build()

        assertThat(planMigrationListPageResponse.data())
            .containsExactly(
                PlanMigrationListResponse.builder()
                    .id("id")
                    .effectiveTime(LocalDate.parse("2019-12-27"))
                    .planId("plan_id")
                    .status(PlanMigrationListResponse.Status.NOT_STARTED)
                    .build()
            )
        assertThat(planMigrationListPageResponse.paginationMetadata())
            .isEqualTo(PaginationMetadata.builder().hasMore(true).nextCursor("next_cursor").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val planMigrationListPageResponse =
            PlanMigrationListPageResponse.builder()
                .addData(
                    PlanMigrationListResponse.builder()
                        .id("id")
                        .effectiveTime(LocalDate.parse("2019-12-27"))
                        .planId("plan_id")
                        .status(PlanMigrationListResponse.Status.NOT_STARTED)
                        .build()
                )
                .paginationMetadata(
                    PaginationMetadata.builder().hasMore(true).nextCursor("next_cursor").build()
                )
                .build()

        val roundtrippedPlanMigrationListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(planMigrationListPageResponse),
                jacksonTypeRef<PlanMigrationListPageResponse>(),
            )

        assertThat(roundtrippedPlanMigrationListPageResponse)
            .isEqualTo(planMigrationListPageResponse)
    }
}
