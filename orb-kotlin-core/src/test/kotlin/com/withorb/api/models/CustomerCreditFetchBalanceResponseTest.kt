// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerCreditFetchBalanceResponseTest {

    @Test
    fun create() {
        val customerCreditFetchBalanceResponse =
            CustomerCreditFetchBalanceResponse.builder()
                .balance(0.0)
                .currency("currency")
                .nextExpiryBalance(0.0)
                .nextExpiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .pendingPaymentBalance(0.0)
                .build()

        assertThat(customerCreditFetchBalanceResponse.balance()).isEqualTo(0.0)
        assertThat(customerCreditFetchBalanceResponse.currency()).isEqualTo("currency")
        assertThat(customerCreditFetchBalanceResponse.nextExpiryBalance()).isEqualTo(0.0)
        assertThat(customerCreditFetchBalanceResponse.nextExpiryDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(customerCreditFetchBalanceResponse.pendingPaymentBalance()).isEqualTo(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customerCreditFetchBalanceResponse =
            CustomerCreditFetchBalanceResponse.builder()
                .balance(0.0)
                .currency("currency")
                .nextExpiryBalance(0.0)
                .nextExpiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .pendingPaymentBalance(0.0)
                .build()

        val roundtrippedCustomerCreditFetchBalanceResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerCreditFetchBalanceResponse),
                jacksonTypeRef<CustomerCreditFetchBalanceResponse>(),
            )

        assertThat(roundtrippedCustomerCreditFetchBalanceResponse)
            .isEqualTo(customerCreditFetchBalanceResponse)
    }
}
