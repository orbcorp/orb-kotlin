// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services

import com.fasterxml.jackson.databind.json.JsonMapper
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.status
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.google.common.collect.ImmutableListMultimap
import com.google.common.collect.ListMultimap
import com.withorb.api.client.OrbClient
import com.withorb.api.client.okhttp.OrbOkHttpClient
import com.withorb.api.core.JsonString
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
import org.assertj.guava.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

@WireMockTest
class ErrorHandlingTest {

    private val JSON_MAPPER: JsonMapper = jsonMapper()

    private val ORB_ERROR: OrbError =
        OrbError.builder().putAdditionalProperty("key", JsonString.of("value")).build()

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
                .build()

        val expected =
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

        stubFor(post(anyUrl()).willReturn(ok().withBody(toJson(expected))))

        assertThat(client.customers().create(params)).isEqualTo(expected)
    }

    @Test
    fun customersCreate400() {
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
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(status(400).withHeader("Foo", "Bar").withBody(toJson(ORB_ERROR)))
        )

        assertThatThrownBy({ client.customers().create(params) })
            .satisfies({ e ->
                assertBadRequest(e, ImmutableListMultimap.of("Foo", "Bar"), ORB_ERROR)
            })
    }

    @Test
    fun customersCreate401() {
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
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(status(401).withHeader("Foo", "Bar").withBody(toJson(ORB_ERROR)))
        )

        assertThatThrownBy({ client.customers().create(params) })
            .satisfies({ e ->
                assertUnauthorized(e, ImmutableListMultimap.of("Foo", "Bar"), ORB_ERROR)
            })
    }

    @Test
    fun customersCreate403() {
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
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(status(403).withHeader("Foo", "Bar").withBody(toJson(ORB_ERROR)))
        )

        assertThatThrownBy({ client.customers().create(params) })
            .satisfies({ e ->
                assertPermissionDenied(e, ImmutableListMultimap.of("Foo", "Bar"), ORB_ERROR)
            })
    }

    @Test
    fun customersCreate404() {
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
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(status(404).withHeader("Foo", "Bar").withBody(toJson(ORB_ERROR)))
        )

        assertThatThrownBy({ client.customers().create(params) })
            .satisfies({ e ->
                assertNotFound(e, ImmutableListMultimap.of("Foo", "Bar"), ORB_ERROR)
            })
    }

    @Test
    fun customersCreate422() {
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
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(status(422).withHeader("Foo", "Bar").withBody(toJson(ORB_ERROR)))
        )

        assertThatThrownBy({ client.customers().create(params) })
            .satisfies({ e ->
                assertUnprocessableEntity(e, ImmutableListMultimap.of("Foo", "Bar"), ORB_ERROR)
            })
    }

    @Test
    fun customersCreate429() {
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
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(status(429).withHeader("Foo", "Bar").withBody(toJson(ORB_ERROR)))
        )

        assertThatThrownBy({ client.customers().create(params) })
            .satisfies({ e ->
                assertRateLimit(e, ImmutableListMultimap.of("Foo", "Bar"), ORB_ERROR)
            })
    }

    @Test
    fun customersCreate500() {
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
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(status(500).withHeader("Foo", "Bar").withBody(toJson(ORB_ERROR)))
        )

        assertThatThrownBy({ client.customers().create(params) })
            .satisfies({ e ->
                assertInternalServer(e, ImmutableListMultimap.of("Foo", "Bar"), ORB_ERROR)
            })
    }

    @Test
    fun unexpectedStatusCode() {
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
                    ImmutableListMultimap.of("Foo", "Bar"),
                    toJson(ORB_ERROR)
                )
            })
    }

    @Test
    fun invalidBody() {
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
                .build()

        stubFor(post(anyUrl()).willReturn(status(400).withBody("Not JSON")))

        assertThatThrownBy({ client.customers().create(params) })
            .satisfies({ e ->
                assertBadRequest(e, ImmutableListMultimap.of(), OrbError.builder().build())
            })
    }

    private fun <T> toJson(body: T): ByteArray {
        return JSON_MAPPER.writeValueAsBytes(body)
    }

    private fun assertUnexpectedStatusCodeException(
        throwable: Throwable,
        statusCode: Int,
        headers: ListMultimap<String, String>,
        responseBody: ByteArray
    ) {
        assertThat(throwable)
            .asInstanceOf(
                InstanceOfAssertFactories.throwable(UnexpectedStatusCodeException::class.java)
            )
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(statusCode)
                assertThat(e.body()).isEqualTo(String(responseBody))
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertBadRequest(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: OrbError
    ) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(BadRequestException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(400)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertUnauthorized(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: OrbError
    ) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(UnauthorizedException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(401)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertPermissionDenied(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: OrbError
    ) {
        assertThat(throwable)
            .asInstanceOf(
                InstanceOfAssertFactories.throwable(PermissionDeniedException::class.java)
            )
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(403)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertNotFound(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: OrbError
    ) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(NotFoundException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(404)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertUnprocessableEntity(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: OrbError
    ) {
        assertThat(throwable)
            .asInstanceOf(
                InstanceOfAssertFactories.throwable(UnprocessableEntityException::class.java)
            )
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(422)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertRateLimit(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: OrbError
    ) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(RateLimitException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(429)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertInternalServer(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: OrbError
    ) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(InternalServerException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(500)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }
}
