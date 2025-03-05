// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PriceIntervalFixedFeeQuantityTransitionModelTest {

    @Test
    fun createPriceIntervalFixedFeeQuantityTransitionModel() {
        val priceIntervalFixedFeeQuantityTransitionModel =
            PriceIntervalFixedFeeQuantityTransitionModel.builder()
                .effectiveDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .quantity(5L)
                .build()
        assertThat(priceIntervalFixedFeeQuantityTransitionModel).isNotNull
        assertThat(priceIntervalFixedFeeQuantityTransitionModel.effectiveDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(priceIntervalFixedFeeQuantityTransitionModel.quantity()).isEqualTo(5L)
    }
}
