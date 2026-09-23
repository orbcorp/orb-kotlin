// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvoiceDueDateRecalculationCanceledWebhookEventTest {

    @Test
    fun create() {
        val invoiceDueDateRecalculationCanceledWebhookEvent =
            InvoiceDueDateRecalculationCanceledWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .properties(
                    InvoiceDueDateRecalculationCanceledWebhookEvent.Properties.builder()
                        .canceledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .type(
                    InvoiceDueDateRecalculationCanceledWebhookEvent.Type
                        .INVOICE_DUE_DATE_RECALCULATION_CANCELED
                )
                .build()

        assertThat(invoiceDueDateRecalculationCanceledWebhookEvent.id()).isEqualTo("id")
        assertThat(invoiceDueDateRecalculationCanceledWebhookEvent.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(invoiceDueDateRecalculationCanceledWebhookEvent.properties())
            .isEqualTo(
                InvoiceDueDateRecalculationCanceledWebhookEvent.Properties.builder()
                    .canceledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(invoiceDueDateRecalculationCanceledWebhookEvent.type())
            .isEqualTo(
                InvoiceDueDateRecalculationCanceledWebhookEvent.Type
                    .INVOICE_DUE_DATE_RECALCULATION_CANCELED
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val invoiceDueDateRecalculationCanceledWebhookEvent =
            InvoiceDueDateRecalculationCanceledWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .properties(
                    InvoiceDueDateRecalculationCanceledWebhookEvent.Properties.builder()
                        .canceledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .type(
                    InvoiceDueDateRecalculationCanceledWebhookEvent.Type
                        .INVOICE_DUE_DATE_RECALCULATION_CANCELED
                )
                .build()

        val roundtrippedInvoiceDueDateRecalculationCanceledWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(invoiceDueDateRecalculationCanceledWebhookEvent),
                jacksonTypeRef<InvoiceDueDateRecalculationCanceledWebhookEvent>(),
            )

        assertThat(roundtrippedInvoiceDueDateRecalculationCanceledWebhookEvent)
            .isEqualTo(invoiceDueDateRecalculationCanceledWebhookEvent)
    }
}
