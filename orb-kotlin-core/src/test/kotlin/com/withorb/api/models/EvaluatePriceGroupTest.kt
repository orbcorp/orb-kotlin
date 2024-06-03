// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EvaluatePriceGroupTest {

    @Test
    fun createEvaluatePriceGroup() {
        val evaluatePriceGroup =
            EvaluatePriceGroup.builder()
                .amount("string")
                .groupingValues(listOf(EvaluatePriceGroup.GroupingValue.ofString("string")))
                .quantity(42.23)
                .build()
        assertThat(evaluatePriceGroup).isNotNull
        assertThat(evaluatePriceGroup.amount()).isEqualTo("string")
        assertThat(evaluatePriceGroup.groupingValues())
            .containsExactly(EvaluatePriceGroup.GroupingValue.ofString("string"))
        assertThat(evaluatePriceGroup.quantity()).isEqualTo(42.23)
    }
}
