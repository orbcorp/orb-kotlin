// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking.dimensionalPriceGroups

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClient
import com.withorb.api.models.DimensionalPriceGroupPriceCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PriceServiceTest {

    @Test
    fun create() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val priceService = client.dimensionalPriceGroups().prices()

        val price =
            priceService.create(
                DimensionalPriceGroupPriceCreateParams.builder()
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .cadence(DimensionalPriceGroupPriceCreateParams.Cadence.ONE_TIME)
                    .currency("USD")
                    .itemId("item_id")
                    .modelType(DimensionalPriceGroupPriceCreateParams.ModelType.UNIT)
                    .addPrice(
                        DimensionalPriceGroupPriceCreateParams.Price.builder()
                            .addAmount(0.0)
                            .addDimensionValue("string")
                            .name("name")
                            .build()
                    )
                    .addTier(
                        DimensionalPriceGroupPriceCreateParams.Tier.builder()
                            .firstUnit(0.0)
                            .lastUnit(0.0)
                            .build()
                    )
                    .build()
            )

        price.validate()
    }

    @Test
    fun list() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val priceService = client.dimensionalPriceGroups().prices()

        val page = priceService.list("dimensional_price_group_id")

        page.response().validate()
    }
}
