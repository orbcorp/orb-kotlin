// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DimensionalPriceGroupModelTest {

    @Test
    fun createDimensionalPriceGroupModel() {
        val dimensionalPriceGroupModel =
            DimensionalPriceGroupModel.builder()
                .id("id")
                .billableMetricId("billable_metric_id")
                .addDimension("region")
                .addDimension("instance_type")
                .externalDimensionalPriceGroupId("my_dimensional_price_group_id")
                .metadata(
                    DimensionalPriceGroupModel.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .name("name")
                .build()
        assertThat(dimensionalPriceGroupModel).isNotNull
        assertThat(dimensionalPriceGroupModel.id()).isEqualTo("id")
        assertThat(dimensionalPriceGroupModel.billableMetricId()).isEqualTo("billable_metric_id")
        assertThat(dimensionalPriceGroupModel.dimensions())
            .containsExactly("region", "instance_type")
        assertThat(dimensionalPriceGroupModel.externalDimensionalPriceGroupId())
            .isEqualTo("my_dimensional_price_group_id")
        assertThat(dimensionalPriceGroupModel.metadata())
            .isEqualTo(
                DimensionalPriceGroupModel.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(dimensionalPriceGroupModel.name()).isEqualTo("name")
    }
}
