// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PriceEvaluateResponseTest {

    @Test
    fun create() {
        val priceEvaluateResponse =
            PriceEvaluateResponse.builder()
                .addData(
                    EvaluatePriceGroup.builder()
                        .amount("amount")
                        .addGroupingValue("string")
                        .quantity(0.0)
                        .build()
                )
                .build()

        assertThat(priceEvaluateResponse.data())
            .containsExactly(
                EvaluatePriceGroup.builder()
                    .amount("amount")
                    .addGroupingValue("string")
                    .quantity(0.0)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val priceEvaluateResponse =
            PriceEvaluateResponse.builder()
                .addData(
                    EvaluatePriceGroup.builder()
                        .amount("amount")
                        .addGroupingValue("string")
                        .quantity(0.0)
                        .build()
                )
                .build()

        val roundtrippedPriceEvaluateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(priceEvaluateResponse),
                jacksonTypeRef<PriceEvaluateResponse>(),
            )

        assertThat(roundtrippedPriceEvaluateResponse).isEqualTo(priceEvaluateResponse)
    }
}
