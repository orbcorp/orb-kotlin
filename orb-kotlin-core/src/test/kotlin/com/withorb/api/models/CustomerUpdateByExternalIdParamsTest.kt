// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerUpdateByExternalIdParamsTest {

    @Test
    fun createCustomerUpdateByExternalIdParams() {
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
    }

    @Test
    fun getBody() {
        val params =
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
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountingSyncConfiguration())
            .isEqualTo(
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
        assertThat(body.additionalEmails()).isEqualTo(listOf("string"))
        assertThat(body.autoCollection()).isEqualTo(true)
        assertThat(body.billingAddress())
            .isEqualTo(
                CustomerUpdateByExternalIdParams.BillingAddress.builder()
                    .city("string")
                    .country("string")
                    .line1("string")
                    .line2("string")
                    .postalCode("string")
                    .state("string")
                    .build()
            )
        assertThat(body.currency()).isEqualTo("string")
        assertThat(body.email()).isEqualTo("string")
        assertThat(body.emailDelivery()).isEqualTo(true)
        assertThat(body.externalCustomerId()).isEqualTo("string")
        assertThat(body.metadata())
            .isEqualTo(CustomerUpdateByExternalIdParams.Metadata.builder().build())
        assertThat(body.name()).isEqualTo("string")
        assertThat(body.paymentProvider())
            .isEqualTo(CustomerUpdateByExternalIdParams.PaymentProvider.QUICKBOOKS)
        assertThat(body.paymentProviderId()).isEqualTo("string")
        assertThat(body.reportingConfiguration())
            .isEqualTo(
                CustomerUpdateByExternalIdParams.ReportingConfiguration.builder()
                    .exempt(true)
                    .build()
            )
        assertThat(body.shippingAddress())
            .isEqualTo(
                CustomerUpdateByExternalIdParams.ShippingAddress.builder()
                    .city("string")
                    .country("string")
                    .line1("string")
                    .line2("string")
                    .postalCode("string")
                    .state("string")
                    .build()
            )
        assertThat(body.taxId())
            .isEqualTo(
                CustomerUpdateByExternalIdParams.TaxId.builder()
                    .country(CustomerUpdateByExternalIdParams.TaxId.Country.AD)
                    .type(CustomerUpdateByExternalIdParams.TaxId.Type.AD_NRT)
                    .value("string")
                    .build()
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = CustomerUpdateByExternalIdParams.builder().id("string").build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params = CustomerUpdateByExternalIdParams.builder().id("string").build()
        assertThat(params).isNotNull
        // path param "id"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
