// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class UsageDiscountIntervalModelTest {

    @Test
    fun createUsageDiscountIntervalModel() {
        val usageDiscountIntervalModel =
            UsageDiscountIntervalModel.builder()
                .addAppliesToPriceId("string")
                .addAppliesToPriceIntervalId("string")
                .discountType(UsageDiscountIntervalModel.DiscountType.USAGE)
                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .usageDiscount(0.0)
                .build()
        assertThat(usageDiscountIntervalModel).isNotNull
        assertThat(usageDiscountIntervalModel.appliesToPriceIds()).containsExactly("string")
        assertThat(usageDiscountIntervalModel.appliesToPriceIntervalIds()).containsExactly("string")
        assertThat(usageDiscountIntervalModel.discountType())
            .isEqualTo(UsageDiscountIntervalModel.DiscountType.USAGE)
        assertThat(usageDiscountIntervalModel.endDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(usageDiscountIntervalModel.startDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(usageDiscountIntervalModel.usageDiscount()).isEqualTo(0.0)
    }
}
