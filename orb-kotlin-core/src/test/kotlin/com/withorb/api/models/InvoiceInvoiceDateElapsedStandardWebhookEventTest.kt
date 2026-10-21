// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvoiceInvoiceDateElapsedStandardWebhookEventTest {

    @Test
    fun create() {
        val invoiceInvoiceDateElapsedStandardWebhookEvent =
            InvoiceInvoiceDateElapsedStandardWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .invoice(
                    InvoiceInvoiceDateElapsedStandardWebhookEvent.Invoice.builder()
                        .id("id")
                        .customer(
                            CustomerMinified.builder()
                                .id("id")
                                .externalCustomerId("external_customer_id")
                                .build()
                        )
                        .invoiceNumber("invoice_number")
                        .status(InvoiceInvoiceDateElapsedStandardWebhookEvent.Invoice.Status.ISSUED)
                        .subscription(SubscriptionMinified.builder().id("VDGsT23osdLb84KD").build())
                        .build()
                )
                .payloadStyle(InvoiceInvoiceDateElapsedStandardWebhookEvent.PayloadStyle.EXPANDED)
                .properties(
                    InvoiceInvoiceDateElapsedStandardWebhookEvent.Properties.builder()
                        .invoiceDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .type(
                    InvoiceInvoiceDateElapsedStandardWebhookEvent.Type.INVOICE_INVOICE_DATE_ELAPSED
                )
                .build()

        assertThat(invoiceInvoiceDateElapsedStandardWebhookEvent.id()).isEqualTo("id")
        assertThat(invoiceInvoiceDateElapsedStandardWebhookEvent.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(invoiceInvoiceDateElapsedStandardWebhookEvent.invoice())
            .isEqualTo(
                InvoiceInvoiceDateElapsedStandardWebhookEvent.Invoice.builder()
                    .id("id")
                    .customer(
                        CustomerMinified.builder()
                            .id("id")
                            .externalCustomerId("external_customer_id")
                            .build()
                    )
                    .invoiceNumber("invoice_number")
                    .status(InvoiceInvoiceDateElapsedStandardWebhookEvent.Invoice.Status.ISSUED)
                    .subscription(SubscriptionMinified.builder().id("VDGsT23osdLb84KD").build())
                    .build()
            )
        assertThat(invoiceInvoiceDateElapsedStandardWebhookEvent.payloadStyle())
            .isEqualTo(InvoiceInvoiceDateElapsedStandardWebhookEvent.PayloadStyle.EXPANDED)
        assertThat(invoiceInvoiceDateElapsedStandardWebhookEvent.properties())
            .isEqualTo(
                InvoiceInvoiceDateElapsedStandardWebhookEvent.Properties.builder()
                    .invoiceDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(invoiceInvoiceDateElapsedStandardWebhookEvent.type())
            .isEqualTo(
                InvoiceInvoiceDateElapsedStandardWebhookEvent.Type.INVOICE_INVOICE_DATE_ELAPSED
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val invoiceInvoiceDateElapsedStandardWebhookEvent =
            InvoiceInvoiceDateElapsedStandardWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .invoice(
                    InvoiceInvoiceDateElapsedStandardWebhookEvent.Invoice.builder()
                        .id("id")
                        .customer(
                            CustomerMinified.builder()
                                .id("id")
                                .externalCustomerId("external_customer_id")
                                .build()
                        )
                        .invoiceNumber("invoice_number")
                        .status(InvoiceInvoiceDateElapsedStandardWebhookEvent.Invoice.Status.ISSUED)
                        .subscription(SubscriptionMinified.builder().id("VDGsT23osdLb84KD").build())
                        .build()
                )
                .payloadStyle(InvoiceInvoiceDateElapsedStandardWebhookEvent.PayloadStyle.EXPANDED)
                .properties(
                    InvoiceInvoiceDateElapsedStandardWebhookEvent.Properties.builder()
                        .invoiceDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .type(
                    InvoiceInvoiceDateElapsedStandardWebhookEvent.Type.INVOICE_INVOICE_DATE_ELAPSED
                )
                .build()

        val roundtrippedInvoiceInvoiceDateElapsedStandardWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(invoiceInvoiceDateElapsedStandardWebhookEvent),
                jacksonTypeRef<InvoiceInvoiceDateElapsedStandardWebhookEvent>(),
            )

        assertThat(roundtrippedInvoiceInvoiceDateElapsedStandardWebhookEvent)
            .isEqualTo(invoiceInvoiceDateElapsedStandardWebhookEvent)
    }
}
