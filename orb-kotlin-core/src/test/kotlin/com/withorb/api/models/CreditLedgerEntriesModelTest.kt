// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CreditLedgerEntriesModelTest {

    @Test
    fun createCreditLedgerEntriesModel() {
        val creditLedgerEntriesModel =
            CreditLedgerEntriesModel.builder()
                .addData(
                    CreditLedgerEntryModel.IncrementLedgerEntry.builder()
                        .id("id")
                        .amount(0.0)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .creditBlock(
                            AffectedBlockModel.builder()
                                .id("id")
                                .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .perUnitCostBasis("per_unit_cost_basis")
                                .build()
                        )
                        .currency("currency")
                        .customer(
                            CustomerMinifiedModel.builder()
                                .id("id")
                                .externalCustomerId("external_customer_id")
                                .build()
                        )
                        .description("description")
                        .endingBalance(0.0)
                        .entryStatus(
                            CreditLedgerEntryModel.IncrementLedgerEntry.EntryStatus.COMMITTED
                        )
                        .entryType(CreditLedgerEntryModel.IncrementLedgerEntry.EntryType.INCREMENT)
                        .ledgerSequenceNumber(0L)
                        .metadata(
                            CreditLedgerEntryModel.IncrementLedgerEntry.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .startingBalance(0.0)
                        .build()
                )
                .paginationMetadata(
                    PaginationMetadata.builder().hasMore(true).nextCursor("next_cursor").build()
                )
                .build()
        assertThat(creditLedgerEntriesModel).isNotNull
        assertThat(creditLedgerEntriesModel.data())
            .containsExactly(
                CreditLedgerEntryModel.ofIncrementLedgerEntry(
                    CreditLedgerEntryModel.IncrementLedgerEntry.builder()
                        .id("id")
                        .amount(0.0)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .creditBlock(
                            AffectedBlockModel.builder()
                                .id("id")
                                .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .perUnitCostBasis("per_unit_cost_basis")
                                .build()
                        )
                        .currency("currency")
                        .customer(
                            CustomerMinifiedModel.builder()
                                .id("id")
                                .externalCustomerId("external_customer_id")
                                .build()
                        )
                        .description("description")
                        .endingBalance(0.0)
                        .entryStatus(
                            CreditLedgerEntryModel.IncrementLedgerEntry.EntryStatus.COMMITTED
                        )
                        .entryType(CreditLedgerEntryModel.IncrementLedgerEntry.EntryType.INCREMENT)
                        .ledgerSequenceNumber(0L)
                        .metadata(
                            CreditLedgerEntryModel.IncrementLedgerEntry.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .startingBalance(0.0)
                        .build()
                )
            )
        assertThat(creditLedgerEntriesModel.paginationMetadata())
            .isEqualTo(PaginationMetadata.builder().hasMore(true).nextCursor("next_cursor").build())
    }
}
