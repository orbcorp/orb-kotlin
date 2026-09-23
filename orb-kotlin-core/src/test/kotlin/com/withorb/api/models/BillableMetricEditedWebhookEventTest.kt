// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BillableMetricEditedWebhookEventTest {

    @Test
    fun create() {
        val billableMetricEditedWebhookEvent =
            BillableMetricEditedWebhookEvent.builder()
                .id("id")
                .billableMetric(
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
                                .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .metadata(
                            BillableMetric.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .name("name")
                        .sql("sql")
                        .status(BillableMetric.Status.ACTIVE)
                        .addParameterDefinition(
                            BillableMetric.ParameterDefinition.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .properties(
                    BillableMetricEditedWebhookEvent.Properties.builder()
                        .previousAttributes(
                            BillableMetricEditedWebhookEvent.Properties.PreviousAttributes.builder()
                                .description("description")
                                .metadata(
                                    BillableMetricEditedWebhookEvent.Properties.PreviousAttributes
                                        .Metadata
                                        .builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .name("name")
                                .build()
                        )
                        .build()
                )
                .type(BillableMetricEditedWebhookEvent.Type.BILLABLE_METRIC_EDITED)
                .build()

        assertThat(billableMetricEditedWebhookEvent.id()).isEqualTo("id")
        assertThat(billableMetricEditedWebhookEvent.billableMetric())
            .isEqualTo(
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
                            .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .metadata(
                        BillableMetric.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .name("name")
                    .sql("sql")
                    .status(BillableMetric.Status.ACTIVE)
                    .addParameterDefinition(
                        BillableMetric.ParameterDefinition.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )
        assertThat(billableMetricEditedWebhookEvent.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(billableMetricEditedWebhookEvent.properties())
            .isEqualTo(
                BillableMetricEditedWebhookEvent.Properties.builder()
                    .previousAttributes(
                        BillableMetricEditedWebhookEvent.Properties.PreviousAttributes.builder()
                            .description("description")
                            .metadata(
                                BillableMetricEditedWebhookEvent.Properties.PreviousAttributes
                                    .Metadata
                                    .builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .name("name")
                            .build()
                    )
                    .build()
            )
        assertThat(billableMetricEditedWebhookEvent.type())
            .isEqualTo(BillableMetricEditedWebhookEvent.Type.BILLABLE_METRIC_EDITED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val billableMetricEditedWebhookEvent =
            BillableMetricEditedWebhookEvent.builder()
                .id("id")
                .billableMetric(
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
                                .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .metadata(
                            BillableMetric.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .name("name")
                        .sql("sql")
                        .status(BillableMetric.Status.ACTIVE)
                        .addParameterDefinition(
                            BillableMetric.ParameterDefinition.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .properties(
                    BillableMetricEditedWebhookEvent.Properties.builder()
                        .previousAttributes(
                            BillableMetricEditedWebhookEvent.Properties.PreviousAttributes.builder()
                                .description("description")
                                .metadata(
                                    BillableMetricEditedWebhookEvent.Properties.PreviousAttributes
                                        .Metadata
                                        .builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .name("name")
                                .build()
                        )
                        .build()
                )
                .type(BillableMetricEditedWebhookEvent.Type.BILLABLE_METRIC_EDITED)
                .build()

        val roundtrippedBillableMetricEditedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(billableMetricEditedWebhookEvent),
                jacksonTypeRef<BillableMetricEditedWebhookEvent>(),
            )

        assertThat(roundtrippedBillableMetricEditedWebhookEvent)
            .isEqualTo(billableMetricEditedWebhookEvent)
    }
}
