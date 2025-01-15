// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ItemUpdateParamsTest {

    @Test
    fun createItemUpdateParams() {
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
    fun getBody() {
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
        val body = params.getBody()
        assertThat(body).isNotNull
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
    fun getBodyWithoutOptionalFields() {
        val params = ItemUpdateParams.builder().itemId("item_id").build()
        val body = params.getBody()
        assertThat(body).isNotNull
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
