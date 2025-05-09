// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerCreditLedgerListPageResponseTest {

    @Test
    fun create() {
        val customerCreditLedgerListPageResponse =
            CustomerCreditLedgerListPageResponse.builder()
                .addData(
                    CustomerCreditLedgerListResponse.Increment.builder()
                        .id("id")
                        .amount(0.0)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .creditBlock(
                            CustomerCreditLedgerListResponse.Increment.CreditBlock.builder()
                                .id("id")
                                .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .perUnitCostBasis("per_unit_cost_basis")
                                .build()
                        )
                        .currency("currency")
                        .customer(
                            CustomerCreditLedgerListResponse.Increment.Customer.builder()
                                .id("id")
                                .externalCustomerId("external_customer_id")
                                .build()
                        )
                        .description("description")
                        .endingBalance(0.0)
                        .entryStatus(
                            CustomerCreditLedgerListResponse.Increment.EntryStatus.COMMITTED
                        )
                        .ledgerSequenceNumber(0L)
                        .metadata(
                            CustomerCreditLedgerListResponse.Increment.Metadata.builder()
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

        assertThat(customerCreditLedgerListPageResponse.data())
            .containsExactly(
                CustomerCreditLedgerListResponse.ofIncrement(
                    CustomerCreditLedgerListResponse.Increment.builder()
                        .id("id")
                        .amount(0.0)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .creditBlock(
                            CustomerCreditLedgerListResponse.Increment.CreditBlock.builder()
                                .id("id")
                                .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .perUnitCostBasis("per_unit_cost_basis")
                                .build()
                        )
                        .currency("currency")
                        .customer(
                            CustomerCreditLedgerListResponse.Increment.Customer.builder()
                                .id("id")
                                .externalCustomerId("external_customer_id")
                                .build()
                        )
                        .description("description")
                        .endingBalance(0.0)
                        .entryStatus(
                            CustomerCreditLedgerListResponse.Increment.EntryStatus.COMMITTED
                        )
                        .ledgerSequenceNumber(0L)
                        .metadata(
                            CustomerCreditLedgerListResponse.Increment.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .startingBalance(0.0)
                        .build()
                )
            )
        assertThat(customerCreditLedgerListPageResponse.paginationMetadata())
            .isEqualTo(PaginationMetadata.builder().hasMore(true).nextCursor("next_cursor").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customerCreditLedgerListPageResponse =
            CustomerCreditLedgerListPageResponse.builder()
                .addData(
                    CustomerCreditLedgerListResponse.Increment.builder()
                        .id("id")
                        .amount(0.0)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .creditBlock(
                            CustomerCreditLedgerListResponse.Increment.CreditBlock.builder()
                                .id("id")
                                .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .perUnitCostBasis("per_unit_cost_basis")
                                .build()
                        )
                        .currency("currency")
                        .customer(
                            CustomerCreditLedgerListResponse.Increment.Customer.builder()
                                .id("id")
                                .externalCustomerId("external_customer_id")
                                .build()
                        )
                        .description("description")
                        .endingBalance(0.0)
                        .entryStatus(
                            CustomerCreditLedgerListResponse.Increment.EntryStatus.COMMITTED
                        )
                        .ledgerSequenceNumber(0L)
                        .metadata(
                            CustomerCreditLedgerListResponse.Increment.Metadata.builder()
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

        val roundtrippedCustomerCreditLedgerListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerCreditLedgerListPageResponse),
                jacksonTypeRef<CustomerCreditLedgerListPageResponse>(),
            )

        assertThat(roundtrippedCustomerCreditLedgerListPageResponse)
            .isEqualTo(customerCreditLedgerListPageResponse)
    }
}
