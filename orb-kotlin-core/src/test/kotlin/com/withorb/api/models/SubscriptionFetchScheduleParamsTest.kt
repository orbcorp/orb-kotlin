// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionFetchScheduleParamsTest {

    @Test
    fun create() {
        SubscriptionFetchScheduleParams.builder()
            .subscriptionId("subscription_id")
            .cursor("cursor")
            .limit(1L)
            .startDateGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .startDateGte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .startDateLt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .startDateLte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            SubscriptionFetchScheduleParams.builder()
                .subscriptionId("subscription_id")
                .cursor("cursor")
                .limit(1L)
                .startDateGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startDateGte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startDateLt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startDateLte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("cursor", "cursor")
                    .put("limit", "1")
                    .put("start_date[gt]", "2019-12-27T18:11:19.117Z")
                    .put("start_date[gte]", "2019-12-27T18:11:19.117Z")
                    .put("start_date[lt]", "2019-12-27T18:11:19.117Z")
                    .put("start_date[lte]", "2019-12-27T18:11:19.117Z")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            SubscriptionFetchScheduleParams.builder().subscriptionId("subscription_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun getPathParam() {
        val params =
            SubscriptionFetchScheduleParams.builder().subscriptionId("subscription_id").build()
        assertThat(params).isNotNull
        // path param "subscriptionId"
        assertThat(params.getPathParam(0)).isEqualTo("subscription_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
