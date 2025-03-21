// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PriceEvaluateParamsTest {

    @Test
    fun create() {
        PriceEvaluateParams.builder()
            .priceId("price_id")
            .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .customerId("customer_id")
            .externalCustomerId("external_customer_id")
            .filter("my_numeric_property > 100 AND my_other_property = 'bar'")
            .addGroupingKey("case when my_event_type = 'foo' then true else false end")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PriceEvaluateParams.builder()
                .priceId("price_id")
                .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(params._pathParam(0)).isEqualTo("price_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            PriceEvaluateParams.builder()
                .priceId("price_id")
                .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .customerId("customer_id")
                .externalCustomerId("external_customer_id")
                .filter("my_numeric_property > 100 AND my_other_property = 'bar'")
                .addGroupingKey("case when my_event_type = 'foo' then true else false end")
                .build()

        val body = params._body()

        assertThat(body.timeframeEnd()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.timeframeStart())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.customerId()).isEqualTo("customer_id")
        assertThat(body.externalCustomerId()).isEqualTo("external_customer_id")
        assertThat(body.filter())
            .isEqualTo("my_numeric_property > 100 AND my_other_property = 'bar'")
        assertThat(body.groupingKeys())
            .containsExactly("case when my_event_type = 'foo' then true else false end")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PriceEvaluateParams.builder()
                .priceId("price_id")
                .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val body = params._body()

        assertThat(body.timeframeEnd()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.timeframeStart())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
