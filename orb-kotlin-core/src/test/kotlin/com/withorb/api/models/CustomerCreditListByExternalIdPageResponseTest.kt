// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerCreditListByExternalIdPageResponseTest {

    @Test
    fun create() {
        val customerCreditListByExternalIdPageResponse =
            CustomerCreditListByExternalIdPageResponse.builder()
                .addData(
                    CustomerCreditListByExternalIdResponse.builder()
                        .id("id")
                        .balance(0.0)
                        .effectiveDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addFilter(
                            CustomerCreditListByExternalIdResponse.Filter.builder()
                                .field(CustomerCreditListByExternalIdResponse.Filter.Field.PRICE_ID)
                                .operator(
                                    CustomerCreditListByExternalIdResponse.Filter.Operator.INCLUDES
                                )
                                .addValue("string")
                                .build()
                        )
                        .maximumInitialBalance(0.0)
                        .perUnitCostBasis("per_unit_cost_basis")
                        .status(CustomerCreditListByExternalIdResponse.Status.ACTIVE)
                        .build()
                )
                .paginationMetadata(
                    PaginationMetadata.builder().hasMore(true).nextCursor("next_cursor").build()
                )
                .build()

        assertThat(customerCreditListByExternalIdPageResponse.data())
            .containsExactly(
                CustomerCreditListByExternalIdResponse.builder()
                    .id("id")
                    .balance(0.0)
                    .effectiveDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addFilter(
                        CustomerCreditListByExternalIdResponse.Filter.builder()
                            .field(CustomerCreditListByExternalIdResponse.Filter.Field.PRICE_ID)
                            .operator(
                                CustomerCreditListByExternalIdResponse.Filter.Operator.INCLUDES
                            )
                            .addValue("string")
                            .build()
                    )
                    .maximumInitialBalance(0.0)
                    .perUnitCostBasis("per_unit_cost_basis")
                    .status(CustomerCreditListByExternalIdResponse.Status.ACTIVE)
                    .build()
            )
        assertThat(customerCreditListByExternalIdPageResponse.paginationMetadata())
            .isEqualTo(PaginationMetadata.builder().hasMore(true).nextCursor("next_cursor").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customerCreditListByExternalIdPageResponse =
            CustomerCreditListByExternalIdPageResponse.builder()
                .addData(
                    CustomerCreditListByExternalIdResponse.builder()
                        .id("id")
                        .balance(0.0)
                        .effectiveDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addFilter(
                            CustomerCreditListByExternalIdResponse.Filter.builder()
                                .field(CustomerCreditListByExternalIdResponse.Filter.Field.PRICE_ID)
                                .operator(
                                    CustomerCreditListByExternalIdResponse.Filter.Operator.INCLUDES
                                )
                                .addValue("string")
                                .build()
                        )
                        .maximumInitialBalance(0.0)
                        .perUnitCostBasis("per_unit_cost_basis")
                        .status(CustomerCreditListByExternalIdResponse.Status.ACTIVE)
                        .build()
                )
                .paginationMetadata(
                    PaginationMetadata.builder().hasMore(true).nextCursor("next_cursor").build()
                )
                .build()

        val roundtrippedCustomerCreditListByExternalIdPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerCreditListByExternalIdPageResponse),
                jacksonTypeRef<CustomerCreditListByExternalIdPageResponse>(),
            )

        assertThat(roundtrippedCustomerCreditListByExternalIdPageResponse)
            .isEqualTo(customerCreditListByExternalIdPageResponse)
    }
}
