// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FixedFeeQuantityScheduleEntryModelTest {

    @Test
    fun createFixedFeeQuantityScheduleEntryModel() {
        val fixedFeeQuantityScheduleEntryModel =
            FixedFeeQuantityScheduleEntryModel.builder()
                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .priceId("price_id")
                .quantity(0.0)
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(fixedFeeQuantityScheduleEntryModel).isNotNull
        assertThat(fixedFeeQuantityScheduleEntryModel.endDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(fixedFeeQuantityScheduleEntryModel.priceId()).isEqualTo("price_id")
        assertThat(fixedFeeQuantityScheduleEntryModel.quantity()).isEqualTo(0.0)
        assertThat(fixedFeeQuantityScheduleEntryModel.startDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
