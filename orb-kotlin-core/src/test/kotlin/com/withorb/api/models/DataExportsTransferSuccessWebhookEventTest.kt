// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DataExportsTransferSuccessWebhookEventTest {

    @Test
    fun create() {
        val dataExportsTransferSuccessWebhookEvent =
            DataExportsTransferSuccessWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .properties(
                    DataExportsTransferSuccessWebhookEvent.Properties.builder()
                        .description("description")
                        .destinationName("destination_name")
                        .addResource("string")
                        .rowsTransferred(0L)
                        .transferEndedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .transferStartedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .type(DataExportsTransferSuccessWebhookEvent.Type.DATA_EXPORTS_TRANSFER_SUCCESS)
                .build()

        assertThat(dataExportsTransferSuccessWebhookEvent.id()).isEqualTo("id")
        assertThat(dataExportsTransferSuccessWebhookEvent.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(dataExportsTransferSuccessWebhookEvent.properties())
            .isEqualTo(
                DataExportsTransferSuccessWebhookEvent.Properties.builder()
                    .description("description")
                    .destinationName("destination_name")
                    .addResource("string")
                    .rowsTransferred(0L)
                    .transferEndedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .transferStartedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(dataExportsTransferSuccessWebhookEvent.type())
            .isEqualTo(DataExportsTransferSuccessWebhookEvent.Type.DATA_EXPORTS_TRANSFER_SUCCESS)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dataExportsTransferSuccessWebhookEvent =
            DataExportsTransferSuccessWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .properties(
                    DataExportsTransferSuccessWebhookEvent.Properties.builder()
                        .description("description")
                        .destinationName("destination_name")
                        .addResource("string")
                        .rowsTransferred(0L)
                        .transferEndedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .transferStartedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .type(DataExportsTransferSuccessWebhookEvent.Type.DATA_EXPORTS_TRANSFER_SUCCESS)
                .build()

        val roundtrippedDataExportsTransferSuccessWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dataExportsTransferSuccessWebhookEvent),
                jacksonTypeRef<DataExportsTransferSuccessWebhookEvent>(),
            )

        assertThat(roundtrippedDataExportsTransferSuccessWebhookEvent)
            .isEqualTo(dataExportsTransferSuccessWebhookEvent)
    }
}
