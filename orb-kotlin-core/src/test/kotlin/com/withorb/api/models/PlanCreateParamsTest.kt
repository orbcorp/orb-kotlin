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
import com.withorb.api.models.PlanCreateParams
import com.withorb.api.models.PlanCreateParams.PlanCreateBody

class PlanCreateParamsTest {

    @Test
    fun createPlanCreateParams() {
      PlanCreateParams.builder()
          .currency("currency")
          .name("name")
          .prices(listOf(PlanCreateParams.Price.ofNewPlanUnitPrice(PlanCreateParams.Price.NewPlanUnitPrice.builder()
              .cadence(PlanCreateParams.Price.NewPlanUnitPrice.Cadence.ANNUAL)
              .itemId("item_id")
              .modelType(PlanCreateParams.Price.NewPlanUnitPrice.ModelType.UNIT)
              .name("Annual fee")
              .unitConfig(PlanCreateParams.Price.NewPlanUnitPrice.UnitConfig.builder()
                  .unitAmount("unit_amount")
                  .build())
              .billableMetricId("billable_metric_id")
              .billedInAdvance(true)
              .conversionRate(42.23)
              .currency("currency")
              .externalPriceId("external_price_id")
              .fixedPriceQuantity(42.23)
              .invoiceGroupingKey("invoice_grouping_key")
              .metadata(PlanCreateParams.Price.NewPlanUnitPrice.Metadata.builder().build())
              .build())))
          .defaultInvoiceMemo("default_invoice_memo")
          .externalPlanId("external_plan_id")
          .metadata(PlanCreateParams.Metadata.builder().build())
          .netTerms(123L)
          .status(PlanCreateParams.Status.ACTIVE)
          .build()
    }

    @Test
    fun getBody() {
      val params = PlanCreateParams.builder()
          .currency("currency")
          .name("name")
          .prices(listOf(PlanCreateParams.Price.ofNewPlanUnitPrice(PlanCreateParams.Price.NewPlanUnitPrice.builder()
              .cadence(PlanCreateParams.Price.NewPlanUnitPrice.Cadence.ANNUAL)
              .itemId("item_id")
              .modelType(PlanCreateParams.Price.NewPlanUnitPrice.ModelType.UNIT)
              .name("Annual fee")
              .unitConfig(PlanCreateParams.Price.NewPlanUnitPrice.UnitConfig.builder()
                  .unitAmount("unit_amount")
                  .build())
              .billableMetricId("billable_metric_id")
              .billedInAdvance(true)
              .conversionRate(42.23)
              .currency("currency")
              .externalPriceId("external_price_id")
              .fixedPriceQuantity(42.23)
              .invoiceGroupingKey("invoice_grouping_key")
              .metadata(PlanCreateParams.Price.NewPlanUnitPrice.Metadata.builder().build())
              .build())))
          .defaultInvoiceMemo("default_invoice_memo")
          .externalPlanId("external_plan_id")
          .metadata(PlanCreateParams.Metadata.builder().build())
          .netTerms(123L)
          .status(PlanCreateParams.Status.ACTIVE)
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.currency()).isEqualTo("currency")
      assertThat(body.name()).isEqualTo("name")
      assertThat(body.prices()).isEqualTo(listOf(PlanCreateParams.Price.ofNewPlanUnitPrice(PlanCreateParams.Price.NewPlanUnitPrice.builder()
          .cadence(PlanCreateParams.Price.NewPlanUnitPrice.Cadence.ANNUAL)
          .itemId("item_id")
          .modelType(PlanCreateParams.Price.NewPlanUnitPrice.ModelType.UNIT)
          .name("Annual fee")
          .unitConfig(PlanCreateParams.Price.NewPlanUnitPrice.UnitConfig.builder()
              .unitAmount("unit_amount")
              .build())
          .billableMetricId("billable_metric_id")
          .billedInAdvance(true)
          .conversionRate(42.23)
          .currency("currency")
          .externalPriceId("external_price_id")
          .fixedPriceQuantity(42.23)
          .invoiceGroupingKey("invoice_grouping_key")
          .metadata(PlanCreateParams.Price.NewPlanUnitPrice.Metadata.builder().build())
          .build())))
      assertThat(body.defaultInvoiceMemo()).isEqualTo("default_invoice_memo")
      assertThat(body.externalPlanId()).isEqualTo("external_plan_id")
      assertThat(body.metadata()).isEqualTo(PlanCreateParams.Metadata.builder().build())
      assertThat(body.netTerms()).isEqualTo(123L)
      assertThat(body.status()).isEqualTo(PlanCreateParams.Status.ACTIVE)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = PlanCreateParams.builder()
          .currency("currency")
          .name("name")
          .prices(listOf(PlanCreateParams.Price.ofNewPlanUnitPrice(PlanCreateParams.Price.NewPlanUnitPrice.builder()
              .cadence(PlanCreateParams.Price.NewPlanUnitPrice.Cadence.ANNUAL)
              .itemId("item_id")
              .modelType(PlanCreateParams.Price.NewPlanUnitPrice.ModelType.UNIT)
              .name("Annual fee")
              .unitConfig(PlanCreateParams.Price.NewPlanUnitPrice.UnitConfig.builder()
                  .unitAmount("unit_amount")
                  .build())
              .build())))
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.currency()).isEqualTo("currency")
      assertThat(body.name()).isEqualTo("name")
      assertThat(body.prices()).isEqualTo(listOf(PlanCreateParams.Price.ofNewPlanUnitPrice(PlanCreateParams.Price.NewPlanUnitPrice.builder()
          .cadence(PlanCreateParams.Price.NewPlanUnitPrice.Cadence.ANNUAL)
          .itemId("item_id")
          .modelType(PlanCreateParams.Price.NewPlanUnitPrice.ModelType.UNIT)
          .name("Annual fee")
          .unitConfig(PlanCreateParams.Price.NewPlanUnitPrice.UnitConfig.builder()
              .unitAmount("unit_amount")
              .build())
          .build())))
    }
}
