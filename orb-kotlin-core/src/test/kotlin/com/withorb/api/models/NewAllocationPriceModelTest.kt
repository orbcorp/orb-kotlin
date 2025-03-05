// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class NewAllocationPriceModelTest {

    @Test
    fun createNewAllocationPriceModel() {
        val newAllocationPriceModel =
            NewAllocationPriceModel.builder()
                .amount("10.00")
                .cadence(NewAllocationPriceModel.Cadence.ONE_TIME)
                .currency("USD")
                .expiresAtEndOfCadence(true)
                .build()
        assertThat(newAllocationPriceModel).isNotNull
        assertThat(newAllocationPriceModel.amount()).isEqualTo("10.00")
        assertThat(newAllocationPriceModel.cadence())
            .isEqualTo(NewAllocationPriceModel.Cadence.ONE_TIME)
        assertThat(newAllocationPriceModel.currency()).isEqualTo("USD")
        assertThat(newAllocationPriceModel.expiresAtEndOfCadence()).isEqualTo(true)
    }
}
