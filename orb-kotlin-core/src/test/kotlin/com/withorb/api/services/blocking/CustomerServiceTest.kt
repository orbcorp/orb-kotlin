// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClient
import com.withorb.api.core.JsonValue
import com.withorb.api.models.CustomerCreateParams
import com.withorb.api.models.CustomerUpdateByExternalIdParams
import com.withorb.api.models.CustomerUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CustomerServiceTest {

    @Test
    fun create() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val customerService = client.customers()

        val customer =
            customerService.create(
                CustomerCreateParams.builder()
                    .email("dev@stainless.com")
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
                    .addAdditionalEmail("dev@stainless.com")
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
                    .hierarchy(
                        CustomerCreateParams.Hierarchy.builder()
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
                        CustomerCreateParams.TaxConfiguration.NewAvalaraTaxConfiguration.builder()
                            .taxExempt(true)
                            .taxExemptionCode("tax_exemption_code")
                            .build()
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

        customer.validate()
    }

    @Test
    fun update() {
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
                    .email("dev@stainless.com")
                    .emailDelivery(true)
                    .externalCustomerId("external_customer_id")
                    .hierarchy(
                        CustomerUpdateParams.Hierarchy.builder()
                            .addChildCustomerId("string")
                            .parentCustomerId("parent_customer_id")
                            .build()
                    )
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
                        CustomerUpdateParams.TaxConfiguration.NewAvalaraTaxConfiguration.builder()
                            .taxExempt(true)
                            .taxExemptionCode("tax_exemption_code")
                            .build()
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

        customer.validate()
    }

    @Test
    fun list() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val customerService = client.customers()

        val page = customerService.list()

        page.response().validate()
    }

    @Test
    fun delete() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val customerService = client.customers()

        customerService.delete("customer_id")
    }

    @Test
    fun fetch() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val customerService = client.customers()

        val customer = customerService.fetch("customer_id")

        customer.validate()
    }

    @Test
    fun fetchByExternalId() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val customerService = client.customers()

        val customer = customerService.fetchByExternalId("external_customer_id")

        customer.validate()
    }

    @Test
    fun syncPaymentMethodsFromGateway() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val customerService = client.customers()

        customerService.syncPaymentMethodsFromGateway("customer_id")
    }

    @Test
    fun syncPaymentMethodsFromGatewayByExternalCustomerId() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val customerService = client.customers()

        customerService.syncPaymentMethodsFromGatewayByExternalCustomerId("external_customer_id")
    }

    @Test
    fun updateByExternalId() {
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
                    .email("dev@stainless.com")
                    .emailDelivery(true)
                    .externalCustomerId("external_customer_id")
                    .hierarchy(
                        CustomerUpdateByExternalIdParams.Hierarchy.builder()
                            .addChildCustomerId("string")
                            .parentCustomerId("parent_customer_id")
                            .build()
                    )
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
                        CustomerUpdateByExternalIdParams.TaxConfiguration.NewAvalaraTaxConfiguration
                            .builder()
                            .taxExempt(true)
                            .taxExemptionCode("tax_exemption_code")
                            .build()
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

        customer.validate()
    }
}
