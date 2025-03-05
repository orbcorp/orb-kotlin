// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking.dimensionalPriceGroups

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClient
import com.withorb.api.models.DimensionalPriceGroupExternalDimensionalPriceGroupIdRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ExternalDimensionalPriceGroupIdServiceTest {

    @Test
    fun retrieve() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val externalDimensionalPriceGroupIdService =
            client.dimensionalPriceGroups().externalDimensionalPriceGroupId()

        val dimensionalPriceGroupModel =
            externalDimensionalPriceGroupIdService.retrieve(
                DimensionalPriceGroupExternalDimensionalPriceGroupIdRetrieveParams.builder()
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )

        dimensionalPriceGroupModel.validate()
    }
}
