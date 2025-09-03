// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TierSubLineItemTest {

    @Test
    fun create() {
        val tierSubLineItem =
            TierSubLineItem.builder()
                .amount("9.00")
                .grouping(SubLineItemGrouping.builder().key("region").value("west").build())
                .name("Tier One")
                .quantity(5.0)
                .tierConfig(
                    TierSubLineItem.TierConfig.builder()
                        .firstUnit(1.0)
                        .lastUnit(1000.0)
                        .unitAmount("3.00")
                        .build()
                )
                .type(TierSubLineItem.Type.TIER)
                .build()

        assertThat(tierSubLineItem.amount()).isEqualTo("9.00")
        assertThat(tierSubLineItem.grouping())
            .isEqualTo(SubLineItemGrouping.builder().key("region").value("west").build())
        assertThat(tierSubLineItem.name()).isEqualTo("Tier One")
        assertThat(tierSubLineItem.quantity()).isEqualTo(5.0)
        assertThat(tierSubLineItem.tierConfig())
            .isEqualTo(
                TierSubLineItem.TierConfig.builder()
                    .firstUnit(1.0)
                    .lastUnit(1000.0)
                    .unitAmount("3.00")
                    .build()
            )
        assertThat(tierSubLineItem.type()).isEqualTo(TierSubLineItem.Type.TIER)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tierSubLineItem =
            TierSubLineItem.builder()
                .amount("9.00")
                .grouping(SubLineItemGrouping.builder().key("region").value("west").build())
                .name("Tier One")
                .quantity(5.0)
                .tierConfig(
                    TierSubLineItem.TierConfig.builder()
                        .firstUnit(1.0)
                        .lastUnit(1000.0)
                        .unitAmount("3.00")
                        .build()
                )
                .type(TierSubLineItem.Type.TIER)
                .build()

        val roundtrippedTierSubLineItem =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tierSubLineItem),
                jacksonTypeRef<TierSubLineItem>(),
            )

        assertThat(roundtrippedTierSubLineItem).isEqualTo(tierSubLineItem)
    }
}
