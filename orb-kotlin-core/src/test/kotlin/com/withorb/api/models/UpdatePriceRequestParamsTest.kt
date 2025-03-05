// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class UpdatePriceRequestParamsTest {

    @Test
    fun createUpdatePriceRequestParams() {
        val updatePriceRequestParams =
            UpdatePriceRequestParams.builder()
                .metadata(
                    UpdatePriceRequestParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()
        assertThat(updatePriceRequestParams).isNotNull
        assertThat(updatePriceRequestParams.metadata())
            .isEqualTo(
                UpdatePriceRequestParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }
}
