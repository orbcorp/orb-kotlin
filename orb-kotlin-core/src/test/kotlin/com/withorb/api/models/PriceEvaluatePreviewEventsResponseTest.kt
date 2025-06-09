// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PriceEvaluatePreviewEventsResponseTest {

    @Test
    fun create() {
        val priceEvaluatePreviewEventsResponse =
            PriceEvaluatePreviewEventsResponse.builder()
                .addData(
                    PriceEvaluatePreviewEventsResponse.Data.builder()
                        .currency("currency")
                        .addPriceGroup(
                            EvaluatePriceGroup.builder()
                                .amount("amount")
                                .addGroupingValue("string")
                                .quantity(0.0)
                                .build()
                        )
                        .inlinePriceIndex(0L)
                        .priceId("price_id")
                        .build()
                )
                .build()

        assertThat(priceEvaluatePreviewEventsResponse.data())
            .containsExactly(
                PriceEvaluatePreviewEventsResponse.Data.builder()
                    .currency("currency")
                    .addPriceGroup(
                        EvaluatePriceGroup.builder()
                            .amount("amount")
                            .addGroupingValue("string")
                            .quantity(0.0)
                            .build()
                    )
                    .inlinePriceIndex(0L)
                    .priceId("price_id")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val priceEvaluatePreviewEventsResponse =
            PriceEvaluatePreviewEventsResponse.builder()
                .addData(
                    PriceEvaluatePreviewEventsResponse.Data.builder()
                        .currency("currency")
                        .addPriceGroup(
                            EvaluatePriceGroup.builder()
                                .amount("amount")
                                .addGroupingValue("string")
                                .quantity(0.0)
                                .build()
                        )
                        .inlinePriceIndex(0L)
                        .priceId("price_id")
                        .build()
                )
                .build()

        val roundtrippedPriceEvaluatePreviewEventsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(priceEvaluatePreviewEventsResponse),
                jacksonTypeRef<PriceEvaluatePreviewEventsResponse>(),
            )

        assertThat(roundtrippedPriceEvaluatePreviewEventsResponse)
            .isEqualTo(priceEvaluatePreviewEventsResponse)
    }
}
