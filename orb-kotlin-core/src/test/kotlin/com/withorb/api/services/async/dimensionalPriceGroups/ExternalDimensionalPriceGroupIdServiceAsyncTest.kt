// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.dimensionalPriceGroups

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClientAsync
import com.withorb.api.models.DimensionalPriceGroupExternalDimensionalPriceGroupIdRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ExternalDimensionalPriceGroupIdServiceAsyncTest {

    @Test
    suspend fun retrieve() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val externalDimensionalPriceGroupIdServiceAsync =
            client.dimensionalPriceGroups().externalDimensionalPriceGroupId()

        val dimensionalPriceGroup =
            externalDimensionalPriceGroupIdServiceAsync.retrieve(
                DimensionalPriceGroupExternalDimensionalPriceGroupIdRetrieveParams.builder()
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )

        dimensionalPriceGroup.validate()
    }
}
