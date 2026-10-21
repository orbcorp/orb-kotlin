// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IngestionUnmatchedCustomerIdsStandardWebhookEventTest {

    @Test
    fun create() {
        val ingestionUnmatchedCustomerIdsStandardWebhookEvent =
            IngestionUnmatchedCustomerIdsStandardWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .payloadStyle(
                    IngestionUnmatchedCustomerIdsStandardWebhookEvent.PayloadStyle.EXPANDED
                )
                .properties(
                    IngestionUnmatchedCustomerIdsStandardWebhookEvent.Properties.builder()
                        .addExternalCustomerId("string")
                        .build()
                )
                .type(
                    IngestionUnmatchedCustomerIdsStandardWebhookEvent.Type
                        .INGESTION_UNMATCHED_CUSTOMER_IDS
                )
                .build()

        assertThat(ingestionUnmatchedCustomerIdsStandardWebhookEvent.id()).isEqualTo("id")
        assertThat(ingestionUnmatchedCustomerIdsStandardWebhookEvent.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ingestionUnmatchedCustomerIdsStandardWebhookEvent.payloadStyle())
            .isEqualTo(IngestionUnmatchedCustomerIdsStandardWebhookEvent.PayloadStyle.EXPANDED)
        assertThat(ingestionUnmatchedCustomerIdsStandardWebhookEvent.properties())
            .isEqualTo(
                IngestionUnmatchedCustomerIdsStandardWebhookEvent.Properties.builder()
                    .addExternalCustomerId("string")
                    .build()
            )
        assertThat(ingestionUnmatchedCustomerIdsStandardWebhookEvent.type())
            .isEqualTo(
                IngestionUnmatchedCustomerIdsStandardWebhookEvent.Type
                    .INGESTION_UNMATCHED_CUSTOMER_IDS
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ingestionUnmatchedCustomerIdsStandardWebhookEvent =
            IngestionUnmatchedCustomerIdsStandardWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .payloadStyle(
                    IngestionUnmatchedCustomerIdsStandardWebhookEvent.PayloadStyle.EXPANDED
                )
                .properties(
                    IngestionUnmatchedCustomerIdsStandardWebhookEvent.Properties.builder()
                        .addExternalCustomerId("string")
                        .build()
                )
                .type(
                    IngestionUnmatchedCustomerIdsStandardWebhookEvent.Type
                        .INGESTION_UNMATCHED_CUSTOMER_IDS
                )
                .build()

        val roundtrippedIngestionUnmatchedCustomerIdsStandardWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ingestionUnmatchedCustomerIdsStandardWebhookEvent),
                jacksonTypeRef<IngestionUnmatchedCustomerIdsStandardWebhookEvent>(),
            )

        assertThat(roundtrippedIngestionUnmatchedCustomerIdsStandardWebhookEvent)
            .isEqualTo(ingestionUnmatchedCustomerIdsStandardWebhookEvent)
    }
}
