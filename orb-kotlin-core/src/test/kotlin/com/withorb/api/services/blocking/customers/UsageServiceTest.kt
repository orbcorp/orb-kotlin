// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking.customers

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClient
import com.withorb.api.core.JsonValue
import com.withorb.api.models.*
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class UsageServiceTest {

    @Test
    fun callUpdate() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val usageService = client.customers().usage()
        val customerUsageUpdateResponse =
            usageService.update(
                CustomerUsageUpdateParams.builder()
                    .id("customer_id")
                    .events(
                        listOf(
                            CustomerUsageUpdateParams.Event.builder()
                                .eventName("event_name")
                                .properties(JsonValue.from(mapOf<String, Any>()))
                                .timestamp(OffsetDateTime.parse("2020-12-09T16:09:53Z"))
                                .customerId("customer_id")
                                .externalCustomerId("external_customer_id")
                                .build()
                        )
                    )
                    .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        println(customerUsageUpdateResponse)
        customerUsageUpdateResponse.validate()
    }

    @Test
    fun callUpdateByExternalId() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val usageService = client.customers().usage()
        val customerUsageUpdateByExternalIdResponse =
            usageService.updateByExternalId(
                CustomerUsageUpdateByExternalIdParams.builder()
                    .id("external_customer_id")
                    .events(
                        listOf(
                            CustomerUsageUpdateByExternalIdParams.Event.builder()
                                .eventName("event_name")
                                .properties(JsonValue.from(mapOf<String, Any>()))
                                .timestamp(OffsetDateTime.parse("2020-12-09T16:09:53Z"))
                                .customerId("customer_id")
                                .externalCustomerId("external_customer_id")
                                .build()
                        )
                    )
                    .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        println(customerUsageUpdateByExternalIdResponse)
        customerUsageUpdateByExternalIdResponse.validate()
    }
}
