// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClientAsync
import com.withorb.api.core.JsonValue
import com.withorb.api.models.AccountingProviderConfig
import com.withorb.api.models.AddressInput
import com.withorb.api.models.CustomerCreateParams
import com.withorb.api.models.CustomerHierarchyConfig
import com.withorb.api.models.CustomerTaxId
import com.withorb.api.models.CustomerUpdateByExternalIdParams
import com.withorb.api.models.CustomerUpdateParams
import com.withorb.api.models.NewAccountingSyncConfiguration
import com.withorb.api.models.NewAvalaraTaxConfiguration
import com.withorb.api.models.NewReportingConfiguration
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CustomerServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val customerServiceAsync = client.customers()

        val customer =
            customerServiceAsync.create(
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
                    .paymentConfiguration(
                        CustomerCreateParams.PaymentConfiguration.builder()
                            .addPaymentProvider(
                                CustomerCreateParams.PaymentConfiguration.PaymentProvider.builder()
                                    .providerType(
                                        CustomerCreateParams.PaymentConfiguration.PaymentProvider
                                            .ProviderType
                                            .STRIPE
                                    )
                                    .addExcludedPaymentMethodType("string")
                                    .build()
                            )
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
                            .automaticTaxEnabled(true)
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

        customer.validate()
    }

    @Test
    suspend fun update() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val customerServiceAsync = client.customers()

        val customer =
            customerServiceAsync.update(
                CustomerUpdateParams.builder()
                    .customerId("customer_id")
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
                    .addAdditionalEmail("string")
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
                    .email("dev@stainless.com")
                    .emailDelivery(true)
                    .externalCustomerId("external_customer_id")
                    .hierarchy(
                        CustomerHierarchyConfig.builder()
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
                    .paymentConfiguration(
                        CustomerUpdateParams.PaymentConfiguration.builder()
                            .addPaymentProvider(
                                CustomerUpdateParams.PaymentConfiguration.PaymentProvider.builder()
                                    .providerType(
                                        CustomerUpdateParams.PaymentConfiguration.PaymentProvider
                                            .ProviderType
                                            .STRIPE
                                    )
                                    .addExcludedPaymentMethodType("string")
                                    .build()
                            )
                            .build()
                    )
                    .paymentProvider(CustomerUpdateParams.PaymentProvider.QUICKBOOKS)
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
                            .automaticTaxEnabled(true)
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
                    .build()
            )

        customer.validate()
    }

    @Test
    suspend fun list() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val customerServiceAsync = client.customers()

        val page = customerServiceAsync.list()

        page.response().validate()
    }

    @Test
    suspend fun delete() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val customerServiceAsync = client.customers()

        customerServiceAsync.delete("customer_id")
    }

    @Test
    suspend fun fetch() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val customerServiceAsync = client.customers()

        val customer = customerServiceAsync.fetch("customer_id")

        customer.validate()
    }

    @Test
    suspend fun fetchByExternalId() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val customerServiceAsync = client.customers()

        val customer = customerServiceAsync.fetchByExternalId("external_customer_id")

        customer.validate()
    }

    @Test
    suspend fun syncPaymentMethodsFromGateway() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val customerServiceAsync = client.customers()

        customerServiceAsync.syncPaymentMethodsFromGateway("customer_id")
    }

    @Test
    suspend fun syncPaymentMethodsFromGatewayByExternalCustomerId() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val customerServiceAsync = client.customers()

        customerServiceAsync.syncPaymentMethodsFromGatewayByExternalCustomerId(
            "external_customer_id"
        )
    }

    @Test
    suspend fun updateByExternalId() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val customerServiceAsync = client.customers()

        val customer =
            customerServiceAsync.updateByExternalId(
                CustomerUpdateByExternalIdParams.builder()
                    .id("external_customer_id")
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
                    .addAdditionalEmail("string")
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
                    .email("dev@stainless.com")
                    .emailDelivery(true)
                    .externalCustomerId("external_customer_id")
                    .hierarchy(
                        CustomerHierarchyConfig.builder()
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
                    .paymentConfiguration(
                        CustomerUpdateByExternalIdParams.PaymentConfiguration.builder()
                            .addPaymentProvider(
                                CustomerUpdateByExternalIdParams.PaymentConfiguration
                                    .PaymentProvider
                                    .builder()
                                    .providerType(
                                        CustomerUpdateByExternalIdParams.PaymentConfiguration
                                            .PaymentProvider
                                            .ProviderType
                                            .STRIPE
                                    )
                                    .addExcludedPaymentMethodType("string")
                                    .build()
                            )
                            .build()
                    )
                    .paymentProvider(CustomerUpdateByExternalIdParams.PaymentProvider.QUICKBOOKS)
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
                            .automaticTaxEnabled(true)
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
                    .build()
            )

        customer.validate()
    }
}
