// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.customers.credits

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClientAsync
import com.withorb.api.models.CustomerCreditTopUpCreateByExternalIdParams
import com.withorb.api.models.CustomerCreditTopUpCreateParams
import com.withorb.api.models.CustomerCreditTopUpDeleteByExternalIdParams
import com.withorb.api.models.CustomerCreditTopUpDeleteParams
import com.withorb.api.models.CustomerCreditTopUpListByExternalIdParams
import com.withorb.api.models.CustomerCreditTopUpListParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TopUpServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val topUpServiceAsync = client.customers().credits().topUps()

        val topUp =
            topUpServiceAsync.create(
                CustomerCreditTopUpCreateParams.builder()
                    .customerId("customer_id")
                    .amount("amount")
                    .currency("currency")
                    .invoiceSettings(
                        CustomerCreditTopUpCreateParams.InvoiceSettings.builder()
                            .autoCollection(true)
                            .netTerms(0L)
                            .memo("memo")
                            .requireSuccessfulPayment(true)
                            .build()
                    )
                    .perUnitCostBasis("per_unit_cost_basis")
                    .threshold("threshold")
                    .activeFrom(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .expiresAfter(0L)
                    .expiresAfterUnit(CustomerCreditTopUpCreateParams.ExpiresAfterUnit.DAY)
                    .build()
            )

        topUp.validate()
    }

    @Test
    suspend fun list() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val topUpServiceAsync = client.customers().credits().topUps()

        val page =
            topUpServiceAsync.list(
                CustomerCreditTopUpListParams.builder().customerId("customer_id").build()
            )

        page.response().validate()
    }

    @Test
    suspend fun delete() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val topUpServiceAsync = client.customers().credits().topUps()

        topUpServiceAsync.delete(
            CustomerCreditTopUpDeleteParams.builder()
                .customerId("customer_id")
                .topUpId("top_up_id")
                .build()
        )
    }

    @Test
    suspend fun createByExternalId() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val topUpServiceAsync = client.customers().credits().topUps()

        val response =
            topUpServiceAsync.createByExternalId(
                CustomerCreditTopUpCreateByExternalIdParams.builder()
                    .externalCustomerId("external_customer_id")
                    .amount("amount")
                    .currency("currency")
                    .invoiceSettings(
                        CustomerCreditTopUpCreateByExternalIdParams.InvoiceSettings.builder()
                            .autoCollection(true)
                            .netTerms(0L)
                            .memo("memo")
                            .requireSuccessfulPayment(true)
                            .build()
                    )
                    .perUnitCostBasis("per_unit_cost_basis")
                    .threshold("threshold")
                    .activeFrom(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .expiresAfter(0L)
                    .expiresAfterUnit(
                        CustomerCreditTopUpCreateByExternalIdParams.ExpiresAfterUnit.DAY
                    )
                    .build()
            )

        response.validate()
    }

    @Test
    suspend fun deleteByExternalId() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val topUpServiceAsync = client.customers().credits().topUps()

        topUpServiceAsync.deleteByExternalId(
            CustomerCreditTopUpDeleteByExternalIdParams.builder()
                .externalCustomerId("external_customer_id")
                .topUpId("top_up_id")
                .build()
        )
    }

    @Test
    suspend fun listByExternalId() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val topUpServiceAsync = client.customers().credits().topUps()

        val page =
            topUpServiceAsync.listByExternalId(
                CustomerCreditTopUpListByExternalIdParams.builder()
                    .externalCustomerId("external_customer_id")
                    .build()
            )

        page.response().validate()
    }
}
