// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BulkBpsTierTest {

    @Test
    fun create() {
        val bulkBpsTier =
            BulkBpsTier.builder()
                .bps(0.0)
                .maximumAmount("maximum_amount")
                .perUnitMaximum("per_unit_maximum")
                .build()

        assertThat(bulkBpsTier.bps()).isEqualTo(0.0)
        assertThat(bulkBpsTier.maximumAmount()).isEqualTo("maximum_amount")
        assertThat(bulkBpsTier.perUnitMaximum()).isEqualTo("per_unit_maximum")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val bulkBpsTier =
            BulkBpsTier.builder()
                .bps(0.0)
                .maximumAmount("maximum_amount")
                .perUnitMaximum("per_unit_maximum")
                .build()

        val roundtrippedBulkBpsTier =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(bulkBpsTier),
                jacksonTypeRef<BulkBpsTier>(),
            )

        assertThat(roundtrippedBulkBpsTier).isEqualTo(bulkBpsTier)
    }
}
