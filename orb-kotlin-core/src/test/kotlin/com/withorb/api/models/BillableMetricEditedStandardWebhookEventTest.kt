// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BillableMetricEditedStandardWebhookEventTest {

    @Test
    fun create() {
        val billableMetricEditedStandardWebhookEvent =
            BillableMetricEditedStandardWebhookEvent.builder()
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
                .payloadStyle(BillableMetricEditedStandardWebhookEvent.PayloadStyle.EXPANDED)
                .properties(
                    BillableMetricEditedStandardWebhookEvent.Properties.builder()
                        .previousAttributes(
                            BillableMetricEditedStandardWebhookEvent.Properties.PreviousAttributes
                                .builder()
                                .description("description")
                                .metadata(
                                    BillableMetricEditedStandardWebhookEvent.Properties
                                        .PreviousAttributes
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
                .type(BillableMetricEditedStandardWebhookEvent.Type.BILLABLE_METRIC_EDITED)
                .build()

        assertThat(billableMetricEditedStandardWebhookEvent.id()).isEqualTo("id")
        assertThat(billableMetricEditedStandardWebhookEvent.billableMetric())
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
        assertThat(billableMetricEditedStandardWebhookEvent.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(billableMetricEditedStandardWebhookEvent.payloadStyle())
            .isEqualTo(BillableMetricEditedStandardWebhookEvent.PayloadStyle.EXPANDED)
        assertThat(billableMetricEditedStandardWebhookEvent.properties())
            .isEqualTo(
                BillableMetricEditedStandardWebhookEvent.Properties.builder()
                    .previousAttributes(
                        BillableMetricEditedStandardWebhookEvent.Properties.PreviousAttributes
                            .builder()
                            .description("description")
                            .metadata(
                                BillableMetricEditedStandardWebhookEvent.Properties
                                    .PreviousAttributes
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
        assertThat(billableMetricEditedStandardWebhookEvent.type())
            .isEqualTo(BillableMetricEditedStandardWebhookEvent.Type.BILLABLE_METRIC_EDITED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val billableMetricEditedStandardWebhookEvent =
            BillableMetricEditedStandardWebhookEvent.builder()
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
                .payloadStyle(BillableMetricEditedStandardWebhookEvent.PayloadStyle.EXPANDED)
                .properties(
                    BillableMetricEditedStandardWebhookEvent.Properties.builder()
                        .previousAttributes(
                            BillableMetricEditedStandardWebhookEvent.Properties.PreviousAttributes
                                .builder()
                                .description("description")
                                .metadata(
                                    BillableMetricEditedStandardWebhookEvent.Properties
                                        .PreviousAttributes
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
                .type(BillableMetricEditedStandardWebhookEvent.Type.BILLABLE_METRIC_EDITED)
                .build()

        val roundtrippedBillableMetricEditedStandardWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(billableMetricEditedStandardWebhookEvent),
                jacksonTypeRef<BillableMetricEditedStandardWebhookEvent>(),
            )

        assertThat(roundtrippedBillableMetricEditedStandardWebhookEvent)
            .isEqualTo(billableMetricEditedStandardWebhookEvent)
    }
}
