// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlanVersionCreatedWebhookEventTest {

    @Test
    fun create() {
        val planVersionCreatedWebhookEvent =
            PlanVersionCreatedWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .plan(
                    PlanVersionCreatedWebhookEvent.Plan.builder()
                        .id("m2t5akQeh2obwxeU")
                        .externalPlanId("m2t5akQeh2obwxeU")
                        .name("Example plan")
                        .build()
                )
                .properties(
                    PlanVersionCreatedWebhookEvent.Properties.builder()
                        .planVersionDescription("plan_version_description")
                        .planVersionNumber(0L)
                        .build()
                )
                .type(PlanVersionCreatedWebhookEvent.Type.PLAN_VERSION_CREATED)
                .build()

        assertThat(planVersionCreatedWebhookEvent.id()).isEqualTo("id")
        assertThat(planVersionCreatedWebhookEvent.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(planVersionCreatedWebhookEvent.plan())
            .isEqualTo(
                PlanVersionCreatedWebhookEvent.Plan.builder()
                    .id("m2t5akQeh2obwxeU")
                    .externalPlanId("m2t5akQeh2obwxeU")
                    .name("Example plan")
                    .build()
            )
        assertThat(planVersionCreatedWebhookEvent.properties())
            .isEqualTo(
                PlanVersionCreatedWebhookEvent.Properties.builder()
                    .planVersionDescription("plan_version_description")
                    .planVersionNumber(0L)
                    .build()
            )
        assertThat(planVersionCreatedWebhookEvent.type())
            .isEqualTo(PlanVersionCreatedWebhookEvent.Type.PLAN_VERSION_CREATED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val planVersionCreatedWebhookEvent =
            PlanVersionCreatedWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .plan(
                    PlanVersionCreatedWebhookEvent.Plan.builder()
                        .id("m2t5akQeh2obwxeU")
                        .externalPlanId("m2t5akQeh2obwxeU")
                        .name("Example plan")
                        .build()
                )
                .properties(
                    PlanVersionCreatedWebhookEvent.Properties.builder()
                        .planVersionDescription("plan_version_description")
                        .planVersionNumber(0L)
                        .build()
                )
                .type(PlanVersionCreatedWebhookEvent.Type.PLAN_VERSION_CREATED)
                .build()

        val roundtrippedPlanVersionCreatedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(planVersionCreatedWebhookEvent),
                jacksonTypeRef<PlanVersionCreatedWebhookEvent>(),
            )

        assertThat(roundtrippedPlanVersionCreatedWebhookEvent)
            .isEqualTo(planVersionCreatedWebhookEvent)
    }
}
