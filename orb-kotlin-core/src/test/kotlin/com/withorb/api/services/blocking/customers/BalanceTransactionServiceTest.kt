// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking.customers

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClient
import com.withorb.api.models.CustomerBalanceTransactionCreateParams
import com.withorb.api.models.CustomerBalanceTransactionListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class BalanceTransactionServiceTest {

    @Test
    fun callCreate() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val balanceTransactionService = client.customers().balanceTransactions()
        val customerBalanceTransactionCreateResponse =
            balanceTransactionService.create(
                CustomerBalanceTransactionCreateParams.builder()
                    .customerId("customer_id")
                    .amount("amount")
                    .type(CustomerBalanceTransactionCreateParams.Type.INCREMENT)
                    .description("description")
                    .build()
            )
        println(customerBalanceTransactionCreateResponse)
        customerBalanceTransactionCreateResponse.validate()
    }

    @Test
    fun callList() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val balanceTransactionService = client.customers().balanceTransactions()
        val customerBalanceTransactions =
            balanceTransactionService.list(
                CustomerBalanceTransactionListParams.builder().customerId("customer_id").build()
            )
        println(customerBalanceTransactions)
        customerBalanceTransactions.data().forEach { it.validate() }
    }
}
