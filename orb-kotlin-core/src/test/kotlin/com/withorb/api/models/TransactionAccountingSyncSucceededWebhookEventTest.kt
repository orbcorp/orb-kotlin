// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransactionAccountingSyncSucceededWebhookEventTest {

    @Test
    fun create() {
        val transactionAccountingSyncSucceededWebhookEvent =
            TransactionAccountingSyncSucceededWebhookEvent.builder()
                .id("id")
                .accountingSyncRecord(
                    TransactionAccountingSyncSucceededWebhookEvent.AccountingSyncRecord.builder()
                        .id("id")
                        .customerId("customer_id")
                        .recordType(
                            TransactionAccountingSyncSucceededWebhookEvent.AccountingSyncRecord
                                .RecordType
                                .CUSTOMER
                        )
                        .errorDetails(
                            TransactionAccountingSyncSucceededWebhookEvent.AccountingSyncRecord
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
                    TransactionAccountingSyncSucceededWebhookEvent.Properties.builder()
                        .connectionType("connection_type")
                        .build()
                )
                .transaction(
                    TransactionAccountingSyncSucceededWebhookEvent.Transaction.builder()
                        .id("id")
                        .amount("amount")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .paymentProvider(
                            TransactionAccountingSyncSucceededWebhookEvent.Transaction
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
                    TransactionAccountingSyncSucceededWebhookEvent.Type
                        .TRANSACTION_ACCOUNTING_SYNC_SUCCEEDED
                )
                .build()

        assertThat(transactionAccountingSyncSucceededWebhookEvent.id()).isEqualTo("id")
        assertThat(transactionAccountingSyncSucceededWebhookEvent.accountingSyncRecord())
            .isEqualTo(
                TransactionAccountingSyncSucceededWebhookEvent.AccountingSyncRecord.builder()
                    .id("id")
                    .customerId("customer_id")
                    .recordType(
                        TransactionAccountingSyncSucceededWebhookEvent.AccountingSyncRecord
                            .RecordType
                            .CUSTOMER
                    )
                    .errorDetails(
                        TransactionAccountingSyncSucceededWebhookEvent.AccountingSyncRecord
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
        assertThat(transactionAccountingSyncSucceededWebhookEvent.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(transactionAccountingSyncSucceededWebhookEvent.properties())
            .isEqualTo(
                TransactionAccountingSyncSucceededWebhookEvent.Properties.builder()
                    .connectionType("connection_type")
                    .build()
            )
        assertThat(transactionAccountingSyncSucceededWebhookEvent.transaction())
            .isEqualTo(
                TransactionAccountingSyncSucceededWebhookEvent.Transaction.builder()
                    .id("id")
                    .amount("amount")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .paymentProvider(
                        TransactionAccountingSyncSucceededWebhookEvent.Transaction.PaymentProvider
                            .STRIPE
                    )
                    .paymentProviderId("payment_provider_id")
                    .receiptPdf(
                        "https://assets.withorb.com/receipt/rUHdhmg45vY45DX/qEAeuYePaphGMdFb"
                    )
                    .succeeded(true)
                    .build()
            )
        assertThat(transactionAccountingSyncSucceededWebhookEvent.type())
            .isEqualTo(
                TransactionAccountingSyncSucceededWebhookEvent.Type
                    .TRANSACTION_ACCOUNTING_SYNC_SUCCEEDED
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transactionAccountingSyncSucceededWebhookEvent =
            TransactionAccountingSyncSucceededWebhookEvent.builder()
                .id("id")
                .accountingSyncRecord(
                    TransactionAccountingSyncSucceededWebhookEvent.AccountingSyncRecord.builder()
                        .id("id")
                        .customerId("customer_id")
                        .recordType(
                            TransactionAccountingSyncSucceededWebhookEvent.AccountingSyncRecord
                                .RecordType
                                .CUSTOMER
                        )
                        .errorDetails(
                            TransactionAccountingSyncSucceededWebhookEvent.AccountingSyncRecord
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
                    TransactionAccountingSyncSucceededWebhookEvent.Properties.builder()
                        .connectionType("connection_type")
                        .build()
                )
                .transaction(
                    TransactionAccountingSyncSucceededWebhookEvent.Transaction.builder()
                        .id("id")
                        .amount("amount")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .paymentProvider(
                            TransactionAccountingSyncSucceededWebhookEvent.Transaction
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
                    TransactionAccountingSyncSucceededWebhookEvent.Type
                        .TRANSACTION_ACCOUNTING_SYNC_SUCCEEDED
                )
                .build()

        val roundtrippedTransactionAccountingSyncSucceededWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transactionAccountingSyncSucceededWebhookEvent),
                jacksonTypeRef<TransactionAccountingSyncSucceededWebhookEvent>(),
            )

        assertThat(roundtrippedTransactionAccountingSyncSucceededWebhookEvent)
            .isEqualTo(transactionAccountingSyncSucceededWebhookEvent)
    }
}
