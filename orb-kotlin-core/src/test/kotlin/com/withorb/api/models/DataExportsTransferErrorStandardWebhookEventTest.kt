// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DataExportsTransferErrorStandardWebhookEventTest {

    @Test
    fun create() {
        val dataExportsTransferErrorStandardWebhookEvent =
            DataExportsTransferErrorStandardWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .payloadStyle(DataExportsTransferErrorStandardWebhookEvent.PayloadStyle.EXPANDED)
                .properties(
                    DataExportsTransferErrorStandardWebhookEvent.Properties.builder()
                        .description("description")
                        .destinationName("destination_name")
                        .addResource("string")
                        .rowsTransferred(0L)
                        .transferBlamedParty("transfer_blamed_party")
                        .transferEndedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .transferStartedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .type(DataExportsTransferErrorStandardWebhookEvent.Type.DATA_EXPORTS_TRANSFER_ERROR)
                .build()

        assertThat(dataExportsTransferErrorStandardWebhookEvent.id()).isEqualTo("id")
        assertThat(dataExportsTransferErrorStandardWebhookEvent.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(dataExportsTransferErrorStandardWebhookEvent.payloadStyle())
            .isEqualTo(DataExportsTransferErrorStandardWebhookEvent.PayloadStyle.EXPANDED)
        assertThat(dataExportsTransferErrorStandardWebhookEvent.properties())
            .isEqualTo(
                DataExportsTransferErrorStandardWebhookEvent.Properties.builder()
                    .description("description")
                    .destinationName("destination_name")
                    .addResource("string")
                    .rowsTransferred(0L)
                    .transferBlamedParty("transfer_blamed_party")
                    .transferEndedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .transferStartedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(dataExportsTransferErrorStandardWebhookEvent.type())
            .isEqualTo(
                DataExportsTransferErrorStandardWebhookEvent.Type.DATA_EXPORTS_TRANSFER_ERROR
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dataExportsTransferErrorStandardWebhookEvent =
            DataExportsTransferErrorStandardWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .payloadStyle(DataExportsTransferErrorStandardWebhookEvent.PayloadStyle.EXPANDED)
                .properties(
                    DataExportsTransferErrorStandardWebhookEvent.Properties.builder()
                        .description("description")
                        .destinationName("destination_name")
                        .addResource("string")
                        .rowsTransferred(0L)
                        .transferBlamedParty("transfer_blamed_party")
                        .transferEndedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .transferStartedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .type(DataExportsTransferErrorStandardWebhookEvent.Type.DATA_EXPORTS_TRANSFER_ERROR)
                .build()

        val roundtrippedDataExportsTransferErrorStandardWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dataExportsTransferErrorStandardWebhookEvent),
                jacksonTypeRef<DataExportsTransferErrorStandardWebhookEvent>(),
            )

        assertThat(roundtrippedDataExportsTransferErrorStandardWebhookEvent)
            .isEqualTo(dataExportsTransferErrorStandardWebhookEvent)
    }
}
