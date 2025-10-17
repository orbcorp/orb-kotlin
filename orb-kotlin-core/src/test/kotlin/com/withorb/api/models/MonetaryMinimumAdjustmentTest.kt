// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MonetaryMinimumAdjustmentTest {

    @Test
    fun create() {
        val monetaryMinimumAdjustment =
            MonetaryMinimumAdjustment.builder()
                .id("id")
                .adjustmentType(MonetaryMinimumAdjustment.AdjustmentType.MINIMUM)
                .amount("amount")
                .addAppliesToPriceId("string")
                .addFilter(
                    MonetaryMinimumAdjustment.Filter.builder()
                        .field(MonetaryMinimumAdjustment.Filter.Field.PRICE_ID)
                        .operator(MonetaryMinimumAdjustment.Filter.Operator.INCLUDES)
                        .addValue("string")
                        .build()
                )
                .isInvoiceLevel(true)
                .itemId("item_id")
                .minimumAmount("minimum_amount")
                .reason("reason")
                .replacesAdjustmentId("replaces_adjustment_id")
                .build()

        assertThat(monetaryMinimumAdjustment.id()).isEqualTo("id")
        assertThat(monetaryMinimumAdjustment.adjustmentType())
            .isEqualTo(MonetaryMinimumAdjustment.AdjustmentType.MINIMUM)
        assertThat(monetaryMinimumAdjustment.amount()).isEqualTo("amount")
        assertThat(monetaryMinimumAdjustment.appliesToPriceIds()).containsExactly("string")
        assertThat(monetaryMinimumAdjustment.filters())
            .containsExactly(
                MonetaryMinimumAdjustment.Filter.builder()
                    .field(MonetaryMinimumAdjustment.Filter.Field.PRICE_ID)
                    .operator(MonetaryMinimumAdjustment.Filter.Operator.INCLUDES)
                    .addValue("string")
                    .build()
            )
        assertThat(monetaryMinimumAdjustment.isInvoiceLevel()).isEqualTo(true)
        assertThat(monetaryMinimumAdjustment.itemId()).isEqualTo("item_id")
        assertThat(monetaryMinimumAdjustment.minimumAmount()).isEqualTo("minimum_amount")
        assertThat(monetaryMinimumAdjustment.reason()).isEqualTo("reason")
        assertThat(monetaryMinimumAdjustment.replacesAdjustmentId())
            .isEqualTo("replaces_adjustment_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val monetaryMinimumAdjustment =
            MonetaryMinimumAdjustment.builder()
                .id("id")
                .adjustmentType(MonetaryMinimumAdjustment.AdjustmentType.MINIMUM)
                .amount("amount")
                .addAppliesToPriceId("string")
                .addFilter(
                    MonetaryMinimumAdjustment.Filter.builder()
                        .field(MonetaryMinimumAdjustment.Filter.Field.PRICE_ID)
                        .operator(MonetaryMinimumAdjustment.Filter.Operator.INCLUDES)
                        .addValue("string")
                        .build()
                )
                .isInvoiceLevel(true)
                .itemId("item_id")
                .minimumAmount("minimum_amount")
                .reason("reason")
                .replacesAdjustmentId("replaces_adjustment_id")
                .build()

        val roundtrippedMonetaryMinimumAdjustment =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(monetaryMinimumAdjustment),
                jacksonTypeRef<MonetaryMinimumAdjustment>(),
            )

        assertThat(roundtrippedMonetaryMinimumAdjustment).isEqualTo(monetaryMinimumAdjustment)
    }
}
