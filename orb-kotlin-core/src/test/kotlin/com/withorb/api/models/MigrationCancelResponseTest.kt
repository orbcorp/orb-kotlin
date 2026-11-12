// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MigrationCancelResponseTest {

    @Test
    fun create() {
        val migrationCancelResponse =
            MigrationCancelResponse.builder()
                .id("id")
                .effectiveTime(MigrationCancelResponse.EffectiveTime.UnionMember2.START_OF_TERM)
                .endedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .planId("plan_id")
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(MigrationCancelResponse.Status.NOT_STARTED)
                .targetPlanVersionNumber(0L)
                .build()

        assertThat(migrationCancelResponse.id()).isEqualTo("id")
        assertThat(migrationCancelResponse.effectiveTime())
            .isEqualTo(
                MigrationCancelResponse.EffectiveTime.ofUnionMember2(
                    MigrationCancelResponse.EffectiveTime.UnionMember2.START_OF_TERM
                )
            )
        assertThat(migrationCancelResponse.endedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(migrationCancelResponse.planId()).isEqualTo("plan_id")
        assertThat(migrationCancelResponse.startedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(migrationCancelResponse.status())
            .isEqualTo(MigrationCancelResponse.Status.NOT_STARTED)
        assertThat(migrationCancelResponse.targetPlanVersionNumber()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val migrationCancelResponse =
            MigrationCancelResponse.builder()
                .id("id")
                .effectiveTime(MigrationCancelResponse.EffectiveTime.UnionMember2.START_OF_TERM)
                .endedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .planId("plan_id")
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(MigrationCancelResponse.Status.NOT_STARTED)
                .targetPlanVersionNumber(0L)
                .build()

        val roundtrippedMigrationCancelResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(migrationCancelResponse),
                jacksonTypeRef<MigrationCancelResponse>(),
            )

        assertThat(roundtrippedMigrationCancelResponse).isEqualTo(migrationCancelResponse)
    }
}
