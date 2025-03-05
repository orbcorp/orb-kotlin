// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ItemModelTest {

    @Test
    fun createItemModel() {
        val itemModel =
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
        assertThat(itemModel).isNotNull
        assertThat(itemModel.id()).isEqualTo("id")
        assertThat(itemModel.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(itemModel.externalConnections())
            .containsExactly(
                ItemExternalConnectionModel.builder()
                    .externalConnectionName(
                        ItemExternalConnectionModel.ExternalConnectionName.STRIPE
                    )
                    .externalEntityId("external_entity_id")
                    .build()
            )
        assertThat(itemModel.name()).isEqualTo("name")
    }
}
