// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.dimensionalPriceGroups

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClientAsync
import com.withorb.api.models.DimensionalPriceGroupPriceCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PriceServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val priceServiceAsync = client.dimensionalPriceGroups().prices()

        val price =
            priceServiceAsync.create(
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
    suspend fun list() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val priceServiceAsync = client.dimensionalPriceGroups().prices()

        val page = priceServiceAsync.list("dimensional_price_group_id")

        page.response().validate()
    }
}
