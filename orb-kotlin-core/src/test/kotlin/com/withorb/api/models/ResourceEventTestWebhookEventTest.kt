// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ResourceEventTestWebhookEventTest {

    @Test
    fun create() {
        val resourceEventTestWebhookEvent =
            ResourceEventTestWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .properties(
                    ResourceEventTestWebhookEvent.Properties.builder().message("message").build()
                )
                .type(ResourceEventTestWebhookEvent.Type.RESOURCE_EVENT_TEST)
                .build()

        assertThat(resourceEventTestWebhookEvent.id()).isEqualTo("id")
        assertThat(resourceEventTestWebhookEvent.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(resourceEventTestWebhookEvent.properties())
            .isEqualTo(
                ResourceEventTestWebhookEvent.Properties.builder().message("message").build()
            )
        assertThat(resourceEventTestWebhookEvent.type())
            .isEqualTo(ResourceEventTestWebhookEvent.Type.RESOURCE_EVENT_TEST)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val resourceEventTestWebhookEvent =
            ResourceEventTestWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .properties(
                    ResourceEventTestWebhookEvent.Properties.builder().message("message").build()
                )
                .type(ResourceEventTestWebhookEvent.Type.RESOURCE_EVENT_TEST)
                .build()

        val roundtrippedResourceEventTestWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(resourceEventTestWebhookEvent),
                jacksonTypeRef<ResourceEventTestWebhookEvent>(),
            )

        assertThat(roundtrippedResourceEventTestWebhookEvent)
            .isEqualTo(resourceEventTestWebhookEvent)
    }
}
