// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerCreditListResponseTest {

    @Test
    fun createCustomerCreditListResponse() {
        val customerCreditListResponse =
            CustomerCreditListResponse.builder()
                .id("string")
                .balance(42.23)
                .effectiveDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .maximumInitialBalance(42.23)
                .perUnitCostBasis("string")
                .status(CustomerCreditListResponse.Status.ACTIVE)
                .build()
        assertThat(customerCreditListResponse).isNotNull
        assertThat(customerCreditListResponse.id()).isEqualTo("string")
        assertThat(customerCreditListResponse.balance()).isEqualTo(42.23)
        assertThat(customerCreditListResponse.effectiveDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(customerCreditListResponse.expiryDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(customerCreditListResponse.maximumInitialBalance()).isEqualTo(42.23)
        assertThat(customerCreditListResponse.perUnitCostBasis()).isEqualTo("string")
        assertThat(customerCreditListResponse.status())
            .isEqualTo(CustomerCreditListResponse.Status.ACTIVE)
    }
}
