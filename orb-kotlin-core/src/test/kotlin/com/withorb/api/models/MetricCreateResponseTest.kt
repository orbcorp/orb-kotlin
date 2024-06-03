// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MetricCreateResponseTest {

    @Test
    fun createMetricCreateResponse() {
        val metricCreateResponse =
            MetricCreateResponse.builder()
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
                .metadata(MetricCreateResponse.Metadata.builder().build())
                .name("string")
                .status(MetricCreateResponse.Status.ACTIVE)
                .build()
        assertThat(metricCreateResponse).isNotNull
        assertThat(metricCreateResponse.id()).isEqualTo("string")
        assertThat(metricCreateResponse.description()).isEqualTo("string")
        assertThat(metricCreateResponse.item())
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
        assertThat(metricCreateResponse.metadata())
            .isEqualTo(MetricCreateResponse.Metadata.builder().build())
        assertThat(metricCreateResponse.name()).isEqualTo("string")
        assertThat(metricCreateResponse.status()).isEqualTo(MetricCreateResponse.Status.ACTIVE)
    }
}
