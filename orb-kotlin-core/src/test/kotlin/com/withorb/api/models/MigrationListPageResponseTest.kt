// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MigrationListPageResponseTest {

    @Test
    fun create() {
        val migrationListPageResponse =
            MigrationListPageResponse.builder()
                .addData(
                    MigrationListResponse.builder()
                        .id("id")
                        .effectiveTime(
                            MigrationListResponse.EffectiveTime.UnionMember2.START_OF_TERM
                        )
                        .endedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .planId("plan_id")
                        .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(MigrationListResponse.Status.NOT_STARTED)
                        .targetPlanVersionNumber(0L)
                        .build()
                )
                .paginationMetadata(
                    PaginationMetadata.builder().hasMore(true).nextCursor("next_cursor").build()
                )
                .build()

        assertThat(migrationListPageResponse.data())
            .containsExactly(
                MigrationListResponse.builder()
                    .id("id")
                    .effectiveTime(MigrationListResponse.EffectiveTime.UnionMember2.START_OF_TERM)
                    .endedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .planId("plan_id")
                    .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .status(MigrationListResponse.Status.NOT_STARTED)
                    .targetPlanVersionNumber(0L)
                    .build()
            )
        assertThat(migrationListPageResponse.paginationMetadata())
            .isEqualTo(PaginationMetadata.builder().hasMore(true).nextCursor("next_cursor").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val migrationListPageResponse =
            MigrationListPageResponse.builder()
                .addData(
                    MigrationListResponse.builder()
                        .id("id")
                        .effectiveTime(
                            MigrationListResponse.EffectiveTime.UnionMember2.START_OF_TERM
                        )
                        .endedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .planId("plan_id")
                        .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(MigrationListResponse.Status.NOT_STARTED)
                        .targetPlanVersionNumber(0L)
                        .build()
                )
                .paginationMetadata(
                    PaginationMetadata.builder().hasMore(true).nextCursor("next_cursor").build()
                )
                .build()

        val roundtrippedMigrationListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(migrationListPageResponse),
                jacksonTypeRef<MigrationListPageResponse>(),
            )

        assertThat(roundtrippedMigrationListPageResponse).isEqualTo(migrationListPageResponse)
    }
}
