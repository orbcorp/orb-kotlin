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
                    .currency("string")
                    .itemId("string")
                    .modelType(PriceCreateParams.NewFloatingUnitPrice.ModelType.UNIT)
                    .name("Annual fee")
                    .unitConfig(
                        PriceCreateParams.NewFloatingUnitPrice.UnitConfig.builder()
                            .unitAmount("string")
                            .build()
                    )
                    .billableMetricId("string")
                    .billedInAdvance(true)
                    .conversionRate(42.23)
                    .externalPriceId("string")
                    .fixedPriceQuantity(42.23)
                    .invoiceGroupingKey("string")
                    .build()
            )
            .build()
    }
}
