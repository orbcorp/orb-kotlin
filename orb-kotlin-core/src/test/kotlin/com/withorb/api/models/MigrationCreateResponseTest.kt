// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MigrationCreateResponseTest {

    @Test
    fun create() {
        val migrationCreateResponse =
            MigrationCreateResponse.builder()
                .id("id")
                .effectiveTime(MigrationCreateResponse.EffectiveTime.UnionMember2.START_OF_TERM)
                .endedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .planId("plan_id")
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(MigrationCreateResponse.Status.NOT_STARTED)
                .targetPlanVersionNumber(0L)
                .build()

        assertThat(migrationCreateResponse.id()).isEqualTo("id")
        assertThat(migrationCreateResponse.effectiveTime())
            .isEqualTo(
                MigrationCreateResponse.EffectiveTime.ofUnionMember2(
                    MigrationCreateResponse.EffectiveTime.UnionMember2.START_OF_TERM
                )
            )
        assertThat(migrationCreateResponse.endedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(migrationCreateResponse.planId()).isEqualTo("plan_id")
        assertThat(migrationCreateResponse.startedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(migrationCreateResponse.status())
            .isEqualTo(MigrationCreateResponse.Status.NOT_STARTED)
        assertThat(migrationCreateResponse.targetPlanVersionNumber()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val migrationCreateResponse =
            MigrationCreateResponse.builder()
                .id("id")
                .effectiveTime(MigrationCreateResponse.EffectiveTime.UnionMember2.START_OF_TERM)
                .endedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .planId("plan_id")
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(MigrationCreateResponse.Status.NOT_STARTED)
                .targetPlanVersionNumber(0L)
                .build()

        val roundtrippedMigrationCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(migrationCreateResponse),
                jacksonTypeRef<MigrationCreateResponse>(),
            )

        assertThat(roundtrippedMigrationCreateResponse).isEqualTo(migrationCreateResponse)
    }
}
