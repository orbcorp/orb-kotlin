// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AmountDiscountIntervalTest {

    @Test
    fun create() {
        val amountDiscountInterval =
            AmountDiscountInterval.builder()
                .amountDiscount("amount_discount")
                .addAppliesToPriceIntervalId("string")
                .discountType(AmountDiscountInterval.DiscountType.AMOUNT)
                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addFilter(
                    AmountDiscountInterval.Filter.builder()
                        .field(AmountDiscountInterval.Filter.Field.PRICE_ID)
                        .operator(AmountDiscountInterval.Filter.Operator.INCLUDES)
                        .addValue("string")
                        .build()
                )
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(amountDiscountInterval.amountDiscount()).isEqualTo("amount_discount")
        assertThat(amountDiscountInterval.appliesToPriceIntervalIds()).containsExactly("string")
        assertThat(amountDiscountInterval.discountType())
            .isEqualTo(AmountDiscountInterval.DiscountType.AMOUNT)
        assertThat(amountDiscountInterval.endDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(amountDiscountInterval.filters())
            .containsExactly(
                AmountDiscountInterval.Filter.builder()
                    .field(AmountDiscountInterval.Filter.Field.PRICE_ID)
                    .operator(AmountDiscountInterval.Filter.Operator.INCLUDES)
                    .addValue("string")
                    .build()
            )
        assertThat(amountDiscountInterval.startDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val amountDiscountInterval =
            AmountDiscountInterval.builder()
                .amountDiscount("amount_discount")
                .addAppliesToPriceIntervalId("string")
                .discountType(AmountDiscountInterval.DiscountType.AMOUNT)
                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addFilter(
                    AmountDiscountInterval.Filter.builder()
                        .field(AmountDiscountInterval.Filter.Field.PRICE_ID)
                        .operator(AmountDiscountInterval.Filter.Operator.INCLUDES)
                        .addValue("string")
                        .build()
                )
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedAmountDiscountInterval =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(amountDiscountInterval),
                jacksonTypeRef<AmountDiscountInterval>(),
            )

        assertThat(roundtrippedAmountDiscountInterval).isEqualTo(amountDiscountInterval)
    }
}
