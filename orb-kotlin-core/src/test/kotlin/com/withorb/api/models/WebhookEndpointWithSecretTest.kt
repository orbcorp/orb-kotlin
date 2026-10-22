// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookEndpointWithSecretTest {

    @Test
    fun create() {
        val webhookEndpointWithSecret =
            WebhookEndpointWithSecret.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .enabled(true)
                .addEnabledEventType("string")
                .payloadStyle(WebhookEndpointWithSecret.PayloadStyle.EXPANDED)
                .secret("secret")
                .url("url")
                .build()

        assertThat(webhookEndpointWithSecret.id()).isEqualTo("id")
        assertThat(webhookEndpointWithSecret.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(webhookEndpointWithSecret.enabled()).isEqualTo(true)
        assertThat(webhookEndpointWithSecret.enabledEventTypes()).containsExactly("string")
        assertThat(webhookEndpointWithSecret.payloadStyle())
            .isEqualTo(WebhookEndpointWithSecret.PayloadStyle.EXPANDED)
        assertThat(webhookEndpointWithSecret.secret()).isEqualTo("secret")
        assertThat(webhookEndpointWithSecret.url()).isEqualTo("url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val webhookEndpointWithSecret =
            WebhookEndpointWithSecret.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .enabled(true)
                .addEnabledEventType("string")
                .payloadStyle(WebhookEndpointWithSecret.PayloadStyle.EXPANDED)
                .secret("secret")
                .url("url")
                .build()

        val roundtrippedWebhookEndpointWithSecret =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(webhookEndpointWithSecret),
                jacksonTypeRef<WebhookEndpointWithSecret>(),
            )

        assertThat(roundtrippedWebhookEndpointWithSecret).isEqualTo(webhookEndpointWithSecret)
    }
}
