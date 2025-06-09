// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BillableMetricTinyTest {

    @Test
    fun create() {
        val billableMetricTiny = BillableMetricTiny.builder().id("id").build()

        assertThat(billableMetricTiny.id()).isEqualTo("id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val billableMetricTiny = BillableMetricTiny.builder().id("id").build()

        val roundtrippedBillableMetricTiny =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(billableMetricTiny),
                jacksonTypeRef<BillableMetricTiny>(),
            )

        assertThat(roundtrippedBillableMetricTiny).isEqualTo(billableMetricTiny)
    }
}
