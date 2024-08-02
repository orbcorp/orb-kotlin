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
                .metadata(MetricFetchResponse.Metadata.builder().build())
                .name("name")
                .status(MetricFetchResponse.Status.ACTIVE)
                .build()
        assertThat(metricFetchResponse).isNotNull
        assertThat(metricFetchResponse.id()).isEqualTo("id")
        assertThat(metricFetchResponse.description()).isEqualTo("description")
        assertThat(metricFetchResponse.item())
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
        assertThat(metricFetchResponse.metadata())
            .isEqualTo(MetricFetchResponse.Metadata.builder().build())
        assertThat(metricFetchResponse.name()).isEqualTo("name")
        assertThat(metricFetchResponse.status()).isEqualTo(MetricFetchResponse.Status.ACTIVE)
    }
}
