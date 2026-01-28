// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VoidInitiatedLedgerEntryTest {

    @Test
    fun create() {
        val voidInitiatedLedgerEntry =
            VoidInitiatedLedgerEntry.builder()
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
                .entryStatus(VoidInitiatedLedgerEntry.EntryStatus.COMMITTED)
                .entryType(VoidInitiatedLedgerEntry.EntryType.VOID_INITIATED)
                .ledgerSequenceNumber(0L)
                .metadata(
                    VoidInitiatedLedgerEntry.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .newBlockExpiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startingBalance(0.0)
                .voidAmount(0.0)
                .voidReason("void_reason")
                .build()

        assertThat(voidInitiatedLedgerEntry.id()).isEqualTo("id")
        assertThat(voidInitiatedLedgerEntry.amount()).isEqualTo(0.0)
        assertThat(voidInitiatedLedgerEntry.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(voidInitiatedLedgerEntry.creditBlock())
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
        assertThat(voidInitiatedLedgerEntry.currency()).isEqualTo("currency")
        assertThat(voidInitiatedLedgerEntry.customer())
            .isEqualTo(
                CustomerMinified.builder()
                    .id("id")
                    .externalCustomerId("external_customer_id")
                    .build()
            )
        assertThat(voidInitiatedLedgerEntry.description()).isEqualTo("description")
        assertThat(voidInitiatedLedgerEntry.endingBalance()).isEqualTo(0.0)
        assertThat(voidInitiatedLedgerEntry.entryStatus())
            .isEqualTo(VoidInitiatedLedgerEntry.EntryStatus.COMMITTED)
        assertThat(voidInitiatedLedgerEntry.entryType())
            .isEqualTo(VoidInitiatedLedgerEntry.EntryType.VOID_INITIATED)
        assertThat(voidInitiatedLedgerEntry.ledgerSequenceNumber()).isEqualTo(0L)
        assertThat(voidInitiatedLedgerEntry.metadata())
            .isEqualTo(
                VoidInitiatedLedgerEntry.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(voidInitiatedLedgerEntry.newBlockExpiryDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(voidInitiatedLedgerEntry.startingBalance()).isEqualTo(0.0)
        assertThat(voidInitiatedLedgerEntry.voidAmount()).isEqualTo(0.0)
        assertThat(voidInitiatedLedgerEntry.voidReason()).isEqualTo("void_reason")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val voidInitiatedLedgerEntry =
            VoidInitiatedLedgerEntry.builder()
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
                .entryStatus(VoidInitiatedLedgerEntry.EntryStatus.COMMITTED)
                .entryType(VoidInitiatedLedgerEntry.EntryType.VOID_INITIATED)
                .ledgerSequenceNumber(0L)
                .metadata(
                    VoidInitiatedLedgerEntry.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .newBlockExpiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startingBalance(0.0)
                .voidAmount(0.0)
                .voidReason("void_reason")
                .build()

        val roundtrippedVoidInitiatedLedgerEntry =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(voidInitiatedLedgerEntry),
                jacksonTypeRef<VoidInitiatedLedgerEntry>(),
            )

        assertThat(roundtrippedVoidInitiatedLedgerEntry).isEqualTo(voidInitiatedLedgerEntry)
    }
}
