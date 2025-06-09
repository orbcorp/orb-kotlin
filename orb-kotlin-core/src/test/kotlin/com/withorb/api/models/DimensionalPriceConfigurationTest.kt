// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DimensionalPriceConfigurationTest {

    @Test
    fun create() {
        val dimensionalPriceConfiguration =
            DimensionalPriceConfiguration.builder()
                .addDimensionValue("string")
                .dimensionalPriceGroupId("dimensional_price_group_id")
                .build()

        assertThat(dimensionalPriceConfiguration.dimensionValues()).containsExactly("string")
        assertThat(dimensionalPriceConfiguration.dimensionalPriceGroupId())
            .isEqualTo("dimensional_price_group_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dimensionalPriceConfiguration =
            DimensionalPriceConfiguration.builder()
                .addDimensionValue("string")
                .dimensionalPriceGroupId("dimensional_price_group_id")
                .build()

        val roundtrippedDimensionalPriceConfiguration =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dimensionalPriceConfiguration),
                jacksonTypeRef<DimensionalPriceConfiguration>(),
            )

        assertThat(roundtrippedDimensionalPriceConfiguration)
            .isEqualTo(dimensionalPriceConfiguration)
    }
}
