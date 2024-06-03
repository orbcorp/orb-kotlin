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
                .id("string")
                .description("string")
                .item(
                    Item.builder()
                        .id("string")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .externalConnections(
                            listOf(
                                Item.ExternalConnection.builder()
                                    .externalConnectionName(
                                        Item.ExternalConnection.ExternalConnectionName.STRIPE
                                    )
                                    .externalEntityId("string")
                                    .build()
                            )
                        )
                        .name("string")
                        .build()
                )
                .metadata(MetricListResponse.Metadata.builder().build())
                .name("string")
                .status(MetricListResponse.Status.ACTIVE)
                .build()
        assertThat(metricListResponse).isNotNull
        assertThat(metricListResponse.id()).isEqualTo("string")
        assertThat(metricListResponse.description()).isEqualTo("string")
        assertThat(metricListResponse.item())
            .isEqualTo(
                Item.builder()
                    .id("string")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .externalConnections(
                        listOf(
                            Item.ExternalConnection.builder()
                                .externalConnectionName(
                                    Item.ExternalConnection.ExternalConnectionName.STRIPE
                                )
                                .externalEntityId("string")
                                .build()
                        )
                    )
                    .name("string")
                    .build()
            )
        assertThat(metricListResponse.metadata())
            .isEqualTo(MetricListResponse.Metadata.builder().build())
        assertThat(metricListResponse.name()).isEqualTo("string")
        assertThat(metricListResponse.status()).isEqualTo(MetricListResponse.Status.ACTIVE)
    }
}
