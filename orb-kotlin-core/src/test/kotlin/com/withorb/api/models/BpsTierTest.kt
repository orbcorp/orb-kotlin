// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BpsTierTest {

    @Test
    fun create() {
        val bpsTier =
            BpsTier.builder()
                .bps(0.0)
                .minimumAmount("minimum_amount")
                .maximumAmount("maximum_amount")
                .perUnitMaximum("per_unit_maximum")
                .build()

        assertThat(bpsTier.bps()).isEqualTo(0.0)
        assertThat(bpsTier.minimumAmount()).isEqualTo("minimum_amount")
        assertThat(bpsTier.maximumAmount()).isEqualTo("maximum_amount")
        assertThat(bpsTier.perUnitMaximum()).isEqualTo("per_unit_maximum")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val bpsTier =
            BpsTier.builder()
                .bps(0.0)
                .minimumAmount("minimum_amount")
                .maximumAmount("maximum_amount")
                .perUnitMaximum("per_unit_maximum")
                .build()

        val roundtrippedBpsTier =
            jsonMapper.readValue(jsonMapper.writeValueAsString(bpsTier), jacksonTypeRef<BpsTier>())

        assertThat(roundtrippedBpsTier).isEqualTo(bpsTier)
    }
}
