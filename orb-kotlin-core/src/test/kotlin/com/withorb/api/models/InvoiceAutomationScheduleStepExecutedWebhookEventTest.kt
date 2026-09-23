// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvoiceAutomationScheduleStepExecutedWebhookEventTest {

    @Test
    fun create() {
        val invoiceAutomationScheduleStepExecutedWebhookEvent =
            InvoiceAutomationScheduleStepExecutedWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .invoice(
                    InvoiceAutomationScheduleStepExecutedWebhookEvent.Invoice.builder()
                        .id("id")
                        .amountDue("amount_due")
                        .currency("currency")
                        .customerId("customer_id")
                        .customerName("customer_name")
                        .dueDate(LocalDate.parse("2019-12-27"))
                        .externalCustomerId("external_customer_id")
                        .hostedInvoiceUrl("hosted_invoice_url")
                        .invoiceDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .invoiceNumber("invoice_number")
                        .issuedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .memo("memo")
                        .paymentMethodLastFourDigits("payment_method_last_four_digits")
                        .status("status")
                        .subscriptionId("subscription_id")
                        .build()
                )
                .properties(
                    InvoiceAutomationScheduleStepExecutedWebhookEvent.Properties.builder()
                        .addAction(
                            InvoiceAutomationScheduleStepExecutedWebhookEvent.Properties.Action
                                .SendEmail
                                .builder()
                                .recipient("recipient")
                                .sent(true)
                                .actionType(
                                    InvoiceAutomationScheduleStepExecutedWebhookEvent.Properties
                                        .Action
                                        .SendEmail
                                        .ActionType
                                        .SEND_EMAIL
                                )
                                .build()
                        )
                        .automationScheduleTemplateId("automation_schedule_template_id")
                        .automationScheduleTemplateName("automation_schedule_template_name")
                        .executedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .label("label")
                        .scheduledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .stepId("step_id")
                        .build()
                )
                .type(
                    InvoiceAutomationScheduleStepExecutedWebhookEvent.Type
                        .INVOICE_AUTOMATION_SCHEDULE_STEP_EXECUTED
                )
                .build()

        assertThat(invoiceAutomationScheduleStepExecutedWebhookEvent.id()).isEqualTo("id")
        assertThat(invoiceAutomationScheduleStepExecutedWebhookEvent.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(invoiceAutomationScheduleStepExecutedWebhookEvent.invoice())
            .isEqualTo(
                InvoiceAutomationScheduleStepExecutedWebhookEvent.Invoice.builder()
                    .id("id")
                    .amountDue("amount_due")
                    .currency("currency")
                    .customerId("customer_id")
                    .customerName("customer_name")
                    .dueDate(LocalDate.parse("2019-12-27"))
                    .externalCustomerId("external_customer_id")
                    .hostedInvoiceUrl("hosted_invoice_url")
                    .invoiceDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .invoiceNumber("invoice_number")
                    .issuedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .memo("memo")
                    .paymentMethodLastFourDigits("payment_method_last_four_digits")
                    .status("status")
                    .subscriptionId("subscription_id")
                    .build()
            )
        assertThat(invoiceAutomationScheduleStepExecutedWebhookEvent.properties())
            .isEqualTo(
                InvoiceAutomationScheduleStepExecutedWebhookEvent.Properties.builder()
                    .addAction(
                        InvoiceAutomationScheduleStepExecutedWebhookEvent.Properties.Action
                            .SendEmail
                            .builder()
                            .recipient("recipient")
                            .sent(true)
                            .actionType(
                                InvoiceAutomationScheduleStepExecutedWebhookEvent.Properties.Action
                                    .SendEmail
                                    .ActionType
                                    .SEND_EMAIL
                            )
                            .build()
                    )
                    .automationScheduleTemplateId("automation_schedule_template_id")
                    .automationScheduleTemplateName("automation_schedule_template_name")
                    .executedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .label("label")
                    .scheduledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .stepId("step_id")
                    .build()
            )
        assertThat(invoiceAutomationScheduleStepExecutedWebhookEvent.type())
            .isEqualTo(
                InvoiceAutomationScheduleStepExecutedWebhookEvent.Type
                    .INVOICE_AUTOMATION_SCHEDULE_STEP_EXECUTED
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val invoiceAutomationScheduleStepExecutedWebhookEvent =
            InvoiceAutomationScheduleStepExecutedWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .invoice(
                    InvoiceAutomationScheduleStepExecutedWebhookEvent.Invoice.builder()
                        .id("id")
                        .amountDue("amount_due")
                        .currency("currency")
                        .customerId("customer_id")
                        .customerName("customer_name")
                        .dueDate(LocalDate.parse("2019-12-27"))
                        .externalCustomerId("external_customer_id")
                        .hostedInvoiceUrl("hosted_invoice_url")
                        .invoiceDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .invoiceNumber("invoice_number")
                        .issuedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .memo("memo")
                        .paymentMethodLastFourDigits("payment_method_last_four_digits")
                        .status("status")
                        .subscriptionId("subscription_id")
                        .build()
                )
                .properties(
                    InvoiceAutomationScheduleStepExecutedWebhookEvent.Properties.builder()
                        .addAction(
                            InvoiceAutomationScheduleStepExecutedWebhookEvent.Properties.Action
                                .SendEmail
                                .builder()
                                .recipient("recipient")
                                .sent(true)
                                .actionType(
                                    InvoiceAutomationScheduleStepExecutedWebhookEvent.Properties
                                        .Action
                                        .SendEmail
                                        .ActionType
                                        .SEND_EMAIL
                                )
                                .build()
                        )
                        .automationScheduleTemplateId("automation_schedule_template_id")
                        .automationScheduleTemplateName("automation_schedule_template_name")
                        .executedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .label("label")
                        .scheduledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .stepId("step_id")
                        .build()
                )
                .type(
                    InvoiceAutomationScheduleStepExecutedWebhookEvent.Type
                        .INVOICE_AUTOMATION_SCHEDULE_STEP_EXECUTED
                )
                .build()

        val roundtrippedInvoiceAutomationScheduleStepExecutedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(invoiceAutomationScheduleStepExecutedWebhookEvent),
                jacksonTypeRef<InvoiceAutomationScheduleStepExecutedWebhookEvent>(),
            )

        assertThat(roundtrippedInvoiceAutomationScheduleStepExecutedWebhookEvent)
            .isEqualTo(invoiceAutomationScheduleStepExecutedWebhookEvent)
    }
}
