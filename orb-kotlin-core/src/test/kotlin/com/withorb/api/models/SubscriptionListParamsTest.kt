// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SubscriptionListParamsTest {

    @Test
    fun createSubscriptionListParams() {
        SubscriptionListParams.builder()
            .createdAtGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .createdAtGte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .createdAtLt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .createdAtLte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .cursor("cursor")
            .queryCustomerId("customer_id")
            .queryCustomerId(listOf("string"))
            .queryExternalCustomerId("external_customer_id")
            .queryExternalCustomerId(listOf("string"))
            .limit(123L)
            .status(SubscriptionListParams.Status.ACTIVE)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            SubscriptionListParams.builder()
                .createdAtGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAtGte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAtLt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAtLte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .cursor("cursor")
                .queryCustomerId("customer_id")
                .queryCustomerId(listOf("string"))
                .queryExternalCustomerId("external_customer_id")
                .queryExternalCustomerId(listOf("string"))
                .limit(123L)
                .status(SubscriptionListParams.Status.ACTIVE)
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("created_at[gt]", listOf("2019-12-27T18:11:19.117Z"))
        expected.put("created_at[gte]", listOf("2019-12-27T18:11:19.117Z"))
        expected.put("created_at[lt]", listOf("2019-12-27T18:11:19.117Z"))
        expected.put("created_at[lte]", listOf("2019-12-27T18:11:19.117Z"))
        expected.put("cursor", listOf("cursor"))
        expected.put("customer_id", listOf("customer_id"))
        expected.put("customer_id[]", listOf("string"))
        expected.put("external_customer_id", listOf("external_customer_id"))
        expected.put("external_customer_id[]", listOf("string"))
        expected.put("limit", listOf("123"))
        expected.put("status", listOf(SubscriptionListParams.Status.ACTIVE.toString()))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = SubscriptionListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
