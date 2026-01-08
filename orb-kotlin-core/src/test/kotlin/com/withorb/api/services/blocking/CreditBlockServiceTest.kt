// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClient
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CreditBlockServiceTest {

    @Test
    fun retrieve() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val creditBlockService = client.creditBlocks()

        val creditBlock = creditBlockService.retrieve("block_id")

        creditBlock.validate()
    }

    @Test
    fun delete() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val creditBlockService = client.creditBlocks()

        creditBlockService.delete("block_id")
    }
}
