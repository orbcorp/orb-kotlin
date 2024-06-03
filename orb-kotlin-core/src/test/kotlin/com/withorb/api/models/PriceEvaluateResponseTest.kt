// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PriceEvaluateResponseTest {

    @Test
    fun createPriceEvaluateResponse() {
        val priceEvaluateResponse =
            PriceEvaluateResponse.builder()
                .data(
                    listOf(
                        EvaluatePriceGroup.builder()
                            .amount("string")
                            .groupingValues(
                                listOf(EvaluatePriceGroup.GroupingValue.ofString("string"))
                            )
                            .quantity(42.23)
                            .build()
                    )
                )
                .build()
        assertThat(priceEvaluateResponse).isNotNull
        assertThat(priceEvaluateResponse.data())
            .containsExactly(
                EvaluatePriceGroup.builder()
                    .amount("string")
                    .groupingValues(listOf(EvaluatePriceGroup.GroupingValue.ofString("string")))
                    .quantity(42.23)
                    .build()
            )
    }
}
