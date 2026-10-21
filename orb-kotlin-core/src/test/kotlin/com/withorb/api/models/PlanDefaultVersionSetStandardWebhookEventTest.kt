// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlanDefaultVersionSetStandardWebhookEventTest {

    @Test
    fun create() {
        val planDefaultVersionSetStandardWebhookEvent =
            PlanDefaultVersionSetStandardWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .payloadStyle(PlanDefaultVersionSetStandardWebhookEvent.PayloadStyle.EXPANDED)
                .plan(
                    PlanDefaultVersionSetStandardWebhookEvent.Plan.builder()
                        .id("m2t5akQeh2obwxeU")
                        .externalPlanId("m2t5akQeh2obwxeU")
                        .name("Example plan")
                        .build()
                )
                .properties(
                    PlanDefaultVersionSetStandardWebhookEvent.Properties.builder()
                        .newDefaultVersionNumber(0L)
                        .previousDefaultVersionNumber(0L)
                        .build()
                )
                .type(PlanDefaultVersionSetStandardWebhookEvent.Type.PLAN_DEFAULT_VERSION_SET)
                .build()

        assertThat(planDefaultVersionSetStandardWebhookEvent.id()).isEqualTo("id")
        assertThat(planDefaultVersionSetStandardWebhookEvent.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(planDefaultVersionSetStandardWebhookEvent.payloadStyle())
            .isEqualTo(PlanDefaultVersionSetStandardWebhookEvent.PayloadStyle.EXPANDED)
        assertThat(planDefaultVersionSetStandardWebhookEvent.plan())
            .isEqualTo(
                PlanDefaultVersionSetStandardWebhookEvent.Plan.builder()
                    .id("m2t5akQeh2obwxeU")
                    .externalPlanId("m2t5akQeh2obwxeU")
                    .name("Example plan")
                    .build()
            )
        assertThat(planDefaultVersionSetStandardWebhookEvent.properties())
            .isEqualTo(
                PlanDefaultVersionSetStandardWebhookEvent.Properties.builder()
                    .newDefaultVersionNumber(0L)
                    .previousDefaultVersionNumber(0L)
                    .build()
            )
        assertThat(planDefaultVersionSetStandardWebhookEvent.type())
            .isEqualTo(PlanDefaultVersionSetStandardWebhookEvent.Type.PLAN_DEFAULT_VERSION_SET)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val planDefaultVersionSetStandardWebhookEvent =
            PlanDefaultVersionSetStandardWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .payloadStyle(PlanDefaultVersionSetStandardWebhookEvent.PayloadStyle.EXPANDED)
                .plan(
                    PlanDefaultVersionSetStandardWebhookEvent.Plan.builder()
                        .id("m2t5akQeh2obwxeU")
                        .externalPlanId("m2t5akQeh2obwxeU")
                        .name("Example plan")
                        .build()
                )
                .properties(
                    PlanDefaultVersionSetStandardWebhookEvent.Properties.builder()
                        .newDefaultVersionNumber(0L)
                        .previousDefaultVersionNumber(0L)
                        .build()
                )
                .type(PlanDefaultVersionSetStandardWebhookEvent.Type.PLAN_DEFAULT_VERSION_SET)
                .build()

        val roundtrippedPlanDefaultVersionSetStandardWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(planDefaultVersionSetStandardWebhookEvent),
                jacksonTypeRef<PlanDefaultVersionSetStandardWebhookEvent>(),
            )

        assertThat(roundtrippedPlanDefaultVersionSetStandardWebhookEvent)
            .isEqualTo(planDefaultVersionSetStandardWebhookEvent)
    }
}
