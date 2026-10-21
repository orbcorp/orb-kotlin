// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ResourceEventTestStandardWebhookEventTest {

    @Test
    fun create() {
        val resourceEventTestStandardWebhookEvent =
            ResourceEventTestStandardWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .payloadStyle(ResourceEventTestStandardWebhookEvent.PayloadStyle.EXPANDED)
                .properties(
                    ResourceEventTestStandardWebhookEvent.Properties.builder()
                        .message("message")
                        .build()
                )
                .type(ResourceEventTestStandardWebhookEvent.Type.RESOURCE_EVENT_TEST)
                .build()

        assertThat(resourceEventTestStandardWebhookEvent.id()).isEqualTo("id")
        assertThat(resourceEventTestStandardWebhookEvent.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(resourceEventTestStandardWebhookEvent.payloadStyle())
            .isEqualTo(ResourceEventTestStandardWebhookEvent.PayloadStyle.EXPANDED)
        assertThat(resourceEventTestStandardWebhookEvent.properties())
            .isEqualTo(
                ResourceEventTestStandardWebhookEvent.Properties.builder()
                    .message("message")
                    .build()
            )
        assertThat(resourceEventTestStandardWebhookEvent.type())
            .isEqualTo(ResourceEventTestStandardWebhookEvent.Type.RESOURCE_EVENT_TEST)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val resourceEventTestStandardWebhookEvent =
            ResourceEventTestStandardWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .payloadStyle(ResourceEventTestStandardWebhookEvent.PayloadStyle.EXPANDED)
                .properties(
                    ResourceEventTestStandardWebhookEvent.Properties.builder()
                        .message("message")
                        .build()
                )
                .type(ResourceEventTestStandardWebhookEvent.Type.RESOURCE_EVENT_TEST)
                .build()

        val roundtrippedResourceEventTestStandardWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(resourceEventTestStandardWebhookEvent),
                jacksonTypeRef<ResourceEventTestStandardWebhookEvent>(),
            )

        assertThat(roundtrippedResourceEventTestStandardWebhookEvent)
            .isEqualTo(resourceEventTestStandardWebhookEvent)
    }
}
