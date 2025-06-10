// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerUpdateByExternalIdParamsTest {

    @Test
    fun create() {
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
            .paymentProvider(CustomerUpdateByExternalIdParams.PaymentProvider.QUICKBOOKS)
            .paymentProviderId("payment_provider_id")
            .reportingConfiguration(NewReportingConfiguration.builder().exempt(true).build())
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
            .build()
    }

    @Test
    fun pathParams() {
        val params = CustomerUpdateByExternalIdParams.builder().id("external_customer_id").build()

        assertThat(params._pathParam(0)).isEqualTo("external_customer_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
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
                .paymentProvider(CustomerUpdateByExternalIdParams.PaymentProvider.QUICKBOOKS)
                .paymentProviderId("payment_provider_id")
                .reportingConfiguration(NewReportingConfiguration.builder().exempt(true).build())
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
                .build()

        val body = params._body()

        assertThat(body.accountingSyncConfiguration())
            .isEqualTo(
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
        assertThat(body.additionalEmails()).containsExactly("string")
        assertThat(body.autoCollection()).isEqualTo(true)
        assertThat(body.billingAddress())
            .isEqualTo(
                AddressInput.builder()
                    .city("city")
                    .country("country")
                    .line1("line1")
                    .line2("line2")
                    .postalCode("postal_code")
                    .state("state")
                    .build()
            )
        assertThat(body.currency()).isEqualTo("currency")
        assertThat(body.email()).isEqualTo("dev@stainless.com")
        assertThat(body.emailDelivery()).isEqualTo(true)
        assertThat(body.externalCustomerId()).isEqualTo("external_customer_id")
        assertThat(body.hierarchy())
            .isEqualTo(
                CustomerHierarchyConfig.builder()
                    .addChildCustomerId("string")
                    .parentCustomerId("parent_customer_id")
                    .build()
            )
        assertThat(body.metadata())
            .isEqualTo(
                CustomerUpdateByExternalIdParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.paymentProvider())
            .isEqualTo(CustomerUpdateByExternalIdParams.PaymentProvider.QUICKBOOKS)
        assertThat(body.paymentProviderId()).isEqualTo("payment_provider_id")
        assertThat(body.reportingConfiguration())
            .isEqualTo(NewReportingConfiguration.builder().exempt(true).build())
        assertThat(body.shippingAddress())
            .isEqualTo(
                AddressInput.builder()
                    .city("city")
                    .country("country")
                    .line1("line1")
                    .line2("line2")
                    .postalCode("postal_code")
                    .state("state")
                    .build()
            )
        assertThat(body.taxConfiguration())
            .isEqualTo(
                CustomerUpdateByExternalIdParams.TaxConfiguration.ofAvalara(
                    NewAvalaraTaxConfiguration.builder()
                        .taxExempt(true)
                        .taxProvider(NewAvalaraTaxConfiguration.TaxProvider.AVALARA)
                        .taxExemptionCode("tax_exemption_code")
                        .build()
                )
            )
        assertThat(body.taxId())
            .isEqualTo(
                CustomerTaxId.builder()
                    .country(CustomerTaxId.Country.AD)
                    .type(CustomerTaxId.Type.AD_NRT)
                    .value("value")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = CustomerUpdateByExternalIdParams.builder().id("external_customer_id").build()

        val body = params._body()
    }
}
