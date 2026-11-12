// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MigrationRetrieveResponseTest {

    @Test
    fun create() {
        val migrationRetrieveResponse =
            MigrationRetrieveResponse.builder()
                .id("id")
                .effectiveTime(MigrationRetrieveResponse.EffectiveTime.UnionMember2.START_OF_TERM)
                .endedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .planId("plan_id")
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(MigrationRetrieveResponse.Status.NOT_STARTED)
                .targetPlanVersionNumber(0L)
                .build()

        assertThat(migrationRetrieveResponse.id()).isEqualTo("id")
        assertThat(migrationRetrieveResponse.effectiveTime())
            .isEqualTo(
                MigrationRetrieveResponse.EffectiveTime.ofUnionMember2(
                    MigrationRetrieveResponse.EffectiveTime.UnionMember2.START_OF_TERM
                )
            )
        assertThat(migrationRetrieveResponse.endedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(migrationRetrieveResponse.planId()).isEqualTo("plan_id")
        assertThat(migrationRetrieveResponse.startedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(migrationRetrieveResponse.status())
            .isEqualTo(MigrationRetrieveResponse.Status.NOT_STARTED)
        assertThat(migrationRetrieveResponse.targetPlanVersionNumber()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val migrationRetrieveResponse =
            MigrationRetrieveResponse.builder()
                .id("id")
                .effectiveTime(MigrationRetrieveResponse.EffectiveTime.UnionMember2.START_OF_TERM)
                .endedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .planId("plan_id")
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(MigrationRetrieveResponse.Status.NOT_STARTED)
                .targetPlanVersionNumber(0L)
                .build()

        val roundtrippedMigrationRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(migrationRetrieveResponse),
                jacksonTypeRef<MigrationRetrieveResponse>(),
            )

        assertThat(roundtrippedMigrationRetrieveResponse).isEqualTo(migrationRetrieveResponse)
    }
}
