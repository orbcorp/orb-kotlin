// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MigrationListResponseTest {

    @Test
    fun create() {
        val migrationListResponse =
            MigrationListResponse.builder()
                .id("id")
                .effectiveTime(MigrationListResponse.EffectiveTime.UnionMember2.START_OF_TERM)
                .endedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .planId("plan_id")
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(MigrationListResponse.Status.NOT_STARTED)
                .targetPlanVersionNumber(0L)
                .build()

        assertThat(migrationListResponse.id()).isEqualTo("id")
        assertThat(migrationListResponse.effectiveTime())
            .isEqualTo(
                MigrationListResponse.EffectiveTime.ofUnionMember2(
                    MigrationListResponse.EffectiveTime.UnionMember2.START_OF_TERM
                )
            )
        assertThat(migrationListResponse.endedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(migrationListResponse.planId()).isEqualTo("plan_id")
        assertThat(migrationListResponse.startedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(migrationListResponse.status())
            .isEqualTo(MigrationListResponse.Status.NOT_STARTED)
        assertThat(migrationListResponse.targetPlanVersionNumber()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val migrationListResponse =
            MigrationListResponse.builder()
                .id("id")
                .effectiveTime(MigrationListResponse.EffectiveTime.UnionMember2.START_OF_TERM)
                .endedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .planId("plan_id")
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(MigrationListResponse.Status.NOT_STARTED)
                .targetPlanVersionNumber(0L)
                .build()

        val roundtrippedMigrationListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(migrationListResponse),
                jacksonTypeRef<MigrationListResponse>(),
            )

        assertThat(roundtrippedMigrationListResponse).isEqualTo(migrationListResponse)
    }
}
