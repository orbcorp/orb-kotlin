// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.events

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClientAsync
import com.withorb.api.models.EventBackfillCloseParams
import com.withorb.api.models.EventBackfillCreateParams
import com.withorb.api.models.EventBackfillFetchParams
import com.withorb.api.models.EventBackfillRevertParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class BackfillServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val backfillServiceAsync = client.events().backfills()

        val backfillModel =
            backfillServiceAsync.create(
                EventBackfillCreateParams.builder()
                    .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .closeTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .customerId("customer_id")
                    .deprecationFilter("my_numeric_property > 100 AND my_other_property = 'bar'")
                    .externalCustomerId("external_customer_id")
                    .replaceExistingEvents(true)
                    .build()
            )

        backfillModel.validate()
    }

    @Test
    suspend fun list() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val backfillServiceAsync = client.events().backfills()

        val page = backfillServiceAsync.list()

        page.response().validate()
    }

    @Test
    suspend fun close() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val backfillServiceAsync = client.events().backfills()

        val backfillModel =
            backfillServiceAsync.close(
                EventBackfillCloseParams.builder().backfillId("backfill_id").build()
            )

        backfillModel.validate()
    }

    @Test
    suspend fun fetch() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val backfillServiceAsync = client.events().backfills()

        val backfillModel =
            backfillServiceAsync.fetch(
                EventBackfillFetchParams.builder().backfillId("backfill_id").build()
            )

        backfillModel.validate()
    }

    @Test
    suspend fun revert() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val backfillServiceAsync = client.events().backfills()

        val backfillModel =
            backfillServiceAsync.revert(
                EventBackfillRevertParams.builder().backfillId("backfill_id").build()
            )

        backfillModel.validate()
    }
}
