// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvoiceCostDataExportedStandardWebhookEventTest {

    @Test
    fun create() {
        val invoiceCostDataExportedStandardWebhookEvent =
            InvoiceCostDataExportedStandardWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .invoice("invoice")
                .payloadStyle(InvoiceCostDataExportedStandardWebhookEvent.PayloadStyle.EXPANDED)
                .properties(
                    InvoiceCostDataExportedStandardWebhookEvent.Properties.builder()
                        .exportedDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .s3Bucket("s3_bucket")
                        .s3Key("s3_key")
                        .build()
                )
                .type(InvoiceCostDataExportedStandardWebhookEvent.Type.INVOICE_COST_DATA_EXPORTED)
                .build()

        assertThat(invoiceCostDataExportedStandardWebhookEvent.id()).isEqualTo("id")
        assertThat(invoiceCostDataExportedStandardWebhookEvent.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(invoiceCostDataExportedStandardWebhookEvent.invoice()).isEqualTo("invoice")
        assertThat(invoiceCostDataExportedStandardWebhookEvent.payloadStyle())
            .isEqualTo(InvoiceCostDataExportedStandardWebhookEvent.PayloadStyle.EXPANDED)
        assertThat(invoiceCostDataExportedStandardWebhookEvent.properties())
            .isEqualTo(
                InvoiceCostDataExportedStandardWebhookEvent.Properties.builder()
                    .exportedDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .s3Bucket("s3_bucket")
                    .s3Key("s3_key")
                    .build()
            )
        assertThat(invoiceCostDataExportedStandardWebhookEvent.type())
            .isEqualTo(InvoiceCostDataExportedStandardWebhookEvent.Type.INVOICE_COST_DATA_EXPORTED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val invoiceCostDataExportedStandardWebhookEvent =
            InvoiceCostDataExportedStandardWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .invoice("invoice")
                .payloadStyle(InvoiceCostDataExportedStandardWebhookEvent.PayloadStyle.EXPANDED)
                .properties(
                    InvoiceCostDataExportedStandardWebhookEvent.Properties.builder()
                        .exportedDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .s3Bucket("s3_bucket")
                        .s3Key("s3_key")
                        .build()
                )
                .type(InvoiceCostDataExportedStandardWebhookEvent.Type.INVOICE_COST_DATA_EXPORTED)
                .build()

        val roundtrippedInvoiceCostDataExportedStandardWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(invoiceCostDataExportedStandardWebhookEvent),
                jacksonTypeRef<InvoiceCostDataExportedStandardWebhookEvent>(),
            )

        assertThat(roundtrippedInvoiceCostDataExportedStandardWebhookEvent)
            .isEqualTo(invoiceCostDataExportedStandardWebhookEvent)
    }
}
