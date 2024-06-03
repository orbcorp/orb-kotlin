// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services

import com.fasterxml.jackson.databind.json.JsonMapper
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.equalTo
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.matchingJsonPath
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.postRequestedFor
import com.github.tomakehurst.wiremock.client.WireMock.put
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.client.WireMock.verify
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.withorb.api.client.OrbClient
import com.withorb.api.client.okhttp.OrbOkHttpClient
import com.withorb.api.core.JsonString
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import com.withorb.api.models.*
import java.time.OffsetDateTime
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

@WireMockTest
class ServiceParamsTest {

    private val JSON_MAPPER: JsonMapper = jsonMapper()

    private lateinit var client: OrbClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            OrbOkHttpClient.builder()
                .apiKey("My API Key")
                .webhookSecret("My Webhook Secret")
                .baseUrl(wmRuntimeInfo.getHttpBaseUrl())
                .build()
    }

    @Test
    fun customersCreateWithAdditionalParams() {
        val additionalHeaders = mutableMapOf<String, List<String>>()

        additionalHeaders.put("x-test-header", listOf("abc1234"))

        val additionalQueryParams = mutableMapOf<String, List<String>>()

        additionalQueryParams.put("test_query_param", listOf("def567"))

        val additionalBodyProperties = mutableMapOf<String, JsonValue>()

        additionalBodyProperties.put("testBodyProperty", JsonString.of("ghi890"))

        val params =
            CustomerCreateParams.builder()
                .email("string")
                .name("string")
                .accountingSyncConfiguration(
                    CustomerCreateParams.AccountingSyncConfiguration.builder()
                        .accountingProviders(
                            listOf(
                                CustomerCreateParams.AccountingSyncConfiguration.AccountingProvider
                                    .builder()
                                    .externalProviderId("string")
                                    .providerType("string")
                                    .build()
                            )
                        )
                        .excluded(true)
                        .build()
                )
                .additionalEmails(listOf("string"))
                .autoCollection(true)
                .billingAddress(
                    CustomerCreateParams.BillingAddress.builder()
                        .city("string")
                        .country("string")
                        .line1("string")
                        .line2("string")
                        .postalCode("string")
                        .state("string")
                        .build()
                )
                .currency("string")
                .emailDelivery(true)
                .externalCustomerId("string")
                .metadata(CustomerCreateParams.Metadata.builder().build())
                .paymentProvider(CustomerCreateParams.PaymentProvider.QUICKBOOKS)
                .paymentProviderId("string")
                .reportingConfiguration(
                    CustomerCreateParams.ReportingConfiguration.builder().exempt(true).build()
                )
                .shippingAddress(
                    CustomerCreateParams.ShippingAddress.builder()
                        .city("string")
                        .country("string")
                        .line1("string")
                        .line2("string")
                        .postalCode("string")
                        .state("string")
                        .build()
                )
                .taxId(
                    CustomerCreateParams.TaxId.builder()
                        .country(CustomerCreateParams.TaxId.Country.AD)
                        .type(CustomerCreateParams.TaxId.Type.AD_NRT)
                        .value("string")
                        .build()
                )
                .timezone("string")
                .additionalHeaders(additionalHeaders)
                .additionalBodyProperties(additionalBodyProperties)
                .additionalQueryParams(additionalQueryParams)
                .build()

        val apiResponse =
            Customer.builder()
                .id("string")
                .additionalEmails(listOf("string"))
                .autoCollection(true)
                .balance("string")
                .billingAddress(
                    Customer.BillingAddress.builder()
                        .city("string")
                        .country("string")
                        .line1("string")
                        .line2("string")
                        .postalCode("string")
                        .state("string")
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("string")
                .email("string")
                .emailDelivery(true)
                .externalCustomerId("string")
                .metadata(Customer.Metadata.builder().build())
                .name("string")
                .paymentProvider(Customer.PaymentProvider.QUICKBOOKS)
                .paymentProviderId("string")
                .portalUrl("string")
                .shippingAddress(
                    Customer.ShippingAddress.builder()
                        .city("string")
                        .country("string")
                        .line1("string")
                        .line2("string")
                        .postalCode("string")
                        .state("string")
                        .build()
                )
                .taxId(
                    Customer.TaxId.builder()
                        .country(Customer.TaxId.Country.AD)
                        .type(Customer.TaxId.Type.AD_NRT)
                        .value("string")
                        .build()
                )
                .timezone("string")
                .accountingSyncConfiguration(
                    Customer.AccountingSyncConfiguration.builder()
                        .accountingProviders(
                            listOf(
                                Customer.AccountingSyncConfiguration.AccountingProvider.builder()
                                    .externalProviderId("string")
                                    .providerType(
                                        Customer.AccountingSyncConfiguration.AccountingProvider
                                            .ProviderType
                                            .QUICKBOOKS
                                    )
                                    .build()
                            )
                        )
                        .excluded(true)
                        .build()
                )
                .reportingConfiguration(
                    Customer.ReportingConfiguration.builder().exempt(true).build()
                )
                .build()

        stubFor(
            post(anyUrl())
                .withHeader("x-test-header", equalTo("abc1234"))
                .withQueryParam("test_query_param", equalTo("def567"))
                .withRequestBody(matchingJsonPath("$.testBodyProperty", equalTo("ghi890")))
                .willReturn(ok(JSON_MAPPER.writeValueAsString(apiResponse)))
        )

        client.customers().create(params)

        verify(postRequestedFor(anyUrl()))
    }
}
