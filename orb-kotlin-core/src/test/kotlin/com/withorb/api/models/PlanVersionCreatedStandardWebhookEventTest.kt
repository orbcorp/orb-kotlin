// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlanVersionCreatedStandardWebhookEventTest {

    @Test
    fun create() {
        val planVersionCreatedStandardWebhookEvent =
            PlanVersionCreatedStandardWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .payloadStyle(PlanVersionCreatedStandardWebhookEvent.PayloadStyle.EXPANDED)
                .plan(
                    PlanVersionCreatedStandardWebhookEvent.Plan.builder()
                        .id("m2t5akQeh2obwxeU")
                        .externalPlanId("m2t5akQeh2obwxeU")
                        .name("Example plan")
                        .build()
                )
                .properties(
                    PlanVersionCreatedStandardWebhookEvent.Properties.builder()
                        .planVersionDescription("plan_version_description")
                        .planVersionNumber(0L)
                        .build()
                )
                .type(PlanVersionCreatedStandardWebhookEvent.Type.PLAN_VERSION_CREATED)
                .build()

        assertThat(planVersionCreatedStandardWebhookEvent.id()).isEqualTo("id")
        assertThat(planVersionCreatedStandardWebhookEvent.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(planVersionCreatedStandardWebhookEvent.payloadStyle())
            .isEqualTo(PlanVersionCreatedStandardWebhookEvent.PayloadStyle.EXPANDED)
        assertThat(planVersionCreatedStandardWebhookEvent.plan())
            .isEqualTo(
                PlanVersionCreatedStandardWebhookEvent.Plan.builder()
                    .id("m2t5akQeh2obwxeU")
                    .externalPlanId("m2t5akQeh2obwxeU")
                    .name("Example plan")
                    .build()
            )
        assertThat(planVersionCreatedStandardWebhookEvent.properties())
            .isEqualTo(
                PlanVersionCreatedStandardWebhookEvent.Properties.builder()
                    .planVersionDescription("plan_version_description")
                    .planVersionNumber(0L)
                    .build()
            )
        assertThat(planVersionCreatedStandardWebhookEvent.type())
            .isEqualTo(PlanVersionCreatedStandardWebhookEvent.Type.PLAN_VERSION_CREATED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val planVersionCreatedStandardWebhookEvent =
            PlanVersionCreatedStandardWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .payloadStyle(PlanVersionCreatedStandardWebhookEvent.PayloadStyle.EXPANDED)
                .plan(
                    PlanVersionCreatedStandardWebhookEvent.Plan.builder()
                        .id("m2t5akQeh2obwxeU")
                        .externalPlanId("m2t5akQeh2obwxeU")
                        .name("Example plan")
                        .build()
                )
                .properties(
                    PlanVersionCreatedStandardWebhookEvent.Properties.builder()
                        .planVersionDescription("plan_version_description")
                        .planVersionNumber(0L)
                        .build()
                )
                .type(PlanVersionCreatedStandardWebhookEvent.Type.PLAN_VERSION_CREATED)
                .build()

        val roundtrippedPlanVersionCreatedStandardWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(planVersionCreatedStandardWebhookEvent),
                jacksonTypeRef<PlanVersionCreatedStandardWebhookEvent>(),
            )

        assertThat(roundtrippedPlanVersionCreatedStandardWebhookEvent)
            .isEqualTo(planVersionCreatedStandardWebhookEvent)
    }
}
