// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransactionAccountingSyncFailedStandardWebhookEventTest {

    @Test
    fun create() {
        val transactionAccountingSyncFailedStandardWebhookEvent =
            TransactionAccountingSyncFailedStandardWebhookEvent.builder()
                .id("id")
                .accountingSyncRecord(
                    TransactionAccountingSyncFailedStandardWebhookEvent.AccountingSyncRecord
                        .builder()
                        .id("id")
                        .customerId("customer_id")
                        .recordType(
                            TransactionAccountingSyncFailedStandardWebhookEvent.AccountingSyncRecord
                                .RecordType
                                .CUSTOMER
                        )
                        .errorDetails(
                            TransactionAccountingSyncFailedStandardWebhookEvent.AccountingSyncRecord
                                .ErrorDetails
                                .builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .providerCustomerId("provider_customer_id")
                        .status("status")
                        .syncAction("sync_action")
                        .transactionRecordId("transaction_record_id")
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .payloadStyle(
                    TransactionAccountingSyncFailedStandardWebhookEvent.PayloadStyle.EXPANDED
                )
                .properties(
                    TransactionAccountingSyncFailedStandardWebhookEvent.Properties.builder()
                        .connectionType("connection_type")
                        .failureReason("failure_reason")
                        .build()
                )
                .transaction(
                    TransactionAccountingSyncFailedStandardWebhookEvent.Transaction.builder()
                        .id("id")
                        .amount("amount")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .paymentProvider(
                            TransactionAccountingSyncFailedStandardWebhookEvent.Transaction
                                .PaymentProvider
                                .STRIPE
                        )
                        .paymentProviderId("payment_provider_id")
                        .receiptPdf(
                            "https://assets.withorb.com/receipt/rUHdhmg45vY45DX/qEAeuYePaphGMdFb"
                        )
                        .succeeded(true)
                        .build()
                )
                .type(
                    TransactionAccountingSyncFailedStandardWebhookEvent.Type
                        .TRANSACTION_ACCOUNTING_SYNC_FAILED
                )
                .build()

        assertThat(transactionAccountingSyncFailedStandardWebhookEvent.id()).isEqualTo("id")
        assertThat(transactionAccountingSyncFailedStandardWebhookEvent.accountingSyncRecord())
            .isEqualTo(
                TransactionAccountingSyncFailedStandardWebhookEvent.AccountingSyncRecord.builder()
                    .id("id")
                    .customerId("customer_id")
                    .recordType(
                        TransactionAccountingSyncFailedStandardWebhookEvent.AccountingSyncRecord
                            .RecordType
                            .CUSTOMER
                    )
                    .errorDetails(
                        TransactionAccountingSyncFailedStandardWebhookEvent.AccountingSyncRecord
                            .ErrorDetails
                            .builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .providerCustomerId("provider_customer_id")
                    .status("status")
                    .syncAction("sync_action")
                    .transactionRecordId("transaction_record_id")
                    .build()
            )
        assertThat(transactionAccountingSyncFailedStandardWebhookEvent.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(transactionAccountingSyncFailedStandardWebhookEvent.payloadStyle())
            .isEqualTo(TransactionAccountingSyncFailedStandardWebhookEvent.PayloadStyle.EXPANDED)
        assertThat(transactionAccountingSyncFailedStandardWebhookEvent.properties())
            .isEqualTo(
                TransactionAccountingSyncFailedStandardWebhookEvent.Properties.builder()
                    .connectionType("connection_type")
                    .failureReason("failure_reason")
                    .build()
            )
        assertThat(transactionAccountingSyncFailedStandardWebhookEvent.transaction())
            .isEqualTo(
                TransactionAccountingSyncFailedStandardWebhookEvent.Transaction.builder()
                    .id("id")
                    .amount("amount")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .paymentProvider(
                        TransactionAccountingSyncFailedStandardWebhookEvent.Transaction
                            .PaymentProvider
                            .STRIPE
                    )
                    .paymentProviderId("payment_provider_id")
                    .receiptPdf(
                        "https://assets.withorb.com/receipt/rUHdhmg45vY45DX/qEAeuYePaphGMdFb"
                    )
                    .succeeded(true)
                    .build()
            )
        assertThat(transactionAccountingSyncFailedStandardWebhookEvent.type())
            .isEqualTo(
                TransactionAccountingSyncFailedStandardWebhookEvent.Type
                    .TRANSACTION_ACCOUNTING_SYNC_FAILED
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transactionAccountingSyncFailedStandardWebhookEvent =
            TransactionAccountingSyncFailedStandardWebhookEvent.builder()
                .id("id")
                .accountingSyncRecord(
                    TransactionAccountingSyncFailedStandardWebhookEvent.AccountingSyncRecord
                        .builder()
                        .id("id")
                        .customerId("customer_id")
                        .recordType(
                            TransactionAccountingSyncFailedStandardWebhookEvent.AccountingSyncRecord
                                .RecordType
                                .CUSTOMER
                        )
                        .errorDetails(
                            TransactionAccountingSyncFailedStandardWebhookEvent.AccountingSyncRecord
                                .ErrorDetails
                                .builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .providerCustomerId("provider_customer_id")
                        .status("status")
                        .syncAction("sync_action")
                        .transactionRecordId("transaction_record_id")
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .payloadStyle(
                    TransactionAccountingSyncFailedStandardWebhookEvent.PayloadStyle.EXPANDED
                )
                .properties(
                    TransactionAccountingSyncFailedStandardWebhookEvent.Properties.builder()
                        .connectionType("connection_type")
                        .failureReason("failure_reason")
                        .build()
                )
                .transaction(
                    TransactionAccountingSyncFailedStandardWebhookEvent.Transaction.builder()
                        .id("id")
                        .amount("amount")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .paymentProvider(
                            TransactionAccountingSyncFailedStandardWebhookEvent.Transaction
                                .PaymentProvider
                                .STRIPE
                        )
                        .paymentProviderId("payment_provider_id")
                        .receiptPdf(
                            "https://assets.withorb.com/receipt/rUHdhmg45vY45DX/qEAeuYePaphGMdFb"
                        )
                        .succeeded(true)
                        .build()
                )
                .type(
                    TransactionAccountingSyncFailedStandardWebhookEvent.Type
                        .TRANSACTION_ACCOUNTING_SYNC_FAILED
                )
                .build()

        val roundtrippedTransactionAccountingSyncFailedStandardWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transactionAccountingSyncFailedStandardWebhookEvent),
                jacksonTypeRef<TransactionAccountingSyncFailedStandardWebhookEvent>(),
            )

        assertThat(roundtrippedTransactionAccountingSyncFailedStandardWebhookEvent)
            .isEqualTo(transactionAccountingSyncFailedStandardWebhookEvent)
    }
}
