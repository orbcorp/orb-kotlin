// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MaximumIntervalModelTest {

    @Test
    fun createMaximumIntervalModel() {
        val maximumIntervalModel =
            MaximumIntervalModel.builder()
                .addAppliesToPriceId("string")
                .addAppliesToPriceIntervalId("string")
                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .maximumAmount("maximum_amount")
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(maximumIntervalModel).isNotNull
        assertThat(maximumIntervalModel.appliesToPriceIds()).containsExactly("string")
        assertThat(maximumIntervalModel.appliesToPriceIntervalIds()).containsExactly("string")
        assertThat(maximumIntervalModel.endDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(maximumIntervalModel.maximumAmount()).isEqualTo("maximum_amount")
        assertThat(maximumIntervalModel.startDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
