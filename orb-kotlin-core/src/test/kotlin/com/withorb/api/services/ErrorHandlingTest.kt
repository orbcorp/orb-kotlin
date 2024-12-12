// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services

import com.fasterxml.jackson.databind.json.JsonMapper
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.ok
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
import com.withorb.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.assertj.core.api.InstanceOfAssertFactories
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

@WireMockTest
class ErrorHandlingTest {

    private val JSON_MAPPER: JsonMapper = jsonMapper()

    private val ORB_ERROR: OrbError =
        OrbError.builder().putAdditionalProperty("key", JsonValue.from("value")).build()

    private lateinit var client: OrbClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            OrbOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.getHttpBaseUrl())
                .apiKey("My API Key")
                .webhookSecret("My Webhook Secret")
                .build()
    }

    @Test
    fun customersCreate200() {
        val params =
            CustomerCreateParams.builder()
                .email("dev@stainlessapi.com")
                .name("x")
                .accountingSyncConfiguration(
                    CustomerCreateParams.AccountingSyncConfiguration.builder()
                        .accountingProviders(
                            listOf(
                                CustomerCreateParams.AccountingSyncConfiguration.AccountingProvider
                                    .builder()
                                    .externalProviderId("external_provider_id")
                                    .providerType("provider_type")
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
                .metadata(
                    CustomerCreateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .paymentProvider(CustomerCreateParams.PaymentProvider.QUICKBOOKS)
                .paymentProviderId("payment_provider_id")
                .reportingConfiguration(
                    CustomerCreateParams.ReportingConfiguration.builder().exempt(true).build()
                )
                .shippingAddress(
                    CustomerCreateParams.ShippingAddress.builder()
                        .city("city")
                        .country("country")
                        .line1("line1")
                        .line2("line2")
                        .postalCode("postal_code")
                        .state("state")
                        .build()
                )
                .taxConfiguration(
                    CustomerCreateParams.TaxConfiguration.ofNewAvalaraTaxConfiguration(
                        CustomerCreateParams.TaxConfiguration.NewAvalaraTaxConfiguration.builder()
                            .taxExempt(true)
                            .taxProvider(
                                CustomerCreateParams.TaxConfiguration.NewAvalaraTaxConfiguration
                                    .TaxProvider
                                    .AVALARA
                            )
                            .taxExemptionCode("tax_exemption_code")
                            .build()
                    )
                )
                .taxId(
                    CustomerCreateParams.TaxId.builder()
                        .country(CustomerCreateParams.TaxId.Country.AD)
                        .type(CustomerCreateParams.TaxId.Type.AD_NRT)
                        .value("value")
                        .build()
                )
                .timezone("timezone")
                .build()

        val expected =
            Customer.builder()
                .id("id")
                .additionalEmails(listOf("string"))
                .autoCollection(true)
                .balance("balance")
                .billingAddress(
                    Customer.BillingAddress.builder()
                        .city("city")
                        .country("country")
                        .line1("line1")
                        .line2("line2")
                        .postalCode("postal_code")
                        .state("state")
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("currency")
                .email("email")
                .emailDelivery(true)
                .exemptFromAutomatedTax(true)
                .externalCustomerId("external_customer_id")
                .metadata(
                    Customer.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .name("name")
                .paymentProvider(Customer.PaymentProvider.QUICKBOOKS)
                .paymentProviderId("payment_provider_id")
                .portalUrl("portal_url")
                .shippingAddress(
                    Customer.ShippingAddress.builder()
                        .city("city")
                        .country("country")
                        .line1("line1")
                        .line2("line2")
                        .postalCode("postal_code")
                        .state("state")
                        .build()
                )
                .taxId(
                    Customer.TaxId.builder()
                        .country(Customer.TaxId.Country.AD)
                        .type(Customer.TaxId.Type.AD_NRT)
                        .value("value")
                        .build()
                )
                .timezone("timezone")
                .accountingSyncConfiguration(
                    Customer.AccountingSyncConfiguration.builder()
                        .accountingProviders(
                            listOf(
                                Customer.AccountingSyncConfiguration.AccountingProvider.builder()
                                    .externalProviderId("external_provider_id")
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

        stubFor(post(anyUrl()).willReturn(ok().withBody(toJson(expected))))

        assertThat(client.customers().create(params)).isEqualTo(expected)
    }

    @Test
    fun customersCreate400() {
        val params =
            CustomerCreateParams.builder()
                .email("dev@stainlessapi.com")
                .name("x")
                .accountingSyncConfiguration(
                    CustomerCreateParams.AccountingSyncConfiguration.builder()
                        .accountingProviders(
                            listOf(
                                CustomerCreateParams.AccountingSyncConfiguration.AccountingProvider
                                    .builder()
                                    .externalProviderId("external_provider_id")
                                    .providerType("provider_type")
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
                .metadata(
                    CustomerCreateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .paymentProvider(CustomerCreateParams.PaymentProvider.QUICKBOOKS)
                .paymentProviderId("payment_provider_id")
                .reportingConfiguration(
                    CustomerCreateParams.ReportingConfiguration.builder().exempt(true).build()
                )
                .shippingAddress(
                    CustomerCreateParams.ShippingAddress.builder()
                        .city("city")
                        .country("country")
                        .line1("line1")
                        .line2("line2")
                        .postalCode("postal_code")
                        .state("state")
                        .build()
                )
                .taxConfiguration(
                    CustomerCreateParams.TaxConfiguration.ofNewAvalaraTaxConfiguration(
                        CustomerCreateParams.TaxConfiguration.NewAvalaraTaxConfiguration.builder()
                            .taxExempt(true)
                            .taxProvider(
                                CustomerCreateParams.TaxConfiguration.NewAvalaraTaxConfiguration
                                    .TaxProvider
                                    .AVALARA
                            )
                            .taxExemptionCode("tax_exemption_code")
                            .build()
                    )
                )
                .taxId(
                    CustomerCreateParams.TaxId.builder()
                        .country(CustomerCreateParams.TaxId.Country.AD)
                        .type(CustomerCreateParams.TaxId.Type.AD_NRT)
                        .value("value")
                        .build()
                )
                .timezone("timezone")
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(status(400).withHeader("Foo", "Bar").withBody(toJson(ORB_ERROR)))
        )

        assertThatThrownBy({ client.customers().create(params) })
            .satisfies({ e ->
                assertBadRequest(e, Headers.builder().put("Foo", "Bar").build(), ORB_ERROR)
            })
    }

    @Test
    fun customersCreate401() {
        val params =
            CustomerCreateParams.builder()
                .email("dev@stainlessapi.com")
                .name("x")
                .accountingSyncConfiguration(
                    CustomerCreateParams.AccountingSyncConfiguration.builder()
                        .accountingProviders(
                            listOf(
                                CustomerCreateParams.AccountingSyncConfiguration.AccountingProvider
                                    .builder()
                                    .externalProviderId("external_provider_id")
                                    .providerType("provider_type")
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
                .metadata(
                    CustomerCreateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .paymentProvider(CustomerCreateParams.PaymentProvider.QUICKBOOKS)
                .paymentProviderId("payment_provider_id")
                .reportingConfiguration(
                    CustomerCreateParams.ReportingConfiguration.builder().exempt(true).build()
                )
                .shippingAddress(
                    CustomerCreateParams.ShippingAddress.builder()
                        .city("city")
                        .country("country")
                        .line1("line1")
                        .line2("line2")
                        .postalCode("postal_code")
                        .state("state")
                        .build()
                )
                .taxConfiguration(
                    CustomerCreateParams.TaxConfiguration.ofNewAvalaraTaxConfiguration(
                        CustomerCreateParams.TaxConfiguration.NewAvalaraTaxConfiguration.builder()
                            .taxExempt(true)
                            .taxProvider(
                                CustomerCreateParams.TaxConfiguration.NewAvalaraTaxConfiguration
                                    .TaxProvider
                                    .AVALARA
                            )
                            .taxExemptionCode("tax_exemption_code")
                            .build()
                    )
                )
                .taxId(
                    CustomerCreateParams.TaxId.builder()
                        .country(CustomerCreateParams.TaxId.Country.AD)
                        .type(CustomerCreateParams.TaxId.Type.AD_NRT)
                        .value("value")
                        .build()
                )
                .timezone("timezone")
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(status(401).withHeader("Foo", "Bar").withBody(toJson(ORB_ERROR)))
        )

        assertThatThrownBy({ client.customers().create(params) })
            .satisfies({ e ->
                assertUnauthorized(e, Headers.builder().put("Foo", "Bar").build(), ORB_ERROR)
            })
    }

    @Test
    fun customersCreate403() {
        val params =
            CustomerCreateParams.builder()
                .email("dev@stainlessapi.com")
                .name("x")
                .accountingSyncConfiguration(
                    CustomerCreateParams.AccountingSyncConfiguration.builder()
                        .accountingProviders(
                            listOf(
                                CustomerCreateParams.AccountingSyncConfiguration.AccountingProvider
                                    .builder()
                                    .externalProviderId("external_provider_id")
                                    .providerType("provider_type")
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
                .metadata(
                    CustomerCreateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .paymentProvider(CustomerCreateParams.PaymentProvider.QUICKBOOKS)
                .paymentProviderId("payment_provider_id")
                .reportingConfiguration(
                    CustomerCreateParams.ReportingConfiguration.builder().exempt(true).build()
                )
                .shippingAddress(
                    CustomerCreateParams.ShippingAddress.builder()
                        .city("city")
                        .country("country")
                        .line1("line1")
                        .line2("line2")
                        .postalCode("postal_code")
                        .state("state")
                        .build()
                )
                .taxConfiguration(
                    CustomerCreateParams.TaxConfiguration.ofNewAvalaraTaxConfiguration(
                        CustomerCreateParams.TaxConfiguration.NewAvalaraTaxConfiguration.builder()
                            .taxExempt(true)
                            .taxProvider(
                                CustomerCreateParams.TaxConfiguration.NewAvalaraTaxConfiguration
                                    .TaxProvider
                                    .AVALARA
                            )
                            .taxExemptionCode("tax_exemption_code")
                            .build()
                    )
                )
                .taxId(
                    CustomerCreateParams.TaxId.builder()
                        .country(CustomerCreateParams.TaxId.Country.AD)
                        .type(CustomerCreateParams.TaxId.Type.AD_NRT)
                        .value("value")
                        .build()
                )
                .timezone("timezone")
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(status(403).withHeader("Foo", "Bar").withBody(toJson(ORB_ERROR)))
        )

        assertThatThrownBy({ client.customers().create(params) })
            .satisfies({ e ->
                assertPermissionDenied(e, Headers.builder().put("Foo", "Bar").build(), ORB_ERROR)
            })
    }

    @Test
    fun customersCreate404() {
        val params =
            CustomerCreateParams.builder()
                .email("dev@stainlessapi.com")
                .name("x")
                .accountingSyncConfiguration(
                    CustomerCreateParams.AccountingSyncConfiguration.builder()
                        .accountingProviders(
                            listOf(
                                CustomerCreateParams.AccountingSyncConfiguration.AccountingProvider
                                    .builder()
                                    .externalProviderId("external_provider_id")
                                    .providerType("provider_type")
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
                .metadata(
                    CustomerCreateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .paymentProvider(CustomerCreateParams.PaymentProvider.QUICKBOOKS)
                .paymentProviderId("payment_provider_id")
                .reportingConfiguration(
                    CustomerCreateParams.ReportingConfiguration.builder().exempt(true).build()
                )
                .shippingAddress(
                    CustomerCreateParams.ShippingAddress.builder()
                        .city("city")
                        .country("country")
                        .line1("line1")
                        .line2("line2")
                        .postalCode("postal_code")
                        .state("state")
                        .build()
                )
                .taxConfiguration(
                    CustomerCreateParams.TaxConfiguration.ofNewAvalaraTaxConfiguration(
                        CustomerCreateParams.TaxConfiguration.NewAvalaraTaxConfiguration.builder()
                            .taxExempt(true)
                            .taxProvider(
                                CustomerCreateParams.TaxConfiguration.NewAvalaraTaxConfiguration
                                    .TaxProvider
                                    .AVALARA
                            )
                            .taxExemptionCode("tax_exemption_code")
                            .build()
                    )
                )
                .taxId(
                    CustomerCreateParams.TaxId.builder()
                        .country(CustomerCreateParams.TaxId.Country.AD)
                        .type(CustomerCreateParams.TaxId.Type.AD_NRT)
                        .value("value")
                        .build()
                )
                .timezone("timezone")
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(status(404).withHeader("Foo", "Bar").withBody(toJson(ORB_ERROR)))
        )

        assertThatThrownBy({ client.customers().create(params) })
            .satisfies({ e ->
                assertNotFound(e, Headers.builder().put("Foo", "Bar").build(), ORB_ERROR)
            })
    }

    @Test
    fun customersCreate422() {
        val params =
            CustomerCreateParams.builder()
                .email("dev@stainlessapi.com")
                .name("x")
                .accountingSyncConfiguration(
                    CustomerCreateParams.AccountingSyncConfiguration.builder()
                        .accountingProviders(
                            listOf(
                                CustomerCreateParams.AccountingSyncConfiguration.AccountingProvider
                                    .builder()
                                    .externalProviderId("external_provider_id")
                                    .providerType("provider_type")
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
                .metadata(
                    CustomerCreateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .paymentProvider(CustomerCreateParams.PaymentProvider.QUICKBOOKS)
                .paymentProviderId("payment_provider_id")
                .reportingConfiguration(
                    CustomerCreateParams.ReportingConfiguration.builder().exempt(true).build()
                )
                .shippingAddress(
                    CustomerCreateParams.ShippingAddress.builder()
                        .city("city")
                        .country("country")
                        .line1("line1")
                        .line2("line2")
                        .postalCode("postal_code")
                        .state("state")
                        .build()
                )
                .taxConfiguration(
                    CustomerCreateParams.TaxConfiguration.ofNewAvalaraTaxConfiguration(
                        CustomerCreateParams.TaxConfiguration.NewAvalaraTaxConfiguration.builder()
                            .taxExempt(true)
                            .taxProvider(
                                CustomerCreateParams.TaxConfiguration.NewAvalaraTaxConfiguration
                                    .TaxProvider
                                    .AVALARA
                            )
                            .taxExemptionCode("tax_exemption_code")
                            .build()
                    )
                )
                .taxId(
                    CustomerCreateParams.TaxId.builder()
                        .country(CustomerCreateParams.TaxId.Country.AD)
                        .type(CustomerCreateParams.TaxId.Type.AD_NRT)
                        .value("value")
                        .build()
                )
                .timezone("timezone")
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(status(422).withHeader("Foo", "Bar").withBody(toJson(ORB_ERROR)))
        )

        assertThatThrownBy({ client.customers().create(params) })
            .satisfies({ e ->
                assertUnprocessableEntity(e, Headers.builder().put("Foo", "Bar").build(), ORB_ERROR)
            })
    }

    @Test
    fun customersCreate429() {
        val params =
            CustomerCreateParams.builder()
                .email("dev@stainlessapi.com")
                .name("x")
                .accountingSyncConfiguration(
                    CustomerCreateParams.AccountingSyncConfiguration.builder()
                        .accountingProviders(
                            listOf(
                                CustomerCreateParams.AccountingSyncConfiguration.AccountingProvider
                                    .builder()
                                    .externalProviderId("external_provider_id")
                                    .providerType("provider_type")
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
                .metadata(
                    CustomerCreateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .paymentProvider(CustomerCreateParams.PaymentProvider.QUICKBOOKS)
                .paymentProviderId("payment_provider_id")
                .reportingConfiguration(
                    CustomerCreateParams.ReportingConfiguration.builder().exempt(true).build()
                )
                .shippingAddress(
                    CustomerCreateParams.ShippingAddress.builder()
                        .city("city")
                        .country("country")
                        .line1("line1")
                        .line2("line2")
                        .postalCode("postal_code")
                        .state("state")
                        .build()
                )
                .taxConfiguration(
                    CustomerCreateParams.TaxConfiguration.ofNewAvalaraTaxConfiguration(
                        CustomerCreateParams.TaxConfiguration.NewAvalaraTaxConfiguration.builder()
                            .taxExempt(true)
                            .taxProvider(
                                CustomerCreateParams.TaxConfiguration.NewAvalaraTaxConfiguration
                                    .TaxProvider
                                    .AVALARA
                            )
                            .taxExemptionCode("tax_exemption_code")
                            .build()
                    )
                )
                .taxId(
                    CustomerCreateParams.TaxId.builder()
                        .country(CustomerCreateParams.TaxId.Country.AD)
                        .type(CustomerCreateParams.TaxId.Type.AD_NRT)
                        .value("value")
                        .build()
                )
                .timezone("timezone")
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(status(429).withHeader("Foo", "Bar").withBody(toJson(ORB_ERROR)))
        )

        assertThatThrownBy({ client.customers().create(params) })
            .satisfies({ e ->
                assertRateLimit(e, Headers.builder().put("Foo", "Bar").build(), ORB_ERROR)
            })
    }

    @Test
    fun customersCreate500() {
        val params =
            CustomerCreateParams.builder()
                .email("dev@stainlessapi.com")
                .name("x")
                .accountingSyncConfiguration(
                    CustomerCreateParams.AccountingSyncConfiguration.builder()
                        .accountingProviders(
                            listOf(
                                CustomerCreateParams.AccountingSyncConfiguration.AccountingProvider
                                    .builder()
                                    .externalProviderId("external_provider_id")
                                    .providerType("provider_type")
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
                .metadata(
                    CustomerCreateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .paymentProvider(CustomerCreateParams.PaymentProvider.QUICKBOOKS)
                .paymentProviderId("payment_provider_id")
                .reportingConfiguration(
                    CustomerCreateParams.ReportingConfiguration.builder().exempt(true).build()
                )
                .shippingAddress(
                    CustomerCreateParams.ShippingAddress.builder()
                        .city("city")
                        .country("country")
                        .line1("line1")
                        .line2("line2")
                        .postalCode("postal_code")
                        .state("state")
                        .build()
                )
                .taxConfiguration(
                    CustomerCreateParams.TaxConfiguration.ofNewAvalaraTaxConfiguration(
                        CustomerCreateParams.TaxConfiguration.NewAvalaraTaxConfiguration.builder()
                            .taxExempt(true)
                            .taxProvider(
                                CustomerCreateParams.TaxConfiguration.NewAvalaraTaxConfiguration
                                    .TaxProvider
                                    .AVALARA
                            )
                            .taxExemptionCode("tax_exemption_code")
                            .build()
                    )
                )
                .taxId(
                    CustomerCreateParams.TaxId.builder()
                        .country(CustomerCreateParams.TaxId.Country.AD)
                        .type(CustomerCreateParams.TaxId.Type.AD_NRT)
                        .value("value")
                        .build()
                )
                .timezone("timezone")
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(status(500).withHeader("Foo", "Bar").withBody(toJson(ORB_ERROR)))
        )

        assertThatThrownBy({ client.customers().create(params) })
            .satisfies({ e ->
                assertInternalServer(e, Headers.builder().put("Foo", "Bar").build(), ORB_ERROR)
            })
    }

    @Test
    fun unexpectedStatusCode() {
        val params =
            CustomerCreateParams.builder()
                .email("dev@stainlessapi.com")
                .name("x")
                .accountingSyncConfiguration(
                    CustomerCreateParams.AccountingSyncConfiguration.builder()
                        .accountingProviders(
                            listOf(
                                CustomerCreateParams.AccountingSyncConfiguration.AccountingProvider
                                    .builder()
                                    .externalProviderId("external_provider_id")
                                    .providerType("provider_type")
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
                .metadata(
                    CustomerCreateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .paymentProvider(CustomerCreateParams.PaymentProvider.QUICKBOOKS)
                .paymentProviderId("payment_provider_id")
                .reportingConfiguration(
                    CustomerCreateParams.ReportingConfiguration.builder().exempt(true).build()
                )
                .shippingAddress(
                    CustomerCreateParams.ShippingAddress.builder()
                        .city("city")
                        .country("country")
                        .line1("line1")
                        .line2("line2")
                        .postalCode("postal_code")
                        .state("state")
                        .build()
                )
                .taxConfiguration(
                    CustomerCreateParams.TaxConfiguration.ofNewAvalaraTaxConfiguration(
                        CustomerCreateParams.TaxConfiguration.NewAvalaraTaxConfiguration.builder()
                            .taxExempt(true)
                            .taxProvider(
                                CustomerCreateParams.TaxConfiguration.NewAvalaraTaxConfiguration
                                    .TaxProvider
                                    .AVALARA
                            )
                            .taxExemptionCode("tax_exemption_code")
                            .build()
                    )
                )
                .taxId(
                    CustomerCreateParams.TaxId.builder()
                        .country(CustomerCreateParams.TaxId.Country.AD)
                        .type(CustomerCreateParams.TaxId.Type.AD_NRT)
                        .value("value")
                        .build()
                )
                .timezone("timezone")
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(status(999).withHeader("Foo", "Bar").withBody(toJson(ORB_ERROR)))
        )

        assertThatThrownBy({ client.customers().create(params) })
            .satisfies({ e ->
                assertUnexpectedStatusCodeException(
                    e,
                    999,
                    Headers.builder().put("Foo", "Bar").build(),
                    toJson(ORB_ERROR)
                )
            })
    }

    @Test
    fun invalidBody() {
        val params =
            CustomerCreateParams.builder()
                .email("dev@stainlessapi.com")
                .name("x")
                .accountingSyncConfiguration(
                    CustomerCreateParams.AccountingSyncConfiguration.builder()
                        .accountingProviders(
                            listOf(
                                CustomerCreateParams.AccountingSyncConfiguration.AccountingProvider
                                    .builder()
                                    .externalProviderId("external_provider_id")
                                    .providerType("provider_type")
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
                .metadata(
                    CustomerCreateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .paymentProvider(CustomerCreateParams.PaymentProvider.QUICKBOOKS)
                .paymentProviderId("payment_provider_id")
                .reportingConfiguration(
                    CustomerCreateParams.ReportingConfiguration.builder().exempt(true).build()
                )
                .shippingAddress(
                    CustomerCreateParams.ShippingAddress.builder()
                        .city("city")
                        .country("country")
                        .line1("line1")
                        .line2("line2")
                        .postalCode("postal_code")
                        .state("state")
                        .build()
                )
                .taxConfiguration(
                    CustomerCreateParams.TaxConfiguration.ofNewAvalaraTaxConfiguration(
                        CustomerCreateParams.TaxConfiguration.NewAvalaraTaxConfiguration.builder()
                            .taxExempt(true)
                            .taxProvider(
                                CustomerCreateParams.TaxConfiguration.NewAvalaraTaxConfiguration
                                    .TaxProvider
                                    .AVALARA
                            )
                            .taxExemptionCode("tax_exemption_code")
                            .build()
                    )
                )
                .taxId(
                    CustomerCreateParams.TaxId.builder()
                        .country(CustomerCreateParams.TaxId.Country.AD)
                        .type(CustomerCreateParams.TaxId.Type.AD_NRT)
                        .value("value")
                        .build()
                )
                .timezone("timezone")
                .build()

        stubFor(post(anyUrl()).willReturn(status(200).withBody("Not JSON")))

        assertThatThrownBy({ client.customers().create(params) })
            .satisfies({ e ->
                assertThat(e)
                    .isInstanceOf(OrbException::class.java)
                    .hasMessage("Error reading response")
            })
    }

    @Test
    fun invalidErrorBody() {
        val params =
            CustomerCreateParams.builder()
                .email("dev@stainlessapi.com")
                .name("x")
                .accountingSyncConfiguration(
                    CustomerCreateParams.AccountingSyncConfiguration.builder()
                        .accountingProviders(
                            listOf(
                                CustomerCreateParams.AccountingSyncConfiguration.AccountingProvider
                                    .builder()
                                    .externalProviderId("external_provider_id")
                                    .providerType("provider_type")
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
                .metadata(
                    CustomerCreateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .paymentProvider(CustomerCreateParams.PaymentProvider.QUICKBOOKS)
                .paymentProviderId("payment_provider_id")
                .reportingConfiguration(
                    CustomerCreateParams.ReportingConfiguration.builder().exempt(true).build()
                )
                .shippingAddress(
                    CustomerCreateParams.ShippingAddress.builder()
                        .city("city")
                        .country("country")
                        .line1("line1")
                        .line2("line2")
                        .postalCode("postal_code")
                        .state("state")
                        .build()
                )
                .taxConfiguration(
                    CustomerCreateParams.TaxConfiguration.ofNewAvalaraTaxConfiguration(
                        CustomerCreateParams.TaxConfiguration.NewAvalaraTaxConfiguration.builder()
                            .taxExempt(true)
                            .taxProvider(
                                CustomerCreateParams.TaxConfiguration.NewAvalaraTaxConfiguration
                                    .TaxProvider
                                    .AVALARA
                            )
                            .taxExemptionCode("tax_exemption_code")
                            .build()
                    )
                )
                .taxId(
                    CustomerCreateParams.TaxId.builder()
                        .country(CustomerCreateParams.TaxId.Country.AD)
                        .type(CustomerCreateParams.TaxId.Type.AD_NRT)
                        .value("value")
                        .build()
                )
                .timezone("timezone")
                .build()

        stubFor(post(anyUrl()).willReturn(status(400).withBody("Not JSON")))

        assertThatThrownBy({ client.customers().create(params) })
            .satisfies({ e ->
                assertBadRequest(e, Headers.builder().build(), OrbError.builder().build())
            })
    }

    private fun <T> toJson(body: T): ByteArray {
        return JSON_MAPPER.writeValueAsBytes(body)
    }

    private fun assertUnexpectedStatusCodeException(
        throwable: Throwable,
        statusCode: Int,
        headers: Headers,
        responseBody: ByteArray
    ) {
        assertThat(throwable)
            .asInstanceOf(
                InstanceOfAssertFactories.throwable(UnexpectedStatusCodeException::class.java)
            )
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(statusCode)
                assertThat(e.body()).isEqualTo(String(responseBody))
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertBadRequest(throwable: Throwable, headers: Headers, error: OrbError) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(BadRequestException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(400)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertUnauthorized(throwable: Throwable, headers: Headers, error: OrbError) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(UnauthorizedException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(401)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertPermissionDenied(throwable: Throwable, headers: Headers, error: OrbError) {
        assertThat(throwable)
            .asInstanceOf(
                InstanceOfAssertFactories.throwable(PermissionDeniedException::class.java)
            )
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(403)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertNotFound(throwable: Throwable, headers: Headers, error: OrbError) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(NotFoundException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(404)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertUnprocessableEntity(throwable: Throwable, headers: Headers, error: OrbError) {
        assertThat(throwable)
            .asInstanceOf(
                InstanceOfAssertFactories.throwable(UnprocessableEntityException::class.java)
            )
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(422)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertRateLimit(throwable: Throwable, headers: Headers, error: OrbError) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(RateLimitException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(429)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertInternalServer(throwable: Throwable, headers: Headers, error: OrbError) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(InternalServerException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(500)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun Headers.toMap(): Map<String, List<String>> =
        mutableMapOf<String, List<String>>().also { map ->
            names().forEach { map[it] = values(it) }
        }
}
