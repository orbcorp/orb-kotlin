// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClient
import com.withorb.api.models.*
import com.withorb.api.models.CustomerListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CustomerServiceTest {

    @Test
    fun callCreate() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val customerService = client.customers()
        val customer =
            customerService.create(
                CustomerCreateParams.builder()
                    .email("string")
                    .name("string")
                    .accountingSyncConfiguration(
                        CustomerCreateParams.AccountingSyncConfiguration.builder()
                            .accountingProviders(
                                listOf(
                                    CustomerCreateParams.AccountingSyncConfiguration
                                        .AccountingProvider
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
            )
        println(customer)
        customer.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val customerService = client.customers()
        val customer =
            customerService.update(
                CustomerUpdateParams.builder()
                    .customerId("string")
                    .accountingSyncConfiguration(
                        CustomerUpdateParams.AccountingSyncConfiguration.builder()
                            .accountingProviders(
                                listOf(
                                    CustomerUpdateParams.AccountingSyncConfiguration
                                        .AccountingProvider
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
                        CustomerUpdateParams.BillingAddress.builder()
                            .city("string")
                            .country("string")
                            .line1("string")
                            .line2("string")
                            .postalCode("string")
                            .state("string")
                            .build()
                    )
                    .currency("string")
                    .email("string")
                    .emailDelivery(true)
                    .externalCustomerId("string")
                    .metadata(CustomerUpdateParams.Metadata.builder().build())
                    .name("string")
                    .paymentProvider(CustomerUpdateParams.PaymentProvider.QUICKBOOKS)
                    .paymentProviderId("string")
                    .reportingConfiguration(
                        CustomerUpdateParams.ReportingConfiguration.builder().exempt(true).build()
                    )
                    .shippingAddress(
                        CustomerUpdateParams.ShippingAddress.builder()
                            .city("string")
                            .country("string")
                            .line1("string")
                            .line2("string")
                            .postalCode("string")
                            .state("string")
                            .build()
                    )
                    .taxId(
                        CustomerUpdateParams.TaxId.builder()
                            .country(CustomerUpdateParams.TaxId.Country.AD)
                            .type(CustomerUpdateParams.TaxId.Type.AD_NRT)
                            .value("string")
                            .build()
                    )
                    .build()
            )
        println(customer)
        customer.validate()
    }

    @Test
    fun callList() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val customerService = client.customers()
        val customers = customerService.list(CustomerListParams.builder().build())
        println(customers)
        customers.data().forEach { it.validate() }
    }

    @Test
    fun callDelete() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val customerService = client.customers()
        customerService.delete(CustomerDeleteParams.builder().customerId("string").build())
    }

    @Test
    fun callFetch() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val customerService = client.customers()
        val customer =
            customerService.fetch(CustomerFetchParams.builder().customerId("string").build())
        println(customer)
        customer.validate()
    }

    @Test
    fun callFetchByExternalId() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val customerService = client.customers()
        val customer =
            customerService.fetchByExternalId(
                CustomerFetchByExternalIdParams.builder().externalCustomerId("string").build()
            )
        println(customer)
        customer.validate()
    }

    @Test
    fun callUpdateByExternalId() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val customerService = client.customers()
        val customer =
            customerService.updateByExternalId(
                CustomerUpdateByExternalIdParams.builder()
                    .id("string")
                    .accountingSyncConfiguration(
                        CustomerUpdateByExternalIdParams.AccountingSyncConfiguration.builder()
                            .accountingProviders(
                                listOf(
                                    CustomerUpdateByExternalIdParams.AccountingSyncConfiguration
                                        .AccountingProvider
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
                        CustomerUpdateByExternalIdParams.BillingAddress.builder()
                            .city("string")
                            .country("string")
                            .line1("string")
                            .line2("string")
                            .postalCode("string")
                            .state("string")
                            .build()
                    )
                    .currency("string")
                    .email("string")
                    .emailDelivery(true)
                    .externalCustomerId("string")
                    .metadata(CustomerUpdateByExternalIdParams.Metadata.builder().build())
                    .name("string")
                    .paymentProvider(CustomerUpdateByExternalIdParams.PaymentProvider.QUICKBOOKS)
                    .paymentProviderId("string")
                    .reportingConfiguration(
                        CustomerUpdateByExternalIdParams.ReportingConfiguration.builder()
                            .exempt(true)
                            .build()
                    )
                    .shippingAddress(
                        CustomerUpdateByExternalIdParams.ShippingAddress.builder()
                            .city("string")
                            .country("string")
                            .line1("string")
                            .line2("string")
                            .postalCode("string")
                            .state("string")
                            .build()
                    )
                    .taxId(
                        CustomerUpdateByExternalIdParams.TaxId.builder()
                            .country(CustomerUpdateByExternalIdParams.TaxId.Country.AD)
                            .type(CustomerUpdateByExternalIdParams.TaxId.Type.AD_NRT)
                            .value("string")
                            .build()
                    )
                    .build()
            )
        println(customer)
        customer.validate()
    }
}
