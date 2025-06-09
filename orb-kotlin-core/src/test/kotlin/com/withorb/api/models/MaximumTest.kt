// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MaximumTest {

    @Test
    fun create() {
        val maximum =
            Maximum.builder()
                .addAppliesToPriceId("string")
                .addFilter(
                    TransformPriceFilter.builder()
                        .field(TransformPriceFilter.Field.PRICE_ID)
                        .operator(TransformPriceFilter.Operator.INCLUDES)
                        .addValue("string")
                        .build()
                )
                .maximumAmount("maximum_amount")
                .build()

        assertThat(maximum.appliesToPriceIds()).containsExactly("string")
        assertThat(maximum.filters())
            .containsExactly(
                TransformPriceFilter.builder()
                    .field(TransformPriceFilter.Field.PRICE_ID)
                    .operator(TransformPriceFilter.Operator.INCLUDES)
                    .addValue("string")
                    .build()
            )
        assertThat(maximum.maximumAmount()).isEqualTo("maximum_amount")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val maximum =
            Maximum.builder()
                .addAppliesToPriceId("string")
                .addFilter(
                    TransformPriceFilter.builder()
                        .field(TransformPriceFilter.Field.PRICE_ID)
                        .operator(TransformPriceFilter.Operator.INCLUDES)
                        .addValue("string")
                        .build()
                )
                .maximumAmount("maximum_amount")
                .build()

        val roundtrippedMaximum =
            jsonMapper.readValue(jsonMapper.writeValueAsString(maximum), jacksonTypeRef<Maximum>())

        assertThat(roundtrippedMaximum).isEqualTo(maximum)
    }
}
