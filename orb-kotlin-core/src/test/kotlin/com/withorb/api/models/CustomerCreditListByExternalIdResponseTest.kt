// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerCreditListByExternalIdResponseTest {

    @Test
    fun create() {
        val customerCreditListByExternalIdResponse =
            CustomerCreditListByExternalIdResponse.builder()
                .id("id")
                .balance(0.0)
                .effectiveDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .maximumInitialBalance(0.0)
                .perUnitCostBasis("per_unit_cost_basis")
                .status(CustomerCreditListByExternalIdResponse.Status.ACTIVE)
                .build()

        assertThat(customerCreditListByExternalIdResponse.id()).isEqualTo("id")
        assertThat(customerCreditListByExternalIdResponse.balance()).isEqualTo(0.0)
        assertThat(customerCreditListByExternalIdResponse.effectiveDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(customerCreditListByExternalIdResponse.expiryDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(customerCreditListByExternalIdResponse.maximumInitialBalance()).isEqualTo(0.0)
        assertThat(customerCreditListByExternalIdResponse.perUnitCostBasis())
            .isEqualTo("per_unit_cost_basis")
        assertThat(customerCreditListByExternalIdResponse.status())
            .isEqualTo(CustomerCreditListByExternalIdResponse.Status.ACTIVE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customerCreditListByExternalIdResponse =
            CustomerCreditListByExternalIdResponse.builder()
                .id("id")
                .balance(0.0)
                .effectiveDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .maximumInitialBalance(0.0)
                .perUnitCostBasis("per_unit_cost_basis")
                .status(CustomerCreditListByExternalIdResponse.Status.ACTIVE)
                .build()

        val roundtrippedCustomerCreditListByExternalIdResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerCreditListByExternalIdResponse),
                jacksonTypeRef<CustomerCreditListByExternalIdResponse>(),
            )

        assertThat(roundtrippedCustomerCreditListByExternalIdResponse)
            .isEqualTo(customerCreditListByExternalIdResponse)
    }
}
