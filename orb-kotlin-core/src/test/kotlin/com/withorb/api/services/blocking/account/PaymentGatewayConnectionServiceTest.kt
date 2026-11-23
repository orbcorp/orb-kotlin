// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking.account

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClient
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PaymentGatewayConnectionServiceTest {

    @Test
    fun list() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val paymentGatewayConnectionService = client.account().paymentGatewayConnections()

        val page = paymentGatewayConnectionService.list()

        page.response().validate()
    }

    @Test
    fun fetch() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val paymentGatewayConnectionService = client.account().paymentGatewayConnections()

        val paymentGatewayConnection =
            paymentGatewayConnectionService.fetch("payment_gateway_connection_id")

        paymentGatewayConnection.validate()
    }
}
