// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlanCreatedWebhookEventTest {

    @Test
    fun create() {
        val planCreatedWebhookEvent =
            PlanCreatedWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .payloadStyle(PlanCreatedWebhookEvent.PayloadStyle.EXPANDED)
                .plan(
                    PlanCreatedWebhookEvent.Plan.builder()
                        .id("m2t5akQeh2obwxeU")
                        .externalPlanId("m2t5akQeh2obwxeU")
                        .name("Example plan")
                        .build()
                )
                .properties(JsonValue.from(mapOf<String, Any>()))
                .type(PlanCreatedWebhookEvent.Type.PLAN_CREATED)
                .build()

        assertThat(planCreatedWebhookEvent.id()).isEqualTo("id")
        assertThat(planCreatedWebhookEvent.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(planCreatedWebhookEvent.payloadStyle())
            .isEqualTo(PlanCreatedWebhookEvent.PayloadStyle.EXPANDED)
        assertThat(planCreatedWebhookEvent.plan())
            .isEqualTo(
                PlanCreatedWebhookEvent.Plan.builder()
                    .id("m2t5akQeh2obwxeU")
                    .externalPlanId("m2t5akQeh2obwxeU")
                    .name("Example plan")
                    .build()
            )
        assertThat(planCreatedWebhookEvent._properties())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(planCreatedWebhookEvent.type())
            .isEqualTo(PlanCreatedWebhookEvent.Type.PLAN_CREATED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val planCreatedWebhookEvent =
            PlanCreatedWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .payloadStyle(PlanCreatedWebhookEvent.PayloadStyle.EXPANDED)
                .plan(
                    PlanCreatedWebhookEvent.Plan.builder()
                        .id("m2t5akQeh2obwxeU")
                        .externalPlanId("m2t5akQeh2obwxeU")
                        .name("Example plan")
                        .build()
                )
                .properties(JsonValue.from(mapOf<String, Any>()))
                .type(PlanCreatedWebhookEvent.Type.PLAN_CREATED)
                .build()

        val roundtrippedPlanCreatedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(planCreatedWebhookEvent),
                jacksonTypeRef<PlanCreatedWebhookEvent>(),
            )

        assertThat(roundtrippedPlanCreatedWebhookEvent).isEqualTo(planCreatedWebhookEvent)
    }
}
