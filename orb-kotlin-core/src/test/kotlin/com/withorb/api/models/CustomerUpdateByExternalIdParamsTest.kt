// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerUpdateByExternalIdParamsTest {

    @Test
    fun create() {
        CustomerUpdateByExternalIdParams.builder()
            .id("external_customer_id")
            .editCustomerModel(
                EditCustomerModel.builder()
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
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            CustomerUpdateByExternalIdParams.builder()
                .id("external_customer_id")
                .editCustomerModel(
                    EditCustomerModel.builder()
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
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                EditCustomerModel.builder()
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
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CustomerUpdateByExternalIdParams.builder()
                .id("external_customer_id")
                .editCustomerModel(EditCustomerModel.builder().build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(EditCustomerModel.builder().build())
    }

    @Test
    fun getPathParam() {
        val params =
            CustomerUpdateByExternalIdParams.builder()
                .id("external_customer_id")
                .editCustomerModel(EditCustomerModel.builder().build())
                .build()
        assertThat(params).isNotNull
        // path param "id"
        assertThat(params.getPathParam(0)).isEqualTo("external_customer_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
