// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FixedFeeQuantityScheduleEntryTest {

    @Test
    fun create() {
        val fixedFeeQuantityScheduleEntry =
            FixedFeeQuantityScheduleEntry.builder()
                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .priceId("price_id")
                .quantity(0.0)
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(fixedFeeQuantityScheduleEntry.endDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(fixedFeeQuantityScheduleEntry.priceId()).isEqualTo("price_id")
        assertThat(fixedFeeQuantityScheduleEntry.quantity()).isEqualTo(0.0)
        assertThat(fixedFeeQuantityScheduleEntry.startDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val fixedFeeQuantityScheduleEntry =
            FixedFeeQuantityScheduleEntry.builder()
                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .priceId("price_id")
                .quantity(0.0)
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedFixedFeeQuantityScheduleEntry =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(fixedFeeQuantityScheduleEntry),
                jacksonTypeRef<FixedFeeQuantityScheduleEntry>(),
            )

        assertThat(roundtrippedFixedFeeQuantityScheduleEntry)
            .isEqualTo(fixedFeeQuantityScheduleEntry)
    }
}
