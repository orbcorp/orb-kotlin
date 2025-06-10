// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ItemCreateParamsTest {

    @Test
    fun create() {
        ItemCreateParams.builder()
            .name("API requests")
            .metadata(
                ItemCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            ItemCreateParams.builder()
                .name("API requests")
                .metadata(
                    ItemCreateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("API requests")
        assertThat(body.metadata())
            .isEqualTo(
                ItemCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ItemCreateParams.builder().name("API requests").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("API requests")
    }
}
