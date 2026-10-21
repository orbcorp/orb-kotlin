// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvoiceDueDateRecalculationCanceledStandardWebhookEventTest {

    @Test
    fun create() {
        val invoiceDueDateRecalculationCanceledStandardWebhookEvent =
            InvoiceDueDateRecalculationCanceledStandardWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .payloadStyle(
                    InvoiceDueDateRecalculationCanceledStandardWebhookEvent.PayloadStyle.EXPANDED
                )
                .properties(
                    InvoiceDueDateRecalculationCanceledStandardWebhookEvent.Properties.builder()
                        .canceledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .type(
                    InvoiceDueDateRecalculationCanceledStandardWebhookEvent.Type
                        .INVOICE_DUE_DATE_RECALCULATION_CANCELED
                )
                .build()

        assertThat(invoiceDueDateRecalculationCanceledStandardWebhookEvent.id()).isEqualTo("id")
        assertThat(invoiceDueDateRecalculationCanceledStandardWebhookEvent.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(invoiceDueDateRecalculationCanceledStandardWebhookEvent.payloadStyle())
            .isEqualTo(
                InvoiceDueDateRecalculationCanceledStandardWebhookEvent.PayloadStyle.EXPANDED
            )
        assertThat(invoiceDueDateRecalculationCanceledStandardWebhookEvent.properties())
            .isEqualTo(
                InvoiceDueDateRecalculationCanceledStandardWebhookEvent.Properties.builder()
                    .canceledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(invoiceDueDateRecalculationCanceledStandardWebhookEvent.type())
            .isEqualTo(
                InvoiceDueDateRecalculationCanceledStandardWebhookEvent.Type
                    .INVOICE_DUE_DATE_RECALCULATION_CANCELED
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val invoiceDueDateRecalculationCanceledStandardWebhookEvent =
            InvoiceDueDateRecalculationCanceledStandardWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .payloadStyle(
                    InvoiceDueDateRecalculationCanceledStandardWebhookEvent.PayloadStyle.EXPANDED
                )
                .properties(
                    InvoiceDueDateRecalculationCanceledStandardWebhookEvent.Properties.builder()
                        .canceledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .type(
                    InvoiceDueDateRecalculationCanceledStandardWebhookEvent.Type
                        .INVOICE_DUE_DATE_RECALCULATION_CANCELED
                )
                .build()

        val roundtrippedInvoiceDueDateRecalculationCanceledStandardWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    invoiceDueDateRecalculationCanceledStandardWebhookEvent
                ),
                jacksonTypeRef<InvoiceDueDateRecalculationCanceledStandardWebhookEvent>(),
            )

        assertThat(roundtrippedInvoiceDueDateRecalculationCanceledStandardWebhookEvent)
            .isEqualTo(invoiceDueDateRecalculationCanceledStandardWebhookEvent)
    }
}
