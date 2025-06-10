// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MinimumTest {

    @Test
    fun create() {
        val minimum =
            Minimum.builder()
                .addAppliesToPriceId("string")
                .addFilter(
                    TransformPriceFilter.builder()
                        .field(TransformPriceFilter.Field.PRICE_ID)
                        .operator(TransformPriceFilter.Operator.INCLUDES)
                        .addValue("string")
                        .build()
                )
                .minimumAmount("minimum_amount")
                .build()

        assertThat(minimum.appliesToPriceIds()).containsExactly("string")
        assertThat(minimum.filters())
            .containsExactly(
                TransformPriceFilter.builder()
                    .field(TransformPriceFilter.Field.PRICE_ID)
                    .operator(TransformPriceFilter.Operator.INCLUDES)
                    .addValue("string")
                    .build()
            )
        assertThat(minimum.minimumAmount()).isEqualTo("minimum_amount")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val minimum =
            Minimum.builder()
                .addAppliesToPriceId("string")
                .addFilter(
                    TransformPriceFilter.builder()
                        .field(TransformPriceFilter.Field.PRICE_ID)
                        .operator(TransformPriceFilter.Operator.INCLUDES)
                        .addValue("string")
                        .build()
                )
                .minimumAmount("minimum_amount")
                .build()

        val roundtrippedMinimum =
            jsonMapper.readValue(jsonMapper.writeValueAsString(minimum), jacksonTypeRef<Minimum>())

        assertThat(roundtrippedMinimum).isEqualTo(minimum)
    }
}
