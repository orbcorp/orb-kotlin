// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MonetaryMaximumAdjustmentTest {

    @Test
    fun create() {
        val monetaryMaximumAdjustment =
            MonetaryMaximumAdjustment.builder()
                .id("id")
                .adjustmentType(MonetaryMaximumAdjustment.AdjustmentType.MAXIMUM)
                .amount("amount")
                .addAppliesToPriceId("string")
                .addFilter(
                    TransformPriceFilter.builder()
                        .field(TransformPriceFilter.Field.PRICE_ID)
                        .operator(TransformPriceFilter.Operator.INCLUDES)
                        .addValue("string")
                        .build()
                )
                .isInvoiceLevel(true)
                .maximumAmount("maximum_amount")
                .reason("reason")
                .replacesAdjustmentId("replaces_adjustment_id")
                .build()

        assertThat(monetaryMaximumAdjustment.id()).isEqualTo("id")
        assertThat(monetaryMaximumAdjustment.adjustmentType())
            .isEqualTo(MonetaryMaximumAdjustment.AdjustmentType.MAXIMUM)
        assertThat(monetaryMaximumAdjustment.amount()).isEqualTo("amount")
        assertThat(monetaryMaximumAdjustment.appliesToPriceIds()).containsExactly("string")
        assertThat(monetaryMaximumAdjustment.filters())
            .containsExactly(
                TransformPriceFilter.builder()
                    .field(TransformPriceFilter.Field.PRICE_ID)
                    .operator(TransformPriceFilter.Operator.INCLUDES)
                    .addValue("string")
                    .build()
            )
        assertThat(monetaryMaximumAdjustment.isInvoiceLevel()).isEqualTo(true)
        assertThat(monetaryMaximumAdjustment.maximumAmount()).isEqualTo("maximum_amount")
        assertThat(monetaryMaximumAdjustment.reason()).isEqualTo("reason")
        assertThat(monetaryMaximumAdjustment.replacesAdjustmentId())
            .isEqualTo("replaces_adjustment_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val monetaryMaximumAdjustment =
            MonetaryMaximumAdjustment.builder()
                .id("id")
                .adjustmentType(MonetaryMaximumAdjustment.AdjustmentType.MAXIMUM)
                .amount("amount")
                .addAppliesToPriceId("string")
                .addFilter(
                    TransformPriceFilter.builder()
                        .field(TransformPriceFilter.Field.PRICE_ID)
                        .operator(TransformPriceFilter.Operator.INCLUDES)
                        .addValue("string")
                        .build()
                )
                .isInvoiceLevel(true)
                .maximumAmount("maximum_amount")
                .reason("reason")
                .replacesAdjustmentId("replaces_adjustment_id")
                .build()

        val roundtrippedMonetaryMaximumAdjustment =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(monetaryMaximumAdjustment),
                jacksonTypeRef<MonetaryMaximumAdjustment>(),
            )

        assertThat(roundtrippedMonetaryMaximumAdjustment).isEqualTo(monetaryMaximumAdjustment)
    }
}
