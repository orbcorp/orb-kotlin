// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.JsonValue
import com.withorb.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerUsageUpdateByExternalIdParamsTest {

    @Test
    fun createCustomerUsageUpdateByExternalIdParams() {
        CustomerUsageUpdateByExternalIdParams.builder()
            .id("external_customer_id")
            .events(
                listOf(
                    CustomerUsageUpdateByExternalIdParams.Event.builder()
                        .eventName("event_name")
                        .properties(JsonValue.from(mapOf<String, Any>()))
                        .timestamp(OffsetDateTime.parse("2020-12-09T16:09:53Z"))
                        .customerId("customer_id")
                        .externalCustomerId("external_customer_id")
                        .build()
                )
            )
            .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            CustomerUsageUpdateByExternalIdParams.builder()
                .id("external_customer_id")
                .events(
                    listOf(
                        CustomerUsageUpdateByExternalIdParams.Event.builder()
                            .eventName("event_name")
                            .properties(JsonValue.from(mapOf<String, Any>()))
                            .timestamp(OffsetDateTime.parse("2020-12-09T16:09:53Z"))
                            .customerId("customer_id")
                            .externalCustomerId("external_customer_id")
                            .build()
                    )
                )
                .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("timeframe_end", listOf("2019-12-27T18:11:19.117Z"))
        expected.put("timeframe_start", listOf("2019-12-27T18:11:19.117Z"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params =
            CustomerUsageUpdateByExternalIdParams.builder()
                .id("external_customer_id")
                .events(
                    listOf(
                        CustomerUsageUpdateByExternalIdParams.Event.builder()
                            .eventName("event_name")
                            .properties(JsonValue.from(mapOf<String, Any>()))
                            .timestamp(OffsetDateTime.parse("2020-12-09T16:09:53Z"))
                            .build()
                    )
                )
                .build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getBody() {
        val params =
            CustomerUsageUpdateByExternalIdParams.builder()
                .id("external_customer_id")
                .events(
                    listOf(
                        CustomerUsageUpdateByExternalIdParams.Event.builder()
                            .eventName("event_name")
                            .properties(JsonValue.from(mapOf<String, Any>()))
                            .timestamp(OffsetDateTime.parse("2020-12-09T16:09:53Z"))
                            .customerId("customer_id")
                            .externalCustomerId("external_customer_id")
                            .build()
                    )
                )
                .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.events())
            .isEqualTo(
                listOf(
                    CustomerUsageUpdateByExternalIdParams.Event.builder()
                        .eventName("event_name")
                        .properties(JsonValue.from(mapOf<String, Any>()))
                        .timestamp(OffsetDateTime.parse("2020-12-09T16:09:53Z"))
                        .customerId("customer_id")
                        .externalCustomerId("external_customer_id")
                        .build()
                )
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            CustomerUsageUpdateByExternalIdParams.builder()
                .id("external_customer_id")
                .events(
                    listOf(
                        CustomerUsageUpdateByExternalIdParams.Event.builder()
                            .eventName("event_name")
                            .properties(JsonValue.from(mapOf<String, Any>()))
                            .timestamp(OffsetDateTime.parse("2020-12-09T16:09:53Z"))
                            .build()
                    )
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.events())
            .isEqualTo(
                listOf(
                    CustomerUsageUpdateByExternalIdParams.Event.builder()
                        .eventName("event_name")
                        .properties(JsonValue.from(mapOf<String, Any>()))
                        .timestamp(OffsetDateTime.parse("2020-12-09T16:09:53Z"))
                        .build()
                )
            )
    }

    @Test
    fun getPathParam() {
        val params =
            CustomerUsageUpdateByExternalIdParams.builder()
                .id("external_customer_id")
                .events(
                    listOf(
                        CustomerUsageUpdateByExternalIdParams.Event.builder()
                            .eventName("event_name")
                            .properties(JsonValue.from(mapOf<String, Any>()))
                            .timestamp(OffsetDateTime.parse("2020-12-09T16:09:53Z"))
                            .build()
                    )
                )
                .build()
        assertThat(params).isNotNull
        // path param "id"
        assertThat(params.getPathParam(0)).isEqualTo("external_customer_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
