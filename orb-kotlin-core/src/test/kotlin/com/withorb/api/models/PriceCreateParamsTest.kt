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
import com.withorb.api.models.PriceCreateParams
import com.withorb.api.models.PriceCreateParams.PriceCreateBody

class PriceCreateParamsTest {

    @Test
    fun createPriceCreateParams() {
      PriceCreateParams.builder()
          .forNewFloatingUnitPrice(PriceCreateParams.NewFloatingUnitPrice.builder()
              .cadence(PriceCreateParams.NewFloatingUnitPrice.Cadence.ANNUAL)
              .currency("currency")
              .itemId("item_id")
              .modelType(PriceCreateParams.NewFloatingUnitPrice.ModelType.UNIT)
              .name("Annual fee")
              .unitConfig(PriceCreateParams.NewFloatingUnitPrice.UnitConfig.builder()
                  .unitAmount("unit_amount")
                  .build())
              .billableMetricId("billable_metric_id")
              .billedInAdvance(true)
              .billingCycleConfiguration(PriceCreateParams.NewFloatingUnitPrice.BillingCycleConfiguration.builder()
                  .duration(123L)
                  .durationUnit(PriceCreateParams.NewFloatingUnitPrice.BillingCycleConfiguration.DurationUnit.DAY)
                  .build())
              .conversionRate(42.23)
              .externalPriceId("external_price_id")
              .fixedPriceQuantity(42.23)
              .invoiceGroupingKey("invoice_grouping_key")
              .invoicingCycleConfiguration(PriceCreateParams.NewFloatingUnitPrice.InvoicingCycleConfiguration.builder()
                  .duration(123L)
                  .durationUnit(PriceCreateParams.NewFloatingUnitPrice.InvoicingCycleConfiguration.DurationUnit.DAY)
                  .build())
              .metadata(PriceCreateParams.NewFloatingUnitPrice.Metadata.builder().build())
              .build())
          .build()
    }
}
