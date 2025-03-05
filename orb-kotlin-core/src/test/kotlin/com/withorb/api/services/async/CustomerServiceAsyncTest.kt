// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClientAsync
import com.withorb.api.core.JsonValue
import com.withorb.api.models.AddressInputModel
import com.withorb.api.models.CustomerCreateParams
import com.withorb.api.models.CustomerDeleteParams
import com.withorb.api.models.CustomerFetchByExternalIdParams
import com.withorb.api.models.CustomerFetchParams
import com.withorb.api.models.CustomerHierarchyConfigModel
import com.withorb.api.models.CustomerSyncPaymentMethodsFromGatewayByExternalCustomerIdParams
import com.withorb.api.models.CustomerSyncPaymentMethodsFromGatewayParams
import com.withorb.api.models.CustomerTaxIdModel
import com.withorb.api.models.CustomerUpdateByExternalIdParams
import com.withorb.api.models.CustomerUpdateParams
import com.withorb.api.models.EditCustomerModel
import com.withorb.api.models.NewAccountingSyncConfigurationModel
import com.withorb.api.models.NewReportingConfigurationModel
import com.withorb.api.models.NewTaxConfigurationModel
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CustomerServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val customerServiceAsync = client.customers()

        val customerModel =
            customerServiceAsync.create(
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

        customerModel.validate()
    }

    @Test
    suspend fun update() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val customerServiceAsync = client.customers()

        val customerModel =
            customerServiceAsync.update(
                CustomerUpdateParams.builder()
                    .customerId("customer_id")
                    .editCustomerModel(
                        EditCustomerModel.builder()
                            .accountingSyncConfiguration(
                                NewAccountingSyncConfigurationModel.builder()
                                    .addAccountingProvider(
                                        NewAccountingSyncConfigurationModel.AccountingProvider
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
                            .email("dev@stainless.com")
                            .emailDelivery(true)
                            .externalCustomerId("external_customer_id")
                            .hierarchy(
                                CustomerHierarchyConfigModel.builder()
                                    .addChildCustomerId("string")
                                    .parentCustomerId("parent_customer_id")
                                    .build()
                            )
                            .metadata(
                                EditCustomerModel.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .name("name")
                            .paymentProvider(EditCustomerModel.PaymentProvider.QUICKBOOKS)
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
                                        NewTaxConfigurationModel.NewAvalaraTaxConfiguration
                                            .TaxProvider
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
                            .build()
                    )
                    .build()
            )

        customerModel.validate()
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

        customerServiceAsync.delete(
            CustomerDeleteParams.builder().customerId("customer_id").build()
        )
    }

    @Test
    suspend fun fetch() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val customerServiceAsync = client.customers()

        val customerModel =
            customerServiceAsync.fetch(
                CustomerFetchParams.builder().customerId("customer_id").build()
            )

        customerModel.validate()
    }

    @Test
    suspend fun fetchByExternalId() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val customerServiceAsync = client.customers()

        val customerModel =
            customerServiceAsync.fetchByExternalId(
                CustomerFetchByExternalIdParams.builder()
                    .externalCustomerId("external_customer_id")
                    .build()
            )

        customerModel.validate()
    }

    @Test
    suspend fun syncPaymentMethodsFromGateway() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val customerServiceAsync = client.customers()

        customerServiceAsync.syncPaymentMethodsFromGateway(
            CustomerSyncPaymentMethodsFromGatewayParams.builder()
                .externalCustomerId("external_customer_id")
                .build()
        )
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
            CustomerSyncPaymentMethodsFromGatewayByExternalCustomerIdParams.builder()
                .customerId("customer_id")
                .build()
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

        val customerModel =
            customerServiceAsync.updateByExternalId(
                CustomerUpdateByExternalIdParams.builder()
                    .id("external_customer_id")
                    .editCustomerModel(
                        EditCustomerModel.builder()
                            .accountingSyncConfiguration(
                                NewAccountingSyncConfigurationModel.builder()
                                    .addAccountingProvider(
                                        NewAccountingSyncConfigurationModel.AccountingProvider
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
                            .email("dev@stainless.com")
                            .emailDelivery(true)
                            .externalCustomerId("external_customer_id")
                            .hierarchy(
                                CustomerHierarchyConfigModel.builder()
                                    .addChildCustomerId("string")
                                    .parentCustomerId("parent_customer_id")
                                    .build()
                            )
                            .metadata(
                                EditCustomerModel.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .name("name")
                            .paymentProvider(EditCustomerModel.PaymentProvider.QUICKBOOKS)
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
                                        NewTaxConfigurationModel.NewAvalaraTaxConfiguration
                                            .TaxProvider
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
                            .build()
                    )
                    .build()
            )

        customerModel.validate()
    }
}
