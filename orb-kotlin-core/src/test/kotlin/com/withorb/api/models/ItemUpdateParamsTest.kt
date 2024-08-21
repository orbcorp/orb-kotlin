// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import org.apache.hc.core5.http.ContentType
import com.withorb.api.core.ContentTypes
import com.withorb.api.core.JsonNull
import com.withorb.api.core.JsonString
import com.withorb.api.core.JsonValue
import com.withorb.api.core.MultipartFormValue
import com.withorb.api.models.*
import com.withorb.api.models.ItemUpdateParams
import com.withorb.api.models.ItemUpdateParams.ItemUpdateBody

class ItemUpdateParamsTest {

    @Test
    fun createItemUpdateParams() {
      ItemUpdateParams.builder()
          .itemId("item_id")
          .externalConnections(listOf(ItemUpdateParams.ExternalConnection.builder()
              .externalConnectionName(ItemUpdateParams.ExternalConnection.ExternalConnectionName.STRIPE)
              .externalEntityId("external_entity_id")
              .build()))
          .name("name")
          .build()
    }

    @Test
    fun getBody() {
      val params = ItemUpdateParams.builder()
          .itemId("item_id")
          .externalConnections(listOf(ItemUpdateParams.ExternalConnection.builder()
              .externalConnectionName(ItemUpdateParams.ExternalConnection.ExternalConnectionName.STRIPE)
              .externalEntityId("external_entity_id")
              .build()))
          .name("name")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.externalConnections()).isEqualTo(listOf(ItemUpdateParams.ExternalConnection.builder()
          .externalConnectionName(ItemUpdateParams.ExternalConnection.ExternalConnectionName.STRIPE)
          .externalEntityId("external_entity_id")
          .build()))
      assertThat(body.name()).isEqualTo("name")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = ItemUpdateParams.builder()
          .itemId("item_id")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
      val params = ItemUpdateParams.builder()
          .itemId("item_id")
          .build()
      assertThat(params).isNotNull
      // path param "itemId"
      assertThat(params.getPathParam(0)).isEqualTo("item_id")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
