// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ItemTest {

    @Test
    fun createItem() {
        val item =
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
        assertThat(item).isNotNull
        assertThat(item.id()).isEqualTo("string")
        assertThat(item.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(item.externalConnections())
            .containsExactly(
                Item.ExternalConnection.builder()
                    .externalConnectionName(Item.ExternalConnection.ExternalConnectionName.STRIPE)
                    .externalEntityId("string")
                    .build()
            )
        assertThat(item.name()).isEqualTo("string")
    }
}
