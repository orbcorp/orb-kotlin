// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AmountDiscountIntervalModelTest {

    @Test
    fun createAmountDiscountIntervalModel() {
        val amountDiscountIntervalModel =
            AmountDiscountIntervalModel.builder()
                .amountDiscount("amount_discount")
                .addAppliesToPriceId("string")
                .addAppliesToPriceIntervalId("string")
                .discountType(AmountDiscountIntervalModel.DiscountType.AMOUNT)
                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(amountDiscountIntervalModel).isNotNull
        assertThat(amountDiscountIntervalModel.amountDiscount()).isEqualTo("amount_discount")
        assertThat(amountDiscountIntervalModel.appliesToPriceIds()).containsExactly("string")
        assertThat(amountDiscountIntervalModel.appliesToPriceIntervalIds())
            .containsExactly("string")
        assertThat(amountDiscountIntervalModel.discountType())
            .isEqualTo(AmountDiscountIntervalModel.DiscountType.AMOUNT)
        assertThat(amountDiscountIntervalModel.endDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(amountDiscountIntervalModel.startDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
