// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BillableMetricTest {

    @Test
    fun createBillableMetric() {
        val billableMetric =
            BillableMetric.builder()
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
                .metadata(BillableMetric.Metadata.builder().build())
                .name("name")
                .status(BillableMetric.Status.ACTIVE)
                .build()
        assertThat(billableMetric).isNotNull
        assertThat(billableMetric.id()).isEqualTo("id")
        assertThat(billableMetric.description()).isEqualTo("description")
        assertThat(billableMetric.item())
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
        assertThat(billableMetric.metadata()).isEqualTo(BillableMetric.Metadata.builder().build())
        assertThat(billableMetric.name()).isEqualTo("name")
        assertThat(billableMetric.status()).isEqualTo(BillableMetric.Status.ACTIVE)
    }
}