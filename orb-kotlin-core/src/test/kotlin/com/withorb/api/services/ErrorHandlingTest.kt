// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.status
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.withorb.api.client.OrbClient
import com.withorb.api.client.okhttp.OrbOkHttpClient
import com.withorb.api.core.JsonValue
import com.withorb.api.core.http.Headers
import com.withorb.api.core.jsonMapper
import com.withorb.api.errors.BadRequestException
import com.withorb.api.errors.InternalServerException
import com.withorb.api.errors.NotFoundException
import com.withorb.api.errors.OrbException
import com.withorb.api.errors.PermissionDeniedException
import com.withorb.api.errors.RateLimitException
import com.withorb.api.errors.UnauthorizedException
import com.withorb.api.errors.UnexpectedStatusCodeException
import com.withorb.api.errors.UnprocessableEntityException
import com.withorb.api.models.AccountingProviderConfig
import com.withorb.api.models.AddressInput
import com.withorb.api.models.CustomerCreateParams
import com.withorb.api.models.CustomerHierarchyConfig
import com.withorb.api.models.CustomerTaxId
import com.withorb.api.models.NewAccountingSyncConfiguration
import com.withorb.api.models.NewAvalaraTaxConfiguration
import com.withorb.api.models.NewReportingConfiguration
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.entry
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class ErrorHandlingTest {

    companion object {

        private val ERROR_JSON: JsonValue = JsonValue.from(mapOf("errorProperty" to "42"))

        private val ERROR_JSON_BYTES: ByteArray = jsonMapper().writeValueAsBytes(ERROR_JSON)

        private const val HEADER_NAME: String = "Error-Header"

        private const val HEADER_VALUE: String = "42"

        private const val NOT_JSON: String = "Not JSON"
    }

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
    fun customersCreate400() {
        val customerService = client.customers()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<BadRequestException> {
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
                        .reportingConfiguration(
                            NewReportingConfiguration.builder().exempt(true).build()
                        )
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
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun customersCreate400WithRawResponse() {
        val customerService = client.customers().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<BadRequestException> {
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
                        .reportingConfiguration(
                            NewReportingConfiguration.builder().exempt(true).build()
                        )
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
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun customersCreate401() {
        val customerService = client.customers()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnauthorizedException> {
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
                        .reportingConfiguration(
                            NewReportingConfiguration.builder().exempt(true).build()
                        )
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
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun customersCreate401WithRawResponse() {
        val customerService = client.customers().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnauthorizedException> {
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
                        .reportingConfiguration(
                            NewReportingConfiguration.builder().exempt(true).build()
                        )
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
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun customersCreate403() {
        val customerService = client.customers()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<PermissionDeniedException> {
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
                        .reportingConfiguration(
                            NewReportingConfiguration.builder().exempt(true).build()
                        )
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
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun customersCreate403WithRawResponse() {
        val customerService = client.customers().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<PermissionDeniedException> {
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
                        .reportingConfiguration(
                            NewReportingConfiguration.builder().exempt(true).build()
                        )
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
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun customersCreate404() {
        val customerService = client.customers()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<NotFoundException> {
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
                        .reportingConfiguration(
                            NewReportingConfiguration.builder().exempt(true).build()
                        )
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
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun customersCreate404WithRawResponse() {
        val customerService = client.customers().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<NotFoundException> {
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
                        .reportingConfiguration(
                            NewReportingConfiguration.builder().exempt(true).build()
                        )
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
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun customersCreate422() {
        val customerService = client.customers()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnprocessableEntityException> {
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
                        .reportingConfiguration(
                            NewReportingConfiguration.builder().exempt(true).build()
                        )
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
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun customersCreate422WithRawResponse() {
        val customerService = client.customers().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnprocessableEntityException> {
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
                        .reportingConfiguration(
                            NewReportingConfiguration.builder().exempt(true).build()
                        )
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
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun customersCreate429() {
        val customerService = client.customers()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<RateLimitException> {
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
                        .reportingConfiguration(
                            NewReportingConfiguration.builder().exempt(true).build()
                        )
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
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun customersCreate429WithRawResponse() {
        val customerService = client.customers().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<RateLimitException> {
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
                        .reportingConfiguration(
                            NewReportingConfiguration.builder().exempt(true).build()
                        )
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
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun customersCreate500() {
        val customerService = client.customers()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<InternalServerException> {
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
                        .reportingConfiguration(
                            NewReportingConfiguration.builder().exempt(true).build()
                        )
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
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun customersCreate500WithRawResponse() {
        val customerService = client.customers().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<InternalServerException> {
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
                        .reportingConfiguration(
                            NewReportingConfiguration.builder().exempt(true).build()
                        )
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
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun customersCreate999() {
        val customerService = client.customers()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
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
                        .reportingConfiguration(
                            NewReportingConfiguration.builder().exempt(true).build()
                        )
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
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun customersCreate999WithRawResponse() {
        val customerService = client.customers().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
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
                        .reportingConfiguration(
                            NewReportingConfiguration.builder().exempt(true).build()
                        )
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
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun customersCreateInvalidJsonBody() {
        val customerService = client.customers()
        stubFor(
            post(anyUrl())
                .willReturn(status(200).withHeader(HEADER_NAME, HEADER_VALUE).withBody(NOT_JSON))
        )

        val e =
            assertThrows<OrbException> {
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
                        .reportingConfiguration(
                            NewReportingConfiguration.builder().exempt(true).build()
                        )
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
                        .build()
                )
            }

        assertThat(e).hasMessage("Error reading response")
    }

    private fun Headers.toMap(): Map<String, List<String>> =
        mutableMapOf<String, List<String>>().also { map ->
            names().forEach { map[it] = values(it) }
        }
}
