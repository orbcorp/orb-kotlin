// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MetricCreateParamsTest {

    @Test
    fun create() {
        MetricCreateParams.builder()
            .description("Sum of bytes downloaded in fast mode")
            .itemId("item_id")
            .name("Bytes downloaded")
            .sql("SELECT sum(bytes_downloaded) FROM events WHERE download_speed = 'fast'")
            .metadata(
                MetricCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            MetricCreateParams.builder()
                .description("Sum of bytes downloaded in fast mode")
                .itemId("item_id")
                .name("Bytes downloaded")
                .sql("SELECT sum(bytes_downloaded) FROM events WHERE download_speed = 'fast'")
                .metadata(
                    MetricCreateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.description()).isEqualTo("Sum of bytes downloaded in fast mode")
        assertThat(body.itemId()).isEqualTo("item_id")
        assertThat(body.name()).isEqualTo("Bytes downloaded")
        assertThat(body.sql())
            .isEqualTo("SELECT sum(bytes_downloaded) FROM events WHERE download_speed = 'fast'")
        assertThat(body.metadata())
            .isEqualTo(
                MetricCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            MetricCreateParams.builder()
                .description("Sum of bytes downloaded in fast mode")
                .itemId("item_id")
                .name("Bytes downloaded")
                .sql("SELECT sum(bytes_downloaded) FROM events WHERE download_speed = 'fast'")
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.description()).isEqualTo("Sum of bytes downloaded in fast mode")
        assertThat(body.itemId()).isEqualTo("item_id")
        assertThat(body.name()).isEqualTo("Bytes downloaded")
        assertThat(body.sql())
            .isEqualTo("SELECT sum(bytes_downloaded) FROM events WHERE download_speed = 'fast'")
    }
}
