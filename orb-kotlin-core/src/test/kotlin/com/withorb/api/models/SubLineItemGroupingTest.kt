// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubLineItemGroupingTest {

    @Test
    fun create() {
        val subLineItemGrouping = SubLineItemGrouping.builder().key("region").value("west").build()

        assertThat(subLineItemGrouping.key()).isEqualTo("region")
        assertThat(subLineItemGrouping.value()).isEqualTo("west")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subLineItemGrouping = SubLineItemGrouping.builder().key("region").value("west").build()

        val roundtrippedSubLineItemGrouping =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subLineItemGrouping),
                jacksonTypeRef<SubLineItemGrouping>(),
            )

        assertThat(roundtrippedSubLineItemGrouping).isEqualTo(subLineItemGrouping)
    }
}
