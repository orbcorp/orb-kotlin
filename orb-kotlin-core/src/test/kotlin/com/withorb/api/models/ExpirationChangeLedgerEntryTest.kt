// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExpirationChangeLedgerEntryTest {

    @Test
    fun create() {
        val expirationChangeLedgerEntry =
            ExpirationChangeLedgerEntry.builder()
                .id("id")
                .amount(0.0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditBlock(
                    AffectedBlock.builder()
                        .id("id")
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
                .entryStatus(ExpirationChangeLedgerEntry.EntryStatus.COMMITTED)
                .entryType(ExpirationChangeLedgerEntry.EntryType.EXPIRATION_CHANGE)
                .ledgerSequenceNumber(0L)
                .metadata(
                    ExpirationChangeLedgerEntry.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .newBlockExpiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startingBalance(0.0)
                .build()

        assertThat(expirationChangeLedgerEntry.id()).isEqualTo("id")
        assertThat(expirationChangeLedgerEntry.amount()).isEqualTo(0.0)
        assertThat(expirationChangeLedgerEntry.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(expirationChangeLedgerEntry.creditBlock())
            .isEqualTo(
                AffectedBlock.builder()
                    .id("id")
                    .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .perUnitCostBasis("per_unit_cost_basis")
                    .build()
            )
        assertThat(expirationChangeLedgerEntry.currency()).isEqualTo("currency")
        assertThat(expirationChangeLedgerEntry.customer())
            .isEqualTo(
                CustomerMinified.builder()
                    .id("id")
                    .externalCustomerId("external_customer_id")
                    .build()
            )
        assertThat(expirationChangeLedgerEntry.description()).isEqualTo("description")
        assertThat(expirationChangeLedgerEntry.endingBalance()).isEqualTo(0.0)
        assertThat(expirationChangeLedgerEntry.entryStatus())
            .isEqualTo(ExpirationChangeLedgerEntry.EntryStatus.COMMITTED)
        assertThat(expirationChangeLedgerEntry.entryType())
            .isEqualTo(ExpirationChangeLedgerEntry.EntryType.EXPIRATION_CHANGE)
        assertThat(expirationChangeLedgerEntry.ledgerSequenceNumber()).isEqualTo(0L)
        assertThat(expirationChangeLedgerEntry.metadata())
            .isEqualTo(
                ExpirationChangeLedgerEntry.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(expirationChangeLedgerEntry.newBlockExpiryDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(expirationChangeLedgerEntry.startingBalance()).isEqualTo(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val expirationChangeLedgerEntry =
            ExpirationChangeLedgerEntry.builder()
                .id("id")
                .amount(0.0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditBlock(
                    AffectedBlock.builder()
                        .id("id")
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
                .entryStatus(ExpirationChangeLedgerEntry.EntryStatus.COMMITTED)
                .entryType(ExpirationChangeLedgerEntry.EntryType.EXPIRATION_CHANGE)
                .ledgerSequenceNumber(0L)
                .metadata(
                    ExpirationChangeLedgerEntry.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .newBlockExpiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startingBalance(0.0)
                .build()

        val roundtrippedExpirationChangeLedgerEntry =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expirationChangeLedgerEntry),
                jacksonTypeRef<ExpirationChangeLedgerEntry>(),
            )

        assertThat(roundtrippedExpirationChangeLedgerEntry).isEqualTo(expirationChangeLedgerEntry)
    }
}
