// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MetricListResponseTest {

    @Test
    fun createMetricListResponse() {
        val metricListResponse =
            MetricListResponse.builder()
                .id("id")
                .description("description")
                .item(
                    Item.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .externalConnections(
                            listOf(
                                Item.ExternalConnection.builder()
                                    .externalConnectionName(
                                        Item.ExternalConnection.ExternalConnectionName.STRIPE
                                    )
                                    .externalEntityId("external_entity_id")
                                    .build()
                            )
                        )
                        .name("name")
                        .build()
                )
                .metadata(MetricListResponse.Metadata.builder().build())
                .name("name")
                .status(MetricListResponse.Status.ACTIVE)
                .build()
        assertThat(metricListResponse).isNotNull
        assertThat(metricListResponse.id()).isEqualTo("id")
        assertThat(metricListResponse.description()).isEqualTo("description")
        assertThat(metricListResponse.item())
            .isEqualTo(
                Item.builder()
                    .id("id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .externalConnections(
                        listOf(
                            Item.ExternalConnection.builder()
                                .externalConnectionName(
                                    Item.ExternalConnection.ExternalConnectionName.STRIPE
                                )
                                .externalEntityId("external_entity_id")
                                .build()
                        )
                    )
                    .name("name")
                    .build()
            )
        assertThat(metricListResponse.metadata())
            .isEqualTo(MetricListResponse.Metadata.builder().build())
        assertThat(metricListResponse.name()).isEqualTo("name")
        assertThat(metricListResponse.status()).isEqualTo(MetricListResponse.Status.ACTIVE)
    }
}
