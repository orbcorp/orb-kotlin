// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.JsonValue
import com.withorb.api.models.*
import org.junit.jupiter.api.Test

class PriceCreateParamsTest {

    @Test
    fun createPriceCreateParams() {
        PriceCreateParams.builder()
            .forNewFloatingUnitPrice(
                PriceCreateParams.NewFloatingUnitPrice.builder()
                    .cadence(PriceCreateParams.NewFloatingUnitPrice.Cadence.ANNUAL)
                    .currency("currency")
                    .itemId("item_id")
                    .modelType(PriceCreateParams.NewFloatingUnitPrice.ModelType.UNIT)
                    .name("Annual fee")
                    .unitConfig(
                        PriceCreateParams.NewFloatingUnitPrice.UnitConfig.builder()
                            .unitAmount("unit_amount")
                            .build()
                    )
                    .billableMetricId("billable_metric_id")
                    .billedInAdvance(true)
                    .billingCycleConfiguration(
                        PriceCreateParams.NewFloatingUnitPrice.BillingCycleConfiguration.builder()
                            .duration(0L)
                            .durationUnit(
                                PriceCreateParams.NewFloatingUnitPrice.BillingCycleConfiguration
                                    .DurationUnit
                                    .DAY
                            )
                            .build()
                    )
                    .conversionRate(0.0)
                    .externalPriceId("external_price_id")
                    .fixedPriceQuantity(0.0)
                    .invoiceGroupingKey("invoice_grouping_key")
                    .invoicingCycleConfiguration(
                        PriceCreateParams.NewFloatingUnitPrice.InvoicingCycleConfiguration.builder()
                            .duration(0L)
                            .durationUnit(
                                PriceCreateParams.NewFloatingUnitPrice.InvoicingCycleConfiguration
                                    .DurationUnit
                                    .DAY
                            )
                            .build()
                    )
                    .metadata(
                        PriceCreateParams.NewFloatingUnitPrice.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )
            .build()
    }
}
