// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Base64
import java.util.Optional
import java.util.UUID
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.BeforeEach
import com.withorb.api.TestServerExtension
import com.withorb.api.client.OrbClient
import com.withorb.api.client.okhttp.OrbOkHttpClient
import com.withorb.api.core.JsonNull
import com.withorb.api.core.JsonString
import com.withorb.api.core.JsonValue
import com.withorb.api.core.http.BinaryResponseContent
import com.withorb.api.services.blocking.ItemService
import com.withorb.api.models.ItemListPage
import com.withorb.api.models.ItemListParams
import com.withorb.api.models.*

@ExtendWith(TestServerExtension::class)
class ItemServiceTest {

    @Test
    fun callCreate() {
      val client = OrbOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val itemService = client.items()
      val item = itemService.create(ItemCreateParams.builder()
          .name("API requests")
          .build())
      println(item)
      item.validate()
    }

    @Test
    fun callUpdate() {
      val client = OrbOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val itemService = client.items()
      val item = itemService.update(ItemUpdateParams.builder()
          .itemId("item_id")
          .externalConnections(listOf(ItemUpdateParams.ExternalConnection.builder()
              .externalConnectionName(ItemUpdateParams.ExternalConnection.ExternalConnectionName.STRIPE)
              .externalEntityId("external_entity_id")
              .build()))
          .name("name")
          .build())
      println(item)
      item.validate()
    }

    @Test
    fun callList() {
      val client = OrbOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val itemService = client.items()
      val items = itemService.list(ItemListParams.builder().build())
      println(items)
      items.data().forEach {
          it.validate()
      }
    }

    @Test
    fun callFetch() {
      val client = OrbOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val itemService = client.items()
      val item = itemService.fetch(ItemFetchParams.builder()
          .itemId("item_id")
          .build())
      println(item)
      item.validate()
    }
}
