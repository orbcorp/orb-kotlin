// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerCreateParamsTest {

    @Test
    fun create() {
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
                    .taxProvider(
                        CustomerCreateParams.TaxConfiguration.NewAvalaraTaxConfiguration.TaxProvider
                            .AVALARA
                    )
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
    }

    @Test
    fun body() {
        val params =
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
                        .taxProvider(
                            CustomerCreateParams.TaxConfiguration.NewAvalaraTaxConfiguration
                                .TaxProvider
                                .AVALARA
                        )
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

        val body = params._body()

        assertThat(body.email()).isEqualTo("dev@stainless.com")
        assertThat(body.name()).isEqualTo("x")
        assertThat(body.accountingSyncConfiguration())
            .isEqualTo(
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
        assertThat(body.additionalEmails()).containsExactly("dev@stainless.com")
        assertThat(body.autoCollection()).isEqualTo(true)
        assertThat(body.billingAddress())
            .isEqualTo(
                CustomerCreateParams.BillingAddress.builder()
                    .city("city")
                    .country("country")
                    .line1("line1")
                    .line2("line2")
                    .postalCode("postal_code")
                    .state("state")
                    .build()
            )
        assertThat(body.currency()).isEqualTo("currency")
        assertThat(body.emailDelivery()).isEqualTo(true)
        assertThat(body.externalCustomerId()).isEqualTo("external_customer_id")
        assertThat(body.hierarchy())
            .isEqualTo(
                CustomerCreateParams.Hierarchy.builder()
                    .addChildCustomerId("string")
                    .parentCustomerId("parent_customer_id")
                    .build()
            )
        assertThat(body.metadata())
            .isEqualTo(
                CustomerCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.paymentProvider())
            .isEqualTo(CustomerCreateParams.PaymentProvider.QUICKBOOKS)
        assertThat(body.paymentProviderId()).isEqualTo("payment_provider_id")
        assertThat(body.reportingConfiguration())
            .isEqualTo(CustomerCreateParams.ReportingConfiguration.builder().exempt(true).build())
        assertThat(body.shippingAddress())
            .isEqualTo(
                CustomerCreateParams.ShippingAddress.builder()
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
                CustomerCreateParams.TaxConfiguration.ofNewAvalara(
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
        assertThat(body.taxId())
            .isEqualTo(
                CustomerCreateParams.TaxId.builder()
                    .country(CustomerCreateParams.TaxId.Country.AD)
                    .type(CustomerCreateParams.TaxId.Type.AD_NRT)
                    .value("value")
                    .build()
            )
        assertThat(body.timezone()).isEqualTo("timezone")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = CustomerCreateParams.builder().email("dev@stainless.com").name("x").build()

        val body = params._body()

        assertThat(body.email()).isEqualTo("dev@stainless.com")
        assertThat(body.name()).isEqualTo("x")
    }
}
