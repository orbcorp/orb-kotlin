// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewAllocationPriceTest {

    @Test
    fun create() {
        val newAllocationPrice =
            NewAllocationPrice.builder()
                .amount("10.00")
                .cadence(NewAllocationPrice.Cadence.MONTHLY)
                .currency("USD")
                .customExpiration(
                    CustomExpiration.builder()
                        .duration(0L)
                        .durationUnit(CustomExpiration.DurationUnit.DAY)
                        .build()
                )
                .expiresAtEndOfCadence(true)
                .addFilter(
                    NewAllocationPrice.Filter.builder()
                        .field(NewAllocationPrice.Filter.Field.ITEM_ID)
                        .operator(NewAllocationPrice.Filter.Operator.INCLUDES)
                        .addValue("string")
                        .build()
                )
                .build()

        assertThat(newAllocationPrice.amount()).isEqualTo("10.00")
        assertThat(newAllocationPrice.cadence()).isEqualTo(NewAllocationPrice.Cadence.MONTHLY)
        assertThat(newAllocationPrice.currency()).isEqualTo("USD")
        assertThat(newAllocationPrice.customExpiration())
            .isEqualTo(
                CustomExpiration.builder()
                    .duration(0L)
                    .durationUnit(CustomExpiration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newAllocationPrice.expiresAtEndOfCadence()).isEqualTo(true)
        assertThat(newAllocationPrice.filters())
            .containsExactly(
                NewAllocationPrice.Filter.builder()
                    .field(NewAllocationPrice.Filter.Field.ITEM_ID)
                    .operator(NewAllocationPrice.Filter.Operator.INCLUDES)
                    .addValue("string")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newAllocationPrice =
            NewAllocationPrice.builder()
                .amount("10.00")
                .cadence(NewAllocationPrice.Cadence.MONTHLY)
                .currency("USD")
                .customExpiration(
                    CustomExpiration.builder()
                        .duration(0L)
                        .durationUnit(CustomExpiration.DurationUnit.DAY)
                        .build()
                )
                .expiresAtEndOfCadence(true)
                .addFilter(
                    NewAllocationPrice.Filter.builder()
                        .field(NewAllocationPrice.Filter.Field.ITEM_ID)
                        .operator(NewAllocationPrice.Filter.Operator.INCLUDES)
                        .addValue("string")
                        .build()
                )
                .build()

        val roundtrippedNewAllocationPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newAllocationPrice),
                jacksonTypeRef<NewAllocationPrice>(),
            )

        assertThat(roundtrippedNewAllocationPrice).isEqualTo(newAllocationPrice)
    }
}
