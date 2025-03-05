// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerCreditBalancesModelTest {

    @Test
    fun createCustomerCreditBalancesModel() {
        val customerCreditBalancesModel =
            CustomerCreditBalancesModel.builder()
                .addData(
                    CustomerCreditBalancesModel.Data.builder()
                        .id("id")
                        .balance(0.0)
                        .effectiveDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .maximumInitialBalance(0.0)
                        .perUnitCostBasis("per_unit_cost_basis")
                        .status(CustomerCreditBalancesModel.Data.Status.ACTIVE)
                        .build()
                )
                .paginationMetadata(
                    PaginationMetadata.builder().hasMore(true).nextCursor("next_cursor").build()
                )
                .build()
        assertThat(customerCreditBalancesModel).isNotNull
        assertThat(customerCreditBalancesModel.data())
            .containsExactly(
                CustomerCreditBalancesModel.Data.builder()
                    .id("id")
                    .balance(0.0)
                    .effectiveDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .maximumInitialBalance(0.0)
                    .perUnitCostBasis("per_unit_cost_basis")
                    .status(CustomerCreditBalancesModel.Data.Status.ACTIVE)
                    .build()
            )
        assertThat(customerCreditBalancesModel.paginationMetadata())
            .isEqualTo(PaginationMetadata.builder().hasMore(true).nextCursor("next_cursor").build())
    }
}
