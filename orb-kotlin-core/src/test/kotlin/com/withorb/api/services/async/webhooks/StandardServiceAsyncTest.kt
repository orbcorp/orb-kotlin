// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.webhooks

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClientAsync
import com.withorb.api.core.http.Headers
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class StandardServiceAsyncTest {

    @Test
    suspend fun unwrapStandard() {
        val client = OrbOkHttpClientAsync.builder().apiKey("My API Key").build()
        val standardServiceAsync = client.webhooks().standard()

        val payload =
            "{\"id\":\"id\",\"backfill\":{\"id\":\"id\",\"close_time\":\"2019-12-27T18:11:19.117Z\",\"created_at\":\"2019-12-27T18:11:19.117Z\",\"customer_id\":\"customer_id\",\"events_ingested\":0,\"replace_existing_events\":true,\"reverted_at\":\"2019-12-27T18:11:19.117Z\",\"status\":\"pending\",\"timeframe_end\":\"2019-12-27T18:11:19.117Z\",\"timeframe_start\":\"2019-12-27T18:11:19.117Z\",\"deprecation_filter\":\"my_numeric_property > 100 AND my_other_property = 'bar'\"},\"created_at\":\"2019-12-27T18:11:19.117Z\",\"payload_style\":\"expanded\",\"properties\":{},\"type\":\"backfill.reflected\"}"
        val webhookSecret = "whsec_c2VjcmV0Cg=="
        val headers = Headers.builder().build()

        standardServiceAsync.unwrapStandard(payload).validate()
    }
}
