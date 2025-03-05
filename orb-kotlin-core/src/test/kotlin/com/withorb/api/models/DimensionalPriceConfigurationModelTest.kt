// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DimensionalPriceConfigurationModelTest {

    @Test
    fun createDimensionalPriceConfigurationModel() {
        val dimensionalPriceConfigurationModel =
            DimensionalPriceConfigurationModel.builder()
                .addDimensionValue("string")
                .dimensionalPriceGroupId("dimensional_price_group_id")
                .build()
        assertThat(dimensionalPriceConfigurationModel).isNotNull
        assertThat(dimensionalPriceConfigurationModel.dimensionValues()).containsExactly("string")
        assertThat(dimensionalPriceConfigurationModel.dimensionalPriceGroupId())
            .isEqualTo("dimensional_price_group_id")
    }
}
