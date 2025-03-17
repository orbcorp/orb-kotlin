// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking.customers.credits

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClient
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
internal class TopUpServiceTest {

    @Test
    fun create() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val topUpService = client.customers().credits().topUps()

        val topUp =
            topUpService.create(
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
    fun list() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val topUpService = client.customers().credits().topUps()

        val page =
            topUpService.list(
                CustomerCreditTopUpListParams.builder().customerId("customer_id").build()
            )

        page.response().validate()
    }

    @Test
    fun delete() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val topUpService = client.customers().credits().topUps()

        topUpService.delete(
            CustomerCreditTopUpDeleteParams.builder()
                .customerId("customer_id")
                .topUpId("top_up_id")
                .build()
        )
    }

    @Test
    fun createByExternalId() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val topUpService = client.customers().credits().topUps()

        val response =
            topUpService.createByExternalId(
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
    fun deleteByExternalId() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val topUpService = client.customers().credits().topUps()

        topUpService.deleteByExternalId(
            CustomerCreditTopUpDeleteByExternalIdParams.builder()
                .externalCustomerId("external_customer_id")
                .topUpId("top_up_id")
                .build()
        )
    }

    @Test
    fun listByExternalId() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val topUpService = client.customers().credits().topUps()

        val page =
            topUpService.listByExternalId(
                CustomerCreditTopUpListByExternalIdParams.builder()
                    .externalCustomerId("external_customer_id")
                    .build()
            )

        page.response().validate()
    }
}
