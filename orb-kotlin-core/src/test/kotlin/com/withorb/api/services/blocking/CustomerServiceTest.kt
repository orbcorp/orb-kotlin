// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClient
import com.withorb.api.core.JsonValue
import com.withorb.api.models.CustomerCreateParams
import com.withorb.api.models.CustomerDeleteParams
import com.withorb.api.models.CustomerFetchByExternalIdParams
import com.withorb.api.models.CustomerFetchParams
import com.withorb.api.models.CustomerListParams
import com.withorb.api.models.CustomerUpdateByExternalIdParams
import com.withorb.api.models.CustomerUpdateParams
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
                    .email("dev@stainlessapi.com")
                    .name("x")
                    .accountingSyncConfiguration(
                        CustomerCreateParams.AccountingSyncConfiguration.builder()
                            .addAccountingProvider(
                                CustomerCreateParams.AccountingSyncConfiguration.AccountingProvider
                                    .builder()
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
                            CustomerCreateParams.TaxConfiguration.NewAvalaraTaxConfiguration
                                .builder()
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
                    .customerId("customer_id")
                    .accountingSyncConfiguration(
                        CustomerUpdateParams.AccountingSyncConfiguration.builder()
                            .addAccountingProvider(
                                CustomerUpdateParams.AccountingSyncConfiguration.AccountingProvider
                                    .builder()
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
                        CustomerUpdateParams.BillingAddress.builder()
                            .city("city")
                            .country("country")
                            .line1("line1")
                            .line2("line2")
                            .postalCode("postal_code")
                            .state("state")
                            .build()
                    )
                    .currency("currency")
                    .email("dev@stainlessapi.com")
                    .emailDelivery(true)
                    .externalCustomerId("external_customer_id")
                    .metadata(
                        CustomerUpdateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .name("name")
                    .paymentProvider(CustomerUpdateParams.PaymentProvider.QUICKBOOKS)
                    .paymentProviderId("payment_provider_id")
                    .reportingConfiguration(
                        CustomerUpdateParams.ReportingConfiguration.builder().exempt(true).build()
                    )
                    .shippingAddress(
                        CustomerUpdateParams.ShippingAddress.builder()
                            .city("city")
                            .country("country")
                            .line1("line1")
                            .line2("line2")
                            .postalCode("postal_code")
                            .state("state")
                            .build()
                    )
                    .taxConfiguration(
                        CustomerUpdateParams.TaxConfiguration.ofNewAvalaraTaxConfiguration(
                            CustomerUpdateParams.TaxConfiguration.NewAvalaraTaxConfiguration
                                .builder()
                                .taxExempt(true)
                                .taxProvider(
                                    CustomerUpdateParams.TaxConfiguration.NewAvalaraTaxConfiguration
                                        .TaxProvider
                                        .AVALARA
                                )
                                .taxExemptionCode("tax_exemption_code")
                                .build()
                        )
                    )
                    .taxId(
                        CustomerUpdateParams.TaxId.builder()
                            .country(CustomerUpdateParams.TaxId.Country.AD)
                            .type(CustomerUpdateParams.TaxId.Type.AD_NRT)
                            .value("value")
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
        customerService.delete(CustomerDeleteParams.builder().customerId("customer_id").build())
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
            customerService.fetch(CustomerFetchParams.builder().customerId("customer_id").build())
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
                CustomerFetchByExternalIdParams.builder()
                    .externalCustomerId("external_customer_id")
                    .build()
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
                    .id("external_customer_id")
                    .accountingSyncConfiguration(
                        CustomerUpdateByExternalIdParams.AccountingSyncConfiguration.builder()
                            .addAccountingProvider(
                                CustomerUpdateByExternalIdParams.AccountingSyncConfiguration
                                    .AccountingProvider
                                    .builder()
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
                        CustomerUpdateByExternalIdParams.BillingAddress.builder()
                            .city("city")
                            .country("country")
                            .line1("line1")
                            .line2("line2")
                            .postalCode("postal_code")
                            .state("state")
                            .build()
                    )
                    .currency("currency")
                    .email("dev@stainlessapi.com")
                    .emailDelivery(true)
                    .externalCustomerId("external_customer_id")
                    .metadata(
                        CustomerUpdateByExternalIdParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .name("name")
                    .paymentProvider(CustomerUpdateByExternalIdParams.PaymentProvider.QUICKBOOKS)
                    .paymentProviderId("payment_provider_id")
                    .reportingConfiguration(
                        CustomerUpdateByExternalIdParams.ReportingConfiguration.builder()
                            .exempt(true)
                            .build()
                    )
                    .shippingAddress(
                        CustomerUpdateByExternalIdParams.ShippingAddress.builder()
                            .city("city")
                            .country("country")
                            .line1("line1")
                            .line2("line2")
                            .postalCode("postal_code")
                            .state("state")
                            .build()
                    )
                    .taxConfiguration(
                        CustomerUpdateByExternalIdParams.TaxConfiguration
                            .ofNewAvalaraTaxConfiguration(
                                CustomerUpdateByExternalIdParams.TaxConfiguration
                                    .NewAvalaraTaxConfiguration
                                    .builder()
                                    .taxExempt(true)
                                    .taxProvider(
                                        CustomerUpdateByExternalIdParams.TaxConfiguration
                                            .NewAvalaraTaxConfiguration
                                            .TaxProvider
                                            .AVALARA
                                    )
                                    .taxExemptionCode("tax_exemption_code")
                                    .build()
                            )
                    )
                    .taxId(
                        CustomerUpdateByExternalIdParams.TaxId.builder()
                            .country(CustomerUpdateByExternalIdParams.TaxId.Country.AD)
                            .type(CustomerUpdateByExternalIdParams.TaxId.Type.AD_NRT)
                            .value("value")
                            .build()
                    )
                    .build()
            )
        println(customer)
        customer.validate()
    }
}
