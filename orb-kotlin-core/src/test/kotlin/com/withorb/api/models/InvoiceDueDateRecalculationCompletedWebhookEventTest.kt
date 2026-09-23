// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvoiceDueDateRecalculationCompletedWebhookEventTest {

    @Test
    fun create() {
        val invoiceDueDateRecalculationCompletedWebhookEvent =
            InvoiceDueDateRecalculationCompletedWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .properties(
                    InvoiceDueDateRecalculationCompletedWebhookEvent.Properties.builder()
                        .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .type(
                    InvoiceDueDateRecalculationCompletedWebhookEvent.Type
                        .INVOICE_DUE_DATE_RECALCULATION_COMPLETED
                )
                .build()

        assertThat(invoiceDueDateRecalculationCompletedWebhookEvent.id()).isEqualTo("id")
        assertThat(invoiceDueDateRecalculationCompletedWebhookEvent.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(invoiceDueDateRecalculationCompletedWebhookEvent.properties())
            .isEqualTo(
                InvoiceDueDateRecalculationCompletedWebhookEvent.Properties.builder()
                    .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(invoiceDueDateRecalculationCompletedWebhookEvent.type())
            .isEqualTo(
                InvoiceDueDateRecalculationCompletedWebhookEvent.Type
                    .INVOICE_DUE_DATE_RECALCULATION_COMPLETED
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val invoiceDueDateRecalculationCompletedWebhookEvent =
            InvoiceDueDateRecalculationCompletedWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .properties(
                    InvoiceDueDateRecalculationCompletedWebhookEvent.Properties.builder()
                        .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .type(
                    InvoiceDueDateRecalculationCompletedWebhookEvent.Type
                        .INVOICE_DUE_DATE_RECALCULATION_COMPLETED
                )
                .build()

        val roundtrippedInvoiceDueDateRecalculationCompletedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(invoiceDueDateRecalculationCompletedWebhookEvent),
                jacksonTypeRef<InvoiceDueDateRecalculationCompletedWebhookEvent>(),
            )

        assertThat(roundtrippedInvoiceDueDateRecalculationCompletedWebhookEvent)
            .isEqualTo(invoiceDueDateRecalculationCompletedWebhookEvent)
    }
}
