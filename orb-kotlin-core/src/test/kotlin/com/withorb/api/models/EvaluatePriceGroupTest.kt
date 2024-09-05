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
import com.withorb.api.models.EvaluatePriceGroup

class EvaluatePriceGroupTest {

    @Test
    fun createEvaluatePriceGroup() {
      val evaluatePriceGroup = EvaluatePriceGroup.builder()
          .amount("amount")
          .groupingValues(listOf(EvaluatePriceGroup.GroupingValue.ofString("string")))
          .quantity(42.23)
          .build()
      assertThat(evaluatePriceGroup).isNotNull
      assertThat(evaluatePriceGroup.amount()).isEqualTo("amount")
      assertThat(evaluatePriceGroup.groupingValues()).containsExactly(EvaluatePriceGroup.GroupingValue.ofString("string"))
      assertThat(evaluatePriceGroup.quantity()).isEqualTo(42.23)
    }
}
