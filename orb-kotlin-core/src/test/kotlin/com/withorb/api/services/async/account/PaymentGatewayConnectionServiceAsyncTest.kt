// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.account

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClientAsync
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PaymentGatewayConnectionServiceAsyncTest {

    @Test
    suspend fun list() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val paymentGatewayConnectionServiceAsync = client.account().paymentGatewayConnections()

        val page = paymentGatewayConnectionServiceAsync.list()

        page.response().validate()
    }

    @Test
    suspend fun fetch() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val paymentGatewayConnectionServiceAsync = client.account().paymentGatewayConnections()

        val paymentGatewayConnection =
            paymentGatewayConnectionServiceAsync.fetch("payment_gateway_connection_id")

        paymentGatewayConnection.validate()
    }
}
