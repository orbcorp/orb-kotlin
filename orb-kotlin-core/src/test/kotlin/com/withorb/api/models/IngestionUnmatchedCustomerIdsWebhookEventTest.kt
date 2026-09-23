// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IngestionUnmatchedCustomerIdsWebhookEventTest {

    @Test
    fun create() {
        val ingestionUnmatchedCustomerIdsWebhookEvent =
            IngestionUnmatchedCustomerIdsWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .properties(
                    IngestionUnmatchedCustomerIdsWebhookEvent.Properties.builder()
                        .addExternalCustomerId("string")
                        .build()
                )
                .type(
                    IngestionUnmatchedCustomerIdsWebhookEvent.Type.INGESTION_UNMATCHED_CUSTOMER_IDS
                )
                .build()

        assertThat(ingestionUnmatchedCustomerIdsWebhookEvent.id()).isEqualTo("id")
        assertThat(ingestionUnmatchedCustomerIdsWebhookEvent.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ingestionUnmatchedCustomerIdsWebhookEvent.properties())
            .isEqualTo(
                IngestionUnmatchedCustomerIdsWebhookEvent.Properties.builder()
                    .addExternalCustomerId("string")
                    .build()
            )
        assertThat(ingestionUnmatchedCustomerIdsWebhookEvent.type())
            .isEqualTo(
                IngestionUnmatchedCustomerIdsWebhookEvent.Type.INGESTION_UNMATCHED_CUSTOMER_IDS
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ingestionUnmatchedCustomerIdsWebhookEvent =
            IngestionUnmatchedCustomerIdsWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .properties(
                    IngestionUnmatchedCustomerIdsWebhookEvent.Properties.builder()
                        .addExternalCustomerId("string")
                        .build()
                )
                .type(
                    IngestionUnmatchedCustomerIdsWebhookEvent.Type.INGESTION_UNMATCHED_CUSTOMER_IDS
                )
                .build()

        val roundtrippedIngestionUnmatchedCustomerIdsWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ingestionUnmatchedCustomerIdsWebhookEvent),
                jacksonTypeRef<IngestionUnmatchedCustomerIdsWebhookEvent>(),
            )

        assertThat(roundtrippedIngestionUnmatchedCustomerIdsWebhookEvent)
            .isEqualTo(ingestionUnmatchedCustomerIdsWebhookEvent)
    }
}
