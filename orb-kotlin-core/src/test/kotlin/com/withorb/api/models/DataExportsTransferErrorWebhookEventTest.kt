// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DataExportsTransferErrorWebhookEventTest {

    @Test
    fun create() {
        val dataExportsTransferErrorWebhookEvent =
            DataExportsTransferErrorWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .properties(
                    DataExportsTransferErrorWebhookEvent.Properties.builder()
                        .description("description")
                        .destinationName("destination_name")
                        .addResource("string")
                        .rowsTransferred(0L)
                        .transferBlamedParty("transfer_blamed_party")
                        .transferEndedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .transferStartedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .type(DataExportsTransferErrorWebhookEvent.Type.DATA_EXPORTS_TRANSFER_ERROR)
                .build()

        assertThat(dataExportsTransferErrorWebhookEvent.id()).isEqualTo("id")
        assertThat(dataExportsTransferErrorWebhookEvent.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(dataExportsTransferErrorWebhookEvent.properties())
            .isEqualTo(
                DataExportsTransferErrorWebhookEvent.Properties.builder()
                    .description("description")
                    .destinationName("destination_name")
                    .addResource("string")
                    .rowsTransferred(0L)
                    .transferBlamedParty("transfer_blamed_party")
                    .transferEndedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .transferStartedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(dataExportsTransferErrorWebhookEvent.type())
            .isEqualTo(DataExportsTransferErrorWebhookEvent.Type.DATA_EXPORTS_TRANSFER_ERROR)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dataExportsTransferErrorWebhookEvent =
            DataExportsTransferErrorWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .properties(
                    DataExportsTransferErrorWebhookEvent.Properties.builder()
                        .description("description")
                        .destinationName("destination_name")
                        .addResource("string")
                        .rowsTransferred(0L)
                        .transferBlamedParty("transfer_blamed_party")
                        .transferEndedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .transferStartedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .type(DataExportsTransferErrorWebhookEvent.Type.DATA_EXPORTS_TRANSFER_ERROR)
                .build()

        val roundtrippedDataExportsTransferErrorWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dataExportsTransferErrorWebhookEvent),
                jacksonTypeRef<DataExportsTransferErrorWebhookEvent>(),
            )

        assertThat(roundtrippedDataExportsTransferErrorWebhookEvent)
            .isEqualTo(dataExportsTransferErrorWebhookEvent)
    }
}
