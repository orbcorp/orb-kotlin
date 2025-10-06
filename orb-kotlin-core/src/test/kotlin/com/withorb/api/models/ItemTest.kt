// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ItemTest {

    @Test
    fun create() {
        val item =
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

        assertThat(item.id()).isEqualTo("id")
        assertThat(item.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(item.externalConnections())
            .containsExactly(
                Item.ExternalConnection.builder()
                    .externalConnectionName(Item.ExternalConnection.ExternalConnectionName.STRIPE)
                    .externalEntityId("external_entity_id")
                    .build()
            )
        assertThat(item.metadata())
            .isEqualTo(
                Item.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(item.name()).isEqualTo("name")
        assertThat(item.archivedAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val item =
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

        val roundtrippedItem =
            jsonMapper.readValue(jsonMapper.writeValueAsString(item), jacksonTypeRef<Item>())

        assertThat(roundtrippedItem).isEqualTo(item)
    }
}
