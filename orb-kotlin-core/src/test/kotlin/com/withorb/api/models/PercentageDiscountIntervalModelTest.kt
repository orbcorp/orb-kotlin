// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PercentageDiscountIntervalModelTest {

    @Test
    fun createPercentageDiscountIntervalModel() {
        val percentageDiscountIntervalModel =
            PercentageDiscountIntervalModel.builder()
                .addAppliesToPriceId("string")
                .addAppliesToPriceIntervalId("string")
                .discountType(PercentageDiscountIntervalModel.DiscountType.PERCENTAGE)
                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .percentageDiscount(0.15)
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(percentageDiscountIntervalModel).isNotNull
        assertThat(percentageDiscountIntervalModel.appliesToPriceIds()).containsExactly("string")
        assertThat(percentageDiscountIntervalModel.appliesToPriceIntervalIds())
            .containsExactly("string")
        assertThat(percentageDiscountIntervalModel.discountType())
            .isEqualTo(PercentageDiscountIntervalModel.DiscountType.PERCENTAGE)
        assertThat(percentageDiscountIntervalModel.endDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(percentageDiscountIntervalModel.percentageDiscount()).isEqualTo(0.15)
        assertThat(percentageDiscountIntervalModel.startDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
