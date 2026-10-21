// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvoiceAutomationScheduleStepExecutedStandardWebhookEventTest {

    @Test
    fun create() {
        val invoiceAutomationScheduleStepExecutedStandardWebhookEvent =
            InvoiceAutomationScheduleStepExecutedStandardWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .invoice(
                    InvoiceAutomationScheduleStepExecutedStandardWebhookEvent.Invoice.builder()
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
                .payloadStyle(
                    InvoiceAutomationScheduleStepExecutedStandardWebhookEvent.PayloadStyle.EXPANDED
                )
                .properties(
                    InvoiceAutomationScheduleStepExecutedStandardWebhookEvent.Properties.builder()
                        .addAction(
                            InvoiceAutomationScheduleStepExecutedStandardWebhookEvent.Properties
                                .Action
                                .SendEmail
                                .builder()
                                .recipient("recipient")
                                .sent(true)
                                .actionType(
                                    InvoiceAutomationScheduleStepExecutedStandardWebhookEvent
                                        .Properties
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
                    InvoiceAutomationScheduleStepExecutedStandardWebhookEvent.Type
                        .INVOICE_AUTOMATION_SCHEDULE_STEP_EXECUTED
                )
                .build()

        assertThat(invoiceAutomationScheduleStepExecutedStandardWebhookEvent.id()).isEqualTo("id")
        assertThat(invoiceAutomationScheduleStepExecutedStandardWebhookEvent.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(invoiceAutomationScheduleStepExecutedStandardWebhookEvent.invoice())
            .isEqualTo(
                InvoiceAutomationScheduleStepExecutedStandardWebhookEvent.Invoice.builder()
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
        assertThat(invoiceAutomationScheduleStepExecutedStandardWebhookEvent.payloadStyle())
            .isEqualTo(
                InvoiceAutomationScheduleStepExecutedStandardWebhookEvent.PayloadStyle.EXPANDED
            )
        assertThat(invoiceAutomationScheduleStepExecutedStandardWebhookEvent.properties())
            .isEqualTo(
                InvoiceAutomationScheduleStepExecutedStandardWebhookEvent.Properties.builder()
                    .addAction(
                        InvoiceAutomationScheduleStepExecutedStandardWebhookEvent.Properties.Action
                            .SendEmail
                            .builder()
                            .recipient("recipient")
                            .sent(true)
                            .actionType(
                                InvoiceAutomationScheduleStepExecutedStandardWebhookEvent.Properties
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
        assertThat(invoiceAutomationScheduleStepExecutedStandardWebhookEvent.type())
            .isEqualTo(
                InvoiceAutomationScheduleStepExecutedStandardWebhookEvent.Type
                    .INVOICE_AUTOMATION_SCHEDULE_STEP_EXECUTED
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val invoiceAutomationScheduleStepExecutedStandardWebhookEvent =
            InvoiceAutomationScheduleStepExecutedStandardWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .invoice(
                    InvoiceAutomationScheduleStepExecutedStandardWebhookEvent.Invoice.builder()
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
                .payloadStyle(
                    InvoiceAutomationScheduleStepExecutedStandardWebhookEvent.PayloadStyle.EXPANDED
                )
                .properties(
                    InvoiceAutomationScheduleStepExecutedStandardWebhookEvent.Properties.builder()
                        .addAction(
                            InvoiceAutomationScheduleStepExecutedStandardWebhookEvent.Properties
                                .Action
                                .SendEmail
                                .builder()
                                .recipient("recipient")
                                .sent(true)
                                .actionType(
                                    InvoiceAutomationScheduleStepExecutedStandardWebhookEvent
                                        .Properties
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
                    InvoiceAutomationScheduleStepExecutedStandardWebhookEvent.Type
                        .INVOICE_AUTOMATION_SCHEDULE_STEP_EXECUTED
                )
                .build()

        val roundtrippedInvoiceAutomationScheduleStepExecutedStandardWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    invoiceAutomationScheduleStepExecutedStandardWebhookEvent
                ),
                jacksonTypeRef<InvoiceAutomationScheduleStepExecutedStandardWebhookEvent>(),
            )

        assertThat(roundtrippedInvoiceAutomationScheduleStepExecutedStandardWebhookEvent)
            .isEqualTo(invoiceAutomationScheduleStepExecutedStandardWebhookEvent)
    }
}
