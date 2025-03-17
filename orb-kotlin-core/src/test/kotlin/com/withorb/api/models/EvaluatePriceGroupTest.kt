// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EvaluatePriceGroupTest {

    @Test
    fun createEvaluatePriceGroup() {
        val evaluatePriceGroup =
            EvaluatePriceGroup.builder()
                .amount("amount")
                .addGroupingValue("string")
                .quantity(0.0)
                .build()
        assertThat(evaluatePriceGroup).isNotNull
        assertThat(evaluatePriceGroup.amount()).isEqualTo("amount")
        assertThat(evaluatePriceGroup.groupingValues())
            .containsExactly(EvaluatePriceGroup.GroupingValue.ofString("string"))
        assertThat(evaluatePriceGroup.quantity()).isEqualTo(0.0)
    }
}
