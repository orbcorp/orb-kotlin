// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClient
import com.withorb.api.models.*
import com.withorb.api.models.ItemListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ItemServiceTest {

    @Test
    fun callCreate() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val itemService = client.items()
        val item = itemService.create(ItemCreateParams.builder().name("API requests").build())
        println(item)
        item.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val itemService = client.items()
        val item =
            itemService.update(
                ItemUpdateParams.builder()
                    .itemId("string")
                    .externalConnections(
                        listOf(
                            ItemUpdateParams.ExternalConnection.builder()
                                .externalConnectionName(
                                    ItemUpdateParams.ExternalConnection.ExternalConnectionName
                                        .STRIPE
                                )
                                .externalEntityId("string")
                                .build()
                        )
                    )
                    .metadata(ItemUpdateParams.Metadata.builder().build())
                    .build()
            )
        println(item)
        item.validate()
    }

    @Test
    fun callList() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val itemService = client.items()
        val items = itemService.list(ItemListParams.builder().build())
        println(items)
        items.data().forEach { it.validate() }
    }

    @Test
    fun callFetch() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val itemService = client.items()
        val item = itemService.fetch(ItemFetchParams.builder().itemId("string").build())
        println(item)
        item.validate()
    }
}
