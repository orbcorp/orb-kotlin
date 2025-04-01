// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EvaluatePriceGroupTest {

    @Test
    fun create() {
        val evaluatePriceGroup =
            EvaluatePriceGroup.builder()
                .amount("amount")
                .addGroupingValue("string")
                .quantity(0.0)
                .build()

        assertThat(evaluatePriceGroup.amount()).isEqualTo("amount")
        assertThat(evaluatePriceGroup.groupingValues())
            .containsExactly(EvaluatePriceGroup.GroupingValue.ofString("string"))
        assertThat(evaluatePriceGroup.quantity()).isEqualTo(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val evaluatePriceGroup =
            EvaluatePriceGroup.builder()
                .amount("amount")
                .addGroupingValue("string")
                .quantity(0.0)
                .build()

        val roundtrippedEvaluatePriceGroup =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(evaluatePriceGroup),
                jacksonTypeRef<EvaluatePriceGroup>(),
            )

        assertThat(roundtrippedEvaluatePriceGroup).isEqualTo(evaluatePriceGroup)
    }
}
