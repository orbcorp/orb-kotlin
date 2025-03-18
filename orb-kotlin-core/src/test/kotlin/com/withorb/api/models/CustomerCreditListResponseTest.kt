// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerCreditListResponseTest {

    @Test
    fun create() {
        val customerCreditListResponse =
            CustomerCreditListResponse.builder()
                .id("id")
                .balance(0.0)
                .effectiveDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .maximumInitialBalance(0.0)
                .perUnitCostBasis("per_unit_cost_basis")
                .status(CustomerCreditListResponse.Status.ACTIVE)
                .build()

        assertThat(customerCreditListResponse.id()).isEqualTo("id")
        assertThat(customerCreditListResponse.balance()).isEqualTo(0.0)
        assertThat(customerCreditListResponse.effectiveDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(customerCreditListResponse.expiryDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(customerCreditListResponse.maximumInitialBalance()).isEqualTo(0.0)
        assertThat(customerCreditListResponse.perUnitCostBasis()).isEqualTo("per_unit_cost_basis")
        assertThat(customerCreditListResponse.status())
            .isEqualTo(CustomerCreditListResponse.Status.ACTIVE)
    }
}
