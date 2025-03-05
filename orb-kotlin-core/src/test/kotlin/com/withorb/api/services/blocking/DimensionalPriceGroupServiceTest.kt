// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClient
import com.withorb.api.core.JsonValue
import com.withorb.api.models.DimensionalPriceGroupCreateParams
import com.withorb.api.models.DimensionalPriceGroupRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class DimensionalPriceGroupServiceTest {

    @Test
    fun create() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val dimensionalPriceGroupService = client.dimensionalPriceGroups()

        val dimensionalPriceGroupModel =
            dimensionalPriceGroupService.create(
                DimensionalPriceGroupCreateParams.builder()
                    .billableMetricId("billable_metric_id")
                    .addDimension("region")
                    .addDimension("instance_type")
                    .name("name")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .metadata(
                        DimensionalPriceGroupCreateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )

        dimensionalPriceGroupModel.validate()
    }

    @Test
    fun retrieve() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val dimensionalPriceGroupService = client.dimensionalPriceGroups()

        val dimensionalPriceGroupModel =
            dimensionalPriceGroupService.retrieve(
                DimensionalPriceGroupRetrieveParams.builder()
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .build()
            )

        dimensionalPriceGroupModel.validate()
    }

    @Test
    fun list() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val dimensionalPriceGroupService = client.dimensionalPriceGroups()

        val page = dimensionalPriceGroupService.list()

        page.response().validate()
    }
}
