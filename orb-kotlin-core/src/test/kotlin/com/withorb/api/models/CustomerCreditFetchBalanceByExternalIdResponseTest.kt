// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerCreditFetchBalanceByExternalIdResponseTest {

    @Test
    fun create() {
        val customerCreditFetchBalanceByExternalIdResponse =
            CustomerCreditFetchBalanceByExternalIdResponse.builder()
                .balance(0.0)
                .currency("currency")
                .nextExpiryBalance(0.0)
                .nextExpiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .pendingPaymentBalance(0.0)
                .build()

        assertThat(customerCreditFetchBalanceByExternalIdResponse.balance()).isEqualTo(0.0)
        assertThat(customerCreditFetchBalanceByExternalIdResponse.currency()).isEqualTo("currency")
        assertThat(customerCreditFetchBalanceByExternalIdResponse.nextExpiryBalance())
            .isEqualTo(0.0)
        assertThat(customerCreditFetchBalanceByExternalIdResponse.nextExpiryDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(customerCreditFetchBalanceByExternalIdResponse.pendingPaymentBalance())
            .isEqualTo(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customerCreditFetchBalanceByExternalIdResponse =
            CustomerCreditFetchBalanceByExternalIdResponse.builder()
                .balance(0.0)
                .currency("currency")
                .nextExpiryBalance(0.0)
                .nextExpiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .pendingPaymentBalance(0.0)
                .build()

        val roundtrippedCustomerCreditFetchBalanceByExternalIdResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerCreditFetchBalanceByExternalIdResponse),
                jacksonTypeRef<CustomerCreditFetchBalanceByExternalIdResponse>(),
            )

        assertThat(roundtrippedCustomerCreditFetchBalanceByExternalIdResponse)
            .isEqualTo(customerCreditFetchBalanceByExternalIdResponse)
    }
}
