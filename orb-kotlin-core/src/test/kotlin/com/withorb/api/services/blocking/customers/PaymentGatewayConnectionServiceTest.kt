// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking.customers

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClient
import com.withorb.api.models.CustomerPaymentGatewayConnectionCreateByExternalIdParams
import com.withorb.api.models.CustomerPaymentGatewayConnectionCreateParams
import com.withorb.api.models.CustomerPaymentGatewayConnectionDeleteByExternalIdParams
import com.withorb.api.models.CustomerPaymentGatewayConnectionDeleteParams
import com.withorb.api.models.CustomerPaymentGatewayConnectionListByExternalIdParams
import com.withorb.api.models.CustomerPaymentGatewayConnectionListParams
import com.withorb.api.models.CustomerPaymentGatewayConnectionUpdateByExternalIdParams
import com.withorb.api.models.CustomerPaymentGatewayConnectionUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PaymentGatewayConnectionServiceTest {

    @Test
    fun create() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val paymentGatewayConnectionService = client.customers().paymentGatewayConnections()

        val customerPaymentGatewayConnection =
            paymentGatewayConnectionService.create(
                CustomerPaymentGatewayConnectionCreateParams.builder()
                    .customerId("customer_id")
                    .paymentGatewayConnectionId("payment_gateway_connection_id")
                    .isDefault(true)
                    .providerCustomerId("x")
                    .build()
            )

        customerPaymentGatewayConnection.validate()
    }

    @Test
    fun update() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val paymentGatewayConnectionService = client.customers().paymentGatewayConnections()

        val customerPaymentGatewayConnection =
            paymentGatewayConnectionService.update(
                CustomerPaymentGatewayConnectionUpdateParams.builder()
                    .customerId("customer_id")
                    .paymentGatewayConnectionId("payment_gateway_connection_id")
                    .isDefault(CustomerPaymentGatewayConnectionUpdateParams.IsDefault.TRUE)
                    .providerCustomerId("x")
                    .build()
            )

        customerPaymentGatewayConnection.validate()
    }

    @Test
    fun list() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val paymentGatewayConnectionService = client.customers().paymentGatewayConnections()

        val paymentGatewayConnections =
            paymentGatewayConnectionService.list(
                CustomerPaymentGatewayConnectionListParams.builder()
                    .customerId("customer_id")
                    .billingEntityId("billing_entity_id")
                    .paymentGatewayConnectionId("payment_gateway_connection_id")
                    .build()
            )

        paymentGatewayConnections.validate()
    }

    @Test
    fun delete() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val paymentGatewayConnectionService = client.customers().paymentGatewayConnections()

        val customerPaymentGatewayConnection =
            paymentGatewayConnectionService.delete(
                CustomerPaymentGatewayConnectionDeleteParams.builder()
                    .customerId("customer_id")
                    .paymentGatewayConnectionId("payment_gateway_connection_id")
                    .build()
            )

        customerPaymentGatewayConnection.validate()
    }

    @Test
    fun createByExternalId() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val paymentGatewayConnectionService = client.customers().paymentGatewayConnections()

        val customerPaymentGatewayConnection =
            paymentGatewayConnectionService.createByExternalId(
                CustomerPaymentGatewayConnectionCreateByExternalIdParams.builder()
                    .externalCustomerId("external_customer_id")
                    .paymentGatewayConnectionId("payment_gateway_connection_id")
                    .isDefault(true)
                    .providerCustomerId("x")
                    .build()
            )

        customerPaymentGatewayConnection.validate()
    }

    @Test
    fun deleteByExternalId() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val paymentGatewayConnectionService = client.customers().paymentGatewayConnections()

        val customerPaymentGatewayConnection =
            paymentGatewayConnectionService.deleteByExternalId(
                CustomerPaymentGatewayConnectionDeleteByExternalIdParams.builder()
                    .externalCustomerId("external_customer_id")
                    .paymentGatewayConnectionId("payment_gateway_connection_id")
                    .build()
            )

        customerPaymentGatewayConnection.validate()
    }

    @Test
    fun listByExternalId() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val paymentGatewayConnectionService = client.customers().paymentGatewayConnections()

        val response =
            paymentGatewayConnectionService.listByExternalId(
                CustomerPaymentGatewayConnectionListByExternalIdParams.builder()
                    .externalCustomerId("external_customer_id")
                    .billingEntityId("billing_entity_id")
                    .paymentGatewayConnectionId("payment_gateway_connection_id")
                    .build()
            )

        response.validate()
    }

    @Test
    fun updateByExternalId() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val paymentGatewayConnectionService = client.customers().paymentGatewayConnections()

        val customerPaymentGatewayConnection =
            paymentGatewayConnectionService.updateByExternalId(
                CustomerPaymentGatewayConnectionUpdateByExternalIdParams.builder()
                    .externalCustomerId("external_customer_id")
                    .paymentGatewayConnectionId("payment_gateway_connection_id")
                    .isDefault(
                        CustomerPaymentGatewayConnectionUpdateByExternalIdParams.IsDefault.TRUE
                    )
                    .providerCustomerId("x")
                    .build()
            )

        customerPaymentGatewayConnection.validate()
    }
}
