// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewDimensionalPriceConfigurationTest {

    @Test
    fun create() {
        val newDimensionalPriceConfiguration =
            NewDimensionalPriceConfiguration.builder()
                .addDimensionValue("string")
                .dimensionalPriceGroupId("dimensional_price_group_id")
                .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                .build()

        assertThat(newDimensionalPriceConfiguration.dimensionValues()).containsExactly("string")
        assertThat(newDimensionalPriceConfiguration.dimensionalPriceGroupId())
            .isEqualTo("dimensional_price_group_id")
        assertThat(newDimensionalPriceConfiguration.externalDimensionalPriceGroupId())
            .isEqualTo("external_dimensional_price_group_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newDimensionalPriceConfiguration =
            NewDimensionalPriceConfiguration.builder()
                .addDimensionValue("string")
                .dimensionalPriceGroupId("dimensional_price_group_id")
                .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                .build()

        val roundtrippedNewDimensionalPriceConfiguration =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newDimensionalPriceConfiguration),
                jacksonTypeRef<NewDimensionalPriceConfiguration>(),
            )

        assertThat(roundtrippedNewDimensionalPriceConfiguration)
            .isEqualTo(newDimensionalPriceConfiguration)
    }
}
