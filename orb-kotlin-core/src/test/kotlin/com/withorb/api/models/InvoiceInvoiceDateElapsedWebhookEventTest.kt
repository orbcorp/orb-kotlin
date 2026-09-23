// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvoiceInvoiceDateElapsedWebhookEventTest {

    @Test
    fun create() {
        val invoiceInvoiceDateElapsedWebhookEvent =
            InvoiceInvoiceDateElapsedWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .invoice(
                    InvoiceInvoiceDateElapsedWebhookEvent.Invoice.builder()
                        .id("id")
                        .customer(
                            CustomerMinified.builder()
                                .id("id")
                                .externalCustomerId("external_customer_id")
                                .build()
                        )
                        .invoiceNumber("invoice_number")
                        .status(InvoiceInvoiceDateElapsedWebhookEvent.Invoice.Status.ISSUED)
                        .subscription(SubscriptionMinified.builder().id("VDGsT23osdLb84KD").build())
                        .build()
                )
                .properties(
                    InvoiceInvoiceDateElapsedWebhookEvent.Properties.builder()
                        .invoiceDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .type(InvoiceInvoiceDateElapsedWebhookEvent.Type.INVOICE_INVOICE_DATE_ELAPSED)
                .build()

        assertThat(invoiceInvoiceDateElapsedWebhookEvent.id()).isEqualTo("id")
        assertThat(invoiceInvoiceDateElapsedWebhookEvent.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(invoiceInvoiceDateElapsedWebhookEvent.invoice())
            .isEqualTo(
                InvoiceInvoiceDateElapsedWebhookEvent.Invoice.builder()
                    .id("id")
                    .customer(
                        CustomerMinified.builder()
                            .id("id")
                            .externalCustomerId("external_customer_id")
                            .build()
                    )
                    .invoiceNumber("invoice_number")
                    .status(InvoiceInvoiceDateElapsedWebhookEvent.Invoice.Status.ISSUED)
                    .subscription(SubscriptionMinified.builder().id("VDGsT23osdLb84KD").build())
                    .build()
            )
        assertThat(invoiceInvoiceDateElapsedWebhookEvent.properties())
            .isEqualTo(
                InvoiceInvoiceDateElapsedWebhookEvent.Properties.builder()
                    .invoiceDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(invoiceInvoiceDateElapsedWebhookEvent.type())
            .isEqualTo(InvoiceInvoiceDateElapsedWebhookEvent.Type.INVOICE_INVOICE_DATE_ELAPSED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val invoiceInvoiceDateElapsedWebhookEvent =
            InvoiceInvoiceDateElapsedWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .invoice(
                    InvoiceInvoiceDateElapsedWebhookEvent.Invoice.builder()
                        .id("id")
                        .customer(
                            CustomerMinified.builder()
                                .id("id")
                                .externalCustomerId("external_customer_id")
                                .build()
                        )
                        .invoiceNumber("invoice_number")
                        .status(InvoiceInvoiceDateElapsedWebhookEvent.Invoice.Status.ISSUED)
                        .subscription(SubscriptionMinified.builder().id("VDGsT23osdLb84KD").build())
                        .build()
                )
                .properties(
                    InvoiceInvoiceDateElapsedWebhookEvent.Properties.builder()
                        .invoiceDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .type(InvoiceInvoiceDateElapsedWebhookEvent.Type.INVOICE_INVOICE_DATE_ELAPSED)
                .build()

        val roundtrippedInvoiceInvoiceDateElapsedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(invoiceInvoiceDateElapsedWebhookEvent),
                jacksonTypeRef<InvoiceInvoiceDateElapsedWebhookEvent>(),
            )

        assertThat(roundtrippedInvoiceInvoiceDateElapsedWebhookEvent)
            .isEqualTo(invoiceInvoiceDateElapsedWebhookEvent)
    }
}
