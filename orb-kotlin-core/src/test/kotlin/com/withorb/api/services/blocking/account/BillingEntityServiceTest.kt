// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking.account

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClient
import com.withorb.api.models.AccountBillingEntityCreateParams
import com.withorb.api.models.AccountBillingEntityUpdateByExternalIdParams
import com.withorb.api.models.AccountBillingEntityUpdateParams
import com.withorb.api.models.AddressInput
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BillingEntityServiceTest {

    @Test
    fun create() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val billingEntityService = client.account().billingEntities()

        val billingEntity =
            billingEntityService.create(
                AccountBillingEntityCreateParams.builder()
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
                    .legalName("x")
                    .name("x")
                    .externalBillingEntityId("x")
                    .invoiceSettings(
                        AccountBillingEntityCreateParams.InvoiceSettings.builder()
                            .autoCollection(true)
                            .automaticTaxEnabled(true)
                            .emailDelivery(true)
                            .manualIssuance(true)
                            .memo("memo")
                            .netTerms(0L)
                            .build()
                    )
                    .addTaxRegistration(
                        AccountBillingEntityCreateParams.TaxRegistration.builder()
                            .code("x")
                            .value("x")
                            .appliesTo("applies_to")
                            .build()
                    )
                    .build()
            )

        billingEntity.validate()
    }

    @Test
    fun update() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val billingEntityService = client.account().billingEntities()

        val billingEntity =
            billingEntityService.update(
                AccountBillingEntityUpdateParams.builder()
                    .billingEntityId("billing_entity_id")
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
                        AccountBillingEntityUpdateParams.InvoiceSettings.builder()
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
                        AccountBillingEntityUpdateParams.PaymentGatewayConnection.builder()
                            .paymentGatewayConnectionId("payment_gateway_connection_id")
                            .paymentProviderType(
                                AccountBillingEntityUpdateParams.PaymentGatewayConnection
                                    .PaymentProviderType
                                    .STRIPE
                            )
                            .build()
                    )
                    .addTaxRegistration(
                        AccountBillingEntityUpdateParams.TaxRegistration.builder()
                            .code("x")
                            .value("x")
                            .appliesTo("applies_to")
                            .build()
                    )
                    .build()
            )

        billingEntity.validate()
    }

    @Test
    fun list() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val billingEntityService = client.account().billingEntities()

        val page = billingEntityService.list()

        page.response().validate()
    }

    @Test
    fun archive() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val billingEntityService = client.account().billingEntities()

        val billingEntity = billingEntityService.archive("billing_entity_id")

        billingEntity.validate()
    }

    @Test
    fun archiveByExternalId() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val billingEntityService = client.account().billingEntities()

        val billingEntity = billingEntityService.archiveByExternalId("external_billing_entity_id")

        billingEntity.validate()
    }

    @Test
    fun fetch() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val billingEntityService = client.account().billingEntities()

        val billingEntity = billingEntityService.fetch("billing_entity_id")

        billingEntity.validate()
    }

    @Test
    fun fetchByExternalId() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val billingEntityService = client.account().billingEntities()

        val billingEntity = billingEntityService.fetchByExternalId("external_billing_entity_id")

        billingEntity.validate()
    }

    @Test
    fun unarchive() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val billingEntityService = client.account().billingEntities()

        val billingEntity = billingEntityService.unarchive("billing_entity_id")

        billingEntity.validate()
    }

    @Test
    fun unarchiveByExternalId() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val billingEntityService = client.account().billingEntities()

        val billingEntity = billingEntityService.unarchiveByExternalId("external_billing_entity_id")

        billingEntity.validate()
    }

    @Test
    fun updateByExternalId() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val billingEntityService = client.account().billingEntities()

        val billingEntity =
            billingEntityService.updateByExternalId(
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
                        AccountBillingEntityUpdateByExternalIdParams.PaymentGatewayConnection
                            .builder()
                            .paymentGatewayConnectionId("payment_gateway_connection_id")
                            .paymentProviderType(
                                AccountBillingEntityUpdateByExternalIdParams
                                    .PaymentGatewayConnection
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
            )

        billingEntity.validate()
    }
}
