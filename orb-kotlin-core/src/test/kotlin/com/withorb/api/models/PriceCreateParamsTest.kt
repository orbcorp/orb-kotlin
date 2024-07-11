// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

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
                    .conversionRate(42.23)
                    .externalPriceId("external_price_id")
                    .fixedPriceQuantity(42.23)
                    .invoiceGroupingKey("invoice_grouping_key")
                    .build()
            )
            .build()
    }
}
