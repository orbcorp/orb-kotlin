// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ItemUpdateParamsTest {

    @Test
    fun createItemUpdateParams() {
        ItemUpdateParams.builder()
            .itemId("string")
            .externalConnections(
                listOf(
                    ItemUpdateParams.ExternalConnection.builder()
                        .externalConnectionName(
                            ItemUpdateParams.ExternalConnection.ExternalConnectionName.STRIPE
                        )
                        .externalEntityId("string")
                        .build()
                )
            )
            .build()
    }

    @Test
    fun getBody() {
        val params =
            ItemUpdateParams.builder()
                .itemId("string")
                .externalConnections(
                    listOf(
                        ItemUpdateParams.ExternalConnection.builder()
                            .externalConnectionName(
                                ItemUpdateParams.ExternalConnection.ExternalConnectionName.STRIPE
                            )
                            .externalEntityId("string")
                            .build()
                    )
                )
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
                        .externalEntityId("string")
                        .build()
                )
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = ItemUpdateParams.builder().itemId("string").build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params = ItemUpdateParams.builder().itemId("string").build()
        assertThat(params).isNotNull
        // path param "itemId"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
