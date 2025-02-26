// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking.customers

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClient
import com.withorb.api.models.CustomerCostListByExternalIdParams
import com.withorb.api.models.CustomerCostListParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CostServiceTest {

    @Test
    fun list() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val costService = client.customers().costs()

        val cost =
            costService.list(
                CustomerCostListParams.builder()
                    .customerId("customer_id")
                    .currency("currency")
                    .timeframeEnd(OffsetDateTime.parse("2022-03-01T05:00:00Z"))
                    .timeframeStart(OffsetDateTime.parse("2022-02-01T05:00:00Z"))
                    .viewMode(CustomerCostListParams.ViewMode.PERIODIC)
                    .build()
            )

        cost.validate()
    }

    @Test
    fun listByExternalId() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val costService = client.customers().costs()

        val response =
            costService.listByExternalId(
                CustomerCostListByExternalIdParams.builder()
                    .externalCustomerId("external_customer_id")
                    .currency("currency")
                    .timeframeEnd(OffsetDateTime.parse("2022-03-01T05:00:00Z"))
                    .timeframeStart(OffsetDateTime.parse("2022-02-01T05:00:00Z"))
                    .viewMode(CustomerCostListByExternalIdParams.ViewMode.PERIODIC)
                    .build()
            )

        response.validate()
    }
}
