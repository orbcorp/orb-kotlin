// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountBillingEntityUpdateByExternalIdParamsTest {

    @Test
    fun create() {
        AccountBillingEntityUpdateByExternalIdParams.builder()
            .externalBillingEntityId("external_billing_entity_id")
            .address(
                AddressInput.builder()
                    .country("x")
                    .city("city")
                    .line1("line1")
                    .line2("line2")
                    .postalCode("postal_code")
                    .state("state")
                    .build()
            )
            .defaultPaymentGatewayConnectionId("default_payment_gateway_connection_id")
            .invoiceSettings(
                AccountBillingEntityUpdateByExternalIdParams.InvoiceSettings.builder()
                    .autoCollection(true)
                    .automaticTaxEnabled(true)
                    .emailDelivery(true)
                    .manualIssuance(true)
                    .memo("memo")
                    .netTerms(0L)
                    .build()
            )
            .legalName("x")
            .name("x")
            .addPaymentGatewayConnection(
                AccountBillingEntityUpdateByExternalIdParams.PaymentGatewayConnection.builder()
                    .paymentGatewayConnectionId("payment_gateway_connection_id")
                    .paymentProviderType(
                        AccountBillingEntityUpdateByExternalIdParams.PaymentGatewayConnection
                            .PaymentProviderType
                            .STRIPE
                    )
                    .build()
            )
            .addTaxRegistration(
                AccountBillingEntityUpdateByExternalIdParams.TaxRegistration.builder()
                    .code("x")
                    .value("x")
                    .appliesTo("applies_to")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AccountBillingEntityUpdateByExternalIdParams.builder()
                .externalBillingEntityId("external_billing_entity_id")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("external_billing_entity_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            AccountBillingEntityUpdateByExternalIdParams.builder()
                .externalBillingEntityId("external_billing_entity_id")
                .address(
                    AddressInput.builder()
                        .country("x")
                        .city("city")
                        .line1("line1")
                        .line2("line2")
                        .postalCode("postal_code")
                        .state("state")
                        .build()
                )
                .defaultPaymentGatewayConnectionId("default_payment_gateway_connection_id")
                .invoiceSettings(
                    AccountBillingEntityUpdateByExternalIdParams.InvoiceSettings.builder()
                        .autoCollection(true)
                        .automaticTaxEnabled(true)
                        .emailDelivery(true)
                        .manualIssuance(true)
                        .memo("memo")
                        .netTerms(0L)
                        .build()
                )
                .legalName("x")
                .name("x")
                .addPaymentGatewayConnection(
                    AccountBillingEntityUpdateByExternalIdParams.PaymentGatewayConnection.builder()
                        .paymentGatewayConnectionId("payment_gateway_connection_id")
                        .paymentProviderType(
                            AccountBillingEntityUpdateByExternalIdParams.PaymentGatewayConnection
                                .PaymentProviderType
                                .STRIPE
                        )
                        .build()
                )
                .addTaxRegistration(
                    AccountBillingEntityUpdateByExternalIdParams.TaxRegistration.builder()
                        .code("x")
                        .value("x")
                        .appliesTo("applies_to")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.address())
            .isEqualTo(
                AddressInput.builder()
                    .country("x")
                    .city("city")
                    .line1("line1")
                    .line2("line2")
                    .postalCode("postal_code")
                    .state("state")
                    .build()
            )
        assertThat(body.defaultPaymentGatewayConnectionId())
            .isEqualTo("default_payment_gateway_connection_id")
        assertThat(body.invoiceSettings())
            .isEqualTo(
                AccountBillingEntityUpdateByExternalIdParams.InvoiceSettings.builder()
                    .autoCollection(true)
                    .automaticTaxEnabled(true)
                    .emailDelivery(true)
                    .manualIssuance(true)
                    .memo("memo")
                    .netTerms(0L)
                    .build()
            )
        assertThat(body.legalName()).isEqualTo("x")
        assertThat(body.name()).isEqualTo("x")
        assertThat(body.paymentGatewayConnections())
            .containsExactly(
                AccountBillingEntityUpdateByExternalIdParams.PaymentGatewayConnection.builder()
                    .paymentGatewayConnectionId("payment_gateway_connection_id")
                    .paymentProviderType(
                        AccountBillingEntityUpdateByExternalIdParams.PaymentGatewayConnection
                            .PaymentProviderType
                            .STRIPE
                    )
                    .build()
            )
        assertThat(body.taxRegistrations())
            .containsExactly(
                AccountBillingEntityUpdateByExternalIdParams.TaxRegistration.builder()
                    .code("x")
                    .value("x")
                    .appliesTo("applies_to")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AccountBillingEntityUpdateByExternalIdParams.builder()
                .externalBillingEntityId("external_billing_entity_id")
                .build()

        val body = params._body()
    }
}
