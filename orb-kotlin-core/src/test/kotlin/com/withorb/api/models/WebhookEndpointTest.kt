// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookEndpointTest {

    @Test
    fun create() {
        val webhookEndpoint =
            WebhookEndpoint.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .enabled(true)
                .addEnabledEventType("string")
                .payloadStyle(WebhookEndpoint.PayloadStyle.EXPANDED)
                .url("url")
                .build()

        assertThat(webhookEndpoint.id()).isEqualTo("id")
        assertThat(webhookEndpoint.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(webhookEndpoint.enabled()).isEqualTo(true)
        assertThat(webhookEndpoint.enabledEventTypes()).containsExactly("string")
        assertThat(webhookEndpoint.payloadStyle()).isEqualTo(WebhookEndpoint.PayloadStyle.EXPANDED)
        assertThat(webhookEndpoint.url()).isEqualTo("url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val webhookEndpoint =
            WebhookEndpoint.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .enabled(true)
                .addEnabledEventType("string")
                .payloadStyle(WebhookEndpoint.PayloadStyle.EXPANDED)
                .url("url")
                .build()

        val roundtrippedWebhookEndpoint =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(webhookEndpoint),
                jacksonTypeRef<WebhookEndpoint>(),
            )

        assertThat(roundtrippedWebhookEndpoint).isEqualTo(webhookEndpoint)
    }
}
