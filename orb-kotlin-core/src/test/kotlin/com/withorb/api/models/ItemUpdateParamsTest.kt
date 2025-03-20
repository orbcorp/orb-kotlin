// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ItemUpdateParamsTest {

    @Test
    fun create() {
        ItemUpdateParams.builder()
            .itemId("item_id")
            .addExternalConnection(
                ItemUpdateParams.ExternalConnection.builder()
                    .externalConnectionName(
                        ItemUpdateParams.ExternalConnection.ExternalConnectionName.STRIPE
                    )
                    .externalEntityId("external_entity_id")
                    .build()
            )
            .name("name")
            .build()
    }

    @Test
    fun pathParams() {
        val params = ItemUpdateParams.builder().itemId("item_id").build()

        assertThat(params._pathParam(0)).isEqualTo("item_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ItemUpdateParams.builder()
                .itemId("item_id")
                .addExternalConnection(
                    ItemUpdateParams.ExternalConnection.builder()
                        .externalConnectionName(
                            ItemUpdateParams.ExternalConnection.ExternalConnectionName.STRIPE
                        )
                        .externalEntityId("external_entity_id")
                        .build()
                )
                .name("name")
                .build()

        val body = params._body()

        assertThat(body.externalConnections())
            .containsExactly(
                ItemUpdateParams.ExternalConnection.builder()
                    .externalConnectionName(
                        ItemUpdateParams.ExternalConnection.ExternalConnectionName.STRIPE
                    )
                    .externalEntityId("external_entity_id")
                    .build()
            )
        assertThat(body.name()).isEqualTo("name")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ItemUpdateParams.builder().itemId("item_id").build()

        val body = params._body()
    }
}
