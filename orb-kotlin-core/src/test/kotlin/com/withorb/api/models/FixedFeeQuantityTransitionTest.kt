// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FixedFeeQuantityTransitionTest {

    @Test
    fun create() {
        val fixedFeeQuantityTransition =
            FixedFeeQuantityTransition.builder()
                .effectiveDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .priceId("price_id")
                .quantity(0L)
                .build()

        assertThat(fixedFeeQuantityTransition.effectiveDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(fixedFeeQuantityTransition.priceId()).isEqualTo("price_id")
        assertThat(fixedFeeQuantityTransition.quantity()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val fixedFeeQuantityTransition =
            FixedFeeQuantityTransition.builder()
                .effectiveDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .priceId("price_id")
                .quantity(0L)
                .build()

        val roundtrippedFixedFeeQuantityTransition =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(fixedFeeQuantityTransition),
                jacksonTypeRef<FixedFeeQuantityTransition>(),
            )

        assertThat(roundtrippedFixedFeeQuantityTransition).isEqualTo(fixedFeeQuantityTransition)
    }
}
