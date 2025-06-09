// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MaximumIntervalTest {

    @Test
    fun create() {
        val maximumInterval =
            MaximumInterval.builder()
                .addAppliesToPriceIntervalId("string")
                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addFilter(
                    TransformPriceFilter.builder()
                        .field(TransformPriceFilter.Field.PRICE_ID)
                        .operator(TransformPriceFilter.Operator.INCLUDES)
                        .addValue("string")
                        .build()
                )
                .maximumAmount("maximum_amount")
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(maximumInterval.appliesToPriceIntervalIds()).containsExactly("string")
        assertThat(maximumInterval.endDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(maximumInterval.filters())
            .containsExactly(
                TransformPriceFilter.builder()
                    .field(TransformPriceFilter.Field.PRICE_ID)
                    .operator(TransformPriceFilter.Operator.INCLUDES)
                    .addValue("string")
                    .build()
            )
        assertThat(maximumInterval.maximumAmount()).isEqualTo("maximum_amount")
        assertThat(maximumInterval.startDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val maximumInterval =
            MaximumInterval.builder()
                .addAppliesToPriceIntervalId("string")
                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addFilter(
                    TransformPriceFilter.builder()
                        .field(TransformPriceFilter.Field.PRICE_ID)
                        .operator(TransformPriceFilter.Operator.INCLUDES)
                        .addValue("string")
                        .build()
                )
                .maximumAmount("maximum_amount")
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedMaximumInterval =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(maximumInterval),
                jacksonTypeRef<MaximumInterval>(),
            )

        assertThat(roundtrippedMaximumInterval).isEqualTo(maximumInterval)
    }
}
