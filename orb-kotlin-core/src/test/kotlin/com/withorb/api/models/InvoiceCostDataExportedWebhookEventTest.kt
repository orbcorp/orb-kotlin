// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvoiceCostDataExportedWebhookEventTest {

    @Test
    fun create() {
        val invoiceCostDataExportedWebhookEvent =
            InvoiceCostDataExportedWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .invoice("invoice")
                .properties(
                    InvoiceCostDataExportedWebhookEvent.Properties.builder()
                        .exportedDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .s3Bucket("s3_bucket")
                        .s3Key("s3_key")
                        .build()
                )
                .type(InvoiceCostDataExportedWebhookEvent.Type.INVOICE_COST_DATA_EXPORTED)
                .build()

        assertThat(invoiceCostDataExportedWebhookEvent.id()).isEqualTo("id")
        assertThat(invoiceCostDataExportedWebhookEvent.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(invoiceCostDataExportedWebhookEvent.invoice()).isEqualTo("invoice")
        assertThat(invoiceCostDataExportedWebhookEvent.properties())
            .isEqualTo(
                InvoiceCostDataExportedWebhookEvent.Properties.builder()
                    .exportedDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .s3Bucket("s3_bucket")
                    .s3Key("s3_key")
                    .build()
            )
        assertThat(invoiceCostDataExportedWebhookEvent.type())
            .isEqualTo(InvoiceCostDataExportedWebhookEvent.Type.INVOICE_COST_DATA_EXPORTED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val invoiceCostDataExportedWebhookEvent =
            InvoiceCostDataExportedWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .invoice("invoice")
                .properties(
                    InvoiceCostDataExportedWebhookEvent.Properties.builder()
                        .exportedDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .s3Bucket("s3_bucket")
                        .s3Key("s3_key")
                        .build()
                )
                .type(InvoiceCostDataExportedWebhookEvent.Type.INVOICE_COST_DATA_EXPORTED)
                .build()

        val roundtrippedInvoiceCostDataExportedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(invoiceCostDataExportedWebhookEvent),
                jacksonTypeRef<InvoiceCostDataExportedWebhookEvent>(),
            )

        assertThat(roundtrippedInvoiceCostDataExportedWebhookEvent)
            .isEqualTo(invoiceCostDataExportedWebhookEvent)
    }
}
