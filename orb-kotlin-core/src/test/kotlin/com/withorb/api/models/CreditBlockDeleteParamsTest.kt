// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreditBlockDeleteParamsTest {

    @Test
    fun create() {
        CreditBlockDeleteParams.builder().blockId("block_id").build()
    }

    @Test
    fun pathParams() {
        val params = CreditBlockDeleteParams.builder().blockId("block_id").build()

        assertThat(params._pathParam(0)).isEqualTo("block_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
