// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.withorb.api.core.JsonNull
import com.withorb.api.core.JsonString
import com.withorb.api.core.JsonValue
import com.withorb.api.models.Item

class ItemTest {

    @Test
    fun createItem() {
      val item = Item.builder()
          .id("id")
          .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .externalConnections(listOf(Item.ExternalConnection.builder()
              .externalConnectionName(Item.ExternalConnection.ExternalConnectionName.STRIPE)
              .externalEntityId("external_entity_id")
              .build()))
          .name("name")
          .build()
      assertThat(item).isNotNull
      assertThat(item.id()).isEqualTo("id")
      assertThat(item.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
      assertThat(item.externalConnections()).containsExactly(Item.ExternalConnection.builder()
          .externalConnectionName(Item.ExternalConnection.ExternalConnectionName.STRIPE)
          .externalEntityId("external_entity_id")
          .build())
      assertThat(item.name()).isEqualTo("name")
    }
}
