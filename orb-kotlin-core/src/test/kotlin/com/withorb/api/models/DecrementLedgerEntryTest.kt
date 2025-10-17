// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DecrementLedgerEntryTest {

    @Test
    fun create() {
        val decrementLedgerEntry =
            DecrementLedgerEntry.builder()
                .id("id")
                .amount(0.0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditBlock(
                    AffectedBlock.builder()
                        .id("id")
                        .addBlockFilter(
                            AffectedBlock.BlockFilter.builder()
                                .field(AffectedBlock.BlockFilter.Field.PRICE_ID)
                                .operator(AffectedBlock.BlockFilter.Operator.INCLUDES)
                                .addValue("string")
                                .build()
                        )
                        .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .perUnitCostBasis("per_unit_cost_basis")
                        .build()
                )
                .currency("currency")
                .customer(
                    CustomerMinified.builder()
                        .id("id")
                        .externalCustomerId("external_customer_id")
                        .build()
                )
                .description("description")
                .endingBalance(0.0)
                .entryStatus(DecrementLedgerEntry.EntryStatus.COMMITTED)
                .entryType(DecrementLedgerEntry.EntryType.DECREMENT)
                .ledgerSequenceNumber(0L)
                .metadata(
                    DecrementLedgerEntry.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .startingBalance(0.0)
                .eventId("event_id")
                .invoiceId("invoice_id")
                .priceId("price_id")
                .build()

        assertThat(decrementLedgerEntry.id()).isEqualTo("id")
        assertThat(decrementLedgerEntry.amount()).isEqualTo(0.0)
        assertThat(decrementLedgerEntry.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(decrementLedgerEntry.creditBlock())
            .isEqualTo(
                AffectedBlock.builder()
                    .id("id")
                    .addBlockFilter(
                        AffectedBlock.BlockFilter.builder()
                            .field(AffectedBlock.BlockFilter.Field.PRICE_ID)
                            .operator(AffectedBlock.BlockFilter.Operator.INCLUDES)
                            .addValue("string")
                            .build()
                    )
                    .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .perUnitCostBasis("per_unit_cost_basis")
                    .build()
            )
        assertThat(decrementLedgerEntry.currency()).isEqualTo("currency")
        assertThat(decrementLedgerEntry.customer())
            .isEqualTo(
                CustomerMinified.builder()
                    .id("id")
                    .externalCustomerId("external_customer_id")
                    .build()
            )
        assertThat(decrementLedgerEntry.description()).isEqualTo("description")
        assertThat(decrementLedgerEntry.endingBalance()).isEqualTo(0.0)
        assertThat(decrementLedgerEntry.entryStatus())
            .isEqualTo(DecrementLedgerEntry.EntryStatus.COMMITTED)
        assertThat(decrementLedgerEntry.entryType())
            .isEqualTo(DecrementLedgerEntry.EntryType.DECREMENT)
        assertThat(decrementLedgerEntry.ledgerSequenceNumber()).isEqualTo(0L)
        assertThat(decrementLedgerEntry.metadata())
            .isEqualTo(
                DecrementLedgerEntry.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(decrementLedgerEntry.startingBalance()).isEqualTo(0.0)
        assertThat(decrementLedgerEntry.eventId()).isEqualTo("event_id")
        assertThat(decrementLedgerEntry.invoiceId()).isEqualTo("invoice_id")
        assertThat(decrementLedgerEntry.priceId()).isEqualTo("price_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val decrementLedgerEntry =
            DecrementLedgerEntry.builder()
                .id("id")
                .amount(0.0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditBlock(
                    AffectedBlock.builder()
                        .id("id")
                        .addBlockFilter(
                            AffectedBlock.BlockFilter.builder()
                                .field(AffectedBlock.BlockFilter.Field.PRICE_ID)
                                .operator(AffectedBlock.BlockFilter.Operator.INCLUDES)
                                .addValue("string")
                                .build()
                        )
                        .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .perUnitCostBasis("per_unit_cost_basis")
                        .build()
                )
                .currency("currency")
                .customer(
                    CustomerMinified.builder()
                        .id("id")
                        .externalCustomerId("external_customer_id")
                        .build()
                )
                .description("description")
                .endingBalance(0.0)
                .entryStatus(DecrementLedgerEntry.EntryStatus.COMMITTED)
                .entryType(DecrementLedgerEntry.EntryType.DECREMENT)
                .ledgerSequenceNumber(0L)
                .metadata(
                    DecrementLedgerEntry.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .startingBalance(0.0)
                .eventId("event_id")
                .invoiceId("invoice_id")
                .priceId("price_id")
                .build()

        val roundtrippedDecrementLedgerEntry =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(decrementLedgerEntry),
                jacksonTypeRef<DecrementLedgerEntry>(),
            )

        assertThat(roundtrippedDecrementLedgerEntry).isEqualTo(decrementLedgerEntry)
    }
}
