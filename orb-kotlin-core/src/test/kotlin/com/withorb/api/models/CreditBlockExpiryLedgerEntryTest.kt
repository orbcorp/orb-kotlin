// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreditBlockExpiryLedgerEntryTest {

    @Test
    fun create() {
        val creditBlockExpiryLedgerEntry =
            CreditBlockExpiryLedgerEntry.builder()
                .id("id")
                .amount(0.0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditBlock(
                    AffectedBlock.builder()
                        .id("id")
                        .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addFilter(
                            AffectedBlock.Filter.builder()
                                .field(AffectedBlock.Filter.Field.PRICE_ID)
                                .operator(AffectedBlock.Filter.Operator.INCLUDES)
                                .addValue("string")
                                .build()
                        )
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
                .entryStatus(CreditBlockExpiryLedgerEntry.EntryStatus.COMMITTED)
                .entryType(CreditBlockExpiryLedgerEntry.EntryType.CREDIT_BLOCK_EXPIRY)
                .ledgerSequenceNumber(0L)
                .metadata(
                    CreditBlockExpiryLedgerEntry.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .startingBalance(0.0)
                .build()

        assertThat(creditBlockExpiryLedgerEntry.id()).isEqualTo("id")
        assertThat(creditBlockExpiryLedgerEntry.amount()).isEqualTo(0.0)
        assertThat(creditBlockExpiryLedgerEntry.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(creditBlockExpiryLedgerEntry.creditBlock())
            .isEqualTo(
                AffectedBlock.builder()
                    .id("id")
                    .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addFilter(
                        AffectedBlock.Filter.builder()
                            .field(AffectedBlock.Filter.Field.PRICE_ID)
                            .operator(AffectedBlock.Filter.Operator.INCLUDES)
                            .addValue("string")
                            .build()
                    )
                    .perUnitCostBasis("per_unit_cost_basis")
                    .build()
            )
        assertThat(creditBlockExpiryLedgerEntry.currency()).isEqualTo("currency")
        assertThat(creditBlockExpiryLedgerEntry.customer())
            .isEqualTo(
                CustomerMinified.builder()
                    .id("id")
                    .externalCustomerId("external_customer_id")
                    .build()
            )
        assertThat(creditBlockExpiryLedgerEntry.description()).isEqualTo("description")
        assertThat(creditBlockExpiryLedgerEntry.endingBalance()).isEqualTo(0.0)
        assertThat(creditBlockExpiryLedgerEntry.entryStatus())
            .isEqualTo(CreditBlockExpiryLedgerEntry.EntryStatus.COMMITTED)
        assertThat(creditBlockExpiryLedgerEntry.entryType())
            .isEqualTo(CreditBlockExpiryLedgerEntry.EntryType.CREDIT_BLOCK_EXPIRY)
        assertThat(creditBlockExpiryLedgerEntry.ledgerSequenceNumber()).isEqualTo(0L)
        assertThat(creditBlockExpiryLedgerEntry.metadata())
            .isEqualTo(
                CreditBlockExpiryLedgerEntry.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(creditBlockExpiryLedgerEntry.startingBalance()).isEqualTo(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val creditBlockExpiryLedgerEntry =
            CreditBlockExpiryLedgerEntry.builder()
                .id("id")
                .amount(0.0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditBlock(
                    AffectedBlock.builder()
                        .id("id")
                        .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addFilter(
                            AffectedBlock.Filter.builder()
                                .field(AffectedBlock.Filter.Field.PRICE_ID)
                                .operator(AffectedBlock.Filter.Operator.INCLUDES)
                                .addValue("string")
                                .build()
                        )
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
                .entryStatus(CreditBlockExpiryLedgerEntry.EntryStatus.COMMITTED)
                .entryType(CreditBlockExpiryLedgerEntry.EntryType.CREDIT_BLOCK_EXPIRY)
                .ledgerSequenceNumber(0L)
                .metadata(
                    CreditBlockExpiryLedgerEntry.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .startingBalance(0.0)
                .build()

        val roundtrippedCreditBlockExpiryLedgerEntry =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(creditBlockExpiryLedgerEntry),
                jacksonTypeRef<CreditBlockExpiryLedgerEntry>(),
            )

        assertThat(roundtrippedCreditBlockExpiryLedgerEntry).isEqualTo(creditBlockExpiryLedgerEntry)
    }
}
