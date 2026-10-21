// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvoiceDueDateRecalculationStartedStandardWebhookEventTest {

    @Test
    fun create() {
        val invoiceDueDateRecalculationStartedStandardWebhookEvent =
            InvoiceDueDateRecalculationStartedStandardWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .payloadStyle(
                    InvoiceDueDateRecalculationStartedStandardWebhookEvent.PayloadStyle.EXPANDED
                )
                .properties(
                    InvoiceDueDateRecalculationStartedStandardWebhookEvent.Properties.builder()
                        .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .type(
                    InvoiceDueDateRecalculationStartedStandardWebhookEvent.Type
                        .INVOICE_DUE_DATE_RECALCULATION_STARTED
                )
                .build()

        assertThat(invoiceDueDateRecalculationStartedStandardWebhookEvent.id()).isEqualTo("id")
        assertThat(invoiceDueDateRecalculationStartedStandardWebhookEvent.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(invoiceDueDateRecalculationStartedStandardWebhookEvent.payloadStyle())
            .isEqualTo(InvoiceDueDateRecalculationStartedStandardWebhookEvent.PayloadStyle.EXPANDED)
        assertThat(invoiceDueDateRecalculationStartedStandardWebhookEvent.properties())
            .isEqualTo(
                InvoiceDueDateRecalculationStartedStandardWebhookEvent.Properties.builder()
                    .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(invoiceDueDateRecalculationStartedStandardWebhookEvent.type())
            .isEqualTo(
                InvoiceDueDateRecalculationStartedStandardWebhookEvent.Type
                    .INVOICE_DUE_DATE_RECALCULATION_STARTED
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val invoiceDueDateRecalculationStartedStandardWebhookEvent =
            InvoiceDueDateRecalculationStartedStandardWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .payloadStyle(
                    InvoiceDueDateRecalculationStartedStandardWebhookEvent.PayloadStyle.EXPANDED
                )
                .properties(
                    InvoiceDueDateRecalculationStartedStandardWebhookEvent.Properties.builder()
                        .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .type(
                    InvoiceDueDateRecalculationStartedStandardWebhookEvent.Type
                        .INVOICE_DUE_DATE_RECALCULATION_STARTED
                )
                .build()

        val roundtrippedInvoiceDueDateRecalculationStartedStandardWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    invoiceDueDateRecalculationStartedStandardWebhookEvent
                ),
                jacksonTypeRef<InvoiceDueDateRecalculationStartedStandardWebhookEvent>(),
            )

        assertThat(roundtrippedInvoiceDueDateRecalculationStartedStandardWebhookEvent)
            .isEqualTo(invoiceDueDateRecalculationStartedStandardWebhookEvent)
    }
}
