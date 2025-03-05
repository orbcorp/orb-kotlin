// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BillableMetricModelTest {

    @Test
    fun createBillableMetricModel() {
        val billableMetricModel =
            BillableMetricModel.builder()
                .id("id")
                .description("description")
                .item(
                    ItemModel.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addExternalConnection(
                            ItemExternalConnectionModel.builder()
                                .externalConnectionName(
                                    ItemExternalConnectionModel.ExternalConnectionName.STRIPE
                                )
                                .externalEntityId("external_entity_id")
                                .build()
                        )
                        .name("name")
                        .build()
                )
                .metadata(
                    BillableMetricModel.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .name("name")
                .status(BillableMetricModel.Status.ACTIVE)
                .build()
        assertThat(billableMetricModel).isNotNull
        assertThat(billableMetricModel.id()).isEqualTo("id")
        assertThat(billableMetricModel.description()).isEqualTo("description")
        assertThat(billableMetricModel.item())
            .isEqualTo(
                ItemModel.builder()
                    .id("id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addExternalConnection(
                        ItemExternalConnectionModel.builder()
                            .externalConnectionName(
                                ItemExternalConnectionModel.ExternalConnectionName.STRIPE
                            )
                            .externalEntityId("external_entity_id")
                            .build()
                    )
                    .name("name")
                    .build()
            )
        assertThat(billableMetricModel.metadata())
            .isEqualTo(
                BillableMetricModel.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(billableMetricModel.name()).isEqualTo("name")
        assertThat(billableMetricModel.status()).isEqualTo(BillableMetricModel.Status.ACTIVE)
    }
}
