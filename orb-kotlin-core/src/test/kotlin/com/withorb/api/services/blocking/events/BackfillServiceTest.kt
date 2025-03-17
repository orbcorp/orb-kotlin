// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking.events

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClient
import com.withorb.api.models.EventBackfillCloseParams
import com.withorb.api.models.EventBackfillCreateParams
import com.withorb.api.models.EventBackfillFetchParams
import com.withorb.api.models.EventBackfillRevertParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BackfillServiceTest {

    @Test
    fun create() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val backfillService = client.events().backfills()

        val backfill =
            backfillService.create(
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

        backfill.validate()
    }

    @Test
    fun list() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val backfillService = client.events().backfills()

        val page = backfillService.list()

        page.response().validate()
    }

    @Test
    fun close() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val backfillService = client.events().backfills()

        val response =
            backfillService.close(
                EventBackfillCloseParams.builder().backfillId("backfill_id").build()
            )

        response.validate()
    }

    @Test
    fun fetch() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val backfillService = client.events().backfills()

        val response =
            backfillService.fetch(
                EventBackfillFetchParams.builder().backfillId("backfill_id").build()
            )

        response.validate()
    }

    @Test
    fun revert() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val backfillService = client.events().backfills()

        val response =
            backfillService.revert(
                EventBackfillRevertParams.builder().backfillId("backfill_id").build()
            )

        response.validate()
    }
}
