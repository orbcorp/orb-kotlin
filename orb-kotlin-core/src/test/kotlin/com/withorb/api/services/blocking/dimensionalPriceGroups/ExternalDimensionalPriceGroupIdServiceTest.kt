// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking.dimensionalPriceGroups

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClient
import com.withorb.api.core.JsonValue
import com.withorb.api.models.DimensionalPriceGroupExternalDimensionalPriceGroupIdUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ExternalDimensionalPriceGroupIdServiceTest {

    @Test
    fun retrieve() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val externalDimensionalPriceGroupIdService =
            client.dimensionalPriceGroups().externalDimensionalPriceGroupId()

        val dimensionalPriceGroup =
            externalDimensionalPriceGroupIdService.retrieve("external_dimensional_price_group_id")

        dimensionalPriceGroup.validate()
    }

    @Test
    fun update() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val externalDimensionalPriceGroupIdService =
            client.dimensionalPriceGroups().externalDimensionalPriceGroupId()

        val dimensionalPriceGroup =
            externalDimensionalPriceGroupIdService.update(
                DimensionalPriceGroupExternalDimensionalPriceGroupIdUpdateParams.builder()
                    .pathExternalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .bodyExternalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .metadata(
                        DimensionalPriceGroupExternalDimensionalPriceGroupIdUpdateParams.Metadata
                            .builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )

        dimensionalPriceGroup.validate()
    }
}
