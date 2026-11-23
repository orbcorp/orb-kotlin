// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountBillingEntityListPageResponseTest {

    @Test
    fun create() {
        val accountBillingEntityListPageResponse =
            AccountBillingEntityListPageResponse.builder()
                .addData(
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
                            BillingEntity.InvoiceSettings.builder().memo("memo").build()
                        )
                        .isDefault(true)
                        .legalName("legal_name")
                        .name("name")
                        .addPaymentGatewayConnection(
                            BillingEntity.PaymentGatewayConnection.builder()
                                .isDefault(true)
                                .paymentGatewayConnectionId("payment_gateway_connection_id")
                                .paymentProviderType(
                                    BillingEntity.PaymentGatewayConnection.PaymentProviderType
                                        .STRIPE
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
                )
                .paginationMetadata(
                    PaginationMetadata.builder().hasMore(true).nextCursor("next_cursor").build()
                )
                .build()

        assertThat(accountBillingEntityListPageResponse.data())
            .containsExactly(
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
                    .invoiceSettings(BillingEntity.InvoiceSettings.builder().memo("memo").build())
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
            )
        assertThat(accountBillingEntityListPageResponse.paginationMetadata())
            .isEqualTo(PaginationMetadata.builder().hasMore(true).nextCursor("next_cursor").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val accountBillingEntityListPageResponse =
            AccountBillingEntityListPageResponse.builder()
                .addData(
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
                            BillingEntity.InvoiceSettings.builder().memo("memo").build()
                        )
                        .isDefault(true)
                        .legalName("legal_name")
                        .name("name")
                        .addPaymentGatewayConnection(
                            BillingEntity.PaymentGatewayConnection.builder()
                                .isDefault(true)
                                .paymentGatewayConnectionId("payment_gateway_connection_id")
                                .paymentProviderType(
                                    BillingEntity.PaymentGatewayConnection.PaymentProviderType
                                        .STRIPE
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
                )
                .paginationMetadata(
                    PaginationMetadata.builder().hasMore(true).nextCursor("next_cursor").build()
                )
                .build()

        val roundtrippedAccountBillingEntityListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accountBillingEntityListPageResponse),
                jacksonTypeRef<AccountBillingEntityListPageResponse>(),
            )

        assertThat(roundtrippedAccountBillingEntityListPageResponse)
            .isEqualTo(accountBillingEntityListPageResponse)
    }
}
