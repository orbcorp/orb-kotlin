// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MinimumIntervalModelTest {

    @Test
    fun createMinimumIntervalModel() {
        val minimumIntervalModel =
            MinimumIntervalModel.builder()
                .addAppliesToPriceId("string")
                .addAppliesToPriceIntervalId("string")
                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .minimumAmount("minimum_amount")
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(minimumIntervalModel).isNotNull
        assertThat(minimumIntervalModel.appliesToPriceIds()).containsExactly("string")
        assertThat(minimumIntervalModel.appliesToPriceIntervalIds()).containsExactly("string")
        assertThat(minimumIntervalModel.endDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(minimumIntervalModel.minimumAmount()).isEqualTo("minimum_amount")
        assertThat(minimumIntervalModel.startDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
