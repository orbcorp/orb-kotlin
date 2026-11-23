// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.account

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClientAsync
import com.withorb.api.models.AccountBillingEntityCreateParams
import com.withorb.api.models.AccountBillingEntityUpdateByExternalIdParams
import com.withorb.api.models.AccountBillingEntityUpdateParams
import com.withorb.api.models.AddressInput
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BillingEntityServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val billingEntityServiceAsync = client.account().billingEntities()

        val billingEntity =
            billingEntityServiceAsync.create(
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
    suspend fun update() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val billingEntityServiceAsync = client.account().billingEntities()

        val billingEntity =
            billingEntityServiceAsync.update(
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
    suspend fun list() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val billingEntityServiceAsync = client.account().billingEntities()

        val page = billingEntityServiceAsync.list()

        page.response().validate()
    }

    @Test
    suspend fun archive() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val billingEntityServiceAsync = client.account().billingEntities()

        val billingEntity = billingEntityServiceAsync.archive("billing_entity_id")

        billingEntity.validate()
    }

    @Test
    suspend fun archiveByExternalId() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val billingEntityServiceAsync = client.account().billingEntities()

        val billingEntity =
            billingEntityServiceAsync.archiveByExternalId("external_billing_entity_id")

        billingEntity.validate()
    }

    @Test
    suspend fun fetch() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val billingEntityServiceAsync = client.account().billingEntities()

        val billingEntity = billingEntityServiceAsync.fetch("billing_entity_id")

        billingEntity.validate()
    }

    @Test
    suspend fun fetchByExternalId() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val billingEntityServiceAsync = client.account().billingEntities()

        val billingEntity =
            billingEntityServiceAsync.fetchByExternalId("external_billing_entity_id")

        billingEntity.validate()
    }

    @Test
    suspend fun unarchive() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val billingEntityServiceAsync = client.account().billingEntities()

        val billingEntity = billingEntityServiceAsync.unarchive("billing_entity_id")

        billingEntity.validate()
    }

    @Test
    suspend fun unarchiveByExternalId() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val billingEntityServiceAsync = client.account().billingEntities()

        val billingEntity =
            billingEntityServiceAsync.unarchiveByExternalId("external_billing_entity_id")

        billingEntity.validate()
    }

    @Test
    suspend fun updateByExternalId() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val billingEntityServiceAsync = client.account().billingEntities()

        val billingEntity =
            billingEntityServiceAsync.updateByExternalId(
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
