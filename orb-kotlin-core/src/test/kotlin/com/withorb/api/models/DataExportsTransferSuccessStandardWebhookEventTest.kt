// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DataExportsTransferSuccessStandardWebhookEventTest {

    @Test
    fun create() {
        val dataExportsTransferSuccessStandardWebhookEvent =
            DataExportsTransferSuccessStandardWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .payloadStyle(DataExportsTransferSuccessStandardWebhookEvent.PayloadStyle.EXPANDED)
                .properties(
                    DataExportsTransferSuccessStandardWebhookEvent.Properties.builder()
                        .description("description")
                        .destinationName("destination_name")
                        .addResource("string")
                        .rowsTransferred(0L)
                        .transferEndedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .transferStartedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .type(
                    DataExportsTransferSuccessStandardWebhookEvent.Type
                        .DATA_EXPORTS_TRANSFER_SUCCESS
                )
                .build()

        assertThat(dataExportsTransferSuccessStandardWebhookEvent.id()).isEqualTo("id")
        assertThat(dataExportsTransferSuccessStandardWebhookEvent.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(dataExportsTransferSuccessStandardWebhookEvent.payloadStyle())
            .isEqualTo(DataExportsTransferSuccessStandardWebhookEvent.PayloadStyle.EXPANDED)
        assertThat(dataExportsTransferSuccessStandardWebhookEvent.properties())
            .isEqualTo(
                DataExportsTransferSuccessStandardWebhookEvent.Properties.builder()
                    .description("description")
                    .destinationName("destination_name")
                    .addResource("string")
                    .rowsTransferred(0L)
                    .transferEndedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .transferStartedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(dataExportsTransferSuccessStandardWebhookEvent.type())
            .isEqualTo(
                DataExportsTransferSuccessStandardWebhookEvent.Type.DATA_EXPORTS_TRANSFER_SUCCESS
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dataExportsTransferSuccessStandardWebhookEvent =
            DataExportsTransferSuccessStandardWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .payloadStyle(DataExportsTransferSuccessStandardWebhookEvent.PayloadStyle.EXPANDED)
                .properties(
                    DataExportsTransferSuccessStandardWebhookEvent.Properties.builder()
                        .description("description")
                        .destinationName("destination_name")
                        .addResource("string")
                        .rowsTransferred(0L)
                        .transferEndedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .transferStartedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .type(
                    DataExportsTransferSuccessStandardWebhookEvent.Type
                        .DATA_EXPORTS_TRANSFER_SUCCESS
                )
                .build()

        val roundtrippedDataExportsTransferSuccessStandardWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dataExportsTransferSuccessStandardWebhookEvent),
                jacksonTypeRef<DataExportsTransferSuccessStandardWebhookEvent>(),
            )

        assertThat(roundtrippedDataExportsTransferSuccessStandardWebhookEvent)
            .isEqualTo(dataExportsTransferSuccessStandardWebhookEvent)
    }
}
