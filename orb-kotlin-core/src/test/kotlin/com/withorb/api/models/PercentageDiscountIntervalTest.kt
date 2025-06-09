// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PercentageDiscountIntervalTest {

    @Test
    fun create() {
        val percentageDiscountInterval =
            PercentageDiscountInterval.builder()
                .addAppliesToPriceIntervalId("string")
                .discountType(PercentageDiscountInterval.DiscountType.PERCENTAGE)
                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addFilter(
                    TransformPriceFilter.builder()
                        .field(TransformPriceFilter.Field.PRICE_ID)
                        .operator(TransformPriceFilter.Operator.INCLUDES)
                        .addValue("string")
                        .build()
                )
                .percentageDiscount(0.15)
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(percentageDiscountInterval.appliesToPriceIntervalIds()).containsExactly("string")
        assertThat(percentageDiscountInterval.discountType())
            .isEqualTo(PercentageDiscountInterval.DiscountType.PERCENTAGE)
        assertThat(percentageDiscountInterval.endDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(percentageDiscountInterval.filters())
            .containsExactly(
                TransformPriceFilter.builder()
                    .field(TransformPriceFilter.Field.PRICE_ID)
                    .operator(TransformPriceFilter.Operator.INCLUDES)
                    .addValue("string")
                    .build()
            )
        assertThat(percentageDiscountInterval.percentageDiscount()).isEqualTo(0.15)
        assertThat(percentageDiscountInterval.startDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val percentageDiscountInterval =
            PercentageDiscountInterval.builder()
                .addAppliesToPriceIntervalId("string")
                .discountType(PercentageDiscountInterval.DiscountType.PERCENTAGE)
                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addFilter(
                    TransformPriceFilter.builder()
                        .field(TransformPriceFilter.Field.PRICE_ID)
                        .operator(TransformPriceFilter.Operator.INCLUDES)
                        .addValue("string")
                        .build()
                )
                .percentageDiscount(0.15)
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedPercentageDiscountInterval =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(percentageDiscountInterval),
                jacksonTypeRef<PercentageDiscountInterval>(),
            )

        assertThat(roundtrippedPercentageDiscountInterval).isEqualTo(percentageDiscountInterval)
    }
}
