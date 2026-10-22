// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookEndpointListPageResponseTest {

    @Test
    fun create() {
        val webhookEndpointListPageResponse =
            WebhookEndpointListPageResponse.builder()
                .addData(
                    WebhookEndpoint.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .enabled(true)
                        .addEnabledEventType("string")
                        .payloadStyle(WebhookEndpoint.PayloadStyle.EXPANDED)
                        .url("url")
                        .build()
                )
                .paginationMetadata(
                    PaginationMetadata.builder().hasMore(true).nextCursor("next_cursor").build()
                )
                .build()

        assertThat(webhookEndpointListPageResponse.data())
            .containsExactly(
                WebhookEndpoint.builder()
                    .id("id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .enabled(true)
                    .addEnabledEventType("string")
                    .payloadStyle(WebhookEndpoint.PayloadStyle.EXPANDED)
                    .url("url")
                    .build()
            )
        assertThat(webhookEndpointListPageResponse.paginationMetadata())
            .isEqualTo(PaginationMetadata.builder().hasMore(true).nextCursor("next_cursor").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val webhookEndpointListPageResponse =
            WebhookEndpointListPageResponse.builder()
                .addData(
                    WebhookEndpoint.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .enabled(true)
                        .addEnabledEventType("string")
                        .payloadStyle(WebhookEndpoint.PayloadStyle.EXPANDED)
                        .url("url")
                        .build()
                )
                .paginationMetadata(
                    PaginationMetadata.builder().hasMore(true).nextCursor("next_cursor").build()
                )
                .build()

        val roundtrippedWebhookEndpointListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(webhookEndpointListPageResponse),
                jacksonTypeRef<WebhookEndpointListPageResponse>(),
            )

        assertThat(roundtrippedWebhookEndpointListPageResponse)
            .isEqualTo(webhookEndpointListPageResponse)
    }
}
