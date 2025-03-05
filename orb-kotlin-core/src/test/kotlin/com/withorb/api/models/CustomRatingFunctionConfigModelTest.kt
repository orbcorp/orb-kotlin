// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomRatingFunctionConfigModelTest {

    @Test
    fun createCustomRatingFunctionConfigModel() {
        val customRatingFunctionConfigModel =
            CustomRatingFunctionConfigModel.builder()
                .putAdditionalProperty("foo", JsonValue.from("bar"))
                .build()
        assertThat(customRatingFunctionConfigModel).isNotNull
    }
}
