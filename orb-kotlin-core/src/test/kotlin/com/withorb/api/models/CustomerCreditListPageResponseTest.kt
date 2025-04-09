// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerCreditListPageResponseTest {

    @Test
    fun create() {
        val customerCreditListPageResponse =
            CustomerCreditListPageResponse.builder()
                .addData(
                    CustomerCreditListResponse.builder()
                        .id("id")
                        .balance(0.0)
                        .effectiveDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .maximumInitialBalance(0.0)
                        .perUnitCostBasis("per_unit_cost_basis")
                        .status(CustomerCreditListResponse.Status.ACTIVE)
                        .build()
                )
                .paginationMetadata(
                    PaginationMetadata.builder().hasMore(true).nextCursor("next_cursor").build()
                )
                .build()

        assertThat(customerCreditListPageResponse.data())
            .containsExactly(
                CustomerCreditListResponse.builder()
                    .id("id")
                    .balance(0.0)
                    .effectiveDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .maximumInitialBalance(0.0)
                    .perUnitCostBasis("per_unit_cost_basis")
                    .status(CustomerCreditListResponse.Status.ACTIVE)
                    .build()
            )
        assertThat(customerCreditListPageResponse.paginationMetadata())
            .isEqualTo(PaginationMetadata.builder().hasMore(true).nextCursor("next_cursor").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customerCreditListPageResponse =
            CustomerCreditListPageResponse.builder()
                .addData(
                    CustomerCreditListResponse.builder()
                        .id("id")
                        .balance(0.0)
                        .effectiveDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .maximumInitialBalance(0.0)
                        .perUnitCostBasis("per_unit_cost_basis")
                        .status(CustomerCreditListResponse.Status.ACTIVE)
                        .build()
                )
                .paginationMetadata(
                    PaginationMetadata.builder().hasMore(true).nextCursor("next_cursor").build()
                )
                .build()

        val roundtrippedCustomerCreditListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerCreditListPageResponse),
                jacksonTypeRef<CustomerCreditListPageResponse>(),
            )

        assertThat(roundtrippedCustomerCreditListPageResponse)
            .isEqualTo(customerCreditListPageResponse)
    }
}
