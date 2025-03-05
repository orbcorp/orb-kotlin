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
import com.withorb.api.errors.OrbError
import com.withorb.api.errors.OrbException
import com.withorb.api.errors.PermissionDeniedException
import com.withorb.api.errors.RateLimitException
import com.withorb.api.errors.UnauthorizedException
import com.withorb.api.errors.UnexpectedStatusCodeException
import com.withorb.api.errors.UnprocessableEntityException
import com.withorb.api.models.AddressInputModel
import com.withorb.api.models.CustomerCreateParams
import com.withorb.api.models.CustomerHierarchyConfigModel
import com.withorb.api.models.CustomerTaxIdModel
import com.withorb.api.models.NewAccountingSyncConfigurationModel
import com.withorb.api.models.NewReportingConfigurationModel
import com.withorb.api.models.NewTaxConfigurationModel
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.entry
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

@WireMockTest
class ErrorHandlingTest {

    companion object {

        private val ERROR: OrbError =
            OrbError.builder().putAdditionalProperty("errorProperty", JsonValue.from("42")).build()

        private val ERROR_JSON: ByteArray = jsonMapper().writeValueAsBytes(ERROR)

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
                .willReturn(status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON))
        )

        val e =
            assertThrows<BadRequestException> {
                customerService.create(
                    CustomerCreateParams.builder()
                        .email("dev@stainless.com")
                        .name("x")
                        .accountingSyncConfiguration(
                            NewAccountingSyncConfigurationModel.builder()
                                .addAccountingProvider(
                                    NewAccountingSyncConfigurationModel.AccountingProvider.builder()
                                        .externalProviderId("external_provider_id")
                                        .providerType("provider_type")
                                        .build()
                                )
                                .excluded(true)
                                .build()
                        )
                        .addAdditionalEmail("string")
                        .autoCollection(true)
                        .billingAddress(
                            AddressInputModel.builder()
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
                            CustomerHierarchyConfigModel.builder()
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
                            NewReportingConfigurationModel.builder().exempt(true).build()
                        )
                        .shippingAddress(
                            AddressInputModel.builder()
                                .city("city")
                                .country("country")
                                .line1("line1")
                                .line2("line2")
                                .postalCode("postal_code")
                                .state("state")
                                .build()
                        )
                        .taxConfiguration(
                            NewTaxConfigurationModel.NewAvalaraTaxConfiguration.builder()
                                .taxExempt(true)
                                .taxProvider(
                                    NewTaxConfigurationModel.NewAvalaraTaxConfiguration.TaxProvider
                                        .AVALARA
                                )
                                .taxExemptionCode("tax_exemption_code")
                                .build()
                        )
                        .taxId(
                            CustomerTaxIdModel.builder()
                                .country(CustomerTaxIdModel.Country.AD)
                                .type(CustomerTaxIdModel.Type.AD_NRT)
                                .value("value")
                                .build()
                        )
                        .timezone("timezone")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.error()).isEqualTo(ERROR)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
    }

    @Test
    fun customersCreate401() {
        val customerService = client.customers()
        stubFor(
            post(anyUrl())
                .willReturn(status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON))
        )

        val e =
            assertThrows<UnauthorizedException> {
                customerService.create(
                    CustomerCreateParams.builder()
                        .email("dev@stainless.com")
                        .name("x")
                        .accountingSyncConfiguration(
                            NewAccountingSyncConfigurationModel.builder()
                                .addAccountingProvider(
                                    NewAccountingSyncConfigurationModel.AccountingProvider.builder()
                                        .externalProviderId("external_provider_id")
                                        .providerType("provider_type")
                                        .build()
                                )
                                .excluded(true)
                                .build()
                        )
                        .addAdditionalEmail("string")
                        .autoCollection(true)
                        .billingAddress(
                            AddressInputModel.builder()
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
                            CustomerHierarchyConfigModel.builder()
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
                            NewReportingConfigurationModel.builder().exempt(true).build()
                        )
                        .shippingAddress(
                            AddressInputModel.builder()
                                .city("city")
                                .country("country")
                                .line1("line1")
                                .line2("line2")
                                .postalCode("postal_code")
                                .state("state")
                                .build()
                        )
                        .taxConfiguration(
                            NewTaxConfigurationModel.NewAvalaraTaxConfiguration.builder()
                                .taxExempt(true)
                                .taxProvider(
                                    NewTaxConfigurationModel.NewAvalaraTaxConfiguration.TaxProvider
                                        .AVALARA
                                )
                                .taxExemptionCode("tax_exemption_code")
                                .build()
                        )
                        .taxId(
                            CustomerTaxIdModel.builder()
                                .country(CustomerTaxIdModel.Country.AD)
                                .type(CustomerTaxIdModel.Type.AD_NRT)
                                .value("value")
                                .build()
                        )
                        .timezone("timezone")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.error()).isEqualTo(ERROR)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
    }

    @Test
    fun customersCreate403() {
        val customerService = client.customers()
        stubFor(
            post(anyUrl())
                .willReturn(status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON))
        )

        val e =
            assertThrows<PermissionDeniedException> {
                customerService.create(
                    CustomerCreateParams.builder()
                        .email("dev@stainless.com")
                        .name("x")
                        .accountingSyncConfiguration(
                            NewAccountingSyncConfigurationModel.builder()
                                .addAccountingProvider(
                                    NewAccountingSyncConfigurationModel.AccountingProvider.builder()
                                        .externalProviderId("external_provider_id")
                                        .providerType("provider_type")
                                        .build()
                                )
                                .excluded(true)
                                .build()
                        )
                        .addAdditionalEmail("string")
                        .autoCollection(true)
                        .billingAddress(
                            AddressInputModel.builder()
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
                            CustomerHierarchyConfigModel.builder()
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
                            NewReportingConfigurationModel.builder().exempt(true).build()
                        )
                        .shippingAddress(
                            AddressInputModel.builder()
                                .city("city")
                                .country("country")
                                .line1("line1")
                                .line2("line2")
                                .postalCode("postal_code")
                                .state("state")
                                .build()
                        )
                        .taxConfiguration(
                            NewTaxConfigurationModel.NewAvalaraTaxConfiguration.builder()
                                .taxExempt(true)
                                .taxProvider(
                                    NewTaxConfigurationModel.NewAvalaraTaxConfiguration.TaxProvider
                                        .AVALARA
                                )
                                .taxExemptionCode("tax_exemption_code")
                                .build()
                        )
                        .taxId(
                            CustomerTaxIdModel.builder()
                                .country(CustomerTaxIdModel.Country.AD)
                                .type(CustomerTaxIdModel.Type.AD_NRT)
                                .value("value")
                                .build()
                        )
                        .timezone("timezone")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.error()).isEqualTo(ERROR)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
    }

    @Test
    fun customersCreate404() {
        val customerService = client.customers()
        stubFor(
            post(anyUrl())
                .willReturn(status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON))
        )

        val e =
            assertThrows<NotFoundException> {
                customerService.create(
                    CustomerCreateParams.builder()
                        .email("dev@stainless.com")
                        .name("x")
                        .accountingSyncConfiguration(
                            NewAccountingSyncConfigurationModel.builder()
                                .addAccountingProvider(
                                    NewAccountingSyncConfigurationModel.AccountingProvider.builder()
                                        .externalProviderId("external_provider_id")
                                        .providerType("provider_type")
                                        .build()
                                )
                                .excluded(true)
                                .build()
                        )
                        .addAdditionalEmail("string")
                        .autoCollection(true)
                        .billingAddress(
                            AddressInputModel.builder()
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
                            CustomerHierarchyConfigModel.builder()
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
                            NewReportingConfigurationModel.builder().exempt(true).build()
                        )
                        .shippingAddress(
                            AddressInputModel.builder()
                                .city("city")
                                .country("country")
                                .line1("line1")
                                .line2("line2")
                                .postalCode("postal_code")
                                .state("state")
                                .build()
                        )
                        .taxConfiguration(
                            NewTaxConfigurationModel.NewAvalaraTaxConfiguration.builder()
                                .taxExempt(true)
                                .taxProvider(
                                    NewTaxConfigurationModel.NewAvalaraTaxConfiguration.TaxProvider
                                        .AVALARA
                                )
                                .taxExemptionCode("tax_exemption_code")
                                .build()
                        )
                        .taxId(
                            CustomerTaxIdModel.builder()
                                .country(CustomerTaxIdModel.Country.AD)
                                .type(CustomerTaxIdModel.Type.AD_NRT)
                                .value("value")
                                .build()
                        )
                        .timezone("timezone")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.error()).isEqualTo(ERROR)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
    }

    @Test
    fun customersCreate422() {
        val customerService = client.customers()
        stubFor(
            post(anyUrl())
                .willReturn(status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON))
        )

        val e =
            assertThrows<UnprocessableEntityException> {
                customerService.create(
                    CustomerCreateParams.builder()
                        .email("dev@stainless.com")
                        .name("x")
                        .accountingSyncConfiguration(
                            NewAccountingSyncConfigurationModel.builder()
                                .addAccountingProvider(
                                    NewAccountingSyncConfigurationModel.AccountingProvider.builder()
                                        .externalProviderId("external_provider_id")
                                        .providerType("provider_type")
                                        .build()
                                )
                                .excluded(true)
                                .build()
                        )
                        .addAdditionalEmail("string")
                        .autoCollection(true)
                        .billingAddress(
                            AddressInputModel.builder()
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
                            CustomerHierarchyConfigModel.builder()
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
                            NewReportingConfigurationModel.builder().exempt(true).build()
                        )
                        .shippingAddress(
                            AddressInputModel.builder()
                                .city("city")
                                .country("country")
                                .line1("line1")
                                .line2("line2")
                                .postalCode("postal_code")
                                .state("state")
                                .build()
                        )
                        .taxConfiguration(
                            NewTaxConfigurationModel.NewAvalaraTaxConfiguration.builder()
                                .taxExempt(true)
                                .taxProvider(
                                    NewTaxConfigurationModel.NewAvalaraTaxConfiguration.TaxProvider
                                        .AVALARA
                                )
                                .taxExemptionCode("tax_exemption_code")
                                .build()
                        )
                        .taxId(
                            CustomerTaxIdModel.builder()
                                .country(CustomerTaxIdModel.Country.AD)
                                .type(CustomerTaxIdModel.Type.AD_NRT)
                                .value("value")
                                .build()
                        )
                        .timezone("timezone")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.error()).isEqualTo(ERROR)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
    }

    @Test
    fun customersCreate429() {
        val customerService = client.customers()
        stubFor(
            post(anyUrl())
                .willReturn(status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON))
        )

        val e =
            assertThrows<RateLimitException> {
                customerService.create(
                    CustomerCreateParams.builder()
                        .email("dev@stainless.com")
                        .name("x")
                        .accountingSyncConfiguration(
                            NewAccountingSyncConfigurationModel.builder()
                                .addAccountingProvider(
                                    NewAccountingSyncConfigurationModel.AccountingProvider.builder()
                                        .externalProviderId("external_provider_id")
                                        .providerType("provider_type")
                                        .build()
                                )
                                .excluded(true)
                                .build()
                        )
                        .addAdditionalEmail("string")
                        .autoCollection(true)
                        .billingAddress(
                            AddressInputModel.builder()
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
                            CustomerHierarchyConfigModel.builder()
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
                            NewReportingConfigurationModel.builder().exempt(true).build()
                        )
                        .shippingAddress(
                            AddressInputModel.builder()
                                .city("city")
                                .country("country")
                                .line1("line1")
                                .line2("line2")
                                .postalCode("postal_code")
                                .state("state")
                                .build()
                        )
                        .taxConfiguration(
                            NewTaxConfigurationModel.NewAvalaraTaxConfiguration.builder()
                                .taxExempt(true)
                                .taxProvider(
                                    NewTaxConfigurationModel.NewAvalaraTaxConfiguration.TaxProvider
                                        .AVALARA
                                )
                                .taxExemptionCode("tax_exemption_code")
                                .build()
                        )
                        .taxId(
                            CustomerTaxIdModel.builder()
                                .country(CustomerTaxIdModel.Country.AD)
                                .type(CustomerTaxIdModel.Type.AD_NRT)
                                .value("value")
                                .build()
                        )
                        .timezone("timezone")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.error()).isEqualTo(ERROR)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
    }

    @Test
    fun customersCreate500() {
        val customerService = client.customers()
        stubFor(
            post(anyUrl())
                .willReturn(status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON))
        )

        val e =
            assertThrows<InternalServerException> {
                customerService.create(
                    CustomerCreateParams.builder()
                        .email("dev@stainless.com")
                        .name("x")
                        .accountingSyncConfiguration(
                            NewAccountingSyncConfigurationModel.builder()
                                .addAccountingProvider(
                                    NewAccountingSyncConfigurationModel.AccountingProvider.builder()
                                        .externalProviderId("external_provider_id")
                                        .providerType("provider_type")
                                        .build()
                                )
                                .excluded(true)
                                .build()
                        )
                        .addAdditionalEmail("string")
                        .autoCollection(true)
                        .billingAddress(
                            AddressInputModel.builder()
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
                            CustomerHierarchyConfigModel.builder()
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
                            NewReportingConfigurationModel.builder().exempt(true).build()
                        )
                        .shippingAddress(
                            AddressInputModel.builder()
                                .city("city")
                                .country("country")
                                .line1("line1")
                                .line2("line2")
                                .postalCode("postal_code")
                                .state("state")
                                .build()
                        )
                        .taxConfiguration(
                            NewTaxConfigurationModel.NewAvalaraTaxConfiguration.builder()
                                .taxExempt(true)
                                .taxProvider(
                                    NewTaxConfigurationModel.NewAvalaraTaxConfiguration.TaxProvider
                                        .AVALARA
                                )
                                .taxExemptionCode("tax_exemption_code")
                                .build()
                        )
                        .taxId(
                            CustomerTaxIdModel.builder()
                                .country(CustomerTaxIdModel.Country.AD)
                                .type(CustomerTaxIdModel.Type.AD_NRT)
                                .value("value")
                                .build()
                        )
                        .timezone("timezone")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.error()).isEqualTo(ERROR)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
    }

    @Test
    fun customersCreate999() {
        val customerService = client.customers()
        stubFor(
            post(anyUrl())
                .willReturn(status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON))
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
                customerService.create(
                    CustomerCreateParams.builder()
                        .email("dev@stainless.com")
                        .name("x")
                        .accountingSyncConfiguration(
                            NewAccountingSyncConfigurationModel.builder()
                                .addAccountingProvider(
                                    NewAccountingSyncConfigurationModel.AccountingProvider.builder()
                                        .externalProviderId("external_provider_id")
                                        .providerType("provider_type")
                                        .build()
                                )
                                .excluded(true)
                                .build()
                        )
                        .addAdditionalEmail("string")
                        .autoCollection(true)
                        .billingAddress(
                            AddressInputModel.builder()
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
                            CustomerHierarchyConfigModel.builder()
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
                            NewReportingConfigurationModel.builder().exempt(true).build()
                        )
                        .shippingAddress(
                            AddressInputModel.builder()
                                .city("city")
                                .country("country")
                                .line1("line1")
                                .line2("line2")
                                .postalCode("postal_code")
                                .state("state")
                                .build()
                        )
                        .taxConfiguration(
                            NewTaxConfigurationModel.NewAvalaraTaxConfiguration.builder()
                                .taxExempt(true)
                                .taxProvider(
                                    NewTaxConfigurationModel.NewAvalaraTaxConfiguration.TaxProvider
                                        .AVALARA
                                )
                                .taxExemptionCode("tax_exemption_code")
                                .build()
                        )
                        .taxId(
                            CustomerTaxIdModel.builder()
                                .country(CustomerTaxIdModel.Country.AD)
                                .type(CustomerTaxIdModel.Type.AD_NRT)
                                .value("value")
                                .build()
                        )
                        .timezone("timezone")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.error()).isEqualTo(ERROR)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
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
                            NewAccountingSyncConfigurationModel.builder()
                                .addAccountingProvider(
                                    NewAccountingSyncConfigurationModel.AccountingProvider.builder()
                                        .externalProviderId("external_provider_id")
                                        .providerType("provider_type")
                                        .build()
                                )
                                .excluded(true)
                                .build()
                        )
                        .addAdditionalEmail("string")
                        .autoCollection(true)
                        .billingAddress(
                            AddressInputModel.builder()
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
                            CustomerHierarchyConfigModel.builder()
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
                            NewReportingConfigurationModel.builder().exempt(true).build()
                        )
                        .shippingAddress(
                            AddressInputModel.builder()
                                .city("city")
                                .country("country")
                                .line1("line1")
                                .line2("line2")
                                .postalCode("postal_code")
                                .state("state")
                                .build()
                        )
                        .taxConfiguration(
                            NewTaxConfigurationModel.NewAvalaraTaxConfiguration.builder()
                                .taxExempt(true)
                                .taxProvider(
                                    NewTaxConfigurationModel.NewAvalaraTaxConfiguration.TaxProvider
                                        .AVALARA
                                )
                                .taxExemptionCode("tax_exemption_code")
                                .build()
                        )
                        .taxId(
                            CustomerTaxIdModel.builder()
                                .country(CustomerTaxIdModel.Country.AD)
                                .type(CustomerTaxIdModel.Type.AD_NRT)
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
