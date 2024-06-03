// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PriceEvaluateParamsTest {

    @Test
    fun createPriceEvaluateParams() {
        PriceEvaluateParams.builder()
            .priceId("string")
            .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .customerId("string")
            .externalCustomerId("string")
            .filter("my_numeric_property > 100 AND my_other_property = \'bar\'")
            .groupingKeys(listOf("string"))
            .build()
    }

    @Test
    fun getBody() {
        val params =
            PriceEvaluateParams.builder()
                .priceId("string")
                .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .customerId("string")
                .externalCustomerId("string")
                .filter("my_numeric_property > 100 AND my_other_property = \'bar\'")
                .groupingKeys(listOf("string"))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.timeframeEnd()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.timeframeStart())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.customerId()).isEqualTo("string")
        assertThat(body.externalCustomerId()).isEqualTo("string")
        assertThat(body.filter())
            .isEqualTo("my_numeric_property > 100 AND my_other_property = \'bar\'")
        assertThat(body.groupingKeys()).isEqualTo(listOf("string"))
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            PriceEvaluateParams.builder()
                .priceId("string")
                .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.timeframeEnd()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.timeframeStart())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun getPathParam() {
        val params =
            PriceEvaluateParams.builder()
                .priceId("string")
                .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(params).isNotNull
        // path param "priceId"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
