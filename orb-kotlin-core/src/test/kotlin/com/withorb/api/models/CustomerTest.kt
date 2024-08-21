// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerTest {

    @Test
    fun createCustomer() {
        val customer =
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
                .externalCustomerId("external_customer_id")
                .metadata(Customer.Metadata.builder().build())
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
        assertThat(customer).isNotNull
        assertThat(customer.id()).isEqualTo("id")
        assertThat(customer.additionalEmails()).containsExactly("string")
        assertThat(customer.autoCollection()).isEqualTo(true)
        assertThat(customer.balance()).isEqualTo("balance")
        assertThat(customer.billingAddress())
            .isEqualTo(
                Customer.BillingAddress.builder()
                    .city("city")
                    .country("country")
                    .line1("line1")
                    .line2("line2")
                    .postalCode("postal_code")
                    .state("state")
                    .build()
            )
        assertThat(customer.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(customer.currency()).isEqualTo("currency")
        assertThat(customer.email()).isEqualTo("email")
        assertThat(customer.emailDelivery()).isEqualTo(true)
        assertThat(customer.externalCustomerId()).isEqualTo("external_customer_id")
        assertThat(customer.metadata()).isEqualTo(Customer.Metadata.builder().build())
        assertThat(customer.name()).isEqualTo("name")
        assertThat(customer.paymentProvider()).isEqualTo(Customer.PaymentProvider.QUICKBOOKS)
        assertThat(customer.paymentProviderId()).isEqualTo("payment_provider_id")
        assertThat(customer.portalUrl()).isEqualTo("portal_url")
        assertThat(customer.shippingAddress())
            .isEqualTo(
                Customer.ShippingAddress.builder()
                    .city("city")
                    .country("country")
                    .line1("line1")
                    .line2("line2")
                    .postalCode("postal_code")
                    .state("state")
                    .build()
            )
        assertThat(customer.taxId())
            .isEqualTo(
                Customer.TaxId.builder()
                    .country(Customer.TaxId.Country.AD)
                    .type(Customer.TaxId.Type.AD_NRT)
                    .value("value")
                    .build()
            )
        assertThat(customer.timezone()).isEqualTo("timezone")
        assertThat(customer.accountingSyncConfiguration())
            .isEqualTo(
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
        assertThat(customer.reportingConfiguration())
            .isEqualTo(Customer.ReportingConfiguration.builder().exempt(true).build())
    }
}