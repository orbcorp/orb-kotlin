// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DimensionalPriceGroupTest {

    @Test
    fun create() {
        val dimensionalPriceGroup =
            DimensionalPriceGroup.builder()
                .id("id")
                .billableMetricId("billable_metric_id")
                .addDimension("region")
                .addDimension("instance_type")
                .externalDimensionalPriceGroupId("my_dimensional_price_group_id")
                .metadata(
                    DimensionalPriceGroup.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .name("name")
                .build()

        assertThat(dimensionalPriceGroup.id()).isEqualTo("id")
        assertThat(dimensionalPriceGroup.billableMetricId()).isEqualTo("billable_metric_id")
        assertThat(dimensionalPriceGroup.dimensions()).containsExactly("region", "instance_type")
        assertThat(dimensionalPriceGroup.externalDimensionalPriceGroupId())
            .isEqualTo("my_dimensional_price_group_id")
        assertThat(dimensionalPriceGroup.metadata())
            .isEqualTo(
                DimensionalPriceGroup.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(dimensionalPriceGroup.name()).isEqualTo("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dimensionalPriceGroup =
            DimensionalPriceGroup.builder()
                .id("id")
                .billableMetricId("billable_metric_id")
                .addDimension("region")
                .addDimension("instance_type")
                .externalDimensionalPriceGroupId("my_dimensional_price_group_id")
                .metadata(
                    DimensionalPriceGroup.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .name("name")
                .build()

        val roundtrippedDimensionalPriceGroup =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dimensionalPriceGroup),
                jacksonTypeRef<DimensionalPriceGroup>(),
            )

        assertThat(roundtrippedDimensionalPriceGroup).isEqualTo(dimensionalPriceGroup)
    }
}
