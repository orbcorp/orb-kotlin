// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MinimumIntervalTest {

    @Test
    fun create() {
        val minimumInterval =
            MinimumInterval.builder()
                .addAppliesToPriceIntervalId("string")
                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addFilter(
                    MinimumInterval.Filter.builder()
                        .field(MinimumInterval.Filter.Field.PRICE_ID)
                        .operator(MinimumInterval.Filter.Operator.INCLUDES)
                        .addValue("string")
                        .build()
                )
                .minimumAmount("minimum_amount")
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(minimumInterval.appliesToPriceIntervalIds()).containsExactly("string")
        assertThat(minimumInterval.endDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(minimumInterval.filters())
            .containsExactly(
                MinimumInterval.Filter.builder()
                    .field(MinimumInterval.Filter.Field.PRICE_ID)
                    .operator(MinimumInterval.Filter.Operator.INCLUDES)
                    .addValue("string")
                    .build()
            )
        assertThat(minimumInterval.minimumAmount()).isEqualTo("minimum_amount")
        assertThat(minimumInterval.startDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val minimumInterval =
            MinimumInterval.builder()
                .addAppliesToPriceIntervalId("string")
                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addFilter(
                    MinimumInterval.Filter.builder()
                        .field(MinimumInterval.Filter.Field.PRICE_ID)
                        .operator(MinimumInterval.Filter.Operator.INCLUDES)
                        .addValue("string")
                        .build()
                )
                .minimumAmount("minimum_amount")
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedMinimumInterval =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(minimumInterval),
                jacksonTypeRef<MinimumInterval>(),
            )

        assertThat(roundtrippedMinimumInterval).isEqualTo(minimumInterval)
    }
}
