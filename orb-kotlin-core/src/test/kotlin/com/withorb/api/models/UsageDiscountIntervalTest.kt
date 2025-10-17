// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UsageDiscountIntervalTest {

    @Test
    fun create() {
        val usageDiscountInterval =
            UsageDiscountInterval.builder()
                .addAppliesToPriceIntervalId("string")
                .discountType(UsageDiscountInterval.DiscountType.USAGE)
                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addFilter(
                    UsageDiscountInterval.Filter.builder()
                        .field(UsageDiscountInterval.Filter.Field.PRICE_ID)
                        .operator(UsageDiscountInterval.Filter.Operator.INCLUDES)
                        .addValue("string")
                        .build()
                )
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .usageDiscount(0.0)
                .build()

        assertThat(usageDiscountInterval.appliesToPriceIntervalIds()).containsExactly("string")
        assertThat(usageDiscountInterval.discountType())
            .isEqualTo(UsageDiscountInterval.DiscountType.USAGE)
        assertThat(usageDiscountInterval.endDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(usageDiscountInterval.filters())
            .containsExactly(
                UsageDiscountInterval.Filter.builder()
                    .field(UsageDiscountInterval.Filter.Field.PRICE_ID)
                    .operator(UsageDiscountInterval.Filter.Operator.INCLUDES)
                    .addValue("string")
                    .build()
            )
        assertThat(usageDiscountInterval.startDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(usageDiscountInterval.usageDiscount()).isEqualTo(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val usageDiscountInterval =
            UsageDiscountInterval.builder()
                .addAppliesToPriceIntervalId("string")
                .discountType(UsageDiscountInterval.DiscountType.USAGE)
                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addFilter(
                    UsageDiscountInterval.Filter.builder()
                        .field(UsageDiscountInterval.Filter.Field.PRICE_ID)
                        .operator(UsageDiscountInterval.Filter.Operator.INCLUDES)
                        .addValue("string")
                        .build()
                )
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .usageDiscount(0.0)
                .build()

        val roundtrippedUsageDiscountInterval =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(usageDiscountInterval),
                jacksonTypeRef<UsageDiscountInterval>(),
            )

        assertThat(roundtrippedUsageDiscountInterval).isEqualTo(usageDiscountInterval)
    }
}
