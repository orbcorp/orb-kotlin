// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.customers

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClientAsync
import com.withorb.api.models.CustomerBalanceTransactionCreateParams
import com.withorb.api.models.CustomerBalanceTransactionListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BalanceTransactionServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val balanceTransactionServiceAsync = client.customers().balanceTransactions()

        val balanceTransaction =
            balanceTransactionServiceAsync.create(
                CustomerBalanceTransactionCreateParams.builder()
                    .customerId("customer_id")
                    .amount("amount")
                    .type(CustomerBalanceTransactionCreateParams.Type.INCREMENT)
                    .description("description")
                    .build()
            )

        balanceTransaction.validate()
    }

    @Test
    suspend fun list() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val balanceTransactionServiceAsync = client.customers().balanceTransactions()

        val page =
            balanceTransactionServiceAsync.list(
                CustomerBalanceTransactionListParams.builder().customerId("customer_id").build()
            )

        page.response().validate()
    }
}
