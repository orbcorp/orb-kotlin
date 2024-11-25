// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.http.QueryParams
import com.withorb.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AlertListParamsTest {

    @Test
    fun createAlertListParams() {
        AlertListParams.builder()
            .createdAtGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .createdAtGte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .createdAtLt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .createdAtLte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .cursor("cursor")
            .customerId("customer_id")
            .externalCustomerId("external_customer_id")
            .limit(1L)
            .subscriptionId("subscription_id")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            AlertListParams.builder()
                .createdAtGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAtGte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAtLt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAtLte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .cursor("cursor")
                .customerId("customer_id")
                .externalCustomerId("external_customer_id")
                .limit(1L)
                .subscriptionId("subscription_id")
                .build()
        val expected = QueryParams.builder()
        expected.put("created_at[gt]", "2019-12-27T18:11:19.117Z")
        expected.put("created_at[gte]", "2019-12-27T18:11:19.117Z")
        expected.put("created_at[lt]", "2019-12-27T18:11:19.117Z")
        expected.put("created_at[lte]", "2019-12-27T18:11:19.117Z")
        expected.put("cursor", "cursor")
        expected.put("customer_id", "customer_id")
        expected.put("external_customer_id", "external_customer_id")
        expected.put("limit", "1")
        expected.put("subscription_id", "subscription_id")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = AlertListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }
}
