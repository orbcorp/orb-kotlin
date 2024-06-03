// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerUpdateParamsTest {

    @Test
    fun createCustomerUpdateParams() {
        CustomerUpdateParams.builder()
            .customerId("string")
            .accountingSyncConfiguration(
                CustomerUpdateParams.AccountingSyncConfiguration.builder()
                    .accountingProviders(
                        listOf(
                            CustomerUpdateParams.AccountingSyncConfiguration.AccountingProvider
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
    }

    @Test
    fun getBody() {
        val params =
            CustomerUpdateParams.builder()
                .customerId("string")
                .accountingSyncConfiguration(
                    CustomerUpdateParams.AccountingSyncConfiguration.builder()
                        .accountingProviders(
                            listOf(
                                CustomerUpdateParams.AccountingSyncConfiguration.AccountingProvider
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
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountingSyncConfiguration())
            .isEqualTo(
                CustomerUpdateParams.AccountingSyncConfiguration.builder()
                    .accountingProviders(
                        listOf(
                            CustomerUpdateParams.AccountingSyncConfiguration.AccountingProvider
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
                CustomerUpdateParams.BillingAddress.builder()
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
        assertThat(body.metadata()).isEqualTo(CustomerUpdateParams.Metadata.builder().build())
        assertThat(body.name()).isEqualTo("string")
        assertThat(body.paymentProvider())
            .isEqualTo(CustomerUpdateParams.PaymentProvider.QUICKBOOKS)
        assertThat(body.paymentProviderId()).isEqualTo("string")
        assertThat(body.reportingConfiguration())
            .isEqualTo(CustomerUpdateParams.ReportingConfiguration.builder().exempt(true).build())
        assertThat(body.shippingAddress())
            .isEqualTo(
                CustomerUpdateParams.ShippingAddress.builder()
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
                CustomerUpdateParams.TaxId.builder()
                    .country(CustomerUpdateParams.TaxId.Country.AD)
                    .type(CustomerUpdateParams.TaxId.Type.AD_NRT)
                    .value("string")
                    .build()
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = CustomerUpdateParams.builder().customerId("string").build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params = CustomerUpdateParams.builder().customerId("string").build()
        assertThat(params).isNotNull
        // path param "customerId"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
