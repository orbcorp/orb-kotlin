// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MetricFetchResponseTest {

    @Test
    fun createMetricFetchResponse() {
        val metricFetchResponse =
            MetricFetchResponse.builder()
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
                .metadata(MetricFetchResponse.Metadata.builder().build())
                .name("string")
                .status(MetricFetchResponse.Status.ACTIVE)
                .build()
        assertThat(metricFetchResponse).isNotNull
        assertThat(metricFetchResponse.id()).isEqualTo("string")
        assertThat(metricFetchResponse.description()).isEqualTo("string")
        assertThat(metricFetchResponse.item())
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
        assertThat(metricFetchResponse.metadata())
            .isEqualTo(MetricFetchResponse.Metadata.builder().build())
        assertThat(metricFetchResponse.name()).isEqualTo("string")
        assertThat(metricFetchResponse.status()).isEqualTo(MetricFetchResponse.Status.ACTIVE)
    }
}
