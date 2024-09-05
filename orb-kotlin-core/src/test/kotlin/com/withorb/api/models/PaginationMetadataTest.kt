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
import com.withorb.api.models.PaginationMetadata

class PaginationMetadataTest {

    @Test
    fun createPaginationMetadata() {
      val paginationMetadata = PaginationMetadata.builder()
          .hasMore(true)
          .nextCursor("next_cursor")
          .build()
      assertThat(paginationMetadata).isNotNull
      assertThat(paginationMetadata.hasMore()).isEqualTo(true)
      assertThat(paginationMetadata.nextCursor()).isEqualTo("next_cursor")
    }
}
