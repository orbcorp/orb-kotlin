// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvoiceDueDateRecalculationStartedWebhookEventTest {

    @Test
    fun create() {
        val invoiceDueDateRecalculationStartedWebhookEvent =
            InvoiceDueDateRecalculationStartedWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .properties(
                    InvoiceDueDateRecalculationStartedWebhookEvent.Properties.builder()
                        .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .type(
                    InvoiceDueDateRecalculationStartedWebhookEvent.Type
                        .INVOICE_DUE_DATE_RECALCULATION_STARTED
                )
                .build()

        assertThat(invoiceDueDateRecalculationStartedWebhookEvent.id()).isEqualTo("id")
        assertThat(invoiceDueDateRecalculationStartedWebhookEvent.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(invoiceDueDateRecalculationStartedWebhookEvent.properties())
            .isEqualTo(
                InvoiceDueDateRecalculationStartedWebhookEvent.Properties.builder()
                    .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(invoiceDueDateRecalculationStartedWebhookEvent.type())
            .isEqualTo(
                InvoiceDueDateRecalculationStartedWebhookEvent.Type
                    .INVOICE_DUE_DATE_RECALCULATION_STARTED
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val invoiceDueDateRecalculationStartedWebhookEvent =
            InvoiceDueDateRecalculationStartedWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .properties(
                    InvoiceDueDateRecalculationStartedWebhookEvent.Properties.builder()
                        .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .type(
                    InvoiceDueDateRecalculationStartedWebhookEvent.Type
                        .INVOICE_DUE_DATE_RECALCULATION_STARTED
                )
                .build()

        val roundtrippedInvoiceDueDateRecalculationStartedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(invoiceDueDateRecalculationStartedWebhookEvent),
                jacksonTypeRef<InvoiceDueDateRecalculationStartedWebhookEvent>(),
            )

        assertThat(roundtrippedInvoiceDueDateRecalculationStartedWebhookEvent)
            .isEqualTo(invoiceDueDateRecalculationStartedWebhookEvent)
    }
}
