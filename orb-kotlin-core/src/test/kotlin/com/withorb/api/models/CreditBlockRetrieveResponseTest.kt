// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreditBlockRetrieveResponseTest {

    @Test
    fun create() {
        val creditBlockRetrieveResponse =
            CreditBlockRetrieveResponse.builder()
                .id("id")
                .balance(0.0)
                .effectiveDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addFilter(
                    CreditBlockRetrieveResponse.Filter.builder()
                        .field(CreditBlockRetrieveResponse.Filter.Field.PRICE_ID)
                        .operator(CreditBlockRetrieveResponse.Filter.Operator.INCLUDES)
                        .addValue("string")
                        .build()
                )
                .maximumInitialBalance(0.0)
                .perUnitCostBasis("per_unit_cost_basis")
                .status(CreditBlockRetrieveResponse.Status.ACTIVE)
                .build()

        assertThat(creditBlockRetrieveResponse.id()).isEqualTo("id")
        assertThat(creditBlockRetrieveResponse.balance()).isEqualTo(0.0)
        assertThat(creditBlockRetrieveResponse.effectiveDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(creditBlockRetrieveResponse.expiryDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(creditBlockRetrieveResponse.filters())
            .containsExactly(
                CreditBlockRetrieveResponse.Filter.builder()
                    .field(CreditBlockRetrieveResponse.Filter.Field.PRICE_ID)
                    .operator(CreditBlockRetrieveResponse.Filter.Operator.INCLUDES)
                    .addValue("string")
                    .build()
            )
        assertThat(creditBlockRetrieveResponse.maximumInitialBalance()).isEqualTo(0.0)
        assertThat(creditBlockRetrieveResponse.perUnitCostBasis()).isEqualTo("per_unit_cost_basis")
        assertThat(creditBlockRetrieveResponse.status())
            .isEqualTo(CreditBlockRetrieveResponse.Status.ACTIVE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val creditBlockRetrieveResponse =
            CreditBlockRetrieveResponse.builder()
                .id("id")
                .balance(0.0)
                .effectiveDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addFilter(
                    CreditBlockRetrieveResponse.Filter.builder()
                        .field(CreditBlockRetrieveResponse.Filter.Field.PRICE_ID)
                        .operator(CreditBlockRetrieveResponse.Filter.Operator.INCLUDES)
                        .addValue("string")
                        .build()
                )
                .maximumInitialBalance(0.0)
                .perUnitCostBasis("per_unit_cost_basis")
                .status(CreditBlockRetrieveResponse.Status.ACTIVE)
                .build()

        val roundtrippedCreditBlockRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(creditBlockRetrieveResponse),
                jacksonTypeRef<CreditBlockRetrieveResponse>(),
            )

        assertThat(roundtrippedCreditBlockRetrieveResponse).isEqualTo(creditBlockRetrieveResponse)
    }
}
