// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlanDefaultVersionSetWebhookEventTest {

    @Test
    fun create() {
        val planDefaultVersionSetWebhookEvent =
            PlanDefaultVersionSetWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .plan(
                    PlanDefaultVersionSetWebhookEvent.Plan.builder()
                        .id("m2t5akQeh2obwxeU")
                        .externalPlanId("m2t5akQeh2obwxeU")
                        .name("Example plan")
                        .build()
                )
                .properties(
                    PlanDefaultVersionSetWebhookEvent.Properties.builder()
                        .newDefaultVersionNumber(0L)
                        .previousDefaultVersionNumber(0L)
                        .build()
                )
                .type(PlanDefaultVersionSetWebhookEvent.Type.PLAN_DEFAULT_VERSION_SET)
                .build()

        assertThat(planDefaultVersionSetWebhookEvent.id()).isEqualTo("id")
        assertThat(planDefaultVersionSetWebhookEvent.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(planDefaultVersionSetWebhookEvent.plan())
            .isEqualTo(
                PlanDefaultVersionSetWebhookEvent.Plan.builder()
                    .id("m2t5akQeh2obwxeU")
                    .externalPlanId("m2t5akQeh2obwxeU")
                    .name("Example plan")
                    .build()
            )
        assertThat(planDefaultVersionSetWebhookEvent.properties())
            .isEqualTo(
                PlanDefaultVersionSetWebhookEvent.Properties.builder()
                    .newDefaultVersionNumber(0L)
                    .previousDefaultVersionNumber(0L)
                    .build()
            )
        assertThat(planDefaultVersionSetWebhookEvent.type())
            .isEqualTo(PlanDefaultVersionSetWebhookEvent.Type.PLAN_DEFAULT_VERSION_SET)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val planDefaultVersionSetWebhookEvent =
            PlanDefaultVersionSetWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .plan(
                    PlanDefaultVersionSetWebhookEvent.Plan.builder()
                        .id("m2t5akQeh2obwxeU")
                        .externalPlanId("m2t5akQeh2obwxeU")
                        .name("Example plan")
                        .build()
                )
                .properties(
                    PlanDefaultVersionSetWebhookEvent.Properties.builder()
                        .newDefaultVersionNumber(0L)
                        .previousDefaultVersionNumber(0L)
                        .build()
                )
                .type(PlanDefaultVersionSetWebhookEvent.Type.PLAN_DEFAULT_VERSION_SET)
                .build()

        val roundtrippedPlanDefaultVersionSetWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(planDefaultVersionSetWebhookEvent),
                jacksonTypeRef<PlanDefaultVersionSetWebhookEvent>(),
            )

        assertThat(roundtrippedPlanDefaultVersionSetWebhookEvent)
            .isEqualTo(planDefaultVersionSetWebhookEvent)
    }
}
