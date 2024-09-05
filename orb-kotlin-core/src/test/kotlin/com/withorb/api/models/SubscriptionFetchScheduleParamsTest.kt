// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SubscriptionFetchScheduleParamsTest {

    @Test
    fun createSubscriptionFetchScheduleParams() {
        SubscriptionFetchScheduleParams.builder()
            .subscriptionId("subscription_id")
            .cursor("cursor")
            .limit(123L)
            .startDateGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .startDateGte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .startDateLt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .startDateLte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            SubscriptionFetchScheduleParams.builder()
                .subscriptionId("subscription_id")
                .cursor("cursor")
                .limit(123L)
                .startDateGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startDateGte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startDateLt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startDateLte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("cursor", listOf("cursor"))
        expected.put("limit", listOf("123"))
        expected.put("start_date[gt]", listOf("2019-12-27T18:11:19.117Z"))
        expected.put("start_date[gte]", listOf("2019-12-27T18:11:19.117Z"))
        expected.put("start_date[lt]", listOf("2019-12-27T18:11:19.117Z"))
        expected.put("start_date[lte]", listOf("2019-12-27T18:11:19.117Z"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params =
            SubscriptionFetchScheduleParams.builder().subscriptionId("subscription_id").build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
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
