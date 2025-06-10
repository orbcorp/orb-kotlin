// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OtherSubLineItemTest {

    @Test
    fun create() {
        val otherSubLineItem =
            OtherSubLineItem.builder()
                .amount("9.00")
                .grouping(SubLineItemGrouping.builder().key("region").value("west").build())
                .name("Tier One")
                .quantity(5.0)
                .type(OtherSubLineItem.Type.NULL)
                .build()

        assertThat(otherSubLineItem.amount()).isEqualTo("9.00")
        assertThat(otherSubLineItem.grouping())
            .isEqualTo(SubLineItemGrouping.builder().key("region").value("west").build())
        assertThat(otherSubLineItem.name()).isEqualTo("Tier One")
        assertThat(otherSubLineItem.quantity()).isEqualTo(5.0)
        assertThat(otherSubLineItem.type()).isEqualTo(OtherSubLineItem.Type.NULL)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val otherSubLineItem =
            OtherSubLineItem.builder()
                .amount("9.00")
                .grouping(SubLineItemGrouping.builder().key("region").value("west").build())
                .name("Tier One")
                .quantity(5.0)
                .type(OtherSubLineItem.Type.NULL)
                .build()

        val roundtrippedOtherSubLineItem =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(otherSubLineItem),
                jacksonTypeRef<OtherSubLineItem>(),
            )

        assertThat(roundtrippedOtherSubLineItem).isEqualTo(otherSubLineItem)
    }
}
