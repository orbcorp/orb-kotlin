// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransactionAccountingSyncSucceededStandardWebhookEventTest {

    @Test
    fun create() {
        val transactionAccountingSyncSucceededStandardWebhookEvent =
            TransactionAccountingSyncSucceededStandardWebhookEvent.builder()
                .id("id")
                .accountingSyncRecord(
                    TransactionAccountingSyncSucceededStandardWebhookEvent.AccountingSyncRecord
                        .builder()
                        .id("id")
                        .customerId("customer_id")
                        .recordType(
                            TransactionAccountingSyncSucceededStandardWebhookEvent
                                .AccountingSyncRecord
                                .RecordType
                                .CUSTOMER
                        )
                        .errorDetails(
                            TransactionAccountingSyncSucceededStandardWebhookEvent
                                .AccountingSyncRecord
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
                    TransactionAccountingSyncSucceededStandardWebhookEvent.PayloadStyle.EXPANDED
                )
                .properties(
                    TransactionAccountingSyncSucceededStandardWebhookEvent.Properties.builder()
                        .connectionType("connection_type")
                        .build()
                )
                .transaction(
                    TransactionAccountingSyncSucceededStandardWebhookEvent.Transaction.builder()
                        .id("id")
                        .amount("amount")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .paymentProvider(
                            TransactionAccountingSyncSucceededStandardWebhookEvent.Transaction
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
                    TransactionAccountingSyncSucceededStandardWebhookEvent.Type
                        .TRANSACTION_ACCOUNTING_SYNC_SUCCEEDED
                )
                .build()

        assertThat(transactionAccountingSyncSucceededStandardWebhookEvent.id()).isEqualTo("id")
        assertThat(transactionAccountingSyncSucceededStandardWebhookEvent.accountingSyncRecord())
            .isEqualTo(
                TransactionAccountingSyncSucceededStandardWebhookEvent.AccountingSyncRecord
                    .builder()
                    .id("id")
                    .customerId("customer_id")
                    .recordType(
                        TransactionAccountingSyncSucceededStandardWebhookEvent.AccountingSyncRecord
                            .RecordType
                            .CUSTOMER
                    )
                    .errorDetails(
                        TransactionAccountingSyncSucceededStandardWebhookEvent.AccountingSyncRecord
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
        assertThat(transactionAccountingSyncSucceededStandardWebhookEvent.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(transactionAccountingSyncSucceededStandardWebhookEvent.payloadStyle())
            .isEqualTo(TransactionAccountingSyncSucceededStandardWebhookEvent.PayloadStyle.EXPANDED)
        assertThat(transactionAccountingSyncSucceededStandardWebhookEvent.properties())
            .isEqualTo(
                TransactionAccountingSyncSucceededStandardWebhookEvent.Properties.builder()
                    .connectionType("connection_type")
                    .build()
            )
        assertThat(transactionAccountingSyncSucceededStandardWebhookEvent.transaction())
            .isEqualTo(
                TransactionAccountingSyncSucceededStandardWebhookEvent.Transaction.builder()
                    .id("id")
                    .amount("amount")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .paymentProvider(
                        TransactionAccountingSyncSucceededStandardWebhookEvent.Transaction
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
        assertThat(transactionAccountingSyncSucceededStandardWebhookEvent.type())
            .isEqualTo(
                TransactionAccountingSyncSucceededStandardWebhookEvent.Type
                    .TRANSACTION_ACCOUNTING_SYNC_SUCCEEDED
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transactionAccountingSyncSucceededStandardWebhookEvent =
            TransactionAccountingSyncSucceededStandardWebhookEvent.builder()
                .id("id")
                .accountingSyncRecord(
                    TransactionAccountingSyncSucceededStandardWebhookEvent.AccountingSyncRecord
                        .builder()
                        .id("id")
                        .customerId("customer_id")
                        .recordType(
                            TransactionAccountingSyncSucceededStandardWebhookEvent
                                .AccountingSyncRecord
                                .RecordType
                                .CUSTOMER
                        )
                        .errorDetails(
                            TransactionAccountingSyncSucceededStandardWebhookEvent
                                .AccountingSyncRecord
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
                    TransactionAccountingSyncSucceededStandardWebhookEvent.PayloadStyle.EXPANDED
                )
                .properties(
                    TransactionAccountingSyncSucceededStandardWebhookEvent.Properties.builder()
                        .connectionType("connection_type")
                        .build()
                )
                .transaction(
                    TransactionAccountingSyncSucceededStandardWebhookEvent.Transaction.builder()
                        .id("id")
                        .amount("amount")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .paymentProvider(
                            TransactionAccountingSyncSucceededStandardWebhookEvent.Transaction
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
                    TransactionAccountingSyncSucceededStandardWebhookEvent.Type
                        .TRANSACTION_ACCOUNTING_SYNC_SUCCEEDED
                )
                .build()

        val roundtrippedTransactionAccountingSyncSucceededStandardWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    transactionAccountingSyncSucceededStandardWebhookEvent
                ),
                jacksonTypeRef<TransactionAccountingSyncSucceededStandardWebhookEvent>(),
            )

        assertThat(roundtrippedTransactionAccountingSyncSucceededStandardWebhookEvent)
            .isEqualTo(transactionAccountingSyncSucceededStandardWebhookEvent)
    }
}
