// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.customers

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClientAsync
import com.withorb.api.models.CustomerCreditFetchBalanceByExternalIdParams
import com.withorb.api.models.CustomerCreditFetchBalanceParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CreditServiceAsyncTest {

    @Test
    suspend fun list() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val creditServiceAsync = client.customers().credits()

        val page = creditServiceAsync.list("customer_id")

        page.response().validate()
    }

    @Test
    suspend fun fetchBalance() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val creditServiceAsync = client.customers().credits()

        val response =
            creditServiceAsync.fetchBalance(
                CustomerCreditFetchBalanceParams.builder()
                    .customerId("customer_id")
                    .currency("currency")
                    .build()
            )

        response.validate()
    }

    @Test
    suspend fun fetchBalanceByExternalId() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val creditServiceAsync = client.customers().credits()

        val response =
            creditServiceAsync.fetchBalanceByExternalId(
                CustomerCreditFetchBalanceByExternalIdParams.builder()
                    .externalCustomerId("external_customer_id")
                    .currency("currency")
                    .build()
            )

        response.validate()
    }

    @Test
    suspend fun listByExternalId() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val creditServiceAsync = client.customers().credits()

        val page = creditServiceAsync.listByExternalId("external_customer_id")

        page.response().validate()
    }
}
