// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransactionAccountingSyncFailedWebhookEventTest {

    @Test
    fun create() {
        val transactionAccountingSyncFailedWebhookEvent =
            TransactionAccountingSyncFailedWebhookEvent.builder()
                .id("id")
                .accountingSyncRecord(
                    TransactionAccountingSyncFailedWebhookEvent.AccountingSyncRecord.builder()
                        .id("id")
                        .customerId("customer_id")
                        .recordType(
                            TransactionAccountingSyncFailedWebhookEvent.AccountingSyncRecord
                                .RecordType
                                .CUSTOMER
                        )
                        .errorDetails(
                            TransactionAccountingSyncFailedWebhookEvent.AccountingSyncRecord
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
                .properties(
                    TransactionAccountingSyncFailedWebhookEvent.Properties.builder()
                        .connectionType("connection_type")
                        .failureReason("failure_reason")
                        .build()
                )
                .transaction(
                    TransactionAccountingSyncFailedWebhookEvent.Transaction.builder()
                        .id("id")
                        .amount("amount")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .paymentProvider(
                            TransactionAccountingSyncFailedWebhookEvent.Transaction.PaymentProvider
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
                    TransactionAccountingSyncFailedWebhookEvent.Type
                        .TRANSACTION_ACCOUNTING_SYNC_FAILED
                )
                .build()

        assertThat(transactionAccountingSyncFailedWebhookEvent.id()).isEqualTo("id")
        assertThat(transactionAccountingSyncFailedWebhookEvent.accountingSyncRecord())
            .isEqualTo(
                TransactionAccountingSyncFailedWebhookEvent.AccountingSyncRecord.builder()
                    .id("id")
                    .customerId("customer_id")
                    .recordType(
                        TransactionAccountingSyncFailedWebhookEvent.AccountingSyncRecord.RecordType
                            .CUSTOMER
                    )
                    .errorDetails(
                        TransactionAccountingSyncFailedWebhookEvent.AccountingSyncRecord
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
        assertThat(transactionAccountingSyncFailedWebhookEvent.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(transactionAccountingSyncFailedWebhookEvent.properties())
            .isEqualTo(
                TransactionAccountingSyncFailedWebhookEvent.Properties.builder()
                    .connectionType("connection_type")
                    .failureReason("failure_reason")
                    .build()
            )
        assertThat(transactionAccountingSyncFailedWebhookEvent.transaction())
            .isEqualTo(
                TransactionAccountingSyncFailedWebhookEvent.Transaction.builder()
                    .id("id")
                    .amount("amount")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .paymentProvider(
                        TransactionAccountingSyncFailedWebhookEvent.Transaction.PaymentProvider
                            .STRIPE
                    )
                    .paymentProviderId("payment_provider_id")
                    .receiptPdf(
                        "https://assets.withorb.com/receipt/rUHdhmg45vY45DX/qEAeuYePaphGMdFb"
                    )
                    .succeeded(true)
                    .build()
            )
        assertThat(transactionAccountingSyncFailedWebhookEvent.type())
            .isEqualTo(
                TransactionAccountingSyncFailedWebhookEvent.Type.TRANSACTION_ACCOUNTING_SYNC_FAILED
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transactionAccountingSyncFailedWebhookEvent =
            TransactionAccountingSyncFailedWebhookEvent.builder()
                .id("id")
                .accountingSyncRecord(
                    TransactionAccountingSyncFailedWebhookEvent.AccountingSyncRecord.builder()
                        .id("id")
                        .customerId("customer_id")
                        .recordType(
                            TransactionAccountingSyncFailedWebhookEvent.AccountingSyncRecord
                                .RecordType
                                .CUSTOMER
                        )
                        .errorDetails(
                            TransactionAccountingSyncFailedWebhookEvent.AccountingSyncRecord
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
                .properties(
                    TransactionAccountingSyncFailedWebhookEvent.Properties.builder()
                        .connectionType("connection_type")
                        .failureReason("failure_reason")
                        .build()
                )
                .transaction(
                    TransactionAccountingSyncFailedWebhookEvent.Transaction.builder()
                        .id("id")
                        .amount("amount")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .paymentProvider(
                            TransactionAccountingSyncFailedWebhookEvent.Transaction.PaymentProvider
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
                    TransactionAccountingSyncFailedWebhookEvent.Type
                        .TRANSACTION_ACCOUNTING_SYNC_FAILED
                )
                .build()

        val roundtrippedTransactionAccountingSyncFailedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transactionAccountingSyncFailedWebhookEvent),
                jacksonTypeRef<TransactionAccountingSyncFailedWebhookEvent>(),
            )

        assertThat(roundtrippedTransactionAccountingSyncFailedWebhookEvent)
            .isEqualTo(transactionAccountingSyncFailedWebhookEvent)
    }
}
