// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BillableMetricTest {

    @Test
    fun create() {
        val billableMetric =
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
                        .metadata(
                            Item.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
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

        assertThat(billableMetric.id()).isEqualTo("id")
        assertThat(billableMetric.description()).isEqualTo("description")
        assertThat(billableMetric.item())
            .isEqualTo(
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
                    .metadata(
                        Item.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .name("name")
                    .build()
            )
        assertThat(billableMetric.metadata())
            .isEqualTo(
                BillableMetric.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(billableMetric.name()).isEqualTo("name")
        assertThat(billableMetric.status()).isEqualTo(BillableMetric.Status.ACTIVE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val billableMetric =
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
                        .metadata(
                            Item.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
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

        val roundtrippedBillableMetric =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(billableMetric),
                jacksonTypeRef<BillableMetric>(),
            )

        assertThat(roundtrippedBillableMetric).isEqualTo(billableMetric)
    }
}
