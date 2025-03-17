// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ItemFetchParamsTest {

    @Test
    fun create() {
        ItemFetchParams.builder().itemId("item_id").build()
    }

    @Test
    fun getPathParam() {
        val params = ItemFetchParams.builder().itemId("item_id").build()
        assertThat(params).isNotNull
        // path param "itemId"
        assertThat(params.getPathParam(0)).isEqualTo("item_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
