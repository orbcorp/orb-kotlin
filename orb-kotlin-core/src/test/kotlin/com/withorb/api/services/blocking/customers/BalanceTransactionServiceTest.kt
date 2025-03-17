// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking.customers

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClient
import com.withorb.api.models.CustomerBalanceTransactionCreateParams
import com.withorb.api.models.CustomerBalanceTransactionListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BalanceTransactionServiceTest {

    @Test
    fun create() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val balanceTransactionService = client.customers().balanceTransactions()

        val balanceTransaction =
            balanceTransactionService.create(
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
    fun list() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val balanceTransactionService = client.customers().balanceTransactions()

        val page =
            balanceTransactionService.list(
                CustomerBalanceTransactionListParams.builder().customerId("customer_id").build()
            )

        page.response().validate()
    }
}
