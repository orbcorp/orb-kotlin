// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VoidLedgerEntryTest {

    @Test
    fun create() {
        val voidLedgerEntry =
            VoidLedgerEntry.builder()
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
                .entryStatus(VoidLedgerEntry.EntryStatus.COMMITTED)
                .entryType(VoidLedgerEntry.EntryType.VOID)
                .ledgerSequenceNumber(0L)
                .metadata(
                    VoidLedgerEntry.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .startingBalance(0.0)
                .voidAmount(0.0)
                .voidReason("void_reason")
                .build()

        assertThat(voidLedgerEntry.id()).isEqualTo("id")
        assertThat(voidLedgerEntry.amount()).isEqualTo(0.0)
        assertThat(voidLedgerEntry.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(voidLedgerEntry.creditBlock())
            .isEqualTo(
                AffectedBlock.builder()
                    .id("id")
                    .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .perUnitCostBasis("per_unit_cost_basis")
                    .build()
            )
        assertThat(voidLedgerEntry.currency()).isEqualTo("currency")
        assertThat(voidLedgerEntry.customer())
            .isEqualTo(
                CustomerMinified.builder()
                    .id("id")
                    .externalCustomerId("external_customer_id")
                    .build()
            )
        assertThat(voidLedgerEntry.description()).isEqualTo("description")
        assertThat(voidLedgerEntry.endingBalance()).isEqualTo(0.0)
        assertThat(voidLedgerEntry.entryStatus()).isEqualTo(VoidLedgerEntry.EntryStatus.COMMITTED)
        assertThat(voidLedgerEntry.entryType()).isEqualTo(VoidLedgerEntry.EntryType.VOID)
        assertThat(voidLedgerEntry.ledgerSequenceNumber()).isEqualTo(0L)
        assertThat(voidLedgerEntry.metadata())
            .isEqualTo(
                VoidLedgerEntry.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(voidLedgerEntry.startingBalance()).isEqualTo(0.0)
        assertThat(voidLedgerEntry.voidAmount()).isEqualTo(0.0)
        assertThat(voidLedgerEntry.voidReason()).isEqualTo("void_reason")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val voidLedgerEntry =
            VoidLedgerEntry.builder()
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
                .entryStatus(VoidLedgerEntry.EntryStatus.COMMITTED)
                .entryType(VoidLedgerEntry.EntryType.VOID)
                .ledgerSequenceNumber(0L)
                .metadata(
                    VoidLedgerEntry.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .startingBalance(0.0)
                .voidAmount(0.0)
                .voidReason("void_reason")
                .build()

        val roundtrippedVoidLedgerEntry =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(voidLedgerEntry),
                jacksonTypeRef<VoidLedgerEntry>(),
            )

        assertThat(roundtrippedVoidLedgerEntry).isEqualTo(voidLedgerEntry)
    }
}
