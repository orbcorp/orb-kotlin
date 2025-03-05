// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClientAsync
import com.withorb.api.models.ItemCreateParams
import com.withorb.api.models.ItemExternalConnectionModel
import com.withorb.api.models.ItemFetchParams
import com.withorb.api.models.ItemUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ItemServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val itemServiceAsync = client.items()

        val itemModel =
            itemServiceAsync.create(ItemCreateParams.builder().name("API requests").build())

        itemModel.validate()
    }

    @Test
    suspend fun update() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val itemServiceAsync = client.items()

        val itemModel =
            itemServiceAsync.update(
                ItemUpdateParams.builder()
                    .itemId("item_id")
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

        itemModel.validate()
    }

    @Test
    suspend fun list() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val itemServiceAsync = client.items()

        val page = itemServiceAsync.list()

        page.response().validate()
    }

    @Test
    suspend fun fetch() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val itemServiceAsync = client.items()

        val itemModel = itemServiceAsync.fetch(ItemFetchParams.builder().itemId("item_id").build())

        itemModel.validate()
    }
}
