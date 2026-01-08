// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClientAsync
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CreditBlockServiceAsyncTest {

    @Test
    suspend fun retrieve() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val creditBlockServiceAsync = client.creditBlocks()

        val creditBlock = creditBlockServiceAsync.retrieve("block_id")

        creditBlock.validate()
    }

    @Test
    suspend fun delete() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val creditBlockServiceAsync = client.creditBlocks()

        creditBlockServiceAsync.delete("block_id")
    }
}
