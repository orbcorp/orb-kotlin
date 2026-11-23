// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BillingEntityTest {

    @Test
    fun create() {
        val billingEntity =
            BillingEntity.builder()
                .id("id")
                .address(
                    Address.builder()
                        .city("city")
                        .country("country")
                        .line1("line1")
                        .line2("line2")
                        .postalCode("postal_code")
                        .state("state")
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .defaultPaymentGatewayConnectionId("default_payment_gateway_connection_id")
                .externalBillingEntityId("external_billing_entity_id")
                .invoiceSettings(
                    BillingEntity.InvoiceSettings.builder()
                        .autoCollection(true)
                        .automaticTaxEnabled(true)
                        .emailDelivery(true)
                        .manualIssuance(true)
                        .memo("memo")
                        .netTerms(0L)
                        .build()
                )
                .isDefault(true)
                .legalName("legal_name")
                .name("name")
                .addPaymentGatewayConnection(
                    BillingEntity.PaymentGatewayConnection.builder()
                        .isDefault(true)
                        .paymentGatewayConnectionId("payment_gateway_connection_id")
                        .paymentProviderType(
                            BillingEntity.PaymentGatewayConnection.PaymentProviderType.STRIPE
                        )
                        .build()
                )
                .status(BillingEntity.Status.ACTIVE)
                .addTaxRegistration(
                    BillingEntity.TaxRegistration.builder()
                        .appliesTo("applies_to")
                        .code("code")
                        .value("value")
                        .build()
                )
                .build()

        assertThat(billingEntity.id()).isEqualTo("id")
        assertThat(billingEntity.address())
            .isEqualTo(
                Address.builder()
                    .city("city")
                    .country("country")
                    .line1("line1")
                    .line2("line2")
                    .postalCode("postal_code")
                    .state("state")
                    .build()
            )
        assertThat(billingEntity.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(billingEntity.defaultPaymentGatewayConnectionId())
            .isEqualTo("default_payment_gateway_connection_id")
        assertThat(billingEntity.externalBillingEntityId()).isEqualTo("external_billing_entity_id")
        assertThat(billingEntity.invoiceSettings())
            .isEqualTo(
                BillingEntity.InvoiceSettings.builder()
                    .autoCollection(true)
                    .automaticTaxEnabled(true)
                    .emailDelivery(true)
                    .manualIssuance(true)
                    .memo("memo")
                    .netTerms(0L)
                    .build()
            )
        assertThat(billingEntity.isDefault()).isEqualTo(true)
        assertThat(billingEntity.legalName()).isEqualTo("legal_name")
        assertThat(billingEntity.name()).isEqualTo("name")
        assertThat(billingEntity.paymentGatewayConnections())
            .containsExactly(
                BillingEntity.PaymentGatewayConnection.builder()
                    .isDefault(true)
                    .paymentGatewayConnectionId("payment_gateway_connection_id")
                    .paymentProviderType(
                        BillingEntity.PaymentGatewayConnection.PaymentProviderType.STRIPE
                    )
                    .build()
            )
        assertThat(billingEntity.status()).isEqualTo(BillingEntity.Status.ACTIVE)
        assertThat(billingEntity.taxRegistrations())
            .containsExactly(
                BillingEntity.TaxRegistration.builder()
                    .appliesTo("applies_to")
                    .code("code")
                    .value("value")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val billingEntity =
            BillingEntity.builder()
                .id("id")
                .address(
                    Address.builder()
                        .city("city")
                        .country("country")
                        .line1("line1")
                        .line2("line2")
                        .postalCode("postal_code")
                        .state("state")
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .defaultPaymentGatewayConnectionId("default_payment_gateway_connection_id")
                .externalBillingEntityId("external_billing_entity_id")
                .invoiceSettings(
                    BillingEntity.InvoiceSettings.builder()
                        .autoCollection(true)
                        .automaticTaxEnabled(true)
                        .emailDelivery(true)
                        .manualIssuance(true)
                        .memo("memo")
                        .netTerms(0L)
                        .build()
                )
                .isDefault(true)
                .legalName("legal_name")
                .name("name")
                .addPaymentGatewayConnection(
                    BillingEntity.PaymentGatewayConnection.builder()
                        .isDefault(true)
                        .paymentGatewayConnectionId("payment_gateway_connection_id")
                        .paymentProviderType(
                            BillingEntity.PaymentGatewayConnection.PaymentProviderType.STRIPE
                        )
                        .build()
                )
                .status(BillingEntity.Status.ACTIVE)
                .addTaxRegistration(
                    BillingEntity.TaxRegistration.builder()
                        .appliesTo("applies_to")
                        .code("code")
                        .value("value")
                        .build()
                )
                .build()

        val roundtrippedBillingEntity =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(billingEntity),
                jacksonTypeRef<BillingEntity>(),
            )

        assertThat(roundtrippedBillingEntity).isEqualTo(billingEntity)
    }
}
