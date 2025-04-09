// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ItemListPageResponseTest {

    @Test
    fun create() {
        val itemListPageResponse =
            ItemListPageResponse.builder()
                .addData(
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
                        .name("name")
                        .build()
                )
                .paginationMetadata(
                    PaginationMetadata.builder().hasMore(true).nextCursor("next_cursor").build()
                )
                .build()

        assertThat(itemListPageResponse.data())
            .containsExactly(
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
                    .name("name")
                    .build()
            )
        assertThat(itemListPageResponse.paginationMetadata())
            .isEqualTo(PaginationMetadata.builder().hasMore(true).nextCursor("next_cursor").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val itemListPageResponse =
            ItemListPageResponse.builder()
                .addData(
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
                        .name("name")
                        .build()
                )
                .paginationMetadata(
                    PaginationMetadata.builder().hasMore(true).nextCursor("next_cursor").build()
                )
                .build()

        val roundtrippedItemListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(itemListPageResponse),
                jacksonTypeRef<ItemListPageResponse>(),
            )

        assertThat(roundtrippedItemListPageResponse).isEqualTo(itemListPageResponse)
    }
}
