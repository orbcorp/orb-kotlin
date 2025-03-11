// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking.customers

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClient
import com.withorb.api.models.CustomerCreditListByExternalIdParams
import com.withorb.api.models.CustomerCreditListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CreditServiceTest {

    @Test
    fun list() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val creditService = client.customers().credits()

        val page =
            creditService.list(CustomerCreditListParams.builder().customerId("customer_id").build())

        page.response().validate()
    }

    @Test
    fun listByExternalId() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val creditService = client.customers().credits()

        val page =
            creditService.listByExternalId(
                CustomerCreditListByExternalIdParams.builder()
                    .externalCustomerId("external_customer_id")
                    .build()
            )

        page.response().validate()
    }
}
