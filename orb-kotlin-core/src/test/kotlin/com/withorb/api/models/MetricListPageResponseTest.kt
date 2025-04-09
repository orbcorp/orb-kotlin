// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MetricListPageResponseTest {

    @Test
    fun create() {
        val metricListPageResponse =
            MetricListPageResponse.builder()
                .addData(
                    BillableMetric.builder()
                        .id("id")
                        .description("description")
                        .item(
                            Item.builder()
                                .id("id")
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .addExternalConnection(
                                    Item.ExternalConnection.builder()
                                        .externalConnectionName(
                                            Item.ExternalConnection.ExternalConnectionName.STRIPE
                                        )
                                        .externalEntityId("external_entity_id")
                                        .build()
                                )
                                .name("name")
                                .build()
                        )
                        .metadata(
                            BillableMetric.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .name("name")
                        .status(BillableMetric.Status.ACTIVE)
                        .build()
                )
                .paginationMetadata(
                    PaginationMetadata.builder().hasMore(true).nextCursor("next_cursor").build()
                )
                .build()

        assertThat(metricListPageResponse.data())
            .containsExactly(
                BillableMetric.builder()
                    .id("id")
                    .description("description")
                    .item(
                        Item.builder()
                            .id("id")
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .addExternalConnection(
                                Item.ExternalConnection.builder()
                                    .externalConnectionName(
                                        Item.ExternalConnection.ExternalConnectionName.STRIPE
                                    )
                                    .externalEntityId("external_entity_id")
                                    .build()
                            )
                            .name("name")
                            .build()
                    )
                    .metadata(
                        BillableMetric.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .name("name")
                    .status(BillableMetric.Status.ACTIVE)
                    .build()
            )
        assertThat(metricListPageResponse.paginationMetadata())
            .isEqualTo(PaginationMetadata.builder().hasMore(true).nextCursor("next_cursor").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val metricListPageResponse =
            MetricListPageResponse.builder()
                .addData(
                    BillableMetric.builder()
                        .id("id")
                        .description("description")
                        .item(
                            Item.builder()
                                .id("id")
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .addExternalConnection(
                                    Item.ExternalConnection.builder()
                                        .externalConnectionName(
                                            Item.ExternalConnection.ExternalConnectionName.STRIPE
                                        )
                                        .externalEntityId("external_entity_id")
                                        .build()
                                )
                                .name("name")
                                .build()
                        )
                        .metadata(
                            BillableMetric.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .name("name")
                        .status(BillableMetric.Status.ACTIVE)
                        .build()
                )
                .paginationMetadata(
                    PaginationMetadata.builder().hasMore(true).nextCursor("next_cursor").build()
                )
                .build()

        val roundtrippedMetricListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(metricListPageResponse),
                jacksonTypeRef<MetricListPageResponse>(),
            )

        assertThat(roundtrippedMetricListPageResponse).isEqualTo(metricListPageResponse)
    }
}
