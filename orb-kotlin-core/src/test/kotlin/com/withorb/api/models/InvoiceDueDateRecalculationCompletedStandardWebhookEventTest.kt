// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvoiceDueDateRecalculationCompletedStandardWebhookEventTest {

    @Test
    fun create() {
        val invoiceDueDateRecalculationCompletedStandardWebhookEvent =
            InvoiceDueDateRecalculationCompletedStandardWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .payloadStyle(
                    InvoiceDueDateRecalculationCompletedStandardWebhookEvent.PayloadStyle.EXPANDED
                )
                .properties(
                    InvoiceDueDateRecalculationCompletedStandardWebhookEvent.Properties.builder()
                        .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .type(
                    InvoiceDueDateRecalculationCompletedStandardWebhookEvent.Type
                        .INVOICE_DUE_DATE_RECALCULATION_COMPLETED
                )
                .build()

        assertThat(invoiceDueDateRecalculationCompletedStandardWebhookEvent.id()).isEqualTo("id")
        assertThat(invoiceDueDateRecalculationCompletedStandardWebhookEvent.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(invoiceDueDateRecalculationCompletedStandardWebhookEvent.payloadStyle())
            .isEqualTo(
                InvoiceDueDateRecalculationCompletedStandardWebhookEvent.PayloadStyle.EXPANDED
            )
        assertThat(invoiceDueDateRecalculationCompletedStandardWebhookEvent.properties())
            .isEqualTo(
                InvoiceDueDateRecalculationCompletedStandardWebhookEvent.Properties.builder()
                    .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(invoiceDueDateRecalculationCompletedStandardWebhookEvent.type())
            .isEqualTo(
                InvoiceDueDateRecalculationCompletedStandardWebhookEvent.Type
                    .INVOICE_DUE_DATE_RECALCULATION_COMPLETED
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val invoiceDueDateRecalculationCompletedStandardWebhookEvent =
            InvoiceDueDateRecalculationCompletedStandardWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .payloadStyle(
                    InvoiceDueDateRecalculationCompletedStandardWebhookEvent.PayloadStyle.EXPANDED
                )
                .properties(
                    InvoiceDueDateRecalculationCompletedStandardWebhookEvent.Properties.builder()
                        .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .type(
                    InvoiceDueDateRecalculationCompletedStandardWebhookEvent.Type
                        .INVOICE_DUE_DATE_RECALCULATION_COMPLETED
                )
                .build()

        val roundtrippedInvoiceDueDateRecalculationCompletedStandardWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    invoiceDueDateRecalculationCompletedStandardWebhookEvent
                ),
                jacksonTypeRef<InvoiceDueDateRecalculationCompletedStandardWebhookEvent>(),
            )

        assertThat(roundtrippedInvoiceDueDateRecalculationCompletedStandardWebhookEvent)
            .isEqualTo(invoiceDueDateRecalculationCompletedStandardWebhookEvent)
    }
}
