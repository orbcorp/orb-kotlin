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
                .metadata(MetricCreateResponse.Metadata.builder().build())
                .name("name")
                .status(MetricCreateResponse.Status.ACTIVE)
                .build()
        assertThat(metricCreateResponse).isNotNull
        assertThat(metricCreateResponse.id()).isEqualTo("id")
        assertThat(metricCreateResponse.description()).isEqualTo("description")
        assertThat(metricCreateResponse.item())
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
        assertThat(metricCreateResponse.metadata())
            .isEqualTo(MetricCreateResponse.Metadata.builder().build())
        assertThat(metricCreateResponse.name()).isEqualTo("name")
        assertThat(metricCreateResponse.status()).isEqualTo(MetricCreateResponse.Status.ACTIVE)
    }
}
