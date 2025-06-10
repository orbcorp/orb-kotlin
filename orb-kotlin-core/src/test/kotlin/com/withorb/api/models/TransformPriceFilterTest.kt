// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransformPriceFilterTest {

    @Test
    fun create() {
        val transformPriceFilter =
            TransformPriceFilter.builder()
                .field(TransformPriceFilter.Field.PRICE_ID)
                .operator(TransformPriceFilter.Operator.INCLUDES)
                .addValue("string")
                .build()

        assertThat(transformPriceFilter.field()).isEqualTo(TransformPriceFilter.Field.PRICE_ID)
        assertThat(transformPriceFilter.operator())
            .isEqualTo(TransformPriceFilter.Operator.INCLUDES)
        assertThat(transformPriceFilter.values()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transformPriceFilter =
            TransformPriceFilter.builder()
                .field(TransformPriceFilter.Field.PRICE_ID)
                .operator(TransformPriceFilter.Operator.INCLUDES)
                .addValue("string")
                .build()

        val roundtrippedTransformPriceFilter =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transformPriceFilter),
                jacksonTypeRef<TransformPriceFilter>(),
            )

        assertThat(roundtrippedTransformPriceFilter).isEqualTo(transformPriceFilter)
    }
}
