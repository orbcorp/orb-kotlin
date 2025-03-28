// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DimensionalPriceGroupsTest {

    @Test
    fun create() {
        val dimensionalPriceGroups =
            DimensionalPriceGroups.builder()
                .addData(
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
                )
                .paginationMetadata(
                    PaginationMetadata.builder().hasMore(true).nextCursor("next_cursor").build()
                )
                .build()

        assertThat(dimensionalPriceGroups.data())
            .containsExactly(
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
            )
        assertThat(dimensionalPriceGroups.paginationMetadata())
            .isEqualTo(PaginationMetadata.builder().hasMore(true).nextCursor("next_cursor").build())
    }
}
