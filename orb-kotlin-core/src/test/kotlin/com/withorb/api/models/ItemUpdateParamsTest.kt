// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import kotlin.test.assertNotNull
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

        assertNotNull(body)
        assertThat(body.externalConnections())
            .isEqualTo(
                listOf(
                    ItemUpdateParams.ExternalConnection.builder()
                        .externalConnectionName(
                            ItemUpdateParams.ExternalConnection.ExternalConnectionName.STRIPE
                        )
                        .externalEntityId("external_entity_id")
                        .build()
                )
            )
        assertThat(body.name()).isEqualTo("name")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ItemUpdateParams.builder().itemId("item_id").build()

        val body = params._body()

        assertNotNull(body)
    }

    @Test
    fun getPathParam() {
        val params = ItemUpdateParams.builder().itemId("item_id").build()
        assertThat(params).isNotNull
        // path param "itemId"
        assertThat(params.getPathParam(0)).isEqualTo("item_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
