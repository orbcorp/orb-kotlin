// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AmendmentLedgerEntryTest {

    @Test
    fun create() {
        val amendmentLedgerEntry =
            AmendmentLedgerEntry.builder()
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
                .entryStatus(AmendmentLedgerEntry.EntryStatus.COMMITTED)
                .entryType(AmendmentLedgerEntry.EntryType.AMENDMENT)
                .ledgerSequenceNumber(0L)
                .metadata(
                    AmendmentLedgerEntry.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .startingBalance(0.0)
                .build()

        assertThat(amendmentLedgerEntry.id()).isEqualTo("id")
        assertThat(amendmentLedgerEntry.amount()).isEqualTo(0.0)
        assertThat(amendmentLedgerEntry.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(amendmentLedgerEntry.creditBlock())
            .isEqualTo(
                AffectedBlock.builder()
                    .id("id")
                    .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .perUnitCostBasis("per_unit_cost_basis")
                    .build()
            )
        assertThat(amendmentLedgerEntry.currency()).isEqualTo("currency")
        assertThat(amendmentLedgerEntry.customer())
            .isEqualTo(
                CustomerMinified.builder()
                    .id("id")
                    .externalCustomerId("external_customer_id")
                    .build()
            )
        assertThat(amendmentLedgerEntry.description()).isEqualTo("description")
        assertThat(amendmentLedgerEntry.endingBalance()).isEqualTo(0.0)
        assertThat(amendmentLedgerEntry.entryStatus())
            .isEqualTo(AmendmentLedgerEntry.EntryStatus.COMMITTED)
        assertThat(amendmentLedgerEntry.entryType())
            .isEqualTo(AmendmentLedgerEntry.EntryType.AMENDMENT)
        assertThat(amendmentLedgerEntry.ledgerSequenceNumber()).isEqualTo(0L)
        assertThat(amendmentLedgerEntry.metadata())
            .isEqualTo(
                AmendmentLedgerEntry.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(amendmentLedgerEntry.startingBalance()).isEqualTo(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val amendmentLedgerEntry =
            AmendmentLedgerEntry.builder()
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
                .entryStatus(AmendmentLedgerEntry.EntryStatus.COMMITTED)
                .entryType(AmendmentLedgerEntry.EntryType.AMENDMENT)
                .ledgerSequenceNumber(0L)
                .metadata(
                    AmendmentLedgerEntry.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .startingBalance(0.0)
                .build()

        val roundtrippedAmendmentLedgerEntry =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(amendmentLedgerEntry),
                jacksonTypeRef<AmendmentLedgerEntry>(),
            )

        assertThat(roundtrippedAmendmentLedgerEntry).isEqualTo(amendmentLedgerEntry)
    }
}
