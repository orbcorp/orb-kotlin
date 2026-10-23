// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreditBlockUpdateParamsTest {

    @Test
    fun create() {
        CreditBlockUpdateParams.builder()
            .blockId("block_id")
            .metadata(
                CreditBlockUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params = CreditBlockUpdateParams.builder().blockId("block_id").build()

        assertThat(params._pathParam(0)).isEqualTo("block_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CreditBlockUpdateParams.builder()
                .blockId("block_id")
                .metadata(
                    CreditBlockUpdateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.metadata())
            .isEqualTo(
                CreditBlockUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = CreditBlockUpdateParams.builder().blockId("block_id").build()

        val body = params._body()
    }
}
