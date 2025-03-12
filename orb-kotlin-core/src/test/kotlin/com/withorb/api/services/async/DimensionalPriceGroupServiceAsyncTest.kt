// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClientAsync
import com.withorb.api.core.JsonValue
import com.withorb.api.models.DimensionalPriceGroupCreateParams
import com.withorb.api.models.DimensionalPriceGroupListParams
import com.withorb.api.models.DimensionalPriceGroupRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class DimensionalPriceGroupServiceAsyncTest {

    @Test
    suspend fun create() {
      val client = OrbOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val dimensionalPriceGroupServiceAsync = client.dimensionalPriceGroups()

      val dimensionalPriceGroup = dimensionalPriceGroupServiceAsync.create(DimensionalPriceGroupCreateParams.builder()
          .billableMetricId("billable_metric_id")
          .addDimension("region")
          .addDimension("instance_type")
          .name("name")
          .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
          .metadata(DimensionalPriceGroupCreateParams.Metadata.builder()
              .putAdditionalProperty("foo", JsonValue.from("string"))
              .build())
          .build())

      dimensionalPriceGroup.validate()
    }

    @Test
    suspend fun retrieve() {
      val client = OrbOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val dimensionalPriceGroupServiceAsync = client.dimensionalPriceGroups()

      val dimensionalPriceGroup = dimensionalPriceGroupServiceAsync.retrieve(DimensionalPriceGroupRetrieveParams.builder()
          .dimensionalPriceGroupId("dimensional_price_group_id")
          .build())

      dimensionalPriceGroup.validate()
    }

    @Test
    suspend fun list() {
      val client = OrbOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val dimensionalPriceGroupServiceAsync = client.dimensionalPriceGroups()

      val page = dimensionalPriceGroupServiceAsync.list()

      page.response().validate()
    }
}
