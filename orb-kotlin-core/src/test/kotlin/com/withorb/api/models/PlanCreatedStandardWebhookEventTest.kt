// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlanCreatedStandardWebhookEventTest {

    @Test
    fun create() {
        val planCreatedStandardWebhookEvent =
            PlanCreatedStandardWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .payloadStyle(PlanCreatedStandardWebhookEvent.PayloadStyle.EXPANDED)
                .plan(
                    PlanCreatedStandardWebhookEvent.Plan.builder()
                        .id("m2t5akQeh2obwxeU")
                        .externalPlanId("m2t5akQeh2obwxeU")
                        .name("Example plan")
                        .build()
                )
                .properties(JsonValue.from(mapOf<String, Any>()))
                .type(PlanCreatedStandardWebhookEvent.Type.PLAN_CREATED)
                .build()

        assertThat(planCreatedStandardWebhookEvent.id()).isEqualTo("id")
        assertThat(planCreatedStandardWebhookEvent.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(planCreatedStandardWebhookEvent.payloadStyle())
            .isEqualTo(PlanCreatedStandardWebhookEvent.PayloadStyle.EXPANDED)
        assertThat(planCreatedStandardWebhookEvent.plan())
            .isEqualTo(
                PlanCreatedStandardWebhookEvent.Plan.builder()
                    .id("m2t5akQeh2obwxeU")
                    .externalPlanId("m2t5akQeh2obwxeU")
                    .name("Example plan")
                    .build()
            )
        assertThat(planCreatedStandardWebhookEvent._properties())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(planCreatedStandardWebhookEvent.type())
            .isEqualTo(PlanCreatedStandardWebhookEvent.Type.PLAN_CREATED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val planCreatedStandardWebhookEvent =
            PlanCreatedStandardWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .payloadStyle(PlanCreatedStandardWebhookEvent.PayloadStyle.EXPANDED)
                .plan(
                    PlanCreatedStandardWebhookEvent.Plan.builder()
                        .id("m2t5akQeh2obwxeU")
                        .externalPlanId("m2t5akQeh2obwxeU")
                        .name("Example plan")
                        .build()
                )
                .properties(JsonValue.from(mapOf<String, Any>()))
                .type(PlanCreatedStandardWebhookEvent.Type.PLAN_CREATED)
                .build()

        val roundtrippedPlanCreatedStandardWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(planCreatedStandardWebhookEvent),
                jacksonTypeRef<PlanCreatedStandardWebhookEvent>(),
            )

        assertThat(roundtrippedPlanCreatedStandardWebhookEvent)
            .isEqualTo(planCreatedStandardWebhookEvent)
    }
}
