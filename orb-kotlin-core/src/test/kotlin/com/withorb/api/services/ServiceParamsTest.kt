// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.equalTo
import com.github.tomakehurst.wiremock.client.WireMock.matchingJsonPath
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.postRequestedFor
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.client.WireMock.verify
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.withorb.api.client.OrbClient
import com.withorb.api.client.okhttp.OrbOkHttpClient
import com.withorb.api.core.JsonValue
import com.withorb.api.models.AccountingProviderConfig
import com.withorb.api.models.AddressInput
import com.withorb.api.models.CustomerCreateParams
import com.withorb.api.models.CustomerHierarchyConfig
import com.withorb.api.models.CustomerTaxId
import com.withorb.api.models.NewAccountingSyncConfiguration
import com.withorb.api.models.NewAvalaraTaxConfiguration
import com.withorb.api.models.NewReportingConfiguration
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class ServiceParamsTest {

    private lateinit var client: OrbClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            OrbOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
    }

    @Test
    fun create() {
        val customerService = client.customers()
        stubFor(post(anyUrl()).willReturn(ok("{}")))

        customerService.create(
            CustomerCreateParams.builder()
                .email("dev@stainless.com")
                .name("x")
                .accountingSyncConfiguration(
                    NewAccountingSyncConfiguration.builder()
                        .addAccountingProvider(
                            AccountingProviderConfig.builder()
                                .externalProviderId("external_provider_id")
                                .providerType("provider_type")
                                .build()
                        )
                        .excluded(true)
                        .build()
                )
                .addAdditionalEmail("dev@stainless.com")
                .autoCollection(true)
                .autoIssuance(true)
                .billingAddress(
                    AddressInput.builder()
                        .city("city")
                        .country("country")
                        .line1("line1")
                        .line2("line2")
                        .postalCode("postal_code")
                        .state("state")
                        .build()
                )
                .currency("currency")
                .emailDelivery(true)
                .externalCustomerId("external_customer_id")
                .hierarchy(
                    CustomerHierarchyConfig.builder()
                        .addChildCustomerId("string")
                        .parentCustomerId("parent_customer_id")
                        .build()
                )
                .metadata(
                    CustomerCreateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .paymentProvider(CustomerCreateParams.PaymentProvider.QUICKBOOKS)
                .paymentProviderId("payment_provider_id")
                .reportingConfiguration(NewReportingConfiguration.builder().exempt(true).build())
                .shippingAddress(
                    AddressInput.builder()
                        .city("city")
                        .country("country")
                        .line1("line1")
                        .line2("line2")
                        .postalCode("postal_code")
                        .state("state")
                        .build()
                )
                .taxConfiguration(
                    NewAvalaraTaxConfiguration.builder()
                        .taxExempt(true)
                        .taxProvider(NewAvalaraTaxConfiguration.TaxProvider.AVALARA)
                        .taxExemptionCode("tax_exemption_code")
                        .build()
                )
                .taxId(
                    CustomerTaxId.builder()
                        .country(CustomerTaxId.Country.AD)
                        .type(CustomerTaxId.Type.AD_NRT)
                        .value("value")
                        .build()
                )
                .timezone("timezone")
                .putAdditionalHeader("Secret-Header", "42")
                .putAdditionalQueryParam("secret_query_param", "42")
                .putAdditionalBodyProperty("secretProperty", JsonValue.from("42"))
                .build()
        )

        verify(
            postRequestedFor(anyUrl())
                .withHeader("Secret-Header", equalTo("42"))
                .withQueryParam("secret_query_param", equalTo("42"))
                .withRequestBody(matchingJsonPath("$.secretProperty", equalTo("42")))
        )
    }
}
